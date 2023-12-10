// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface StatCovOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.StatCov)
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
   * (Required) The name of the first column.
   * </pre>
   *
   * <code>string col1 = 2;</code>
   * @return The col1.
   */
  java.lang.String getCol1();
  /**
   * <pre>
   * (Required) The name of the first column.
   * </pre>
   *
   * <code>string col1 = 2;</code>
   * @return The bytes for col1.
   */
  com.google.protobuf.ByteString
      getCol1Bytes();

  /**
   * <pre>
   * (Required) The name of the second column.
   * </pre>
   *
   * <code>string col2 = 3;</code>
   * @return The col2.
   */
  java.lang.String getCol2();
  /**
   * <pre>
   * (Required) The name of the second column.
   * </pre>
   *
   * <code>string col2 = 3;</code>
   * @return The bytes for col2.
   */
  com.google.protobuf.ByteString
      getCol2Bytes();
}
