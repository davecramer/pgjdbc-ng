package org.postgresql.ng.spy;

public class ParameterMetaDataTracer implements ParameterMetaDataListener {
  TraceOutput out;

  public ParameterMetaDataTracer(TraceOutput out) {
    this.out = out;
  }

  public void trace(Trace trace) {
    this.out.trace(trace);
  }

  public void isWrapperFor(boolean result, Class<?> iface) {
    trace(new Trace.Builder("ParameterMetaData", "isWrapperFor")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public void isWrapperFor(Throwable cause, Class<?> iface) {
    trace(new Trace.Builder("ParameterMetaData", "isWrapperFor")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void getParameterClassName(String result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterClassName")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void getParameterClassName(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterClassName")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public void getParameterType(int result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterType")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void getParameterType(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterType")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public void isNullable(int result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "isNullable")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void isNullable(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "isNullable")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public <T> void unwrap(T result, Class<T> iface) {
    trace(new Trace.Builder("ParameterMetaData", "unwrap")
        .withParameter("iface", iface)
        .returned(result)
        .build());
  }

  public <T> void unwrap(Throwable cause, Class<T> iface) {
    trace(new Trace.Builder("ParameterMetaData", "unwrap")
        .withParameter("iface", iface)
        .threw(cause)
        .build());
  }

  public void getParameterCount(int result) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterCount")
        .returned(result)
        .build());
  }

  public void getParameterCount(Throwable cause) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterCount")
        .threw(cause)
        .build());
  }

  public void getPrecision(int result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getPrecision")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void getPrecision(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getPrecision")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public void getScale(int result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getScale")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void getScale(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getScale")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public void getParameterMode(int result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterMode")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void getParameterMode(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterMode")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public void isSigned(boolean result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "isSigned")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void isSigned(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "isSigned")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }

  public void getParameterTypeName(String result, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterTypeName")
        .withParameter("param", param)
        .returned(result)
        .build());
  }

  public void getParameterTypeName(Throwable cause, int param) {
    trace(new Trace.Builder("ParameterMetaData", "getParameterTypeName")
        .withParameter("param", param)
        .threw(cause)
        .build());
  }
}
