package org.postgresql.ng.spy;

import java.sql.ParameterMetaData;
import java.sql.SQLException;

public class ParameterMetaDataRelay implements Relay<ParameterMetaData>, ParameterMetaData {
  public ParameterMetaData target;

  public ParameterMetaDataListener listener;

  public ParameterMetaDataRelay(ParameterMetaData target, ParameterMetaDataListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public ParameterMetaData getTarget() {
    return target;
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

  public String getParameterClassName(int param) throws SQLException {
    try {
      String targetSuccessResult = this.target.getParameterClassName(param);
      this.listener.getParameterClassName(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getParameterClassName(targetFailureCause, param);
      throw targetFailureCause;

    }
  }

  public int getParameterType(int param) throws SQLException {
    try {
      int targetSuccessResult = this.target.getParameterType(param);
      this.listener.getParameterType(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getParameterType(targetFailureCause, param);
      throw targetFailureCause;

    }
  }

  public int isNullable(int param) throws SQLException {
    try {
      int targetSuccessResult = this.target.isNullable(param);
      this.listener.isNullable(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isNullable(targetFailureCause, param);
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

  public int getParameterCount() throws SQLException {
    try {
      int targetSuccessResult = this.target.getParameterCount();
      this.listener.getParameterCount(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getParameterCount(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getPrecision(int param) throws SQLException {
    try {
      int targetSuccessResult = this.target.getPrecision(param);
      this.listener.getPrecision(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getPrecision(targetFailureCause, param);
      throw targetFailureCause;

    }
  }

  public int getScale(int param) throws SQLException {
    try {
      int targetSuccessResult = this.target.getScale(param);
      this.listener.getScale(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getScale(targetFailureCause, param);
      throw targetFailureCause;

    }
  }

  public int getParameterMode(int param) throws SQLException {
    try {
      int targetSuccessResult = this.target.getParameterMode(param);
      this.listener.getParameterMode(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getParameterMode(targetFailureCause, param);
      throw targetFailureCause;

    }
  }

  public boolean isSigned(int param) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isSigned(param);
      this.listener.isSigned(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isSigned(targetFailureCause, param);
      throw targetFailureCause;

    }
  }

  public String getParameterTypeName(int param) throws SQLException {
    try {
      String targetSuccessResult = this.target.getParameterTypeName(param);
      this.listener.getParameterTypeName(targetSuccessResult, param);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getParameterTypeName(targetFailureCause, param);
      throw targetFailureCause;

    }
  }
}
