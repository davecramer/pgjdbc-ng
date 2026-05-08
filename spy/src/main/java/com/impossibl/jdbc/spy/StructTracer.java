package com.impossibl.jdbc.spy;

import java.util.Map;

public class StructTracer implements StructListener {
  TraceOutput out;

  public StructTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getSQLTypeName(String result) {
    trace(new Trace.Builder("Struct", "getSQLTypeName")
        .returned(result)
        .build());
  }

  public void getSQLTypeName(Throwable cause) {
    trace(new Trace.Builder("Struct", "getSQLTypeName")
        .threw(cause)
        .build());
  }

  public void getAttributes(Object[] result) {
    trace(new Trace.Builder("Struct", "getAttributes")
        .returned(result)
        .build());
  }

  public void getAttributes(Throwable cause) {
    trace(new Trace.Builder("Struct", "getAttributes")
        .threw(cause)
        .build());
  }

  public void getAttributes(Object[] result, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Struct", "getAttributes")
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getAttributes(Throwable cause, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Struct", "getAttributes")
        .withParameter("map", map)
        .threw(cause)
        .build());
  }
}
