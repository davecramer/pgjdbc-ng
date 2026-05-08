package org.postgresql.ng.spy;

/**
 * Common Relay interface that provides access
 * to its target object.
 */
public interface Relay<T> {

  T getTarget();

}
