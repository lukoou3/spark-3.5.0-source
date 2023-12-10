// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface RelationCommonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.RelationCommon)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) Shared relation metadata.
   * </pre>
   *
   * <code>string source_info = 1;</code>
   * @return The sourceInfo.
   */
  java.lang.String getSourceInfo();
  /**
   * <pre>
   * (Required) Shared relation metadata.
   * </pre>
   *
   * <code>string source_info = 1;</code>
   * @return The bytes for sourceInfo.
   */
  com.google.protobuf.ByteString
      getSourceInfoBytes();

  /**
   * <pre>
   * (Optional) A per-client globally unique id for a given connect plan.
   * </pre>
   *
   * <code>optional int64 plan_id = 2;</code>
   * @return Whether the planId field is set.
   */
  boolean hasPlanId();
  /**
   * <pre>
   * (Optional) A per-client globally unique id for a given connect plan.
   * </pre>
   *
   * <code>optional int64 plan_id = 2;</code>
   * @return The planId.
   */
  long getPlanId();
}