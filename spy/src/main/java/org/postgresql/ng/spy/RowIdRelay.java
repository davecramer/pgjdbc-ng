package org.postgresql.ng.spy;

import java.sql.RowId;

public class RowIdRelay implements Relay<RowId>, RowId {
  public RowId target;

  public RowIdListener listener;

  public RowIdRelay(RowId target, RowIdListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public RowId getTarget() {
    return target;
  }

  public String toString() {
    try {
      String targetSuccessResult = this.target.toString();
      this.listener.toString(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(Throwable targetFailureCause) {
      this.listener.toString(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean equals(Object obj) {
    try {
      boolean targetSuccessResult = this.target.equals(obj);
      this.listener.equals(targetSuccessResult, obj);
      return targetSuccessResult;

    }
    catch(Throwable targetFailureCause) {
      this.listener.equals(targetFailureCause, obj);
      throw targetFailureCause;

    }
  }

  public byte[] getBytes() {
    try {
      byte[] targetSuccessResult = this.target.getBytes();
      this.listener.getBytes(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(Throwable targetFailureCause) {
      this.listener.getBytes(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int hashCode() {
    try {
      int targetSuccessResult = this.target.hashCode();
      this.listener.hashCode(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(Throwable targetFailureCause) {
      this.listener.hashCode(targetFailureCause);
      throw targetFailureCause;

    }
  }
}
