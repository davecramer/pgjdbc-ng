package com.impossibl.jdbc.spy;

public class ResultSetMetaDataTracer implements ResultSetMetaDataListener {
  TraceOutput out;

  public ResultSetMetaDataTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getColumnType(int result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnType")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getColumnType(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnType")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getColumnTypeName(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnTypeName")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getColumnTypeName(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnTypeName")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getColumnClassName(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnClassName")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getColumnClassName(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnClassName")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isCurrency(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isCurrency")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isCurrency(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isCurrency")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isReadOnly(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isReadOnly")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isReadOnly(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isReadOnly")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isDefinitelyWritable(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isDefinitelyWritable")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isDefinitelyWritable(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isDefinitelyWritable")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isNullable(int result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isNullable")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isNullable(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isNullable")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isSearchable(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isSearchable")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isSearchable(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isSearchable")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("ResultSetMetaData", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("ResultSetMetaData", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void getColumnDisplaySize(int result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnDisplaySize")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getColumnDisplaySize(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnDisplaySize")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getSchemaName(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getSchemaName")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getSchemaName(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getSchemaName")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isAutoIncrement(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isAutoIncrement")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isAutoIncrement(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isAutoIncrement")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isSigned(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isSigned")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isSigned(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isSigned")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getCatalogName(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getCatalogName")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getCatalogName(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getCatalogName")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isWritable(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isWritable")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isWritable(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isWritable")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void isCaseSensitive(boolean result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isCaseSensitive")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void isCaseSensitive(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "isCaseSensitive")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getColumnCount(int result) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnCount")
        .returned(result)
        .build());
  }

  public void getColumnCount(Throwable cause) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnCount")
        .threw(cause)
        .build());
  }

  public void getPrecision(int result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getPrecision")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getPrecision(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getPrecision")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("ResultSetMetaData", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("ResultSetMetaData", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void getTableName(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getTableName")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getTableName(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getTableName")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getColumnName(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnName")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getColumnName(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnName")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getScale(int result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getScale")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getScale(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getScale")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }

  public void getColumnLabel(String result, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnLabel")
        .withParameter("column", column)
        .returned(result)
        .build());
  }

  public void getColumnLabel(Throwable cause, int column) {
    trace(new Trace.Builder("ResultSetMetaData", "getColumnLabel")
        .withParameter("column", column)
        .threw(cause)
        .build());
  }
}
