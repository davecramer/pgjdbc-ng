package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.sql.XAConnection;

interface XADataSourceListener {
  void getLoginTimeout(int targetSuccessResult);

  void getLoginTimeout(Throwable targetFailureCause);

  void setLogWriter(PrintWriter out);

  void setLogWriter(Throwable targetFailureCause, PrintWriter out);

  void setLoginTimeout(int seconds);

  void setLoginTimeout(Throwable targetFailureCause, int seconds);

  void getXAConnection(XAConnection targetSuccessResult, String user, String password);

  void getXAConnection(Throwable targetFailureCause, String user, String password);

  void getParentLogger(Logger targetSuccessResult);

  void getParentLogger(Throwable targetFailureCause);

  void getLogWriter(PrintWriter targetSuccessResult);

  void getLogWriter(Throwable targetFailureCause);

  void getXAConnection(XAConnection targetSuccessResult);

  void getXAConnection(Throwable targetFailureCause);

  XAConnectionListener newXAConnectionListener();
}
