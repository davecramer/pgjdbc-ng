package org.postgresql.ng.spy;

import java.sql.SQLException;
import java.sql.Savepoint;

public class SavepointRelay implements Relay<Savepoint>, Savepoint {
  public Savepoint target;

  public SavepointListener listener;

  public SavepointRelay(Savepoint target, SavepointListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Savepoint getTarget() {
    return target;
  }

  public String getSavepointName() throws SQLException {
    try {
      String targetSuccessResult = this.target.getSavepointName();
      this.listener.getSavepointName(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSavepointName(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int getSavepointId() throws SQLException {
    try {
      int targetSuccessResult = this.target.getSavepointId();
      this.listener.getSavepointId(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSavepointId(targetFailureCause);
      throw targetFailureCause;

    }
  }
}
