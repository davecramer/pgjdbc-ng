package com.impossibl.jdbc.spy;

import java.sql.ResultSet;
import java.util.Map;

public class ArrayTracer implements ArrayListener {
  TraceOutput out;

  public ArrayTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getArray(Object result, long index, int count) {
    trace(new Trace.Builder("Array", "getArray")
        .withParameter("index", index)
        .withParameter("count", count)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, long index, int count) {
    trace(new Trace.Builder("Array", "getArray")
        .withParameter("index", index)
        .withParameter("count", count)
        .threw(cause)
        .build());
  }

  public void free() {
    trace(new Trace.Builder("Array", "free")
        .returned()
        .build());
  }

  public void free(Throwable cause) {
    trace(new Trace.Builder("Array", "free")
        .threw(cause)
        .build());
  }

  public void getArray(Object result, long index, int count, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getArray")
        .withParameter("index", index)
        .withParameter("count", count)
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, long index, int count, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getArray")
        .withParameter("index", index)
        .withParameter("count", count)
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void getResultSet(ResultSet result) {
    trace(new Trace.Builder("Array", "getResultSet")
        .returned(result)
        .build());
  }

  public void getResultSet(Throwable cause) {
    trace(new Trace.Builder("Array", "getResultSet")
        .threw(cause)
        .build());
  }

  public void getResultSet(ResultSet result, long index, int count) {
    trace(new Trace.Builder("Array", "getResultSet")
        .withParameter("index", index)
        .withParameter("count", count)
        .returned(result)
        .build());
  }

  public void getResultSet(Throwable cause, long index, int count) {
    trace(new Trace.Builder("Array", "getResultSet")
        .withParameter("index", index)
        .withParameter("count", count)
        .threw(cause)
        .build());
  }

  public void getArray(Object result) {
    trace(new Trace.Builder("Array", "getArray")
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause) {
    trace(new Trace.Builder("Array", "getArray")
        .threw(cause)
        .build());
  }

  public void getArray(Object result, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getArray")
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getArray(Throwable cause, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getArray")
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void getResultSet(ResultSet result, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getResultSet")
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getResultSet(Throwable cause, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getResultSet")
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void getResultSet(ResultSet result, long index, int count, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getResultSet")
        .withParameter("index", index)
        .withParameter("count", count)
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getResultSet(Throwable cause, long index, int count, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Array", "getResultSet")
        .withParameter("index", index)
        .withParameter("count", count)
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void getBaseTypeName(String result) {
    trace(new Trace.Builder("Array", "getBaseTypeName")
        .returned(result)
        .build());
  }

  public void getBaseTypeName(Throwable cause) {
    trace(new Trace.Builder("Array", "getBaseTypeName")
        .threw(cause)
        .build());
  }

  public void getBaseType(int result) {
    trace(new Trace.Builder("Array", "getBaseType")
        .returned(result)
        .build());
  }

  public void getBaseType(Throwable cause) {
    trace(new Trace.Builder("Array", "getBaseType")
        .threw(cause)
        .build());
  }

  public ResultSetListener newResultSetListener() {
    return new ResultSetTracer(out);
  }
}
