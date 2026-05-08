package org.postgresql.ng.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;

interface NClobListener {
  void setCharacterStream(Writer targetSuccessResult, long pos);

  void setCharacterStream(Throwable targetFailureCause, long pos);

  void setString(int targetSuccessResult, long pos, String str);

  void setString(Throwable targetFailureCause, long pos, String str);

  void setString(int targetSuccessResult, long pos, String str, int offset, int len);

  void setString(Throwable targetFailureCause, long pos, String str, int offset, int len);

  void getSubString(String targetSuccessResult, long pos, int length);

  void getSubString(Throwable targetFailureCause, long pos, int length);

  void getAsciiStream(InputStream targetSuccessResult);

  void getAsciiStream(Throwable targetFailureCause);

  void truncate(long len);

  void truncate(Throwable targetFailureCause, long len);

  void getCharacterStream(Reader targetSuccessResult);

  void getCharacterStream(Throwable targetFailureCause);

  void position(long targetSuccessResult, String searchstr, long start);

  void position(Throwable targetFailureCause, String searchstr, long start);

  void length(long targetSuccessResult);

  void length(Throwable targetFailureCause);

  void setAsciiStream(OutputStream targetSuccessResult, long pos);

  void setAsciiStream(Throwable targetFailureCause, long pos);

  void position(long targetSuccessResult, Clob searchstr, long start);

  void position(Throwable targetFailureCause, Clob searchstr, long start);

  void getCharacterStream(Reader targetSuccessResult, long pos, long length);

  void getCharacterStream(Throwable targetFailureCause, long pos, long length);

  void free();

  void free(Throwable targetFailureCause);
}
