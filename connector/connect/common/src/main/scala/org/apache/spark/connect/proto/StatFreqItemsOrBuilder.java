// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface StatFreqItemsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.StatFreqItems)
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
   * (Required) The names of the columns to search frequent items in.
   * </pre>
   *
   * <code>repeated string cols = 2;</code>
   * @return A list containing the cols.
   */
  java.util.List<java.lang.String>
      getColsList();
  /**
   * <pre>
   * (Required) The names of the columns to search frequent items in.
   * </pre>
   *
   * <code>repeated string cols = 2;</code>
   * @return The count of cols.
   */
  int getColsCount();
  /**
   * <pre>
   * (Required) The names of the columns to search frequent items in.
   * </pre>
   *
   * <code>repeated string cols = 2;</code>
   * @param index The index of the element to return.
   * @return The cols at the given index.
   */
  java.lang.String getCols(int index);
  /**
   * <pre>
   * (Required) The names of the columns to search frequent items in.
   * </pre>
   *
   * <code>repeated string cols = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cols at the given index.
   */
  com.google.protobuf.ByteString
      getColsBytes(int index);

  /**
   * <pre>
   * (Optional) The minimum frequency for an item to be considered `frequent`.
   * Should be greater than 1e-4.
   * </pre>
   *
   * <code>optional double support = 3;</code>
   * @return Whether the support field is set.
   */
  boolean hasSupport();
  /**
   * <pre>
   * (Optional) The minimum frequency for an item to be considered `frequent`.
   * Should be greater than 1e-4.
   * </pre>
   *
   * <code>optional double support = 3;</code>
   * @return The support.
   */
  double getSupport();
}
