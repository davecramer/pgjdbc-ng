package org.postgresql.ng.spy;

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
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;

public class PreparedStatementRelay implements Relay<PreparedStatement>, PreparedStatement {
  public PreparedStatement target;

  public PreparedStatementListener listener;

  public PreparedStatementRelay(PreparedStatement target, PreparedStatementListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public PreparedStatement getTarget() {
    return target;
  }

  public void setLargeMaxRows(long max) throws SQLException {
    try {
      this.target.setLargeMaxRows(max);
      this.listener.setLargeMaxRows(max);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setLargeMaxRows(targetFailureCause, max);
      throw targetFailureCause;

    }
  }

  public void setBoolean(int parameterIndex, boolean x) throws SQLException {
    try {
      this.target.setBoolean(parameterIndex, x);
      this.listener.setBoolean(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBoolean(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public int getResultSetType() throws SQLException {
    try {
      int targetSuccessResult = this.target.getResultSetType();
      this.listener.getResultSetType(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSetType(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int[] executeBatch() throws SQLException {
    try {
      int[] targetSuccessResult = this.target.executeBatch();
      this.listener.executeBatch(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeBatch(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int executeUpdate(String sql, String[] columnNames) throws SQLException {
    try {
      int targetSuccessResult = this.target.executeUpdate(sql, columnNames);
      this.listener.executeUpdate(targetSuccessResult, sql, columnNames);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeUpdate(targetFailureCause, sql, columnNames);
      throw targetFailureCause;

    }
  }

  public void setURL(int parameterIndex, URL x) throws SQLException {
    try {
      this.target.setURL(parameterIndex, x);
      this.listener.setURL(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setURL(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public int executeUpdate(String sql) throws SQLException {
    try {
      int targetSuccessResult = this.target.executeUpdate(sql);
      this.listener.executeUpdate(targetSuccessResult, sql);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeUpdate(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public ResultSetMetaData getMetaData() throws SQLException {
    try {
      ResultSetMetaData targetSuccessResult = this.target.getMetaData();
      this.listener.getMetaData(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetMetaDataRelay(targetSuccessResult, this.listener.newResultSetMetaDataListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMetaData(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setByte(int parameterIndex, byte x) throws SQLException {
    try {
      this.target.setByte(parameterIndex, x);
      this.listener.setByte(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setByte(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength)
      throws SQLException {
    try {
      this.target.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
      this.listener.setObject(parameterIndex, x, targetSqlType, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterIndex, x, targetSqlType, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public void setNull(int parameterIndex, int sqlType) throws SQLException {
    try {
      this.target.setNull(parameterIndex, sqlType);
      this.listener.setNull(parameterIndex, sqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNull(targetFailureCause, parameterIndex, sqlType);
      throw targetFailureCause;

    }
  }

  public ResultSet executeQuery() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.executeQuery();
      this.listener.executeQuery(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeQuery(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setQueryTimeout(int seconds) throws SQLException {
    try {
      this.target.setQueryTimeout(seconds);
      this.listener.setQueryTimeout(seconds);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setQueryTimeout(targetFailureCause, seconds);
      throw targetFailureCause;

    }
  }

  public void setNString(int parameterIndex, String value) throws SQLException {
    try {
      this.target.setNString(parameterIndex, value);
      this.listener.setNString(parameterIndex, value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNString(targetFailureCause, parameterIndex, value);
      throw targetFailureCause;

    }
  }

  public int executeUpdate() throws SQLException {
    try {
      int targetSuccessResult = this.target.executeUpdate();
      this.listener.executeUpdate(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeUpdate(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public long executeLargeUpdate(String sql) throws SQLException {
    try {
      long targetSuccessResult = this.target.executeLargeUpdate(sql);
      this.listener.executeLargeUpdate(targetSuccessResult, sql);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeLargeUpdate(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public Connection getConnection() throws SQLException {
    try {
      Connection targetSuccessResult = this.target.getConnection();
      this.listener.getConnection(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ConnectionRelay(targetSuccessResult, this.listener.newConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getConnection(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setSQLXML(int parameterIndex, SQLXML xmlObject) throws SQLException {
    try {
      this.target.setSQLXML(parameterIndex, xmlObject);
      this.listener.setSQLXML(parameterIndex, xmlObject);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setSQLXML(targetFailureCause, parameterIndex, xmlObject);
      throw targetFailureCause;

    }
  }

  public int getMaxRows() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxRows();
      this.listener.getMaxRows(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxRows(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setRowId(int parameterIndex, RowId x) throws SQLException {
    try {
      this.target.setRowId(parameterIndex, x);
      this.listener.setRowId(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setRowId(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public int getResultSetConcurrency() throws SQLException {
    try {
      int targetSuccessResult = this.target.getResultSetConcurrency();
      this.listener.getResultSetConcurrency(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSetConcurrency(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setObject(int parameterIndex, Object x) throws SQLException {
    try {
      this.target.setObject(parameterIndex, x);
      this.listener.setObject(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public boolean execute(String sql, String[] columnNames) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.execute(sql, columnNames);
      this.listener.execute(targetSuccessResult, sql, columnNames);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.execute(targetFailureCause, sql, columnNames);
      throw targetFailureCause;

    }
  }

  public int getUpdateCount() throws SQLException {
    try {
      int targetSuccessResult = this.target.getUpdateCount();
      this.listener.getUpdateCount(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getUpdateCount(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setBinaryStream(int parameterIndex, InputStream x, long length) throws SQLException {
    try {
      this.target.setBinaryStream(parameterIndex, x, length);
      this.listener.setBinaryStream(parameterIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, parameterIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void setCharacterStream(int parameterIndex, Reader reader, int length) throws
      SQLException {
    try {
      this.target.setCharacterStream(parameterIndex, reader, length);
      this.listener.setCharacterStream(parameterIndex, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, parameterIndex, reader, length);
      throw targetFailureCause;

    }
  }

  public void clearBatch() throws SQLException {
    try {
      this.target.clearBatch();
      this.listener.clearBatch();

    }
    catch(SQLException targetFailureCause) {
      this.listener.clearBatch(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setBlob(int parameterIndex, Blob x) throws SQLException {
    try {
      this.target.setBlob(parameterIndex, x);
      this.listener.setBlob(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBlob(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setBlob(int parameterIndex, InputStream inputStream, long length) throws
      SQLException {
    try {
      this.target.setBlob(parameterIndex, inputStream, length);
      this.listener.setBlob(parameterIndex, inputStream, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBlob(targetFailureCause, parameterIndex, inputStream, length);
      throw targetFailureCause;

    }
  }

  public int getFetchDirection() throws SQLException {
    try {
      int targetSuccessResult = this.target.getFetchDirection();
      this.listener.getFetchDirection(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFetchDirection(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setDate(int parameterIndex, Date x, Calendar cal) throws SQLException {
    try {
      this.target.setDate(parameterIndex, x, cal);
      this.listener.setDate(parameterIndex, x, cal);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setDate(targetFailureCause, parameterIndex, x, cal);
      throw targetFailureCause;

    }
  }

  public void setNClob(int parameterIndex, NClob value) throws SQLException {
    try {
      this.target.setNClob(parameterIndex, value);
      this.listener.setNClob(parameterIndex, value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNClob(targetFailureCause, parameterIndex, value);
      throw targetFailureCause;

    }
  }

  public long executeLargeUpdate(String sql, int[] columnIndexes) throws SQLException {
    try {
      long targetSuccessResult = this.target.executeLargeUpdate(sql, columnIndexes);
      this.listener.executeLargeUpdate(targetSuccessResult, sql, columnIndexes);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeLargeUpdate(targetFailureCause, sql, columnIndexes);
      throw targetFailureCause;

    }
  }

  public boolean execute(String sql, int[] columnIndexes) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.execute(sql, columnIndexes);
      this.listener.execute(targetSuccessResult, sql, columnIndexes);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.execute(targetFailureCause, sql, columnIndexes);
      throw targetFailureCause;

    }
  }

  public ResultSet getResultSet() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getResultSet();
      this.listener.getResultSet(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSet(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public long executeLargeUpdate(String sql, String[] columnNames) throws SQLException {
    try {
      long targetSuccessResult = this.target.executeLargeUpdate(sql, columnNames);
      this.listener.executeLargeUpdate(targetSuccessResult, sql, columnNames);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeLargeUpdate(targetFailureCause, sql, columnNames);
      throw targetFailureCause;

    }
  }

  public void setDate(int parameterIndex, Date x) throws SQLException {
    try {
      this.target.setDate(parameterIndex, x);
      this.listener.setDate(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setDate(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setNull(int parameterIndex, int sqlType, String typeName) throws SQLException {
    try {
      this.target.setNull(parameterIndex, sqlType, typeName);
      this.listener.setNull(parameterIndex, sqlType, typeName);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNull(targetFailureCause, parameterIndex, sqlType, typeName);
      throw targetFailureCause;

    }
  }

  public void setTime(int parameterIndex, Time x) throws SQLException {
    try {
      this.target.setTime(parameterIndex, x);
      this.listener.setTime(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTime(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public long getLargeUpdateCount() throws SQLException {
    try {
      long targetSuccessResult = this.target.getLargeUpdateCount();
      this.listener.getLargeUpdateCount(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLargeUpdateCount(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean isClosed() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isClosed();
      this.listener.isClosed(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isClosed(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void close() throws SQLException {
    try {
      this.target.close();
      this.listener.close();

    }
    catch(SQLException targetFailureCause) {
      this.listener.close(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setShort(int parameterIndex, short x) throws SQLException {
    try {
      this.target.setShort(parameterIndex, x);
      this.listener.setShort(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setShort(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setNCharacterStream(int parameterIndex, Reader value) throws SQLException {
    try {
      this.target.setNCharacterStream(parameterIndex, value);
      this.listener.setNCharacterStream(parameterIndex, value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNCharacterStream(targetFailureCause, parameterIndex, value);
      throw targetFailureCause;

    }
  }

  public void setMaxFieldSize(int max) throws SQLException {
    try {
      this.target.setMaxFieldSize(max);
      this.listener.setMaxFieldSize(max);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setMaxFieldSize(targetFailureCause, max);
      throw targetFailureCause;

    }
  }

  public void setObject(int parameterIndex, Object x, int targetSqlType) throws SQLException {
    try {
      this.target.setObject(parameterIndex, x, targetSqlType);
      this.listener.setObject(parameterIndex, x, targetSqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterIndex, x, targetSqlType);
      throw targetFailureCause;

    }
  }

  public void setCharacterStream(int parameterIndex, Reader reader, long length) throws
      SQLException {
    try {
      this.target.setCharacterStream(parameterIndex, reader, length);
      this.listener.setCharacterStream(parameterIndex, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, parameterIndex, reader, length);
      throw targetFailureCause;

    }
  }

  public void setClob(int parameterIndex, Reader reader) throws SQLException {
    try {
      this.target.setClob(parameterIndex, reader);
      this.listener.setClob(parameterIndex, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setClob(targetFailureCause, parameterIndex, reader);
      throw targetFailureCause;

    }
  }

  public boolean execute() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.execute();
      this.listener.execute(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.execute(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setString(int parameterIndex, String x) throws SQLException {
    try {
      this.target.setString(parameterIndex, x);
      this.listener.setString(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setString(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setBytes(int parameterIndex, byte[] x) throws SQLException {
    try {
      this.target.setBytes(parameterIndex, x);
      this.listener.setBytes(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBytes(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public ParameterMetaData getParameterMetaData() throws SQLException {
    try {
      ParameterMetaData targetSuccessResult = this.target.getParameterMetaData();
      this.listener.getParameterMetaData(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ParameterMetaDataRelay(targetSuccessResult, this.listener.newParameterMetaDataListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getParameterMetaData(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public <T> T unwrap(Class<T> iface) throws SQLException {
    try {
      T targetSuccessResult = this.target.unwrap(iface);
      this.listener.unwrap(targetSuccessResult, iface);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.unwrap(targetFailureCause, iface);
      throw targetFailureCause;

    }
  }

  public void clearParameters() throws SQLException {
    try {
      this.target.clearParameters();
      this.listener.clearParameters();

    }
    catch(SQLException targetFailureCause) {
      this.listener.clearParameters(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public long executeLargeUpdate() throws SQLException {
    try {
      long targetSuccessResult = this.target.executeLargeUpdate();
      this.listener.executeLargeUpdate(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeLargeUpdate(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public long getLargeMaxRows() throws SQLException {
    try {
      long targetSuccessResult = this.target.getLargeMaxRows();
      this.listener.getLargeMaxRows(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLargeMaxRows(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public SQLWarning getWarnings() throws SQLException {
    try {
      SQLWarning targetSuccessResult = this.target.getWarnings();
      this.listener.getWarnings(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getWarnings(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public long executeLargeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
    try {
      long targetSuccessResult = this.target.executeLargeUpdate(sql, autoGeneratedKeys);
      this.listener.executeLargeUpdate(targetSuccessResult, sql, autoGeneratedKeys);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeLargeUpdate(targetFailureCause, sql, autoGeneratedKeys);
      throw targetFailureCause;

    }
  }

  public void setLong(int parameterIndex, long x) throws SQLException {
    try {
      this.target.setLong(parameterIndex, x);
      this.listener.setLong(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setLong(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setNCharacterStream(int parameterIndex, Reader value, long length) throws
      SQLException {
    try {
      this.target.setNCharacterStream(parameterIndex, value, length);
      this.listener.setNCharacterStream(parameterIndex, value, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNCharacterStream(targetFailureCause, parameterIndex, value, length);
      throw targetFailureCause;

    }
  }

  public void setTimestamp(int parameterIndex, Timestamp x) throws SQLException {
    try {
      this.target.setTimestamp(parameterIndex, x);
      this.listener.setTimestamp(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTimestamp(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public boolean execute(String sql) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.execute(sql);
      this.listener.execute(targetSuccessResult, sql);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.execute(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public void closeOnCompletion() throws SQLException {
    try {
      this.target.closeOnCompletion();
      this.listener.closeOnCompletion();

    }
    catch(SQLException targetFailureCause) {
      this.listener.closeOnCompletion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void cancel() throws SQLException {
    try {
      this.target.cancel();
      this.listener.cancel();

    }
    catch(SQLException targetFailureCause) {
      this.listener.cancel(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setDouble(int parameterIndex, double x) throws SQLException {
    try {
      this.target.setDouble(parameterIndex, x);
      this.listener.setDouble(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setDouble(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public boolean isCloseOnCompletion() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isCloseOnCompletion();
      this.listener.isCloseOnCompletion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isCloseOnCompletion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setTime(int parameterIndex, Time x, Calendar cal) throws SQLException {
    try {
      this.target.setTime(parameterIndex, x, cal);
      this.listener.setTime(parameterIndex, x, cal);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTime(targetFailureCause, parameterIndex, x, cal);
      throw targetFailureCause;

    }
  }

  public int getResultSetHoldability() throws SQLException {
    try {
      int targetSuccessResult = this.target.getResultSetHoldability();
      this.listener.getResultSetHoldability(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSetHoldability(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean getMoreResults() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getMoreResults();
      this.listener.getMoreResults(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMoreResults(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void addBatch() throws SQLException {
    try {
      this.target.addBatch();
      this.listener.addBatch();

    }
    catch(SQLException targetFailureCause) {
      this.listener.addBatch(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setAsciiStream(int parameterIndex, InputStream x) throws SQLException {
    try {
      this.target.setAsciiStream(parameterIndex, x);
      this.listener.setAsciiStream(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setClob(int parameterIndex, Clob x) throws SQLException {
    try {
      this.target.setClob(parameterIndex, x);
      this.listener.setClob(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setClob(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setBigDecimal(int parameterIndex, BigDecimal x) throws SQLException {
    try {
      this.target.setBigDecimal(parameterIndex, x);
      this.listener.setBigDecimal(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBigDecimal(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public int executeUpdate(String sql, int autoGeneratedKeys) throws SQLException {
    try {
      int targetSuccessResult = this.target.executeUpdate(sql, autoGeneratedKeys);
      this.listener.executeUpdate(targetSuccessResult, sql, autoGeneratedKeys);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeUpdate(targetFailureCause, sql, autoGeneratedKeys);
      throw targetFailureCause;

    }
  }

  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isWrapperFor(iface);
      this.listener.isWrapperFor(targetSuccessResult, iface);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isWrapperFor(targetFailureCause, iface);
      throw targetFailureCause;

    }
  }

  @SuppressWarnings("deprecation")
  public void setUnicodeStream(int parameterIndex, InputStream x, int length) throws SQLException {
    try {
      this.target.setUnicodeStream(parameterIndex, x, length);
      this.listener.setUnicodeStream(parameterIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setUnicodeStream(targetFailureCause, parameterIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void setRef(int parameterIndex, Ref x) throws SQLException {
    try {
      this.target.setRef(parameterIndex, x);
      this.listener.setRef(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setRef(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setCursorName(String name) throws SQLException {
    try {
      this.target.setCursorName(name);
      this.listener.setCursorName(name);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCursorName(targetFailureCause, name);
      throw targetFailureCause;

    }
  }

  public void setAsciiStream(int parameterIndex, InputStream x, int length) throws SQLException {
    try {
      this.target.setAsciiStream(parameterIndex, x, length);
      this.listener.setAsciiStream(parameterIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, parameterIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void clearWarnings() throws SQLException {
    try {
      this.target.clearWarnings();
      this.listener.clearWarnings();

    }
    catch(SQLException targetFailureCause) {
      this.listener.clearWarnings(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet executeQuery(String sql) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.executeQuery(sql);
      this.listener.executeQuery(targetSuccessResult, sql);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeQuery(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public void setFloat(int parameterIndex, float x) throws SQLException {
    try {
      this.target.setFloat(parameterIndex, x);
      this.listener.setFloat(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setFloat(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public int getQueryTimeout() throws SQLException {
    try {
      int targetSuccessResult = this.target.getQueryTimeout();
      this.listener.getQueryTimeout(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getQueryTimeout(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean isPoolable() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isPoolable();
      this.listener.isPoolable(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isPoolable(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setNClob(int parameterIndex, Reader reader) throws SQLException {
    try {
      this.target.setNClob(parameterIndex, reader);
      this.listener.setNClob(parameterIndex, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNClob(targetFailureCause, parameterIndex, reader);
      throw targetFailureCause;

    }
  }

  public void setMaxRows(int max) throws SQLException {
    try {
      this.target.setMaxRows(max);
      this.listener.setMaxRows(max);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setMaxRows(targetFailureCause, max);
      throw targetFailureCause;

    }
  }

  public void setEscapeProcessing(boolean enable) throws SQLException {
    try {
      this.target.setEscapeProcessing(enable);
      this.listener.setEscapeProcessing(enable);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setEscapeProcessing(targetFailureCause, enable);
      throw targetFailureCause;

    }
  }

  public void setAsciiStream(int parameterIndex, InputStream x, long length) throws SQLException {
    try {
      this.target.setAsciiStream(parameterIndex, x, length);
      this.listener.setAsciiStream(parameterIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, parameterIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void setFetchDirection(int direction) throws SQLException {
    try {
      this.target.setFetchDirection(direction);
      this.listener.setFetchDirection(direction);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setFetchDirection(targetFailureCause, direction);
      throw targetFailureCause;

    }
  }

  public void setBlob(int parameterIndex, InputStream inputStream) throws SQLException {
    try {
      this.target.setBlob(parameterIndex, inputStream);
      this.listener.setBlob(parameterIndex, inputStream);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBlob(targetFailureCause, parameterIndex, inputStream);
      throw targetFailureCause;

    }
  }

  public void setClob(int parameterIndex, Reader reader, long length) throws SQLException {
    try {
      this.target.setClob(parameterIndex, reader, length);
      this.listener.setClob(parameterIndex, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setClob(targetFailureCause, parameterIndex, reader, length);
      throw targetFailureCause;

    }
  }

  public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) throws SQLException {
    try {
      this.target.setTimestamp(parameterIndex, x, cal);
      this.listener.setTimestamp(parameterIndex, x, cal);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTimestamp(targetFailureCause, parameterIndex, x, cal);
      throw targetFailureCause;

    }
  }

  public boolean getMoreResults(int current) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getMoreResults(current);
      this.listener.getMoreResults(targetSuccessResult, current);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMoreResults(targetFailureCause, current);
      throw targetFailureCause;

    }
  }

  public void setBinaryStream(int parameterIndex, InputStream x, int length) throws SQLException {
    try {
      this.target.setBinaryStream(parameterIndex, x, length);
      this.listener.setBinaryStream(parameterIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, parameterIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void setInt(int parameterIndex, int x) throws SQLException {
    try {
      this.target.setInt(parameterIndex, x);
      this.listener.setInt(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setInt(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setBinaryStream(int parameterIndex, InputStream x) throws SQLException {
    try {
      this.target.setBinaryStream(parameterIndex, x);
      this.listener.setBinaryStream(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) throws
      SQLException {
    try {
      this.target.setObject(parameterIndex, x, targetSqlType, scaleOrLength);
      this.listener.setObject(parameterIndex, x, targetSqlType, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterIndex, x, targetSqlType, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public void addBatch(String sql) throws SQLException {
    try {
      this.target.addBatch(sql);
      this.listener.addBatch(sql);

    }
    catch(SQLException targetFailureCause) {
      this.listener.addBatch(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public void setPoolable(boolean poolable) throws SQLException {
    try {
      this.target.setPoolable(poolable);
      this.listener.setPoolable(poolable);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setPoolable(targetFailureCause, poolable);
      throw targetFailureCause;

    }
  }

  public int getMaxFieldSize() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxFieldSize();
      this.listener.getMaxFieldSize(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxFieldSize(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setObject(int parameterIndex, Object x, SQLType targetSqlType) throws SQLException {
    try {
      this.target.setObject(parameterIndex, x, targetSqlType);
      this.listener.setObject(parameterIndex, x, targetSqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterIndex, x, targetSqlType);
      throw targetFailureCause;

    }
  }

  public ResultSet getGeneratedKeys() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getGeneratedKeys();
      this.listener.getGeneratedKeys(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getGeneratedKeys(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setCharacterStream(int parameterIndex, Reader reader) throws SQLException {
    try {
      this.target.setCharacterStream(parameterIndex, reader);
      this.listener.setCharacterStream(parameterIndex, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, parameterIndex, reader);
      throw targetFailureCause;

    }
  }

  public void setArray(int parameterIndex, Array x) throws SQLException {
    try {
      this.target.setArray(parameterIndex, x);
      this.listener.setArray(parameterIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setArray(targetFailureCause, parameterIndex, x);
      throw targetFailureCause;

    }
  }

  public long[] executeLargeBatch() throws SQLException {
    try {
      long[] targetSuccessResult = this.target.executeLargeBatch();
      this.listener.executeLargeBatch(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeLargeBatch(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int executeUpdate(String sql, int[] columnIndexes) throws SQLException {
    try {
      int targetSuccessResult = this.target.executeUpdate(sql, columnIndexes);
      this.listener.executeUpdate(targetSuccessResult, sql, columnIndexes);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.executeUpdate(targetFailureCause, sql, columnIndexes);
      throw targetFailureCause;

    }
  }

  public int getFetchSize() throws SQLException {
    try {
      int targetSuccessResult = this.target.getFetchSize();
      this.listener.getFetchSize(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFetchSize(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setNClob(int parameterIndex, Reader reader, long length) throws SQLException {
    try {
      this.target.setNClob(parameterIndex, reader, length);
      this.listener.setNClob(parameterIndex, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNClob(targetFailureCause, parameterIndex, reader, length);
      throw targetFailureCause;

    }
  }

  public void setFetchSize(int rows) throws SQLException {
    try {
      this.target.setFetchSize(rows);
      this.listener.setFetchSize(rows);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setFetchSize(targetFailureCause, rows);
      throw targetFailureCause;

    }
  }

  public boolean execute(String sql, int autoGeneratedKeys) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.execute(sql, autoGeneratedKeys);
      this.listener.execute(targetSuccessResult, sql, autoGeneratedKeys);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.execute(targetFailureCause, sql, autoGeneratedKeys);
      throw targetFailureCause;

    }
  }
}
