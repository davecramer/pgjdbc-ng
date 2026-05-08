package org.postgresql.ng.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;

public class BlobTracer implements BlobListener {
  TraceOutput out;

  public BlobTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void free() {
    trace(new Trace.Builder("Blob", "free")
        .returned()
        .build());
  }

  public void free(Throwable cause) {
    trace(new Trace.Builder("Blob", "free")
        .threw(cause)
        .build());
  }

  public void truncate(long len) {
    trace(new Trace.Builder("Blob", "truncate")
        .withParameter("len", len)
        .returned()
        .build());
  }

  public void truncate(Throwable cause, long len) {
    trace(new Trace.Builder("Blob", "truncate")
        .withParameter("len", len)
        .threw(cause)
        .build());
  }

  public void position(long result, byte[] pattern, long start) {
    trace(new Trace.Builder("Blob", "position")
        .withParameter("pattern", pattern)
        .withParameter("start", start)
        .returned(result)
        .build());
  }

  public void position(Throwable cause, byte[] pattern, long start) {
    trace(new Trace.Builder("Blob", "position")
        .withParameter("pattern", pattern)
        .withParameter("start", start)
        .threw(cause)
        .build());
  }

  public void setBinaryStream(OutputStream result, long pos) {
    trace(new Trace.Builder("Blob", "setBinaryStream")
        .withParameter("pos", pos)
        .returned(result)
        .build());
  }

  public void setBinaryStream(Throwable cause, long pos) {
    trace(new Trace.Builder("Blob", "setBinaryStream")
        .withParameter("pos", pos)
        .threw(cause)
        .build());
  }

  public void getBinaryStream(InputStream result, long pos, long length) {
    trace(new Trace.Builder("Blob", "getBinaryStream")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .returned(result)
        .build());
  }

  public void getBinaryStream(Throwable cause, long pos, long length) {
    trace(new Trace.Builder("Blob", "getBinaryStream")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void length(long result) {
    trace(new Trace.Builder("Blob", "length")
        .returned(result)
        .build());
  }

  public void length(Throwable cause) {
    trace(new Trace.Builder("Blob", "length")
        .threw(cause)
        .build());
  }

  public void getBinaryStream(InputStream result) {
    trace(new Trace.Builder("Blob", "getBinaryStream")
        .returned(result)
        .build());
  }

  public void getBinaryStream(Throwable cause) {
    trace(new Trace.Builder("Blob", "getBinaryStream")
        .threw(cause)
        .build());
  }

  public void setBytes(int result, long pos, byte[] bytes) {
    trace(new Trace.Builder("Blob", "setBytes")
        .withParameter("pos", pos)
        .withParameter("bytes", bytes)
        .returned(result)
        .build());
  }

  public void setBytes(Throwable cause, long pos, byte[] bytes) {
    trace(new Trace.Builder("Blob", "setBytes")
        .withParameter("pos", pos)
        .withParameter("bytes", bytes)
        .threw(cause)
        .build());
  }

  public void setBytes(int result, long pos, byte[] bytes, int offset, int len) {
    trace(new Trace.Builder("Blob", "setBytes")
        .withParameter("pos", pos)
        .withParameter("bytes", bytes)
        .withParameter("offset", offset)
        .withParameter("len", len)
        .returned(result)
        .build());
  }

  public void setBytes(Throwable cause, long pos, byte[] bytes, int offset, int len) {
    trace(new Trace.Builder("Blob", "setBytes")
        .withParameter("pos", pos)
        .withParameter("bytes", bytes)
        .withParameter("offset", offset)
        .withParameter("len", len)
        .threw(cause)
        .build());
  }

  public void getBytes(byte[] result, long pos, int length) {
    trace(new Trace.Builder("Blob", "getBytes")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .returned(result)
        .build());
  }

  public void getBytes(Throwable cause, long pos, int length) {
    trace(new Trace.Builder("Blob", "getBytes")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void position(long result, Blob pattern, long start) {
    trace(new Trace.Builder("Blob", "position")
        .withParameter("pattern", pattern)
        .withParameter("start", start)
        .returned(result)
        .build());
  }

  public void position(Throwable cause, Blob pattern, long start) {
    trace(new Trace.Builder("Blob", "position")
        .withParameter("pattern", pattern)
        .withParameter("start", start)
        .threw(cause)
        .build());
  }
}
