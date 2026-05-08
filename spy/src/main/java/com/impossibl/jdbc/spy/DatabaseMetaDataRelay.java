package com.impossibl.jdbc.spy;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;
import java.sql.SQLException;

public class DatabaseMetaDataRelay implements Relay<DatabaseMetaData>, DatabaseMetaData {
  public DatabaseMetaData target;

  public DatabaseMetaDataListener listener;

  public DatabaseMetaDataRelay(DatabaseMetaData target, DatabaseMetaDataListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public DatabaseMetaData getTarget() {
    return target;
  }

  public int getMaxCharLiteralLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxCharLiteralLength();
      this.listener.getMaxCharLiteralLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxCharLiteralLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getCrossReference(String parentCatalog, String parentSchema, String parentTable,
      String foreignCatalog, String foreignSchema, String foreignTable) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getCrossReference(parentCatalog, parentSchema, parentTable, foreignCatalog, foreignSchema, foreignTable);
      this.listener.getCrossReference(targetSuccessResult, parentCatalog, parentSchema, parentTable, foreignCatalog, foreignSchema, foreignTable);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCrossReference(targetFailureCause, parentCatalog, parentSchema, parentTable, foreignCatalog, foreignSchema, foreignTable);
      throw targetFailureCause;

    }
  }

  public boolean supportsGroupByBeyondSelect() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsGroupByBeyondSelect();
      this.listener.supportsGroupByBeyondSelect(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsGroupByBeyondSelect(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsResultSetConcurrency(int type, int concurrency) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsResultSetConcurrency(type, concurrency);
      this.listener.supportsResultSetConcurrency(targetSuccessResult, type, concurrency);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsResultSetConcurrency(targetFailureCause, type, concurrency);
      throw targetFailureCause;

    }
  }

  public boolean supportsLimitedOuterJoins() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsLimitedOuterJoins();
      this.listener.supportsLimitedOuterJoins(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsLimitedOuterJoins(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxColumnsInOrderBy() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxColumnsInOrderBy();
      this.listener.getMaxColumnsInOrderBy(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxColumnsInOrderBy(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsRefCursors() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsRefCursors();
      this.listener.supportsRefCursors(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsRefCursors(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean updatesAreDetected(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.updatesAreDetected(type);
      this.listener.updatesAreDetected(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.updatesAreDetected(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean supportsANSI92EntryLevelSQL() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsANSI92EntryLevelSQL();
      this.listener.supportsANSI92EntryLevelSQL(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsANSI92EntryLevelSQL(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxConnections() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxConnections();
      this.listener.getMaxConnections(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxConnections(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxColumnsInSelect() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxColumnsInSelect();
      this.listener.getMaxColumnsInSelect(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxColumnsInSelect(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxIndexLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxIndexLength();
      this.listener.getMaxIndexLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxIndexLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsNonNullableColumns() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsNonNullableColumns();
      this.listener.supportsNonNullableColumns(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsNonNullableColumns(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxColumnNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxColumnNameLength();
      this.listener.getMaxColumnNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxColumnNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getTableTypes() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getTableTypes();
      this.listener.getTableTypes(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTableTypes(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getSchemas() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getSchemas();
      this.listener.getSchemas(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSchemas(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getPrimaryKeys(String catalog, String schema, String table) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getPrimaryKeys(catalog, schema, table);
      this.listener.getPrimaryKeys(targetSuccessResult, catalog, schema, table);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getPrimaryKeys(targetFailureCause, catalog, schema, table);
      throw targetFailureCause;

    }
  }

  public boolean supportsStoredProcedures() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsStoredProcedures();
      this.listener.supportsStoredProcedures(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsStoredProcedures(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsOuterJoins() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsOuterJoins();
      this.listener.supportsOuterJoins(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsOuterJoins(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean nullPlusNonNullIsNull() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.nullPlusNonNullIsNull();
      this.listener.nullPlusNonNullIsNull(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.nullPlusNonNullIsNull(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSchemasInProcedureCalls() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSchemasInProcedureCalls();
      this.listener.supportsSchemasInProcedureCalls(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSchemasInProcedureCalls(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSelectForUpdate() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSelectForUpdate();
      this.listener.supportsSelectForUpdate(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSelectForUpdate(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean othersUpdatesAreVisible(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.othersUpdatesAreVisible(type);
      this.listener.othersUpdatesAreVisible(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.othersUpdatesAreVisible(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean ownDeletesAreVisible(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.ownDeletesAreVisible(type);
      this.listener.ownDeletesAreVisible(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.ownDeletesAreVisible(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean supportsPositionedDelete() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsPositionedDelete();
      this.listener.supportsPositionedDelete(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsPositionedDelete(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxBinaryLiteralLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxBinaryLiteralLength();
      this.listener.getMaxBinaryLiteralLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxBinaryLiteralLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSubqueriesInQuantifieds() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSubqueriesInQuantifieds();
      this.listener.supportsSubqueriesInQuantifieds(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSubqueriesInQuantifieds(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean ownUpdatesAreVisible(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.ownUpdatesAreVisible(type);
      this.listener.ownUpdatesAreVisible(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.ownUpdatesAreVisible(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean storesLowerCaseIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.storesLowerCaseIdentifiers();
      this.listener.storesLowerCaseIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.storesLowerCaseIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsMixedCaseIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsMixedCaseIdentifiers();
      this.listener.supportsMixedCaseIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsMixedCaseIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getTimeDateFunctions() throws SQLException {
    try {
      String targetSuccessResult = this.target.getTimeDateFunctions();
      this.listener.getTimeDateFunctions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTimeDateFunctions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsConvert(int fromType, int toType) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsConvert(fromType, toType);
      this.listener.supportsConvert(targetSuccessResult, fromType, toType);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsConvert(targetFailureCause, fromType, toType);
      throw targetFailureCause;

    }
  }

  public boolean supportsFullOuterJoins() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsFullOuterJoins();
      this.listener.supportsFullOuterJoins(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsFullOuterJoins(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean nullsAreSortedHigh() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.nullsAreSortedHigh();
      this.listener.nullsAreSortedHigh(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.nullsAreSortedHigh(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getExtraNameCharacters() throws SQLException {
    try {
      String targetSuccessResult = this.target.getExtraNameCharacters();
      this.listener.getExtraNameCharacters(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getExtraNameCharacters(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean dataDefinitionIgnoredInTransactions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.dataDefinitionIgnoredInTransactions();
      this.listener.dataDefinitionIgnoredInTransactions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.dataDefinitionIgnoredInTransactions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getAttributes(String catalog, String schemaPattern, String typeNamePattern,
      String attributeNamePattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getAttributes(catalog, schemaPattern, typeNamePattern, attributeNamePattern);
      this.listener.getAttributes(targetSuccessResult, catalog, schemaPattern, typeNamePattern, attributeNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAttributes(targetFailureCause, catalog, schemaPattern, typeNamePattern, attributeNamePattern);
      throw targetFailureCause;

    }
  }

  public boolean supportsCorrelatedSubqueries() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCorrelatedSubqueries();
      this.listener.supportsCorrelatedSubqueries(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCorrelatedSubqueries(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxTablesInSelect() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxTablesInSelect();
      this.listener.getMaxTablesInSelect(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxTablesInSelect(targetFailureCause);
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

  public ResultSet getClientInfoProperties() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getClientInfoProperties();
      this.listener.getClientInfoProperties(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getClientInfoProperties(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsStatementPooling() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsStatementPooling();
      this.listener.supportsStatementPooling(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsStatementPooling(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxStatementLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxStatementLength();
      this.listener.getMaxStatementLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxStatementLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSchemasInDataManipulation() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSchemasInDataManipulation();
      this.listener.supportsSchemasInDataManipulation(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSchemasInDataManipulation(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean othersInsertsAreVisible(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.othersInsertsAreVisible(type);
      this.listener.othersInsertsAreVisible(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.othersInsertsAreVisible(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public ResultSet getSuperTypes(String catalog, String schemaPattern, String typeNamePattern)
      throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getSuperTypes(catalog, schemaPattern, typeNamePattern);
      this.listener.getSuperTypes(targetSuccessResult, catalog, schemaPattern, typeNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSuperTypes(targetFailureCause, catalog, schemaPattern, typeNamePattern);
      throw targetFailureCause;

    }
  }

  public boolean supportsResultSetHoldability(int holdability) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsResultSetHoldability(holdability);
      this.listener.supportsResultSetHoldability(targetSuccessResult, holdability);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsResultSetHoldability(targetFailureCause, holdability);
      throw targetFailureCause;

    }
  }

  public boolean supportsExpressionsInOrderBy() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsExpressionsInOrderBy();
      this.listener.supportsExpressionsInOrderBy(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsExpressionsInOrderBy(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getSQLStateType() throws SQLException {
    try {
      int targetSuccessResult = this.target.getSQLStateType();
      this.listener.getSQLStateType(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLStateType(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSchemasInTableDefinitions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSchemasInTableDefinitions();
      this.listener.supportsSchemasInTableDefinitions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSchemasInTableDefinitions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getSchemaTerm() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSchemaTerm();
      this.listener.getSchemaTerm(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSchemaTerm(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean locatorsUpdateCopy() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.locatorsUpdateCopy();
      this.listener.locatorsUpdateCopy(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.locatorsUpdateCopy(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public RowIdLifetime getRowIdLifetime() throws SQLException {
    try {
      RowIdLifetime targetSuccessResult = this.target.getRowIdLifetime();
      this.listener.getRowIdLifetime(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getRowIdLifetime(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getColumns(String catalog, String schemaPattern, String tableNamePattern,
      String columnNamePattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern);
      this.listener.getColumns(targetSuccessResult, catalog, schemaPattern, tableNamePattern, columnNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumns(targetFailureCause, catalog, schemaPattern, tableNamePattern, columnNamePattern);
      throw targetFailureCause;

    }
  }

  public boolean supportsResultSetType(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsResultSetType(type);
      this.listener.supportsResultSetType(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsResultSetType(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean autoCommitFailureClosesAllResultSets() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.autoCommitFailureClosesAllResultSets();
      this.listener.autoCommitFailureClosesAllResultSets(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.autoCommitFailureClosesAllResultSets(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsCatalogsInPrivilegeDefinitions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCatalogsInPrivilegeDefinitions();
      this.listener.supportsCatalogsInPrivilegeDefinitions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCatalogsInPrivilegeDefinitions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSchemasInPrivilegeDefinitions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSchemasInPrivilegeDefinitions();
      this.listener.supportsSchemasInPrivilegeDefinitions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSchemasInPrivilegeDefinitions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getStringFunctions() throws SQLException {
    try {
      String targetSuccessResult = this.target.getStringFunctions();
      this.listener.getStringFunctions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getStringFunctions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsCoreSQLGrammar() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCoreSQLGrammar();
      this.listener.supportsCoreSQLGrammar(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCoreSQLGrammar(targetFailureCause);
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

  public boolean supportsMultipleOpenResults() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsMultipleOpenResults();
      this.listener.supportsMultipleOpenResults(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsMultipleOpenResults(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean storesLowerCaseQuotedIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.storesLowerCaseQuotedIdentifiers();
      this.listener.storesLowerCaseQuotedIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.storesLowerCaseQuotedIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsOpenCursorsAcrossRollback() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsOpenCursorsAcrossRollback();
      this.listener.supportsOpenCursorsAcrossRollback(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsOpenCursorsAcrossRollback(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsOrderByUnrelated() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsOrderByUnrelated();
      this.listener.supportsOrderByUnrelated(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsOrderByUnrelated(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsExtendedSQLGrammar() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsExtendedSQLGrammar();
      this.listener.supportsExtendedSQLGrammar(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsExtendedSQLGrammar(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsUnionAll() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsUnionAll();
      this.listener.supportsUnionAll(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsUnionAll(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getDatabaseProductVersion() throws SQLException {
    try {
      String targetSuccessResult = this.target.getDatabaseProductVersion();
      this.listener.getDatabaseProductVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDatabaseProductVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean usesLocalFiles() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.usesLocalFiles();
      this.listener.usesLocalFiles(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.usesLocalFiles(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsGetGeneratedKeys() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsGetGeneratedKeys();
      this.listener.supportsGetGeneratedKeys(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsGetGeneratedKeys(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsColumnAliasing() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsColumnAliasing();
      this.listener.supportsColumnAliasing(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsColumnAliasing(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsIntegrityEnhancementFacility() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsIntegrityEnhancementFacility();
      this.listener.supportsIntegrityEnhancementFacility(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsIntegrityEnhancementFacility(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsDataDefinitionAndDataManipulationTransactions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsDataDefinitionAndDataManipulationTransactions();
      this.listener.supportsDataDefinitionAndDataManipulationTransactions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsDataDefinitionAndDataManipulationTransactions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getCatalogs() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getCatalogs();
      this.listener.getCatalogs(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCatalogs(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getProcedureColumns(String catalog, String schemaPattern,
      String procedureNamePattern, String columnNamePattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getProcedureColumns(catalog, schemaPattern, procedureNamePattern, columnNamePattern);
      this.listener.getProcedureColumns(targetSuccessResult, catalog, schemaPattern, procedureNamePattern, columnNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getProcedureColumns(targetFailureCause, catalog, schemaPattern, procedureNamePattern, columnNamePattern);
      throw targetFailureCause;

    }
  }

  public int getMaxSchemaNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxSchemaNameLength();
      this.listener.getMaxSchemaNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxSchemaNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxColumnsInGroupBy() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxColumnsInGroupBy();
      this.listener.getMaxColumnsInGroupBy(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxColumnsInGroupBy(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsCatalogsInDataManipulation() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCatalogsInDataManipulation();
      this.listener.supportsCatalogsInDataManipulation(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCatalogsInDataManipulation(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsCatalogsInIndexDefinitions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCatalogsInIndexDefinitions();
      this.listener.supportsCatalogsInIndexDefinitions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCatalogsInIndexDefinitions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getFunctions(String catalog, String schemaPattern, String functionNamePattern)
      throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getFunctions(catalog, schemaPattern, functionNamePattern);
      this.listener.getFunctions(targetSuccessResult, catalog, schemaPattern, functionNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFunctions(targetFailureCause, catalog, schemaPattern, functionNamePattern);
      throw targetFailureCause;

    }
  }

  public String getDriverVersion() throws SQLException {
    try {
      String targetSuccessResult = this.target.getDriverVersion();
      this.listener.getDriverVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDriverVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getJDBCMajorVersion() throws SQLException {
    try {
      int targetSuccessResult = this.target.getJDBCMajorVersion();
      this.listener.getJDBCMajorVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getJDBCMajorVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getDriverMinorVersion() {
    try {
      int targetSuccessResult = this.target.getDriverMinorVersion();
      this.listener.getDriverMinorVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(Throwable targetFailureCause) {
      this.listener.getDriverMinorVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean deletesAreDetected(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.deletesAreDetected(type);
      this.listener.deletesAreDetected(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.deletesAreDetected(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean supportsSavepoints() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSavepoints();
      this.listener.supportsSavepoints(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSavepoints(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getSQLKeywords() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSQLKeywords();
      this.listener.getSQLKeywords(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSQLKeywords(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxColumnsInTable() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxColumnsInTable();
      this.listener.getMaxColumnsInTable(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxColumnsInTable(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getDriverName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getDriverName();
      this.listener.getDriverName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDriverName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean allTablesAreSelectable() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.allTablesAreSelectable();
      this.listener.allTablesAreSelectable(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.allTablesAreSelectable(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsAlterTableWithDropColumn() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsAlterTableWithDropColumn();
      this.listener.supportsAlterTableWithDropColumn(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsAlterTableWithDropColumn(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsANSI92FullSQL() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsANSI92FullSQL();
      this.listener.supportsANSI92FullSQL(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsANSI92FullSQL(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsPositionedUpdate() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsPositionedUpdate();
      this.listener.supportsPositionedUpdate(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsPositionedUpdate(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getColumnPrivileges(String catalog, String schema, String table,
      String columnNamePattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getColumnPrivileges(catalog, schema, table, columnNamePattern);
      this.listener.getColumnPrivileges(targetSuccessResult, catalog, schema, table, columnNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getColumnPrivileges(targetFailureCause, catalog, schema, table, columnNamePattern);
      throw targetFailureCause;

    }
  }

  public boolean supportsDifferentTableCorrelationNames() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsDifferentTableCorrelationNames();
      this.listener.supportsDifferentTableCorrelationNames(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsDifferentTableCorrelationNames(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getExportedKeys(String catalog, String schema, String table) throws
      SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getExportedKeys(catalog, schema, table);
      this.listener.getExportedKeys(targetSuccessResult, catalog, schema, table);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getExportedKeys(targetFailureCause, catalog, schema, table);
      throw targetFailureCause;

    }
  }

  public boolean supportsMultipleTransactions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsMultipleTransactions();
      this.listener.supportsMultipleTransactions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsMultipleTransactions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSubqueriesInExists() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSubqueriesInExists();
      this.listener.supportsSubqueriesInExists(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSubqueriesInExists(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getCatalogTerm() throws SQLException {
    try {
      String targetSuccessResult = this.target.getCatalogTerm();
      this.listener.getCatalogTerm(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCatalogTerm(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxColumnsInIndex() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxColumnsInIndex();
      this.listener.getMaxColumnsInIndex(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxColumnsInIndex(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getSchemas(String catalog, String schemaPattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getSchemas(catalog, schemaPattern);
      this.listener.getSchemas(targetSuccessResult, catalog, schemaPattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSchemas(targetFailureCause, catalog, schemaPattern);
      throw targetFailureCause;

    }
  }

  public ResultSet getFunctionColumns(String catalog, String schemaPattern,
      String functionNamePattern, String columnNamePattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getFunctionColumns(catalog, schemaPattern, functionNamePattern, columnNamePattern);
      this.listener.getFunctionColumns(targetSuccessResult, catalog, schemaPattern, functionNamePattern, columnNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getFunctionColumns(targetFailureCause, catalog, schemaPattern, functionNamePattern, columnNamePattern);
      throw targetFailureCause;

    }
  }

  public boolean supportsSubqueriesInComparisons() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSubqueriesInComparisons();
      this.listener.supportsSubqueriesInComparisons(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSubqueriesInComparisons(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getSuperTables(String catalog, String schemaPattern, String tableNamePattern)
      throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getSuperTables(catalog, schemaPattern, tableNamePattern);
      this.listener.getSuperTables(targetSuccessResult, catalog, schemaPattern, tableNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSuperTables(targetFailureCause, catalog, schemaPattern, tableNamePattern);
      throw targetFailureCause;

    }
  }

  public boolean supportsLikeEscapeClause() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsLikeEscapeClause();
      this.listener.supportsLikeEscapeClause(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsLikeEscapeClause(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getIndexInfo(String catalog, String schema, String table, boolean unique,
      boolean approximate) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getIndexInfo(catalog, schema, table, unique, approximate);
      this.listener.getIndexInfo(targetSuccessResult, catalog, schema, table, unique, approximate);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getIndexInfo(targetFailureCause, catalog, schema, table, unique, approximate);
      throw targetFailureCause;

    }
  }

  public int getJDBCMinorVersion() throws SQLException {
    try {
      int targetSuccessResult = this.target.getJDBCMinorVersion();
      this.listener.getJDBCMinorVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getJDBCMinorVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getSearchStringEscape() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSearchStringEscape();
      this.listener.getSearchStringEscape(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSearchStringEscape(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsOpenStatementsAcrossRollback() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsOpenStatementsAcrossRollback();
      this.listener.supportsOpenStatementsAcrossRollback(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsOpenStatementsAcrossRollback(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsTableCorrelationNames() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsTableCorrelationNames();
      this.listener.supportsTableCorrelationNames(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsTableCorrelationNames(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getTypeInfo() throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getTypeInfo();
      this.listener.getTypeInfo(targetSuccessResult);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTypeInfo(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxUserNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxUserNameLength();
      this.listener.getMaxUserNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxUserNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean doesMaxRowSizeIncludeBlobs() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.doesMaxRowSizeIncludeBlobs();
      this.listener.doesMaxRowSizeIncludeBlobs(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.doesMaxRowSizeIncludeBlobs(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getDriverMajorVersion() {
    try {
      int targetSuccessResult = this.target.getDriverMajorVersion();
      this.listener.getDriverMajorVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(Throwable targetFailureCause) {
      this.listener.getDriverMajorVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsAlterTableWithAddColumn() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsAlterTableWithAddColumn();
      this.listener.supportsAlterTableWithAddColumn(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsAlterTableWithAddColumn(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getURL() throws SQLException {
    try {
      String targetSuccessResult = this.target.getURL();
      this.listener.getURL(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getURL(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxCursorNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxCursorNameLength();
      this.listener.getMaxCursorNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxCursorNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean insertsAreDetected(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.insertsAreDetected(type);
      this.listener.insertsAreDetected(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.insertsAreDetected(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public int getResultSetHoldability() throws SQLException {
    try {
      int targetSuccessResult = this.target.getResultSetHoldability();
      this.listener.getResultSetHoldability(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getResultSetHoldability(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getSystemFunctions() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSystemFunctions();
      this.listener.getSystemFunctions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSystemFunctions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsCatalogsInProcedureCalls() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCatalogsInProcedureCalls();
      this.listener.supportsCatalogsInProcedureCalls(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCatalogsInProcedureCalls(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsConvert() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsConvert();
      this.listener.supportsConvert(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsConvert(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsOpenStatementsAcrossCommit() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsOpenStatementsAcrossCommit();
      this.listener.supportsOpenStatementsAcrossCommit(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsOpenStatementsAcrossCommit(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsNamedParameters() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsNamedParameters();
      this.listener.supportsNamedParameters(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsNamedParameters(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean othersDeletesAreVisible(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.othersDeletesAreVisible(type);
      this.listener.othersDeletesAreVisible(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.othersDeletesAreVisible(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public boolean supportsTransactions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsTransactions();
      this.listener.supportsTransactions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsTransactions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxRowSize() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxRowSize();
      this.listener.getMaxRowSize(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxRowSize(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsANSI92IntermediateSQL() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsANSI92IntermediateSQL();
      this.listener.supportsANSI92IntermediateSQL(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsANSI92IntermediateSQL(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getProcedureTerm() throws SQLException {
    try {
      String targetSuccessResult = this.target.getProcedureTerm();
      this.listener.getProcedureTerm(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getProcedureTerm(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxStatements() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxStatements();
      this.listener.getMaxStatements(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxStatements(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean nullsAreSortedAtEnd() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.nullsAreSortedAtEnd();
      this.listener.nullsAreSortedAtEnd(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.nullsAreSortedAtEnd(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getIdentifierQuoteString() throws SQLException {
    try {
      String targetSuccessResult = this.target.getIdentifierQuoteString();
      this.listener.getIdentifierQuoteString(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getIdentifierQuoteString(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean storesUpperCaseIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.storesUpperCaseIdentifiers();
      this.listener.storesUpperCaseIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.storesUpperCaseIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean isCatalogAtStart() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.isCatalogAtStart();
      this.listener.isCatalogAtStart(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.isCatalogAtStart(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getCatalogSeparator() throws SQLException {
    try {
      String targetSuccessResult = this.target.getCatalogSeparator();
      this.listener.getCatalogSeparator(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCatalogSeparator(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getTables(String catalog, String schemaPattern, String tableNamePattern,
      String[] types) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getTables(catalog, schemaPattern, tableNamePattern, types);
      this.listener.getTables(targetSuccessResult, catalog, schemaPattern, tableNamePattern, types);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTables(targetFailureCause, catalog, schemaPattern, tableNamePattern, types);
      throw targetFailureCause;

    }
  }

  public int getMaxProcedureNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxProcedureNameLength();
      this.listener.getMaxProcedureNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxProcedureNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getNumericFunctions() throws SQLException {
    try {
      String targetSuccessResult = this.target.getNumericFunctions();
      this.listener.getNumericFunctions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getNumericFunctions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean nullsAreSortedAtStart() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.nullsAreSortedAtStart();
      this.listener.nullsAreSortedAtStart(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.nullsAreSortedAtStart(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsGroupByUnrelated() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsGroupByUnrelated();
      this.listener.supportsGroupByUnrelated(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsGroupByUnrelated(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getTablePrivileges(String catalog, String schemaPattern, String tableNamePattern)
      throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getTablePrivileges(catalog, schemaPattern, tableNamePattern);
      this.listener.getTablePrivileges(targetSuccessResult, catalog, schemaPattern, tableNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getTablePrivileges(targetFailureCause, catalog, schemaPattern, tableNamePattern);
      throw targetFailureCause;

    }
  }

  public ResultSet getProcedures(String catalog, String schemaPattern, String procedureNamePattern)
      throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getProcedures(catalog, schemaPattern, procedureNamePattern);
      this.listener.getProcedures(targetSuccessResult, catalog, schemaPattern, procedureNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getProcedures(targetFailureCause, catalog, schemaPattern, procedureNamePattern);
      throw targetFailureCause;

    }
  }

  public int getDatabaseMajorVersion() throws SQLException {
    try {
      int targetSuccessResult = this.target.getDatabaseMajorVersion();
      this.listener.getDatabaseMajorVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDatabaseMajorVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean generatedKeyAlwaysReturned() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.generatedKeyAlwaysReturned();
      this.listener.generatedKeyAlwaysReturned(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.generatedKeyAlwaysReturned(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean allProceduresAreCallable() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.allProceduresAreCallable();
      this.listener.allProceduresAreCallable(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.allProceduresAreCallable(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsMultipleResultSets() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsMultipleResultSets();
      this.listener.supportsMultipleResultSets(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsMultipleResultSets(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getBestRowIdentifier(String catalog, String schema, String table, int scope,
      boolean nullable) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getBestRowIdentifier(catalog, schema, table, scope, nullable);
      this.listener.getBestRowIdentifier(targetSuccessResult, catalog, schema, table, scope, nullable);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBestRowIdentifier(targetFailureCause, catalog, schema, table, scope, nullable);
      throw targetFailureCause;

    }
  }

  public String getUserName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getUserName();
      this.listener.getUserName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getUserName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean dataDefinitionCausesTransactionCommit() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.dataDefinitionCausesTransactionCommit();
      this.listener.dataDefinitionCausesTransactionCommit(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.dataDefinitionCausesTransactionCommit(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getUDTs(String catalog, String schemaPattern, String typeNamePattern,
      int[] types) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getUDTs(catalog, schemaPattern, typeNamePattern, types);
      this.listener.getUDTs(targetSuccessResult, catalog, schemaPattern, typeNamePattern, types);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getUDTs(targetFailureCause, catalog, schemaPattern, typeNamePattern, types);
      throw targetFailureCause;

    }
  }

  public boolean storesUpperCaseQuotedIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.storesUpperCaseQuotedIdentifiers();
      this.listener.storesUpperCaseQuotedIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.storesUpperCaseQuotedIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getDatabaseMinorVersion() throws SQLException {
    try {
      int targetSuccessResult = this.target.getDatabaseMinorVersion();
      this.listener.getDatabaseMinorVersion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDatabaseMinorVersion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsMixedCaseQuotedIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsMixedCaseQuotedIdentifiers();
      this.listener.supportsMixedCaseQuotedIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsMixedCaseQuotedIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsOpenCursorsAcrossCommit() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsOpenCursorsAcrossCommit();
      this.listener.supportsOpenCursorsAcrossCommit(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsOpenCursorsAcrossCommit(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getMaxTableNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxTableNameLength();
      this.listener.getMaxTableNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxTableNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsMinimumSQLGrammar() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsMinimumSQLGrammar();
      this.listener.supportsMinimumSQLGrammar(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsMinimumSQLGrammar(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getVersionColumns(String catalog, String schema, String table) throws
      SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getVersionColumns(catalog, schema, table);
      this.listener.getVersionColumns(targetSuccessResult, catalog, schema, table);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getVersionColumns(targetFailureCause, catalog, schema, table);
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

  public boolean storesMixedCaseIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.storesMixedCaseIdentifiers();
      this.listener.storesMixedCaseIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.storesMixedCaseIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getDefaultTransactionIsolation() throws SQLException {
    try {
      int targetSuccessResult = this.target.getDefaultTransactionIsolation();
      this.listener.getDefaultTransactionIsolation(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDefaultTransactionIsolation(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsBatchUpdates() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsBatchUpdates();
      this.listener.supportsBatchUpdates(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsBatchUpdates(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean usesLocalFilePerTable() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.usesLocalFilePerTable();
      this.listener.usesLocalFilePerTable(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.usesLocalFilePerTable(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean storesMixedCaseQuotedIdentifiers() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.storesMixedCaseQuotedIdentifiers();
      this.listener.storesMixedCaseQuotedIdentifiers(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.storesMixedCaseQuotedIdentifiers(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsCatalogsInTableDefinitions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsCatalogsInTableDefinitions();
      this.listener.supportsCatalogsInTableDefinitions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsCatalogsInTableDefinitions(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public String getDatabaseProductName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getDatabaseProductName();
      this.listener.getDatabaseProductName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getDatabaseProductName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getImportedKeys(String catalog, String schema, String table) throws
      SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getImportedKeys(catalog, schema, table);
      this.listener.getImportedKeys(targetSuccessResult, catalog, schema, table);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getImportedKeys(targetFailureCause, catalog, schema, table);
      throw targetFailureCause;

    }
  }

  public boolean supportsUnion() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsUnion();
      this.listener.supportsUnion(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsUnion(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean ownInsertsAreVisible(int type) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.ownInsertsAreVisible(type);
      this.listener.ownInsertsAreVisible(targetSuccessResult, type);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.ownInsertsAreVisible(targetFailureCause, type);
      throw targetFailureCause;

    }
  }

  public int getMaxCatalogNameLength() throws SQLException {
    try {
      int targetSuccessResult = this.target.getMaxCatalogNameLength();
      this.listener.getMaxCatalogNameLength(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxCatalogNameLength(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsTransactionIsolationLevel(int level) throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsTransactionIsolationLevel(level);
      this.listener.supportsTransactionIsolationLevel(targetSuccessResult, level);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsTransactionIsolationLevel(targetFailureCause, level);
      throw targetFailureCause;

    }
  }

  public boolean supportsGroupBy() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsGroupBy();
      this.listener.supportsGroupBy(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsGroupBy(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public ResultSet getPseudoColumns(String catalog, String schemaPattern, String tableNamePattern,
      String columnNamePattern) throws SQLException {
    try {
      ResultSet targetSuccessResult = this.target.getPseudoColumns(catalog, schemaPattern, tableNamePattern, columnNamePattern);
      this.listener.getPseudoColumns(targetSuccessResult, catalog, schemaPattern, tableNamePattern, columnNamePattern);
      targetSuccessResult = targetSuccessResult != null ? new ResultSetRelay(targetSuccessResult, this.listener.newResultSetListener()) : null;
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getPseudoColumns(targetFailureCause, catalog, schemaPattern, tableNamePattern, columnNamePattern);
      throw targetFailureCause;

    }
  }

  public long getMaxLogicalLobSize() throws SQLException {
    try {
      long targetSuccessResult = this.target.getMaxLogicalLobSize();
      this.listener.getMaxLogicalLobSize(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getMaxLogicalLobSize(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsStoredFunctionsUsingCallSyntax() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsStoredFunctionsUsingCallSyntax();
      this.listener.supportsStoredFunctionsUsingCallSyntax(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsStoredFunctionsUsingCallSyntax(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsDataManipulationTransactionsOnly() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsDataManipulationTransactionsOnly();
      this.listener.supportsDataManipulationTransactionsOnly(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsDataManipulationTransactionsOnly(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean nullsAreSortedLow() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.nullsAreSortedLow();
      this.listener.nullsAreSortedLow(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.nullsAreSortedLow(targetFailureCause);
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

  public boolean supportsSubqueriesInIns() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSubqueriesInIns();
      this.listener.supportsSubqueriesInIns(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSubqueriesInIns(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public boolean supportsSchemasInIndexDefinitions() throws SQLException {
    try {
      boolean targetSuccessResult = this.target.supportsSchemasInIndexDefinitions();
      this.listener.supportsSchemasInIndexDefinitions(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.supportsSchemasInIndexDefinitions(targetFailureCause);
      throw targetFailureCause;

    }
  }
}
