package com.impossibl.jdbc.spy;

public class RowIdTracer implements RowIdListener {
  TraceOutput out;

  public RowIdTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void toString(String result) {
    trace(new Trace.Builder("RowId", "toString")
        .returned(result)
        .build());
  }

  public void toString(Throwable cause) {
    trace(new Trace.Builder("RowId", "toString")
        .threw(cause)
        .build());
  }

  public void equals(boolean result, Object obj) {
    trace(new Trace.Builder("RowId", "equals")
        .withParameter("obj", obj)
        .returned(result)
        .build());
  }

  public void equals(Throwable cause, Object obj) {
    trace(new Trace.Builder("RowId", "equals")
        .withParameter("obj", obj)
        .threw(cause)
        .build());
  }

  public void getBytes(byte[] result) {
    trace(new Trace.Builder("RowId", "getBytes")
        .returned(result)
        .build());
  }

  public void getBytes(Throwable cause) {
    trace(new Trace.Builder("RowId", "getBytes")
        .threw(cause)
        .build());
  }

  public void hashCode(int result) {
    trace(new Trace.Builder("RowId", "hashCode")
        .returned(result)
        .build());
  }

  public void hashCode(Throwable cause) {
    trace(new Trace.Builder("RowId", "hashCode")
        .threw(cause)
        .build());
  }
}
