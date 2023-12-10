// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/common.proto

package org.apache.spark.connect.proto;

public interface ResourceInformationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:spark.connect.ResourceInformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * (Required) The name of the resource
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * (Required) The name of the resource
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * (Required) An array of strings describing the addresses of the resource.
   * </pre>
   *
   * <code>repeated string addresses = 2;</code>
   * @return A list containing the addresses.
   */
  java.util.List<java.lang.String>
      getAddressesList();
  /**
   * <pre>
   * (Required) An array of strings describing the addresses of the resource.
   * </pre>
   *
   * <code>repeated string addresses = 2;</code>
   * @return The count of addresses.
   */
  int getAddressesCount();
  /**
   * <pre>
   * (Required) An array of strings describing the addresses of the resource.
   * </pre>
   *
   * <code>repeated string addresses = 2;</code>
   * @param index The index of the element to return.
   * @return The addresses at the given index.
   */
  java.lang.String getAddresses(int index);
  /**
   * <pre>
   * (Required) An array of strings describing the addresses of the resource.
   * </pre>
   *
   * <code>repeated string addresses = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the addresses at the given index.
   */
  com.google.protobuf.ByteString
      getAddressesBytes(int index);
}
