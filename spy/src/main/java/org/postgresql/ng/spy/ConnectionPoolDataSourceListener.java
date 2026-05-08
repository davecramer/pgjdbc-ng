package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.util.logging.Logger;
import javax.sql.PooledConnection;

interface ConnectionPoolDataSourceListener {
  void setLogWriter(PrintWriter out);

  void setLogWriter(Throwable targetFailureCause, PrintWriter out);

  void getParentLogger(Logger targetSuccessResult);

  void getParentLogger(Throwable targetFailureCause);

  void getPooledConnection(PooledConnection targetSuccessResult);

  void getPooledConnection(Throwable targetFailureCause);

  void getLogWriter(PrintWriter targetSuccessResult);

  void getLogWriter(Throwable targetFailureCause);

  void getPooledConnection(PooledConnection targetSuccessResult, String user, String password);

  void getPooledConnection(Throwable targetFailureCause, String user, String password);

  void setLoginTimeout(int seconds);

  void setLoginTimeout(Throwable targetFailureCause, int seconds);

  void getLoginTimeout(int targetSuccessResult);

  void getLoginTimeout(Throwable targetFailureCause);

  PooledConnectionListener newPooledConnectionListener();
}
