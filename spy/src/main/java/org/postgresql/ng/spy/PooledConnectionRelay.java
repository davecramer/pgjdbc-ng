package org.postgresql.ng.spy;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.ConnectionEventListener;
import javax.sql.PooledConnection;
import javax.sql.StatementEventListener;

public class PooledConnectionRelay implements Relay<PooledConnection>, PooledConnection {
  public PooledConnection target;

  public PooledConnectionListener listener;

  public PooledConnectionRelay(PooledConnection target, PooledConnectionListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public PooledConnection getTarget() {
    return target;
  }

  public void close() throws SQLException {
    try {
      this.target.close();
      this.listener.close();

    }
    catch(SQLException targetFailureCause) {
      this.listener.close(targetFailureCause);
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

  public void addConnectionEventListener(ConnectionEventListener listener) {
    try {
      this.target.addConnectionEventListener(listener);
      this.listener.addConnectionEventListener(listener);

    }
    catch(Throwable targetFailureCause) {
      this.listener.addConnectionEventListener(targetFailureCause, listener);
      throw targetFailureCause;

    }
  }

  public void removeStatementEventListener(StatementEventListener listener) {
    try {
      this.target.removeStatementEventListener(listener);
      this.listener.removeStatementEventListener(listener);

    }
    catch(Throwable targetFailureCause) {
      this.listener.removeStatementEventListener(targetFailureCause, listener);
      throw targetFailureCause;

    }
  }

  public void removeConnectionEventListener(ConnectionEventListener listener) {
    try {
      this.target.removeConnectionEventListener(listener);
      this.listener.removeConnectionEventListener(listener);

    }
    catch(Throwable targetFailureCause) {
      this.listener.removeConnectionEventListener(targetFailureCause, listener);
      throw targetFailureCause;

    }
  }

  public void addStatementEventListener(StatementEventListener listener) {
    try {
      this.target.addStatementEventListener(listener);
      this.listener.addStatementEventListener(listener);

    }
    catch(Throwable targetFailureCause) {
      this.listener.addStatementEventListener(targetFailureCause, listener);
      throw targetFailureCause;

    }
  }
}
