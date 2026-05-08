package org.postgresql.ng.spy;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public class ArrayRelay implements Relay<Array>, Array {
  public Array target;

  public ArrayListener listener;

  public ArrayRelay(Array target, ArrayListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Array getTarget() {
    return target;
  }

  public Object getArray(long index, int count) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getArray(index, count);
      this.listener.getArray(targetSuccessResult, index, count);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, index, count);
      throw targetFailureCause;

    }
  }

  public void free() throws SQLException {
    try {
      this.target.free();
      this.listener.free();

    }
    catch(SQLException targetFailureCause) {
      this.listener.free(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Object getArray(long index, int count, Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getArray(index, count, map);
      this.listener.getArray(targetSuccessResult, index, count, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, index, count, map);
      throw targetFailureCause;

    }
  }

  public ResultSet getResultSet() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getResultSet();
      this.listener.getResultSet(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSet(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getResultSet(long index, int count) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getResultSet(index, count);
      this.listener.getResultSet(targetSuccessResult, index, count);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSet(targetFailureCause, index, count);
      throw targetFailureCause;

    }
  }

  public Object getArray() throws SQLException {
    try {
      Object targetSuccessResult = this.target.getArray();
      this.listener.getArray(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Object getArray(Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getArray(map);
      this.listener.getArray(targetSuccessResult, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getArray(targetFailureCause, map);
      throw targetFailureCause;

    }
  }

  public ResultSet getResultSet(Map<String, Class<?>> map) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getResultSet(map);
      this.listener.getResultSet(targetSuccessResult, map);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSet(targetFailureCause, map);
      throw targetFailureCause;

    }
  }

  public ResultSet getResultSet(long index, int count, Map<String, Class<?>> map) throws
      SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getResultSet(index, count, map);
      this.listener.getResultSet(targetSuccessResult, index, count, map);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSet(targetFailureCause, index, count, map);
      throw targetFailureCause;

    }
  }

  public String getBaseTypeName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getBaseTypeName();
      this.listener.getBaseTypeName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBaseTypeName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getBaseType() throws SQLException {
    try {
      int targetSuccessResult = this.target.getBaseType();
      this.listener.getBaseType(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBaseType(targetFailureCause);
      throw targetFailureCause;

    }
  }
}
