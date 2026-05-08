package org.postgresql.ng.spy;

import java.sql.SQLException;
import java.util.Properties;

public interface ListenerFactory  {

  ConnectionListener newConnectionListener(Properties properties) throws SQLException;

}
