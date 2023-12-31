// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface WithWatermarkOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.WithWatermark)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) The input relation
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * (Required) The input relation
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  org.apache.spark.connect.proto.Relation getInput();
  /**
   * <pre>
   * (Required) The input relation
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * (Required) Name of the column containing event time.
   * </pre>
   *
   * <code>string event_time = 2;</code>
   * @return The eventTime.
   */
  java.lang.String getEventTime();
  /**
   * <pre>
   * (Required) Name of the column containing event time.
   * </pre>
   *
   * <code>string event_time = 2;</code>
   * @return The bytes for eventTime.
   */
  com.google.protobuf.ByteString
      getEventTimeBytes();

  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string delay_threshold = 3;</code>
   * @return The delayThreshold.
   */
  java.lang.String getDelayThreshold();
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string delay_threshold = 3;</code>
   * @return The bytes for delayThreshold.
   */
  com.google.protobuf.ByteString
      getDelayThresholdBytes();
}
