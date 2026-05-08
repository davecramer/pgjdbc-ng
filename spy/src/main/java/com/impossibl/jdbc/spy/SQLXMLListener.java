package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import javax.xml.transform.Result;
import javax.xml.transform.Source;

interface SQLXMLListener {
  <T extends Source> void getSource(T targetSuccessResult, Class<T> sourceClass);

  <T extends Source> void getSource(Throwable targetFailureCause, Class<T> sourceClass);

  void getBinaryStream(InputStream targetSuccessResult);

  void getBinaryStream(Throwable targetFailureCause);

  void setString(String value);

  void setString(Throwable targetFailureCause, String value);

  void free();

  void free(Throwable targetFailureCause);

  void getCharacterStream(Reader targetSuccessResult);

  void getCharacterStream(Throwable targetFailureCause);

  void getString(String targetSuccessResult);

  void getString(Throwable targetFailureCause);

  void setBinaryStream(OutputStream targetSuccessResult);

  void setBinaryStream(Throwable targetFailureCause);

  void setCharacterStream(Writer targetSuccessResult);

  void setCharacterStream(Throwable targetFailureCause);

  <T extends Result> void setResult(T targetSuccessResult, Class<T> resultClass);

  <T extends Result> void setResult(Throwable targetFailureCause, Class<T> resultClass);
}
