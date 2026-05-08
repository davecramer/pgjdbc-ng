package org.postgresql.ng.spy;

interface ParameterMetaDataListener {
  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  void getParameterClassName(String targetSuccessResult, int param);

  void getParameterClassName(Throwable targetFailureCause, int param);

  void getParameterType(int targetSuccessResult, int param);

  void getParameterType(Throwable targetFailureCause, int param);

  void isNullable(int targetSuccessResult, int param);

  void isNullable(Throwable targetFailureCause, int param);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void getParameterCount(int targetSuccessResult);

  void getParameterCount(Throwable targetFailureCause);

  void getPrecision(int targetSuccessResult, int param);

  void getPrecision(Throwable targetFailureCause, int param);

  void getScale(int targetSuccessResult, int param);

  void getScale(Throwable targetFailureCause, int param);

  void getParameterMode(int targetSuccessResult, int param);

  void getParameterMode(Throwable targetFailureCause, int param);

  void isSigned(boolean targetSuccessResult, int param);

  void isSigned(Throwable targetFailureCause, int param);

  void getParameterTypeName(String targetSuccessResult, int param);

  void getParameterTypeName(Throwable targetFailureCause, int param);
}
