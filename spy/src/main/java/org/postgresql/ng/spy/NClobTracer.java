package org.postgresql.ng.spy;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.sql.Clob;

public class NClobTracer implements NClobListener {
  TraceOutput out;

  public NClobTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void setCharacterStream(Writer result, long pos) {
    trace(new Trace.Builder("NClob", "setCharacterStream")
        .withParameter("pos", pos)
        .returned(result)
        .build());
  }

  public void setCharacterStream(Throwable cause, long pos) {
    trace(new Trace.Builder("NClob", "setCharacterStream")
        .withParameter("pos", pos)
        .threw(cause)
        .build());
  }

  public void setString(int result, long pos, String str) {
    trace(new Trace.Builder("NClob", "setString")
        .withParameter("pos", pos)
        .withParameter("str", str)
        .returned(result)
        .build());
  }

  public void setString(Throwable cause, long pos, String str) {
    trace(new Trace.Builder("NClob", "setString")
        .withParameter("pos", pos)
        .withParameter("str", str)
        .threw(cause)
        .build());
  }

  public void setString(int result, long pos, String str, int offset, int len) {
    trace(new Trace.Builder("NClob", "setString")
        .withParameter("pos", pos)
        .withParameter("str", str)
        .withParameter("offset", offset)
        .withParameter("len", len)
        .returned(result)
        .build());
  }

  public void setString(Throwable cause, long pos, String str, int offset, int len) {
    trace(new Trace.Builder("NClob", "setString")
        .withParameter("pos", pos)
        .withParameter("str", str)
        .withParameter("offset", offset)
        .withParameter("len", len)
        .threw(cause)
        .build());
  }

  public void getSubString(String result, long pos, int length) {
    trace(new Trace.Builder("NClob", "getSubString")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .returned(result)
        .build());
  }

  public void getSubString(Throwable cause, long pos, int length) {
    trace(new Trace.Builder("NClob", "getSubString")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void getAsciiStream(InputStream result) {
    trace(new Trace.Builder("NClob", "getAsciiStream")
        .returned(result)
        .build());
  }

  public void getAsciiStream(Throwable cause) {
    trace(new Trace.Builder("NClob", "getAsciiStream")
        .threw(cause)
        .build());
  }

  public void truncate(long len) {
    trace(new Trace.Builder("NClob", "truncate")
        .withParameter("len", len)
        .returned()
        .build());
  }

  public void truncate(Throwable cause, long len) {
    trace(new Trace.Builder("NClob", "truncate")
        .withParameter("len", len)
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result) {
    trace(new Trace.Builder("NClob", "getCharacterStream")
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause) {
    trace(new Trace.Builder("NClob", "getCharacterStream")
        .threw(cause)
        .build());
  }

  public void position(long result, String searchstr, long start) {
    trace(new Trace.Builder("NClob", "position")
        .withParameter("searchstr", searchstr)
        .withParameter("start", start)
        .returned(result)
        .build());
  }

  public void position(Throwable cause, String searchstr, long start) {
    trace(new Trace.Builder("NClob", "position")
        .withParameter("searchstr", searchstr)
        .withParameter("start", start)
        .threw(cause)
        .build());
  }

  public void length(long result) {
    trace(new Trace.Builder("NClob", "length")
        .returned(result)
        .build());
  }

  public void length(Throwable cause) {
    trace(new Trace.Builder("NClob", "length")
        .threw(cause)
        .build());
  }

  public void setAsciiStream(OutputStream result, long pos) {
    trace(new Trace.Builder("NClob", "setAsciiStream")
        .withParameter("pos", pos)
        .returned(result)
        .build());
  }

  public void setAsciiStream(Throwable cause, long pos) {
    trace(new Trace.Builder("NClob", "setAsciiStream")
        .withParameter("pos", pos)
        .threw(cause)
        .build());
  }

  public void position(long result, Clob searchstr, long start) {
    trace(new Trace.Builder("NClob", "position")
        .withParameter("searchstr", searchstr)
        .withParameter("start", start)
        .returned(result)
        .build());
  }

  public void position(Throwable cause, Clob searchstr, long start) {
    trace(new Trace.Builder("NClob", "position")
        .withParameter("searchstr", searchstr)
        .withParameter("start", start)
        .threw(cause)
        .build());
  }

  public void getCharacterStream(Reader result, long pos, long length) {
    trace(new Trace.Builder("NClob", "getCharacterStream")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .returned(result)
        .build());
  }

  public void getCharacterStream(Throwable cause, long pos, long length) {
    trace(new Trace.Builder("NClob", "getCharacterStream")
        .withParameter("pos", pos)
        .withParameter("length", length)
        .threw(cause)
        .build());
  }

  public void free() {
    trace(new Trace.Builder("NClob", "free")
        .returned()
        .build());
  }

  public void free(Throwable cause) {
    trace(new Trace.Builder("NClob", "free")
        .threw(cause)
        .build());
  }
}
