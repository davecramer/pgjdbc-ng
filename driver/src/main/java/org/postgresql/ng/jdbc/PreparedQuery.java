/**
 * Copyright (c) 2013, postgresql.org
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice,
 *    this list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 *  * Neither the name of postgresql.org nor the names of its contributors may
 *    be used to endorse or promote products derived from this software
 *    without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.postgresql.ng.jdbc;

import org.postgresql.ng.protocol.FieldFormatRef;
import org.postgresql.ng.protocol.RequestExecutorHandlers.ExecuteResult;
import org.postgresql.ng.protocol.RequestExecutorHandlers.SynchronizedResult;
import org.postgresql.ng.protocol.ResultBatch;
import org.postgresql.ng.protocol.ResultField;

import static org.postgresql.ng.jdbc.ErrorUtils.chainWarnings;
import static org.postgresql.ng.jdbc.ErrorUtils.makeSQLException;
import static org.postgresql.ng.protocol.ResultBatches.transformFieldTypes;
import static org.postgresql.ng.utils.Nulls.firstNonNull;

import java.io.IOException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;
import static java.util.concurrent.TimeUnit.MILLISECONDS;

import io.netty.buffer.ByteBuf;


public class PreparedQuery implements Query {

  private String statementName;
  private FieldFormatRef[] parameterFormats;
  private ByteBuf[] parameterBuffers;
  private ResultField[] resultFields;
  private String portalName;
  private Status status;
  private Long timeout;
  private int maxRows;
  private ResultBatch resultBatch;

  PreparedQuery(String statementName, FieldFormatRef[] parameterFormats, ByteBuf[] parameterBuffers, ResultField[] resultFields) {
    this.statementName = statementName;
    this.parameterFormats = parameterFormats;
    this.parameterBuffers = parameterBuffers;
    this.resultFields = resultFields;
    this.status = Status.Initialized;
  }

  @Override
  public Status getStatus() {
    return status;
  }

  @Override
  public Long getTimeout() {
    return timeout;
  }

  @Override
  public void setTimeout(Long timeout) {
    this.timeout = timeout;
  }

  @Override
  public void setMaxRows(int maxRows) {
    this.maxRows = maxRows;
  }

  @Override
  public List<ResultBatch> getResultBatches() {
    return new ArrayList<>(singletonList(resultBatch));
  }

  private boolean requiresPortal() {
    return maxRows > 0;
  }

  private SQLWarning executeStatement(PGDirectConnection connection) throws SQLException {

    if (requiresPortal()) {
      portalName = connection.getNextPortalName();
    }
    else {
      portalName = null;
    }

    try {

      ExecuteResult result = connection.executeTimed(this.timeout, (timeout) -> {
        ExecuteResult handler = new ExecuteResult(!requiresPortal(), resultFields);
        connection.getRequestExecutor().execute(portalName, statementName, parameterFormats, parameterBuffers, resultFields, maxRows, handler);
        handler.await(timeout, MILLISECONDS);
        return handler;
      });

      return applyResult(connection, result);

    }
    catch (Throwable x) {
      dispose(connection);
      throw x;
    }
  }

  private SQLWarning resumeStatement(PGDirectConnection connection) throws SQLException {

    ExecuteResult result = connection.executeTimed(this.timeout, (timeout) -> {
      ExecuteResult handler = new ExecuteResult(false, resultFields);
      connection.getRequestExecutor().resume(portalName, firstNonNull(maxRows, 0), handler);
      handler.await(timeout, MILLISECONDS);
      return handler;
    });

    return applyResult(connection, result);

  }

  private SQLWarning applyResult(PGDirectConnection connection, ExecuteResult result) throws SQLException {

    resultBatch = result.getBatch();

    // Cache referenced types...
    try {
      transformFieldTypes(resultBatch, connection.getRegistry()::resolve);
    }
    catch (IOException e) {
      throw makeSQLException(e);
    }

    if (result.isSuspended()) {
      status = Status.Suspended;
    }
    else if (portalName != null) {
      connection.execute(timeout -> {
        SynchronizedResult handler = new SynchronizedResult();
        connection.getRequestExecutor().finish(portalName, handler);
        handler.await(timeout, MILLISECONDS);
      });
      portalName = null;
    }

    return chainWarnings(null, result);
  }

  @Override
  public SQLWarning execute(PGDirectConnection connection) throws SQLException {

    boolean wasSuspended = status == Status.Suspended;

    status = Status.InProgress;
    try {

      if (wasSuspended) {

        if (portalName == null) {
          throw new PGSQLSimpleException("Illegal query state - suspended with no portal");
        }

        return resumeStatement(connection);
      }

      return executeStatement(connection);
    }
    finally {
      if (status == Status.InProgress) {
        status = Status.Completed;
      }
    }

  }

  @Override
  public void dispose(PGDirectConnection connection) throws SQLException {

    if (portalName != null) {
      connection.execute(timeout -> {
        SynchronizedResult handler = new SynchronizedResult();
        connection.getRequestExecutor().finish(portalName, handler);
        handler.await(timeout, MILLISECONDS);
      });
    }

  }

  @Override
  public String toString() {
    return "PreparedQuery{" +
        "statementName='" + statementName + '\'' +
        ", portalName='" + portalName + '\'' +
        ", status=" + status +
        '}';
  }

}
