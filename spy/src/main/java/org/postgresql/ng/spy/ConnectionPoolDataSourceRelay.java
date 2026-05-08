package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.sql.ConnectionPoolDataSource;
import javax.sql.PooledConnection;

public class ConnectionPoolDataSourceRelay implements Relay<ConnectionPoolDataSource>, ConnectionPoolDataSource {
  public ConnectionPoolDataSource target;

  public ConnectionPoolDataSourceListener listener;

  public ConnectionPoolDataSourceRelay(ConnectionPoolDataSource target,
      ConnectionPoolDataSourceListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public ConnectionPoolDataSource getTarget() {
    return target;
  }

  public void setLogWriter(PrintWriter out) throws SQLException {
    try {
      this.target.setLogWriter(out);
      this.listener.setLogWriter(out);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setLogWriter(targetFailureCause, out);
      throw targetFailureCause;

    }
  }

  public Logger getParentLogger() throws SQLFeatureNotSupportedException {
    try {
      Logger targetSuccessResult = this.target.getParentLogger();
      this.listener.getParentLogger(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLFeatureNotSupportedException targetFailureCause) {
      this.listener.getParentLogger(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public PooledConnection getPooledConnection() throws SQLException {
    try {
      PooledConnection targetSuccessResult = this.target.getPooledConnection();
      this.listener.getPooledConnection(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new PooledConnectionRelay(targetSuccessResult, this.listener.newPooledConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getPooledConnection(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public PrintWriter getLogWriter() throws SQLException {
    try {
      PrintWriter targetSuccessResult = this.target.getLogWriter();
      this.listener.getLogWriter(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLogWriter(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public PooledConnection getPooledConnection(String user, String password) throws SQLException {
    try {
      PooledConnection targetSuccessResult = this.target.getPooledConnection(user, password);
      this.listener.getPooledConnection(targetSuccessResult, user, password);
      targetSuccessResult = targetSuccessResult != null ? new PooledConnectionRelay(targetSuccessResult, this.listener.newPooledConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getPooledConnection(targetFailureCause, user, password);
      throw targetFailureCause;

    }
  }

  public void setLoginTimeout(int seconds) throws SQLException {
    try {
      this.target.setLoginTimeout(seconds);
      this.listener.setLoginTimeout(seconds);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setLoginTimeout(targetFailureCause, seconds);
      throw targetFailureCause;

    }
  }

  public int getLoginTimeout() throws SQLException {
    try {
      int targetSuccessResult = this.target.getLoginTimeout();
      this.listener.getLoginTimeout(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getLoginTimeout(targetFailureCause);
      throw targetFailureCause;

    }
  }
}
