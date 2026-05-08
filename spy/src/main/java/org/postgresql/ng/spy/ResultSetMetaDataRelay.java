package org.postgresql.ng.spy;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ResultSetMetaDataRelay implements Relay<ResultSetMetaData>, ResultSetMetaData {
  public ResultSetMetaData target;

  public ResultSetMetaDataListener listener;

  public ResultSetMetaDataRelay(ResultSetMetaData target, ResultSetMetaDataListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public ResultSetMetaData getTarget() {
    return target;
  }

  public int getColumnType(int column) throws SQLException {
    try {
      int targetSuccessResult = this.target.getColumnType(column);
      this.listener.getColumnType(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnType(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public String getColumnTypeName(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getColumnTypeName(column);
      this.listener.getColumnTypeName(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnTypeName(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public String getColumnClassName(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getColumnClassName(column);
      this.listener.getColumnClassName(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnClassName(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isCurrency(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isCurrency(column);
      this.listener.isCurrency(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isCurrency(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isReadOnly(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isReadOnly(column);
      this.listener.isReadOnly(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isReadOnly(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isDefinitelyWritable(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isDefinitelyWritable(column);
      this.listener.isDefinitelyWritable(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isDefinitelyWritable(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public int isNullable(int column) throws SQLException {
    try {
      int targetSuccessResult = this.target.isNullable(column);
      this.listener.isNullable(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isNullable(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isSearchable(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isSearchable(column);
      this.listener.isSearchable(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isSearchable(targetFailureCause, column);
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

  public int getColumnDisplaySize(int column) throws SQLException {
    try {
      int targetSuccessResult = this.target.getColumnDisplaySize(column);
      this.listener.getColumnDisplaySize(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnDisplaySize(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public String getSchemaName(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getSchemaName(column);
      this.listener.getSchemaName(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSchemaName(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isAutoIncrement(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isAutoIncrement(column);
      this.listener.isAutoIncrement(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isAutoIncrement(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isSigned(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isSigned(column);
      this.listener.isSigned(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isSigned(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public String getCatalogName(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getCatalogName(column);
      this.listener.getCatalogName(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCatalogName(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isWritable(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isWritable(column);
      this.listener.isWritable(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isWritable(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public boolean isCaseSensitive(int column) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isCaseSensitive(column);
      this.listener.isCaseSensitive(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isCaseSensitive(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public int getColumnCount() throws SQLException {
    try {
      int targetSuccessResult = this.target.getColumnCount();
      this.listener.getColumnCount(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnCount(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getPrecision(int column) throws SQLException {
    try {
      int targetSuccessResult = this.target.getPrecision(column);
      this.listener.getPrecision(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getPrecision(targetFailureCause, column);
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

  public String getTableName(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getTableName(column);
      this.listener.getTableName(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTableName(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public String getColumnName(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getColumnName(column);
      this.listener.getColumnName(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnName(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public int getScale(int column) throws SQLException {
    try {
      int targetSuccessResult = this.target.getScale(column);
      this.listener.getScale(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getScale(targetFailureCause, column);
      throw targetFailureCause;

    }
  }

  public String getColumnLabel(int column) throws SQLException {
    try {
      String targetSuccessResult = this.target.getColumnLabel(column);
      this.listener.getColumnLabel(targetSuccessResult, column);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnLabel(targetFailureCause, column);
      throw targetFailureCause;

    }
  }
}
