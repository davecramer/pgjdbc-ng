package org.postgresql.ng.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;
import java.sql.SQLException;

public class ClobRelay implements Relay<Clob>, Clob {
  public Clob target;

  public ClobListener listener;

  public ClobRelay(Clob target, ClobListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Clob getTarget() {
    return target;
  }

  public long position(Clob searchstr, long start) throws SQLException {
    try {
      long targetSuccessResult = this.target.position(searchstr, start);
      this.listener.position(targetSuccessResult, searchstr, start);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.position(targetFailureCause, searchstr, start);
      throw targetFailureCause;

    }
  }

  public InputStream getAsciiStream() throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getAsciiStream();
      this.listener.getAsciiStream(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getAsciiStream(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int setString(long pos, String str, int offset, int len) throws SQLException {
    try {
      int targetSuccessResult = this.target.setString(pos, str, offset, len);
      this.listener.setString(targetSuccessResult, pos, str, offset, len);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setString(targetFailureCause, pos, str, offset, len);
      throw targetFailureCause;

    }
  }

  public long position(String searchstr, long start) throws SQLException {
    try {
      long targetSuccessResult = this.target.position(searchstr, start);
      this.listener.position(targetSuccessResult, searchstr, start);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.position(targetFailureCause, searchstr, start);
      throw targetFailureCause;

    }
  }

  public Writer setCharacterStream(long pos) throws SQLException {
    try {
      Writer targetSuccessResult = this.target.setCharacterStream(pos);
      this.listener.setCharacterStream(targetSuccessResult, pos);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause, pos);
      throw targetFailureCause;

    }
  }

  public Reader getCharacterStream(long pos, long length) throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getCharacterStream(pos, length);
      this.listener.getCharacterStream(targetSuccessResult, pos, length);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCharacterStream(targetFailureCause, pos, length);
      throw targetFailureCause;

    }
  }

  public OutputStream setAsciiStream(long pos) throws SQLException {
    try {
      OutputStream targetSuccessResult = this.target.setAsciiStream(pos);
      this.listener.setAsciiStream(targetSuccessResult, pos);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setAsciiStream(targetFailureCause, pos);
      throw targetFailureCause;

    }
  }

  public long length() throws SQLException {
    try {
      long targetSuccessResult = this.target.length();
      this.listener.length(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.length(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void free() throws SQLException {
    try {
      this.target.free();
      this.listener.free();

    }
    catch(SQLException targetFailureCause) {
      this.listener.free(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public int setString(long pos, String str) throws SQLException {
    try {
      int targetSuccessResult = this.target.setString(pos, str);
      this.listener.setString(targetSuccessResult, pos, str);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setString(targetFailureCause, pos, str);
      throw targetFailureCause;

    }
  }

  public String getSubString(long pos, int length) throws SQLException {
    try {
      String targetSuccessResult = this.target.getSubString(pos, length);
      this.listener.getSubString(targetSuccessResult, pos, length);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSubString(targetFailureCause, pos, length);
      throw targetFailureCause;

    }
  }

  public Reader getCharacterStream() throws SQLException {
    try {
      Reader targetSuccessResult = this.target.getCharacterStream();
      this.listener.getCharacterStream(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getCharacterStream(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void truncate(long len) throws SQLException {
    try {
      this.target.truncate(len);
      this.listener.truncate(len);

    }
    catch(SQLException targetFailureCause) {
      this.listener.truncate(targetFailureCause, len);
      throw targetFailureCause;

    }
  }
}
