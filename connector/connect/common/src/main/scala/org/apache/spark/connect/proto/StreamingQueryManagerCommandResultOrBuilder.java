// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/commands.proto

package org.apache.spark.connect.proto;

public interface StreamingQueryManagerCommandResultOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.StreamingQueryManagerCommandResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.ActiveResult active = 1;</code>
   * @return Whether the active field is set.
   */
  boolean hasActive();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.ActiveResult active = 1;</code>
   * @return The active.
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.ActiveResult getActive();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.ActiveResult active = 1;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.ActiveResultOrBuilder getActiveOrBuilder();

  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.StreamingQueryInstance query = 2;</code>
   * @return Whether the query field is set.
   */
  boolean hasQuery();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.StreamingQueryInstance query = 2;</code>
   * @return The query.
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.StreamingQueryInstance getQuery();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.StreamingQueryInstance query = 2;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.StreamingQueryInstanceOrBuilder getQueryOrBuilder();

  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.AwaitAnyTerminationResult await_any_termination = 3;</code>
   * @return Whether the awaitAnyTermination field is set.
   */
  boolean hasAwaitAnyTermination();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.AwaitAnyTerminationResult await_any_termination = 3;</code>
   * @return The awaitAnyTermination.
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.AwaitAnyTerminationResult getAwaitAnyTermination();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.AwaitAnyTerminationResult await_any_termination = 3;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.AwaitAnyTerminationResultOrBuilder getAwaitAnyTerminationOrBuilder();

  /**
   * <code>bool reset_terminated = 4;</code>
   * @return Whether the resetTerminated field is set.
   */
  boolean hasResetTerminated();
  /**
   * <code>bool reset_terminated = 4;</code>
   * @return The resetTerminated.
   */
  boolean getResetTerminated();

  /**
   * <code>bool add_listener = 5;</code>
   * @return Whether the addListener field is set.
   */
  boolean hasAddListener();
  /**
   * <code>bool add_listener = 5;</code>
   * @return The addListener.
   */
  boolean getAddListener();

  /**
   * <code>bool remove_listener = 6;</code>
   * @return Whether the removeListener field is set.
   */
  boolean hasRemoveListener();
  /**
   * <code>bool remove_listener = 6;</code>
   * @return The removeListener.
   */
  boolean getRemoveListener();

  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.ListStreamingQueryListenerResult list_listeners = 7;</code>
   * @return Whether the listListeners field is set.
   */
  boolean hasListListeners();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.ListStreamingQueryListenerResult list_listeners = 7;</code>
   * @return The listListeners.
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.ListStreamingQueryListenerResult getListListeners();
  /**
   * <code>.spark.connect.StreamingQueryManagerCommandResult.ListStreamingQueryListenerResult list_listeners = 7;</code>
   */
  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.ListStreamingQueryListenerResultOrBuilder getListListenersOrBuilder();

  org.apache.spark.connect.proto.StreamingQueryManagerCommandResult.ResultTypeCase getResultTypeCase();
}
