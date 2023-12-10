// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

public interface StreamingQueryInstanceIdOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.StreamingQueryInstanceId)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) The unique id of this query that persists across restarts from checkpoint data.
   * That is, this id is generated when a query is started for the first time, and
   * will be the same every time it is restarted from checkpoint data.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * (Required) The unique id of this query that persists across restarts from checkpoint data.
   * That is, this id is generated when a query is started for the first time, and
   * will be the same every time it is restarted from checkpoint data.
   * </pre>
   *
   * <code>string id = 1;</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * (Required) The unique id of this run of the query. That is, every start/restart of a query
   * will generate a unique run_id. Therefore, every time a query is restarted from
   * checkpoint, it will have the same `id` but different `run_id`s.
   * </pre>
   *
   * <code>string run_id = 2;</code>
   * @return The runId.
   */
  java.lang.String getRunId();
  /**
   * <pre>
   * (Required) The unique id of this run of the query. That is, every start/restart of a query
   * will generate a unique run_id. Therefore, every time a query is restarted from
   * checkpoint, it will have the same `id` but different `run_id`s.
   * </pre>
   *
   * <code>string run_id = 2;</code>
   * @return The bytes for runId.
   */
  com.google.protobuf.ByteString
      getRunIdBytes();
}