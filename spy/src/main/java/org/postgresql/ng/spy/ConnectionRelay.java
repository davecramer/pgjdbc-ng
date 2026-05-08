package org.postgresql.ng.spy;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class ConnectionRelay implements Relay<Connection>, Connection {
  public Connection target;

  public ConnectionListener listener;

  public ConnectionRelay(Connection target, ConnectionListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Connection getTarget() {
    return target;
  }

  public String getCatalog() throws SQLException {
    try {
      String targetSuccessResult = this.target.getCatalog();
      this.listener.getCatalog(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCatalog(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void rollback(Savepoint savepoint) throws SQLException {
    try {
      this.target.rollback(savepoint);
      this.listener.rollback(savepoint);

    }
    catch(SQLException targetFailureCause) {
      this.listener.rollback(targetFailureCause, savepoint);
      throw targetFailureCause;

    }
  }

  public boolean isValid(int timeout) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isValid(timeout);
      this.listener.isValid(targetSuccessResult, timeout);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isValid(targetFailureCause, timeout);
      throw targetFailureCause;

    }
  }

  public void setClientInfo(Properties properties) throws SQLClientInfoException {
    try {
      this.target.setClientInfo(properties);
      this.listener.setClientInfo(properties);

    }
    catch(SQLClientInfoException targetFailureCause) {
      this.listener.setClientInfo(targetFailureCause, properties);
      throw targetFailureCause;

    }
  }

  public void setTransactionIsolation(int level) throws SQLException {
    try {
      this.target.setTransactionIsolation(level);
      this.listener.setTransactionIsolation(level);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTransactionIsolation(targetFailureCause, level);
      throw targetFailureCause;

    }
  }

  public void setCatalog(String catalog) throws SQLException {
    try {
      this.target.setCatalog(catalog);
      this.listener.setCatalog(catalog);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCatalog(targetFailureCause, catalog);
      throw targetFailureCause;

    }
  }

  public Properties getClientInfo() throws SQLException {
    try {
      Properties targetSuccessResult = this.target.getClientInfo();
      this.listener.getClientInfo(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClientInfo(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setSchema(String schema) throws SQLException {
    try {
      this.target.setSchema(schema);
      this.listener.setSchema(schema);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setSchema(targetFailureCause, schema);
      throw targetFailureCause;

    }
  }

  public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
    try {
      this.target.setNetworkTimeout(executor, milliseconds);
      this.listener.setNetworkTimeout(executor, milliseconds);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setNetworkTimeout(targetFailureCause, executor, milliseconds);
      throw targetFailureCause;

    }
  }

  public void abort(Executor executor) throws SQLException {
    try {
      this.target.abort(executor);
      this.listener.abort(executor);

    }
    catch(SQLException targetFailureCause) {
      this.listener.abort(targetFailureCause, executor);
      throw targetFailureCause;

    }
  }

  public int getHoldability() throws SQLException {
    try {
      int targetSuccessResult = this.target.getHoldability();
      this.listener.getHoldability(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getHoldability(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) throws SQLException {
    try {
      PreparedStatement targetSuccessResult = this.target.prepareStatement(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
      this.listener.prepareStatement(targetSuccessResult, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
      targetSuccessResult = targetSuccessResult != null ? new PreparedStatementRelay(targetSuccessResult, this.listener.newPreparedStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareStatement(targetFailureCause, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
      throw targetFailureCause;

    }
  }

  public DatabaseMetaData getMetaData() throws SQLException {
    try {
      DatabaseMetaData targetSuccessResult = this.target.getMetaData();
      this.listener.getMetaData(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new DatabaseMetaDataRelay(targetSuccessResult, this.listener.newDatabaseMetaDataListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMetaData(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean getAutoCommit() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.getAutoCommit();
      this.listener.getAutoCommit(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAutoCommit(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
    try {
      PreparedStatement targetSuccessResult = this.target.prepareStatement(sql, autoGeneratedKeys);
      this.listener.prepareStatement(targetSuccessResult, sql, autoGeneratedKeys);
      targetSuccessResult = targetSuccessResult != null ? new PreparedStatementRelay(targetSuccessResult, this.listener.newPreparedStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareStatement(targetFailureCause, sql, autoGeneratedKeys);
      throw targetFailureCause;

    }
  }

  public void rollback() throws SQLException {
    try {
      this.target.rollback();
      this.listener.rollback();

    }
    catch(SQLException targetFailureCause) {
      this.listener.rollback(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getTransactionIsolation() throws SQLException {
    try {
      int targetSuccessResult = this.target.getTransactionIsolation();
      this.listener.getTransactionIsolation(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTransactionIsolation(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Statement createStatement(int resultSetType, int resultSetConcurrency) throws
      SQLException {
    try {
      Statement targetSuccessResult = this.target.createStatement(resultSetType, resultSetConcurrency);
      this.listener.createStatement(targetSuccessResult, resultSetType, resultSetConcurrency);
      targetSuccessResult = targetSuccessResult != null ? new StatementRelay(targetSuccessResult, this.listener.newStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createStatement(targetFailureCause, resultSetType, resultSetConcurrency);
      throw targetFailureCause;

    }
  }

  public SQLXML createSQLXML() throws SQLException {
    try {
      SQLXML targetSuccessResult = this.target.createSQLXML();
      this.listener.createSQLXML(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new SQLXMLRelay(targetSuccessResult, this.listener.newSQLXMLListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createSQLXML(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
    try {
      this.target.setTypeMap(map);
      this.listener.setTypeMap(map);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setTypeMap(targetFailureCause, map);
      throw targetFailureCause;

    }
  }

  public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
    try {
      PreparedStatement targetSuccessResult = this.target.prepareStatement(sql, columnIndexes);
      this.listener.prepareStatement(targetSuccessResult, sql, columnIndexes);
      targetSuccessResult = targetSuccessResult != null ? new PreparedStatementRelay(targetSuccessResult, this.listener.newPreparedStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareStatement(targetFailureCause, sql, columnIndexes);
      throw targetFailureCause;

    }
  }

  public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
    try {
      Struct targetSuccessResult = this.target.createStruct(typeName, attributes);
      this.listener.createStruct(targetSuccessResult, typeName, attributes);
      targetSuccessResult = targetSuccessResult != null ? new StructRelay(targetSuccessResult, this.listener.newStructListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createStruct(targetFailureCause, typeName, attributes);
      throw targetFailureCause;

    }
  }

  public PreparedStatement prepareStatement(String sql) throws SQLException {
    try {
      PreparedStatement targetSuccessResult = this.target.prepareStatement(sql);
      this.listener.prepareStatement(targetSuccessResult, sql);
      targetSuccessResult = targetSuccessResult != null ? new PreparedStatementRelay(targetSuccessResult, this.listener.newPreparedStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareStatement(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public SQLWarning getWarnings() throws SQLException {
    try {
      SQLWarning targetSuccessResult = this.target.getWarnings();
      this.listener.getWarnings(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getWarnings(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) throws SQLException {
    try {
      CallableStatement targetSuccessResult = this.target.prepareCall(sql, resultSetType, resultSetConcurrency, resultSetHoldability);
      this.listener.prepareCall(targetSuccessResult, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
      targetSuccessResult = targetSuccessResult != null ? new CallableStatementRelay(targetSuccessResult, this.listener.newCallableStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareCall(targetFailureCause, sql, resultSetType, resultSetConcurrency, resultSetHoldability);
      throw targetFailureCause;

    }
  }

  public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency)
      throws SQLException {
    try {
      PreparedStatement targetSuccessResult = this.target.prepareStatement(sql, resultSetType, resultSetConcurrency);
      this.listener.prepareStatement(targetSuccessResult, sql, resultSetType, resultSetConcurrency);
      targetSuccessResult = targetSuccessResult != null ? new PreparedStatementRelay(targetSuccessResult, this.listener.newPreparedStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareStatement(targetFailureCause, sql, resultSetType, resultSetConcurrency);
      throw targetFailureCause;

    }
  }

  public void commit() throws SQLException {
    try {
      this.target.commit();
      this.listener.commit();

    }
    catch(SQLException targetFailureCause) {
      this.listener.commit(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Statement createStatement(int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) throws SQLException {
    try {
      Statement targetSuccessResult = this.target.createStatement(resultSetType, resultSetConcurrency, resultSetHoldability);
      this.listener.createStatement(targetSuccessResult, resultSetType, resultSetConcurrency, resultSetHoldability);
      targetSuccessResult = targetSuccessResult != null ? new StatementRelay(targetSuccessResult, this.listener.newStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createStatement(targetFailureCause, resultSetType, resultSetConcurrency, resultSetHoldability);
      throw targetFailureCause;

    }
  }

  public Statement createStatement() throws SQLException {
    try {
      Statement targetSuccessResult = this.target.createStatement();
      this.listener.createStatement(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new StatementRelay(targetSuccessResult, this.listener.newStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createStatement(targetFailureCause);
      throw targetFailureCause;

    }
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

  public Savepoint setSavepoint(String name) throws SQLException {
    try {
      Savepoint targetSuccessResult = this.target.setSavepoint(name);
      this.listener.setSavepoint(targetSuccessResult, name);
      targetSuccessResult = targetSuccessResult != null ? new SavepointRelay(targetSuccessResult, this.listener.newSavepointListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setSavepoint(targetFailureCause, name);
      throw targetFailureCause;

    }
  }

  public void clearWarnings() throws SQLException {
    try {
      this.target.clearWarnings();
      this.listener.clearWarnings();

    }
    catch(SQLException targetFailureCause) {
      this.listener.clearWarnings(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getSchema() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSchema();
      this.listener.getSchema(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSchema(targetFailureCause);
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

  public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
    try {
      Array targetSuccessResult = this.target.createArrayOf(typeName, elements);
      this.listener.createArrayOf(targetSuccessResult, typeName, elements);
      targetSuccessResult = targetSuccessResult != null ? new ArrayRelay(targetSuccessResult, this.listener.newArrayListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createArrayOf(targetFailureCause, typeName, elements);
      throw targetFailureCause;

    }
  }

  public void setReadOnly(boolean readOnly) throws SQLException {
    try {
      this.target.setReadOnly(readOnly);
      this.listener.setReadOnly(readOnly);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setReadOnly(targetFailureCause, readOnly);
      throw targetFailureCause;

    }
  }

  public Blob createBlob() throws SQLException {
    try {
      Blob targetSuccessResult = this.target.createBlob();
      this.listener.createBlob(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new BlobRelay(targetSuccessResult, this.listener.newBlobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createBlob(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getNetworkTimeout() throws SQLException {
    try {
      int targetSuccessResult = this.target.getNetworkTimeout();
      this.listener.getNetworkTimeout(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNetworkTimeout(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Map<String, Class<?>> getTypeMap() throws SQLException {
    try {
      Map<String, Class<?>> targetSuccessResult = this.target.getTypeMap();
      this.listener.getTypeMap(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTypeMap(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Savepoint setSavepoint() throws SQLException {
    try {
      Savepoint targetSuccessResult = this.target.setSavepoint();
      this.listener.setSavepoint(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new SavepointRelay(targetSuccessResult, this.listener.newSavepointListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setSavepoint(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Clob createClob() throws SQLException {
    try {
      Clob targetSuccessResult = this.target.createClob();
      this.listener.createClob(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ClobRelay(targetSuccessResult, this.listener.newClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createClob(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public CallableStatement prepareCall(String sql) throws SQLException {
    try {
      CallableStatement targetSuccessResult = this.target.prepareCall(sql);
      this.listener.prepareCall(targetSuccessResult, sql);
      targetSuccessResult = targetSuccessResult != null ? new CallableStatementRelay(targetSuccessResult, this.listener.newCallableStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareCall(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public boolean isClosed() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isClosed();
      this.listener.isClosed(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isClosed(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setAutoCommit(boolean autoCommit) throws SQLException {
    try {
      this.target.setAutoCommit(autoCommit);
      this.listener.setAutoCommit(autoCommit);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAutoCommit(targetFailureCause, autoCommit);
      throw targetFailureCause;

    }
  }

  public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
    try {
      PreparedStatement targetSuccessResult = this.target.prepareStatement(sql, columnNames);
      this.listener.prepareStatement(targetSuccessResult, sql, columnNames);
      targetSuccessResult = targetSuccessResult != null ? new PreparedStatementRelay(targetSuccessResult, this.listener.newPreparedStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareStatement(targetFailureCause, sql, columnNames);
      throw targetFailureCause;

    }
  }

  public String nativeSQL(String sql) throws SQLException {
    try {
      String targetSuccessResult = this.target.nativeSQL(sql);
      this.listener.nativeSQL(targetSuccessResult, sql);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.nativeSQL(targetFailureCause, sql);
      throw targetFailureCause;

    }
  }

  public void releaseSavepoint(Savepoint savepoint) throws SQLException {
    try {
      this.target.releaseSavepoint(savepoint);
      this.listener.releaseSavepoint(savepoint);

    }
    catch(SQLException targetFailureCause) {
      this.listener.releaseSavepoint(targetFailureCause, savepoint);
      throw targetFailureCause;

    }
  }

  public NClob createNClob() throws SQLException {
    try {
      NClob targetSuccessResult = this.target.createNClob();
      this.listener.createNClob(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new NClobRelay(targetSuccessResult, this.listener.newNClobListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.createNClob(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setClientInfo(String name, String value) throws SQLClientInfoException {
    try {
      this.target.setClientInfo(name, value);
      this.listener.setClientInfo(name, value);

    }
    catch(SQLClientInfoException targetFailureCause) {
      this.listener.setClientInfo(targetFailureCause, name, value);
      throw targetFailureCause;

    }
  }

  public String getClientInfo(String name) throws SQLException {
    try {
      String targetSuccessResult = this.target.getClientInfo(name);
      this.listener.getClientInfo(targetSuccessResult, name);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClientInfo(targetFailureCause, name);
      throw targetFailureCause;

    }
  }

  public void setHoldability(int holdability) throws SQLException {
    try {
      this.target.setHoldability(holdability);
      this.listener.setHoldability(holdability);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setHoldability(targetFailureCause, holdability);
      throw targetFailureCause;

    }
  }

  public boolean isReadOnly() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isReadOnly();
      this.listener.isReadOnly(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isReadOnly(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency)
      throws SQLException {
    try {
      CallableStatement targetSuccessResult = this.target.prepareCall(sql, resultSetType, resultSetConcurrency);
      this.listener.prepareCall(targetSuccessResult, sql, resultSetType, resultSetConcurrency);
      targetSuccessResult = targetSuccessResult != null ? new CallableStatementRelay(targetSuccessResult, this.listener.newCallableStatementListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.prepareCall(targetFailureCause, sql, resultSetType, resultSetConcurrency);
      throw targetFailureCause;

    }
  }
}
