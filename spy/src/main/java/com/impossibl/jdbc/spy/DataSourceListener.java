package com.impossibl.jdbc.spy;

import java.io.PrintWriter;
import java.sql.Connection;
import java.util.logging.Logger;

interface DataSourceListener {
  void getConnection(Connection targetSuccessResult, String username, String password);

  void getConnection(Throwable targetFailureCause, String username, String password);

  void getLoginTimeout(int targetSuccessResult);

  void getLoginTimeout(Throwable targetFailureCause);

  void setLogWriter(PrintWriter out);

  void setLogWriter(Throwable targetFailureCause, PrintWriter out);

  void getParentLogger(Logger targetSuccessResult);

  void getParentLogger(Throwable targetFailureCause);

  void getConnection(Connection targetSuccessResult);

  void getConnection(Throwable targetFailureCause);

  void getLogWriter(PrintWriter targetSuccessResult);

  void getLogWriter(Throwable targetFailureCause);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void setLoginTimeout(int seconds);

  void setLoginTimeout(Throwable targetFailureCause, int seconds);

  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  ConnectionListener newConnectionListener();
}
