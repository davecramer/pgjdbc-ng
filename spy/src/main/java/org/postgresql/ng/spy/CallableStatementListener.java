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
import java.util.Map;

interface CallableStatementListener {
  void setNull(int parameterIndex, int sqlType);

  void setNull(Throwable targetFailureCause, int parameterIndex, int sqlType);

  void getGeneratedKeys(ResultSet targetSuccessResult);

  void getGeneratedKeys(Throwable targetFailureCause);

  void setTime(int parameterIndex, Time x);

  void setTime(Throwable targetFailureCause, int parameterIndex, Time x);

  void setLong(int parameterIndex, long x);

  void setLong(Throwable targetFailureCause, int parameterIndex, long x);

  void setFetchSize(int rows);

  void setFetchSize(Throwable targetFailureCause, int rows);

  void getTimestamp(Timestamp targetSuccessResult, String parameterName);

  void getTimestamp(Throwable targetFailureCause, String parameterName);

  void setDouble(String parameterName, double x);

  void setDouble(Throwable targetFailureCause, String parameterName, double x);

  void getResultSetType(int targetSuccessResult);

  void getResultSetType(Throwable targetFailureCause);

  void execute(boolean targetSuccessResult, String sql, int[] columnIndexes);

  void execute(Throwable targetFailureCause, String sql, int[] columnIndexes);

  void executeLargeUpdate(long targetSuccessResult, String sql);

  void executeLargeUpdate(Throwable targetFailureCause, String sql);

  void setAsciiStream(String parameterName, InputStream x, int length);

  void setAsciiStream(Throwable targetFailureCause, String parameterName, InputStream x,
      int length);

  void setTime(String parameterName, Time x);

  void setTime(Throwable targetFailureCause, String parameterName, Time x);

  void getFloat(float targetSuccessResult, String parameterName);

  void getFloat(Throwable targetFailureCause, String parameterName);

  void setObject(String parameterName, Object x, SQLType targetSqlType);

  void setObject(Throwable targetFailureCause, String parameterName, Object x,
      SQLType targetSqlType);

  void setAsciiStream(int parameterIndex, InputStream x);

  void setAsciiStream(Throwable targetFailureCause, int parameterIndex, InputStream x);

  void setClob(String parameterName, Clob x);

  void setClob(Throwable targetFailureCause, String parameterName, Clob x);

  void registerOutParameter(int parameterIndex, SQLType sqlType);

  void registerOutParameter(Throwable targetFailureCause, int parameterIndex, SQLType sqlType);

  void setNClob(int parameterIndex, NClob value);

  void setNClob(Throwable targetFailureCause, int parameterIndex, NClob value);

  void setByte(String parameterName, byte x);

  void setByte(Throwable targetFailureCause, String parameterName, byte x);

  void setArray(int parameterIndex, Array x);

  void setArray(Throwable targetFailureCause, int parameterIndex, Array x);

  void cancel();

  void cancel(Throwable targetFailureCause);

  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  void setNString(String parameterName, String value);

  void setNString(Throwable targetFailureCause, String parameterName, String value);

  void setString(int parameterIndex, String x);

  void setString(Throwable targetFailureCause, int parameterIndex, String x);

  void setDate(String parameterName, Date x);

  void setDate(Throwable targetFailureCause, String parameterName, Date x);

  void getString(String targetSuccessResult, int parameterIndex);

  void getString(Throwable targetFailureCause, int parameterIndex);

  void setTimestamp(String parameterName, Timestamp x, Calendar cal);

  void setTimestamp(Throwable targetFailureCause, String parameterName, Timestamp x, Calendar cal);

  void getDate(Date targetSuccessResult, String parameterName);

  void getDate(Throwable targetFailureCause, String parameterName);

  void getTime(Time targetSuccessResult, String parameterName, Calendar cal);

  void getTime(Throwable targetFailureCause, String parameterName, Calendar cal);

  void getNCharacterStream(Reader targetSuccessResult, String parameterName);

  void getNCharacterStream(Throwable targetFailureCause, String parameterName);

  void executeUpdate(int targetSuccessResult);

  void executeUpdate(Throwable targetFailureCause);

  void setInt(int parameterIndex, int x);

  void setInt(Throwable targetFailureCause, int parameterIndex, int x);

  void setShort(int parameterIndex, short x);

  void setShort(Throwable targetFailureCause, int parameterIndex, short x);

  void getBigDecimal(BigDecimal targetSuccessResult, String parameterName);

  void getBigDecimal(Throwable targetFailureCause, String parameterName);

  void setBinaryStream(int parameterIndex, InputStream x, int length);

  void setBinaryStream(Throwable targetFailureCause, int parameterIndex, InputStream x, int length);

  void registerOutParameter(int parameterIndex, SQLType sqlType, String typeName);

  void registerOutParameter(Throwable targetFailureCause, int parameterIndex, SQLType sqlType,
      String typeName);

  void setNCharacterStream(int parameterIndex, Reader value, long length);

  void setNCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader value,
      long length);

  void setBlob(String parameterName, Blob x);

  void setBlob(Throwable targetFailureCause, String parameterName, Blob x);

  void setClob(int parameterIndex, Reader reader);

  void setClob(Throwable targetFailureCause, int parameterIndex, Reader reader);

  void setNCharacterStream(String parameterName, Reader value, long length);

  void setNCharacterStream(Throwable targetFailureCause, String parameterName, Reader value,
      long length);

  void getCharacterStream(Reader targetSuccessResult, int parameterIndex);

  void getCharacterStream(Throwable targetFailureCause, int parameterIndex);

  void setRowId(int parameterIndex, RowId x);

  void setRowId(Throwable targetFailureCause, int parameterIndex, RowId x);

  void setBlob(String parameterName, InputStream inputStream, long length);

  void setBlob(Throwable targetFailureCause, String parameterName, InputStream inputStream,
      long length);

  void execute(boolean targetSuccessResult, String sql, int autoGeneratedKeys);

  void execute(Throwable targetFailureCause, String sql, int autoGeneratedKeys);

  void getInt(int targetSuccessResult, String parameterName);

  void getInt(Throwable targetFailureCause, String parameterName);

  void setRowId(String parameterName, RowId x);

  void setRowId(Throwable targetFailureCause, String parameterName, RowId x);

  void setFloat(String parameterName, float x);

  void setFloat(Throwable targetFailureCause, String parameterName, float x);

  void setSQLXML(String parameterName, SQLXML xmlObject);

  void setSQLXML(Throwable targetFailureCause, String parameterName, SQLXML xmlObject);

  void getFetchDirection(int targetSuccessResult);

  void getFetchDirection(Throwable targetFailureCause);

  void setCharacterStream(String parameterName, Reader reader);

  void setCharacterStream(Throwable targetFailureCause, String parameterName, Reader reader);

  void getUpdateCount(int targetSuccessResult);

  void getUpdateCount(Throwable targetFailureCause);

  void setBlob(int parameterIndex, Blob x);

  void setBlob(Throwable targetFailureCause, int parameterIndex, Blob x);

  void setObject(int parameterIndex, Object x, SQLType targetSqlType);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, SQLType targetSqlType);

  void getShort(short targetSuccessResult, int parameterIndex);

  void getShort(Throwable targetFailureCause, int parameterIndex);

  void setNClob(int parameterIndex, Reader reader, long length);

  void setNClob(Throwable targetFailureCause, int parameterIndex, Reader reader, long length);

  void addBatch(String sql);

  void addBatch(Throwable targetFailureCause, String sql);

  void setURL(String parameterName, URL val);

  void setURL(Throwable targetFailureCause, String parameterName, URL val);

  void getBytes(byte[] targetSuccessResult, int parameterIndex);

  void getBytes(Throwable targetFailureCause, int parameterIndex);

  void setUnicodeStream(int parameterIndex, InputStream x, int length);

  void setUnicodeStream(Throwable targetFailureCause, int parameterIndex, InputStream x,
      int length);

  void setObject(int parameterIndex, Object x, int targetSqlType);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, int targetSqlType);

  void setAsciiStream(int parameterIndex, InputStream x, long length);

  void setAsciiStream(Throwable targetFailureCause, int parameterIndex, InputStream x, long length);

  void setNCharacterStream(String parameterName, Reader value);

  void setNCharacterStream(Throwable targetFailureCause, String parameterName, Reader value);

  void executeLargeUpdate(long targetSuccessResult, String sql, int autoGeneratedKeys);

  void executeLargeUpdate(Throwable targetFailureCause, String sql, int autoGeneratedKeys);

  void getArray(Array targetSuccessResult, int parameterIndex);

  void getArray(Throwable targetFailureCause, int parameterIndex);

  void getRowId(RowId targetSuccessResult, String parameterName);

  void getRowId(Throwable targetFailureCause, String parameterName);

  void getDouble(double targetSuccessResult, int parameterIndex);

  void getDouble(Throwable targetFailureCause, int parameterIndex);

  void setFloat(int parameterIndex, float x);

  void setFloat(Throwable targetFailureCause, int parameterIndex, float x);

  void setFetchDirection(int direction);

  void setFetchDirection(Throwable targetFailureCause, int direction);

  void getBigDecimal(BigDecimal targetSuccessResult, int parameterIndex, int scale);

  void getBigDecimal(Throwable targetFailureCause, int parameterIndex, int scale);

  void registerOutParameter(String parameterName, SQLType sqlType, int scale);

  void registerOutParameter(Throwable targetFailureCause, String parameterName, SQLType sqlType,
      int scale);

  void setBinaryStream(int parameterIndex, InputStream x, long length);

  void setBinaryStream(Throwable targetFailureCause, int parameterIndex, InputStream x,
      long length);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void setCharacterStream(int parameterIndex, Reader reader, int length);

  void setCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader reader,
      int length);

  void getObject(Object targetSuccessResult, String parameterName);

  void getObject(Throwable targetFailureCause, String parameterName);

  void isPoolable(boolean targetSuccessResult);

  void isPoolable(Throwable targetFailureCause);

  void getNString(String targetSuccessResult, String parameterName);

  void getNString(Throwable targetFailureCause, String parameterName);

  void getLargeMaxRows(long targetSuccessResult);

  void getLargeMaxRows(Throwable targetFailureCause);

  void getMaxRows(int targetSuccessResult);

  void getMaxRows(Throwable targetFailureCause);

  void getTime(Time targetSuccessResult, String parameterName);

  void getTime(Throwable targetFailureCause, String parameterName);

  void getConnection(Connection targetSuccessResult);

  void getConnection(Throwable targetFailureCause);

  void closeOnCompletion();

  void closeOnCompletion(Throwable targetFailureCause);

  <T> void getObject(T targetSuccessResult, String parameterName, Class<T> type);

  <T> void getObject(Throwable targetFailureCause, String parameterName, Class<T> type);

  void setTime(String parameterName, Time x, Calendar cal);

  void setTime(Throwable targetFailureCause, String parameterName, Time x, Calendar cal);

  void execute(boolean targetSuccessResult, String sql, String[] columnNames);

  void execute(Throwable targetFailureCause, String sql, String[] columnNames);

  void setBinaryStream(String parameterName, InputStream x, int length);

  void setBinaryStream(Throwable targetFailureCause, String parameterName, InputStream x,
      int length);

  void executeLargeBatch(long[] targetSuccessResult);

  void executeLargeBatch(Throwable targetFailureCause);

  void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, int targetSqlType,
      int scaleOrLength);

  void setObject(String parameterName, Object x, SQLType targetSqlType, int scaleOrLength);

  void setObject(Throwable targetFailureCause, String parameterName, Object x,
      SQLType targetSqlType, int scaleOrLength);

  void getByte(byte targetSuccessResult, String parameterName);

  void getByte(Throwable targetFailureCause, String parameterName);

  void setBoolean(int parameterIndex, boolean x);

  void setBoolean(Throwable targetFailureCause, int parameterIndex, boolean x);

  void setBytes(int parameterIndex, byte[] x);

  void setBytes(Throwable targetFailureCause, int parameterIndex, byte[] x);

  void registerOutParameter(int parameterIndex, int sqlType, int scale);

  void registerOutParameter(Throwable targetFailureCause, int parameterIndex, int sqlType,
      int scale);

  void executeLargeUpdate(long targetSuccessResult);

  void executeLargeUpdate(Throwable targetFailureCause);

  void getSQLXML(SQLXML targetSuccessResult, int parameterIndex);

  void getSQLXML(Throwable targetFailureCause, int parameterIndex);

  void setShort(String parameterName, short x);

  void setShort(Throwable targetFailureCause, String parameterName, short x);

  void setQueryTimeout(int seconds);

  void setQueryTimeout(Throwable targetFailureCause, int seconds);

  void setNull(String parameterName, int sqlType);

  void setNull(Throwable targetFailureCause, String parameterName, int sqlType);

  void getShort(short targetSuccessResult, String parameterName);

  void getShort(Throwable targetFailureCause, String parameterName);

  void getParameterMetaData(ParameterMetaData targetSuccessResult);

  void getParameterMetaData(Throwable targetFailureCause);

  void getString(String targetSuccessResult, String parameterName);

  void getString(Throwable targetFailureCause, String parameterName);

  void executeLargeUpdate(long targetSuccessResult, String sql, int[] columnIndexes);

  void executeLargeUpdate(Throwable targetFailureCause, String sql, int[] columnIndexes);

  void setNClob(int parameterIndex, Reader reader);

  void setNClob(Throwable targetFailureCause, int parameterIndex, Reader reader);

  void getDate(Date targetSuccessResult, int parameterIndex);

  void getDate(Throwable targetFailureCause, int parameterIndex);

  void getBigDecimal(BigDecimal targetSuccessResult, int parameterIndex);

  void getBigDecimal(Throwable targetFailureCause, int parameterIndex);

  void executeUpdate(int targetSuccessResult, String sql, String[] columnNames);

  void executeUpdate(Throwable targetFailureCause, String sql, String[] columnNames);

  void setCharacterStream(String parameterName, Reader reader, int length);

  void setCharacterStream(Throwable targetFailureCause, String parameterName, Reader reader,
      int length);

  void wasNull(boolean targetSuccessResult);

  void wasNull(Throwable targetFailureCause);

  void setEscapeProcessing(boolean enable);

  void setEscapeProcessing(Throwable targetFailureCause, boolean enable);

  void setLargeMaxRows(long max);

  void setLargeMaxRows(Throwable targetFailureCause, long max);

  void getTime(Time targetSuccessResult, int parameterIndex, Calendar cal);

  void getTime(Throwable targetFailureCause, int parameterIndex, Calendar cal);

  void setAsciiStream(String parameterName, InputStream x);

  void setAsciiStream(Throwable targetFailureCause, String parameterName, InputStream x);

  void getMaxFieldSize(int targetSuccessResult);

  void getMaxFieldSize(Throwable targetFailureCause);

  void setNCharacterStream(int parameterIndex, Reader value);

  void setNCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader value);

  void registerOutParameter(String parameterName, SQLType sqlType);

  void registerOutParameter(Throwable targetFailureCause, String parameterName, SQLType sqlType);

  void getClob(Clob targetSuccessResult, int parameterIndex);

  void getClob(Throwable targetFailureCause, int parameterIndex);

  void registerOutParameter(int parameterIndex, int sqlType, String typeName);

  void registerOutParameter(Throwable targetFailureCause, int parameterIndex, int sqlType,
      String typeName);

  void getLong(long targetSuccessResult, int parameterIndex);

  void getLong(Throwable targetFailureCause, int parameterIndex);

  void setBoolean(String parameterName, boolean x);

  void setBoolean(Throwable targetFailureCause, String parameterName, boolean x);

  void clearBatch();

  void clearBatch(Throwable targetFailureCause);

  void setBlob(String parameterName, InputStream inputStream);

  void setBlob(Throwable targetFailureCause, String parameterName, InputStream inputStream);

  void setURL(int parameterIndex, URL x);

  void setURL(Throwable targetFailureCause, int parameterIndex, URL x);

  void getDouble(double targetSuccessResult, String parameterName);

  void getDouble(Throwable targetFailureCause, String parameterName);

  void getRef(Ref targetSuccessResult, int parameterIndex);

  void getRef(Throwable targetFailureCause, int parameterIndex);

  void setClob(String parameterName, Reader reader);

  void setClob(Throwable targetFailureCause, String parameterName, Reader reader);

  void getNString(String targetSuccessResult, int parameterIndex);

  void getNString(Throwable targetFailureCause, int parameterIndex);

  void getByte(byte targetSuccessResult, int parameterIndex);

  void getByte(Throwable targetFailureCause, int parameterIndex);

  void getFetchSize(int targetSuccessResult);

  void getFetchSize(Throwable targetFailureCause);

  void setTimestamp(int parameterIndex, Timestamp x);

  void setTimestamp(Throwable targetFailureCause, int parameterIndex, Timestamp x);

  void setClob(String parameterName, Reader reader, long length);

  void setClob(Throwable targetFailureCause, String parameterName, Reader reader, long length);

  void setDate(String parameterName, Date x, Calendar cal);

  void setDate(Throwable targetFailureCause, String parameterName, Date x, Calendar cal);

  void setBytes(String parameterName, byte[] x);

  void setBytes(Throwable targetFailureCause, String parameterName, byte[] x);

  void clearParameters();

  void clearParameters(Throwable targetFailureCause);

  void setAsciiStream(String parameterName, InputStream x, long length);

  void setAsciiStream(Throwable targetFailureCause, String parameterName, InputStream x,
      long length);

  void getObject(Object targetSuccessResult, int parameterIndex);

  void getObject(Throwable targetFailureCause, int parameterIndex);

  void registerOutParameter(String parameterName, int sqlType);

  void registerOutParameter(Throwable targetFailureCause, String parameterName, int sqlType);

  void getTimestamp(Timestamp targetSuccessResult, int parameterIndex);

  void getTimestamp(Throwable targetFailureCause, int parameterIndex);

  void setString(String parameterName, String x);

  void setString(Throwable targetFailureCause, String parameterName, String x);

  void getCharacterStream(Reader targetSuccessResult, String parameterName);

  void getCharacterStream(Throwable targetFailureCause, String parameterName);

  void getMoreResults(boolean targetSuccessResult, int current);

  void getMoreResults(Throwable targetFailureCause, int current);

  void executeUpdate(int targetSuccessResult, String sql, int autoGeneratedKeys);

  void executeUpdate(Throwable targetFailureCause, String sql, int autoGeneratedKeys);

  void getSQLXML(SQLXML targetSuccessResult, String parameterName);

  void getSQLXML(Throwable targetFailureCause, String parameterName);

  void setMaxRows(int max);

  void setMaxRows(Throwable targetFailureCause, int max);

  void getTimestamp(Timestamp targetSuccessResult, int parameterIndex, Calendar cal);

  void getTimestamp(Throwable targetFailureCause, int parameterIndex, Calendar cal);

  void getURL(URL targetSuccessResult, int parameterIndex);

  void getURL(Throwable targetFailureCause, int parameterIndex);

  void getDate(Date targetSuccessResult, String parameterName, Calendar cal);

  void getDate(Throwable targetFailureCause, String parameterName, Calendar cal);

  void setCharacterStream(int parameterIndex, Reader reader, long length);

  void setCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader reader,
      long length);

  void registerOutParameter(String parameterName, SQLType sqlType, String typeName);

  void registerOutParameter(Throwable targetFailureCause, String parameterName, SQLType sqlType,
      String typeName);

  void execute(boolean targetSuccessResult, String sql);

  void execute(Throwable targetFailureCause, String sql);

  void executeBatch(int[] targetSuccessResult);

  void executeBatch(Throwable targetFailureCause);

  void getNClob(NClob targetSuccessResult, int parameterIndex);

  void getNClob(Throwable targetFailureCause, int parameterIndex);

  void setCharacterStream(int parameterIndex, Reader reader);

  void setCharacterStream(Throwable targetFailureCause, int parameterIndex, Reader reader);

  void getResultSetConcurrency(int targetSuccessResult);

  void getResultSetConcurrency(Throwable targetFailureCause);

  void getRef(Ref targetSuccessResult, String parameterName);

  void getRef(Throwable targetFailureCause, String parameterName);

  void getTimestamp(Timestamp targetSuccessResult, String parameterName, Calendar cal);

  void getTimestamp(Throwable targetFailureCause, String parameterName, Calendar cal);

  void getURL(URL targetSuccessResult, String parameterName);

  void getURL(Throwable targetFailureCause, String parameterName);

  void getClob(Clob targetSuccessResult, String parameterName);

  void getClob(Throwable targetFailureCause, String parameterName);

  void getBlob(Blob targetSuccessResult, int parameterIndex);

  void getBlob(Throwable targetFailureCause, int parameterIndex);

  void getNCharacterStream(Reader targetSuccessResult, int parameterIndex);

  void getNCharacterStream(Throwable targetFailureCause, int parameterIndex);

  void executeUpdate(int targetSuccessResult, String sql, int[] columnIndexes);

  void executeUpdate(Throwable targetFailureCause, String sql, int[] columnIndexes);

  void getTime(Time targetSuccessResult, int parameterIndex);

  void getTime(Throwable targetFailureCause, int parameterIndex);

  void setObject(String parameterName, Object x, int targetSqlType, int scale);

  void setObject(Throwable targetFailureCause, String parameterName, Object x, int targetSqlType,
      int scale);

  void clearWarnings();

  void clearWarnings(Throwable targetFailureCause);

  void setNClob(String parameterName, Reader reader);

  void setNClob(Throwable targetFailureCause, String parameterName, Reader reader);

  void executeLargeUpdate(long targetSuccessResult, String sql, String[] columnNames);

  void executeLargeUpdate(Throwable targetFailureCause, String sql, String[] columnNames);

  void getQueryTimeout(int targetSuccessResult);

  void getQueryTimeout(Throwable targetFailureCause);

  void setDouble(int parameterIndex, double x);

  void setDouble(Throwable targetFailureCause, int parameterIndex, double x);

  void setBinaryStream(int parameterIndex, InputStream x);

  void setBinaryStream(Throwable targetFailureCause, int parameterIndex, InputStream x);

  void setNClob(String parameterName, Reader reader, long length);

  void setNClob(Throwable targetFailureCause, String parameterName, Reader reader, long length);

  void registerOutParameter(int parameterIndex, SQLType sqlType, int scale);

  void registerOutParameter(Throwable targetFailureCause, int parameterIndex, SQLType sqlType,
      int scale);

  void setAsciiStream(int parameterIndex, InputStream x, int length);

  void setAsciiStream(Throwable targetFailureCause, int parameterIndex, InputStream x, int length);

  void setClob(int parameterIndex, Clob x);

  void setClob(Throwable targetFailureCause, int parameterIndex, Clob x);

  void setMaxFieldSize(int max);

  void setMaxFieldSize(Throwable targetFailureCause, int max);

  void isCloseOnCompletion(boolean targetSuccessResult);

  void isCloseOnCompletion(Throwable targetFailureCause);

  void getBoolean(boolean targetSuccessResult, int parameterIndex);

  void getBoolean(Throwable targetFailureCause, int parameterIndex);

  void getNClob(NClob targetSuccessResult, String parameterName);

  void getNClob(Throwable targetFailureCause, String parameterName);

  void setNString(int parameterIndex, String value);

  void setNString(Throwable targetFailureCause, int parameterIndex, String value);

  void getRowId(RowId targetSuccessResult, int parameterIndex);

  void getRowId(Throwable targetFailureCause, int parameterIndex);

  void setPoolable(boolean poolable);

  void setPoolable(Throwable targetFailureCause, boolean poolable);

  void setNull(int parameterIndex, int sqlType, String typeName);

  void setNull(Throwable targetFailureCause, int parameterIndex, int sqlType, String typeName);

  void executeUpdate(int targetSuccessResult, String sql);

  void executeUpdate(Throwable targetFailureCause, String sql);

  void getDate(Date targetSuccessResult, int parameterIndex, Calendar cal);

  void getDate(Throwable targetFailureCause, int parameterIndex, Calendar cal);

  void isClosed(boolean targetSuccessResult);

  void isClosed(Throwable targetFailureCause);

  void setBinaryStream(String parameterName, InputStream x);

  void setBinaryStream(Throwable targetFailureCause, String parameterName, InputStream x);

  void getObject(Object targetSuccessResult, String parameterName, Map<String, Class<?>> map);

  void getObject(Throwable targetFailureCause, String parameterName, Map<String, Class<?>> map);

  void getBoolean(boolean targetSuccessResult, String parameterName);

  void getBoolean(Throwable targetFailureCause, String parameterName);

  void setBlob(int parameterIndex, InputStream inputStream);

  void setBlob(Throwable targetFailureCause, int parameterIndex, InputStream inputStream);

  void executeQuery(ResultSet targetSuccessResult);

  void executeQuery(Throwable targetFailureCause);

  void getBytes(byte[] targetSuccessResult, String parameterName);

  void getBytes(Throwable targetFailureCause, String parameterName);

  void getResultSet(ResultSet targetSuccessResult);

  void getResultSet(Throwable targetFailureCause);

  void getLong(long targetSuccessResult, String parameterName);

  void getLong(Throwable targetFailureCause, String parameterName);

  void registerOutParameter(String parameterName, int sqlType, String typeName);

  void registerOutParameter(Throwable targetFailureCause, String parameterName, int sqlType,
      String typeName);

  void setObject(String parameterName, Object x);

  void setObject(Throwable targetFailureCause, String parameterName, Object x);

  void setRef(int parameterIndex, Ref x);

  void setRef(Throwable targetFailureCause, int parameterIndex, Ref x);

  void registerOutParameter(String parameterName, int sqlType, int scale);

  void registerOutParameter(Throwable targetFailureCause, String parameterName, int sqlType,
      int scale);

  void setInt(String parameterName, int x);

  void setInt(Throwable targetFailureCause, String parameterName, int x);

  void setByte(int parameterIndex, byte x);

  void setByte(Throwable targetFailureCause, int parameterIndex, byte x);

  void setDate(int parameterIndex, Date x, Calendar cal);

  void setDate(Throwable targetFailureCause, int parameterIndex, Date x, Calendar cal);

  void executeQuery(ResultSet targetSuccessResult, String sql);

  void executeQuery(Throwable targetFailureCause, String sql);

  void setNClob(String parameterName, NClob value);

  void setNClob(Throwable targetFailureCause, String parameterName, NClob value);

  void setBigDecimal(String parameterName, BigDecimal x);

  void setBigDecimal(Throwable targetFailureCause, String parameterName, BigDecimal x);

  void setDate(int parameterIndex, Date x);

  void setDate(Throwable targetFailureCause, int parameterIndex, Date x);

  void setClob(int parameterIndex, Reader reader, long length);

  void setClob(Throwable targetFailureCause, int parameterIndex, Reader reader, long length);

  void getInt(int targetSuccessResult, int parameterIndex);

  void getInt(Throwable targetFailureCause, int parameterIndex);

  void getMoreResults(boolean targetSuccessResult);

  void getMoreResults(Throwable targetFailureCause);

  void getObject(Object targetSuccessResult, int parameterIndex, Map<String, Class<?>> map);

  void getObject(Throwable targetFailureCause, int parameterIndex, Map<String, Class<?>> map);

  void setObject(String parameterName, Object x, int targetSqlType);

  void setObject(Throwable targetFailureCause, String parameterName, Object x, int targetSqlType);

  void setBinaryStream(String parameterName, InputStream x, long length);

  void setBinaryStream(Throwable targetFailureCause, String parameterName, InputStream x,
      long length);

  void addBatch();

  void addBatch(Throwable targetFailureCause);

  void getArray(Array targetSuccessResult, String parameterName);

  void getArray(Throwable targetFailureCause, String parameterName);

  void getBlob(Blob targetSuccessResult, String parameterName);

  void getBlob(Throwable targetFailureCause, String parameterName);

  void setNull(String parameterName, int sqlType, String typeName);

  void setNull(Throwable targetFailureCause, String parameterName, int sqlType, String typeName);

  void setTime(int parameterIndex, Time x, Calendar cal);

  void setTime(Throwable targetFailureCause, int parameterIndex, Time x, Calendar cal);

  void setCursorName(String name);

  void setCursorName(Throwable targetFailureCause, String name);

  void setLong(String parameterName, long x);

  void setLong(Throwable targetFailureCause, String parameterName, long x);

  <T> void getObject(T targetSuccessResult, int parameterIndex, Class<T> type);

  <T> void getObject(Throwable targetFailureCause, int parameterIndex, Class<T> type);

  void setTimestamp(String parameterName, Timestamp x);

  void setTimestamp(Throwable targetFailureCause, String parameterName, Timestamp x);

  void execute(boolean targetSuccessResult);

  void execute(Throwable targetFailureCause);

  void getWarnings(SQLWarning targetSuccessResult);

  void getWarnings(Throwable targetFailureCause);

  void registerOutParameter(int parameterIndex, int sqlType);

  void registerOutParameter(Throwable targetFailureCause, int parameterIndex, int sqlType);

  void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x, SQLType targetSqlType,
      int scaleOrLength);

  void setCharacterStream(String parameterName, Reader reader, long length);

  void setCharacterStream(Throwable targetFailureCause, String parameterName, Reader reader,
      long length);

  void setSQLXML(int parameterIndex, SQLXML xmlObject);

  void setSQLXML(Throwable targetFailureCause, int parameterIndex, SQLXML xmlObject);

  void setBigDecimal(int parameterIndex, BigDecimal x);

  void setBigDecimal(Throwable targetFailureCause, int parameterIndex, BigDecimal x);

  void getMetaData(ResultSetMetaData targetSuccessResult);

  void getMetaData(Throwable targetFailureCause);

  void setObject(int parameterIndex, Object x);

  void setObject(Throwable targetFailureCause, int parameterIndex, Object x);

  void setTimestamp(int parameterIndex, Timestamp x, Calendar cal);

  void setTimestamp(Throwable targetFailureCause, int parameterIndex, Timestamp x, Calendar cal);

  void setBlob(int parameterIndex, InputStream inputStream, long length);

  void setBlob(Throwable targetFailureCause, int parameterIndex, InputStream inputStream,
      long length);

  void getFloat(float targetSuccessResult, int parameterIndex);

  void getFloat(Throwable targetFailureCause, int parameterIndex);

  void getLargeUpdateCount(long targetSuccessResult);

  void getLargeUpdateCount(Throwable targetFailureCause);

  void getResultSetHoldability(int targetSuccessResult);

  void getResultSetHoldability(Throwable targetFailureCause);

  void close();

  void close(Throwable targetFailureCause);

  ResultSetListener newResultSetListener();

  ArrayListener newArrayListener();

  RowIdListener newRowIdListener();

  ConnectionListener newConnectionListener();

  SQLXMLListener newSQLXMLListener();

  ParameterMetaDataListener newParameterMetaDataListener();

  ClobListener newClobListener();

  RefListener newRefListener();

  NClobListener newNClobListener();

  BlobListener newBlobListener();

  ResultSetMetaDataListener newResultSetMetaDataListener();
}
