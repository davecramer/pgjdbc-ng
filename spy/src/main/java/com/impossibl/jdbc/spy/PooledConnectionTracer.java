package com.impossibl.jdbc.spy;

import java.sql.Connection;
import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;

public class PooledConnectionTracer implements PooledConnectionListener {
  TraceOutput out;

  public PooledConnectionTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void close() {
    trace(new Trace.Builder("PooledConnection", "close")
        .returned()
        .build());
  }

  public void close(Throwable cause) {
    trace(new Trace.Builder("PooledConnection", "close")
        .threw(cause)
        .build());
  }

  public void getConnection(Connection result) {
    trace(new Trace.Builder("PooledConnection", "getConnection")
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause) {
    trace(new Trace.Builder("PooledConnection", "getConnection")
        .threw(cause)
        .build());
  }

  public void addConnectionEventListener(ConnectionEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "addConnectionEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void addConnectionEventListener(Throwable cause, ConnectionEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "addConnectionEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void removeStatementEventListener(StatementEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "removeStatementEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void removeStatementEventListener(Throwable cause, StatementEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "removeStatementEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void removeConnectionEventListener(ConnectionEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "removeConnectionEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void removeConnectionEventListener(Throwable cause, ConnectionEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "removeConnectionEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void addStatementEventListener(StatementEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "addStatementEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void addStatementEventListener(Throwable cause, StatementEventListener listener) {
    trace(new Trace.Builder("PooledConnection", "addStatementEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public ConnectionListener newConnectionListener() {
    return new ConnectionTracer(out);
  }
}
