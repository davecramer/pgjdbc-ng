package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Logger;

public class DataSourceTracer implements DataSourceListener {
  TraceOutput out;

  public DataSourceTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getConnection(Connection result, String username, String password) {
    trace(new Trace.Builder("DataSource", "getConnection")
        .withParameter("username", username)
        .withParameter("password", password)
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause, String username, String password) {
    trace(new Trace.Builder("DataSource", "getConnection")
        .withParameter("username", username)
        .withParameter("password", password)
        .threw(cause)
        .build());
  }

  public void getLoginTimeout(int result) {
    trace(new Trace.Builder("DataSource", "getLoginTimeout")
        .returned(result)
        .build());
  }

  public void getLoginTimeout(Throwable cause) {
    trace(new Trace.Builder("DataSource", "getLoginTimeout")
        .threw(cause)
        .build());
  }

  public void setLogWriter(PrintWriter out) {
    trace(new Trace.Builder("DataSource", "setLogWriter")
        .withParameter("out", out)
        .returned()
        .build());
  }

  public void setLogWriter(Throwable cause, PrintWriter out) {
    trace(new Trace.Builder("DataSource", "setLogWriter")
        .withParameter("out", out)
        .threw(cause)
        .build());
  }

  public void getParentLogger(Logger result) {
    trace(new Trace.Builder("DataSource", "getParentLogger")
        .returned(result)
        .build());
  }

  public void getParentLogger(Throwable cause) {
    trace(new Trace.Builder("DataSource", "getParentLogger")
        .threw(cause)
        .build());
  }

  public void getConnection(Connection result) {
    trace(new Trace.Builder("DataSource", "getConnection")
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause) {
    trace(new Trace.Builder("DataSource", "getConnection")
        .threw(cause)
        .build());
  }

  public void getLogWriter(PrintWriter result) {
    trace(new Trace.Builder("DataSource", "getLogWriter")
        .returned(result)
        .build());
  }

  public void getLogWriter(Throwable cause) {
    trace(new Trace.Builder("DataSource", "getLogWriter")
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("DataSource", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("DataSource", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void setLoginTimeout(int seconds) {
    trace(new Trace.Builder("DataSource", "setLoginTimeout")
        .withParameter("seconds", seconds)
        .returned()
        .build());
  }

  public void setLoginTimeout(Throwable cause, int seconds) {
    trace(new Trace.Builder("DataSource", "setLoginTimeout")
        .withParameter("seconds", seconds)
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("DataSource", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("DataSource", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public ConnectionListener newConnectionListener() {
    return new ConnectionTracer(out);
  }
}
