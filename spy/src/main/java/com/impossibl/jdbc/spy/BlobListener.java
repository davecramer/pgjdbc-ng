package com.impossibl.jdbc.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;

interface BlobListener {
  void free();

  void free(Throwable targetFailureCause);

  void truncate(long len);

  void truncate(Throwable targetFailureCause, long len);

  void position(long targetSuccessResult, byte[] pattern, long start);

  void position(Throwable targetFailureCause, byte[] pattern, long start);

  void setBinaryStream(OutputStream targetSuccessResult, long pos);

  void setBinaryStream(Throwable targetFailureCause, long pos);

  void getBinaryStream(InputStream targetSuccessResult, long pos, long length);

  void getBinaryStream(Throwable targetFailureCause, long pos, long length);

  void length(long targetSuccessResult);

  void length(Throwable targetFailureCause);

  void getBinaryStream(InputStream targetSuccessResult);

  void getBinaryStream(Throwable targetFailureCause);

  void setBytes(int targetSuccessResult, long pos, byte[] bytes);

  void setBytes(Throwable targetFailureCause, long pos, byte[] bytes);

  void setBytes(int targetSuccessResult, long pos, byte[] bytes, int offset, int len);

  void setBytes(Throwable targetFailureCause, long pos, byte[] bytes, int offset, int len);

  void getBytes(byte[] targetSuccessResult, long pos, int length);

  void getBytes(Throwable targetFailureCause, long pos, int length);

  void position(long targetSuccessResult, Blob pattern, long start);

  void position(Throwable targetFailureCause, Blob pattern, long start);
}
