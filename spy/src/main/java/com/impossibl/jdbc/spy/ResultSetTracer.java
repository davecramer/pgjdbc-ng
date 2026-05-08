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

public class ResultSetTracer implements ResultSetListener {
  TraceOutput out;

  public ResultSetTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void first(boolean result) {
    trace(new Trace.Builder("ResultSet", "first")
        .returned(result)
        .build());
  }

  public void first(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "first")
        .threw(cause)
        .build());
  }

  public void getDate(Date result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, int columnIndex, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnIndex", columnIndex)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, int columnIndex, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnIndex", columnIndex)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, String columnLabel, Object x, SQLType targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void updateBigDecimal(int columnIndex, BigDecimal x) {
    trace(new Trace.Builder("ResultSet", "updateBigDecimal")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBigDecimal(Throwable cause, int columnIndex, BigDecimal x) {
    trace(new Trace.Builder("ResultSet", "updateBigDecimal")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateClob(int columnIndex, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateClob(Throwable cause, int columnIndex, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateString(String columnLabel, String x) {
    trace(new Trace.Builder("ResultSet", "updateString")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateString(Throwable cause, String columnLabel, String x) {
    trace(new Trace.Builder("ResultSet", "updateString")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateDate(int columnIndex, Date x) {
    trace(new Trace.Builder("ResultSet", "updateDate")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateDate(Throwable cause, int columnIndex, Date x) {
    trace(new Trace.Builder("ResultSet", "updateDate")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getFloat(float result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getFloat")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getFloat(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getFloat")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getRowId(RowId result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getRowId")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getRowId(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getRowId")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void findColumn(int result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "findColumn")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void findColumn(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "findColumn")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void relative(boolean result, int rows) {
    trace(new Trace.Builder("ResultSet", "relative")
        .withParameter("rows", rows)
        .returned(result)
        .build());
  }

  public void relative(Throwable cause, int rows) {
    trace(new Trace.Builder("ResultSet", "relative")
        .withParameter("rows", rows)
        .threw(cause)
        .build());
  }

  public void updateFloat(String columnLabel, float x) {
    trace(new Trace.Builder("ResultSet", "updateFloat")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateFloat(Throwable cause, String columnLabel, float x) {
    trace(new Trace.Builder("ResultSet", "updateFloat")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateBigDecimal(String columnLabel, BigDecimal x) {
    trace(new Trace.Builder("ResultSet", "updateBigDecimal")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBigDecimal(Throwable cause, String columnLabel, BigDecimal x) {
    trace(new Trace.Builder("ResultSet", "updateBigDecimal")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateTimestamp(String columnLabel, Timestamp x) {
    trace(new Trace.Builder("ResultSet", "updateTimestamp")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateTimestamp(Throwable cause, String columnLabel, Timestamp x) {
    trace(new Trace.Builder("ResultSet", "updateTimestamp")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void previous(boolean result) {
    trace(new Trace.Builder("ResultSet", "previous")
        .returned(result)
        .build());
  }

  public void previous(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "previous")
        .threw(cause)
        .build());
  }

  public void updateNClob(int columnIndex, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void updateNClob(Throwable cause, int columnIndex, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void updateNClob(String columnLabel, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateNClob(Throwable cause, String columnLabel, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateBlob(String columnLabel, InputStream inputStream) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("inputStream", inputStream)
        .returned()
        .build());
  }

  public void updateBlob(Throwable cause, String columnLabel, InputStream inputStream) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("inputStream", inputStream)
        .threw(cause)
        .build());
  }

  public void getFetchDirection(int result) {
    trace(new Trace.Builder("ResultSet", "getFetchDirection")
        .returned(result)
        .build());
  }

  public void getFetchDirection(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getFetchDirection")
        .threw(cause)
        .build());
  }

  public void updateTimestamp(int columnIndex, Timestamp x) {
    trace(new Trace.Builder("ResultSet", "updateTimestamp")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateTimestamp(Throwable cause, int columnIndex, Timestamp x) {
    trace(new Trace.Builder("ResultSet", "updateTimestamp")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("ResultSet", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("ResultSet", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void updateClob(int columnIndex, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void updateClob(Throwable cause, int columnIndex, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void updateObject(String columnLabel, Object x, int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, String columnLabel, Object x, int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, String columnLabel, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnLabel", columnLabel)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, String columnLabel, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnLabel", columnLabel)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void updateObject(int columnIndex, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, int columnIndex, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void updateBlob(int columnIndex, Blob x) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBlob(Throwable cause, int columnIndex, Blob x) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateNCharacterStream(String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void updateNCharacterStream(Throwable cause, String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void rowInserted(boolean result) {
    trace(new Trace.Builder("ResultSet", "rowInserted")
        .returned(result)
        .build());
  }

  public void rowInserted(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "rowInserted")
        .threw(cause)
        .build());
  }

  public void cancelRowUpdates() {
    trace(new Trace.Builder("ResultSet", "cancelRowUpdates")
        .returned()
        .build());
  }

  public void cancelRowUpdates(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "cancelRowUpdates")
        .threw(cause)
        .build());
  }

  public void getAsciiStream(InputStream result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getAsciiStream(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateRow() {
    trace(new Trace.Builder("ResultSet", "updateRow")
        .returned()
        .build());
  }

  public void updateRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "updateRow")
        .threw(cause)
        .build());
  }

  public void updateTime(String columnLabel, Time x) {
    trace(new Trace.Builder("ResultSet", "updateTime")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateTime(Throwable cause, String columnLabel, Time x) {
    trace(new Trace.Builder("ResultSet", "updateTime")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, String columnLabel, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnLabel", columnLabel)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, String columnLabel, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnLabel", columnLabel)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void updateBlob(int columnIndex, InputStream inputStream) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("inputStream", inputStream)
        .returned()
        .build());
  }

  public void updateBlob(Throwable cause, int columnIndex, InputStream inputStream) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("inputStream", inputStream)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, int columnIndex, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnIndex", columnIndex)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, int columnIndex, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnIndex", columnIndex)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getCursorName(String result) {
    trace(new Trace.Builder("ResultSet", "getCursorName")
        .returned(result)
        .build());
  }

  public void getCursorName(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getCursorName")
        .threw(cause)
        .build());
  }

  public void updateByte(String columnLabel, byte x) {
    trace(new Trace.Builder("ResultSet", "updateByte")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateByte(Throwable cause, String columnLabel, byte x) {
    trace(new Trace.Builder("ResultSet", "updateByte")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void refreshRow() {
    trace(new Trace.Builder("ResultSet", "refreshRow")
        .returned()
        .build());
  }

  public void refreshRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "refreshRow")
        .threw(cause)
        .build());
  }

  public void updateNCharacterStream(int columnIndex, Reader x) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateNCharacterStream(Throwable cause, int columnIndex, Reader x) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getStatement(Statement result) {
    trace(new Trace.Builder("ResultSet", "getStatement")
        .returned(result)
        .build());
  }

  public void getStatement(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getStatement")
        .threw(cause)
        .build());
  }

  public void updateBinaryStream(String columnLabel, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBinaryStream(Throwable cause, String columnLabel, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getArray(Array result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getArray")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getArray")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateFloat(int columnIndex, float x) {
    trace(new Trace.Builder("ResultSet", "updateFloat")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateFloat(Throwable cause, int columnIndex, float x) {
    trace(new Trace.Builder("ResultSet", "updateFloat")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getByte(byte result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getByte")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getByte(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getByte")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateDouble(String columnLabel, double x) {
    trace(new Trace.Builder("ResultSet", "updateDouble")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateDouble(Throwable cause, String columnLabel, double x) {
    trace(new Trace.Builder("ResultSet", "updateDouble")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateNClob(String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void updateNClob(Throwable cause, String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void isFirst(boolean result) {
    trace(new Trace.Builder("ResultSet", "isFirst")
        .returned(result)
        .build());
  }

  public void isFirst(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "isFirst")
        .threw(cause)
        .build());
  }

  public void updateObject(String columnLabel, Object x) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, String columnLabel, Object x) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getInt(int result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getInt")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getInt(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getInt")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, String columnLabel, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnLabel", columnLabel)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, String columnLabel, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnLabel", columnLabel)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void getBinaryStream(InputStream result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getBinaryStream(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getDouble(double result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getDouble")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getDouble(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getDouble")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateNClob(String columnLabel, NClob nClob) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("nClob", nClob)
        .returned()
        .build());
  }

  public void updateNClob(Throwable cause, String columnLabel, NClob nClob) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("nClob", nClob)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateClob(String columnLabel, Clob x) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateClob(Throwable cause, String columnLabel, Clob x) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, int columnIndex, int scale) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnIndex", columnIndex)
        .withParameter("scale", scale)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, int columnIndex, int scale) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnIndex", columnIndex)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void updateString(int columnIndex, String x) {
    trace(new Trace.Builder("ResultSet", "updateString")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateString(Throwable cause, int columnIndex, String x) {
    trace(new Trace.Builder("ResultSet", "updateString")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateNull(int columnIndex) {
    trace(new Trace.Builder("ResultSet", "updateNull")
        .withParameter("columnIndex", columnIndex)
        .returned()
        .build());
  }

  public void updateNull(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "updateNull")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getNString(String result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getNString")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getNString(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getNString")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getDouble(double result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getDouble")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getDouble(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getDouble")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void wasNull(boolean result) {
    trace(new Trace.Builder("ResultSet", "wasNull")
        .returned(result)
        .build());
  }

  public void wasNull(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "wasNull")
        .threw(cause)
        .build());
  }

  public void getObject(Object result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateAsciiStream(String columnLabel, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateAsciiStream(Throwable cause, String columnLabel, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateInt(int columnIndex, int x) {
    trace(new Trace.Builder("ResultSet", "updateInt")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateInt(Throwable cause, int columnIndex, int x) {
    trace(new Trace.Builder("ResultSet", "updateInt")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateArray(String columnLabel, Array x) {
    trace(new Trace.Builder("ResultSet", "updateArray")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateArray(Throwable cause, String columnLabel, Array x) {
    trace(new Trace.Builder("ResultSet", "updateArray")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateObject(String columnLabel, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, String columnLabel, Object x, SQLType targetSqlType) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .threw(cause)
        .build());
  }

  public void beforeFirst() {
    trace(new Trace.Builder("ResultSet", "beforeFirst")
        .returned()
        .build());
  }

  public void beforeFirst(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "beforeFirst")
        .threw(cause)
        .build());
  }

  public void updateObject(int columnIndex, Object x, int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, int columnIndex, Object x, int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void moveToCurrentRow() {
    trace(new Trace.Builder("ResultSet", "moveToCurrentRow")
        .returned()
        .build());
  }

  public void moveToCurrentRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "moveToCurrentRow")
        .threw(cause)
        .build());
  }

  public void setFetchDirection(int direction) {
    trace(new Trace.Builder("ResultSet", "setFetchDirection")
        .withParameter("direction", direction)
        .returned()
        .build());
  }

  public void setFetchDirection(Throwable cause, int direction) {
    trace(new Trace.Builder("ResultSet", "setFetchDirection")
        .withParameter("direction", direction)
        .threw(cause)
        .build());
  }

  public void close() {
    trace(new Trace.Builder("ResultSet", "close")
        .returned()
        .build());
  }

  public void close(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "close")
        .threw(cause)
        .build());
  }

  public void getUnicodeStream(InputStream result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getUnicodeStream")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getUnicodeStream(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getUnicodeStream")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getBoolean(boolean result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBoolean")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getBoolean(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBoolean")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getString(String result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getString")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getString(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getString")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateNString(int columnIndex, String nString) {
    trace(new Trace.Builder("ResultSet", "updateNString")
        .withParameter("columnIndex", columnIndex)
        .withParameter("nString", nString)
        .returned()
        .build());
  }

  public void updateNString(Throwable cause, int columnIndex, String nString) {
    trace(new Trace.Builder("ResultSet", "updateNString")
        .withParameter("columnIndex", columnIndex)
        .withParameter("nString", nString)
        .threw(cause)
        .build());
  }

  public void afterLast() {
    trace(new Trace.Builder("ResultSet", "afterLast")
        .returned()
        .build());
  }

  public void afterLast(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "afterLast")
        .threw(cause)
        .build());
  }

  public void updateClob(String columnLabel, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateClob(Throwable cause, String columnLabel, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getRow(int result) {
    trace(new Trace.Builder("ResultSet", "getRow")
        .returned(result)
        .build());
  }

  public void getRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getRow")
        .threw(cause)
        .build());
  }

  public void getBlob(Blob result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBlob")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getBlob(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBlob")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateTime(int columnIndex, Time x) {
    trace(new Trace.Builder("ResultSet", "updateTime")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateTime(Throwable cause, int columnIndex, Time x) {
    trace(new Trace.Builder("ResultSet", "updateTime")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void rowUpdated(boolean result) {
    trace(new Trace.Builder("ResultSet", "rowUpdated")
        .returned(result)
        .build());
  }

  public void rowUpdated(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "rowUpdated")
        .threw(cause)
        .build());
  }

  public void getString(String result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getString")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getString(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getString")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getType(int result) {
    trace(new Trace.Builder("ResultSet", "getType")
        .returned(result)
        .build());
  }

  public void getType(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getType")
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateAsciiStream(String columnLabel, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateAsciiStream(Throwable cause, String columnLabel, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getBytes(byte[] result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBytes")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getBytes(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBytes")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void deleteRow() {
    trace(new Trace.Builder("ResultSet", "deleteRow")
        .returned()
        .build());
  }

  public void deleteRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "deleteRow")
        .threw(cause)
        .build());
  }

  public void updateBytes(int columnIndex, byte[] x) {
    trace(new Trace.Builder("ResultSet", "updateBytes")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBytes(Throwable cause, int columnIndex, byte[] x) {
    trace(new Trace.Builder("ResultSet", "updateBytes")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getFetchSize(int result) {
    trace(new Trace.Builder("ResultSet", "getFetchSize")
        .returned(result)
        .build());
  }

  public void getFetchSize(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getFetchSize")
        .threw(cause)
        .build());
  }

  public void getBinaryStream(InputStream result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getBinaryStream(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateBinaryStream(int columnIndex, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateBinaryStream(Throwable cause, int columnIndex, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void last(boolean result) {
    trace(new Trace.Builder("ResultSet", "last")
        .returned(result)
        .build());
  }

  public void last(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "last")
        .threw(cause)
        .build());
  }

  public void getObject(Object result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateLong(String columnLabel, long x) {
    trace(new Trace.Builder("ResultSet", "updateLong")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateLong(Throwable cause, String columnLabel, long x) {
    trace(new Trace.Builder("ResultSet", "updateLong")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateClob(int columnIndex, Clob x) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateClob(Throwable cause, int columnIndex, Clob x) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getSQLXML(SQLXML result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getSQLXML")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getSQLXML(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getSQLXML")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getMetaData(ResultSetMetaData result) {
    trace(new Trace.Builder("ResultSet", "getMetaData")
        .returned(result)
        .build());
  }

  public void getMetaData(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getMetaData")
        .threw(cause)
        .build());
  }

  public void updateBytes(String columnLabel, byte[] x) {
    trace(new Trace.Builder("ResultSet", "updateBytes")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBytes(Throwable cause, String columnLabel, byte[] x) {
    trace(new Trace.Builder("ResultSet", "updateBytes")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateRef(int columnIndex, Ref x) {
    trace(new Trace.Builder("ResultSet", "updateRef")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateRef(Throwable cause, int columnIndex, Ref x) {
    trace(new Trace.Builder("ResultSet", "updateRef")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void next(boolean result) {
    trace(new Trace.Builder("ResultSet", "next")
        .returned(result)
        .build());
  }

  public void next(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "next")
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("ResultSet", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("ResultSet", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void getAsciiStream(InputStream result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getAsciiStream(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void isAfterLast(boolean result) {
    trace(new Trace.Builder("ResultSet", "isAfterLast")
        .returned(result)
        .build());
  }

  public void isAfterLast(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "isAfterLast")
        .threw(cause)
        .build());
  }

  public void getURL(URL result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getURL")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getURL(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getURL")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateShort(String columnLabel, short x) {
    trace(new Trace.Builder("ResultSet", "updateShort")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateShort(Throwable cause, String columnLabel, short x) {
    trace(new Trace.Builder("ResultSet", "updateShort")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getHoldability(int result) {
    trace(new Trace.Builder("ResultSet", "getHoldability")
        .returned(result)
        .build());
  }

  public void getHoldability(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getHoldability")
        .threw(cause)
        .build());
  }

  public void updateShort(int columnIndex, short x) {
    trace(new Trace.Builder("ResultSet", "updateShort")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateShort(Throwable cause, int columnIndex, short x) {
    trace(new Trace.Builder("ResultSet", "updateShort")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateAsciiStream(int columnIndex, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateAsciiStream(Throwable cause, int columnIndex, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateNClob(int columnIndex, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateNClob(Throwable cause, int columnIndex, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getArray(Array result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getArray")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getArray")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getObject(Object result, String columnLabel, Map<String, Class<?>> map) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, String columnLabel, Map<String, Class<?>> map) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void updateNull(String columnLabel) {
    trace(new Trace.Builder("ResultSet", "updateNull")
        .withParameter("columnLabel", columnLabel)
        .returned()
        .build());
  }

  public void updateNull(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "updateNull")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateByte(int columnIndex, byte x) {
    trace(new Trace.Builder("ResultSet", "updateByte")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateByte(Throwable cause, int columnIndex, byte x) {
    trace(new Trace.Builder("ResultSet", "updateByte")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getSQLXML(SQLXML result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getSQLXML")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getSQLXML(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getSQLXML")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateCharacterStream(String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void updateCharacterStream(Throwable cause, String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void getLong(long result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getLong")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getLong(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getLong")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getConcurrency(int result) {
    trace(new Trace.Builder("ResultSet", "getConcurrency")
        .returned(result)
        .build());
  }

  public void getConcurrency(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getConcurrency")
        .threw(cause)
        .build());
  }

  public void updateRowId(String columnLabel, RowId x) {
    trace(new Trace.Builder("ResultSet", "updateRowId")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateRowId(Throwable cause, String columnLabel, RowId x) {
    trace(new Trace.Builder("ResultSet", "updateRowId")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public <T> void getObject(T result, int columnIndex, Class<T> type) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public <T> void getObject(Throwable cause, int columnIndex, Class<T> type) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void updateBinaryStream(int columnIndex, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBinaryStream(Throwable cause, int columnIndex, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateObject(int columnIndex, Object x) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, int columnIndex, Object x) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void rowDeleted(boolean result) {
    trace(new Trace.Builder("ResultSet", "rowDeleted")
        .returned(result)
        .build());
  }

  public void rowDeleted(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "rowDeleted")
        .threw(cause)
        .build());
  }

  public void updateLong(int columnIndex, long x) {
    trace(new Trace.Builder("ResultSet", "updateLong")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateLong(Throwable cause, int columnIndex, long x) {
    trace(new Trace.Builder("ResultSet", "updateLong")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getBytes(byte[] result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBytes")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getBytes(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBytes")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateArray(int columnIndex, Array x) {
    trace(new Trace.Builder("ResultSet", "updateArray")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateArray(Throwable cause, int columnIndex, Array x) {
    trace(new Trace.Builder("ResultSet", "updateArray")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getNClob(NClob result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getNClob")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getNClob(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getNClob")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getBigDecimal(BigDecimal result, String columnLabel, int scale) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnLabel", columnLabel)
        .withParameter("scale", scale)
        .returned(result)
        .build());
  }

  public void getBigDecimal(Throwable cause, String columnLabel, int scale) {
    trace(new Trace.Builder("ResultSet", "getBigDecimal")
        .withParameter("columnLabel", columnLabel)
        .withParameter("scale", scale)
        .threw(cause)
        .build());
  }

  public void getURL(URL result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getURL")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getURL(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getURL")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void absolute(boolean result, int row) {
    trace(new Trace.Builder("ResultSet", "absolute")
        .withParameter("row", row)
        .returned(result)
        .build());
  }

  public void absolute(Throwable cause, int row) {
    trace(new Trace.Builder("ResultSet", "absolute")
        .withParameter("row", row)
        .threw(cause)
        .build());
  }

  public void getDate(Date result, int columnIndex, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnIndex", columnIndex)
        .withParameter("cal", cal)
        .returned(result)
        .build());
  }

  public void getDate(Throwable cause, int columnIndex, Calendar cal) {
    trace(new Trace.Builder("ResultSet", "getDate")
        .withParameter("columnIndex", columnIndex)
        .withParameter("cal", cal)
        .threw(cause)
        .build());
  }

  public void updateNString(String columnLabel, String nString) {
    trace(new Trace.Builder("ResultSet", "updateNString")
        .withParameter("columnLabel", columnLabel)
        .withParameter("nString", nString)
        .returned()
        .build());
  }

  public void updateNString(Throwable cause, String columnLabel, String nString) {
    trace(new Trace.Builder("ResultSet", "updateNString")
        .withParameter("columnLabel", columnLabel)
        .withParameter("nString", nString)
        .threw(cause)
        .build());
  }

  public void getNString(String result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getNString")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getNString(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getNString")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getByte(byte result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getByte")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getByte(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getByte")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateAsciiStream(String columnLabel, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateAsciiStream(Throwable cause, String columnLabel, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateCharacterStream(int columnIndex, Reader x, long length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateCharacterStream(Throwable cause, int columnIndex, Reader x, long length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getClob(Clob result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getClob")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getClob(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getClob")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getRef(Ref result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getRef")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getRef(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getRef")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getObject(Object result, int columnIndex, Map<String, Class<?>> map) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, int columnIndex, Map<String, Class<?>> map) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void isBeforeFirst(boolean result) {
    trace(new Trace.Builder("ResultSet", "isBeforeFirst")
        .returned(result)
        .build());
  }

  public void isBeforeFirst(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "isBeforeFirst")
        .threw(cause)
        .build());
  }

  public void updateNCharacterStream(int columnIndex, Reader x, long length) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateNCharacterStream(Throwable cause, int columnIndex, Reader x, long length) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateClob(String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .returned()
        .build());
  }

  public void updateClob(Throwable cause, String columnLabel, Reader reader) {
    trace(new Trace.Builder("ResultSet", "updateClob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .threw(cause)
        .build());
  }

  public void updateBinaryStream(int columnIndex, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateBinaryStream(Throwable cause, int columnIndex, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void isClosed(boolean result) {
    trace(new Trace.Builder("ResultSet", "isClosed")
        .returned(result)
        .build());
  }

  public void isClosed(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "isClosed")
        .threw(cause)
        .build());
  }

  public void updateInt(String columnLabel, int x) {
    trace(new Trace.Builder("ResultSet", "updateInt")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateInt(Throwable cause, String columnLabel, int x) {
    trace(new Trace.Builder("ResultSet", "updateInt")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getNCharacterStream(Reader result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getNCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getNCharacterStream(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getNCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateBoolean(String columnLabel, boolean x) {
    trace(new Trace.Builder("ResultSet", "updateBoolean")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBoolean(Throwable cause, String columnLabel, boolean x) {
    trace(new Trace.Builder("ResultSet", "updateBoolean")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateBinaryStream(String columnLabel, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateBinaryStream(Throwable cause, String columnLabel, InputStream x, long length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getBoolean(boolean result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBoolean")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getBoolean(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getBoolean")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateCharacterStream(int columnIndex, Reader x, int length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateCharacterStream(Throwable cause, int columnIndex, Reader x, int length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateBlob(int columnIndex, InputStream inputStream, long length) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateBlob(Throwable cause, int columnIndex, InputStream inputStream, long length) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateDouble(int columnIndex, double x) {
    trace(new Trace.Builder("ResultSet", "updateDouble")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateDouble(Throwable cause, int columnIndex, double x) {
    trace(new Trace.Builder("ResultSet", "updateDouble")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateRef(String columnLabel, Ref x) {
    trace(new Trace.Builder("ResultSet", "updateRef")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateRef(Throwable cause, String columnLabel, Ref x) {
    trace(new Trace.Builder("ResultSet", "updateRef")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateCharacterStream(String columnLabel, Reader reader, int length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateCharacterStream(Throwable cause, String columnLabel, Reader reader,
      int length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getShort(short result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getShort")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getShort(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getShort")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getUnicodeStream(InputStream result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getUnicodeStream")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getUnicodeStream(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getUnicodeStream")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getLong(long result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getLong")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getLong(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getLong")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getNClob(NClob result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getNClob")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getNClob(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getNClob")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void updateDate(String columnLabel, Date x) {
    trace(new Trace.Builder("ResultSet", "updateDate")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateDate(Throwable cause, String columnLabel, Date x) {
    trace(new Trace.Builder("ResultSet", "updateDate")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getBlob(Blob result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBlob")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getBlob(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getBlob")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void isLast(boolean result) {
    trace(new Trace.Builder("ResultSet", "isLast")
        .returned(result)
        .build());
  }

  public void isLast(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "isLast")
        .threw(cause)
        .build());
  }

  public void setFetchSize(int rows) {
    trace(new Trace.Builder("ResultSet", "setFetchSize")
        .withParameter("rows", rows)
        .returned()
        .build());
  }

  public void setFetchSize(Throwable cause, int rows) {
    trace(new Trace.Builder("ResultSet", "setFetchSize")
        .withParameter("rows", rows)
        .threw(cause)
        .build());
  }

  public void getRowId(RowId result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getRowId")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getRowId(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getRowId")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateCharacterStream(int columnIndex, Reader x) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateCharacterStream(Throwable cause, int columnIndex, Reader x) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getTimestamp(Timestamp result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getTimestamp(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getTimestamp")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public <T> void getObject(T result, String columnLabel, Class<T> type) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public <T> void getObject(Throwable cause, String columnLabel, Class<T> type) {
    trace(new Trace.Builder("ResultSet", "getObject")
        .withParameter("columnLabel", columnLabel)
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void clearWarnings() {
    trace(new Trace.Builder("ResultSet", "clearWarnings")
        .returned()
        .build());
  }

  public void clearWarnings(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "clearWarnings")
        .threw(cause)
        .build());
  }

  public void getRef(Ref result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getRef")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getRef(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getRef")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void getClob(Clob result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getClob")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getClob(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getClob")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getFloat(float result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getFloat")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getFloat(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getFloat")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getShort(short result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getShort")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getShort(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getShort")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void getNCharacterStream(Reader result, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getNCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .returned(result)
        .build());
  }

  public void getNCharacterStream(Throwable cause, int columnIndex) {
    trace(new Trace.Builder("ResultSet", "getNCharacterStream")
        .withParameter("columnIndex", columnIndex)
        .threw(cause)
        .build());
  }

  public void moveToInsertRow() {
    trace(new Trace.Builder("ResultSet", "moveToInsertRow")
        .returned()
        .build());
  }

  public void moveToInsertRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "moveToInsertRow")
        .threw(cause)
        .build());
  }

  public void updateSQLXML(String columnLabel, SQLXML xmlObject) {
    trace(new Trace.Builder("ResultSet", "updateSQLXML")
        .withParameter("columnLabel", columnLabel)
        .withParameter("xmlObject", xmlObject)
        .returned()
        .build());
  }

  public void updateSQLXML(Throwable cause, String columnLabel, SQLXML xmlObject) {
    trace(new Trace.Builder("ResultSet", "updateSQLXML")
        .withParameter("columnLabel", columnLabel)
        .withParameter("xmlObject", xmlObject)
        .threw(cause)
        .build());
  }

  public void updateNCharacterStream(String columnLabel, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateNCharacterStream(Throwable cause, String columnLabel, Reader reader,
      long length) {
    trace(new Trace.Builder("ResultSet", "updateNCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateSQLXML(int columnIndex, SQLXML xmlObject) {
    trace(new Trace.Builder("ResultSet", "updateSQLXML")
        .withParameter("columnIndex", columnIndex)
        .withParameter("xmlObject", xmlObject)
        .returned()
        .build());
  }

  public void updateSQLXML(Throwable cause, int columnIndex, SQLXML xmlObject) {
    trace(new Trace.Builder("ResultSet", "updateSQLXML")
        .withParameter("columnIndex", columnIndex)
        .withParameter("xmlObject", xmlObject)
        .threw(cause)
        .build());
  }

  public void insertRow() {
    trace(new Trace.Builder("ResultSet", "insertRow")
        .returned()
        .build());
  }

  public void insertRow(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "insertRow")
        .threw(cause)
        .build());
  }

  public void updateBlob(String columnLabel, Blob x) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBlob(Throwable cause, String columnLabel, Blob x) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .returned()
        .build());
  }

  public void updateObject(Throwable cause, int columnIndex, Object x, SQLType targetSqlType,
      int scaleOrLength) {
    trace(new Trace.Builder("ResultSet", "updateObject")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("targetSqlType", targetSqlType)
        .withParameter("scaleOrLength", scaleOrLength)
        .threw(cause)
        .build());
  }

  public void getInt(int result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getInt")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getInt(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getInt")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateNClob(int columnIndex, NClob nClob) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("nClob", nClob)
        .returned()
        .build());
  }

  public void updateNClob(Throwable cause, int columnIndex, NClob nClob) {
    trace(new Trace.Builder("ResultSet", "updateNClob")
        .withParameter("columnIndex", columnIndex)
        .withParameter("nClob", nClob)
        .threw(cause)
        .build());
  }

  public void updateRowId(int columnIndex, RowId x) {
    trace(new Trace.Builder("ResultSet", "updateRowId")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateRowId(Throwable cause, int columnIndex, RowId x) {
    trace(new Trace.Builder("ResultSet", "updateRowId")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void updateBinaryStream(String columnLabel, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateBinaryStream(Throwable cause, String columnLabel, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateBinaryStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateBoolean(int columnIndex, boolean x) {
    trace(new Trace.Builder("ResultSet", "updateBoolean")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateBoolean(Throwable cause, int columnIndex, boolean x) {
    trace(new Trace.Builder("ResultSet", "updateBoolean")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getWarnings(SQLWarning result) {
    trace(new Trace.Builder("ResultSet", "getWarnings")
        .returned(result)
        .build());
  }

  public void getWarnings(Throwable cause) {
    trace(new Trace.Builder("ResultSet", "getWarnings")
        .threw(cause)
        .build());
  }

  public void updateAsciiStream(int columnIndex, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .returned()
        .build());
  }

  public void updateAsciiStream(Throwable cause, int columnIndex, InputStream x) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .threw(cause)
        .build());
  }

  public void getTime(Time result, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnLabel", columnLabel)
        .returned(result)
        .build());
  }

  public void getTime(Throwable cause, String columnLabel) {
    trace(new Trace.Builder("ResultSet", "getTime")
        .withParameter("columnLabel", columnLabel)
        .threw(cause)
        .build());
  }

  public void updateCharacterStream(String columnLabel, Reader reader, long length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateCharacterStream(Throwable cause, String columnLabel, Reader reader,
      long length) {
    trace(new Trace.Builder("ResultSet", "updateCharacterStream")
        .withParameter("columnLabel", columnLabel)
        .withParameter("reader", reader)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateBlob(String columnLabel, InputStream inputStream, long length) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateBlob(Throwable cause, String columnLabel, InputStream inputStream,
      long length) {
    trace(new Trace.Builder("ResultSet", "updateBlob")
        .withParameter("columnLabel", columnLabel)
        .withParameter("inputStream", inputStream)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void updateAsciiStream(int columnIndex, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .returned()
        .build());
  }

  public void updateAsciiStream(Throwable cause, int columnIndex, InputStream x, int length) {
    trace(new Trace.Builder("ResultSet", "updateAsciiStream")
        .withParameter("columnIndex", columnIndex)
        .withParameter("x", x)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public RowIdListener newRowIdListener() {
    return new RowIdTracer(out);
  }

  public StatementListener newStatementListener() {
    return new StatementTracer(out);
  }

  public ArrayListener newArrayListener() {
    return new ArrayTracer(out);
  }

  public BlobListener newBlobListener() {
    return new BlobTracer(out);
  }

  public SQLXMLListener newSQLXMLListener() {
    return new SQLXMLTracer(out);
  }

  public ResultSetMetaDataListener newResultSetMetaDataListener() {
    return new ResultSetMetaDataTracer(out);
  }

  public NClobListener newNClobListener() {
    return new NClobTracer(out);
  }

  public ClobListener newClobListener() {
    return new ClobTracer(out);
  }

  public RefListener newRefListener() {
    return new RefTracer(out);
  }
}
