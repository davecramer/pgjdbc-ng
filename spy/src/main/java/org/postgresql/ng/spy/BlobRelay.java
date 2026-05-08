package org.postgresql.ng.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.SQLException;

public class BlobRelay implements Relay<Blob>, Blob {
  public Blob target;

  public BlobListener listener;

  public BlobRelay(Blob target, BlobListener listener) {
    this.target = target;
    this.listener = listener;
  }

  public Blob getTarget() {
    return target;
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

  public long position(byte[] pattern, long start) throws SQLException {
    try {
      long targetSuccessResult = this.target.position(pattern, start);
      this.listener.position(targetSuccessResult, pattern, start);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.position(targetFailureCause, pattern, start);
      throw targetFailureCause;

    }
  }

  public OutputStream setBinaryStream(long pos) throws SQLException {
    try {
      OutputStream targetSuccessResult = this.target.setBinaryStream(pos);
      this.listener.setBinaryStream(targetSuccessResult, pos);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBinaryStream(targetFailureCause, pos);
      throw targetFailureCause;

    }
  }

  public InputStream getBinaryStream(long pos, long length) throws SQLException {
    try {
      InputStream targetSuccessResult = this.target.getBinaryStream(pos, length);
      this.listener.getBinaryStream(targetSuccessResult, pos, length);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBinaryStream(targetFailureCause, pos, length);
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

  public int setBytes(long pos, byte[] bytes) throws SQLException {
    try {
      int targetSuccessResult = this.target.setBytes(pos, bytes);
      this.listener.setBytes(targetSuccessResult, pos, bytes);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBytes(targetFailureCause, pos, bytes);
      throw targetFailureCause;

    }
  }

  public int setBytes(long pos, byte[] bytes, int offset, int len) throws SQLException {
    try {
      int targetSuccessResult = this.target.setBytes(pos, bytes, offset, len);
      this.listener.setBytes(targetSuccessResult, pos, bytes, offset, len);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.setBytes(targetFailureCause, pos, bytes, offset, len);
      throw targetFailureCause;

    }
  }

  public byte[] getBytes(long pos, int length) throws SQLException {
    try {
      byte[] targetSuccessResult = this.target.getBytes(pos, length);
      this.listener.getBytes(targetSuccessResult, pos, length);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.getBytes(targetFailureCause, pos, length);
      throw targetFailureCause;

    }
  }

  public long position(Blob pattern, long start) throws SQLException {
    try {
      long targetSuccessResult = this.target.position(pattern, start);
      this.listener.position(targetSuccessResult, pattern, start);
      return targetSuccessResult;

    }
    catch(SQLException targetFailureCause) {
      this.listener.position(targetFailureCause, pattern, start);
      throw targetFailureCause;

    }
  }
}
