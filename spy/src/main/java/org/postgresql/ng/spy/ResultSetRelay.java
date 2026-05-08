package org.postgresql.ng.spy;

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
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Statement;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Map;

public class ResultSetRelay implements Relay<ResultSet>, ResultSet {
  public ResultSet target;

  public ResultSetListener listener;

  public ResultSetRelay(ResultSet target, ResultSetListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public ResultSet getTarget() {
    return target;
  }

  public boolean first() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.first();
      this.listener.first(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.first(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Date getDate(int columnIndex) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(columnIndex);
      this.listener.getDate(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public Timestamp getTimestamp(int columnIndex, Calendar cal) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(columnIndex, cal);
      this.listener.getTimestamp(targetSuccessResult, columnIndex, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, columnIndex, cal);
      throw targetFailureCause;

    }
  }

  public void updateObject(String columnLabel, Object x, SQLType targetSqlType, int scaleOrLength)
      throws SQLException {
    try {
      this.target.updateObject(columnLabel, x, targetSqlType, scaleOrLength);
      this.listener.updateObject(columnLabel, x, targetSqlType, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnLabel, x, targetSqlType, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public void updateBigDecimal(int columnIndex, BigDecimal x) throws SQLException {
    try {
      this.target.updateBigDecimal(columnIndex, x);
      this.listener.updateBigDecimal(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBigDecimal(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateClob(int columnIndex, Reader reader, long length) throws SQLException {
    try {
      this.target.updateClob(columnIndex, reader, length);
      this.listener.updateClob(columnIndex, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateClob(targetFailureCause, columnIndex, reader, length);
      throw targetFailureCause;

    }
  }

  public Reader getCharacterStream(int columnIndex) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getCharacterStream(columnIndex);
      this.listener.getCharacterStream(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCharacterStream(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateString(String columnLabel, String x) throws SQLException {
    try {
      this.target.updateString(columnLabel, x);
      this.listener.updateString(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateString(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateDate(int columnIndex, Date x) throws SQLException {
    try {
      this.target.updateDate(columnIndex, x);
      this.listener.updateDate(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateDate(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public float getFloat(int columnIndex) throws SQLException {
    try {
      float targetSuccessResult = this.target.getFloat(columnIndex);
      this.listener.getFloat(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFloat(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public RowId getRowId(int columnIndex) throws SQLException {
    try {
      RowId targetSuccessResult = this.target.getRowId(columnIndex);
      this.listener.getRowId(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new RowIdRelay(targetSuccessResult, this.listener.newRowIdListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRowId(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public int findColumn(String columnLabel) throws SQLException {
    try {
      int targetSuccessResult = this.target.findColumn(columnLabel);
      this.listener.findColumn(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.findColumn(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public boolean relative(int rows) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.relative(rows);
      this.listener.relative(targetSuccessResult, rows);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.relative(targetFailureCause, rows);
      throw targetFailureCause;

    }
  }

  public void updateFloat(String columnLabel, float x) throws SQLException {
    try {
      this.target.updateFloat(columnLabel, x);
      this.listener.updateFloat(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateFloat(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateBigDecimal(String columnLabel, BigDecimal x) throws SQLException {
    try {
      this.target.updateBigDecimal(columnLabel, x);
      this.listener.updateBigDecimal(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBigDecimal(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateTimestamp(String columnLabel, Timestamp x) throws SQLException {
    try {
      this.target.updateTimestamp(columnLabel, x);
      this.listener.updateTimestamp(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateTimestamp(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public boolean previous() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.previous();
      this.listener.previous(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.previous(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateNClob(int columnIndex, Reader reader) throws SQLException {
    try {
      this.target.updateNClob(columnIndex, reader);
      this.listener.updateNClob(columnIndex, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNClob(targetFailureCause, columnIndex, reader);
      throw targetFailureCause;

    }
  }

  public void updateNClob(String columnLabel, Reader reader, long length) throws SQLException {
    try {
      this.target.updateNClob(columnLabel, reader, length);
      this.listener.updateNClob(columnLabel, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNClob(targetFailureCause, columnLabel, reader, length);
      throw targetFailureCause;

    }
  }

  public void updateBlob(String columnLabel, InputStream inputStream) throws SQLException {
    try {
      this.target.updateBlob(columnLabel, inputStream);
      this.listener.updateBlob(columnLabel, inputStream);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBlob(targetFailureCause, columnLabel, inputStream);
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

  public void updateTimestamp(int columnIndex, Timestamp x) throws SQLException {
    try {
      this.target.updateTimestamp(columnIndex, x);
      this.listener.updateTimestamp(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateTimestamp(targetFailureCause, columnIndex, x);
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

  public void updateClob(int columnIndex, Reader reader) throws SQLException {
    try {
      this.target.updateClob(columnIndex, reader);
      this.listener.updateClob(columnIndex, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateClob(targetFailureCause, columnIndex, reader);
      throw targetFailureCause;

    }
  }

  public void updateObject(String columnLabel, Object x, int scaleOrLength) throws SQLException {
    try {
      this.target.updateObject(columnLabel, x, scaleOrLength);
      this.listener.updateObject(columnLabel, x, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnLabel, x, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public Timestamp getTimestamp(String columnLabel, Calendar cal) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(columnLabel, cal);
      this.listener.getTimestamp(targetSuccessResult, columnLabel, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, columnLabel, cal);
      throw targetFailureCause;

    }
  }

  public void updateObject(int columnIndex, Object x, SQLType targetSqlType) throws SQLException {
    try {
      this.target.updateObject(columnIndex, x, targetSqlType);
      this.listener.updateObject(columnIndex, x, targetSqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnIndex, x, targetSqlType);
      throw targetFailureCause;

    }
  }

  public void updateBlob(int columnIndex, Blob x) throws SQLException {
    try {
      this.target.updateBlob(columnIndex, x);
      this.listener.updateBlob(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBlob(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateNCharacterStream(String columnLabel, Reader reader) throws SQLException {
    try {
      this.target.updateNCharacterStream(columnLabel, reader);
      this.listener.updateNCharacterStream(columnLabel, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNCharacterStream(targetFailureCause, columnLabel, reader);
      throw targetFailureCause;

    }
  }

  public boolean rowInserted() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.rowInserted();
      this.listener.rowInserted(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.rowInserted(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void cancelRowUpdates() throws SQLException {
    try {
      this.target.cancelRowUpdates();
      this.listener.cancelRowUpdates();

    }
    catch(SQLException targetFailureCause) {
      this.listener.cancelRowUpdates(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public InputStream getAsciiStream(String columnLabel) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getAsciiStream(columnLabel);
      this.listener.getAsciiStream(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAsciiStream(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateRow() throws SQLException {
    try {
      this.target.updateRow();
      this.listener.updateRow();

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateRow(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateTime(String columnLabel, Time x) throws SQLException {
    try {
      this.target.updateTime(columnLabel, x);
      this.listener.updateTime(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateTime(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public Date getDate(String columnLabel, Calendar cal) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(columnLabel, cal);
      this.listener.getDate(targetSuccessResult, columnLabel, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, columnLabel, cal);
      throw targetFailureCause;

    }
  }

  public void updateBlob(int columnIndex, InputStream inputStream) throws SQLException {
    try {
      this.target.updateBlob(columnIndex, inputStream);
      this.listener.updateBlob(columnIndex, inputStream);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBlob(targetFailureCause, columnIndex, inputStream);
      throw targetFailureCause;

    }
  }

  public Time getTime(int columnIndex, Calendar cal) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(columnIndex, cal);
      this.listener.getTime(targetSuccessResult, columnIndex, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, columnIndex, cal);
      throw targetFailureCause;

    }
  }

  public String getCursorName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getCursorName();
      this.listener.getCursorName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCursorName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateByte(String columnLabel, byte x) throws SQLException {
    try {
      this.target.updateByte(columnLabel, x);
      this.listener.updateByte(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateByte(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void refreshRow() throws SQLException {
    try {
      this.target.refreshRow();
      this.listener.refreshRow();

    }
    catch(SQLException targetFailureCause) {
      this.listener.refreshRow(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateNCharacterStream(int columnIndex, Reader x) throws SQLException {
    try {
      this.target.updateNCharacterStream(columnIndex, x);
      this.listener.updateNCharacterStream(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNCharacterStream(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public Statement getStatement() throws SQLException {
    try {
      Statement targetSuccessResult = this.target.getStatement();
      this.listener.getStatement(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new StatementRelay(targetSuccessResult, this.listener.newStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getStatement(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateBinaryStream(String columnLabel, InputStream x) throws SQLException {
    try {
      this.target.updateBinaryStream(columnLabel, x);
      this.listener.updateBinaryStream(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBinaryStream(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public Array getArray(int columnIndex) throws SQLException {
    try {
      Array targetSuccessResult = this.target.getArray(columnIndex);
      this.listener.getArray(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new ArrayRelay(targetSuccessResult, this.listener.newArrayListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateFloat(int columnIndex, float x) throws SQLException {
    try {
      this.target.updateFloat(columnIndex, x);
      this.listener.updateFloat(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateFloat(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public byte getByte(int columnIndex) throws SQLException {
    try {
      byte targetSuccessResult = this.target.getByte(columnIndex);
      this.listener.getByte(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getByte(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateDouble(String columnLabel, double x) throws SQLException {
    try {
      this.target.updateDouble(columnLabel, x);
      this.listener.updateDouble(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateDouble(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateNClob(String columnLabel, Reader reader) throws SQLException {
    try {
      this.target.updateNClob(columnLabel, reader);
      this.listener.updateNClob(columnLabel, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNClob(targetFailureCause, columnLabel, reader);
      throw targetFailureCause;

    }
  }

  public boolean isFirst() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isFirst();
      this.listener.isFirst(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isFirst(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateObject(String columnLabel, Object x) throws SQLException {
    try {
      this.target.updateObject(columnLabel, x);
      this.listener.updateObject(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public int getInt(int columnIndex) throws SQLException {
    try {
      int targetSuccessResult = this.target.getInt(columnIndex);
      this.listener.getInt(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getInt(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public Time getTime(String columnLabel, Calendar cal) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(columnLabel, cal);
      this.listener.getTime(targetSuccessResult, columnLabel, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, columnLabel, cal);
      throw targetFailureCause;

    }
  }

  public InputStream getBinaryStream(String columnLabel) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getBinaryStream(columnLabel);
      this.listener.getBinaryStream(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBinaryStream(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public double getDouble(String columnLabel) throws SQLException {
    try {
      double targetSuccessResult = this.target.getDouble(columnLabel);
      this.listener.getDouble(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDouble(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateNClob(String columnLabel, NClob nClob) throws SQLException {
    try {
      this.target.updateNClob(columnLabel, nClob);
      this.listener.updateNClob(columnLabel, nClob);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNClob(targetFailureCause, columnLabel, nClob);
      throw targetFailureCause;

    }
  }

  public Timestamp getTimestamp(int columnIndex) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(columnIndex);
      this.listener.getTimestamp(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateClob(String columnLabel, Clob x) throws SQLException {
    try {
      this.target.updateClob(columnLabel, x);
      this.listener.updateClob(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateClob(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(int columnIndex, int scale) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(columnIndex, scale);
      this.listener.getBigDecimal(targetSuccessResult, columnIndex, scale);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, columnIndex, scale);
      throw targetFailureCause;

    }
  }

  public void updateString(int columnIndex, String x) throws SQLException {
    try {
      this.target.updateString(columnIndex, x);
      this.listener.updateString(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateString(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateNull(int columnIndex) throws SQLException {
    try {
      this.target.updateNull(columnIndex);
      this.listener.updateNull(columnIndex);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNull(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public String getNString(String columnLabel) throws SQLException {
    try {
      String targetSuccessResult = this.target.getNString(columnLabel);
      this.listener.getNString(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNString(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public double getDouble(int columnIndex) throws SQLException {
    try {
      double targetSuccessResult = this.target.getDouble(columnIndex);
      this.listener.getDouble(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDouble(targetFailureCause, columnIndex);
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

  public Object getObject(String columnLabel) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(columnLabel);
      this.listener.getObject(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateAsciiStream(String columnLabel, InputStream x, int length) throws SQLException {
    try {
      this.target.updateAsciiStream(columnLabel, x, length);
      this.listener.updateAsciiStream(columnLabel, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateAsciiStream(targetFailureCause, columnLabel, x, length);
      throw targetFailureCause;

    }
  }

  public void updateInt(int columnIndex, int x) throws SQLException {
    try {
      this.target.updateInt(columnIndex, x);
      this.listener.updateInt(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateInt(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public BigDecimal getBigDecimal(String columnLabel) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(columnLabel);
      this.listener.getBigDecimal(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateArray(String columnLabel, Array x) throws SQLException {
    try {
      this.target.updateArray(columnLabel, x);
      this.listener.updateArray(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateArray(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateObject(String columnLabel, Object x, SQLType targetSqlType) throws
      SQLException {
    try {
      this.target.updateObject(columnLabel, x, targetSqlType);
      this.listener.updateObject(columnLabel, x, targetSqlType);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnLabel, x, targetSqlType);
      throw targetFailureCause;

    }
  }

  public void beforeFirst() throws SQLException {
    try {
      this.target.beforeFirst();
      this.listener.beforeFirst();

    }
    catch(SQLException targetFailureCause) {
      this.listener.beforeFirst(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateObject(int columnIndex, Object x, int scaleOrLength) throws SQLException {
    try {
      this.target.updateObject(columnIndex, x, scaleOrLength);
      this.listener.updateObject(columnIndex, x, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnIndex, x, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public void moveToCurrentRow() throws SQLException {
    try {
      this.target.moveToCurrentRow();
      this.listener.moveToCurrentRow();

    }
    catch(SQLException targetFailureCause) {
      this.listener.moveToCurrentRow(targetFailureCause);
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

  @SuppressWarnings("deprecation")
  public InputStream getUnicodeStream(int columnIndex) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getUnicodeStream(columnIndex);
      this.listener.getUnicodeStream(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getUnicodeStream(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public boolean getBoolean(String columnLabel) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getBoolean(columnLabel);
      this.listener.getBoolean(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBoolean(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public String getString(String columnLabel) throws SQLException {
    try {
      String targetSuccessResult = this.target.getString(columnLabel);
      this.listener.getString(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getString(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateNString(int columnIndex, String nString) throws SQLException {
    try {
      this.target.updateNString(columnIndex, nString);
      this.listener.updateNString(columnIndex, nString);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNString(targetFailureCause, columnIndex, nString);
      throw targetFailureCause;

    }
  }

  public void afterLast() throws SQLException {
    try {
      this.target.afterLast();
      this.listener.afterLast();

    }
    catch(SQLException targetFailureCause) {
      this.listener.afterLast(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateClob(String columnLabel, Reader reader, long length) throws SQLException {
    try {
      this.target.updateClob(columnLabel, reader, length);
      this.listener.updateClob(columnLabel, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateClob(targetFailureCause, columnLabel, reader, length);
      throw targetFailureCause;

    }
  }

  public int getRow() throws SQLException {
    try {
      int targetSuccessResult = this.target.getRow();
      this.listener.getRow(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRow(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Blob getBlob(int columnIndex) throws SQLException {
    try {
      Blob targetSuccessResult = this.target.getBlob(columnIndex);
      this.listener.getBlob(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new BlobRelay(targetSuccessResult, this.listener.newBlobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBlob(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateTime(int columnIndex, Time x) throws SQLException {
    try {
      this.target.updateTime(columnIndex, x);
      this.listener.updateTime(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateTime(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public boolean rowUpdated() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.rowUpdated();
      this.listener.rowUpdated(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.rowUpdated(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getString(int columnIndex) throws SQLException {
    try {
      String targetSuccessResult = this.target.getString(columnIndex);
      this.listener.getString(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getString(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public int getType() throws SQLException {
    try {
      int targetSuccessResult = this.target.getType();
      this.listener.getType(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getType(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public BigDecimal getBigDecimal(int columnIndex) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(columnIndex);
      this.listener.getBigDecimal(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateAsciiStream(String columnLabel, InputStream x, long length) throws
      SQLException {
    try {
      this.target.updateAsciiStream(columnLabel, x, length);
      this.listener.updateAsciiStream(columnLabel, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateAsciiStream(targetFailureCause, columnLabel, x, length);
      throw targetFailureCause;

    }
  }

  public byte[] getBytes(String columnLabel) throws SQLException {
    try {
      byte[] targetSuccessResult = this.target.getBytes(columnLabel);
      this.listener.getBytes(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBytes(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void deleteRow() throws SQLException {
    try {
      this.target.deleteRow();
      this.listener.deleteRow();

    }
    catch(SQLException targetFailureCause) {
      this.listener.deleteRow(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateBytes(int columnIndex, byte[] x) throws SQLException {
    try {
      this.target.updateBytes(columnIndex, x);
      this.listener.updateBytes(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBytes(targetFailureCause, columnIndex, x);
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

  public InputStream getBinaryStream(int columnIndex) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getBinaryStream(columnIndex);
      this.listener.getBinaryStream(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBinaryStream(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateBinaryStream(int columnIndex, InputStream x, int length) throws SQLException {
    try {
      this.target.updateBinaryStream(columnIndex, x, length);
      this.listener.updateBinaryStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBinaryStream(targetFailureCause, columnIndex, x, length);
      throw targetFailureCause;

    }
  }

  public boolean last() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.last();
      this.listener.last(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.last(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Object getObject(int columnIndex) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(columnIndex);
      this.listener.getObject(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateLong(String columnLabel, long x) throws SQLException {
    try {
      this.target.updateLong(columnLabel, x);
      this.listener.updateLong(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateLong(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateClob(int columnIndex, Clob x) throws SQLException {
    try {
      this.target.updateClob(columnIndex, x);
      this.listener.updateClob(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateClob(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public SQLXML getSQLXML(String columnLabel) throws SQLException {
    try {
      SQLXML targetSuccessResult = this.target.getSQLXML(columnLabel);
      this.listener.getSQLXML(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new SQLXMLRelay(targetSuccessResult, this.listener.newSQLXMLListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLXML(targetFailureCause, columnLabel);
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

  public void updateBytes(String columnLabel, byte[] x) throws SQLException {
    try {
      this.target.updateBytes(columnLabel, x);
      this.listener.updateBytes(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBytes(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateRef(int columnIndex, Ref x) throws SQLException {
    try {
      this.target.updateRef(columnIndex, x);
      this.listener.updateRef(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateRef(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public Date getDate(String columnLabel) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(columnLabel);
      this.listener.getDate(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public boolean next() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.next();
      this.listener.next(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.next(targetFailureCause);
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

  public InputStream getAsciiStream(int columnIndex) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getAsciiStream(columnIndex);
      this.listener.getAsciiStream(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAsciiStream(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public boolean isAfterLast() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isAfterLast();
      this.listener.isAfterLast(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isAfterLast(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public URL getURL(String columnLabel) throws SQLException {
    try {
      URL targetSuccessResult = this.target.getURL(columnLabel);
      this.listener.getURL(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getURL(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateShort(String columnLabel, short x) throws SQLException {
    try {
      this.target.updateShort(columnLabel, x);
      this.listener.updateShort(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateShort(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public int getHoldability() throws SQLException {
    try {
      int targetSuccessResult = this.target.getHoldability();
      this.listener.getHoldability(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getHoldability(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateShort(int columnIndex, short x) throws SQLException {
    try {
      this.target.updateShort(columnIndex, x);
      this.listener.updateShort(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateShort(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateAsciiStream(int columnIndex, InputStream x, long length) throws SQLException {
    try {
      this.target.updateAsciiStream(columnIndex, x, length);
      this.listener.updateAsciiStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateAsciiStream(targetFailureCause, columnIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void updateNClob(int columnIndex, Reader reader, long length) throws SQLException {
    try {
      this.target.updateNClob(columnIndex, reader, length);
      this.listener.updateNClob(columnIndex, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNClob(targetFailureCause, columnIndex, reader, length);
      throw targetFailureCause;

    }
  }

  public Array getArray(String columnLabel) throws SQLException {
    try {
      Array targetSuccessResult = this.target.getArray(columnLabel);
      this.listener.getArray(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new ArrayRelay(targetSuccessResult, this.listener.newArrayListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public Object getObject(String columnLabel, Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(columnLabel, map);
      this.listener.getObject(targetSuccessResult, columnLabel, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, columnLabel, map);
      throw targetFailureCause;

    }
  }

  public void updateNull(String columnLabel) throws SQLException {
    try {
      this.target.updateNull(columnLabel);
      this.listener.updateNull(columnLabel);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNull(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateByte(int columnIndex, byte x) throws SQLException {
    try {
      this.target.updateByte(columnIndex, x);
      this.listener.updateByte(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateByte(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public SQLXML getSQLXML(int columnIndex) throws SQLException {
    try {
      SQLXML targetSuccessResult = this.target.getSQLXML(columnIndex);
      this.listener.getSQLXML(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new SQLXMLRelay(targetSuccessResult, this.listener.newSQLXMLListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLXML(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateCharacterStream(String columnLabel, Reader reader) throws SQLException {
    try {
      this.target.updateCharacterStream(columnLabel, reader);
      this.listener.updateCharacterStream(columnLabel, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateCharacterStream(targetFailureCause, columnLabel, reader);
      throw targetFailureCause;

    }
  }

  public long getLong(int columnIndex) throws SQLException {
    try {
      long targetSuccessResult = this.target.getLong(columnIndex);
      this.listener.getLong(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLong(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public int getConcurrency() throws SQLException {
    try {
      int targetSuccessResult = this.target.getConcurrency();
      this.listener.getConcurrency(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getConcurrency(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateRowId(String columnLabel, RowId x) throws SQLException {
    try {
      this.target.updateRowId(columnLabel, x);
      this.listener.updateRowId(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateRowId(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public <T> T getObject(int columnIndex, Class<T> type) throws SQLException {
    try {
      T targetSuccessResult = this.target.getObject(columnIndex, type);
      this.listener.getObject(targetSuccessResult, columnIndex, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, columnIndex, type);
      throw targetFailureCause;

    }
  }

  public void updateBinaryStream(int columnIndex, InputStream x) throws SQLException {
    try {
      this.target.updateBinaryStream(columnIndex, x);
      this.listener.updateBinaryStream(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBinaryStream(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateObject(int columnIndex, Object x) throws SQLException {
    try {
      this.target.updateObject(columnIndex, x);
      this.listener.updateObject(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public boolean rowDeleted() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.rowDeleted();
      this.listener.rowDeleted(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.rowDeleted(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateLong(int columnIndex, long x) throws SQLException {
    try {
      this.target.updateLong(columnIndex, x);
      this.listener.updateLong(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateLong(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public byte[] getBytes(int columnIndex) throws SQLException {
    try {
      byte[] targetSuccessResult = this.target.getBytes(columnIndex);
      this.listener.getBytes(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBytes(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateArray(int columnIndex, Array x) throws SQLException {
    try {
      this.target.updateArray(columnIndex, x);
      this.listener.updateArray(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateArray(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public Time getTime(int columnIndex) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(columnIndex);
      this.listener.getTime(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public NClob getNClob(String columnLabel) throws SQLException {
    try {
      NClob targetSuccessResult = this.target.getNClob(columnLabel);
      this.listener.getNClob(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new NClobRelay(targetSuccessResult, this.listener.newNClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNClob(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  @SuppressWarnings("deprecation")
  public BigDecimal getBigDecimal(String columnLabel, int scale) throws SQLException {
    try {
      BigDecimal targetSuccessResult = this.target.getBigDecimal(columnLabel, scale);
      this.listener.getBigDecimal(targetSuccessResult, columnLabel, scale);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBigDecimal(targetFailureCause, columnLabel, scale);
      throw targetFailureCause;

    }
  }

  public URL getURL(int columnIndex) throws SQLException {
    try {
      URL targetSuccessResult = this.target.getURL(columnIndex);
      this.listener.getURL(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getURL(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public boolean absolute(int row) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.absolute(row);
      this.listener.absolute(targetSuccessResult, row);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.absolute(targetFailureCause, row);
      throw targetFailureCause;

    }
  }

  public Date getDate(int columnIndex, Calendar cal) throws SQLException {
    try {
      Date targetSuccessResult = this.target.getDate(columnIndex, cal);
      this.listener.getDate(targetSuccessResult, columnIndex, cal);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDate(targetFailureCause, columnIndex, cal);
      throw targetFailureCause;

    }
  }

  public void updateNString(String columnLabel, String nString) throws SQLException {
    try {
      this.target.updateNString(columnLabel, nString);
      this.listener.updateNString(columnLabel, nString);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNString(targetFailureCause, columnLabel, nString);
      throw targetFailureCause;

    }
  }

  public String getNString(int columnIndex) throws SQLException {
    try {
      String targetSuccessResult = this.target.getNString(columnIndex);
      this.listener.getNString(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNString(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public Reader getCharacterStream(String columnLabel) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getCharacterStream(columnLabel);
      this.listener.getCharacterStream(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCharacterStream(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public byte getByte(String columnLabel) throws SQLException {
    try {
      byte targetSuccessResult = this.target.getByte(columnLabel);
      this.listener.getByte(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getByte(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateAsciiStream(String columnLabel, InputStream x) throws SQLException {
    try {
      this.target.updateAsciiStream(columnLabel, x);
      this.listener.updateAsciiStream(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateAsciiStream(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    try {
      this.target.updateCharacterStream(columnIndex, x, length);
      this.listener.updateCharacterStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateCharacterStream(targetFailureCause, columnIndex, x, length);
      throw targetFailureCause;

    }
  }

  public Clob getClob(int columnIndex) throws SQLException {
    try {
      Clob targetSuccessResult = this.target.getClob(columnIndex);
      this.listener.getClob(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new ClobRelay(targetSuccessResult, this.listener.newClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClob(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public Ref getRef(String columnLabel) throws SQLException {
    try {
      Ref targetSuccessResult = this.target.getRef(columnLabel);
      this.listener.getRef(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new RefRelay(targetSuccessResult, this.listener.newRefListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRef(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public Object getObject(int columnIndex, Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(columnIndex, map);
      this.listener.getObject(targetSuccessResult, columnIndex, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, columnIndex, map);
      throw targetFailureCause;

    }
  }

  public boolean isBeforeFirst() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isBeforeFirst();
      this.listener.isBeforeFirst(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isBeforeFirst(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateNCharacterStream(int columnIndex, Reader x, long length) throws SQLException {
    try {
      this.target.updateNCharacterStream(columnIndex, x, length);
      this.listener.updateNCharacterStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNCharacterStream(targetFailureCause, columnIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void updateClob(String columnLabel, Reader reader) throws SQLException {
    try {
      this.target.updateClob(columnLabel, reader);
      this.listener.updateClob(columnLabel, reader);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateClob(targetFailureCause, columnLabel, reader);
      throw targetFailureCause;

    }
  }

  public void updateBinaryStream(int columnIndex, InputStream x, long length) throws SQLException {
    try {
      this.target.updateBinaryStream(columnIndex, x, length);
      this.listener.updateBinaryStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBinaryStream(targetFailureCause, columnIndex, x, length);
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

  public void updateInt(String columnLabel, int x) throws SQLException {
    try {
      this.target.updateInt(columnLabel, x);
      this.listener.updateInt(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateInt(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public Reader getNCharacterStream(String columnLabel) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getNCharacterStream(columnLabel);
      this.listener.getNCharacterStream(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNCharacterStream(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateBoolean(String columnLabel, boolean x) throws SQLException {
    try {
      this.target.updateBoolean(columnLabel, x);
      this.listener.updateBoolean(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBoolean(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateBinaryStream(String columnLabel, InputStream x, long length) throws
      SQLException {
    try {
      this.target.updateBinaryStream(columnLabel, x, length);
      this.listener.updateBinaryStream(columnLabel, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBinaryStream(targetFailureCause, columnLabel, x, length);
      throw targetFailureCause;

    }
  }

  public boolean getBoolean(int columnIndex) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getBoolean(columnIndex);
      this.listener.getBoolean(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBoolean(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateCharacterStream(int columnIndex, Reader x, int length) throws SQLException {
    try {
      this.target.updateCharacterStream(columnIndex, x, length);
      this.listener.updateCharacterStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateCharacterStream(targetFailureCause, columnIndex, x, length);
      throw targetFailureCause;

    }
  }

  public void updateBlob(int columnIndex, InputStream inputStream, long length) throws
      SQLException {
    try {
      this.target.updateBlob(columnIndex, inputStream, length);
      this.listener.updateBlob(columnIndex, inputStream, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBlob(targetFailureCause, columnIndex, inputStream, length);
      throw targetFailureCause;

    }
  }

  public void updateDouble(int columnIndex, double x) throws SQLException {
    try {
      this.target.updateDouble(columnIndex, x);
      this.listener.updateDouble(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateDouble(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateRef(String columnLabel, Ref x) throws SQLException {
    try {
      this.target.updateRef(columnLabel, x);
      this.listener.updateRef(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateRef(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateCharacterStream(String columnLabel, Reader reader, int length) throws
      SQLException {
    try {
      this.target.updateCharacterStream(columnLabel, reader, length);
      this.listener.updateCharacterStream(columnLabel, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateCharacterStream(targetFailureCause, columnLabel, reader, length);
      throw targetFailureCause;

    }
  }

  public short getShort(int columnIndex) throws SQLException {
    try {
      short targetSuccessResult = this.target.getShort(columnIndex);
      this.listener.getShort(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getShort(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  @SuppressWarnings("deprecation")
  public InputStream getUnicodeStream(String columnLabel) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getUnicodeStream(columnLabel);
      this.listener.getUnicodeStream(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getUnicodeStream(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public long getLong(String columnLabel) throws SQLException {
    try {
      long targetSuccessResult = this.target.getLong(columnLabel);
      this.listener.getLong(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLong(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public NClob getNClob(int columnIndex) throws SQLException {
    try {
      NClob targetSuccessResult = this.target.getNClob(columnIndex);
      this.listener.getNClob(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new NClobRelay(targetSuccessResult, this.listener.newNClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNClob(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void updateDate(String columnLabel, Date x) throws SQLException {
    try {
      this.target.updateDate(columnLabel, x);
      this.listener.updateDate(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateDate(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public Blob getBlob(String columnLabel) throws SQLException {
    try {
      Blob targetSuccessResult = this.target.getBlob(columnLabel);
      this.listener.getBlob(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new BlobRelay(targetSuccessResult, this.listener.newBlobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBlob(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public boolean isLast() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isLast();
      this.listener.isLast(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isLast(targetFailureCause);
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

  public RowId getRowId(String columnLabel) throws SQLException {
    try {
      RowId targetSuccessResult = this.target.getRowId(columnLabel);
      this.listener.getRowId(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new RowIdRelay(targetSuccessResult, this.listener.newRowIdListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRowId(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateCharacterStream(int columnIndex, Reader x) throws SQLException {
    try {
      this.target.updateCharacterStream(columnIndex, x);
      this.listener.updateCharacterStream(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateCharacterStream(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public Timestamp getTimestamp(String columnLabel) throws SQLException {
    try {
      Timestamp targetSuccessResult = this.target.getTimestamp(columnLabel);
      this.listener.getTimestamp(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimestamp(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public <T> T getObject(String columnLabel, Class<T> type) throws SQLException {
    try {
      T targetSuccessResult = this.target.getObject(columnLabel, type);
      this.listener.getObject(targetSuccessResult, columnLabel, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, columnLabel, type);
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

  public Ref getRef(int columnIndex) throws SQLException {
    try {
      Ref targetSuccessResult = this.target.getRef(columnIndex);
      this.listener.getRef(targetSuccessResult, columnIndex);
      targetSuccessResult = targetSuccessResult != null ? new RefRelay(targetSuccessResult, this.listener.newRefListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRef(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public Clob getClob(String columnLabel) throws SQLException {
    try {
      Clob targetSuccessResult = this.target.getClob(columnLabel);
      this.listener.getClob(targetSuccessResult, columnLabel);
      targetSuccessResult = targetSuccessResult != null ? new ClobRelay(targetSuccessResult, this.listener.newClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClob(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public float getFloat(String columnLabel) throws SQLException {
    try {
      float targetSuccessResult = this.target.getFloat(columnLabel);
      this.listener.getFloat(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFloat(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public short getShort(String columnLabel) throws SQLException {
    try {
      short targetSuccessResult = this.target.getShort(columnLabel);
      this.listener.getShort(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getShort(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public Reader getNCharacterStream(int columnIndex) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getNCharacterStream(columnIndex);
      this.listener.getNCharacterStream(targetSuccessResult, columnIndex);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNCharacterStream(targetFailureCause, columnIndex);
      throw targetFailureCause;

    }
  }

  public void moveToInsertRow() throws SQLException {
    try {
      this.target.moveToInsertRow();
      this.listener.moveToInsertRow();

    }
    catch(SQLException targetFailureCause) {
      this.listener.moveToInsertRow(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateSQLXML(String columnLabel, SQLXML xmlObject) throws SQLException {
    try {
      this.target.updateSQLXML(columnLabel, xmlObject);
      this.listener.updateSQLXML(columnLabel, xmlObject);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateSQLXML(targetFailureCause, columnLabel, xmlObject);
      throw targetFailureCause;

    }
  }

  public void updateNCharacterStream(String columnLabel, Reader reader, long length) throws
      SQLException {
    try {
      this.target.updateNCharacterStream(columnLabel, reader, length);
      this.listener.updateNCharacterStream(columnLabel, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNCharacterStream(targetFailureCause, columnLabel, reader, length);
      throw targetFailureCause;

    }
  }

  public void updateSQLXML(int columnIndex, SQLXML xmlObject) throws SQLException {
    try {
      this.target.updateSQLXML(columnIndex, xmlObject);
      this.listener.updateSQLXML(columnIndex, xmlObject);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateSQLXML(targetFailureCause, columnIndex, xmlObject);
      throw targetFailureCause;

    }
  }

  public void insertRow() throws SQLException {
    try {
      this.target.insertRow();
      this.listener.insertRow();

    }
    catch(SQLException targetFailureCause) {
      this.listener.insertRow(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void updateBlob(String columnLabel, Blob x) throws SQLException {
    try {
      this.target.updateBlob(columnLabel, x);
      this.listener.updateBlob(columnLabel, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBlob(targetFailureCause, columnLabel, x);
      throw targetFailureCause;

    }
  }

  public void updateObject(int columnIndex, Object x, SQLType targetSqlType, int scaleOrLength)
      throws SQLException {
    try {
      this.target.updateObject(columnIndex, x, targetSqlType, scaleOrLength);
      this.listener.updateObject(columnIndex, x, targetSqlType, scaleOrLength);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateObject(targetFailureCause, columnIndex, x, targetSqlType, scaleOrLength);
      throw targetFailureCause;

    }
  }

  public int getInt(String columnLabel) throws SQLException {
    try {
      int targetSuccessResult = this.target.getInt(columnLabel);
      this.listener.getInt(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getInt(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateNClob(int columnIndex, NClob nClob) throws SQLException {
    try {
      this.target.updateNClob(columnIndex, nClob);
      this.listener.updateNClob(columnIndex, nClob);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateNClob(targetFailureCause, columnIndex, nClob);
      throw targetFailureCause;

    }
  }

  public void updateRowId(int columnIndex, RowId x) throws SQLException {
    try {
      this.target.updateRowId(columnIndex, x);
      this.listener.updateRowId(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateRowId(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public void updateBinaryStream(String columnLabel, InputStream x, int length) throws
      SQLException {
    try {
      this.target.updateBinaryStream(columnLabel, x, length);
      this.listener.updateBinaryStream(columnLabel, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBinaryStream(targetFailureCause, columnLabel, x, length);
      throw targetFailureCause;

    }
  }

  public void updateBoolean(int columnIndex, boolean x) throws SQLException {
    try {
      this.target.updateBoolean(columnIndex, x);
      this.listener.updateBoolean(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBoolean(targetFailureCause, columnIndex, x);
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

  public void updateAsciiStream(int columnIndex, InputStream x) throws SQLException {
    try {
      this.target.updateAsciiStream(columnIndex, x);
      this.listener.updateAsciiStream(columnIndex, x);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateAsciiStream(targetFailureCause, columnIndex, x);
      throw targetFailureCause;

    }
  }

  public Time getTime(String columnLabel) throws SQLException {
    try {
      Time targetSuccessResult = this.target.getTime(columnLabel);
      this.listener.getTime(targetSuccessResult, columnLabel);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTime(targetFailureCause, columnLabel);
      throw targetFailureCause;

    }
  }

  public void updateCharacterStream(String columnLabel, Reader reader, long length) throws
      SQLException {
    try {
      this.target.updateCharacterStream(columnLabel, reader, length);
      this.listener.updateCharacterStream(columnLabel, reader, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateCharacterStream(targetFailureCause, columnLabel, reader, length);
      throw targetFailureCause;

    }
  }

  public void updateBlob(String columnLabel, InputStream inputStream, long length) throws
      SQLException {
    try {
      this.target.updateBlob(columnLabel, inputStream, length);
      this.listener.updateBlob(columnLabel, inputStream, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateBlob(targetFailureCause, columnLabel, inputStream, length);
      throw targetFailureCause;

    }
  }

  public void updateAsciiStream(int columnIndex, InputStream x, int length) throws SQLException {
    try {
      this.target.updateAsciiStream(columnIndex, x, length);
      this.listener.updateAsciiStream(columnIndex, x, length);

    }
    catch(SQLException targetFailureCause) {
      this.listener.updateAsciiStream(targetFailureCause, columnIndex, x, length);
      throw targetFailureCause;

    }
  }
}
