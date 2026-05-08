package com.impossibl.jdbc.spy;

import java.sql.Connection;
import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;

interface PooledConnectionListener {
  void close();

  void close(Throwable targetFailureCause);

  void getConnection(Connection targetSuccessResult);

  void getConnection(Throwable targetFailureCause);

  void addConnectionEventListener(ConnectionEventListener listener);

  void addConnectionEventListener(Throwable targetFailureCause, ConnectionEventListener listener);

  void removeStatementEventListener(StatementEventListener listener);

  void removeStatementEventListener(Throwable targetFailureCause, StatementEventListener listener);

  void removeConnectionEventListener(ConnectionEventListener listener);

  void removeConnectionEventListener(Throwable targetFailureCause,
      ConnectionEventListener listener);

  void addStatementEventListener(StatementEventListener listener);

  void addStatementEventListener(Throwable targetFailureCause, StatementEventListener listener);

  ConnectionListener newConnectionListener();
}
