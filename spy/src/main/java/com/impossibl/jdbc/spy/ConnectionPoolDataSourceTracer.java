package com.impossibl.jdbc.spy;

import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.sql.PooledConnection;

public class ConnectionPoolDataSourceTracer implements ConnectionPoolDataSourceListener {
  TraceOutput out;

  public ConnectionPoolDataSourceTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void setLogWriter(PrintWriter out) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "setLogWriter")
        .withParameter("out", out)
        .returned()
        .build());
  }

  public void setLogWriter(Throwable cause, PrintWriter out) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "setLogWriter")
        .withParameter("out", out)
        .threw(cause)
        .build());
  }

  public void getParentLogger(Logger result) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getParentLogger")
        .returned(result)
        .build());
  }

  public void getParentLogger(Throwable cause) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getParentLogger")
        .threw(cause)
        .build());
  }

  public void getPooledConnection(PooledConnection result) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getPooledConnection")
        .returned(result)
        .build());
  }

  public void getPooledConnection(Throwable cause) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getPooledConnection")
        .threw(cause)
        .build());
  }

  public void getLogWriter(PrintWriter result) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getLogWriter")
        .returned(result)
        .build());
  }

  public void getLogWriter(Throwable cause) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getLogWriter")
        .threw(cause)
        .build());
  }

  public void getPooledConnection(PooledConnection result, String user, String password) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getPooledConnection")
        .withParameter("user", user)
        .withParameter("password", password)
        .returned(result)
        .build());
  }

  public void getPooledConnection(Throwable cause, String user, String password) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getPooledConnection")
        .withParameter("user", user)
        .withParameter("password", password)
        .threw(cause)
        .build());
  }

  public void setLoginTimeout(int seconds) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "setLoginTimeout")
        .withParameter("seconds", seconds)
        .returned()
        .build());
  }

  public void setLoginTimeout(Throwable cause, int seconds) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "setLoginTimeout")
        .withParameter("seconds", seconds)
        .threw(cause)
        .build());
  }

  public void getLoginTimeout(int result) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getLoginTimeout")
        .returned(result)
        .build());
  }

  public void getLoginTimeout(Throwable cause) {
    trace(new Trace.Builder("ConnectionPoolDataSource", "getLoginTimeout")
        .threw(cause)
        .build());
  }

  public PooledConnectionListener newPooledConnectionListener() {
    return new PooledConnectionTracer(out);
  }
}
