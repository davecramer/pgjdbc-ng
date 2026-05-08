package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.SQLException;
import java.sql.SQLXML;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

public class SQLXMLRelay implements Relay<SQLXML>, SQLXML {
  public SQLXML target;

  public SQLXMLListener listener;

  public SQLXMLRelay(SQLXML target, SQLXMLListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public SQLXML getTarget() {
    return target;
  }

  public <T extends Source> T getSource(Class<T> sourceClass) throws SQLException {
    try {
      T targetSuccessResult = this.target.getSource(sourceClass);
      this.listener.getSource(targetSuccessResult, sourceClass);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getSource(targetFailureCause, sourceClass);
      throw targetFailureCause;

    }
  }

  public InputStream getBinaryStream() throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getBinaryStream();
      this.listener.getBinaryStream(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBinaryStream(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public void setString(String value) throws SQLException {
    try {
      this.target.setString(value);
      this.listener.setString(value);

    }
    catch(SQLException targetFailureCause) {
      this.listener.setString(targetFailureCause, value);
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

  public String getString() throws SQLException {
    try {
      String targetSuccessResult = this.target.getString();
      this.listener.getString(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getString(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public OutputStream setBinaryStream() throws SQLException {
    try {
      OutputStream targetSuccessResult = this.target.setBinaryStream();
      this.listener.setBinaryStream(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public Writer setCharacterStream() throws SQLException {
    try {
      Writer targetSuccessResult = this.target.setCharacterStream();
      this.listener.setCharacterStream(targetSuccessResult);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setCharacterStream(targetFailureCause);
      throw targetFailureCause;

    }
  }

  public <T extends Result> T setResult(Class<T> resultClass) throws SQLException {
    try {
      T targetSuccessResult = this.target.setResult(resultClass);
      this.listener.setResult(targetSuccessResult, resultClass);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setResult(targetFailureCause, resultClass);
      throw targetFailureCause;

    }
  }
}
