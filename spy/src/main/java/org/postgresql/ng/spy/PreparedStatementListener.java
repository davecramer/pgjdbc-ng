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

interface PreparedStatementListener {
  void setLargeMaxRows(long max);

  void setLargeMaxRows(Throwable targetFailureCause, long max);

  void setBoolean(int parameterIndex, boolean x);

  void setBoolean(Throwable targetFailureCause, int parameterIndex, boolean x);

  void getResultSetType(int targetSuccessResult);

  void getResultSetType(Throwable targetFailureCause);

  void executeBatch(int[] targetSuccessResult);

  void executeBatch(Throwable targetFailureCause);

  void executeUpdate(int targetSuccessResult, String sql, String[] columnNames);

  void executeUpdate(Throwable targetFailureCause, String sql, String[] columnNames);

  void setURL(int parameterIndex, URL x);

  void setURL(Throwable targetFailureCause, int parameterIndex, URL x);

  void executeUpdate(int targetSuccessResult, String sql);

  void executeUpdate(Throwable targetFailureCause, String sql);

  void getMetaData(ResultSetMetaData targetSuccessResult);

  void getMetaData(Throwable targetFailureCause);

  void setByte(int parameterIndex, byte x);

  void setByte(Throwable targetFailureCause, int parameterIndex, byte x);

  void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, SQLType targetSqlType,
      int scaleOrLength);

  void setNull(int parameterIndex, int sqlType);

  void setNull(Throwable targetFailureCause, int parameterIndex, int sqlType);

  void executeQuery(ResultSet targetSuccessResult);

  void executeQuery(Throwable targetFailureCause);

  void setQueryTimeout(int seconds);

  void setQueryTimeout(Throwable targetFailureCause, int seconds);

  void setNString(int parameterIndex, String value);

  void setNString(Throwable targetFailureCause, int parameterIndex, String value);

  void executeUpdate(int targetSuccessResult);

  void executeUpdate(Throwable targetFailureCause);

  void executeLargeUpdate(long targetSuccessResult, String sql);

  void executeLargeUpdate(Throwable targetFailureCause, String sql);

  void getConnection(Connection targetSuccessResult);

  void getConnection(Throwable targetFailureCause);

  void setSQLXML(int parameterIndex, SQLXML xmlObject);

  void setSQLXML(Throwable targetFailureCause, int parameterIndex, SQLXML xmlObject);

  void getMaxRows(int targetSuccessResult);

  void getMaxRows(Throwable targetFailureCause);

  void setRowId(int parameterIndex, RowId x);

  void setRowId(Throwable targetFailureCause, int parameterIndex, RowId x);

  void getResultSetConcurrency(int targetSuccessResult);

  void getResultSetConcurrency(Throwable targetFailureCause);

  void setObject(int parameterIndex, Object x);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x);

  void execute(boolean targetSuccessResult, String sql, String[] columnNames);

  void execute(Throwable targetFailureCause, String sql, String[] columnNames);

  void getUpdateCount(int targetSuccessResult);

  void getUpdateCount(Throwable targetFailureCause);

  void setBinaryStream(int parameterIndex, InputStream x, long length);

  void setBinaryStream(Throwable targetFailureCause, int parameterIndex, InputStream x,
      long length);

  void setCharacterStream(int parameterIndex, Reader reader, int length);

  void setCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader reader,
      int length);

  void clearBatch();

  void clearBatch(Throwable targetFailureCause);

  void setBlob(int parameterIndex, Blob x);

  void setBlob(Throwable targetFailureCause, int parameterIndex, Blob x);

  void setBlob(int parameterIndex, InputStream inputStream, long length);

  void setBlob(Throwable targetFailureCause, int parameterIndex, InputStream inputStream,
      long length);

  void getFetchDirection(int targetSuccessResult);

  void getFetchDirection(Throwable targetFailureCause);

  void setDate(int parameterIndex, Date x, Calendar cal);

  void setDate(Throwable targetFailureCause, int parameterIndex, Date x, Calendar cal);

  void setNClob(int parameterIndex, NClob value);

  void setNClob(Throwable targetFailureCause, int parameterIndex, NClob value);

  void executeLargeUpdate(long targetSuccessResult, String sql, int[] columnIndexes);

  void executeLargeUpdate(Throwable targetFailureCause, String sql, int[] columnIndexes);

  void execute(boolean targetSuccessResult, String sql, int[] columnIndexes);

  void execute(Throwable targetFailureCause, String sql, int[] columnIndexes);

  void getResultSet(ResultSet targetSuccessResult);

  void getResultSet(Throwable targetFailureCause);

  void executeLargeUpdate(long targetSuccessResult, String sql, String[] columnNames);

  void executeLargeUpdate(Throwable targetFailureCause, String sql, String[] columnNames);

  void setDate(int parameterIndex, Date x);

  void setDate(Throwable targetFailureCause, int parameterIndex, Date x);

  void setNull(int parameterIndex, int sqlType, String typeName);

  void setNull(Throwable targetFailureCause, int parameterIndex, int sqlType, String typeName);

  void setTime(int parameterIndex, Time x);

  void setTime(Throwable targetFailureCause, int parameterIndex, Time x);

  void getLargeUpdateCount(long targetSuccessResult);

  void getLargeUpdateCount(Throwable targetFailureCause);

  void isClosed(boolean targetSuccessResult);

  void isClosed(Throwable targetFailureCause);

  void close();

  void close(Throwable targetFailureCause);

  void setShort(int parameterIndex, short x);

  void setShort(Throwable targetFailureCause, int parameterIndex, short x);

  void setNCharacterStream(int parameterIndex, Reader value);

  void setNCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader value);

  void setMaxFieldSize(int max);

  void setMaxFieldSize(Throwable targetFailureCause, int max);

  void setObject(int parameterIndex, Object x, int targetSqlType);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, int targetSqlType);

  void setCharacterStream(int parameterIndex, Reader reader, long length);

  void setCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader reader,
      long length);

  void setClob(int parameterIndex, Reader reader);

  void setClob(Throwable targetFailureCause, int parameterIndex, Reader reader);

  void execute(boolean targetSuccessResult);

  void execute(Throwable targetFailureCause);

  void setString(int parameterIndex, String x);

  void setString(Throwable targetFailureCause, int parameterIndex, String x);

  void setBytes(int parameterIndex, byte[] x);

  void setBytes(Throwable targetFailureCause, int parameterIndex, byte[] x);

  void getParameterMetaData(ParameterMetaData targetSuccessResult);

  void getParameterMetaData(Throwable targetFailureCause);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void clearParameters();

  void clearParameters(Throwable targetFailureCause);

  void executeLargeUpdate(long targetSuccessResult);

  void executeLargeUpdate(Throwable targetFailureCause);

  void getLargeMaxRows(long targetSuccessResult);

  void getLargeMaxRows(Throwable targetFailureCause);

  void getWarnings(SQLWarning targetSuccessResult);

  void getWarnings(Throwable targetFailureCause);

  void executeLargeUpdate(long targetSuccessResult, String sql, int autoGeneratedKeys);

  void executeLargeUpdate(Throwable targetFailureCause, String sql, int autoGeneratedKeys);

  void setLong(int parameterIndex, long x);

  void setLong(Throwable targetFailureCause, int parameterIndex, long x);

  void setNCharacterStream(int parameterIndex, Reader value, long length);

  void setNCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader value,
      long length);

  void setTimestamp(int parameterIndex, Timestamp x);

  void setTimestamp(Throwable targetFailureCause, int parameterIndex, Timestamp x);

  void execute(boolean targetSuccessResult, String sql);

  void execute(Throwable targetFailureCause, String sql);

  void closeOnCompletion();

  void closeOnCompletion(Throwable targetFailureCause);

  void cancel();

  void cancel(Throwable targetFailureCause);

  void setDouble(int parameterIndex, double x);

  void setDouble(Throwable targetFailureCause, int parameterIndex, double x);

  void isCloseOnCompletion(boolean targetSuccessResult);

  void isCloseOnCompletion(Throwable targetFailureCause);

  void setTime(int parameterIndex, Time x, Calendar cal);

  void setTime(Throwable targetFailureCause, int parameterIndex, Time x, Calendar cal);

  void getResultSetHoldability(int targetSuccessResult);

  void getResultSetHoldability(Throwable targetFailureCause);

  void getMoreResults(boolean targetSuccessResult);

  void getMoreResults(Throwable targetFailureCause);

  void addBatch();

  void addBatch(Throwable targetFailureCause);

  void setAsciiStream(int parameterIndex, InputStream x);

  void setAsciiStream(Throwable targetFailureCause, int parameterIndex, InputStream x);

  void setClob(int parameterIndex, Clob x);

  void setClob(Throwable targetFailureCause, int parameterIndex, Clob x);

  void setBigDecimal(int parameterIndex, BigDecimal x);

  void setBigDecimal(Throwable targetFailureCause, int parameterIndex, BigDecimal x);

  void executeUpdate(int targetSuccessResult, String sql, int autoGeneratedKeys);

  void executeUpdate(Throwable targetFailureCause, String sql, int autoGeneratedKeys);

  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  void setUnicodeStream(int parameterIndex, InputStream x, int length);

  void setUnicodeStream(Throwable targetFailureCause, int parameterIndex, InputStream x,
      int length);

  void setRef(int parameterIndex, Ref x);

  void setRef(Throwable targetFailureCause, int parameterIndex, Ref x);

  void setCursorName(String name);

  void setCursorName(Throwable targetFailureCause, String name);

  void setAsciiStream(int parameterIndex, InputStream x, int length);

  void setAsciiStream(Throwable targetFailureCause, int parameterIndex, InputStream x, int length);

  void clearWarnings();

  void clearWarnings(Throwable targetFailureCause);

  void executeQuery(ResultSet targetSuccessResult, String sql);

  void executeQuery(Throwable targetFailureCause, String sql);

  void setFloat(int parameterIndex, float x);

  void setFloat(Throwable targetFailureCause, int parameterIndex, float x);

  void getQueryTimeout(int targetSuccessResult);

  void getQueryTimeout(Throwable targetFailureCause);

  void isPoolable(boolean targetSuccessResult);

  void isPoolable(Throwable targetFailureCause);

  void setNClob(int parameterIndex, Reader reader);

  void setNClob(Throwable targetFailureCause, int parameterIndex, Reader reader);

  void setMaxRows(int max);

  void setMaxRows(Throwable targetFailureCause, int max);

  void setEscapeProcessing(boolean enable);

  void setEscapeProcessing(Throwable targetFailureCause, boolean enable);

  void setAsciiStream(int parameterIndex, InputStream x, long length);

  void setAsciiStream(Throwable targetFailureCause, int parameterIndex, InputStream x, long length);

  void setFetchDirection(int direction);

  void setFetchDirection(Throwable targetFailureCause, int direction);

  void setBlob(int parameterIndex, InputStream inputStream);

  void setBlob(Throwable targetFailureCause, int parameterIndex, InputStream inputStream);

  void setClob(int parameterIndex, Reader reader, long length);

  void setClob(Throwable targetFailureCause, int parameterIndex, Reader reader, long length);

  void setTimestamp(int parameterIndex, Timestamp x, Calendar cal);

  void setTimestamp(Throwable targetFailureCause, int parameterIndex, Timestamp x, Calendar cal);

  void getMoreResults(boolean targetSuccessResult, int current);

  void getMoreResults(Throwable targetFailureCause, int current);

  void setBinaryStream(int parameterIndex, InputStream x, int length);

  void setBinaryStream(Throwable targetFailureCause, int parameterIndex, InputStream x, int length);

  void setInt(int parameterIndex, int x);

  void setInt(Throwable targetFailureCause, int parameterIndex, int x);

  void setBinaryStream(int parameterIndex, InputStream x);

  void setBinaryStream(Throwable targetFailureCause, int parameterIndex, InputStream x);

  void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, int targetSqlType,
      int scaleOrLength);

  void addBatch(String sql);

  void addBatch(Throwable targetFailureCause, String sql);

  void setPoolable(boolean poolable);

  void setPoolable(Throwable targetFailureCause, boolean poolable);

  void getMaxFieldSize(int targetSuccessResult);

  void getMaxFieldSize(Throwable targetFailureCause);

  void setObject(int parameterIndex, Object x, SQLType targetSqlType);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, SQLType targetSqlType);

  void getGeneratedKeys(ResultSet targetSuccessResult);

  void getGeneratedKeys(Throwable targetFailureCause);

  void setCharacterStream(int parameterIndex, Reader reader);

  void setCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader reader);

  void setArray(int parameterIndex, Array x);

  void setArray(Throwable targetFailureCause, int parameterIndex, Array x);

  void executeLargeBatch(long[] targetSuccessResult);

  void executeLargeBatch(Throwable targetFailureCause);

  void executeUpdate(int targetSuccessResult, String sql, int[] columnIndexes);

  void executeUpdate(Throwable targetFailureCause, String sql, int[] columnIndexes);

  void getFetchSize(int targetSuccessResult);

  void getFetchSize(Throwable targetFailureCause);

  void setNClob(int parameterIndex, Reader reader, long length);

  void setNClob(Throwable targetFailureCause, int parameterIndex, Reader reader, long length);

  void setFetchSize(int rows);

  void setFetchSize(Throwable targetFailureCause, int rows);

  void execute(boolean targetSuccessResult, String sql, int autoGeneratedKeys);

  void execute(Throwable targetFailureCause, String sql, int autoGeneratedKeys);

  ResultSetMetaDataListener newResultSetMetaDataListener();

  ResultSetListener newResultSetListener();

  ConnectionListener newConnectionListener();

  ParameterMetaDataListener newParameterMetaDataListener();
}
