// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/base.proto

package org.apache.spark.connect.proto;

public interface ExecutePlanRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.ExecutePlanRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required)
   *
   * The session_id specifies a spark session for a user id (which is specified
   * by user_context.user_id). The session_id is set by the client to be able to
   * collate streaming responses from different queries within the dedicated session.
   * The id should be an UUID string of the format `00112233-4455-6677-8899-aabbccddeeff`
   * </pre>
   *
   * <code>string session_id = 1;</code>
   * @return The sessionId.
   */
  java.lang.String getSessionId();
  /**
   * <pre>
   * (Required)
   *
   * The session_id specifies a spark session for a user id (which is specified
   * by user_context.user_id). The session_id is set by the client to be able to
   * collate streaming responses from different queries within the dedicated session.
   * The id should be an UUID string of the format `00112233-4455-6677-8899-aabbccddeeff`
   * </pre>
   *
   * <code>string session_id = 1;</code>
   * @return The bytes for sessionId.
   */
  com.google.protobuf.ByteString
      getSessionIdBytes();

  /**
   * <pre>
   * (Required) User context
   *
   * user_context.user_id and session+id both identify a unique remote spark session on the
   * server side.
   * </pre>
   *
   * <code>.spark.connect.UserContext user_context = 2;</code>
   * @return Whether the userContext field is set.
   */
  boolean hasUserContext();
  /**
   * <pre>
   * (Required) User context
   *
   * user_context.user_id and session+id both identify a unique remote spark session on the
   * server side.
   * </pre>
   *
   * <code>.spark.connect.UserContext user_context = 2;</code>
   * @return The userContext.
   */
  org.apache.spark.connect.proto.UserContext getUserContext();
  /**
   * <pre>
   * (Required) User context
   *
   * user_context.user_id and session+id both identify a unique remote spark session on the
   * server side.
   * </pre>
   *
   * <code>.spark.connect.UserContext user_context = 2;</code>
   */
  org.apache.spark.connect.proto.UserContextOrBuilder getUserContextOrBuilder();

  /**
   * <pre>
   * (Optional)
   * Provide an id for this request. If not provided, it will be generated by the server.
   * It is returned in every ExecutePlanResponse.operation_id of the ExecutePlan response stream.
   * The id must be an UUID string of the format `00112233-4455-6677-8899-aabbccddeeff`
   * </pre>
   *
   * <code>optional string operation_id = 6;</code>
   * @return Whether the operationId field is set.
   */
  boolean hasOperationId();
  /**
   * <pre>
   * (Optional)
   * Provide an id for this request. If not provided, it will be generated by the server.
   * It is returned in every ExecutePlanResponse.operation_id of the ExecutePlan response stream.
   * The id must be an UUID string of the format `00112233-4455-6677-8899-aabbccddeeff`
   * </pre>
   *
   * <code>optional string operation_id = 6;</code>
   * @return The operationId.
   */
  java.lang.String getOperationId();
  /**
   * <pre>
   * (Optional)
   * Provide an id for this request. If not provided, it will be generated by the server.
   * It is returned in every ExecutePlanResponse.operation_id of the ExecutePlan response stream.
   * The id must be an UUID string of the format `00112233-4455-6677-8899-aabbccddeeff`
   * </pre>
   *
   * <code>optional string operation_id = 6;</code>
   * @return The bytes for operationId.
   */
  com.google.protobuf.ByteString
      getOperationIdBytes();

  /**
   * <pre>
   * (Required) The logical plan to be executed / analyzed.
   * </pre>
   *
   * <code>.spark.connect.Plan plan = 3;</code>
   * @return Whether the plan field is set.
   */
  boolean hasPlan();
  /**
   * <pre>
   * (Required) The logical plan to be executed / analyzed.
   * </pre>
   *
   * <code>.spark.connect.Plan plan = 3;</code>
   * @return The plan.
   */
  org.apache.spark.connect.proto.Plan getPlan();
  /**
   * <pre>
   * (Required) The logical plan to be executed / analyzed.
   * </pre>
   *
   * <code>.spark.connect.Plan plan = 3;</code>
   */
  org.apache.spark.connect.proto.PlanOrBuilder getPlanOrBuilder();

  /**
   * <pre>
   * Provides optional information about the client sending the request. This field
   * can be used for language or version specific information and is only intended for
   * logging purposes and will not be interpreted by the server.
   * </pre>
   *
   * <code>optional string client_type = 4;</code>
   * @return Whether the clientType field is set.
   */
  boolean hasClientType();
  /**
   * <pre>
   * Provides optional information about the client sending the request. This field
   * can be used for language or version specific information and is only intended for
   * logging purposes and will not be interpreted by the server.
   * </pre>
   *
   * <code>optional string client_type = 4;</code>
   * @return The clientType.
   */
  java.lang.String getClientType();
  /**
   * <pre>
   * Provides optional information about the client sending the request. This field
   * can be used for language or version specific information and is only intended for
   * logging purposes and will not be interpreted by the server.
   * </pre>
   *
   * <code>optional string client_type = 4;</code>
   * @return The bytes for clientType.
   */
  com.google.protobuf.ByteString
      getClientTypeBytes();

  /**
   * <pre>
   * Repeated element for options that can be passed to the request. This element is currently
   * unused but allows to pass in an extension value used for arbitrary options.
   * </pre>
   *
   * <code>repeated .spark.connect.ExecutePlanRequest.RequestOption request_options = 5;</code>
   */
  java.util.List<org.apache.spark.connect.proto.ExecutePlanRequest.RequestOption> 
      getRequestOptionsList();
  /**
   * <pre>
   * Repeated element for options that can be passed to the request. This element is currently
   * unused but allows to pass in an extension value used for arbitrary options.
   * </pre>
   *
   * <code>repeated .spark.connect.ExecutePlanRequest.RequestOption request_options = 5;</code>
   */
  org.apache.spark.connect.proto.ExecutePlanRequest.RequestOption getRequestOptions(int index);
  /**
   * <pre>
   * Repeated element for options that can be passed to the request. This element is currently
   * unused but allows to pass in an extension value used for arbitrary options.
   * </pre>
   *
   * <code>repeated .spark.connect.ExecutePlanRequest.RequestOption request_options = 5;</code>
   */
  int getRequestOptionsCount();
  /**
   * <pre>
   * Repeated element for options that can be passed to the request. This element is currently
   * unused but allows to pass in an extension value used for arbitrary options.
   * </pre>
   *
   * <code>repeated .spark.connect.ExecutePlanRequest.RequestOption request_options = 5;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.ExecutePlanRequest.RequestOptionOrBuilder> 
      getRequestOptionsOrBuilderList();
  /**
   * <pre>
   * Repeated element for options that can be passed to the request. This element is currently
   * unused but allows to pass in an extension value used for arbitrary options.
   * </pre>
   *
   * <code>repeated .spark.connect.ExecutePlanRequest.RequestOption request_options = 5;</code>
   */
  org.apache.spark.connect.proto.ExecutePlanRequest.RequestOptionOrBuilder getRequestOptionsOrBuilder(
      int index);

  /**
   * <pre>
   * Tags to tag the given execution with.
   * Tags cannot contain ',' character and cannot be empty strings.
   * Used by Interrupt with interrupt.tag.
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   * @return A list containing the tags.
   */
  java.util.List<java.lang.String>
      getTagsList();
  /**
   * <pre>
   * Tags to tag the given execution with.
   * Tags cannot contain ',' character and cannot be empty strings.
   * Used by Interrupt with interrupt.tag.
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   * @return The count of tags.
   */
  int getTagsCount();
  /**
   * <pre>
   * Tags to tag the given execution with.
   * Tags cannot contain ',' character and cannot be empty strings.
   * Used by Interrupt with interrupt.tag.
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   * @param index The index of the element to return.
   * @return The tags at the given index.
   */
  java.lang.String getTags(int index);
  /**
   * <pre>
   * Tags to tag the given execution with.
   * Tags cannot contain ',' character and cannot be empty strings.
   * Used by Interrupt with interrupt.tag.
   * </pre>
   *
   * <code>repeated string tags = 7;</code>
   * @param index The index of the value to return.
   * @return The bytes of the tags at the given index.
   */
  com.google.protobuf.ByteString
      getTagsBytes(int index);
}
