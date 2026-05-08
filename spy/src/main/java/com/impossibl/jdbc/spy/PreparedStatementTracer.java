package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public class PreparedStatementTracer implements PreparedStatementListener {
  TraceOutput out;

  public PreparedStatementTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void setLargeMaxRows(long max) {
    trace(new Trace.Builder("PreparedStatement", "setLargeMaxRows")
        .withParameter("max", max)
        .returned()
        .build());
  }

  public void setLargeMaxRows(Throwable cause, long max) {
    trace(new Trace.Builder("PreparedStatement", "setLargeMaxRows")
        .withParameter("max", max)
        .threw(cause)
        .build());
  }

  public void setBoolean(int parameterIndex, boolean x) {
    trace(new Trace.Builder("PreparedStatement", "setBoolean")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBoolean(Throwable cause, int parameterIndex, boolean x) {
    trace(new Trace.Builder("PreparedStatement", "setBoolean")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getResultSetType(int result) {
    trace(new Trace.Builder("PreparedStatement", "getResultSetType")
        .returned(result)
        .build());
  }

  public void getResultSetType(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getResultSetType")
        .threw(cause)
        .build());
  }

  public void executeBatch(int[] result) {
    trace(new Trace.Builder("PreparedStatement", "executeBatch")
        .returned(result)
        .build());
  }

  public void executeBatch(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "executeBatch")
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql, String[] columnNames) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void setURL(int parameterIndex, URL x) {
    trace(new Trace.Builder("PreparedStatement", "setURL")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setURL(Throwable cause, int parameterIndex, URL x) {
    trace(new Trace.Builder("PreparedStatement", "setURL")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void getMetaData(ResultSetMetaData result) {
    trace(new Trace.Builder("PreparedStatement", "getMetaData")
        .returned(result)
        .build());
  }

  public void getMetaData(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getMetaData")
        .threw(cause)
        .build());
  }

  public void setByte(int parameterIndex, byte x) {
    trace(new Trace.Builder("PreparedStatement", "setByte")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setByte(Throwable cause, int parameterIndex, byte x) {
    trace(new Trace.Builder("PreparedStatement", "setByte")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, SQLType targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void setNull(int parameterIndex, int sqlType) {
    trace(new Trace.Builder("PreparedStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void setNull(Throwable cause, int parameterIndex, int sqlType) {
    trace(new Trace.Builder("PreparedStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void executeQuery(ResultSet result) {
    trace(new Trace.Builder("PreparedStatement", "executeQuery")
        .returned(result)
        .build());
  }

  public void executeQuery(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "executeQuery")
        .threw(cause)
        .build());
  }

  public void setQueryTimeout(int seconds) {
    trace(new Trace.Builder("PreparedStatement", "setQueryTimeout")
        .withParameter("seconds", seconds)
        .returned()
        .build());
  }

  public void setQueryTimeout(Throwable cause, int seconds) {
    trace(new Trace.Builder("PreparedStatement", "setQueryTimeout")
        .withParameter("seconds", seconds)
        .threw(cause)
        .build());
  }

  public void setNString(int parameterIndex, String value) {
    trace(new Trace.Builder("PreparedStatement", "setNString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNString(Throwable cause, int parameterIndex, String value) {
    trace(new Trace.Builder("PreparedStatement", "setNString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void getConnection(Connection result) {
    trace(new Trace.Builder("PreparedStatement", "getConnection")
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getConnection")
        .threw(cause)
        .build());
  }

  public void setSQLXML(int parameterIndex, SQLXML xmlObject) {
    trace(new Trace.Builder("PreparedStatement", "setSQLXML")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("xmlObject", xmlObject)
        .returned()
        .build());
  }

  public void setSQLXML(Throwable cause, int parameterIndex, SQLXML xmlObject) {
    trace(new Trace.Builder("PreparedStatement", "setSQLXML")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("xmlObject", xmlObject)
        .threw(cause)
        .build());
  }

  public void getMaxRows(int result) {
    trace(new Trace.Builder("PreparedStatement", "getMaxRows")
        .returned(result)
        .build());
  }

  public void getMaxRows(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getMaxRows")
        .threw(cause)
        .build());
  }

  public void setRowId(int parameterIndex, RowId x) {
    trace(new Trace.Builder("PreparedStatement", "setRowId")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setRowId(Throwable cause, int parameterIndex, RowId x) {
    trace(new Trace.Builder("PreparedStatement", "setRowId")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getResultSetConcurrency(int result) {
    trace(new Trace.Builder("PreparedStatement", "getResultSetConcurrency")
        .returned(result)
        .build());
  }

  public void getResultSetConcurrency(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getResultSetConcurrency")
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql, String[] columnNames) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void getUpdateCount(int result) {
    trace(new Trace.Builder("PreparedStatement", "getUpdateCount")
        .returned(result)
        .build());
  }

  public void getUpdateCount(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getUpdateCount")
        .threw(cause)
        .build());
  }

  public void setBinaryStream(int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("PreparedStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("PreparedStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(int parameterIndex, Reader reader, int length) {
    trace(new Trace.Builder("PreparedStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, int parameterIndex, Reader reader, int length) {
    trace(new Trace.Builder("PreparedStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void clearBatch() {
    trace(new Trace.Builder("PreparedStatement", "clearBatch")
        .returned()
        .build());
  }

  public void clearBatch(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "clearBatch")
        .threw(cause)
        .build());
  }

  public void setBlob(int parameterIndex, Blob x) {
    trace(new Trace.Builder("PreparedStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, int parameterIndex, Blob x) {
    trace(new Trace.Builder("PreparedStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBlob(int parameterIndex, InputStream inputStream, long length) {
    trace(new Trace.Builder("PreparedStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, int parameterIndex, InputStream inputStream, long length) {
    trace(new Trace.Builder("PreparedStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getFetchDirection(int result) {
    trace(new Trace.Builder("PreparedStatement", "getFetchDirection")
        .returned(result)
        .build());
  }

  public void getFetchDirection(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getFetchDirection")
        .threw(cause)
        .build());
  }

  public void setDate(int parameterIndex, Date x, Calendar cal) {
    trace(new Trace.Builder("PreparedStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setDate(Throwable cause, int parameterIndex, Date x, Calendar cal) {
    trace(new Trace.Builder("PreparedStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void setNClob(int parameterIndex, NClob value) {
    trace(new Trace.Builder("PreparedStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, int parameterIndex, NClob value) {
    trace(new Trace.Builder("PreparedStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void getResultSet(ResultSet result) {
    trace(new Trace.Builder("PreparedStatement", "getResultSet")
        .returned(result)
        .build());
  }

  public void getResultSet(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getResultSet")
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql, String[] columnNames) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void setDate(int parameterIndex, Date x) {
    trace(new Trace.Builder("PreparedStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setDate(Throwable cause, int parameterIndex, Date x) {
    trace(new Trace.Builder("PreparedStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setNull(int parameterIndex, int sqlType, String typeName) {
    trace(new Trace.Builder("PreparedStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void setNull(Throwable cause, int parameterIndex, int sqlType, String typeName) {
    trace(new Trace.Builder("PreparedStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void setTime(int parameterIndex, Time x) {
    trace(new Trace.Builder("PreparedStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setTime(Throwable cause, int parameterIndex, Time x) {
    trace(new Trace.Builder("PreparedStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getLargeUpdateCount(long result) {
    trace(new Trace.Builder("PreparedStatement", "getLargeUpdateCount")
        .returned(result)
        .build());
  }

  public void getLargeUpdateCount(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getLargeUpdateCount")
        .threw(cause)
        .build());
  }

  public void isClosed(boolean result) {
    trace(new Trace.Builder("PreparedStatement", "isClosed")
        .returned(result)
        .build());
  }

  public void isClosed(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "isClosed")
        .threw(cause)
        .build());
  }

  public void close() {
    trace(new Trace.Builder("PreparedStatement", "close")
        .returned()
        .build());
  }

  public void close(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "close")
        .threw(cause)
        .build());
  }

  public void setShort(int parameterIndex, short x) {
    trace(new Trace.Builder("PreparedStatement", "setShort")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setShort(Throwable cause, int parameterIndex, short x) {
    trace(new Trace.Builder("PreparedStatement", "setShort")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setNCharacterStream(int parameterIndex, Reader value) {
    trace(new Trace.Builder("PreparedStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNCharacterStream(Throwable cause, int parameterIndex, Reader value) {
    trace(new Trace.Builder("PreparedStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void setMaxFieldSize(int max) {
    trace(new Trace.Builder("PreparedStatement", "setMaxFieldSize")
        .withParameter("max", max)
        .returned()
        .build());
  }

  public void setMaxFieldSize(Throwable cause, int max) {
    trace(new Trace.Builder("PreparedStatement", "setMaxFieldSize")
        .withParameter("max", max)
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, int targetSqlType) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, int targetSqlType) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("PreparedStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("PreparedStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setClob(int parameterIndex, Reader reader) {
    trace(new Trace.Builder("PreparedStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, int parameterIndex, Reader reader) {
    trace(new Trace.Builder("PreparedStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void execute(boolean result) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .returned(result)
        .build());
  }

  public void execute(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .threw(cause)
        .build());
  }

  public void setString(int parameterIndex, String x) {
    trace(new Trace.Builder("PreparedStatement", "setString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setString(Throwable cause, int parameterIndex, String x) {
    trace(new Trace.Builder("PreparedStatement", "setString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBytes(int parameterIndex, byte[] x) {
    trace(new Trace.Builder("PreparedStatement", "setBytes")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBytes(Throwable cause, int parameterIndex, byte[] x) {
    trace(new Trace.Builder("PreparedStatement", "setBytes")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getParameterMetaData(ParameterMetaData result) {
    trace(new Trace.Builder("PreparedStatement", "getParameterMetaData")
        .returned(result)
        .build());
  }

  public void getParameterMetaData(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getParameterMetaData")
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("PreparedStatement", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("PreparedStatement", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void clearParameters() {
    trace(new Trace.Builder("PreparedStatement", "clearParameters")
        .returned()
        .build());
  }

  public void clearParameters(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "clearParameters")
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .threw(cause)
        .build());
  }

  public void getLargeMaxRows(long result) {
    trace(new Trace.Builder("PreparedStatement", "getLargeMaxRows")
        .returned(result)
        .build());
  }

  public void getLargeMaxRows(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getLargeMaxRows")
        .threw(cause)
        .build());
  }

  public void getWarnings(SQLWarning result) {
    trace(new Trace.Builder("PreparedStatement", "getWarnings")
        .returned(result)
        .build());
  }

  public void getWarnings(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getWarnings")
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public void setLong(int parameterIndex, long x) {
    trace(new Trace.Builder("PreparedStatement", "setLong")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setLong(Throwable cause, int parameterIndex, long x) {
    trace(new Trace.Builder("PreparedStatement", "setLong")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setNCharacterStream(int parameterIndex, Reader value, long length) {
    trace(new Trace.Builder("PreparedStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setNCharacterStream(Throwable cause, int parameterIndex, Reader value, long length) {
    trace(new Trace.Builder("PreparedStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setTimestamp(int parameterIndex, Timestamp x) {
    trace(new Trace.Builder("PreparedStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setTimestamp(Throwable cause, int parameterIndex, Timestamp x) {
    trace(new Trace.Builder("PreparedStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void closeOnCompletion() {
    trace(new Trace.Builder("PreparedStatement", "closeOnCompletion")
        .returned()
        .build());
  }

  public void closeOnCompletion(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "closeOnCompletion")
        .threw(cause)
        .build());
  }

  public void cancel() {
    trace(new Trace.Builder("PreparedStatement", "cancel")
        .returned()
        .build());
  }

  public void cancel(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "cancel")
        .threw(cause)
        .build());
  }

  public void setDouble(int parameterIndex, double x) {
    trace(new Trace.Builder("PreparedStatement", "setDouble")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setDouble(Throwable cause, int parameterIndex, double x) {
    trace(new Trace.Builder("PreparedStatement", "setDouble")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void isCloseOnCompletion(boolean result) {
    trace(new Trace.Builder("PreparedStatement", "isCloseOnCompletion")
        .returned(result)
        .build());
  }

  public void isCloseOnCompletion(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "isCloseOnCompletion")
        .threw(cause)
        .build());
  }

  public void setTime(int parameterIndex, Time x, Calendar cal) {
    trace(new Trace.Builder("PreparedStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setTime(Throwable cause, int parameterIndex, Time x, Calendar cal) {
    trace(new Trace.Builder("PreparedStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getResultSetHoldability(int result) {
    trace(new Trace.Builder("PreparedStatement", "getResultSetHoldability")
        .returned(result)
        .build());
  }

  public void getResultSetHoldability(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getResultSetHoldability")
        .threw(cause)
        .build());
  }

  public void getMoreResults(boolean result) {
    trace(new Trace.Builder("PreparedStatement", "getMoreResults")
        .returned(result)
        .build());
  }

  public void getMoreResults(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getMoreResults")
        .threw(cause)
        .build());
  }

  public void addBatch() {
    trace(new Trace.Builder("PreparedStatement", "addBatch")
        .returned()
        .build());
  }

  public void addBatch(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "addBatch")
        .threw(cause)
        .build());
  }

  public void setAsciiStream(int parameterIndex, InputStream x) {
    trace(new Trace.Builder("PreparedStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, int parameterIndex, InputStream x) {
    trace(new Trace.Builder("PreparedStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setClob(int parameterIndex, Clob x) {
    trace(new Trace.Builder("PreparedStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, int parameterIndex, Clob x) {
    trace(new Trace.Builder("PreparedStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBigDecimal(int parameterIndex, BigDecimal x) {
    trace(new Trace.Builder("PreparedStatement", "setBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBigDecimal(Throwable cause, int parameterIndex, BigDecimal x) {
    trace(new Trace.Builder("PreparedStatement", "setBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("PreparedStatement", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("PreparedStatement", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void setUnicodeStream(int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("PreparedStatement", "setUnicodeStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setUnicodeStream(Throwable cause, int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("PreparedStatement", "setUnicodeStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setRef(int parameterIndex, Ref x) {
    trace(new Trace.Builder("PreparedStatement", "setRef")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setRef(Throwable cause, int parameterIndex, Ref x) {
    trace(new Trace.Builder("PreparedStatement", "setRef")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setCursorName(String name) {
    trace(new Trace.Builder("PreparedStatement", "setCursorName")
        .withParameter("name", name)
        .returned()
        .build());
  }

  public void setCursorName(Throwable cause, String name) {
    trace(new Trace.Builder("PreparedStatement", "setCursorName")
        .withParameter("name", name)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("PreparedStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("PreparedStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void clearWarnings() {
    trace(new Trace.Builder("PreparedStatement", "clearWarnings")
        .returned()
        .build());
  }

  public void clearWarnings(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "clearWarnings")
        .threw(cause)
        .build());
  }

  public void executeQuery(ResultSet result, String sql) {
    trace(new Trace.Builder("PreparedStatement", "executeQuery")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void executeQuery(Throwable cause, String sql) {
    trace(new Trace.Builder("PreparedStatement", "executeQuery")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void setFloat(int parameterIndex, float x) {
    trace(new Trace.Builder("PreparedStatement", "setFloat")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setFloat(Throwable cause, int parameterIndex, float x) {
    trace(new Trace.Builder("PreparedStatement", "setFloat")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getQueryTimeout(int result) {
    trace(new Trace.Builder("PreparedStatement", "getQueryTimeout")
        .returned(result)
        .build());
  }

  public void getQueryTimeout(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getQueryTimeout")
        .threw(cause)
        .build());
  }

  public void isPoolable(boolean result) {
    trace(new Trace.Builder("PreparedStatement", "isPoolable")
        .returned(result)
        .build());
  }

  public void isPoolable(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "isPoolable")
        .threw(cause)
        .build());
  }

  public void setNClob(int parameterIndex, Reader reader) {
    trace(new Trace.Builder("PreparedStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, int parameterIndex, Reader reader) {
    trace(new Trace.Builder("PreparedStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void setMaxRows(int max) {
    trace(new Trace.Builder("PreparedStatement", "setMaxRows")
        .withParameter("max", max)
        .returned()
        .build());
  }

  public void setMaxRows(Throwable cause, int max) {
    trace(new Trace.Builder("PreparedStatement", "setMaxRows")
        .withParameter("max", max)
        .threw(cause)
        .build());
  }

  public void setEscapeProcessing(boolean enable) {
    trace(new Trace.Builder("PreparedStatement", "setEscapeProcessing")
        .withParameter("enable", enable)
        .returned()
        .build());
  }

  public void setEscapeProcessing(Throwable cause, boolean enable) {
    trace(new Trace.Builder("PreparedStatement", "setEscapeProcessing")
        .withParameter("enable", enable)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("PreparedStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("PreparedStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setFetchDirection(int direction) {
    trace(new Trace.Builder("PreparedStatement", "setFetchDirection")
        .withParameter("direction", direction)
        .returned()
        .build());
  }

  public void setFetchDirection(Throwable cause, int direction) {
    trace(new Trace.Builder("PreparedStatement", "setFetchDirection")
        .withParameter("direction", direction)
        .threw(cause)
        .build());
  }

  public void setBlob(int parameterIndex, InputStream inputStream) {
    trace(new Trace.Builder("PreparedStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, int parameterIndex, InputStream inputStream) {
    trace(new Trace.Builder("PreparedStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .threw(cause)
        .build());
  }

  public void setClob(int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("PreparedStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("PreparedStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) {
    trace(new Trace.Builder("PreparedStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setTimestamp(Throwable cause, int parameterIndex, Timestamp x, Calendar cal) {
    trace(new Trace.Builder("PreparedStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getMoreResults(boolean result, int current) {
    trace(new Trace.Builder("PreparedStatement", "getMoreResults")
        .withParameter("current", current)
        .returned(result)
        .build());
  }

  public void getMoreResults(Throwable cause, int current) {
    trace(new Trace.Builder("PreparedStatement", "getMoreResults")
        .withParameter("current", current)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("PreparedStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("PreparedStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setInt(int parameterIndex, int x) {
    trace(new Trace.Builder("PreparedStatement", "setInt")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setInt(Throwable cause, int parameterIndex, int x) {
    trace(new Trace.Builder("PreparedStatement", "setInt")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(int parameterIndex, InputStream x) {
    trace(new Trace.Builder("PreparedStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, int parameterIndex, InputStream x) {
    trace(new Trace.Builder("PreparedStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, int targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void addBatch(String sql) {
    trace(new Trace.Builder("PreparedStatement", "addBatch")
        .withParameter("sql", sql)
        .returned()
        .build());
  }

  public void addBatch(Throwable cause, String sql) {
    trace(new Trace.Builder("PreparedStatement", "addBatch")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void setPoolable(boolean poolable) {
    trace(new Trace.Builder("PreparedStatement", "setPoolable")
        .withParameter("poolable", poolable)
        .returned()
        .build());
  }

  public void setPoolable(Throwable cause, boolean poolable) {
    trace(new Trace.Builder("PreparedStatement", "setPoolable")
        .withParameter("poolable", poolable)
        .threw(cause)
        .build());
  }

  public void getMaxFieldSize(int result) {
    trace(new Trace.Builder("PreparedStatement", "getMaxFieldSize")
        .returned(result)
        .build());
  }

  public void getMaxFieldSize(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getMaxFieldSize")
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("PreparedStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void getGeneratedKeys(ResultSet result) {
    trace(new Trace.Builder("PreparedStatement", "getGeneratedKeys")
        .returned(result)
        .build());
  }

  public void getGeneratedKeys(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getGeneratedKeys")
        .threw(cause)
        .build());
  }

  public void setCharacterStream(int parameterIndex, Reader reader) {
    trace(new Trace.Builder("PreparedStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, int parameterIndex, Reader reader) {
    trace(new Trace.Builder("PreparedStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void setArray(int parameterIndex, Array x) {
    trace(new Trace.Builder("PreparedStatement", "setArray")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setArray(Throwable cause, int parameterIndex, Array x) {
    trace(new Trace.Builder("PreparedStatement", "setArray")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void executeLargeBatch(long[] result) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeBatch")
        .returned(result)
        .build());
  }

  public void executeLargeBatch(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "executeLargeBatch")
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("PreparedStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void getFetchSize(int result) {
    trace(new Trace.Builder("PreparedStatement", "getFetchSize")
        .returned(result)
        .build());
  }

  public void getFetchSize(Throwable cause) {
    trace(new Trace.Builder("PreparedStatement", "getFetchSize")
        .threw(cause)
        .build());
  }

  public void setNClob(int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("PreparedStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("PreparedStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setFetchSize(int rows) {
    trace(new Trace.Builder("PreparedStatement", "setFetchSize")
        .withParameter("rows", rows)
        .returned()
        .build());
  }

  public void setFetchSize(Throwable cause, int rows) {
    trace(new Trace.Builder("PreparedStatement", "setFetchSize")
        .withParameter("rows", rows)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("PreparedStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public ResultSetMetaDataListener newResultSetMetaDataListener() {
    return new ResultSetMetaDataTracer(out);
  }

  public ResultSetListener newResultSetListener() {
    return new ResultSetTracer(out);
  }

  public ConnectionListener newConnectionListener() {
    return new ConnectionTracer(out);
  }

  public ParameterMetaDataListener newParameterMetaDataListener() {
    return new ParameterMetaDataTracer(out);
  }
}
