package com.impossibl.jdbc.spy;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.RowIdLifetime;

public class DatabaseMetaDataTracer implements DatabaseMetaDataListener {
  TraceOutput out;

  public DatabaseMetaDataTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void getMaxCharLiteralLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxCharLiteralLength")
        .returned(result)
        .build());
  }

  public void getMaxCharLiteralLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxCharLiteralLength")
        .threw(cause)
        .build());
  }

  public void getCrossReference(ResultSet result, String parentCatalog, String parentSchema,
      String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) {
    trace(new Trace.Builder("DatabaseMetaData", "getCrossReference")
        .withParameter("parentCatalog", parentCatalog)
        .withParameter("parentSchema", parentSchema)
        .withParameter("parentTable", parentTable)
        .withParameter("foreignCatalog", foreignCatalog)
        .withParameter("foreignSchema", foreignSchema)
        .withParameter("foreignTable", foreignTable)
        .returned(result)
        .build());
  }

  public void getCrossReference(Throwable cause, String parentCatalog, String parentSchema,
      String parentTable, String foreignCatalog, String foreignSchema, String foreignTable) {
    trace(new Trace.Builder("DatabaseMetaData", "getCrossReference")
        .withParameter("parentCatalog", parentCatalog)
        .withParameter("parentSchema", parentSchema)
        .withParameter("parentTable", parentTable)
        .withParameter("foreignCatalog", foreignCatalog)
        .withParameter("foreignSchema", foreignSchema)
        .withParameter("foreignTable", foreignTable)
        .threw(cause)
        .build());
  }

  public void supportsGroupByBeyondSelect(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGroupByBeyondSelect")
        .returned(result)
        .build());
  }

  public void supportsGroupByBeyondSelect(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGroupByBeyondSelect")
        .threw(cause)
        .build());
  }

  public void supportsResultSetConcurrency(boolean result, int type, int concurrency) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsResultSetConcurrency")
        .withParameter("type", type)
        .withParameter("concurrency", concurrency)
        .returned(result)
        .build());
  }

  public void supportsResultSetConcurrency(Throwable cause, int type, int concurrency) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsResultSetConcurrency")
        .withParameter("type", type)
        .withParameter("concurrency", concurrency)
        .threw(cause)
        .build());
  }

  public void supportsLimitedOuterJoins(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsLimitedOuterJoins")
        .returned(result)
        .build());
  }

  public void supportsLimitedOuterJoins(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsLimitedOuterJoins")
        .threw(cause)
        .build());
  }

  public void getMaxColumnsInOrderBy(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInOrderBy")
        .returned(result)
        .build());
  }

  public void getMaxColumnsInOrderBy(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInOrderBy")
        .threw(cause)
        .build());
  }

  public void supportsRefCursors(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsRefCursors")
        .returned(result)
        .build());
  }

  public void supportsRefCursors(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsRefCursors")
        .threw(cause)
        .build());
  }

  public void updatesAreDetected(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "updatesAreDetected")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void updatesAreDetected(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "updatesAreDetected")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void supportsANSI92EntryLevelSQL(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsANSI92EntryLevelSQL")
        .returned(result)
        .build());
  }

  public void supportsANSI92EntryLevelSQL(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsANSI92EntryLevelSQL")
        .threw(cause)
        .build());
  }

  public void getMaxConnections(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxConnections")
        .returned(result)
        .build());
  }

  public void getMaxConnections(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxConnections")
        .threw(cause)
        .build());
  }

  public void getMaxColumnsInSelect(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInSelect")
        .returned(result)
        .build());
  }

  public void getMaxColumnsInSelect(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInSelect")
        .threw(cause)
        .build());
  }

  public void getMaxIndexLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxIndexLength")
        .returned(result)
        .build());
  }

  public void getMaxIndexLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxIndexLength")
        .threw(cause)
        .build());
  }

  public void supportsNonNullableColumns(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsNonNullableColumns")
        .returned(result)
        .build());
  }

  public void supportsNonNullableColumns(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsNonNullableColumns")
        .threw(cause)
        .build());
  }

  public void getMaxColumnNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnNameLength")
        .returned(result)
        .build());
  }

  public void getMaxColumnNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnNameLength")
        .threw(cause)
        .build());
  }

  public void getTableTypes(ResultSet result) {
    trace(new Trace.Builder("DatabaseMetaData", "getTableTypes")
        .returned(result)
        .build());
  }

  public void getTableTypes(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getTableTypes")
        .threw(cause)
        .build());
  }

  public void getSchemas(ResultSet result) {
    trace(new Trace.Builder("DatabaseMetaData", "getSchemas")
        .returned(result)
        .build());
  }

  public void getSchemas(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getSchemas")
        .threw(cause)
        .build());
  }

  public void getPrimaryKeys(ResultSet result, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getPrimaryKeys")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .returned(result)
        .build());
  }

  public void getPrimaryKeys(Throwable cause, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getPrimaryKeys")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .threw(cause)
        .build());
  }

  public void supportsStoredProcedures(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsStoredProcedures")
        .returned(result)
        .build());
  }

  public void supportsStoredProcedures(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsStoredProcedures")
        .threw(cause)
        .build());
  }

  public void supportsOuterJoins(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOuterJoins")
        .returned(result)
        .build());
  }

  public void supportsOuterJoins(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOuterJoins")
        .threw(cause)
        .build());
  }

  public void nullPlusNonNullIsNull(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "nullPlusNonNullIsNull")
        .returned(result)
        .build());
  }

  public void nullPlusNonNullIsNull(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "nullPlusNonNullIsNull")
        .threw(cause)
        .build());
  }

  public void supportsSchemasInProcedureCalls(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInProcedureCalls")
        .returned(result)
        .build());
  }

  public void supportsSchemasInProcedureCalls(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInProcedureCalls")
        .threw(cause)
        .build());
  }

  public void supportsSelectForUpdate(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSelectForUpdate")
        .returned(result)
        .build());
  }

  public void supportsSelectForUpdate(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSelectForUpdate")
        .threw(cause)
        .build());
  }

  public void othersUpdatesAreVisible(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "othersUpdatesAreVisible")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void othersUpdatesAreVisible(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "othersUpdatesAreVisible")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void ownDeletesAreVisible(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "ownDeletesAreVisible")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void ownDeletesAreVisible(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "ownDeletesAreVisible")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void supportsPositionedDelete(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsPositionedDelete")
        .returned(result)
        .build());
  }

  public void supportsPositionedDelete(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsPositionedDelete")
        .threw(cause)
        .build());
  }

  public void getMaxBinaryLiteralLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxBinaryLiteralLength")
        .returned(result)
        .build());
  }

  public void getMaxBinaryLiteralLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxBinaryLiteralLength")
        .threw(cause)
        .build());
  }

  public void supportsSubqueriesInQuantifieds(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInQuantifieds")
        .returned(result)
        .build());
  }

  public void supportsSubqueriesInQuantifieds(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInQuantifieds")
        .threw(cause)
        .build());
  }

  public void ownUpdatesAreVisible(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "ownUpdatesAreVisible")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void ownUpdatesAreVisible(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "ownUpdatesAreVisible")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void storesLowerCaseIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "storesLowerCaseIdentifiers")
        .returned(result)
        .build());
  }

  public void storesLowerCaseIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "storesLowerCaseIdentifiers")
        .threw(cause)
        .build());
  }

  public void supportsMixedCaseIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMixedCaseIdentifiers")
        .returned(result)
        .build());
  }

  public void supportsMixedCaseIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMixedCaseIdentifiers")
        .threw(cause)
        .build());
  }

  public void getTimeDateFunctions(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getTimeDateFunctions")
        .returned(result)
        .build());
  }

  public void getTimeDateFunctions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getTimeDateFunctions")
        .threw(cause)
        .build());
  }

  public void supportsConvert(boolean result, int fromType, int toType) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsConvert")
        .withParameter("fromType", fromType)
        .withParameter("toType", toType)
        .returned(result)
        .build());
  }

  public void supportsConvert(Throwable cause, int fromType, int toType) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsConvert")
        .withParameter("fromType", fromType)
        .withParameter("toType", toType)
        .threw(cause)
        .build());
  }

  public void supportsFullOuterJoins(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsFullOuterJoins")
        .returned(result)
        .build());
  }

  public void supportsFullOuterJoins(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsFullOuterJoins")
        .threw(cause)
        .build());
  }

  public void nullsAreSortedHigh(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedHigh")
        .returned(result)
        .build());
  }

  public void nullsAreSortedHigh(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedHigh")
        .threw(cause)
        .build());
  }

  public void getExtraNameCharacters(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getExtraNameCharacters")
        .returned(result)
        .build());
  }

  public void getExtraNameCharacters(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getExtraNameCharacters")
        .threw(cause)
        .build());
  }

  public void dataDefinitionIgnoredInTransactions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "dataDefinitionIgnoredInTransactions")
        .returned(result)
        .build());
  }

  public void dataDefinitionIgnoredInTransactions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "dataDefinitionIgnoredInTransactions")
        .threw(cause)
        .build());
  }

  public void getAttributes(ResultSet result, String catalog, String schemaPattern,
      String typeNamePattern, String attributeNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getAttributes")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("typeNamePattern", typeNamePattern)
        .withParameter("attributeNamePattern", attributeNamePattern)
        .returned(result)
        .build());
  }

  public void getAttributes(Throwable cause, String catalog, String schemaPattern,
      String typeNamePattern, String attributeNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getAttributes")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("typeNamePattern", typeNamePattern)
        .withParameter("attributeNamePattern", attributeNamePattern)
        .threw(cause)
        .build());
  }

  public void supportsCorrelatedSubqueries(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCorrelatedSubqueries")
        .returned(result)
        .build());
  }

  public void supportsCorrelatedSubqueries(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCorrelatedSubqueries")
        .threw(cause)
        .build());
  }

  public void getMaxTablesInSelect(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxTablesInSelect")
        .returned(result)
        .build());
  }

  public void getMaxTablesInSelect(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxTablesInSelect")
        .threw(cause)
        .build());
  }

  public void getConnection(Connection result) {
    trace(new Trace.Builder("DatabaseMetaData", "getConnection")
        .returned(result)
        .build());
  }

  public void getConnection(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getConnection")
        .threw(cause)
        .build());
  }

  public void getClientInfoProperties(ResultSet result) {
    trace(new Trace.Builder("DatabaseMetaData", "getClientInfoProperties")
        .returned(result)
        .build());
  }

  public void getClientInfoProperties(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getClientInfoProperties")
        .threw(cause)
        .build());
  }

  public void supportsStatementPooling(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsStatementPooling")
        .returned(result)
        .build());
  }

  public void supportsStatementPooling(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsStatementPooling")
        .threw(cause)
        .build());
  }

  public void getMaxStatementLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxStatementLength")
        .returned(result)
        .build());
  }

  public void getMaxStatementLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxStatementLength")
        .threw(cause)
        .build());
  }

  public void supportsSchemasInDataManipulation(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInDataManipulation")
        .returned(result)
        .build());
  }

  public void supportsSchemasInDataManipulation(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInDataManipulation")
        .threw(cause)
        .build());
  }

  public void othersInsertsAreVisible(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "othersInsertsAreVisible")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void othersInsertsAreVisible(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "othersInsertsAreVisible")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void getSuperTypes(ResultSet result, String catalog, String schemaPattern,
      String typeNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getSuperTypes")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("typeNamePattern", typeNamePattern)
        .returned(result)
        .build());
  }

  public void getSuperTypes(Throwable cause, String catalog, String schemaPattern,
      String typeNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getSuperTypes")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("typeNamePattern", typeNamePattern)
        .threw(cause)
        .build());
  }

  public void supportsResultSetHoldability(boolean result, int holdability) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsResultSetHoldability")
        .withParameter("holdability", holdability)
        .returned(result)
        .build());
  }

  public void supportsResultSetHoldability(Throwable cause, int holdability) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsResultSetHoldability")
        .withParameter("holdability", holdability)
        .threw(cause)
        .build());
  }

  public void supportsExpressionsInOrderBy(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsExpressionsInOrderBy")
        .returned(result)
        .build());
  }

  public void supportsExpressionsInOrderBy(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsExpressionsInOrderBy")
        .threw(cause)
        .build());
  }

  public void getSQLStateType(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getSQLStateType")
        .returned(result)
        .build());
  }

  public void getSQLStateType(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getSQLStateType")
        .threw(cause)
        .build());
  }

  public void supportsSchemasInTableDefinitions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInTableDefinitions")
        .returned(result)
        .build());
  }

  public void supportsSchemasInTableDefinitions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInTableDefinitions")
        .threw(cause)
        .build());
  }

  public void getSchemaTerm(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getSchemaTerm")
        .returned(result)
        .build());
  }

  public void getSchemaTerm(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getSchemaTerm")
        .threw(cause)
        .build());
  }

  public void locatorsUpdateCopy(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "locatorsUpdateCopy")
        .returned(result)
        .build());
  }

  public void locatorsUpdateCopy(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "locatorsUpdateCopy")
        .threw(cause)
        .build());
  }

  public void getRowIdLifetime(RowIdLifetime result) {
    trace(new Trace.Builder("DatabaseMetaData", "getRowIdLifetime")
        .returned(result)
        .build());
  }

  public void getRowIdLifetime(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getRowIdLifetime")
        .threw(cause)
        .build());
  }

  public void getColumns(ResultSet result, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .returned(result)
        .build());
  }

  public void getColumns(Throwable cause, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .threw(cause)
        .build());
  }

  public void supportsResultSetType(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsResultSetType")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void supportsResultSetType(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsResultSetType")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void autoCommitFailureClosesAllResultSets(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "autoCommitFailureClosesAllResultSets")
        .returned(result)
        .build());
  }

  public void autoCommitFailureClosesAllResultSets(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "autoCommitFailureClosesAllResultSets")
        .threw(cause)
        .build());
  }

  public void supportsCatalogsInPrivilegeDefinitions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInPrivilegeDefinitions")
        .returned(result)
        .build());
  }

  public void supportsCatalogsInPrivilegeDefinitions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInPrivilegeDefinitions")
        .threw(cause)
        .build());
  }

  public void supportsSchemasInPrivilegeDefinitions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInPrivilegeDefinitions")
        .returned(result)
        .build());
  }

  public void supportsSchemasInPrivilegeDefinitions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInPrivilegeDefinitions")
        .threw(cause)
        .build());
  }

  public void getStringFunctions(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getStringFunctions")
        .returned(result)
        .build());
  }

  public void getStringFunctions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getStringFunctions")
        .threw(cause)
        .build());
  }

  public void supportsCoreSQLGrammar(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCoreSQLGrammar")
        .returned(result)
        .build());
  }

  public void supportsCoreSQLGrammar(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCoreSQLGrammar")
        .threw(cause)
        .build());
  }

  public void isReadOnly(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "isReadOnly")
        .returned(result)
        .build());
  }

  public void isReadOnly(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "isReadOnly")
        .threw(cause)
        .build());
  }

  public void supportsMultipleOpenResults(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMultipleOpenResults")
        .returned(result)
        .build());
  }

  public void supportsMultipleOpenResults(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMultipleOpenResults")
        .threw(cause)
        .build());
  }

  public void storesLowerCaseQuotedIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "storesLowerCaseQuotedIdentifiers")
        .returned(result)
        .build());
  }

  public void storesLowerCaseQuotedIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "storesLowerCaseQuotedIdentifiers")
        .threw(cause)
        .build());
  }

  public void supportsOpenCursorsAcrossRollback(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenCursorsAcrossRollback")
        .returned(result)
        .build());
  }

  public void supportsOpenCursorsAcrossRollback(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenCursorsAcrossRollback")
        .threw(cause)
        .build());
  }

  public void supportsOrderByUnrelated(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOrderByUnrelated")
        .returned(result)
        .build());
  }

  public void supportsOrderByUnrelated(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOrderByUnrelated")
        .threw(cause)
        .build());
  }

  public void supportsExtendedSQLGrammar(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsExtendedSQLGrammar")
        .returned(result)
        .build());
  }

  public void supportsExtendedSQLGrammar(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsExtendedSQLGrammar")
        .threw(cause)
        .build());
  }

  public void supportsUnionAll(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsUnionAll")
        .returned(result)
        .build());
  }

  public void supportsUnionAll(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsUnionAll")
        .threw(cause)
        .build());
  }

  public void getDatabaseProductVersion(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseProductVersion")
        .returned(result)
        .build());
  }

  public void getDatabaseProductVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseProductVersion")
        .threw(cause)
        .build());
  }

  public void usesLocalFiles(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "usesLocalFiles")
        .returned(result)
        .build());
  }

  public void usesLocalFiles(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "usesLocalFiles")
        .threw(cause)
        .build());
  }

  public void supportsGetGeneratedKeys(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGetGeneratedKeys")
        .returned(result)
        .build());
  }

  public void supportsGetGeneratedKeys(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGetGeneratedKeys")
        .threw(cause)
        .build());
  }

  public void supportsColumnAliasing(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsColumnAliasing")
        .returned(result)
        .build());
  }

  public void supportsColumnAliasing(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsColumnAliasing")
        .threw(cause)
        .build());
  }

  public void supportsIntegrityEnhancementFacility(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsIntegrityEnhancementFacility")
        .returned(result)
        .build());
  }

  public void supportsIntegrityEnhancementFacility(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsIntegrityEnhancementFacility")
        .threw(cause)
        .build());
  }

  public void supportsDataDefinitionAndDataManipulationTransactions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsDataDefinitionAndDataManipulationTransactions")
        .returned(result)
        .build());
  }

  public void supportsDataDefinitionAndDataManipulationTransactions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsDataDefinitionAndDataManipulationTransactions")
        .threw(cause)
        .build());
  }

  public void getCatalogs(ResultSet result) {
    trace(new Trace.Builder("DatabaseMetaData", "getCatalogs")
        .returned(result)
        .build());
  }

  public void getCatalogs(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getCatalogs")
        .threw(cause)
        .build());
  }

  public void getProcedureColumns(ResultSet result, String catalog, String schemaPattern,
      String procedureNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getProcedureColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("procedureNamePattern", procedureNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .returned(result)
        .build());
  }

  public void getProcedureColumns(Throwable cause, String catalog, String schemaPattern,
      String procedureNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getProcedureColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("procedureNamePattern", procedureNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .threw(cause)
        .build());
  }

  public void getMaxSchemaNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxSchemaNameLength")
        .returned(result)
        .build());
  }

  public void getMaxSchemaNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxSchemaNameLength")
        .threw(cause)
        .build());
  }

  public void getMaxColumnsInGroupBy(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInGroupBy")
        .returned(result)
        .build());
  }

  public void getMaxColumnsInGroupBy(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInGroupBy")
        .threw(cause)
        .build());
  }

  public void supportsCatalogsInDataManipulation(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInDataManipulation")
        .returned(result)
        .build());
  }

  public void supportsCatalogsInDataManipulation(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInDataManipulation")
        .threw(cause)
        .build());
  }

  public void supportsCatalogsInIndexDefinitions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInIndexDefinitions")
        .returned(result)
        .build());
  }

  public void supportsCatalogsInIndexDefinitions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInIndexDefinitions")
        .threw(cause)
        .build());
  }

  public void getFunctions(ResultSet result, String catalog, String schemaPattern,
      String functionNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getFunctions")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("functionNamePattern", functionNamePattern)
        .returned(result)
        .build());
  }

  public void getFunctions(Throwable cause, String catalog, String schemaPattern,
      String functionNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getFunctions")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("functionNamePattern", functionNamePattern)
        .threw(cause)
        .build());
  }

  public void getDriverVersion(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverVersion")
        .returned(result)
        .build());
  }

  public void getDriverVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverVersion")
        .threw(cause)
        .build());
  }

  public void getJDBCMajorVersion(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getJDBCMajorVersion")
        .returned(result)
        .build());
  }

  public void getJDBCMajorVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getJDBCMajorVersion")
        .threw(cause)
        .build());
  }

  public void getDriverMinorVersion(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverMinorVersion")
        .returned(result)
        .build());
  }

  public void getDriverMinorVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverMinorVersion")
        .threw(cause)
        .build());
  }

  public void deletesAreDetected(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "deletesAreDetected")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void deletesAreDetected(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "deletesAreDetected")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void supportsSavepoints(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSavepoints")
        .returned(result)
        .build());
  }

  public void supportsSavepoints(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSavepoints")
        .threw(cause)
        .build());
  }

  public void getSQLKeywords(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getSQLKeywords")
        .returned(result)
        .build());
  }

  public void getSQLKeywords(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getSQLKeywords")
        .threw(cause)
        .build());
  }

  public void getMaxColumnsInTable(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInTable")
        .returned(result)
        .build());
  }

  public void getMaxColumnsInTable(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInTable")
        .threw(cause)
        .build());
  }

  public void getDriverName(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverName")
        .returned(result)
        .build());
  }

  public void getDriverName(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverName")
        .threw(cause)
        .build());
  }

  public void allTablesAreSelectable(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "allTablesAreSelectable")
        .returned(result)
        .build());
  }

  public void allTablesAreSelectable(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "allTablesAreSelectable")
        .threw(cause)
        .build());
  }

  public void supportsAlterTableWithDropColumn(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsAlterTableWithDropColumn")
        .returned(result)
        .build());
  }

  public void supportsAlterTableWithDropColumn(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsAlterTableWithDropColumn")
        .threw(cause)
        .build());
  }

  public void supportsANSI92FullSQL(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsANSI92FullSQL")
        .returned(result)
        .build());
  }

  public void supportsANSI92FullSQL(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsANSI92FullSQL")
        .threw(cause)
        .build());
  }

  public void supportsPositionedUpdate(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsPositionedUpdate")
        .returned(result)
        .build());
  }

  public void supportsPositionedUpdate(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsPositionedUpdate")
        .threw(cause)
        .build());
  }

  public void getColumnPrivileges(ResultSet result, String catalog, String schema, String table,
      String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getColumnPrivileges")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .withParameter("columnNamePattern", columnNamePattern)
        .returned(result)
        .build());
  }

  public void getColumnPrivileges(Throwable cause, String catalog, String schema, String table,
      String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getColumnPrivileges")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .withParameter("columnNamePattern", columnNamePattern)
        .threw(cause)
        .build());
  }

  public void supportsDifferentTableCorrelationNames(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsDifferentTableCorrelationNames")
        .returned(result)
        .build());
  }

  public void supportsDifferentTableCorrelationNames(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsDifferentTableCorrelationNames")
        .threw(cause)
        .build());
  }

  public void getExportedKeys(ResultSet result, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getExportedKeys")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .returned(result)
        .build());
  }

  public void getExportedKeys(Throwable cause, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getExportedKeys")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .threw(cause)
        .build());
  }

  public void supportsMultipleTransactions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMultipleTransactions")
        .returned(result)
        .build());
  }

  public void supportsMultipleTransactions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMultipleTransactions")
        .threw(cause)
        .build());
  }

  public void supportsSubqueriesInExists(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInExists")
        .returned(result)
        .build());
  }

  public void supportsSubqueriesInExists(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInExists")
        .threw(cause)
        .build());
  }

  public void getCatalogTerm(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getCatalogTerm")
        .returned(result)
        .build());
  }

  public void getCatalogTerm(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getCatalogTerm")
        .threw(cause)
        .build());
  }

  public void getMaxColumnsInIndex(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInIndex")
        .returned(result)
        .build());
  }

  public void getMaxColumnsInIndex(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxColumnsInIndex")
        .threw(cause)
        .build());
  }

  public void getSchemas(ResultSet result, String catalog, String schemaPattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getSchemas")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .returned(result)
        .build());
  }

  public void getSchemas(Throwable cause, String catalog, String schemaPattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getSchemas")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .threw(cause)
        .build());
  }

  public void getFunctionColumns(ResultSet result, String catalog, String schemaPattern,
      String functionNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getFunctionColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("functionNamePattern", functionNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .returned(result)
        .build());
  }

  public void getFunctionColumns(Throwable cause, String catalog, String schemaPattern,
      String functionNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getFunctionColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("functionNamePattern", functionNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .threw(cause)
        .build());
  }

  public void supportsSubqueriesInComparisons(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInComparisons")
        .returned(result)
        .build());
  }

  public void supportsSubqueriesInComparisons(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInComparisons")
        .threw(cause)
        .build());
  }

  public void getSuperTables(ResultSet result, String catalog, String schemaPattern,
      String tableNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getSuperTables")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .returned(result)
        .build());
  }

  public void getSuperTables(Throwable cause, String catalog, String schemaPattern,
      String tableNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getSuperTables")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .threw(cause)
        .build());
  }

  public void supportsLikeEscapeClause(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsLikeEscapeClause")
        .returned(result)
        .build());
  }

  public void supportsLikeEscapeClause(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsLikeEscapeClause")
        .threw(cause)
        .build());
  }

  public void getIndexInfo(ResultSet result, String catalog, String schema, String table,
      boolean unique, boolean approximate) {
    trace(new Trace.Builder("DatabaseMetaData", "getIndexInfo")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .withParameter("unique", unique)
        .withParameter("approximate", approximate)
        .returned(result)
        .build());
  }

  public void getIndexInfo(Throwable cause, String catalog, String schema, String table,
      boolean unique, boolean approximate) {
    trace(new Trace.Builder("DatabaseMetaData", "getIndexInfo")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .withParameter("unique", unique)
        .withParameter("approximate", approximate)
        .threw(cause)
        .build());
  }

  public void getJDBCMinorVersion(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getJDBCMinorVersion")
        .returned(result)
        .build());
  }

  public void getJDBCMinorVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getJDBCMinorVersion")
        .threw(cause)
        .build());
  }

  public void getSearchStringEscape(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getSearchStringEscape")
        .returned(result)
        .build());
  }

  public void getSearchStringEscape(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getSearchStringEscape")
        .threw(cause)
        .build());
  }

  public void supportsOpenStatementsAcrossRollback(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenStatementsAcrossRollback")
        .returned(result)
        .build());
  }

  public void supportsOpenStatementsAcrossRollback(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenStatementsAcrossRollback")
        .threw(cause)
        .build());
  }

  public void supportsTableCorrelationNames(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsTableCorrelationNames")
        .returned(result)
        .build());
  }

  public void supportsTableCorrelationNames(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsTableCorrelationNames")
        .threw(cause)
        .build());
  }

  public void getTypeInfo(ResultSet result) {
    trace(new Trace.Builder("DatabaseMetaData", "getTypeInfo")
        .returned(result)
        .build());
  }

  public void getTypeInfo(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getTypeInfo")
        .threw(cause)
        .build());
  }

  public void getMaxUserNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxUserNameLength")
        .returned(result)
        .build());
  }

  public void getMaxUserNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxUserNameLength")
        .threw(cause)
        .build());
  }

  public void doesMaxRowSizeIncludeBlobs(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "doesMaxRowSizeIncludeBlobs")
        .returned(result)
        .build());
  }

  public void doesMaxRowSizeIncludeBlobs(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "doesMaxRowSizeIncludeBlobs")
        .threw(cause)
        .build());
  }

  public void getDriverMajorVersion(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverMajorVersion")
        .returned(result)
        .build());
  }

  public void getDriverMajorVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDriverMajorVersion")
        .threw(cause)
        .build());
  }

  public void supportsAlterTableWithAddColumn(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsAlterTableWithAddColumn")
        .returned(result)
        .build());
  }

  public void supportsAlterTableWithAddColumn(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsAlterTableWithAddColumn")
        .threw(cause)
        .build());
  }

  public void getURL(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getURL")
        .returned(result)
        .build());
  }

  public void getURL(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getURL")
        .threw(cause)
        .build());
  }

  public void getMaxCursorNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxCursorNameLength")
        .returned(result)
        .build());
  }

  public void getMaxCursorNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxCursorNameLength")
        .threw(cause)
        .build());
  }

  public void insertsAreDetected(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "insertsAreDetected")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void insertsAreDetected(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "insertsAreDetected")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void getResultSetHoldability(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getResultSetHoldability")
        .returned(result)
        .build());
  }

  public void getResultSetHoldability(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getResultSetHoldability")
        .threw(cause)
        .build());
  }

  public void getSystemFunctions(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getSystemFunctions")
        .returned(result)
        .build());
  }

  public void getSystemFunctions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getSystemFunctions")
        .threw(cause)
        .build());
  }

  public void supportsCatalogsInProcedureCalls(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInProcedureCalls")
        .returned(result)
        .build());
  }

  public void supportsCatalogsInProcedureCalls(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInProcedureCalls")
        .threw(cause)
        .build());
  }

  public void supportsConvert(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsConvert")
        .returned(result)
        .build());
  }

  public void supportsConvert(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsConvert")
        .threw(cause)
        .build());
  }

  public void supportsOpenStatementsAcrossCommit(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenStatementsAcrossCommit")
        .returned(result)
        .build());
  }

  public void supportsOpenStatementsAcrossCommit(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenStatementsAcrossCommit")
        .threw(cause)
        .build());
  }

  public void supportsNamedParameters(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsNamedParameters")
        .returned(result)
        .build());
  }

  public void supportsNamedParameters(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsNamedParameters")
        .threw(cause)
        .build());
  }

  public void othersDeletesAreVisible(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "othersDeletesAreVisible")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void othersDeletesAreVisible(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "othersDeletesAreVisible")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void supportsTransactions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsTransactions")
        .returned(result)
        .build());
  }

  public void supportsTransactions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsTransactions")
        .threw(cause)
        .build());
  }

  public void getMaxRowSize(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxRowSize")
        .returned(result)
        .build());
  }

  public void getMaxRowSize(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxRowSize")
        .threw(cause)
        .build());
  }

  public void supportsANSI92IntermediateSQL(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsANSI92IntermediateSQL")
        .returned(result)
        .build());
  }

  public void supportsANSI92IntermediateSQL(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsANSI92IntermediateSQL")
        .threw(cause)
        .build());
  }

  public void getProcedureTerm(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getProcedureTerm")
        .returned(result)
        .build());
  }

  public void getProcedureTerm(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getProcedureTerm")
        .threw(cause)
        .build());
  }

  public void getMaxStatements(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxStatements")
        .returned(result)
        .build());
  }

  public void getMaxStatements(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxStatements")
        .threw(cause)
        .build());
  }

  public void nullsAreSortedAtEnd(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedAtEnd")
        .returned(result)
        .build());
  }

  public void nullsAreSortedAtEnd(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedAtEnd")
        .threw(cause)
        .build());
  }

  public void getIdentifierQuoteString(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getIdentifierQuoteString")
        .returned(result)
        .build());
  }

  public void getIdentifierQuoteString(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getIdentifierQuoteString")
        .threw(cause)
        .build());
  }

  public void storesUpperCaseIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "storesUpperCaseIdentifiers")
        .returned(result)
        .build());
  }

  public void storesUpperCaseIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "storesUpperCaseIdentifiers")
        .threw(cause)
        .build());
  }

  public void isCatalogAtStart(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "isCatalogAtStart")
        .returned(result)
        .build());
  }

  public void isCatalogAtStart(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "isCatalogAtStart")
        .threw(cause)
        .build());
  }

  public void getCatalogSeparator(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getCatalogSeparator")
        .returned(result)
        .build());
  }

  public void getCatalogSeparator(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getCatalogSeparator")
        .threw(cause)
        .build());
  }

  public void getTables(ResultSet result, String catalog, String schemaPattern,
      String tableNamePattern, String[] types) {
    trace(new Trace.Builder("DatabaseMetaData", "getTables")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .withParameter("types", types)
        .returned(result)
        .build());
  }

  public void getTables(Throwable cause, String catalog, String schemaPattern,
      String tableNamePattern, String[] types) {
    trace(new Trace.Builder("DatabaseMetaData", "getTables")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .withParameter("types", types)
        .threw(cause)
        .build());
  }

  public void getMaxProcedureNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxProcedureNameLength")
        .returned(result)
        .build());
  }

  public void getMaxProcedureNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxProcedureNameLength")
        .threw(cause)
        .build());
  }

  public void getNumericFunctions(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getNumericFunctions")
        .returned(result)
        .build());
  }

  public void getNumericFunctions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getNumericFunctions")
        .threw(cause)
        .build());
  }

  public void nullsAreSortedAtStart(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedAtStart")
        .returned(result)
        .build());
  }

  public void nullsAreSortedAtStart(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedAtStart")
        .threw(cause)
        .build());
  }

  public void supportsGroupByUnrelated(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGroupByUnrelated")
        .returned(result)
        .build());
  }

  public void supportsGroupByUnrelated(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGroupByUnrelated")
        .threw(cause)
        .build());
  }

  public void getTablePrivileges(ResultSet result, String catalog, String schemaPattern,
      String tableNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getTablePrivileges")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .returned(result)
        .build());
  }

  public void getTablePrivileges(Throwable cause, String catalog, String schemaPattern,
      String tableNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getTablePrivileges")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .threw(cause)
        .build());
  }

  public void getProcedures(ResultSet result, String catalog, String schemaPattern,
      String procedureNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getProcedures")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("procedureNamePattern", procedureNamePattern)
        .returned(result)
        .build());
  }

  public void getProcedures(Throwable cause, String catalog, String schemaPattern,
      String procedureNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getProcedures")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("procedureNamePattern", procedureNamePattern)
        .threw(cause)
        .build());
  }

  public void getDatabaseMajorVersion(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseMajorVersion")
        .returned(result)
        .build());
  }

  public void getDatabaseMajorVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseMajorVersion")
        .threw(cause)
        .build());
  }

  public void generatedKeyAlwaysReturned(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "generatedKeyAlwaysReturned")
        .returned(result)
        .build());
  }

  public void generatedKeyAlwaysReturned(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "generatedKeyAlwaysReturned")
        .threw(cause)
        .build());
  }

  public void allProceduresAreCallable(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "allProceduresAreCallable")
        .returned(result)
        .build());
  }

  public void allProceduresAreCallable(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "allProceduresAreCallable")
        .threw(cause)
        .build());
  }

  public void supportsMultipleResultSets(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMultipleResultSets")
        .returned(result)
        .build());
  }

  public void supportsMultipleResultSets(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMultipleResultSets")
        .threw(cause)
        .build());
  }

  public void getBestRowIdentifier(ResultSet result, String catalog, String schema, String table,
      int scope, boolean nullable) {
    trace(new Trace.Builder("DatabaseMetaData", "getBestRowIdentifier")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .withParameter("scope", scope)
        .withParameter("nullable", nullable)
        .returned(result)
        .build());
  }

  public void getBestRowIdentifier(Throwable cause, String catalog, String schema, String table,
      int scope, boolean nullable) {
    trace(new Trace.Builder("DatabaseMetaData", "getBestRowIdentifier")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .withParameter("scope", scope)
        .withParameter("nullable", nullable)
        .threw(cause)
        .build());
  }

  public void getUserName(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getUserName")
        .returned(result)
        .build());
  }

  public void getUserName(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getUserName")
        .threw(cause)
        .build());
  }

  public void dataDefinitionCausesTransactionCommit(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "dataDefinitionCausesTransactionCommit")
        .returned(result)
        .build());
  }

  public void dataDefinitionCausesTransactionCommit(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "dataDefinitionCausesTransactionCommit")
        .threw(cause)
        .build());
  }

  public void getUDTs(ResultSet result, String catalog, String schemaPattern,
      String typeNamePattern, int[] types) {
    trace(new Trace.Builder("DatabaseMetaData", "getUDTs")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("typeNamePattern", typeNamePattern)
        .withParameter("types", types)
        .returned(result)
        .build());
  }

  public void getUDTs(Throwable cause, String catalog, String schemaPattern, String typeNamePattern,
      int[] types) {
    trace(new Trace.Builder("DatabaseMetaData", "getUDTs")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("typeNamePattern", typeNamePattern)
        .withParameter("types", types)
        .threw(cause)
        .build());
  }

  public void storesUpperCaseQuotedIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "storesUpperCaseQuotedIdentifiers")
        .returned(result)
        .build());
  }

  public void storesUpperCaseQuotedIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "storesUpperCaseQuotedIdentifiers")
        .threw(cause)
        .build());
  }

  public void getDatabaseMinorVersion(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseMinorVersion")
        .returned(result)
        .build());
  }

  public void getDatabaseMinorVersion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseMinorVersion")
        .threw(cause)
        .build());
  }

  public void supportsMixedCaseQuotedIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMixedCaseQuotedIdentifiers")
        .returned(result)
        .build());
  }

  public void supportsMixedCaseQuotedIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMixedCaseQuotedIdentifiers")
        .threw(cause)
        .build());
  }

  public void supportsOpenCursorsAcrossCommit(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenCursorsAcrossCommit")
        .returned(result)
        .build());
  }

  public void supportsOpenCursorsAcrossCommit(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsOpenCursorsAcrossCommit")
        .threw(cause)
        .build());
  }

  public void getMaxTableNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxTableNameLength")
        .returned(result)
        .build());
  }

  public void getMaxTableNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxTableNameLength")
        .threw(cause)
        .build());
  }

  public void supportsMinimumSQLGrammar(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMinimumSQLGrammar")
        .returned(result)
        .build());
  }

  public void supportsMinimumSQLGrammar(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsMinimumSQLGrammar")
        .threw(cause)
        .build());
  }

  public void getVersionColumns(ResultSet result, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getVersionColumns")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .returned(result)
        .build());
  }

  public void getVersionColumns(Throwable cause, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getVersionColumns")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .threw(cause)
        .build());
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("DatabaseMetaData", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("DatabaseMetaData", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void storesMixedCaseIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "storesMixedCaseIdentifiers")
        .returned(result)
        .build());
  }

  public void storesMixedCaseIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "storesMixedCaseIdentifiers")
        .threw(cause)
        .build());
  }

  public void getDefaultTransactionIsolation(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDefaultTransactionIsolation")
        .returned(result)
        .build());
  }

  public void getDefaultTransactionIsolation(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDefaultTransactionIsolation")
        .threw(cause)
        .build());
  }

  public void supportsBatchUpdates(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsBatchUpdates")
        .returned(result)
        .build());
  }

  public void supportsBatchUpdates(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsBatchUpdates")
        .threw(cause)
        .build());
  }

  public void usesLocalFilePerTable(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "usesLocalFilePerTable")
        .returned(result)
        .build());
  }

  public void usesLocalFilePerTable(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "usesLocalFilePerTable")
        .threw(cause)
        .build());
  }

  public void storesMixedCaseQuotedIdentifiers(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "storesMixedCaseQuotedIdentifiers")
        .returned(result)
        .build());
  }

  public void storesMixedCaseQuotedIdentifiers(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "storesMixedCaseQuotedIdentifiers")
        .threw(cause)
        .build());
  }

  public void supportsCatalogsInTableDefinitions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInTableDefinitions")
        .returned(result)
        .build());
  }

  public void supportsCatalogsInTableDefinitions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsCatalogsInTableDefinitions")
        .threw(cause)
        .build());
  }

  public void getDatabaseProductName(String result) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseProductName")
        .returned(result)
        .build());
  }

  public void getDatabaseProductName(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getDatabaseProductName")
        .threw(cause)
        .build());
  }

  public void getImportedKeys(ResultSet result, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getImportedKeys")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .returned(result)
        .build());
  }

  public void getImportedKeys(Throwable cause, String catalog, String schema, String table) {
    trace(new Trace.Builder("DatabaseMetaData", "getImportedKeys")
        .withParameter("catalog", catalog)
        .withParameter("schema", schema)
        .withParameter("table", table)
        .threw(cause)
        .build());
  }

  public void supportsUnion(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsUnion")
        .returned(result)
        .build());
  }

  public void supportsUnion(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsUnion")
        .threw(cause)
        .build());
  }

  public void ownInsertsAreVisible(boolean result, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "ownInsertsAreVisible")
        .withParameter("type", type)
        .returned(result)
        .build());
  }

  public void ownInsertsAreVisible(Throwable cause, int type) {
    trace(new Trace.Builder("DatabaseMetaData", "ownInsertsAreVisible")
        .withParameter("type", type)
        .threw(cause)
        .build());
  }

  public void getMaxCatalogNameLength(int result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxCatalogNameLength")
        .returned(result)
        .build());
  }

  public void getMaxCatalogNameLength(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxCatalogNameLength")
        .threw(cause)
        .build());
  }

  public void supportsTransactionIsolationLevel(boolean result, int level) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsTransactionIsolationLevel")
        .withParameter("level", level)
        .returned(result)
        .build());
  }

  public void supportsTransactionIsolationLevel(Throwable cause, int level) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsTransactionIsolationLevel")
        .withParameter("level", level)
        .threw(cause)
        .build());
  }

  public void supportsGroupBy(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGroupBy")
        .returned(result)
        .build());
  }

  public void supportsGroupBy(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsGroupBy")
        .threw(cause)
        .build());
  }

  public void getPseudoColumns(ResultSet result, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getPseudoColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .returned(result)
        .build());
  }

  public void getPseudoColumns(Throwable cause, String catalog, String schemaPattern,
      String tableNamePattern, String columnNamePattern) {
    trace(new Trace.Builder("DatabaseMetaData", "getPseudoColumns")
        .withParameter("catalog", catalog)
        .withParameter("schemaPattern", schemaPattern)
        .withParameter("tableNamePattern", tableNamePattern)
        .withParameter("columnNamePattern", columnNamePattern)
        .threw(cause)
        .build());
  }

  public void getMaxLogicalLobSize(long result) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxLogicalLobSize")
        .returned(result)
        .build());
  }

  public void getMaxLogicalLobSize(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "getMaxLogicalLobSize")
        .threw(cause)
        .build());
  }

  public void supportsStoredFunctionsUsingCallSyntax(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsStoredFunctionsUsingCallSyntax")
        .returned(result)
        .build());
  }

  public void supportsStoredFunctionsUsingCallSyntax(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsStoredFunctionsUsingCallSyntax")
        .threw(cause)
        .build());
  }

  public void supportsDataManipulationTransactionsOnly(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsDataManipulationTransactionsOnly")
        .returned(result)
        .build());
  }

  public void supportsDataManipulationTransactionsOnly(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsDataManipulationTransactionsOnly")
        .threw(cause)
        .build());
  }

  public void nullsAreSortedLow(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedLow")
        .returned(result)
        .build());
  }

  public void nullsAreSortedLow(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "nullsAreSortedLow")
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("DatabaseMetaData", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("DatabaseMetaData", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void supportsSubqueriesInIns(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInIns")
        .returned(result)
        .build());
  }

  public void supportsSubqueriesInIns(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSubqueriesInIns")
        .threw(cause)
        .build());
  }

  public void supportsSchemasInIndexDefinitions(boolean result) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInIndexDefinitions")
        .returned(result)
        .build());
  }

  public void supportsSchemasInIndexDefinitions(Throwable cause) {
    trace(new Trace.Builder("DatabaseMetaData", "supportsSchemasInIndexDefinitions")
        .threw(cause)
        .build());
  }

  public ResultSetListener newResultSetListener() {
    return new ResultSetTracer(out);
  }

  public ConnectionListener newConnectionListener() {
    return new ConnectionTracer(out);
  }
}
