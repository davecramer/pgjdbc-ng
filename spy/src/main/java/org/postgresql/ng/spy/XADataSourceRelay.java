package org.postgresql.ng.spy;

import java.io.PrintWriter;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.util.logging.Logger;
import javax.sql.XAConnection;
import javax.sql.XADataSource;

public class XADataSourceRelay implements Relay<XADataSource>, XADataSource {
  public XADataSource target;

  public XADataSourceListener listener;

  public XADataSourceRelay(XADataSource target, XADataSourceListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public XADataSource getTarget() {
    return target;
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

  public XAConnection getXAConnection(String user, String password) throws SQLException {
    try {
      XAConnection targetSuccessResult = this.target.getXAConnection(user, password);
      this.listener.getXAConnection(targetSuccessResult, user, password);
      targetSuccessResult = targetSuccessResult != null ? new XAConnectionRelay(targetSuccessResult, this.listener.newXAConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getXAConnection(targetFailureCause, user, password);
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

  public XAConnection getXAConnection() throws SQLException {
    try {
      XAConnection targetSuccessResult = this.target.getXAConnection();
      this.listener.getXAConnection(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new XAConnectionRelay(targetSuccessResult, this.listener.newXAConnectionListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getXAConnection(targetFailureCause);
      throw targetFailureCause;

    }
  }
}
