package com.impossibl.jdbc.spy;

import java.sql.SQLException;
import java.sql.Struct;
import java.util.Map;

public class StructRelay implements Relay<Struct>, Struct {
  public Struct target;

  public StructListener listener;

  public StructRelay(Struct target, StructListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Struct getTarget() {
    return target;
  }

  public String getSQLTypeName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSQLTypeName();
      this.listener.getSQLTypeName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLTypeName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Object[] getAttributes() throws SQLException {
    try {
      Object[] targetSuccessResult = this.target.getAttributes();
      this.listener.getAttributes(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAttributes(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Object[] getAttributes(Map<String, Class<?>> map) throws SQLException {
    try {
      Object[] targetSuccessResult = this.target.getAttributes(map);
      this.listener.getAttributes(targetSuccessResult, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAttributes(targetFailureCause, map);
      throw targetFailureCause;

    }
  }
}
