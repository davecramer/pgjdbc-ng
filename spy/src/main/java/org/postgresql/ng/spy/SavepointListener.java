package org.postgresql.ng.spy;

interface SavepointListener {
  void getSavepointName(String targetSuccessResult);

  void getSavepointName(Throwable targetFailureCause);

  void getSavepointId(int targetSuccessResult);

  void getSavepointId(Throwable targetFailureCause);
}
