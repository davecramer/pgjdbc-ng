package org.postgresql.ng.spy;

public class SavepointTracer implements SavepointListener {
  TraceOutput out;

  public SavepointTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getSavepointName(String result) {
    trace(new Trace.Builder("Savepoint", "getSavepointName")
        .returned(result)
        .build());
  }

  public void getSavepointName(Throwable cause) {
    trace(new Trace.Builder("Savepoint", "getSavepointName")
        .threw(cause)
        .build());
  }

  public void getSavepointId(int result) {
    trace(new Trace.Builder("Savepoint", "getSavepointId")
        .returned(result)
        .build());
  }

  public void getSavepointId(Throwable cause) {
    trace(new Trace.Builder("Savepoint", "getSavepointId")
        .threw(cause)
        .build());
  }
}
