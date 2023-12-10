// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/expressions.proto

package org.apache.spark.connect.proto;

public interface JavaUDFOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.JavaUDF)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) Fully qualified name of Java class
   * </pre>
   *
   * <code>string class_name = 1;</code>
   * @return The className.
   */
  java.lang.String getClassName();
  /**
   * <pre>
   * (Required) Fully qualified name of Java class
   * </pre>
   *
   * <code>string class_name = 1;</code>
   * @return The bytes for className.
   */
  com.google.protobuf.ByteString
      getClassNameBytes();

  /**
   * <pre>
   * (Optional) Output type of the Java UDF
   * </pre>
   *
   * <code>optional .spark.connect.DataType output_type = 2;</code>
   * @return Whether the outputType field is set.
   */
  boolean hasOutputType();
  /**
   * <pre>
   * (Optional) Output type of the Java UDF
   * </pre>
   *
   * <code>optional .spark.connect.DataType output_type = 2;</code>
   * @return The outputType.
   */
  org.apache.spark.connect.proto.DataType getOutputType();
  /**
   * <pre>
   * (Optional) Output type of the Java UDF
   * </pre>
   *
   * <code>optional .spark.connect.DataType output_type = 2;</code>
   */
  org.apache.spark.connect.proto.DataTypeOrBuilder getOutputTypeOrBuilder();

  /**
   * <pre>
   * (Required) Indicate if the Java user-defined function is an aggregate function
   * </pre>
   *
   * <code>bool aggregate = 3;</code>
   * @return The aggregate.
   */
  boolean getAggregate();
}
