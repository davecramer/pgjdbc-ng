package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

public class SQLXMLTracer implements SQLXMLListener {
  TraceOutput out;

  public SQLXMLTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public <T extends Source> void getSource(T result, Class<T> sourceClass) {
    trace(new Trace.Builder("SQLXML", "getSource")
        .withParameter("sourceClass", sourceClass)
        .returned(result)
        .build());
  }

  public <T extends Source> void getSource(Throwable cause, Class<T> sourceClass) {
    trace(new Trace.Builder("SQLXML", "getSource")
        .withParameter("sourceClass", sourceClass)
        .threw(cause)
        .build());
  }

  public void getBinaryStream(InputStream result) {
    trace(new Trace.Builder("SQLXML", "getBinaryStream")
        .returned(result)
        .build());
  }

  public void getBinaryStream(Throwable cause) {
    trace(new Trace.Builder("SQLXML", "getBinaryStream")
        .threw(cause)
        .build());
  }

  public void setString(String value) {
    trace(new Trace.Builder("SQLXML", "setString")
        .withParameter("value", value)
        .returned()
        .build());
  }

  public void setString(Throwable cause, String value) {
    trace(new Trace.Builder("SQLXML", "setString")
        .withParameter("value", value)
        .threw(cause)
        .build());
  }

  public void free() {
    trace(new Trace.Builder("SQLXML", "free")
        .returned()
        .build());
  }

  public void free(Throwable cause) {
    trace(new Trace.Builder("SQLXML", "free")
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result) {
    trace(new Trace.Builder("SQLXML", "getCharacterStream")
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause) {
    trace(new Trace.Builder("SQLXML", "getCharacterStream")
        .threw(cause)
        .build());
  }

  public void getString(String result) {
    trace(new Trace.Builder("SQLXML", "getString")
        .returned(result)
        .build());
  }

  public void getString(Throwable cause) {
    trace(new Trace.Builder("SQLXML", "getString")
        .threw(cause)
        .build());
  }

  public void setBinaryStream(OutputStream result) {
    trace(new Trace.Builder("SQLXML", "setBinaryStream")
        .returned(result)
        .build());
  }

  public void setBinaryStream(Throwable cause) {
    trace(new Trace.Builder("SQLXML", "setBinaryStream")
        .threw(cause)
        .build());
  }

  public void setCharacterStream(Writer result) {
    trace(new Trace.Builder("SQLXML", "setCharacterStream")
        .returned(result)
        .build());
  }

  public void setCharacterStream(Throwable cause) {
    trace(new Trace.Builder("SQLXML", "setCharacterStream")
        .threw(cause)
        .build());
  }

  public <T extends Result> void setResult(T result, Class<T> resultClass) {
    trace(new Trace.Builder("SQLXML", "setResult")
        .withParameter("resultClass", resultClass)
        .returned(result)
        .build());
  }

  public <T extends Result> void setResult(Throwable cause, Class<T> resultClass) {
    trace(new Trace.Builder("SQLXML", "setResult")
        .withParameter("resultClass", resultClass)
        .threw(cause)
        .build());
  }
}
