package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.sql.XAConnection;

public class XADataSourceTracer implements XADataSourceListener {
  TraceOutput out;

  public XADataSourceTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getLoginTimeout(int result) {
    trace(new Trace.Builder("XADataSource", "getLoginTimeout")
        .returned(result)
        .build());
  }

  public void getLoginTimeout(Throwable cause) {
    trace(new Trace.Builder("XADataSource", "getLoginTimeout")
        .threw(cause)
        .build());
  }

  public void setLogWriter(PrintWriter out) {
    trace(new Trace.Builder("XADataSource", "setLogWriter")
        .withParameter("out", out)
        .returned()
        .build());
  }

  public void setLogWriter(Throwable cause, PrintWriter out) {
    trace(new Trace.Builder("XADataSource", "setLogWriter")
        .withParameter("out", out)
        .threw(cause)
        .build());
  }

  public void setLoginTimeout(int seconds) {
    trace(new Trace.Builder("XADataSource", "setLoginTimeout")
        .withParameter("seconds", seconds)
        .returned()
        .build());
  }

  public void setLoginTimeout(Throwable cause, int seconds) {
    trace(new Trace.Builder("XADataSource", "setLoginTimeout")
        .withParameter("seconds", seconds)
        .threw(cause)
        .build());
  }

  public void getXAConnection(XAConnection result, String user, String password) {
    trace(new Trace.Builder("XADataSource", "getXAConnection")
        .withParameter("user", user)
        .withParameter("password", password)
        .returned(result)
        .build());
  }

  public void getXAConnection(Throwable cause, String user, String password) {
    trace(new Trace.Builder("XADataSource", "getXAConnection")
        .withParameter("user", user)
        .withParameter("password", password)
        .threw(cause)
        .build());
  }

  public void getParentLogger(Logger result) {
    trace(new Trace.Builder("XADataSource", "getParentLogger")
        .returned(result)
        .build());
  }

  public void getParentLogger(Throwable cause) {
    trace(new Trace.Builder("XADataSource", "getParentLogger")
        .threw(cause)
        .build());
  }

  public void getLogWriter(PrintWriter result) {
    trace(new Trace.Builder("XADataSource", "getLogWriter")
        .returned(result)
        .build());
  }

  public void getLogWriter(Throwable cause) {
    trace(new Trace.Builder("XADataSource", "getLogWriter")
        .threw(cause)
        .build());
  }

  public void getXAConnection(XAConnection result) {
    trace(new Trace.Builder("XADataSource", "getXAConnection")
        .returned(result)
        .build());
  }

  public void getXAConnection(Throwable cause) {
    trace(new Trace.Builder("XADataSource", "getXAConnection")
        .threw(cause)
        .build());
  }

  public XAConnectionListener newXAConnectionListener() {
    return new XAConnectionTracer(out);
  }
}
