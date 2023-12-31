// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface WithColumnsRenamedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.WithColumnsRenamed)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  org.apache.spark.connect.proto.Relation getInput();
  /**
   * <pre>
   * (Required) The input relation.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * (Required)
   *
   * Renaming column names of input relation from A to B where A is the map key
   * and B is the map value. This is a no-op if schema doesn't contain any A. It
   * does not require that all input relation column names to present as keys.
   * duplicated B are not allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_columns_map = 2;</code>
   */
  int getRenameColumnsMapCount();
  /**
   * <pre>
   * (Required)
   *
   * Renaming column names of input relation from A to B where A is the map key
   * and B is the map value. This is a no-op if schema doesn't contain any A. It
   * does not require that all input relation column names to present as keys.
   * duplicated B are not allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_columns_map = 2;</code>
   */
  boolean containsRenameColumnsMap(
      java.lang.String key);
  /**
   * Use {@link #getRenameColumnsMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getRenameColumnsMap();
  /**
   * <pre>
   * (Required)
   *
   * Renaming column names of input relation from A to B where A is the map key
   * and B is the map value. This is a no-op if schema doesn't contain any A. It
   * does not require that all input relation column names to present as keys.
   * duplicated B are not allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_columns_map = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getRenameColumnsMapMap();
  /**
   * <pre>
   * (Required)
   *
   * Renaming column names of input relation from A to B where A is the map key
   * and B is the map value. This is a no-op if schema doesn't contain any A. It
   * does not require that all input relation column names to present as keys.
   * duplicated B are not allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_columns_map = 2;</code>
   */
  /* nullable */
java.lang.String getRenameColumnsMapOrDefault(
      java.lang.String key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <pre>
   * (Required)
   *
   * Renaming column names of input relation from A to B where A is the map key
   * and B is the map value. This is a no-op if schema doesn't contain any A. It
   * does not require that all input relation column names to present as keys.
   * duplicated B are not allowed.
   * </pre>
   *
   * <code>map&lt;string, string&gt; rename_columns_map = 2;</code>
   */
  java.lang.String getRenameColumnsMapOrThrow(
      java.lang.String key);
}
