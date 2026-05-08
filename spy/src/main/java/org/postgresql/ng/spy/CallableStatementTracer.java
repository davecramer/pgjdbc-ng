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

public class CallableStatementTracer implements CallableStatementListener {
  TraceOutput out;

  public CallableStatementTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void setNull(int parameterIndex, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void setNull(Throwable cause, int parameterIndex, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void getGeneratedKeys(ResultSet result) {
    trace(new Trace.Builder("CallableStatement", "getGeneratedKeys")
        .returned(result)
        .build());
  }

  public void getGeneratedKeys(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getGeneratedKeys")
        .threw(cause)
        .build());
  }

  public void setTime(int parameterIndex, Time x) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setTime(Throwable cause, int parameterIndex, Time x) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setLong(int parameterIndex, long x) {
    trace(new Trace.Builder("CallableStatement", "setLong")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setLong(Throwable cause, int parameterIndex, long x) {
    trace(new Trace.Builder("CallableStatement", "setLong")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setFetchSize(int rows) {
    trace(new Trace.Builder("CallableStatement", "setFetchSize")
        .withParameter("rows", rows)
        .returned()
        .build());
  }

  public void setFetchSize(Throwable cause, int rows) {
    trace(new Trace.Builder("CallableStatement", "setFetchSize")
        .withParameter("rows", rows)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setDouble(String parameterName, double x) {
    trace(new Trace.Builder("CallableStatement", "setDouble")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setDouble(Throwable cause, String parameterName, double x) {
    trace(new Trace.Builder("CallableStatement", "setDouble")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getResultSetType(int result) {
    trace(new Trace.Builder("CallableStatement", "getResultSetType")
        .returned(result)
        .build());
  }

  public void getResultSetType(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getResultSetType")
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(String parameterName, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, String parameterName, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setTime(String parameterName, Time x) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setTime(Throwable cause, String parameterName, Time x) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getFloat(float result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getFloat")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getFloat(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getFloat")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setObject(String parameterName, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, String parameterName, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(int parameterIndex, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, int parameterIndex, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setClob(String parameterName, Clob x) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, String parameterName, Clob x) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(int parameterIndex, SQLType sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, int parameterIndex, SQLType sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void setNClob(int parameterIndex, NClob value) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, int parameterIndex, NClob value) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void setByte(String parameterName, byte x) {
    trace(new Trace.Builder("CallableStatement", "setByte")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setByte(Throwable cause, String parameterName, byte x) {
    trace(new Trace.Builder("CallableStatement", "setByte")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setArray(int parameterIndex, Array x) {
    trace(new Trace.Builder("CallableStatement", "setArray")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setArray(Throwable cause, int parameterIndex, Array x) {
    trace(new Trace.Builder("CallableStatement", "setArray")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void cancel() {
    trace(new Trace.Builder("CallableStatement", "cancel")
        .returned()
        .build());
  }

  public void cancel(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "cancel")
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("CallableStatement", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("CallableStatement", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void setNString(String parameterName, String value) {
    trace(new Trace.Builder("CallableStatement", "setNString")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNString(Throwable cause, String parameterName, String value) {
    trace(new Trace.Builder("CallableStatement", "setNString")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void setString(int parameterIndex, String x) {
    trace(new Trace.Builder("CallableStatement", "setString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setString(Throwable cause, int parameterIndex, String x) {
    trace(new Trace.Builder("CallableStatement", "setString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setDate(String parameterName, Date x) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setDate(Throwable cause, String parameterName, Date x) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getString(String result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getString")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getString(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getString")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setTimestamp(String parameterName, Timestamp x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setTimestamp(Throwable cause, String parameterName, Timestamp x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, String parameterName, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterName", parameterName)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, String parameterName, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterName", parameterName)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getNCharacterStream(Reader result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getNCharacterStream")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getNCharacterStream(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getNCharacterStream")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .threw(cause)
        .build());
  }

  public void setInt(int parameterIndex, int x) {
    trace(new Trace.Builder("CallableStatement", "setInt")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setInt(Throwable cause, int parameterIndex, int x) {
    trace(new Trace.Builder("CallableStatement", "setInt")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setShort(int parameterIndex, short x) {
    trace(new Trace.Builder("CallableStatement", "setShort")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setShort(Throwable cause, int parameterIndex, short x) {
    trace(new Trace.Builder("CallableStatement", "setShort")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBigDecimal")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBigDecimal")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(int parameterIndex, SQLType sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, int parameterIndex, SQLType sqlType,
      String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void setNCharacterStream(int parameterIndex, Reader value, long length) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setNCharacterStream(Throwable cause, int parameterIndex, Reader value, long length) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setBlob(String parameterName, Blob x) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, String parameterName, Blob x) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setClob(int parameterIndex, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, int parameterIndex, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void setNCharacterStream(String parameterName, Reader value, long length) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setNCharacterStream(Throwable cause, String parameterName, Reader value,
      long length) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setRowId(int parameterIndex, RowId x) {
    trace(new Trace.Builder("CallableStatement", "setRowId")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setRowId(Throwable cause, int parameterIndex, RowId x) {
    trace(new Trace.Builder("CallableStatement", "setRowId")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBlob(String parameterName, InputStream inputStream, long length) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterName", parameterName)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, String parameterName, InputStream inputStream, long length) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterName", parameterName)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public void getInt(int result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getInt")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getInt(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getInt")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setRowId(String parameterName, RowId x) {
    trace(new Trace.Builder("CallableStatement", "setRowId")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setRowId(Throwable cause, String parameterName, RowId x) {
    trace(new Trace.Builder("CallableStatement", "setRowId")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setFloat(String parameterName, float x) {
    trace(new Trace.Builder("CallableStatement", "setFloat")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setFloat(Throwable cause, String parameterName, float x) {
    trace(new Trace.Builder("CallableStatement", "setFloat")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setSQLXML(String parameterName, SQLXML xmlObject) {
    trace(new Trace.Builder("CallableStatement", "setSQLXML")
        .withParameter("parameterName", parameterName)
        .withParameter("xmlObject", xmlObject)
        .returned()
        .build());
  }

  public void setSQLXML(Throwable cause, String parameterName, SQLXML xmlObject) {
    trace(new Trace.Builder("CallableStatement", "setSQLXML")
        .withParameter("parameterName", parameterName)
        .withParameter("xmlObject", xmlObject)
        .threw(cause)
        .build());
  }

  public void getFetchDirection(int result) {
    trace(new Trace.Builder("CallableStatement", "getFetchDirection")
        .returned(result)
        .build());
  }

  public void getFetchDirection(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getFetchDirection")
        .threw(cause)
        .build());
  }

  public void setCharacterStream(String parameterName, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, String parameterName, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void getUpdateCount(int result) {
    trace(new Trace.Builder("CallableStatement", "getUpdateCount")
        .returned(result)
        .build());
  }

  public void getUpdateCount(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getUpdateCount")
        .threw(cause)
        .build());
  }

  public void setBlob(int parameterIndex, Blob x) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, int parameterIndex, Blob x) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void getShort(short result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getShort")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getShort(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getShort")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setNClob(int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void addBatch(String sql) {
    trace(new Trace.Builder("CallableStatement", "addBatch")
        .withParameter("sql", sql)
        .returned()
        .build());
  }

  public void addBatch(Throwable cause, String sql) {
    trace(new Trace.Builder("CallableStatement", "addBatch")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void setURL(String parameterName, URL val) {
    trace(new Trace.Builder("CallableStatement", "setURL")
        .withParameter("parameterName", parameterName)
        .withParameter("val", val)
        .returned()
        .build());
  }

  public void setURL(Throwable cause, String parameterName, URL val) {
    trace(new Trace.Builder("CallableStatement", "setURL")
        .withParameter("parameterName", parameterName)
        .withParameter("val", val)
        .threw(cause)
        .build());
  }

  public void getBytes(byte[] result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBytes")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getBytes(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBytes")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setUnicodeStream(int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setUnicodeStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setUnicodeStream(Throwable cause, int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setUnicodeStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, int targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, int targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setNCharacterStream(String parameterName, Reader value) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNCharacterStream(Throwable cause, String parameterName, Reader value) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public void getArray(Array result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getArray")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getArray")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getRowId(RowId result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getRowId")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getRowId(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getRowId")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getDouble(double result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getDouble")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getDouble(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getDouble")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setFloat(int parameterIndex, float x) {
    trace(new Trace.Builder("CallableStatement", "setFloat")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setFloat(Throwable cause, int parameterIndex, float x) {
    trace(new Trace.Builder("CallableStatement", "setFloat")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setFetchDirection(int direction) {
    trace(new Trace.Builder("CallableStatement", "setFetchDirection")
        .withParameter("direction", direction)
        .returned()
        .build());
  }

  public void setFetchDirection(Throwable cause, int direction) {
    trace(new Trace.Builder("CallableStatement", "setFetchDirection")
        .withParameter("direction", direction)
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, int parameterIndex, int scale) {
    trace(new Trace.Builder("CallableStatement", "getBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("scale", scale)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, int parameterIndex, int scale) {
    trace(new Trace.Builder("CallableStatement", "getBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(String parameterName, SQLType sqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, String parameterName, SQLType sqlType,
      int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, int parameterIndex, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("CallableStatement", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("CallableStatement", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(int parameterIndex, Reader reader, int length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, int parameterIndex, Reader reader, int length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getObject(Object result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void isPoolable(boolean result) {
    trace(new Trace.Builder("CallableStatement", "isPoolable")
        .returned(result)
        .build());
  }

  public void isPoolable(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "isPoolable")
        .threw(cause)
        .build());
  }

  public void getNString(String result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getNString")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getNString(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getNString")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getLargeMaxRows(long result) {
    trace(new Trace.Builder("CallableStatement", "getLargeMaxRows")
        .returned(result)
        .build());
  }

  public void getLargeMaxRows(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getLargeMaxRows")
        .threw(cause)
        .build());
  }

  public void getMaxRows(int result) {
    trace(new Trace.Builder("CallableStatement", "getMaxRows")
        .returned(result)
        .build());
  }

  public void getMaxRows(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getMaxRows")
        .threw(cause)
        .build());
  }

  public void getTime(Time result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getConnection(Connection result) {
    trace(new Trace.Builder("CallableStatement", "getConnection")
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getConnection")
        .threw(cause)
        .build());
  }

  public void closeOnCompletion() {
    trace(new Trace.Builder("CallableStatement", "closeOnCompletion")
        .returned()
        .build());
  }

  public void closeOnCompletion(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "closeOnCompletion")
        .threw(cause)
        .build());
  }

  public <T> void getObject(T result, String parameterName, Class<T> type) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterName", parameterName)
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public <T> void getObject(Throwable cause, String parameterName, Class<T> type) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterName", parameterName)
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void setTime(String parameterName, Time x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setTime(Throwable cause, String parameterName, Time x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql, String[] columnNames) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(String parameterName, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, String parameterName, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void executeLargeBatch(long[] result) {
    trace(new Trace.Builder("CallableStatement", "executeLargeBatch")
        .returned(result)
        .build());
  }

  public void executeLargeBatch(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "executeLargeBatch")
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, int targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, int targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void setObject(String parameterName, Object x, SQLType targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, String parameterName, Object x, SQLType targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void getByte(byte result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getByte")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getByte(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getByte")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setBoolean(int parameterIndex, boolean x) {
    trace(new Trace.Builder("CallableStatement", "setBoolean")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBoolean(Throwable cause, int parameterIndex, boolean x) {
    trace(new Trace.Builder("CallableStatement", "setBoolean")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBytes(int parameterIndex, byte[] x) {
    trace(new Trace.Builder("CallableStatement", "setBytes")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBytes(Throwable cause, int parameterIndex, byte[] x) {
    trace(new Trace.Builder("CallableStatement", "setBytes")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(int parameterIndex, int sqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, int parameterIndex, int sqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .threw(cause)
        .build());
  }

  public void getSQLXML(SQLXML result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getSQLXML")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getSQLXML(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getSQLXML")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setShort(String parameterName, short x) {
    trace(new Trace.Builder("CallableStatement", "setShort")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setShort(Throwable cause, String parameterName, short x) {
    trace(new Trace.Builder("CallableStatement", "setShort")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setQueryTimeout(int seconds) {
    trace(new Trace.Builder("CallableStatement", "setQueryTimeout")
        .withParameter("seconds", seconds)
        .returned()
        .build());
  }

  public void setQueryTimeout(Throwable cause, int seconds) {
    trace(new Trace.Builder("CallableStatement", "setQueryTimeout")
        .withParameter("seconds", seconds)
        .threw(cause)
        .build());
  }

  public void setNull(String parameterName, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void setNull(Throwable cause, String parameterName, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void getShort(short result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getShort")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getShort(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getShort")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getParameterMetaData(ParameterMetaData result) {
    trace(new Trace.Builder("CallableStatement", "getParameterMetaData")
        .returned(result)
        .build());
  }

  public void getParameterMetaData(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getParameterMetaData")
        .threw(cause)
        .build());
  }

  public void getString(String result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getString")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getString(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getString")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void setNClob(int parameterIndex, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, int parameterIndex, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql, String[] columnNames) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(String parameterName, Reader reader, int length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, String parameterName, Reader reader, int length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void wasNull(boolean result) {
    trace(new Trace.Builder("CallableStatement", "wasNull")
        .returned(result)
        .build());
  }

  public void wasNull(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "wasNull")
        .threw(cause)
        .build());
  }

  public void setEscapeProcessing(boolean enable) {
    trace(new Trace.Builder("CallableStatement", "setEscapeProcessing")
        .withParameter("enable", enable)
        .returned()
        .build());
  }

  public void setEscapeProcessing(Throwable cause, boolean enable) {
    trace(new Trace.Builder("CallableStatement", "setEscapeProcessing")
        .withParameter("enable", enable)
        .threw(cause)
        .build());
  }

  public void setLargeMaxRows(long max) {
    trace(new Trace.Builder("CallableStatement", "setLargeMaxRows")
        .withParameter("max", max)
        .returned()
        .build());
  }

  public void setLargeMaxRows(Throwable cause, long max) {
    trace(new Trace.Builder("CallableStatement", "setLargeMaxRows")
        .withParameter("max", max)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, int parameterIndex, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, int parameterIndex, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(String parameterName, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, String parameterName, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getMaxFieldSize(int result) {
    trace(new Trace.Builder("CallableStatement", "getMaxFieldSize")
        .returned(result)
        .build());
  }

  public void getMaxFieldSize(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getMaxFieldSize")
        .threw(cause)
        .build());
  }

  public void setNCharacterStream(int parameterIndex, Reader value) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNCharacterStream(Throwable cause, int parameterIndex, Reader value) {
    trace(new Trace.Builder("CallableStatement", "setNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(String parameterName, SQLType sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, String parameterName, SQLType sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void getClob(Clob result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getClob")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getClob(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getClob")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(int parameterIndex, int sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, int parameterIndex, int sqlType,
      String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void getLong(long result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getLong")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getLong(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getLong")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setBoolean(String parameterName, boolean x) {
    trace(new Trace.Builder("CallableStatement", "setBoolean")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBoolean(Throwable cause, String parameterName, boolean x) {
    trace(new Trace.Builder("CallableStatement", "setBoolean")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void clearBatch() {
    trace(new Trace.Builder("CallableStatement", "clearBatch")
        .returned()
        .build());
  }

  public void clearBatch(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "clearBatch")
        .threw(cause)
        .build());
  }

  public void setBlob(String parameterName, InputStream inputStream) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterName", parameterName)
        .withParameter("inputStream", inputStream)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, String parameterName, InputStream inputStream) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterName", parameterName)
        .withParameter("inputStream", inputStream)
        .threw(cause)
        .build());
  }

  public void setURL(int parameterIndex, URL x) {
    trace(new Trace.Builder("CallableStatement", "setURL")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setURL(Throwable cause, int parameterIndex, URL x) {
    trace(new Trace.Builder("CallableStatement", "setURL")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getDouble(double result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getDouble")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getDouble(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getDouble")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getRef(Ref result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getRef")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getRef(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getRef")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setClob(String parameterName, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, String parameterName, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void getNString(String result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getNString")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getNString(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getNString")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getByte(byte result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getByte")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getByte(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getByte")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getFetchSize(int result) {
    trace(new Trace.Builder("CallableStatement", "getFetchSize")
        .returned(result)
        .build());
  }

  public void getFetchSize(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getFetchSize")
        .threw(cause)
        .build());
  }

  public void setTimestamp(int parameterIndex, Timestamp x) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setTimestamp(Throwable cause, int parameterIndex, Timestamp x) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setClob(String parameterName, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, String parameterName, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setDate(String parameterName, Date x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setDate(Throwable cause, String parameterName, Date x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void setBytes(String parameterName, byte[] x) {
    trace(new Trace.Builder("CallableStatement", "setBytes")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBytes(Throwable cause, String parameterName, byte[] x) {
    trace(new Trace.Builder("CallableStatement", "setBytes")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void clearParameters() {
    trace(new Trace.Builder("CallableStatement", "clearParameters")
        .returned()
        .build());
  }

  public void clearParameters(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "clearParameters")
        .threw(cause)
        .build());
  }

  public void setAsciiStream(String parameterName, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, String parameterName, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getObject(Object result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(String parameterName, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, String parameterName, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setString(String parameterName, String x) {
    trace(new Trace.Builder("CallableStatement", "setString")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setString(Throwable cause, String parameterName, String x) {
    trace(new Trace.Builder("CallableStatement", "setString")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getCharacterStream")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getCharacterStream")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getMoreResults(boolean result, int current) {
    trace(new Trace.Builder("CallableStatement", "getMoreResults")
        .withParameter("current", current)
        .returned(result)
        .build());
  }

  public void getMoreResults(Throwable cause, int current) {
    trace(new Trace.Builder("CallableStatement", "getMoreResults")
        .withParameter("current", current)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public void getSQLXML(SQLXML result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getSQLXML")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getSQLXML(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getSQLXML")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setMaxRows(int max) {
    trace(new Trace.Builder("CallableStatement", "setMaxRows")
        .withParameter("max", max)
        .returned()
        .build());
  }

  public void setMaxRows(Throwable cause, int max) {
    trace(new Trace.Builder("CallableStatement", "setMaxRows")
        .withParameter("max", max)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, int parameterIndex, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, int parameterIndex, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getURL(URL result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getURL")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getURL(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getURL")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, String parameterName, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterName", parameterName)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, String parameterName, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterName", parameterName)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(String parameterName, SQLType sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, String parameterName, SQLType sqlType,
      String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void execute(boolean result, String sql) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void execute(Throwable cause, String sql) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void executeBatch(int[] result) {
    trace(new Trace.Builder("CallableStatement", "executeBatch")
        .returned(result)
        .build());
  }

  public void executeBatch(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "executeBatch")
        .threw(cause)
        .build());
  }

  public void getNClob(NClob result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getNClob")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getNClob(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getNClob")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(int parameterIndex, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, int parameterIndex, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void getResultSetConcurrency(int result) {
    trace(new Trace.Builder("CallableStatement", "getResultSetConcurrency")
        .returned(result)
        .build());
  }

  public void getResultSetConcurrency(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getResultSetConcurrency")
        .threw(cause)
        .build());
  }

  public void getRef(Ref result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getRef")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getRef(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getRef")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, String parameterName, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterName", parameterName)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, String parameterName, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getTimestamp")
        .withParameter("parameterName", parameterName)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getURL(URL result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getURL")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getURL(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getURL")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getClob(Clob result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getClob")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getClob(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getClob")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getBlob(Blob result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBlob")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getBlob(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBlob")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getNCharacterStream(Reader result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getNCharacterStream(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getNCharacterStream")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getTime")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setObject(String parameterName, Object x, int targetSqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scale", scale)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, String parameterName, Object x, int targetSqlType,
      int scale) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void clearWarnings() {
    trace(new Trace.Builder("CallableStatement", "clearWarnings")
        .returned()
        .build());
  }

  public void clearWarnings(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "clearWarnings")
        .threw(cause)
        .build());
  }

  public void setNClob(String parameterName, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, String parameterName, Reader reader) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void executeLargeUpdate(long result, String sql, String[] columnNames) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void executeLargeUpdate(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("CallableStatement", "executeLargeUpdate")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void getQueryTimeout(int result) {
    trace(new Trace.Builder("CallableStatement", "getQueryTimeout")
        .returned(result)
        .build());
  }

  public void getQueryTimeout(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getQueryTimeout")
        .threw(cause)
        .build());
  }

  public void setDouble(int parameterIndex, double x) {
    trace(new Trace.Builder("CallableStatement", "setDouble")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setDouble(Throwable cause, int parameterIndex, double x) {
    trace(new Trace.Builder("CallableStatement", "setDouble")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(int parameterIndex, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, int parameterIndex, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setNClob(String parameterName, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, String parameterName, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(int parameterIndex, SQLType sqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, int parameterIndex, SQLType sqlType,
      int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void setAsciiStream(int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setAsciiStream(Throwable cause, int parameterIndex, InputStream x, int length) {
    trace(new Trace.Builder("CallableStatement", "setAsciiStream")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setClob(int parameterIndex, Clob x) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, int parameterIndex, Clob x) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setMaxFieldSize(int max) {
    trace(new Trace.Builder("CallableStatement", "setMaxFieldSize")
        .withParameter("max", max)
        .returned()
        .build());
  }

  public void setMaxFieldSize(Throwable cause, int max) {
    trace(new Trace.Builder("CallableStatement", "setMaxFieldSize")
        .withParameter("max", max)
        .threw(cause)
        .build());
  }

  public void isCloseOnCompletion(boolean result) {
    trace(new Trace.Builder("CallableStatement", "isCloseOnCompletion")
        .returned(result)
        .build());
  }

  public void isCloseOnCompletion(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "isCloseOnCompletion")
        .threw(cause)
        .build());
  }

  public void getBoolean(boolean result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBoolean")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getBoolean(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getBoolean")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getNClob(NClob result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getNClob")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getNClob(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getNClob")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setNString(int parameterIndex, String value) {
    trace(new Trace.Builder("CallableStatement", "setNString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNString(Throwable cause, int parameterIndex, String value) {
    trace(new Trace.Builder("CallableStatement", "setNString")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void getRowId(RowId result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getRowId")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getRowId(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getRowId")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void setPoolable(boolean poolable) {
    trace(new Trace.Builder("CallableStatement", "setPoolable")
        .withParameter("poolable", poolable)
        .returned()
        .build());
  }

  public void setPoolable(Throwable cause, boolean poolable) {
    trace(new Trace.Builder("CallableStatement", "setPoolable")
        .withParameter("poolable", poolable)
        .threw(cause)
        .build());
  }

  public void setNull(int parameterIndex, int sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void setNull(Throwable cause, int parameterIndex, int sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void executeUpdate(int result, String sql) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void executeUpdate(Throwable cause, String sql) {
    trace(new Trace.Builder("CallableStatement", "executeUpdate")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, int parameterIndex, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, int parameterIndex, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "getDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void isClosed(boolean result) {
    trace(new Trace.Builder("CallableStatement", "isClosed")
        .returned(result)
        .build());
  }

  public void isClosed(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "isClosed")
        .threw(cause)
        .build());
  }

  public void setBinaryStream(String parameterName, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, String parameterName, InputStream x) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getObject(Object result, String parameterName, Map<String, Class<?>> map) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterName", parameterName)
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, String parameterName, Map<String, Class<?>> map) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterName", parameterName)
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void getBoolean(boolean result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBoolean")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getBoolean(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBoolean")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setBlob(int parameterIndex, InputStream inputStream) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, int parameterIndex, InputStream inputStream) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .threw(cause)
        .build());
  }

  public void executeQuery(ResultSet result) {
    trace(new Trace.Builder("CallableStatement", "executeQuery")
        .returned(result)
        .build());
  }

  public void executeQuery(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "executeQuery")
        .threw(cause)
        .build());
  }

  public void getBytes(byte[] result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBytes")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getBytes(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBytes")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getResultSet(ResultSet result) {
    trace(new Trace.Builder("CallableStatement", "getResultSet")
        .returned(result)
        .build());
  }

  public void getResultSet(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getResultSet")
        .threw(cause)
        .build());
  }

  public void getLong(long result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getLong")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getLong(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getLong")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(String parameterName, int sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, String parameterName, int sqlType,
      String typeName) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void setObject(String parameterName, Object x) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, String parameterName, Object x) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setRef(int parameterIndex, Ref x) {
    trace(new Trace.Builder("CallableStatement", "setRef")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setRef(Throwable cause, int parameterIndex, Ref x) {
    trace(new Trace.Builder("CallableStatement", "setRef")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void registerOutParameter(String parameterName, int sqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, String parameterName, int sqlType, int scale) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void setInt(String parameterName, int x) {
    trace(new Trace.Builder("CallableStatement", "setInt")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setInt(Throwable cause, String parameterName, int x) {
    trace(new Trace.Builder("CallableStatement", "setInt")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setByte(int parameterIndex, byte x) {
    trace(new Trace.Builder("CallableStatement", "setByte")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setByte(Throwable cause, int parameterIndex, byte x) {
    trace(new Trace.Builder("CallableStatement", "setByte")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setDate(int parameterIndex, Date x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setDate(Throwable cause, int parameterIndex, Date x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void executeQuery(ResultSet result, String sql) {
    trace(new Trace.Builder("CallableStatement", "executeQuery")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void executeQuery(Throwable cause, String sql) {
    trace(new Trace.Builder("CallableStatement", "executeQuery")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void setNClob(String parameterName, NClob value) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setNClob(Throwable cause, String parameterName, NClob value) {
    trace(new Trace.Builder("CallableStatement", "setNClob")
        .withParameter("parameterName", parameterName)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void setBigDecimal(String parameterName, BigDecimal x) {
    trace(new Trace.Builder("CallableStatement", "setBigDecimal")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBigDecimal(Throwable cause, String parameterName, BigDecimal x) {
    trace(new Trace.Builder("CallableStatement", "setBigDecimal")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setDate(int parameterIndex, Date x) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setDate(Throwable cause, int parameterIndex, Date x) {
    trace(new Trace.Builder("CallableStatement", "setDate")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setClob(int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setClob(Throwable cause, int parameterIndex, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setClob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getInt(int result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getInt")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getInt(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getInt")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getMoreResults(boolean result) {
    trace(new Trace.Builder("CallableStatement", "getMoreResults")
        .returned(result)
        .build());
  }

  public void getMoreResults(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getMoreResults")
        .threw(cause)
        .build());
  }

  public void getObject(Object result, int parameterIndex, Map<String, Class<?>> map) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, int parameterIndex, Map<String, Class<?>> map) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void setObject(String parameterName, Object x, int targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, String parameterName, Object x, int targetSqlType) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(String parameterName, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBinaryStream(Throwable cause, String parameterName, InputStream x, long length) {
    trace(new Trace.Builder("CallableStatement", "setBinaryStream")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void addBatch() {
    trace(new Trace.Builder("CallableStatement", "addBatch")
        .returned()
        .build());
  }

  public void addBatch(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "addBatch")
        .threw(cause)
        .build());
  }

  public void getArray(Array result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getArray")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getArray")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void getBlob(Blob result, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBlob")
        .withParameter("parameterName", parameterName)
        .returned(result)
        .build());
  }

  public void getBlob(Throwable cause, String parameterName) {
    trace(new Trace.Builder("CallableStatement", "getBlob")
        .withParameter("parameterName", parameterName)
        .threw(cause)
        .build());
  }

  public void setNull(String parameterName, int sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .returned()
        .build());
  }

  public void setNull(Throwable cause, String parameterName, int sqlType, String typeName) {
    trace(new Trace.Builder("CallableStatement", "setNull")
        .withParameter("parameterName", parameterName)
        .withParameter("sqlType", sqlType)
        .withParameter("typeName", typeName)
        .threw(cause)
        .build());
  }

  public void setTime(int parameterIndex, Time x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setTime(Throwable cause, int parameterIndex, Time x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTime")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void setCursorName(String name) {
    trace(new Trace.Builder("CallableStatement", "setCursorName")
        .withParameter("name", name)
        .returned()
        .build());
  }

  public void setCursorName(Throwable cause, String name) {
    trace(new Trace.Builder("CallableStatement", "setCursorName")
        .withParameter("name", name)
        .threw(cause)
        .build());
  }

  public void setLong(String parameterName, long x) {
    trace(new Trace.Builder("CallableStatement", "setLong")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setLong(Throwable cause, String parameterName, long x) {
    trace(new Trace.Builder("CallableStatement", "setLong")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public <T> void getObject(T result, int parameterIndex, Class<T> type) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public <T> void getObject(Throwable cause, int parameterIndex, Class<T> type) {
    trace(new Trace.Builder("CallableStatement", "getObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void setTimestamp(String parameterName, Timestamp x) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setTimestamp(Throwable cause, String parameterName, Timestamp x) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterName", parameterName)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void execute(boolean result) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .returned(result)
        .build());
  }

  public void execute(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "execute")
        .threw(cause)
        .build());
  }

  public void getWarnings(SQLWarning result) {
    trace(new Trace.Builder("CallableStatement", "getWarnings")
        .returned(result)
        .build());
  }

  public void getWarnings(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getWarnings")
        .threw(cause)
        .build());
  }

  public void registerOutParameter(int parameterIndex, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .returned()
        .build());
  }

  public void registerOutParameter(Throwable cause, int parameterIndex, int sqlType) {
    trace(new Trace.Builder("CallableStatement", "registerOutParameter")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("sqlType", sqlType)
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x, SQLType targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x, SQLType targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void setCharacterStream(String parameterName, Reader reader, long length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setCharacterStream(Throwable cause, String parameterName, Reader reader,
      long length) {
    trace(new Trace.Builder("CallableStatement", "setCharacterStream")
        .withParameter("parameterName", parameterName)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void setSQLXML(int parameterIndex, SQLXML xmlObject) {
    trace(new Trace.Builder("CallableStatement", "setSQLXML")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("xmlObject", xmlObject)
        .returned()
        .build());
  }

  public void setSQLXML(Throwable cause, int parameterIndex, SQLXML xmlObject) {
    trace(new Trace.Builder("CallableStatement", "setSQLXML")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("xmlObject", xmlObject)
        .threw(cause)
        .build());
  }

  public void setBigDecimal(int parameterIndex, BigDecimal x) {
    trace(new Trace.Builder("CallableStatement", "setBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setBigDecimal(Throwable cause, int parameterIndex, BigDecimal x) {
    trace(new Trace.Builder("CallableStatement", "setBigDecimal")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getMetaData(ResultSetMetaData result) {
    trace(new Trace.Builder("CallableStatement", "getMetaData")
        .returned(result)
        .build());
  }

  public void getMetaData(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getMetaData")
        .threw(cause)
        .build());
  }

  public void setObject(int parameterIndex, Object x) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, int parameterIndex, Object x) {
    trace(new Trace.Builder("CallableStatement", "setObject")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void setTimestamp(int parameterIndex, Timestamp x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .returned()
        .build());
  }

  public void setTimestamp(Throwable cause, int parameterIndex, Timestamp x, Calendar cal) {
    trace(new Trace.Builder("CallableStatement", "setTimestamp")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("x", x)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void setBlob(int parameterIndex, InputStream inputStream, long length) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void setBlob(Throwable cause, int parameterIndex, InputStream inputStream, long length) {
    trace(new Trace.Builder("CallableStatement", "setBlob")
        .withParameter("parameterIndex", parameterIndex)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getFloat(float result, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getFloat")
        .withParameter("parameterIndex", parameterIndex)
        .returned(result)
        .build());
  }

  public void getFloat(Throwable cause, int parameterIndex) {
    trace(new Trace.Builder("CallableStatement", "getFloat")
        .withParameter("parameterIndex", parameterIndex)
        .threw(cause)
        .build());
  }

  public void getLargeUpdateCount(long result) {
    trace(new Trace.Builder("CallableStatement", "getLargeUpdateCount")
        .returned(result)
        .build());
  }

  public void getLargeUpdateCount(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getLargeUpdateCount")
        .threw(cause)
        .build());
  }

  public void getResultSetHoldability(int result) {
    trace(new Trace.Builder("CallableStatement", "getResultSetHoldability")
        .returned(result)
        .build());
  }

  public void getResultSetHoldability(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "getResultSetHoldability")
        .threw(cause)
        .build());
  }

  public void close() {
    trace(new Trace.Builder("CallableStatement", "close")
        .returned()
        .build());
  }

  public void close(Throwable cause) {
    trace(new Trace.Builder("CallableStatement", "close")
        .threw(cause)
        .build());
  }

  public ResultSetListener newResultSetListener() {
    return new ResultSetTracer(out);
  }

  public ArrayListener newArrayListener() {
    return new ArrayTracer(out);
  }

  public RowIdListener newRowIdListener() {
    return new RowIdTracer(out);
  }

  public ConnectionListener newConnectionListener() {
    return new ConnectionTracer(out);
  }

  public SQLXMLListener newSQLXMLListener() {
    return new SQLXMLTracer(out);
  }

  public ParameterMetaDataListener newParameterMetaDataListener() {
    return new ParameterMetaDataTracer(out);
  }

  public ClobListener newClobListener() {
    return new ClobTracer(out);
  }

  public RefListener newRefListener() {
    return new RefTracer(out);
  }

  public NClobListener newNClobListener() {
    return new NClobTracer(out);
  }

  public BlobListener newBlobListener() {
    return new BlobTracer(out);
  }

  public ResultSetMetaDataListener newResultSetMetaDataListener() {
    return new ResultSetMetaDataTracer(out);
  }
}
