package com.impossibl.jdbc.spy;

import java.sql.Connection;
import javax.sql.ConnectionEventListener;
import javax.sql.StatementEventListener;
import javax.transaction.xa.XAResource;

interface XAConnectionListener {
  void addConnectionEventListener(ConnectionEventListener listener);

  void addConnectionEventListener(Throwable targetFailureCause, ConnectionEventListener listener);

  void addStatementEventListener(StatementEventListener listener);

  void addStatementEventListener(Throwable targetFailureCause, StatementEventListener listener);

  void removeConnectionEventListener(ConnectionEventListener listener);

  void removeConnectionEventListener(Throwable targetFailureCause,
      ConnectionEventListener listener);

  void getXAResource(XAResource targetSuccessResult);

  void getXAResource(Throwable targetFailureCause);

  void close();

  void close(Throwable targetFailureCause);

  void removeStatementEventListener(StatementEventListener listener);

  void removeStatementEventListener(Throwable targetFailureCause, StatementEventListener listener);

  void getConnection(Connection targetSuccessResult);

  void getConnection(Throwable targetFailureCause);

  ConnectionListener newConnectionListener();
}
