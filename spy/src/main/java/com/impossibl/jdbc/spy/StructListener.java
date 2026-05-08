package com.impossibl.jdbc.spy;

import java.util.Map;

interface StructListener {
  void getSQLTypeName(String targetSuccessResult);

  void getSQLTypeName(Throwable targetFailureCause);

  void getAttributes(Object[] targetSuccessResult);

  void getAttributes(Throwable targetFailureCause);

  void getAttributes(Object[] targetSuccessResult, Map<String, Class<?>> map);

  void getAttributes(Throwable targetFailureCause, Map<String, Class<?>> map);
}
