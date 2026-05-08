package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Date;
import java.sql.NClob;
import java.sql.Ref;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

interface ResultSetListener {
  void first(boolean targetSuccessResult);

  void first(Throwable targetFailureCause);

  void getDate(Date targetSuccessResult, int columnIndex);

  void getDate(Throwable targetFailureCause, int columnIndex);

  void getTimestamp(Timestamp targetSuccessResult, int columnIndex, Calendar cal);

  void getTimestamp(Throwable targetFailureCause, int columnIndex, Calendar cal);

  void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength);

  void updateObject(Throwable targetFailureCause, String columnLabel, Object x,
      SQLType targetSqlType, int scaleOrLength);

  void updateBigDecimal(int columnIndex, BigDecimal x);

  void updateBigDecimal(Throwable targetFailureCause, int columnIndex, BigDecimal x);

  void updateClob(int columnIndex, Reader reader, long length);

  void updateClob(Throwable targetFailureCause, int columnIndex, Reader reader, long length);

  void getCharacterStream(Reader targetSuccessResult, int columnIndex);

  void getCharacterStream(Throwable targetFailureCause, int columnIndex);

  void updateString(String columnLabel, String x);

  void updateString(Throwable targetFailureCause, String columnLabel, String x);

  void updateDate(int columnIndex, Date x);

  void updateDate(Throwable targetFailureCause, int columnIndex, Date x);

  void getFloat(float targetSuccessResult, int columnIndex);

  void getFloat(Throwable targetFailureCause, int columnIndex);

  void getRowId(RowId targetSuccessResult, int columnIndex);

  void getRowId(Throwable targetFailureCause, int columnIndex);

  void findColumn(int targetSuccessResult, String columnLabel);

  void findColumn(Throwable targetFailureCause, String columnLabel);

  void relative(boolean targetSuccessResult, int rows);

  void relative(Throwable targetFailureCause, int rows);

  void updateFloat(String columnLabel, float x);

  void updateFloat(Throwable targetFailureCause, String columnLabel, float x);

  void updateBigDecimal(String columnLabel, BigDecimal x);

  void updateBigDecimal(Throwable targetFailureCause, String columnLabel, BigDecimal x);

  void updateTimestamp(String columnLabel, Timestamp x);

  void updateTimestamp(Throwable targetFailureCause, String columnLabel, Timestamp x);

  void previous(boolean targetSuccessResult);

  void previous(Throwable targetFailureCause);

  void updateNClob(int columnIndex, Reader reader);

  void updateNClob(Throwable targetFailureCause, int columnIndex, Reader reader);

  void updateNClob(String columnLabel, Reader reader, long length);

  void updateNClob(Throwable targetFailureCause, String columnLabel, Reader reader, long length);

  void updateBlob(String columnLabel, InputStream inputStream);

  void updateBlob(Throwable targetFailureCause, String columnLabel, InputStream inputStream);

  void getFetchDirection(int targetSuccessResult);

  void getFetchDirection(Throwable targetFailureCause);

  void updateTimestamp(int columnIndex, Timestamp x);

  void updateTimestamp(Throwable targetFailureCause, int columnIndex, Timestamp x);

  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  void updateClob(int columnIndex, Reader reader);

  void updateClob(Throwable targetFailureCause, int columnIndex, Reader reader);

  void updateObject(String columnLabel, Object x, int scaleOrLength);

  void updateObject(Throwable targetFailureCause, String columnLabel, Object x, int scaleOrLength);

  void getTimestamp(Timestamp targetSuccessResult, String columnLabel, Calendar cal);

  void getTimestamp(Throwable targetFailureCause, String columnLabel, Calendar cal);

  void updateObject(int columnIndex, Object x, SQLType targetSqlType);

  void updateObject(Throwable targetFailureCause, int columnIndex, Object x, SQLType targetSqlType);

  void updateBlob(int columnIndex, Blob x);

  void updateBlob(Throwable targetFailureCause, int columnIndex, Blob x);

  void updateNCharacterStream(String columnLabel, Reader reader);

  void updateNCharacterStream(Throwable targetFailureCause, String columnLabel, Reader reader);

  void rowInserted(boolean targetSuccessResult);

  void rowInserted(Throwable targetFailureCause);

  void cancelRowUpdates();

  void cancelRowUpdates(Throwable targetFailureCause);

  void getAsciiStream(InputStream targetSuccessResult, String columnLabel);

  void getAsciiStream(Throwable targetFailureCause, String columnLabel);

  void updateRow();

  void updateRow(Throwable targetFailureCause);

  void updateTime(String columnLabel, Time x);

  void updateTime(Throwable targetFailureCause, String columnLabel, Time x);

  void getDate(Date targetSuccessResult, String columnLabel, Calendar cal);

  void getDate(Throwable targetFailureCause, String columnLabel, Calendar cal);

  void updateBlob(int columnIndex, InputStream inputStream);

  void updateBlob(Throwable targetFailureCause, int columnIndex, InputStream inputStream);

  void getTime(Time targetSuccessResult, int columnIndex, Calendar cal);

  void getTime(Throwable targetFailureCause, int columnIndex, Calendar cal);

  void getCursorName(String targetSuccessResult);

  void getCursorName(Throwable targetFailureCause);

  void updateByte(String columnLabel, byte x);

  void updateByte(Throwable targetFailureCause, String columnLabel, byte x);

  void refreshRow();

  void refreshRow(Throwable targetFailureCause);

  void updateNCharacterStream(int columnIndex, Reader x);

  void updateNCharacterStream(Throwable targetFailureCause, int columnIndex, Reader x);

  void getStatement(Statement targetSuccessResult);

  void getStatement(Throwable targetFailureCause);

  void updateBinaryStream(String columnLabel, InputStream x);

  void updateBinaryStream(Throwable targetFailureCause, String columnLabel, InputStream x);

  void getArray(Array targetSuccessResult, int columnIndex);

  void getArray(Throwable targetFailureCause, int columnIndex);

  void updateFloat(int columnIndex, float x);

  void updateFloat(Throwable targetFailureCause, int columnIndex, float x);

  void getByte(byte targetSuccessResult, int columnIndex);

  void getByte(Throwable targetFailureCause, int columnIndex);

  void updateDouble(String columnLabel, double x);

  void updateDouble(Throwable targetFailureCause, String columnLabel, double x);

  void updateNClob(String columnLabel, Reader reader);

  void updateNClob(Throwable targetFailureCause, String columnLabel, Reader reader);

  void isFirst(boolean targetSuccessResult);

  void isFirst(Throwable targetFailureCause);

  void updateObject(String columnLabel, Object x);

  void updateObject(Throwable targetFailureCause, String columnLabel, Object x);

  void getInt(int targetSuccessResult, int columnIndex);

  void getInt(Throwable targetFailureCause, int columnIndex);

  void getTime(Time targetSuccessResult, String columnLabel, Calendar cal);

  void getTime(Throwable targetFailureCause, String columnLabel, Calendar cal);

  void getBinaryStream(InputStream targetSuccessResult, String columnLabel);

  void getBinaryStream(Throwable targetFailureCause, String columnLabel);

  void getDouble(double targetSuccessResult, String columnLabel);

  void getDouble(Throwable targetFailureCause, String columnLabel);

  void updateNClob(String columnLabel, NClob nClob);

  void updateNClob(Throwable targetFailureCause, String columnLabel, NClob nClob);

  void getTimestamp(Timestamp targetSuccessResult, int columnIndex);

  void getTimestamp(Throwable targetFailureCause, int columnIndex);

  void updateClob(String columnLabel, Clob x);

  void updateClob(Throwable targetFailureCause, String columnLabel, Clob x);

  void getBigDecimal(BigDecimal targetSuccessResult, int columnIndex, int scale);

  void getBigDecimal(Throwable targetFailureCause, int columnIndex, int scale);

  void updateString(int columnIndex, String x);

  void updateString(Throwable targetFailureCause, int columnIndex, String x);

  void updateNull(int columnIndex);

  void updateNull(Throwable targetFailureCause, int columnIndex);

  void getNString(String targetSuccessResult, String columnLabel);

  void getNString(Throwable targetFailureCause, String columnLabel);

  void getDouble(double targetSuccessResult, int columnIndex);

  void getDouble(Throwable targetFailureCause, int columnIndex);

  void wasNull(boolean targetSuccessResult);

  void wasNull(Throwable targetFailureCause);

  void getObject(Object targetSuccessResult, String columnLabel);

  void getObject(Throwable targetFailureCause, String columnLabel);

  void updateAsciiStream(String columnLabel, InputStream x, int length);

  void updateAsciiStream(Throwable targetFailureCause, String columnLabel, InputStream x,
      int length);

  void updateInt(int columnIndex, int x);

  void updateInt(Throwable targetFailureCause, int columnIndex, int x);

  void getBigDecimal(BigDecimal targetSuccessResult, String columnLabel);

  void getBigDecimal(Throwable targetFailureCause, String columnLabel);

  void updateArray(String columnLabel, Array x);

  void updateArray(Throwable targetFailureCause, String columnLabel, Array x);

  void updateObject(String columnLabel, Object x, SQLType targetSqlType);

  void updateObject(Throwable targetFailureCause, String columnLabel, Object x,
      SQLType targetSqlType);

  void beforeFirst();

  void beforeFirst(Throwable targetFailureCause);

  void updateObject(int columnIndex, Object x, int scaleOrLength);

  void updateObject(Throwable targetFailureCause, int columnIndex, Object x, int scaleOrLength);

  void moveToCurrentRow();

  void moveToCurrentRow(Throwable targetFailureCause);

  void setFetchDirection(int direction);

  void setFetchDirection(Throwable targetFailureCause, int direction);

  void close();

  void close(Throwable targetFailureCause);

  void getUnicodeStream(InputStream targetSuccessResult, int columnIndex);

  void getUnicodeStream(Throwable targetFailureCause, int columnIndex);

  void getBoolean(boolean targetSuccessResult, String columnLabel);

  void getBoolean(Throwable targetFailureCause, String columnLabel);

  void getString(String targetSuccessResult, String columnLabel);

  void getString(Throwable targetFailureCause, String columnLabel);

  void updateNString(int columnIndex, String nString);

  void updateNString(Throwable targetFailureCause, int columnIndex, String nString);

  void afterLast();

  void afterLast(Throwable targetFailureCause);

  void updateClob(String columnLabel, Reader reader, long length);

  void updateClob(Throwable targetFailureCause, String columnLabel, Reader reader, long length);

  void getRow(int targetSuccessResult);

  void getRow(Throwable targetFailureCause);

  void getBlob(Blob targetSuccessResult, int columnIndex);

  void getBlob(Throwable targetFailureCause, int columnIndex);

  void updateTime(int columnIndex, Time x);

  void updateTime(Throwable targetFailureCause, int columnIndex, Time x);

  void rowUpdated(boolean targetSuccessResult);

  void rowUpdated(Throwable targetFailureCause);

  void getString(String targetSuccessResult, int columnIndex);

  void getString(Throwable targetFailureCause, int columnIndex);

  void getType(int targetSuccessResult);

  void getType(Throwable targetFailureCause);

  void getBigDecimal(BigDecimal targetSuccessResult, int columnIndex);

  void getBigDecimal(Throwable targetFailureCause, int columnIndex);

  void updateAsciiStream(String columnLabel, InputStream x, long length);

  void updateAsciiStream(Throwable targetFailureCause, String columnLabel, InputStream x,
      long length);

  void getBytes(byte[] targetSuccessResult, String columnLabel);

  void getBytes(Throwable targetFailureCause, String columnLabel);

  void deleteRow();

  void deleteRow(Throwable targetFailureCause);

  void updateBytes(int columnIndex, byte[] x);

  void updateBytes(Throwable targetFailureCause, int columnIndex, byte[] x);

  void getFetchSize(int targetSuccessResult);

  void getFetchSize(Throwable targetFailureCause);

  void getBinaryStream(InputStream targetSuccessResult, int columnIndex);

  void getBinaryStream(Throwable targetFailureCause, int columnIndex);

  void updateBinaryStream(int columnIndex, InputStream x, int length);

  void updateBinaryStream(Throwable targetFailureCause, int columnIndex, InputStream x, int length);

  void last(boolean targetSuccessResult);

  void last(Throwable targetFailureCause);

  void getObject(Object targetSuccessResult, int columnIndex);

  void getObject(Throwable targetFailureCause, int columnIndex);

  void updateLong(String columnLabel, long x);

  void updateLong(Throwable targetFailureCause, String columnLabel, long x);

  void updateClob(int columnIndex, Clob x);

  void updateClob(Throwable targetFailureCause, int columnIndex, Clob x);

  void getSQLXML(SQLXML targetSuccessResult, String columnLabel);

  void getSQLXML(Throwable targetFailureCause, String columnLabel);

  void getMetaData(ResultSetMetaData targetSuccessResult);

  void getMetaData(Throwable targetFailureCause);

  void updateBytes(String columnLabel, byte[] x);

  void updateBytes(Throwable targetFailureCause, String columnLabel, byte[] x);

  void updateRef(int columnIndex, Ref x);

  void updateRef(Throwable targetFailureCause, int columnIndex, Ref x);

  void getDate(Date targetSuccessResult, String columnLabel);

  void getDate(Throwable targetFailureCause, String columnLabel);

  void next(boolean targetSuccessResult);

  void next(Throwable targetFailureCause);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void getAsciiStream(InputStream targetSuccessResult, int columnIndex);

  void getAsciiStream(Throwable targetFailureCause, int columnIndex);

  void isAfterLast(boolean targetSuccessResult);

  void isAfterLast(Throwable targetFailureCause);

  void getURL(URL targetSuccessResult, String columnLabel);

  void getURL(Throwable targetFailureCause, String columnLabel);

  void updateShort(String columnLabel, short x);

  void updateShort(Throwable targetFailureCause, String columnLabel, short x);

  void getHoldability(int targetSuccessResult);

  void getHoldability(Throwable targetFailureCause);

  void updateShort(int columnIndex, short x);

  void updateShort(Throwable targetFailureCause, int columnIndex, short x);

  void updateAsciiStream(int columnIndex, InputStream x, long length);

  void updateAsciiStream(Throwable targetFailureCause, int columnIndex, InputStream x, long length);

  void updateNClob(int columnIndex, Reader reader, long length);

  void updateNClob(Throwable targetFailureCause, int columnIndex, Reader reader, long length);

  void getArray(Array targetSuccessResult, String columnLabel);

  void getArray(Throwable targetFailureCause, String columnLabel);

  void getObject(Object targetSuccessResult, String columnLabel, Map<String, Class<?>> map);

  void getObject(Throwable targetFailureCause, String columnLabel, Map<String, Class<?>> map);

  void updateNull(String columnLabel);

  void updateNull(Throwable targetFailureCause, String columnLabel);

  void updateByte(int columnIndex, byte x);

  void updateByte(Throwable targetFailureCause, int columnIndex, byte x);

  void getSQLXML(SQLXML targetSuccessResult, int columnIndex);

  void getSQLXML(Throwable targetFailureCause, int columnIndex);

  void updateCharacterStream(String columnLabel, Reader reader);

  void updateCharacterStream(Throwable targetFailureCause, String columnLabel, Reader reader);

  void getLong(long targetSuccessResult, int columnIndex);

  void getLong(Throwable targetFailureCause, int columnIndex);

  void getConcurrency(int targetSuccessResult);

  void getConcurrency(Throwable targetFailureCause);

  void updateRowId(String columnLabel, RowId x);

  void updateRowId(Throwable targetFailureCause, String columnLabel, RowId x);

  <T> void getObject(T targetSuccessResult, int columnIndex, Class<T> type);

  <T> void getObject(Throwable targetFailureCause, int columnIndex, Class<T> type);

  void updateBinaryStream(int columnIndex, InputStream x);

  void updateBinaryStream(Throwable targetFailureCause, int columnIndex, InputStream x);

  void updateObject(int columnIndex, Object x);

  void updateObject(Throwable targetFailureCause, int columnIndex, Object x);

  void rowDeleted(boolean targetSuccessResult);

  void rowDeleted(Throwable targetFailureCause);

  void updateLong(int columnIndex, long x);

  void updateLong(Throwable targetFailureCause, int columnIndex, long x);

  void getBytes(byte[] targetSuccessResult, int columnIndex);

  void getBytes(Throwable targetFailureCause, int columnIndex);

  void updateArray(int columnIndex, Array x);

  void updateArray(Throwable targetFailureCause, int columnIndex, Array x);

  void getTime(Time targetSuccessResult, int columnIndex);

  void getTime(Throwable targetFailureCause, int columnIndex);

  void getNClob(NClob targetSuccessResult, String columnLabel);

  void getNClob(Throwable targetFailureCause, String columnLabel);

  void getBigDecimal(BigDecimal targetSuccessResult, String columnLabel, int scale);

  void getBigDecimal(Throwable targetFailureCause, String columnLabel, int scale);

  void getURL(URL targetSuccessResult, int columnIndex);

  void getURL(Throwable targetFailureCause, int columnIndex);

  void absolute(boolean targetSuccessResult, int row);

  void absolute(Throwable targetFailureCause, int row);

  void getDate(Date targetSuccessResult, int columnIndex, Calendar cal);

  void getDate(Throwable targetFailureCause, int columnIndex, Calendar cal);

  void updateNString(String columnLabel, String nString);

  void updateNString(Throwable targetFailureCause, String columnLabel, String nString);

  void getNString(String targetSuccessResult, int columnIndex);

  void getNString(Throwable targetFailureCause, int columnIndex);

  void getCharacterStream(Reader targetSuccessResult, String columnLabel);

  void getCharacterStream(Throwable targetFailureCause, String columnLabel);

  void getByte(byte targetSuccessResult, String columnLabel);

  void getByte(Throwable targetFailureCause, String columnLabel);

  void updateAsciiStream(String columnLabel, InputStream x);

  void updateAsciiStream(Throwable targetFailureCause, String columnLabel, InputStream x);

  void updateCharacterStream(int columnIndex, Reader x, long length);

  void updateCharacterStream(Throwable targetFailureCause, int columnIndex, Reader x, long length);

  void getClob(Clob targetSuccessResult, int columnIndex);

  void getClob(Throwable targetFailureCause, int columnIndex);

  void getRef(Ref targetSuccessResult, String columnLabel);

  void getRef(Throwable targetFailureCause, String columnLabel);

  void getObject(Object targetSuccessResult, int columnIndex, Map<String, Class<?>> map);

  void getObject(Throwable targetFailureCause, int columnIndex, Map<String, Class<?>> map);

  void isBeforeFirst(boolean targetSuccessResult);

  void isBeforeFirst(Throwable targetFailureCause);

  void updateNCharacterStream(int columnIndex, Reader x, long length);

  void updateNCharacterStream(Throwable targetFailureCause, int columnIndex, Reader x, long length);

  void updateClob(String columnLabel, Reader reader);

  void updateClob(Throwable targetFailureCause, String columnLabel, Reader reader);

  void updateBinaryStream(int columnIndex, InputStream x, long length);

  void updateBinaryStream(Throwable targetFailureCause, int columnIndex, InputStream x,
      long length);

  void isClosed(boolean targetSuccessResult);

  void isClosed(Throwable targetFailureCause);

  void updateInt(String columnLabel, int x);

  void updateInt(Throwable targetFailureCause, String columnLabel, int x);

  void getNCharacterStream(Reader targetSuccessResult, String columnLabel);

  void getNCharacterStream(Throwable targetFailureCause, String columnLabel);

  void updateBoolean(String columnLabel, boolean x);

  void updateBoolean(Throwable targetFailureCause, String columnLabel, boolean x);

  void updateBinaryStream(String columnLabel, InputStream x, long length);

  void updateBinaryStream(Throwable targetFailureCause, String columnLabel, InputStream x,
      long length);

  void getBoolean(boolean targetSuccessResult, int columnIndex);

  void getBoolean(Throwable targetFailureCause, int columnIndex);

  void updateCharacterStream(int columnIndex, Reader x, int length);

  void updateCharacterStream(Throwable targetFailureCause, int columnIndex, Reader x, int length);

  void updateBlob(int columnIndex, InputStream inputStream, long length);

  void updateBlob(Throwable targetFailureCause, int columnIndex, InputStream inputStream,
      long length);

  void updateDouble(int columnIndex, double x);

  void updateDouble(Throwable targetFailureCause, int columnIndex, double x);

  void updateRef(String columnLabel, Ref x);

  void updateRef(Throwable targetFailureCause, String columnLabel, Ref x);

  void updateCharacterStream(String columnLabel, Reader reader, int length);

  void updateCharacterStream(Throwable targetFailureCause, String columnLabel, Reader reader,
      int length);

  void getShort(short targetSuccessResult, int columnIndex);

  void getShort(Throwable targetFailureCause, int columnIndex);

  void getUnicodeStream(InputStream targetSuccessResult, String columnLabel);

  void getUnicodeStream(Throwable targetFailureCause, String columnLabel);

  void getLong(long targetSuccessResult, String columnLabel);

  void getLong(Throwable targetFailureCause, String columnLabel);

  void getNClob(NClob targetSuccessResult, int columnIndex);

  void getNClob(Throwable targetFailureCause, int columnIndex);

  void updateDate(String columnLabel, Date x);

  void updateDate(Throwable targetFailureCause, String columnLabel, Date x);

  void getBlob(Blob targetSuccessResult, String columnLabel);

  void getBlob(Throwable targetFailureCause, String columnLabel);

  void isLast(boolean targetSuccessResult);

  void isLast(Throwable targetFailureCause);

  void setFetchSize(int rows);

  void setFetchSize(Throwable targetFailureCause, int rows);

  void getRowId(RowId targetSuccessResult, String columnLabel);

  void getRowId(Throwable targetFailureCause, String columnLabel);

  void updateCharacterStream(int columnIndex, Reader x);

  void updateCharacterStream(Throwable targetFailureCause, int columnIndex, Reader x);

  void getTimestamp(Timestamp targetSuccessResult, String columnLabel);

  void getTimestamp(Throwable targetFailureCause, String columnLabel);

  <T> void getObject(T targetSuccessResult, String columnLabel, Class<T> type);

  <T> void getObject(Throwable targetFailureCause, String columnLabel, Class<T> type);

  void clearWarnings();

  void clearWarnings(Throwable targetFailureCause);

  void getRef(Ref targetSuccessResult, int columnIndex);

  void getRef(Throwable targetFailureCause, int columnIndex);

  void getClob(Clob targetSuccessResult, String columnLabel);

  void getClob(Throwable targetFailureCause, String columnLabel);

  void getFloat(float targetSuccessResult, String columnLabel);

  void getFloat(Throwable targetFailureCause, String columnLabel);

  void getShort(short targetSuccessResult, String columnLabel);

  void getShort(Throwable targetFailureCause, String columnLabel);

  void getNCharacterStream(Reader targetSuccessResult, int columnIndex);

  void getNCharacterStream(Throwable targetFailureCause, int columnIndex);

  void moveToInsertRow();

  void moveToInsertRow(Throwable targetFailureCause);

  void updateSQLXML(String columnLabel, SQLXML xmlObject);

  void updateSQLXML(Throwable targetFailureCause, String columnLabel, SQLXML xmlObject);

  void updateNCharacterStream(String columnLabel, Reader reader, long length);

  void updateNCharacterStream(Throwable targetFailureCause, String columnLabel, Reader reader,
      long length);

  void updateSQLXML(int columnIndex, SQLXML xmlObject);

  void updateSQLXML(Throwable targetFailureCause, int columnIndex, SQLXML xmlObject);

  void insertRow();

  void insertRow(Throwable targetFailureCause);

  void updateBlob(String columnLabel, Blob x);

  void updateBlob(Throwable targetFailureCause, String columnLabel, Blob x);

  void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength);

  void updateObject(Throwable targetFailureCause, int columnIndex, Object x, SQLType targetSqlType,
      int scaleOrLength);

  void getInt(int targetSuccessResult, String columnLabel);

  void getInt(Throwable targetFailureCause, String columnLabel);

  void updateNClob(int columnIndex, NClob nClob);

  void updateNClob(Throwable targetFailureCause, int columnIndex, NClob nClob);

  void updateRowId(int columnIndex, RowId x);

  void updateRowId(Throwable targetFailureCause, int columnIndex, RowId x);

  void updateBinaryStream(String columnLabel, InputStream x, int length);

  void updateBinaryStream(Throwable targetFailureCause, String columnLabel, InputStream x,
      int length);

  void updateBoolean(int columnIndex, boolean x);

  void updateBoolean(Throwable targetFailureCause, int columnIndex, boolean x);

  void getWarnings(SQLWarning targetSuccessResult);

  void getWarnings(Throwable targetFailureCause);

  void updateAsciiStream(int columnIndex, InputStream x);

  void updateAsciiStream(Throwable targetFailureCause, int columnIndex, InputStream x);

  void getTime(Time targetSuccessResult, String columnLabel);

  void getTime(Throwable targetFailureCause, String columnLabel);

  void updateCharacterStream(String columnLabel, Reader reader, long length);

  void updateCharacterStream(Throwable targetFailureCause, String columnLabel, Reader reader,
      long length);

  void updateBlob(String columnLabel, InputStream inputStream, long length);

  void updateBlob(Throwable targetFailureCause, String columnLabel, InputStream inputStream,
      long length);

  void updateAsciiStream(int columnIndex, InputStream x, int length);

  void updateAsciiStream(Throwable targetFailureCause, int columnIndex, InputStream x, int length);

  RowIdListener newRowIdListener();

  StatementListener newStatementListener();

  ArrayListener newArrayListener();

  BlobListener newBlobListener();

  SQLXMLListener newSQLXMLListener();

  ResultSetMetaDataListener newResultSetMetaDataListener();

  NClobListener newNClobListener();

  ClobListener newClobListener();

  RefListener newRefListener();
}
