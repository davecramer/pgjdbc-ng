package com.impossibl.jdbc.spy;

interface ResultSetMetaDataListener {
  void getColumnType(int targetSuccessResult, int column);

  void getColumnType(Throwable targetFailureCause, int column);

  void getColumnTypeName(String targetSuccessResult, int column);

  void getColumnTypeName(Throwable targetFailureCause, int column);

  void getColumnClassName(String targetSuccessResult, int column);

  void getColumnClassName(Throwable targetFailureCause, int column);

  void isCurrency(boolean targetSuccessResult, int column);

  void isCurrency(Throwable targetFailureCause, int column);

  void isReadOnly(boolean targetSuccessResult, int column);

  void isReadOnly(Throwable targetFailureCause, int column);

  void isDefinitelyWritable(boolean targetSuccessResult, int column);

  void isDefinitelyWritable(Throwable targetFailureCause, int column);

  void isNullable(int targetSuccessResult, int column);

  void isNullable(Throwable targetFailureCause, int column);

  void isSearchable(boolean targetSuccessResult, int column);

  void isSearchable(Throwable targetFailureCause, int column);

  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  void getColumnDisplaySize(int targetSuccessResult, int column);

  void getColumnDisplaySize(Throwable targetFailureCause, int column);

  void getSchemaName(String targetSuccessResult, int column);

  void getSchemaName(Throwable targetFailureCause, int column);

  void isAutoIncrement(boolean targetSuccessResult, int column);

  void isAutoIncrement(Throwable targetFailureCause, int column);

  void isSigned(boolean targetSuccessResult, int column);

  void isSigned(Throwable targetFailureCause, int column);

  void getCatalogName(String targetSuccessResult, int column);

  void getCatalogName(Throwable targetFailureCause, int column);

  void isWritable(boolean targetSuccessResult, int column);

  void isWritable(Throwable targetFailureCause, int column);

  void isCaseSensitive(boolean targetSuccessResult, int column);

  void isCaseSensitive(Throwable targetFailureCause, int column);

  void getColumnCount(int targetSuccessResult);

  void getColumnCount(Throwable targetFailureCause);

  void getPrecision(int targetSuccessResult, int column);

  void getPrecision(Throwable targetFailureCause, int column);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void getTableName(String targetSuccessResult, int column);

  void getTableName(Throwable targetFailureCause, int column);

  void getColumnName(String targetSuccessResult, int column);

  void getColumnName(Throwable targetFailureCause, int column);

  void getScale(int targetSuccessResult, int column);

  void getScale(Throwable targetFailureCause, int column);

  void getColumnLabel(String targetSuccessResult, int column);

  void getColumnLabel(Throwable targetFailureCause, int column);
}
