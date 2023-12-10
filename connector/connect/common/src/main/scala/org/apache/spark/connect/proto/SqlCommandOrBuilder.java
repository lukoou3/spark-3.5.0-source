// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

public interface SqlCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.SqlCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) SQL Query.
   * </pre>
   *
   * <code>string sql = 1;</code>
   * @return The sql.
   */
  java.lang.String getSql();
  /**
   * <pre>
   * (Required) SQL Query.
   * </pre>
   *
   * <code>string sql = 1;</code>
   * @return The bytes for sql.
   */
  com.google.protobuf.ByteString
      getSqlBytes();

  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  int getArgsCount();
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  boolean containsArgs(
      java.lang.String key);
  /**
   * Use {@link #getArgsMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
  getArgs();
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  java.util.Map<java.lang.String, org.apache.spark.connect.proto.Expression.Literal>
  getArgsMap();
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  /* nullable */
org.apache.spark.connect.proto.Expression.Literal getArgsOrDefault(
      java.lang.String key,
      /* nullable */
org.apache.spark.connect.proto.Expression.Literal defaultValue);
  /**
   * <pre>
   * (Optional) A map of parameter names to literal expressions.
   * </pre>
   *
   * <code>map&lt;string, .spark.connect.Expression.Literal&gt; args = 2;</code>
   */
  org.apache.spark.connect.proto.Expression.Literal getArgsOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * (Optional) A sequence of literal expressions for positional parameters in the SQL query text.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression.Literal pos_args = 3;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression.Literal> 
      getPosArgsList();
  /**
   * <pre>
   * (Optional) A sequence of literal expressions for positional parameters in the SQL query text.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression.Literal pos_args = 3;</code>
   */
  org.apache.spark.connect.proto.Expression.Literal getPosArgs(int index);
  /**
   * <pre>
   * (Optional) A sequence of literal expressions for positional parameters in the SQL query text.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression.Literal pos_args = 3;</code>
   */
  int getPosArgsCount();
  /**
   * <pre>
   * (Optional) A sequence of literal expressions for positional parameters in the SQL query text.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression.Literal pos_args = 3;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.Expression.LiteralOrBuilder> 
      getPosArgsOrBuilderList();
  /**
   * <pre>
   * (Optional) A sequence of literal expressions for positional parameters in the SQL query text.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression.Literal pos_args = 3;</code>
   */
  org.apache.spark.connect.proto.Expression.LiteralOrBuilder getPosArgsOrBuilder(
      int index);
}
