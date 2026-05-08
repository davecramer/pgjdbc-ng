package com.impossibl.jdbc.spy;

import java.sql.Connection;
import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;
import javax.transaction.xa.XAResource;

public class XAConnectionTracer implements XAConnectionListener {
  TraceOutput out;

  public XAConnectionTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void addConnectionEventListener(ConnectionEventListener listener) {
    trace(new Trace.Builder("XAConnection", "addConnectionEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void addConnectionEventListener(Throwable cause, ConnectionEventListener listener) {
    trace(new Trace.Builder("XAConnection", "addConnectionEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void addStatementEventListener(StatementEventListener listener) {
    trace(new Trace.Builder("XAConnection", "addStatementEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void addStatementEventListener(Throwable cause, StatementEventListener listener) {
    trace(new Trace.Builder("XAConnection", "addStatementEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void removeConnectionEventListener(ConnectionEventListener listener) {
    trace(new Trace.Builder("XAConnection", "removeConnectionEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void removeConnectionEventListener(Throwable cause, ConnectionEventListener listener) {
    trace(new Trace.Builder("XAConnection", "removeConnectionEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void getXAResource(XAResource result) {
    trace(new Trace.Builder("XAConnection", "getXAResource")
        .returned(result)
        .build());
  }

  public void getXAResource(Throwable cause) {
    trace(new Trace.Builder("XAConnection", "getXAResource")
        .threw(cause)
        .build());
  }

  public void close() {
    trace(new Trace.Builder("XAConnection", "close")
        .returned()
        .build());
  }

  public void close(Throwable cause) {
    trace(new Trace.Builder("XAConnection", "close")
        .threw(cause)
        .build());
  }

  public void removeStatementEventListener(StatementEventListener listener) {
    trace(new Trace.Builder("XAConnection", "removeStatementEventListener")
        .withParameter("listener", listener)
        .returned()
        .build());
  }

  public void removeStatementEventListener(Throwable cause, StatementEventListener listener) {
    trace(new Trace.Builder("XAConnection", "removeStatementEventListener")
        .withParameter("listener", listener)
        .threw(cause)
        .build());
  }

  public void getConnection(Connection result) {
    trace(new Trace.Builder("XAConnection", "getConnection")
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause) {
    trace(new Trace.Builder("XAConnection", "getConnection")
        .threw(cause)
        .build());
  }

  public ConnectionListener newConnectionListener() {
    return new ConnectionTracer(out);
  }
}
