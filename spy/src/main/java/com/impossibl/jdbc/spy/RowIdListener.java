package com.impossibl.jdbc.spy;

interface RowIdListener {
  void toString(String targetSuccessResult);

  void toString(Throwable targetFailureCause);

  void equals(boolean targetSuccessResult, Object obj);

  void equals(Throwable targetFailureCause, Object obj);

  void getBytes(byte[] targetSuccessResult);

  void getBytes(Throwable targetFailureCause);

  void hashCode(int targetSuccessResult);

  void hashCode(Throwable targetFailureCause);
}
