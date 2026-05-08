package com.impossibl.jdbc.spy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;

interface DatabaseMetaDataListener {
  void getMaxCharLiteralLength(int targetSuccessResult);

  void getMaxCharLiteralLength(Throwable targetFailureCause);

  void getCrossReference(ResultSet targetSuccessResult, String parentCatalog, String parentSchema,
      String parentTable, String foreignCatalog, String foreignSchema, String foreignTable);

  void getCrossReference(Throwable targetFailureCause, String parentCatalog, String parentSchema,
      String parentTable, String foreignCatalog, String foreignSchema, String foreignTable);

  void supportsGroupByBeyondSelect(boolean targetSuccessResult);

  void supportsGroupByBeyondSelect(Throwable targetFailureCause);

  void supportsResultSetConcurrency(boolean targetSuccessResult, int type, int concurrency);

  void supportsResultSetConcurrency(Throwable targetFailureCause, int type, int concurrency);

  void supportsLimitedOuterJoins(boolean targetSuccessResult);

  void supportsLimitedOuterJoins(Throwable targetFailureCause);

  void getMaxColumnsInOrderBy(int targetSuccessResult);

  void getMaxColumnsInOrderBy(Throwable targetFailureCause);

  void supportsRefCursors(boolean targetSuccessResult);

  void supportsRefCursors(Throwable targetFailureCause);

  void updatesAreDetected(boolean targetSuccessResult, int type);

  void updatesAreDetected(Throwable targetFailureCause, int type);

  void supportsANSI92EntryLevelSQL(boolean targetSuccessResult);

  void supportsANSI92EntryLevelSQL(Throwable targetFailureCause);

  void getMaxConnections(int targetSuccessResult);

  void getMaxConnections(Throwable targetFailureCause);

  void getMaxColumnsInSelect(int targetSuccessResult);

  void getMaxColumnsInSelect(Throwable targetFailureCause);

  void getMaxIndexLength(int targetSuccessResult);

  void getMaxIndexLength(Throwable targetFailureCause);

  void supportsNonNullableColumns(boolean targetSuccessResult);

  void supportsNonNullableColumns(Throwable targetFailureCause);

  void getMaxColumnNameLength(int targetSuccessResult);

  void getMaxColumnNameLength(Throwable targetFailureCause);

  void getTableTypes(ResultSet targetSuccessResult);

  void getTableTypes(Throwable targetFailureCause);

  void getSchemas(ResultSet targetSuccessResult);

  void getSchemas(Throwable targetFailureCause);

  void getPrimaryKeys(ResultSet targetSuccessResult, String catalog, String schema, String table);

  void getPrimaryKeys(Throwable targetFailureCause, String catalog, String schema, String table);

  void supportsStoredProcedures(boolean targetSuccessResult);

  void supportsStoredProcedures(Throwable targetFailureCause);

  void supportsOuterJoins(boolean targetSuccessResult);

  void supportsOuterJoins(Throwable targetFailureCause);

  void nullPlusNonNullIsNull(boolean targetSuccessResult);

  void nullPlusNonNullIsNull(Throwable targetFailureCause);

  void supportsSchemasInProcedureCalls(boolean targetSuccessResult);

  void supportsSchemasInProcedureCalls(Throwable targetFailureCause);

  void supportsSelectForUpdate(boolean targetSuccessResult);

  void supportsSelectForUpdate(Throwable targetFailureCause);

  void othersUpdatesAreVisible(boolean targetSuccessResult, int type);

  void othersUpdatesAreVisible(Throwable targetFailureCause, int type);

  void ownDeletesAreVisible(boolean targetSuccessResult, int type);

  void ownDeletesAreVisible(Throwable targetFailureCause, int type);

  void supportsPositionedDelete(boolean targetSuccessResult);

  void supportsPositionedDelete(Throwable targetFailureCause);

  void getMaxBinaryLiteralLength(int targetSuccessResult);

  void getMaxBinaryLiteralLength(Throwable targetFailureCause);

  void supportsSubqueriesInQuantifieds(boolean targetSuccessResult);

  void supportsSubqueriesInQuantifieds(Throwable targetFailureCause);

  void ownUpdatesAreVisible(boolean targetSuccessResult, int type);

  void ownUpdatesAreVisible(Throwable targetFailureCause, int type);

  void storesLowerCaseIdentifiers(boolean targetSuccessResult);

  void storesLowerCaseIdentifiers(Throwable targetFailureCause);

  void supportsMixedCaseIdentifiers(boolean targetSuccessResult);

  void supportsMixedCaseIdentifiers(Throwable targetFailureCause);

  void getTimeDateFunctions(String targetSuccessResult);

  void getTimeDateFunctions(Throwable targetFailureCause);

  void supportsConvert(boolean targetSuccessResult, int fromType, int toType);

  void supportsConvert(Throwable targetFailureCause, int fromType, int toType);

  void supportsFullOuterJoins(boolean targetSuccessResult);

  void supportsFullOuterJoins(Throwable targetFailureCause);

  void nullsAreSortedHigh(boolean targetSuccessResult);

  void nullsAreSortedHigh(Throwable targetFailureCause);

  void getExtraNameCharacters(String targetSuccessResult);

  void getExtraNameCharacters(Throwable targetFailureCause);

  void dataDefinitionIgnoredInTransactions(boolean targetSuccessResult);

  void dataDefinitionIgnoredInTransactions(Throwable targetFailureCause);

  void getAttributes(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String typeNamePattern, String attributeNamePattern);

  void getAttributes(Throwable targetFailureCause, String catalog, String schemaPattern,
      String typeNamePattern, String attributeNamePattern);

  void supportsCorrelatedSubqueries(boolean targetSuccessResult);

  void supportsCorrelatedSubqueries(Throwable targetFailureCause);

  void getMaxTablesInSelect(int targetSuccessResult);

  void getMaxTablesInSelect(Throwable targetFailureCause);

  void getConnection(Connection targetSuccessResult);

  void getConnection(Throwable targetFailureCause);

  void getClientInfoProperties(ResultSet targetSuccessResult);

  void getClientInfoProperties(Throwable targetFailureCause);

  void supportsStatementPooling(boolean targetSuccessResult);

  void supportsStatementPooling(Throwable targetFailureCause);

  void getMaxStatementLength(int targetSuccessResult);

  void getMaxStatementLength(Throwable targetFailureCause);

  void supportsSchemasInDataManipulation(boolean targetSuccessResult);

  void supportsSchemasInDataManipulation(Throwable targetFailureCause);

  void othersInsertsAreVisible(boolean targetSuccessResult, int type);

  void othersInsertsAreVisible(Throwable targetFailureCause, int type);

  void getSuperTypes(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String typeNamePattern);

  void getSuperTypes(Throwable targetFailureCause, String catalog, String schemaPattern,
      String typeNamePattern);

  void supportsResultSetHoldability(boolean targetSuccessResult, int holdability);

  void supportsResultSetHoldability(Throwable targetFailureCause, int holdability);

  void supportsExpressionsInOrderBy(boolean targetSuccessResult);

  void supportsExpressionsInOrderBy(Throwable targetFailureCause);

  void getSQLStateType(int targetSuccessResult);

  void getSQLStateType(Throwable targetFailureCause);

  void supportsSchemasInTableDefinitions(boolean targetSuccessResult);

  void supportsSchemasInTableDefinitions(Throwable targetFailureCause);

  void getSchemaTerm(String targetSuccessResult);

  void getSchemaTerm(Throwable targetFailureCause);

  void locatorsUpdateCopy(boolean targetSuccessResult);

  void locatorsUpdateCopy(Throwable targetFailureCause);

  void getRowIdLifetime(RowIdLifetime targetSuccessResult);

  void getRowIdLifetime(Throwable targetFailureCause);

  void getColumns(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern);

  void getColumns(Throwable targetFailureCause, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern);

  void supportsResultSetType(boolean targetSuccessResult, int type);

  void supportsResultSetType(Throwable targetFailureCause, int type);

  void autoCommitFailureClosesAllResultSets(boolean targetSuccessResult);

  void autoCommitFailureClosesAllResultSets(Throwable targetFailureCause);

  void supportsCatalogsInPrivilegeDefinitions(boolean targetSuccessResult);

  void supportsCatalogsInPrivilegeDefinitions(Throwable targetFailureCause);

  void supportsSchemasInPrivilegeDefinitions(boolean targetSuccessResult);

  void supportsSchemasInPrivilegeDefinitions(Throwable targetFailureCause);

  void getStringFunctions(String targetSuccessResult);

  void getStringFunctions(Throwable targetFailureCause);

  void supportsCoreSQLGrammar(boolean targetSuccessResult);

  void supportsCoreSQLGrammar(Throwable targetFailureCause);

  void isReadOnly(boolean targetSuccessResult);

  void isReadOnly(Throwable targetFailureCause);

  void supportsMultipleOpenResults(boolean targetSuccessResult);

  void supportsMultipleOpenResults(Throwable targetFailureCause);

  void storesLowerCaseQuotedIdentifiers(boolean targetSuccessResult);

  void storesLowerCaseQuotedIdentifiers(Throwable targetFailureCause);

  void supportsOpenCursorsAcrossRollback(boolean targetSuccessResult);

  void supportsOpenCursorsAcrossRollback(Throwable targetFailureCause);

  void supportsOrderByUnrelated(boolean targetSuccessResult);

  void supportsOrderByUnrelated(Throwable targetFailureCause);

  void supportsExtendedSQLGrammar(boolean targetSuccessResult);

  void supportsExtendedSQLGrammar(Throwable targetFailureCause);

  void supportsUnionAll(boolean targetSuccessResult);

  void supportsUnionAll(Throwable targetFailureCause);

  void getDatabaseProductVersion(String targetSuccessResult);

  void getDatabaseProductVersion(Throwable targetFailureCause);

  void usesLocalFiles(boolean targetSuccessResult);

  void usesLocalFiles(Throwable targetFailureCause);

  void supportsGetGeneratedKeys(boolean targetSuccessResult);

  void supportsGetGeneratedKeys(Throwable targetFailureCause);

  void supportsColumnAliasing(boolean targetSuccessResult);

  void supportsColumnAliasing(Throwable targetFailureCause);

  void supportsIntegrityEnhancementFacility(boolean targetSuccessResult);

  void supportsIntegrityEnhancementFacility(Throwable targetFailureCause);

  void supportsDataDefinitionAndDataManipulationTransactions(boolean targetSuccessResult);

  void supportsDataDefinitionAndDataManipulationTransactions(Throwable targetFailureCause);

  void getCatalogs(ResultSet targetSuccessResult);

  void getCatalogs(Throwable targetFailureCause);

  void getProcedureColumns(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String procedureNamePattern, String columnNamePattern);

  void getProcedureColumns(Throwable targetFailureCause, String catalog, String schemaPattern,
      String procedureNamePattern, String columnNamePattern);

  void getMaxSchemaNameLength(int targetSuccessResult);

  void getMaxSchemaNameLength(Throwable targetFailureCause);

  void getMaxColumnsInGroupBy(int targetSuccessResult);

  void getMaxColumnsInGroupBy(Throwable targetFailureCause);

  void supportsCatalogsInDataManipulation(boolean targetSuccessResult);

  void supportsCatalogsInDataManipulation(Throwable targetFailureCause);

  void supportsCatalogsInIndexDefinitions(boolean targetSuccessResult);

  void supportsCatalogsInIndexDefinitions(Throwable targetFailureCause);

  void getFunctions(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String functionNamePattern);

  void getFunctions(Throwable targetFailureCause, String catalog, String schemaPattern,
      String functionNamePattern);

  void getDriverVersion(String targetSuccessResult);

  void getDriverVersion(Throwable targetFailureCause);

  void getJDBCMajorVersion(int targetSuccessResult);

  void getJDBCMajorVersion(Throwable targetFailureCause);

  void getDriverMinorVersion(int targetSuccessResult);

  void getDriverMinorVersion(Throwable targetFailureCause);

  void deletesAreDetected(boolean targetSuccessResult, int type);

  void deletesAreDetected(Throwable targetFailureCause, int type);

  void supportsSavepoints(boolean targetSuccessResult);

  void supportsSavepoints(Throwable targetFailureCause);

  void getSQLKeywords(String targetSuccessResult);

  void getSQLKeywords(Throwable targetFailureCause);

  void getMaxColumnsInTable(int targetSuccessResult);

  void getMaxColumnsInTable(Throwable targetFailureCause);

  void getDriverName(String targetSuccessResult);

  void getDriverName(Throwable targetFailureCause);

  void allTablesAreSelectable(boolean targetSuccessResult);

  void allTablesAreSelectable(Throwable targetFailureCause);

  void supportsAlterTableWithDropColumn(boolean targetSuccessResult);

  void supportsAlterTableWithDropColumn(Throwable targetFailureCause);

  void supportsANSI92FullSQL(boolean targetSuccessResult);

  void supportsANSI92FullSQL(Throwable targetFailureCause);

  void supportsPositionedUpdate(boolean targetSuccessResult);

  void supportsPositionedUpdate(Throwable targetFailureCause);

  void getColumnPrivileges(ResultSet targetSuccessResult, String catalog, String schema,
      String table, String columnNamePattern);

  void getColumnPrivileges(Throwable targetFailureCause, String catalog, String schema,
      String table, String columnNamePattern);

  void supportsDifferentTableCorrelationNames(boolean targetSuccessResult);

  void supportsDifferentTableCorrelationNames(Throwable targetFailureCause);

  void getExportedKeys(ResultSet targetSuccessResult, String catalog, String schema, String table);

  void getExportedKeys(Throwable targetFailureCause, String catalog, String schema, String table);

  void supportsMultipleTransactions(boolean targetSuccessResult);

  void supportsMultipleTransactions(Throwable targetFailureCause);

  void supportsSubqueriesInExists(boolean targetSuccessResult);

  void supportsSubqueriesInExists(Throwable targetFailureCause);

  void getCatalogTerm(String targetSuccessResult);

  void getCatalogTerm(Throwable targetFailureCause);

  void getMaxColumnsInIndex(int targetSuccessResult);

  void getMaxColumnsInIndex(Throwable targetFailureCause);

  void getSchemas(ResultSet targetSuccessResult, String catalog, String schemaPattern);

  void getSchemas(Throwable targetFailureCause, String catalog, String schemaPattern);

  void getFunctionColumns(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String functionNamePattern, String columnNamePattern);

  void getFunctionColumns(Throwable targetFailureCause, String catalog, String schemaPattern,
      String functionNamePattern, String columnNamePattern);

  void supportsSubqueriesInComparisons(boolean targetSuccessResult);

  void supportsSubqueriesInComparisons(Throwable targetFailureCause);

  void getSuperTables(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String tableNamePattern);

  void getSuperTables(Throwable targetFailureCause, String catalog, String schemaPattern,
      String tableNamePattern);

  void supportsLikeEscapeClause(boolean targetSuccessResult);

  void supportsLikeEscapeClause(Throwable targetFailureCause);

  void getIndexInfo(ResultSet targetSuccessResult, String catalog, String schema, String table,
      boolean unique, boolean approximate);

  void getIndexInfo(Throwable targetFailureCause, String catalog, String schema, String table,
      boolean unique, boolean approximate);

  void getJDBCMinorVersion(int targetSuccessResult);

  void getJDBCMinorVersion(Throwable targetFailureCause);

  void getSearchStringEscape(String targetSuccessResult);

  void getSearchStringEscape(Throwable targetFailureCause);

  void supportsOpenStatementsAcrossRollback(boolean targetSuccessResult);

  void supportsOpenStatementsAcrossRollback(Throwable targetFailureCause);

  void supportsTableCorrelationNames(boolean targetSuccessResult);

  void supportsTableCorrelationNames(Throwable targetFailureCause);

  void getTypeInfo(ResultSet targetSuccessResult);

  void getTypeInfo(Throwable targetFailureCause);

  void getMaxUserNameLength(int targetSuccessResult);

  void getMaxUserNameLength(Throwable targetFailureCause);

  void doesMaxRowSizeIncludeBlobs(boolean targetSuccessResult);

  void doesMaxRowSizeIncludeBlobs(Throwable targetFailureCause);

  void getDriverMajorVersion(int targetSuccessResult);

  void getDriverMajorVersion(Throwable targetFailureCause);

  void supportsAlterTableWithAddColumn(boolean targetSuccessResult);

  void supportsAlterTableWithAddColumn(Throwable targetFailureCause);

  void getURL(String targetSuccessResult);

  void getURL(Throwable targetFailureCause);

  void getMaxCursorNameLength(int targetSuccessResult);

  void getMaxCursorNameLength(Throwable targetFailureCause);

  void insertsAreDetected(boolean targetSuccessResult, int type);

  void insertsAreDetected(Throwable targetFailureCause, int type);

  void getResultSetHoldability(int targetSuccessResult);

  void getResultSetHoldability(Throwable targetFailureCause);

  void getSystemFunctions(String targetSuccessResult);

  void getSystemFunctions(Throwable targetFailureCause);

  void supportsCatalogsInProcedureCalls(boolean targetSuccessResult);

  void supportsCatalogsInProcedureCalls(Throwable targetFailureCause);

  void supportsConvert(boolean targetSuccessResult);

  void supportsConvert(Throwable targetFailureCause);

  void supportsOpenStatementsAcrossCommit(boolean targetSuccessResult);

  void supportsOpenStatementsAcrossCommit(Throwable targetFailureCause);

  void supportsNamedParameters(boolean targetSuccessResult);

  void supportsNamedParameters(Throwable targetFailureCause);

  void othersDeletesAreVisible(boolean targetSuccessResult, int type);

  void othersDeletesAreVisible(Throwable targetFailureCause, int type);

  void supportsTransactions(boolean targetSuccessResult);

  void supportsTransactions(Throwable targetFailureCause);

  void getMaxRowSize(int targetSuccessResult);

  void getMaxRowSize(Throwable targetFailureCause);

  void supportsANSI92IntermediateSQL(boolean targetSuccessResult);

  void supportsANSI92IntermediateSQL(Throwable targetFailureCause);

  void getProcedureTerm(String targetSuccessResult);

  void getProcedureTerm(Throwable targetFailureCause);

  void getMaxStatements(int targetSuccessResult);

  void getMaxStatements(Throwable targetFailureCause);

  void nullsAreSortedAtEnd(boolean targetSuccessResult);

  void nullsAreSortedAtEnd(Throwable targetFailureCause);

  void getIdentifierQuoteString(String targetSuccessResult);

  void getIdentifierQuoteString(Throwable targetFailureCause);

  void storesUpperCaseIdentifiers(boolean targetSuccessResult);

  void storesUpperCaseIdentifiers(Throwable targetFailureCause);

  void isCatalogAtStart(boolean targetSuccessResult);

  void isCatalogAtStart(Throwable targetFailureCause);

  void getCatalogSeparator(String targetSuccessResult);

  void getCatalogSeparator(Throwable targetFailureCause);

  void getTables(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String tableNamePattern, String[] types);

  void getTables(Throwable targetFailureCause, String catalog, String schemaPattern,
      String tableNamePattern, String[] types);

  void getMaxProcedureNameLength(int targetSuccessResult);

  void getMaxProcedureNameLength(Throwable targetFailureCause);

  void getNumericFunctions(String targetSuccessResult);

  void getNumericFunctions(Throwable targetFailureCause);

  void nullsAreSortedAtStart(boolean targetSuccessResult);

  void nullsAreSortedAtStart(Throwable targetFailureCause);

  void supportsGroupByUnrelated(boolean targetSuccessResult);

  void supportsGroupByUnrelated(Throwable targetFailureCause);

  void getTablePrivileges(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String tableNamePattern);

  void getTablePrivileges(Throwable targetFailureCause, String catalog, String schemaPattern,
      String tableNamePattern);

  void getProcedures(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String procedureNamePattern);

  void getProcedures(Throwable targetFailureCause, String catalog, String schemaPattern,
      String procedureNamePattern);

  void getDatabaseMajorVersion(int targetSuccessResult);

  void getDatabaseMajorVersion(Throwable targetFailureCause);

  void generatedKeyAlwaysReturned(boolean targetSuccessResult);

  void generatedKeyAlwaysReturned(Throwable targetFailureCause);

  void allProceduresAreCallable(boolean targetSuccessResult);

  void allProceduresAreCallable(Throwable targetFailureCause);

  void supportsMultipleResultSets(boolean targetSuccessResult);

  void supportsMultipleResultSets(Throwable targetFailureCause);

  void getBestRowIdentifier(ResultSet targetSuccessResult, String catalog, String schema,
      String table, int scope, boolean nullable);

  void getBestRowIdentifier(Throwable targetFailureCause, String catalog, String schema,
      String table, int scope, boolean nullable);

  void getUserName(String targetSuccessResult);

  void getUserName(Throwable targetFailureCause);

  void dataDefinitionCausesTransactionCommit(boolean targetSuccessResult);

  void dataDefinitionCausesTransactionCommit(Throwable targetFailureCause);

  void getUDTs(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String typeNamePattern, int[] types);

  void getUDTs(Throwable targetFailureCause, String catalog, String schemaPattern,
      String typeNamePattern, int[] types);

  void storesUpperCaseQuotedIdentifiers(boolean targetSuccessResult);

  void storesUpperCaseQuotedIdentifiers(Throwable targetFailureCause);

  void getDatabaseMinorVersion(int targetSuccessResult);

  void getDatabaseMinorVersion(Throwable targetFailureCause);

  void supportsMixedCaseQuotedIdentifiers(boolean targetSuccessResult);

  void supportsMixedCaseQuotedIdentifiers(Throwable targetFailureCause);

  void supportsOpenCursorsAcrossCommit(boolean targetSuccessResult);

  void supportsOpenCursorsAcrossCommit(Throwable targetFailureCause);

  void getMaxTableNameLength(int targetSuccessResult);

  void getMaxTableNameLength(Throwable targetFailureCause);

  void supportsMinimumSQLGrammar(boolean targetSuccessResult);

  void supportsMinimumSQLGrammar(Throwable targetFailureCause);

  void getVersionColumns(ResultSet targetSuccessResult, String catalog, String schema,
      String table);

  void getVersionColumns(Throwable targetFailureCause, String catalog, String schema, String table);

  void isWrapperFor(boolean targetSuccessResult, Class<?> iface);

  void isWrapperFor(Throwable targetFailureCause, Class<?> iface);

  void storesMixedCaseIdentifiers(boolean targetSuccessResult);

  void storesMixedCaseIdentifiers(Throwable targetFailureCause);

  void getDefaultTransactionIsolation(int targetSuccessResult);

  void getDefaultTransactionIsolation(Throwable targetFailureCause);

  void supportsBatchUpdates(boolean targetSuccessResult);

  void supportsBatchUpdates(Throwable targetFailureCause);

  void usesLocalFilePerTable(boolean targetSuccessResult);

  void usesLocalFilePerTable(Throwable targetFailureCause);

  void storesMixedCaseQuotedIdentifiers(boolean targetSuccessResult);

  void storesMixedCaseQuotedIdentifiers(Throwable targetFailureCause);

  void supportsCatalogsInTableDefinitions(boolean targetSuccessResult);

  void supportsCatalogsInTableDefinitions(Throwable targetFailureCause);

  void getDatabaseProductName(String targetSuccessResult);

  void getDatabaseProductName(Throwable targetFailureCause);

  void getImportedKeys(ResultSet targetSuccessResult, String catalog, String schema, String table);

  void getImportedKeys(Throwable targetFailureCause, String catalog, String schema, String table);

  void supportsUnion(boolean targetSuccessResult);

  void supportsUnion(Throwable targetFailureCause);

  void ownInsertsAreVisible(boolean targetSuccessResult, int type);

  void ownInsertsAreVisible(Throwable targetFailureCause, int type);

  void getMaxCatalogNameLength(int targetSuccessResult);

  void getMaxCatalogNameLength(Throwable targetFailureCause);

  void supportsTransactionIsolationLevel(boolean targetSuccessResult, int level);

  void supportsTransactionIsolationLevel(Throwable targetFailureCause, int level);

  void supportsGroupBy(boolean targetSuccessResult);

  void supportsGroupBy(Throwable targetFailureCause);

  void getPseudoColumns(ResultSet targetSuccessResult, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern);

  void getPseudoColumns(Throwable targetFailureCause, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern);

  void getMaxLogicalLobSize(long targetSuccessResult);

  void getMaxLogicalLobSize(Throwable targetFailureCause);

  void supportsStoredFunctionsUsingCallSyntax(boolean targetSuccessResult);

  void supportsStoredFunctionsUsingCallSyntax(Throwable targetFailureCause);

  void supportsDataManipulationTransactionsOnly(boolean targetSuccessResult);

  void supportsDataManipulationTransactionsOnly(Throwable targetFailureCause);

  void nullsAreSortedLow(boolean targetSuccessResult);

  void nullsAreSortedLow(Throwable targetFailureCause);

  <T> void unwrap(T targetSuccessResult, Class<T> iface);

  <T> void unwrap(Throwable targetFailureCause, Class<T> iface);

  void supportsSubqueriesInIns(boolean targetSuccessResult);

  void supportsSubqueriesInIns(Throwable targetFailureCause);

  void supportsSchemasInIndexDefinitions(boolean targetSuccessResult);

  void supportsSchemasInIndexDefinitions(Throwable targetFailureCause);

  ResultSetListener newResultSetListener();

  ConnectionListener newConnectionListener();
}
