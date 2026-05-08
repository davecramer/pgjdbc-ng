package com.impossibl.jdbc.spy;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class ConnectionTracer implements ConnectionListener {
  TraceOutput out;

  public ConnectionTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getCatalog(String result) {
    trace(new Trace.Builder("Connection", "getCatalog")
        .returned(result)
        .build());
  }

  public void getCatalog(Throwable cause) {
    trace(new Trace.Builder("Connection", "getCatalog")
        .threw(cause)
        .build());
  }

  public void rollback(Savepoint savepoint) {
    trace(new Trace.Builder("Connection", "rollback")
        .withParameter("savepoint", savepoint)
        .returned()
        .build());
  }

  public void rollback(Throwable cause, Savepoint savepoint) {
    trace(new Trace.Builder("Connection", "rollback")
        .withParameter("savepoint", savepoint)
        .threw(cause)
        .build());
  }

  public void isValid(boolean result, int timeout) {
    trace(new Trace.Builder("Connection", "isValid")
        .withParameter("timeout", timeout)
        .returned(result)
        .build());
  }

  public void isValid(Throwable cause, int timeout) {
    trace(new Trace.Builder("Connection", "isValid")
        .withParameter("timeout", timeout)
        .threw(cause)
        .build());
  }

  public void setClientInfo(Properties properties) {
    trace(new Trace.Builder("Connection", "setClientInfo")
        .withParameter("properties", properties)
        .returned()
        .build());
  }

  public void setClientInfo(Throwable cause, Properties properties) {
    trace(new Trace.Builder("Connection", "setClientInfo")
        .withParameter("properties", properties)
        .threw(cause)
        .build());
  }

  public void setTransactionIsolation(int level) {
    trace(new Trace.Builder("Connection", "setTransactionIsolation")
        .withParameter("level", level)
        .returned()
        .build());
  }

  public void setTransactionIsolation(Throwable cause, int level) {
    trace(new Trace.Builder("Connection", "setTransactionIsolation")
        .withParameter("level", level)
        .threw(cause)
        .build());
  }

  public void setCatalog(String catalog) {
    trace(new Trace.Builder("Connection", "setCatalog")
        .withParameter("catalog", catalog)
        .returned()
        .build());
  }

  public void setCatalog(Throwable cause, String catalog) {
    trace(new Trace.Builder("Connection", "setCatalog")
        .withParameter("catalog", catalog)
        .threw(cause)
        .build());
  }

  public void getClientInfo(Properties result) {
    trace(new Trace.Builder("Connection", "getClientInfo")
        .returned(result)
        .build());
  }

  public void getClientInfo(Throwable cause) {
    trace(new Trace.Builder("Connection", "getClientInfo")
        .threw(cause)
        .build());
  }

  public void setSchema(String schema) {
    trace(new Trace.Builder("Connection", "setSchema")
        .withParameter("schema", schema)
        .returned()
        .build());
  }

  public void setSchema(Throwable cause, String schema) {
    trace(new Trace.Builder("Connection", "setSchema")
        .withParameter("schema", schema)
        .threw(cause)
        .build());
  }

  public void setNetworkTimeout(Executor executor, int milliseconds) {
    trace(new Trace.Builder("Connection", "setNetworkTimeout")
        .withParameter("executor", executor)
        .withParameter("milliseconds", milliseconds)
        .returned()
        .build());
  }

  public void setNetworkTimeout(Throwable cause, Executor executor, int milliseconds) {
    trace(new Trace.Builder("Connection", "setNetworkTimeout")
        .withParameter("executor", executor)
        .withParameter("milliseconds", milliseconds)
        .threw(cause)
        .build());
  }

  public void abort(Executor executor) {
    trace(new Trace.Builder("Connection", "abort")
        .withParameter("executor", executor)
        .returned()
        .build());
  }

  public void abort(Throwable cause, Executor executor) {
    trace(new Trace.Builder("Connection", "abort")
        .withParameter("executor", executor)
        .threw(cause)
        .build());
  }

  public void getHoldability(int result) {
    trace(new Trace.Builder("Connection", "getHoldability")
        .returned(result)
        .build());
  }

  public void getHoldability(Throwable cause) {
    trace(new Trace.Builder("Connection", "getHoldability")
        .threw(cause)
        .build());
  }

  public void prepareStatement(PreparedStatement result, String sql, int resultSetType,
      int resultSetConcurrency, int resultSetHoldability) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .withParameter("resultSetHoldability", resultSetHoldability)
        .returned(result)
        .build());
  }

  public void prepareStatement(Throwable cause, String sql, int resultSetType,
      int resultSetConcurrency, int resultSetHoldability) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .withParameter("resultSetHoldability", resultSetHoldability)
        .threw(cause)
        .build());
  }

  public void getMetaData(DatabaseMetaData result) {
    trace(new Trace.Builder("Connection", "getMetaData")
        .returned(result)
        .build());
  }

  public void getMetaData(Throwable cause) {
    trace(new Trace.Builder("Connection", "getMetaData")
        .threw(cause)
        .build());
  }

  public void getAutoCommit(boolean result) {
    trace(new Trace.Builder("Connection", "getAutoCommit")
        .returned(result)
        .build());
  }

  public void getAutoCommit(Throwable cause) {
    trace(new Trace.Builder("Connection", "getAutoCommit")
        .threw(cause)
        .build());
  }

  public void prepareStatement(PreparedStatement result, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .returned(result)
        .build());
  }

  public void prepareStatement(Throwable cause, String sql, int autoGeneratedKeys) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("autoGeneratedKeys", autoGeneratedKeys)
        .threw(cause)
        .build());
  }

  public void rollback() {
    trace(new Trace.Builder("Connection", "rollback")
        .returned()
        .build());
  }

  public void rollback(Throwable cause) {
    trace(new Trace.Builder("Connection", "rollback")
        .threw(cause)
        .build());
  }

  public void getTransactionIsolation(int result) {
    trace(new Trace.Builder("Connection", "getTransactionIsolation")
        .returned(result)
        .build());
  }

  public void getTransactionIsolation(Throwable cause) {
    trace(new Trace.Builder("Connection", "getTransactionIsolation")
        .threw(cause)
        .build());
  }

  public void createStatement(Statement result, int resultSetType, int resultSetConcurrency) {
    trace(new Trace.Builder("Connection", "createStatement")
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .returned(result)
        .build());
  }

  public void createStatement(Throwable cause, int resultSetType, int resultSetConcurrency) {
    trace(new Trace.Builder("Connection", "createStatement")
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .threw(cause)
        .build());
  }

  public void createSQLXML(SQLXML result) {
    trace(new Trace.Builder("Connection", "createSQLXML")
        .returned(result)
        .build());
  }

  public void createSQLXML(Throwable cause) {
    trace(new Trace.Builder("Connection", "createSQLXML")
        .threw(cause)
        .build());
  }

  public void setTypeMap(Map<String, Class<?>> map) {
    trace(new Trace.Builder("Connection", "setTypeMap")
        .withParameter("map", map)
        .returned()
        .build());
  }

  public void setTypeMap(Throwable cause, Map<String, Class<?>> map) {
    trace(new Trace.Builder("Connection", "setTypeMap")
        .withParameter("map", map)
        .threw(cause)
        .build());
  }

  public void prepareStatement(PreparedStatement result, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .returned(result)
        .build());
  }

  public void prepareStatement(Throwable cause, String sql, int[] columnIndexes) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("columnIndexes", columnIndexes)
        .threw(cause)
        .build());
  }

  public void createStruct(Struct result, String typeName, Object[] attributes) {
    trace(new Trace.Builder("Connection", "createStruct")
        .withParameter("typeName", typeName)
        .withParameter("attributes", attributes)
        .returned(result)
        .build());
  }

  public void createStruct(Throwable cause, String typeName, Object[] attributes) {
    trace(new Trace.Builder("Connection", "createStruct")
        .withParameter("typeName", typeName)
        .withParameter("attributes", attributes)
        .threw(cause)
        .build());
  }

  public void prepareStatement(PreparedStatement result, String sql) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void prepareStatement(Throwable cause, String sql) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void getWarnings(SQLWarning result) {
    trace(new Trace.Builder("Connection", "getWarnings")
        .returned(result)
        .build());
  }

  public void getWarnings(Throwable cause) {
    trace(new Trace.Builder("Connection", "getWarnings")
        .threw(cause)
        .build());
  }

  public void prepareCall(CallableStatement result, String sql, int resultSetType,
      int resultSetConcurrency, int resultSetHoldability) {
    trace(new Trace.Builder("Connection", "prepareCall")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .withParameter("resultSetHoldability", resultSetHoldability)
        .returned(result)
        .build());
  }

  public void prepareCall(Throwable cause, String sql, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) {
    trace(new Trace.Builder("Connection", "prepareCall")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .withParameter("resultSetHoldability", resultSetHoldability)
        .threw(cause)
        .build());
  }

  public void prepareStatement(PreparedStatement result, String sql, int resultSetType,
      int resultSetConcurrency) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .returned(result)
        .build());
  }

  public void prepareStatement(Throwable cause, String sql, int resultSetType,
      int resultSetConcurrency) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .threw(cause)
        .build());
  }

  public void commit() {
    trace(new Trace.Builder("Connection", "commit")
        .returned()
        .build());
  }

  public void commit(Throwable cause) {
    trace(new Trace.Builder("Connection", "commit")
        .threw(cause)
        .build());
  }

  public void createStatement(Statement result, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) {
    trace(new Trace.Builder("Connection", "createStatement")
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .withParameter("resultSetHoldability", resultSetHoldability)
        .returned(result)
        .build());
  }

  public void createStatement(Throwable cause, int resultSetType, int resultSetConcurrency,
      int resultSetHoldability) {
    trace(new Trace.Builder("Connection", "createStatement")
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .withParameter("resultSetHoldability", resultSetHoldability)
        .threw(cause)
        .build());
  }

  public void createStatement(Statement result) {
    trace(new Trace.Builder("Connection", "createStatement")
        .returned(result)
        .build());
  }

  public void createStatement(Throwable cause) {
    trace(new Trace.Builder("Connection", "createStatement")
        .threw(cause)
        .build());
  }

  public void close() {
    trace(new Trace.Builder("Connection", "close")
        .returned()
        .build());
  }

  public void close(Throwable cause) {
    trace(new Trace.Builder("Connection", "close")
        .threw(cause)
        .build());
  }

  public void setSavepoint(Savepoint result, String name) {
    trace(new Trace.Builder("Connection", "setSavepoint")
        .withParameter("name", name)
        .returned(result)
        .build());
  }

  public void setSavepoint(Throwable cause, String name) {
    trace(new Trace.Builder("Connection", "setSavepoint")
        .withParameter("name", name)
        .threw(cause)
        .build());
  }

  public void clearWarnings() {
    trace(new Trace.Builder("Connection", "clearWarnings")
        .returned()
        .build());
  }

  public void clearWarnings(Throwable cause) {
    trace(new Trace.Builder("Connection", "clearWarnings")
        .threw(cause)
        .build());
  }

  public void getSchema(String result) {
    trace(new Trace.Builder("Connection", "getSchema")
        .returned(result)
        .build());
  }

  public void getSchema(Throwable cause) {
    trace(new Trace.Builder("Connection", "getSchema")
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("Connection", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("Connection", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("Connection", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("Connection", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void createArrayOf(Array result, String typeName, Object[] elements) {
    trace(new Trace.Builder("Connection", "createArrayOf")
        .withParameter("typeName", typeName)
        .withParameter("elements", elements)
        .returned(result)
        .build());
  }

  public void createArrayOf(Throwable cause, String typeName, Object[] elements) {
    trace(new Trace.Builder("Connection", "createArrayOf")
        .withParameter("typeName", typeName)
        .withParameter("elements", elements)
        .threw(cause)
        .build());
  }

  public void setReadOnly(boolean readOnly) {
    trace(new Trace.Builder("Connection", "setReadOnly")
        .withParameter("readOnly", readOnly)
        .returned()
        .build());
  }

  public void setReadOnly(Throwable cause, boolean readOnly) {
    trace(new Trace.Builder("Connection", "setReadOnly")
        .withParameter("readOnly", readOnly)
        .threw(cause)
        .build());
  }

  public void createBlob(Blob result) {
    trace(new Trace.Builder("Connection", "createBlob")
        .returned(result)
        .build());
  }

  public void createBlob(Throwable cause) {
    trace(new Trace.Builder("Connection", "createBlob")
        .threw(cause)
        .build());
  }

  public void getNetworkTimeout(int result) {
    trace(new Trace.Builder("Connection", "getNetworkTimeout")
        .returned(result)
        .build());
  }

  public void getNetworkTimeout(Throwable cause) {
    trace(new Trace.Builder("Connection", "getNetworkTimeout")
        .threw(cause)
        .build());
  }

  public void getTypeMap(Map<String, Class<?>> result) {
    trace(new Trace.Builder("Connection", "getTypeMap")
        .returned(result)
        .build());
  }

  public void getTypeMap(Throwable cause) {
    trace(new Trace.Builder("Connection", "getTypeMap")
        .threw(cause)
        .build());
  }

  public void setSavepoint(Savepoint result) {
    trace(new Trace.Builder("Connection", "setSavepoint")
        .returned(result)
        .build());
  }

  public void setSavepoint(Throwable cause) {
    trace(new Trace.Builder("Connection", "setSavepoint")
        .threw(cause)
        .build());
  }

  public void createClob(Clob result) {
    trace(new Trace.Builder("Connection", "createClob")
        .returned(result)
        .build());
  }

  public void createClob(Throwable cause) {
    trace(new Trace.Builder("Connection", "createClob")
        .threw(cause)
        .build());
  }

  public void prepareCall(CallableStatement result, String sql) {
    trace(new Trace.Builder("Connection", "prepareCall")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void prepareCall(Throwable cause, String sql) {
    trace(new Trace.Builder("Connection", "prepareCall")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void isClosed(boolean result) {
    trace(new Trace.Builder("Connection", "isClosed")
        .returned(result)
        .build());
  }

  public void isClosed(Throwable cause) {
    trace(new Trace.Builder("Connection", "isClosed")
        .threw(cause)
        .build());
  }

  public void setAutoCommit(boolean autoCommit) {
    trace(new Trace.Builder("Connection", "setAutoCommit")
        .withParameter("autoCommit", autoCommit)
        .returned()
        .build());
  }

  public void setAutoCommit(Throwable cause, boolean autoCommit) {
    trace(new Trace.Builder("Connection", "setAutoCommit")
        .withParameter("autoCommit", autoCommit)
        .threw(cause)
        .build());
  }

  public void prepareStatement(PreparedStatement result, String sql, String[] columnNames) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .returned(result)
        .build());
  }

  public void prepareStatement(Throwable cause, String sql, String[] columnNames) {
    trace(new Trace.Builder("Connection", "prepareStatement")
        .withParameter("sql", sql)
        .withParameter("columnNames", columnNames)
        .threw(cause)
        .build());
  }

  public void nativeSQL(String result, String sql) {
    trace(new Trace.Builder("Connection", "nativeSQL")
        .withParameter("sql", sql)
        .returned(result)
        .build());
  }

  public void nativeSQL(Throwable cause, String sql) {
    trace(new Trace.Builder("Connection", "nativeSQL")
        .withParameter("sql", sql)
        .threw(cause)
        .build());
  }

  public void releaseSavepoint(Savepoint savepoint) {
    trace(new Trace.Builder("Connection", "releaseSavepoint")
        .withParameter("savepoint", savepoint)
        .returned()
        .build());
  }

  public void releaseSavepoint(Throwable cause, Savepoint savepoint) {
    trace(new Trace.Builder("Connection", "releaseSavepoint")
        .withParameter("savepoint", savepoint)
        .threw(cause)
        .build());
  }

  public void createNClob(NClob result) {
    trace(new Trace.Builder("Connection", "createNClob")
        .returned(result)
        .build());
  }

  public void createNClob(Throwable cause) {
    trace(new Trace.Builder("Connection", "createNClob")
        .threw(cause)
        .build());
  }

  public void setClientInfo(String name, String value) {
    trace(new Trace.Builder("Connection", "setClientInfo")
        .withParameter("name", name)
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setClientInfo(Throwable cause, String name, String value) {
    trace(new Trace.Builder("Connection", "setClientInfo")
        .withParameter("name", name)
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void getClientInfo(String result, String name) {
    trace(new Trace.Builder("Connection", "getClientInfo")
        .withParameter("name", name)
        .returned(result)
        .build());
  }

  public void getClientInfo(Throwable cause, String name) {
    trace(new Trace.Builder("Connection", "getClientInfo")
        .withParameter("name", name)
        .threw(cause)
        .build());
  }

  public void setHoldability(int holdability) {
    trace(new Trace.Builder("Connection", "setHoldability")
        .withParameter("holdability", holdability)
        .returned()
        .build());
  }

  public void setHoldability(Throwable cause, int holdability) {
    trace(new Trace.Builder("Connection", "setHoldability")
        .withParameter("holdability", holdability)
        .threw(cause)
        .build());
  }

  public void isReadOnly(boolean result) {
    trace(new Trace.Builder("Connection", "isReadOnly")
        .returned(result)
        .build());
  }

  public void isReadOnly(Throwable cause) {
    trace(new Trace.Builder("Connection", "isReadOnly")
        .threw(cause)
        .build());
  }

  public void prepareCall(CallableStatement result, String sql, int resultSetType,
      int resultSetConcurrency) {
    trace(new Trace.Builder("Connection", "prepareCall")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .returned(result)
        .build());
  }

  public void prepareCall(Throwable cause, String sql, int resultSetType,
      int resultSetConcurrency) {
    trace(new Trace.Builder("Connection", "prepareCall")
        .withParameter("sql", sql)
        .withParameter("resultSetType", resultSetType)
        .withParameter("resultSetConcurrency", resultSetConcurrency)
        .threw(cause)
        .build());
  }

  public PreparedStatementListener newPreparedStatementListener() {
    return new PreparedStatementTracer(out);
  }

  public DatabaseMetaDataListener newDatabaseMetaDataListener() {
    return new DatabaseMetaDataTracer(out);
  }

  public StatementListener newStatementListener() {
    return new StatementTracer(out);
  }

  public SQLXMLListener newSQLXMLListener() {
    return new SQLXMLTracer(out);
  }

  public StructListener newStructListener() {
    return new StructTracer(out);
  }

  public CallableStatementListener newCallableStatementListener() {
    return new CallableStatementTracer(out);
  }

  public SavepointListener newSavepointListener() {
    return new SavepointTracer(out);
  }

  public ArrayListener newArrayListener() {
    return new ArrayTracer(out);
  }

  public BlobListener newBlobListener() {
    return new BlobTracer(out);
  }

  public ClobListener newClobListener() {
    return new ClobTracer(out);
  }

  public NClobListener newNClobListener() {
    return new NClobTracer(out);
  }
}
