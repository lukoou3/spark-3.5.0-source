// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/base.proto

package org.apache.spark.connect.proto;

public interface AddArtifactsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.AddArtifactsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The list of artifact(s) seen by the server.
   * </pre>
   *
   * <code>repeated .spark.connect.AddArtifactsResponse.ArtifactSummary artifacts = 1;</code>
   */
  java.util.List<org.apache.spark.connect.proto.AddArtifactsResponse.ArtifactSummary> 
      getArtifactsList();
  /**
   * <pre>
   * The list of artifact(s) seen by the server.
   * </pre>
   *
   * <code>repeated .spark.connect.AddArtifactsResponse.ArtifactSummary artifacts = 1;</code>
   */
  org.apache.spark.connect.proto.AddArtifactsResponse.ArtifactSummary getArtifacts(int index);
  /**
   * <pre>
   * The list of artifact(s) seen by the server.
   * </pre>
   *
   * <code>repeated .spark.connect.AddArtifactsResponse.ArtifactSummary artifacts = 1;</code>
   */
  int getArtifactsCount();
  /**
   * <pre>
   * The list of artifact(s) seen by the server.
   * </pre>
   *
   * <code>repeated .spark.connect.AddArtifactsResponse.ArtifactSummary artifacts = 1;</code>
   */
  java.util.List<? extends org.apache.spark.connect.proto.AddArtifactsResponse.ArtifactSummaryOrBuilder> 
      getArtifactsOrBuilderList();
  /**
   * <pre>
   * The list of artifact(s) seen by the server.
   * </pre>
   *
   * <code>repeated .spark.connect.AddArtifactsResponse.ArtifactSummary artifacts = 1;</code>
   */
  org.apache.spark.connect.proto.AddArtifactsResponse.ArtifactSummaryOrBuilder getArtifactsOrBuilder(
      int index);
}
