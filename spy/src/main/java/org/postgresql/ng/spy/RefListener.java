package org.postgresql.ng.spy;

import java.util.Map;

interface RefListener {
  void getObject(Object targetSuccessResult, Map<String, Class<?>> map);

  void getObject(Throwable targetFailureCause, Map<String, Class<?>> map);

  void getObject(Object targetSuccessResult);

  void getObject(Throwable targetFailureCause);

  void getBaseTypeName(String targetSuccessResult);

  void getBaseTypeName(Throwable targetFailureCause);

  void setObject(Object value);

  void setObject(Throwable targetFailureCause, Object value);
}
