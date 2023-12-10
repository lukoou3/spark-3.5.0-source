// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

public interface GroupMapOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.GroupMap)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) Input relation for Group Map API: apply, applyInPandas.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  boolean hasInput();
  /**
   * <pre>
   * (Required) Input relation for Group Map API: apply, applyInPandas.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  org.apache.spark.connect.proto.Relation getInput();
  /**
   * <pre>
   * (Required) Input relation for Group Map API: apply, applyInPandas.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder();

  /**
   * <pre>
   * (Required) Expressions for grouping keys.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression grouping_expressions = 2;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getGroupingExpressionsList();
  /**
   * <pre>
   * (Required) Expressions for grouping keys.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression grouping_expressions = 2;</code>
   */
  org.apache.spark.connect.proto.Expression getGroupingExpressions(int index);
  /**
   * <pre>
   * (Required) Expressions for grouping keys.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression grouping_expressions = 2;</code>
   */
  int getGroupingExpressionsCount();
  /**
   * <pre>
   * (Required) Expressions for grouping keys.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression grouping_expressions = 2;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getGroupingExpressionsOrBuilderList();
  /**
   * <pre>
   * (Required) Expressions for grouping keys.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression grouping_expressions = 2;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getGroupingExpressionsOrBuilder(
      int index);

  /**
   * <pre>
   * (Required) Input user-defined function.
   * </pre>
   *
   * <code>.spark.connect.CommonInlineUserDefinedFunction func = 3;</code>
   * @return Whether the func field is set.
   */
  boolean hasFunc();
  /**
   * <pre>
   * (Required) Input user-defined function.
   * </pre>
   *
   * <code>.spark.connect.CommonInlineUserDefinedFunction func = 3;</code>
   * @return The func.
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunction getFunc();
  /**
   * <pre>
   * (Required) Input user-defined function.
   * </pre>
   *
   * <code>.spark.connect.CommonInlineUserDefinedFunction func = 3;</code>
   */
  org.apache.spark.connect.proto.CommonInlineUserDefinedFunctionOrBuilder getFuncOrBuilder();

  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted Group Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression sorting_expressions = 4;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getSortingExpressionsList();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted Group Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression sorting_expressions = 4;</code>
   */
  org.apache.spark.connect.proto.Expression getSortingExpressions(int index);
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted Group Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression sorting_expressions = 4;</code>
   */
  int getSortingExpressionsCount();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted Group Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression sorting_expressions = 4;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getSortingExpressionsOrBuilderList();
  /**
   * <pre>
   * (Optional) Expressions for sorting. Only used by Scala Sorted Group Map API.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression sorting_expressions = 4;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getSortingExpressionsOrBuilder(
      int index);

  /**
   * <pre>
   * Below fields are only used by (Flat)MapGroupsWithState
   * (Optional) Input relation for initial State.
   * </pre>
   *
   * <code>.spark.connect.Relation initial_input = 5;</code>
   * @return Whether the initialInput field is set.
   */
  boolean hasInitialInput();
  /**
   * <pre>
   * Below fields are only used by (Flat)MapGroupsWithState
   * (Optional) Input relation for initial State.
   * </pre>
   *
   * <code>.spark.connect.Relation initial_input = 5;</code>
   * @return The initialInput.
   */
  org.apache.spark.connect.proto.Relation getInitialInput();
  /**
   * <pre>
   * Below fields are only used by (Flat)MapGroupsWithState
   * (Optional) Input relation for initial State.
   * </pre>
   *
   * <code>.spark.connect.Relation initial_input = 5;</code>
   */
  org.apache.spark.connect.proto.RelationOrBuilder getInitialInputOrBuilder();

  /**
   * <pre>
   * (Optional) Expressions for grouping keys of the initial state input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression initial_grouping_expressions = 6;</code>
   */
  java.util.List<org.apache.spark.connect.proto.Expression> 
      getInitialGroupingExpressionsList();
  /**
   * <pre>
   * (Optional) Expressions for grouping keys of the initial state input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression initial_grouping_expressions = 6;</code>
   */
  org.apache.spark.connect.proto.Expression getInitialGroupingExpressions(int index);
  /**
   * <pre>
   * (Optional) Expressions for grouping keys of the initial state input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression initial_grouping_expressions = 6;</code>
   */
  int getInitialGroupingExpressionsCount();
  /**
   * <pre>
   * (Optional) Expressions for grouping keys of the initial state input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression initial_grouping_expressions = 6;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExpressionOrBuilder> 
      getInitialGroupingExpressionsOrBuilderList();
  /**
   * <pre>
   * (Optional) Expressions for grouping keys of the initial state input relation.
   * </pre>
   *
   * <code>repeated .spark.connect.Expression initial_grouping_expressions = 6;</code>
   */
  org.apache.spark.connect.proto.ExpressionOrBuilder getInitialGroupingExpressionsOrBuilder(
      int index);

  /**
   * <pre>
   * (Optional) True if MapGroupsWithState, false if FlatMapGroupsWithState.
   * </pre>
   *
   * <code>optional bool is_map_groups_with_state = 7;</code>
   * @return Whether the isMapGroupsWithState field is set.
   */
  boolean hasIsMapGroupsWithState();
  /**
   * <pre>
   * (Optional) True if MapGroupsWithState, false if FlatMapGroupsWithState.
   * </pre>
   *
   * <code>optional bool is_map_groups_with_state = 7;</code>
   * @return The isMapGroupsWithState.
   */
  boolean getIsMapGroupsWithState();

  /**
   * <pre>
   * (Optional) The output mode of the function.
   * </pre>
   *
   * <code>optional string output_mode = 8;</code>
   * @return Whether the outputMode field is set.
   */
  boolean hasOutputMode();
  /**
   * <pre>
   * (Optional) The output mode of the function.
   * </pre>
   *
   * <code>optional string output_mode = 8;</code>
   * @return The outputMode.
   */
  java.lang.String getOutputMode();
  /**
   * <pre>
   * (Optional) The output mode of the function.
   * </pre>
   *
   * <code>optional string output_mode = 8;</code>
   * @return The bytes for outputMode.
   */
  com.google.protobuf.ByteString
      getOutputModeBytes();

  /**
   * <pre>
   * (Optional) Timeout configuration for groups that do not receive data for a while.
   * </pre>
   *
   * <code>optional string timeout_conf = 9;</code>
   * @return Whether the timeoutConf field is set.
   */
  boolean hasTimeoutConf();
  /**
   * <pre>
   * (Optional) Timeout configuration for groups that do not receive data for a while.
   * </pre>
   *
   * <code>optional string timeout_conf = 9;</code>
   * @return The timeoutConf.
   */
  java.lang.String getTimeoutConf();
  /**
   * <pre>
   * (Optional) Timeout configuration for groups that do not receive data for a while.
   * </pre>
   *
   * <code>optional string timeout_conf = 9;</code>
   * @return The bytes for timeoutConf.
   */
  com.google.protobuf.ByteString
      getTimeoutConfBytes();
}
