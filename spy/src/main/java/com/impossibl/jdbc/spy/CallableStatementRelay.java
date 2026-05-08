package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.NClob;
import java.sql.ParameterMetaData;
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
import java.util.Map;

public class CallableStatementRelay implements Relay<CallableStatement>, CallableStatement {
  public CallableStatement target;

  public CallableStatementListener listener;

  public CallableStatementRelay(CallableStatement target, CallableStatementListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public CallableStatement getTarget() {
    return target;
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

  public Timestamp getTimestamp(String parameterName) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(parameterName);
      this.listener.getTimestamp(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public void setDouble(String parameterName, double x) throws SQLException {
    try {
      this.target.setDouble(parameterName, x);
      this.listener.setDouble(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setDouble(targetFailureCause, parameterName, x);
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

  public void setAsciiStream(String parameterName, InputStream x, int length) throws SQLException {
    try {
      this.target.setAsciiStream(parameterName, x, length);
      this.listener.setAsciiStream(parameterName, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, parameterName, x, length);
      throw targetFailureCause;

    }
  }

  public void setTime(String parameterName, Time x) throws SQLException {
    try {
      this.target.setTime(parameterName, x);
      this.listener.setTime(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTime(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public float getFloat(String parameterName) throws SQLException {
    try {
      float targetSuccessResult = this.target.getFloat(parameterName);
      this.listener.getFloat(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFloat(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public void setObject(String parameterName, Object x, SQLType targetSqlType) throws SQLException {
    try {
      this.target.setObject(parameterName, x, targetSqlType);
      this.listener.setObject(parameterName, x, targetSqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterName, x, targetSqlType);
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

  public void setClob(String parameterName, Clob x) throws SQLException {
    try {
      this.target.setClob(parameterName, x);
      this.listener.setClob(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setClob(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public void registerOutParameter(int parameterIndex, SQLType sqlType) throws SQLException {
    try {
      this.target.registerOutParameter(parameterIndex, sqlType);
      this.listener.registerOutParameter(parameterIndex, sqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterIndex, sqlType);
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

  public void setByte(String parameterName, byte x) throws SQLException {
    try {
      this.target.setByte(parameterName, x);
      this.listener.setByte(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setByte(targetFailureCause, parameterName, x);
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

  public void setNString(String parameterName, String value) throws SQLException {
    try {
      this.target.setNString(parameterName, value);
      this.listener.setNString(parameterName, value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNString(targetFailureCause, parameterName, value);
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

  public void setDate(String parameterName, Date x) throws SQLException {
    try {
      this.target.setDate(parameterName, x);
      this.listener.setDate(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setDate(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public String getString(int parameterIndex) throws SQLException {
    try {
      String targetSuccessResult = this.target.getString(parameterIndex);
      this.listener.getString(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getString(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void setTimestamp(String parameterName, Timestamp x, Calendar cal) throws SQLException {
    try {
      this.target.setTimestamp(parameterName, x, cal);
      this.listener.setTimestamp(parameterName, x, cal);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTimestamp(targetFailureCause, parameterName, x, cal);
      throw targetFailureCause;

    }
  }

  public Date getDate(String parameterName) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(parameterName);
      this.listener.getDate(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public Time getTime(String parameterName, Calendar cal) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(parameterName, cal);
      this.listener.getTime(targetSuccessResult, parameterName, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, parameterName, cal);
      throw targetFailureCause;

    }
  }

  public Reader getNCharacterStream(String parameterName) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getNCharacterStream(parameterName);
      this.listener.getNCharacterStream(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNCharacterStream(targetFailureCause, parameterName);
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

  public BigDecimal getBigDecimal(String parameterName) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(parameterName);
      this.listener.getBigDecimal(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, parameterName);
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

  public void registerOutParameter(int parameterIndex, SQLType sqlType, String typeName) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterIndex, sqlType, typeName);
      this.listener.registerOutParameter(parameterIndex, sqlType, typeName);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterIndex, sqlType, typeName);
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

  public void setBlob(String parameterName, Blob x) throws SQLException {
    try {
      this.target.setBlob(parameterName, x);
      this.listener.setBlob(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBlob(targetFailureCause, parameterName, x);
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

  public void setNCharacterStream(String parameterName, Reader value, long length) throws
      SQLException {
    try {
      this.target.setNCharacterStream(parameterName, value, length);
      this.listener.setNCharacterStream(parameterName, value, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNCharacterStream(targetFailureCause, parameterName, value, length);
      throw targetFailureCause;

    }
  }

  public Reader getCharacterStream(int parameterIndex) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getCharacterStream(parameterIndex);
      this.listener.getCharacterStream(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCharacterStream(targetFailureCause, parameterIndex);
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

  public void setBlob(String parameterName, InputStream inputStream, long length) throws
      SQLException {
    try {
      this.target.setBlob(parameterName, inputStream, length);
      this.listener.setBlob(parameterName, inputStream, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBlob(targetFailureCause, parameterName, inputStream, length);
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

  public int getInt(String parameterName) throws SQLException {
    try {
      int targetSuccessResult = this.target.getInt(parameterName);
      this.listener.getInt(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getInt(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public void setRowId(String parameterName, RowId x) throws SQLException {
    try {
      this.target.setRowId(parameterName, x);
      this.listener.setRowId(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setRowId(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public void setFloat(String parameterName, float x) throws SQLException {
    try {
      this.target.setFloat(parameterName, x);
      this.listener.setFloat(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setFloat(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public void setSQLXML(String parameterName, SQLXML xmlObject) throws SQLException {
    try {
      this.target.setSQLXML(parameterName, xmlObject);
      this.listener.setSQLXML(parameterName, xmlObject);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setSQLXML(targetFailureCause, parameterName, xmlObject);
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

  public void setCharacterStream(String parameterName, Reader reader) throws SQLException {
    try {
      this.target.setCharacterStream(parameterName, reader);
      this.listener.setCharacterStream(parameterName, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, parameterName, reader);
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

  public short getShort(int parameterIndex) throws SQLException {
    try {
      short targetSuccessResult = this.target.getShort(parameterIndex);
      this.listener.getShort(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getShort(targetFailureCause, parameterIndex);
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

  public void setURL(String parameterName, URL val) throws SQLException {
    try {
      this.target.setURL(parameterName, val);
      this.listener.setURL(parameterName, val);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setURL(targetFailureCause, parameterName, val);
      throw targetFailureCause;

    }
  }

  public byte[] getBytes(int parameterIndex) throws SQLException {
    try {
      byte[] targetSuccessResult = this.target.getBytes(parameterIndex);
      this.listener.getBytes(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBytes(targetFailureCause, parameterIndex);
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

  public void setNCharacterStream(String parameterName, Reader value) throws SQLException {
    try {
      this.target.setNCharacterStream(parameterName, value);
      this.listener.setNCharacterStream(parameterName, value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNCharacterStream(targetFailureCause, parameterName, value);
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

  public Array getArray(int parameterIndex) throws SQLException {
    try {
      Array targetSuccessResult = this.target.getArray(parameterIndex);
      this.listener.getArray(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new ArrayRelay(targetSuccessResult, this.listener.newArrayListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public RowId getRowId(String parameterName) throws SQLException {
    try {
      RowId targetSuccessResult = this.target.getRowId(parameterName);
      this.listener.getRowId(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new RowIdRelay(targetSuccessResult, this.listener.newRowIdListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRowId(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public double getDouble(int parameterIndex) throws SQLException {
    try {
      double targetSuccessResult = this.target.getDouble(parameterIndex);
      this.listener.getDouble(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDouble(targetFailureCause, parameterIndex);
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

  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(int parameterIndex, int scale) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(parameterIndex, scale);
      this.listener.getBigDecimal(targetSuccessResult, parameterIndex, scale);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, parameterIndex, scale);
      throw targetFailureCause;

    }
  }

  public void registerOutParameter(String parameterName, SQLType sqlType, int scale) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterName, sqlType, scale);
      this.listener.registerOutParameter(parameterName, sqlType, scale);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterName, sqlType, scale);
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

  public Object getObject(String parameterName) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(parameterName);
      this.listener.getObject(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, parameterName);
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

  public String getNString(String parameterName) throws SQLException {
    try {
      String targetSuccessResult = this.target.getNString(parameterName);
      this.listener.getNString(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNString(targetFailureCause, parameterName);
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

  public Time getTime(String parameterName) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(parameterName);
      this.listener.getTime(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, parameterName);
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

  public <T> T getObject(String parameterName, Class<T> type) throws SQLException {
    try {
      T targetSuccessResult = this.target.getObject(parameterName, type);
      this.listener.getObject(targetSuccessResult, parameterName, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, parameterName, type);
      throw targetFailureCause;

    }
  }

  public void setTime(String parameterName, Time x, Calendar cal) throws SQLException {
    try {
      this.target.setTime(parameterName, x, cal);
      this.listener.setTime(parameterName, x, cal);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTime(targetFailureCause, parameterName, x, cal);
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

  public void setBinaryStream(String parameterName, InputStream x, int length) throws SQLException {
    try {
      this.target.setBinaryStream(parameterName, x, length);
      this.listener.setBinaryStream(parameterName, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, parameterName, x, length);
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

  public void setObject(String parameterName, Object x, SQLType targetSqlType, int scaleOrLength)
      throws SQLException {
    try {
      this.target.setObject(parameterName, x, targetSqlType, scaleOrLength);
      this.listener.setObject(parameterName, x, targetSqlType, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterName, x, targetSqlType, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public byte getByte(String parameterName) throws SQLException {
    try {
      byte targetSuccessResult = this.target.getByte(parameterName);
      this.listener.getByte(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getByte(targetFailureCause, parameterName);
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

  public void registerOutParameter(int parameterIndex, int sqlType, int scale) throws SQLException {
    try {
      this.target.registerOutParameter(parameterIndex, sqlType, scale);
      this.listener.registerOutParameter(parameterIndex, sqlType, scale);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterIndex, sqlType, scale);
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

  public SQLXML getSQLXML(int parameterIndex) throws SQLException {
    try {
      SQLXML targetSuccessResult = this.target.getSQLXML(parameterIndex);
      this.listener.getSQLXML(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new SQLXMLRelay(targetSuccessResult, this.listener.newSQLXMLListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLXML(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void setShort(String parameterName, short x) throws SQLException {
    try {
      this.target.setShort(parameterName, x);
      this.listener.setShort(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setShort(targetFailureCause, parameterName, x);
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

  public void setNull(String parameterName, int sqlType) throws SQLException {
    try {
      this.target.setNull(parameterName, sqlType);
      this.listener.setNull(parameterName, sqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNull(targetFailureCause, parameterName, sqlType);
      throw targetFailureCause;

    }
  }

  public short getShort(String parameterName) throws SQLException {
    try {
      short targetSuccessResult = this.target.getShort(parameterName);
      this.listener.getShort(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getShort(targetFailureCause, parameterName);
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

  public String getString(String parameterName) throws SQLException {
    try {
      String targetSuccessResult = this.target.getString(parameterName);
      this.listener.getString(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getString(targetFailureCause, parameterName);
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

  public Date getDate(int parameterIndex) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(parameterIndex);
      this.listener.getDate(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public BigDecimal getBigDecimal(int parameterIndex) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(parameterIndex);
      this.listener.getBigDecimal(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, parameterIndex);
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

  public void setCharacterStream(String parameterName, Reader reader, int length) throws
      SQLException {
    try {
      this.target.setCharacterStream(parameterName, reader, length);
      this.listener.setCharacterStream(parameterName, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, parameterName, reader, length);
      throw targetFailureCause;

    }
  }

  public boolean wasNull() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.wasNull();
      this.listener.wasNull(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.wasNull(targetFailureCause);
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

  public Time getTime(int parameterIndex, Calendar cal) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(parameterIndex, cal);
      this.listener.getTime(targetSuccessResult, parameterIndex, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, parameterIndex, cal);
      throw targetFailureCause;

    }
  }

  public void setAsciiStream(String parameterName, InputStream x) throws SQLException {
    try {
      this.target.setAsciiStream(parameterName, x);
      this.listener.setAsciiStream(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, parameterName, x);
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

  public void registerOutParameter(String parameterName, SQLType sqlType) throws SQLException {
    try {
      this.target.registerOutParameter(parameterName, sqlType);
      this.listener.registerOutParameter(parameterName, sqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterName, sqlType);
      throw targetFailureCause;

    }
  }

  public Clob getClob(int parameterIndex) throws SQLException {
    try {
      Clob targetSuccessResult = this.target.getClob(parameterIndex);
      this.listener.getClob(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new ClobRelay(targetSuccessResult, this.listener.newClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClob(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void registerOutParameter(int parameterIndex, int sqlType, String typeName) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterIndex, sqlType, typeName);
      this.listener.registerOutParameter(parameterIndex, sqlType, typeName);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterIndex, sqlType, typeName);
      throw targetFailureCause;

    }
  }

  public long getLong(int parameterIndex) throws SQLException {
    try {
      long targetSuccessResult = this.target.getLong(parameterIndex);
      this.listener.getLong(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLong(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void setBoolean(String parameterName, boolean x) throws SQLException {
    try {
      this.target.setBoolean(parameterName, x);
      this.listener.setBoolean(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBoolean(targetFailureCause, parameterName, x);
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

  public void setBlob(String parameterName, InputStream inputStream) throws SQLException {
    try {
      this.target.setBlob(parameterName, inputStream);
      this.listener.setBlob(parameterName, inputStream);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBlob(targetFailureCause, parameterName, inputStream);
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

  public double getDouble(String parameterName) throws SQLException {
    try {
      double targetSuccessResult = this.target.getDouble(parameterName);
      this.listener.getDouble(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDouble(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public Ref getRef(int parameterIndex) throws SQLException {
    try {
      Ref targetSuccessResult = this.target.getRef(parameterIndex);
      this.listener.getRef(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new RefRelay(targetSuccessResult, this.listener.newRefListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRef(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void setClob(String parameterName, Reader reader) throws SQLException {
    try {
      this.target.setClob(parameterName, reader);
      this.listener.setClob(parameterName, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setClob(targetFailureCause, parameterName, reader);
      throw targetFailureCause;

    }
  }

  public String getNString(int parameterIndex) throws SQLException {
    try {
      String targetSuccessResult = this.target.getNString(parameterIndex);
      this.listener.getNString(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNString(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public byte getByte(int parameterIndex) throws SQLException {
    try {
      byte targetSuccessResult = this.target.getByte(parameterIndex);
      this.listener.getByte(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getByte(targetFailureCause, parameterIndex);
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

  public void setClob(String parameterName, Reader reader, long length) throws SQLException {
    try {
      this.target.setClob(parameterName, reader, length);
      this.listener.setClob(parameterName, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setClob(targetFailureCause, parameterName, reader, length);
      throw targetFailureCause;

    }
  }

  public void setDate(String parameterName, Date x, Calendar cal) throws SQLException {
    try {
      this.target.setDate(parameterName, x, cal);
      this.listener.setDate(parameterName, x, cal);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setDate(targetFailureCause, parameterName, x, cal);
      throw targetFailureCause;

    }
  }

  public void setBytes(String parameterName, byte[] x) throws SQLException {
    try {
      this.target.setBytes(parameterName, x);
      this.listener.setBytes(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBytes(targetFailureCause, parameterName, x);
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

  public void setAsciiStream(String parameterName, InputStream x, long length) throws SQLException {
    try {
      this.target.setAsciiStream(parameterName, x, length);
      this.listener.setAsciiStream(parameterName, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, parameterName, x, length);
      throw targetFailureCause;

    }
  }

  public Object getObject(int parameterIndex) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(parameterIndex);
      this.listener.getObject(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void registerOutParameter(String parameterName, int sqlType) throws SQLException {
    try {
      this.target.registerOutParameter(parameterName, sqlType);
      this.listener.registerOutParameter(parameterName, sqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterName, sqlType);
      throw targetFailureCause;

    }
  }

  public Timestamp getTimestamp(int parameterIndex) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(parameterIndex);
      this.listener.getTimestamp(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void setString(String parameterName, String x) throws SQLException {
    try {
      this.target.setString(parameterName, x);
      this.listener.setString(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setString(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public Reader getCharacterStream(String parameterName) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getCharacterStream(parameterName);
      this.listener.getCharacterStream(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCharacterStream(targetFailureCause, parameterName);
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

  public SQLXML getSQLXML(String parameterName) throws SQLException {
    try {
      SQLXML targetSuccessResult = this.target.getSQLXML(parameterName);
      this.listener.getSQLXML(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new SQLXMLRelay(targetSuccessResult, this.listener.newSQLXMLListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLXML(targetFailureCause, parameterName);
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

  public Timestamp getTimestamp(int parameterIndex, Calendar cal) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(parameterIndex, cal);
      this.listener.getTimestamp(targetSuccessResult, parameterIndex, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, parameterIndex, cal);
      throw targetFailureCause;

    }
  }

  public URL getURL(int parameterIndex) throws SQLException {
    try {
      URL targetSuccessResult = this.target.getURL(parameterIndex);
      this.listener.getURL(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getURL(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public Date getDate(String parameterName, Calendar cal) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(parameterName, cal);
      this.listener.getDate(targetSuccessResult, parameterName, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, parameterName, cal);
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

  public void registerOutParameter(String parameterName, SQLType sqlType, String typeName) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterName, sqlType, typeName);
      this.listener.registerOutParameter(parameterName, sqlType, typeName);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterName, sqlType, typeName);
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

  public NClob getNClob(int parameterIndex) throws SQLException {
    try {
      NClob targetSuccessResult = this.target.getNClob(parameterIndex);
      this.listener.getNClob(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new NClobRelay(targetSuccessResult, this.listener.newNClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNClob(targetFailureCause, parameterIndex);
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

  public Ref getRef(String parameterName) throws SQLException {
    try {
      Ref targetSuccessResult = this.target.getRef(parameterName);
      this.listener.getRef(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new RefRelay(targetSuccessResult, this.listener.newRefListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRef(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public Timestamp getTimestamp(String parameterName, Calendar cal) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(parameterName, cal);
      this.listener.getTimestamp(targetSuccessResult, parameterName, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, parameterName, cal);
      throw targetFailureCause;

    }
  }

  public URL getURL(String parameterName) throws SQLException {
    try {
      URL targetSuccessResult = this.target.getURL(parameterName);
      this.listener.getURL(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getURL(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public Clob getClob(String parameterName) throws SQLException {
    try {
      Clob targetSuccessResult = this.target.getClob(parameterName);
      this.listener.getClob(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new ClobRelay(targetSuccessResult, this.listener.newClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClob(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public Blob getBlob(int parameterIndex) throws SQLException {
    try {
      Blob targetSuccessResult = this.target.getBlob(parameterIndex);
      this.listener.getBlob(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new BlobRelay(targetSuccessResult, this.listener.newBlobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBlob(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public Reader getNCharacterStream(int parameterIndex) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getNCharacterStream(parameterIndex);
      this.listener.getNCharacterStream(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNCharacterStream(targetFailureCause, parameterIndex);
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

  public Time getTime(int parameterIndex) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(parameterIndex);
      this.listener.getTime(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public void setObject(String parameterName, Object x, int targetSqlType, int scale) throws
      SQLException {
    try {
      this.target.setObject(parameterName, x, targetSqlType, scale);
      this.listener.setObject(parameterName, x, targetSqlType, scale);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterName, x, targetSqlType, scale);
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

  public void setNClob(String parameterName, Reader reader) throws SQLException {
    try {
      this.target.setNClob(parameterName, reader);
      this.listener.setNClob(parameterName, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNClob(targetFailureCause, parameterName, reader);
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

  public void setNClob(String parameterName, Reader reader, long length) throws SQLException {
    try {
      this.target.setNClob(parameterName, reader, length);
      this.listener.setNClob(parameterName, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNClob(targetFailureCause, parameterName, reader, length);
      throw targetFailureCause;

    }
  }

  public void registerOutParameter(int parameterIndex, SQLType sqlType, int scale) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterIndex, sqlType, scale);
      this.listener.registerOutParameter(parameterIndex, sqlType, scale);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterIndex, sqlType, scale);
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

  public boolean getBoolean(int parameterIndex) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getBoolean(parameterIndex);
      this.listener.getBoolean(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBoolean(targetFailureCause, parameterIndex);
      throw targetFailureCause;

    }
  }

  public NClob getNClob(String parameterName) throws SQLException {
    try {
      NClob targetSuccessResult = this.target.getNClob(parameterName);
      this.listener.getNClob(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new NClobRelay(targetSuccessResult, this.listener.newNClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNClob(targetFailureCause, parameterName);
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

  public RowId getRowId(int parameterIndex) throws SQLException {
    try {
      RowId targetSuccessResult = this.target.getRowId(parameterIndex);
      this.listener.getRowId(targetSuccessResult, parameterIndex);
      targetSuccessResult = targetSuccessResult != null ? new RowIdRelay(targetSuccessResult, this.listener.newRowIdListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRowId(targetFailureCause, parameterIndex);
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

  public Date getDate(int parameterIndex, Calendar cal) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(parameterIndex, cal);
      this.listener.getDate(targetSuccessResult, parameterIndex, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, parameterIndex, cal);
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

  public void setBinaryStream(String parameterName, InputStream x) throws SQLException {
    try {
      this.target.setBinaryStream(parameterName, x);
      this.listener.setBinaryStream(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public Object getObject(String parameterName, Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(parameterName, map);
      this.listener.getObject(targetSuccessResult, parameterName, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, parameterName, map);
      throw targetFailureCause;

    }
  }

  public boolean getBoolean(String parameterName) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getBoolean(parameterName);
      this.listener.getBoolean(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBoolean(targetFailureCause, parameterName);
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

  public byte[] getBytes(String parameterName) throws SQLException {
    try {
      byte[] targetSuccessResult = this.target.getBytes(parameterName);
      this.listener.getBytes(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBytes(targetFailureCause, parameterName);
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

  public long getLong(String parameterName) throws SQLException {
    try {
      long targetSuccessResult = this.target.getLong(parameterName);
      this.listener.getLong(targetSuccessResult, parameterName);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLong(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public void registerOutParameter(String parameterName, int sqlType, String typeName) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterName, sqlType, typeName);
      this.listener.registerOutParameter(parameterName, sqlType, typeName);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterName, sqlType, typeName);
      throw targetFailureCause;

    }
  }

  public void setObject(String parameterName, Object x) throws SQLException {
    try {
      this.target.setObject(parameterName, x);
      this.listener.setObject(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterName, x);
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

  public void registerOutParameter(String parameterName, int sqlType, int scale) throws
      SQLException {
    try {
      this.target.registerOutParameter(parameterName, sqlType, scale);
      this.listener.registerOutParameter(parameterName, sqlType, scale);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterName, sqlType, scale);
      throw targetFailureCause;

    }
  }

  public void setInt(String parameterName, int x) throws SQLException {
    try {
      this.target.setInt(parameterName, x);
      this.listener.setInt(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setInt(targetFailureCause, parameterName, x);
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

  public void setNClob(String parameterName, NClob value) throws SQLException {
    try {
      this.target.setNClob(parameterName, value);
      this.listener.setNClob(parameterName, value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNClob(targetFailureCause, parameterName, value);
      throw targetFailureCause;

    }
  }

  public void setBigDecimal(String parameterName, BigDecimal x) throws SQLException {
    try {
      this.target.setBigDecimal(parameterName, x);
      this.listener.setBigDecimal(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBigDecimal(targetFailureCause, parameterName, x);
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

  public int getInt(int parameterIndex) throws SQLException {
    try {
      int targetSuccessResult = this.target.getInt(parameterIndex);
      this.listener.getInt(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getInt(targetFailureCause, parameterIndex);
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

  public Object getObject(int parameterIndex, Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(parameterIndex, map);
      this.listener.getObject(targetSuccessResult, parameterIndex, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, parameterIndex, map);
      throw targetFailureCause;

    }
  }

  public void setObject(String parameterName, Object x, int targetSqlType) throws SQLException {
    try {
      this.target.setObject(parameterName, x, targetSqlType);
      this.listener.setObject(parameterName, x, targetSqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, parameterName, x, targetSqlType);
      throw targetFailureCause;

    }
  }

  public void setBinaryStream(String parameterName, InputStream x, long length) throws
      SQLException {
    try {
      this.target.setBinaryStream(parameterName, x, length);
      this.listener.setBinaryStream(parameterName, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, parameterName, x, length);
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

  public Array getArray(String parameterName) throws SQLException {
    try {
      Array targetSuccessResult = this.target.getArray(parameterName);
      this.listener.getArray(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new ArrayRelay(targetSuccessResult, this.listener.newArrayListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public Blob getBlob(String parameterName) throws SQLException {
    try {
      Blob targetSuccessResult = this.target.getBlob(parameterName);
      this.listener.getBlob(targetSuccessResult, parameterName);
      targetSuccessResult = targetSuccessResult != null ? new BlobRelay(targetSuccessResult, this.listener.newBlobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBlob(targetFailureCause, parameterName);
      throw targetFailureCause;

    }
  }

  public void setNull(String parameterName, int sqlType, String typeName) throws SQLException {
    try {
      this.target.setNull(parameterName, sqlType, typeName);
      this.listener.setNull(parameterName, sqlType, typeName);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNull(targetFailureCause, parameterName, sqlType, typeName);
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

  public void setLong(String parameterName, long x) throws SQLException {
    try {
      this.target.setLong(parameterName, x);
      this.listener.setLong(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setLong(targetFailureCause, parameterName, x);
      throw targetFailureCause;

    }
  }

  public <T> T getObject(int parameterIndex, Class<T> type) throws SQLException {
    try {
      T targetSuccessResult = this.target.getObject(parameterIndex, type);
      this.listener.getObject(targetSuccessResult, parameterIndex, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, parameterIndex, type);
      throw targetFailureCause;

    }
  }

  public void setTimestamp(String parameterName, Timestamp x) throws SQLException {
    try {
      this.target.setTimestamp(parameterName, x);
      this.listener.setTimestamp(parameterName, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTimestamp(targetFailureCause, parameterName, x);
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

  public void registerOutParameter(int parameterIndex, int sqlType) throws SQLException {
    try {
      this.target.registerOutParameter(parameterIndex, sqlType);
      this.listener.registerOutParameter(parameterIndex, sqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.registerOutParameter(targetFailureCause, parameterIndex, sqlType);
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

  public void setCharacterStream(String parameterName, Reader reader, long length) throws
      SQLException {
    try {
      this.target.setCharacterStream(parameterName, reader, length);
      this.listener.setCharacterStream(parameterName, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, parameterName, reader, length);
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

  public float getFloat(int parameterIndex) throws SQLException {
    try {
      float targetSuccessResult = this.target.getFloat(parameterIndex);
      this.listener.getFloat(targetSuccessResult, parameterIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFloat(targetFailureCause, parameterIndex);
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
}
