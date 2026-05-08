package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.sql.DataSource;

public class DataSourceRelay implements Relay<DataSource>, DataSource {
  public DataSource target;

  public DataSourceListener listener;

  public DataSourceRelay(DataSource target, DataSourceListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public DataSource getTarget() {
    return target;
  }

  public Connection getConnection(String username, String password) throws SQLException {
    try {
      Connection targetSuccessResult = this.target.getConnection(username, password);
      this.listener.getConnection(targetSuccessResult, username, password);
      targetSuccessResult = targetSuccessResult != null ? new ConnectionRelay(targetSuccessResult, this.listener.newConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getConnection(targetFailureCause, username, password);
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

  public Connection getConnection() throws SQLException {
    try {
      Connection targetSuccessResult = this.target.getConnection();
      this.listener.getConnection(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ConnectionRelay(targetSuccessResult, this.listener.newConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getConnection(targetFailureCause);
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

  public <T> T unwrap(Class<T> iface) throws SQLException {
    try {
      T targetSuccessResult = this.target.unwrap(iface);
      this.listener.unwrap(targetSuccessResult, iface);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.unwrap(targetFailureCause, iface);
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

  public boolean isWrapperFor(Class<?> iface) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isWrapperFor(iface);
      this.listener.isWrapperFor(targetSuccessResult, iface);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isWrapperFor(targetFailureCause, iface);
      throw targetFailureCause;

    }
  }
}
