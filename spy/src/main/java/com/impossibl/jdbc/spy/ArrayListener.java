package com.impossibl.jdbc.spy;

import java.sql.ResultSet;
import java.util.Map;

interface ArrayListener {
  void getArray(Object targetSuccessResult, long index, int count);

  void getArray(Throwable targetFailureCause, long index, int count);

  void free();

  void free(Throwable targetFailureCause);

  void getArray(Object targetSuccessResult, long index, int count, Map<String, Class<?>> map);

  void getArray(Throwable targetFailureCause, long index, int count, Map<String, Class<?>> map);

  void getResultSet(ResultSet targetSuccessResult);

  void getResultSet(Throwable targetFailureCause);

  void getResultSet(ResultSet targetSuccessResult, long index, int count);

  void getResultSet(Throwable targetFailureCause, long index, int count);

  void getArray(Object targetSuccessResult);

  void getArray(Throwable targetFailureCause);

  void getArray(Object targetSuccessResult, Map<String, Class<?>> map);

  void getArray(Throwable targetFailureCause, Map<String, Class<?>> map);

  void getResultSet(ResultSet targetSuccessResult, Map<String, Class<?>> map);

  void getResultSet(Throwable targetFailureCause, Map<String, Class<?>> map);

  void getResultSet(ResultSet targetSuccessResult, long index, int count,
      Map<String, Class<?>> map);

  void getResultSet(Throwable targetFailureCause, long index, int count, Map<String, Class<?>> map);

  void getBaseTypeName(String targetSuccessResult);

  void getBaseTypeName(Throwable targetFailureCause);

  void getBaseType(int targetSuccessResult);

  void getBaseType(Throwable targetFailureCause);

  ResultSetListener newResultSetListener();
}
