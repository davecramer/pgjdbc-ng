package com.impossibl.jdbc.spy;

import java.sql.Ref;
import java.sql.SQLException;
import java.util.Map;

public class RefRelay implements Relay<Ref>, Ref {
  public Ref target;

  public RefListener listener;

  public RefRelay(Ref target, RefListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Ref getTarget() {
    return target;
  }

  public Object getObject(Map<String, Class<?>> map) throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject(map);
      this.listener.getObject(targetSuccessResult, map);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause, map);
      throw targetFailureCause;

    }
  }

  public Object getObject() throws SQLException {
    try {
      Object targetSuccessResult = this.target.getObject();
      this.listener.getObject(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getObject(targetFailureCause);
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

  public void setObject(Object value) throws SQLException {
    try {
      this.target.setObject(value);
      this.listener.setObject(value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setObject(targetFailureCause, value);
      throw targetFailureCause;

    }
  }
}
