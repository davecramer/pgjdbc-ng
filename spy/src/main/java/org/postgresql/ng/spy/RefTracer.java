package org.postgresql.ng.spy;

import java.util.Map;

public class RefTracer implements RefListener {
  TraceOutput out;

  public RefTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getObject(Object result, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Ref", "getObject")
        .withParameter("map", map)
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Ref", "getObject")
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void getObject(Object result) {
    trace(new Trace.Builder("Ref", "getObject")
        .returned(result)
        .build());
  }

  public void getObject(Throwable cause) {
    trace(new Trace.Builder("Ref", "getObject")
        .threw(cause)
        .build());
  }

  public void getBaseTypeName(String result) {
    trace(new Trace.Builder("Ref", "getBaseTypeName")
        .returned(result)
        .build());
  }

  public void getBaseTypeName(Throwable cause) {
    trace(new Trace.Builder("Ref", "getBaseTypeName")
        .threw(cause)
        .build());
  }

  public void setObject(Object value) {
    trace(new Trace.Builder("Ref", "setObject")
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setObject(Throwable cause, Object value) {
    trace(new Trace.Builder("Ref", "setObject")
        .withParameter("value", value)
        .threw(cause)
        .build());
  }
}
