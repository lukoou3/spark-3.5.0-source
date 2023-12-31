// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/common.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * StorageLevel for persisting Datasets/Tables.
 * </pre>
 *
 * Protobuf type {@code spark.connect.StorageLevel}
 */
public final class StorageLevel extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.StorageLevel)
    StorageLevelOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StorageLevel.newBuilder() to construct.
  private StorageLevel(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StorageLevel() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StorageLevel();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Common.internal_static_spark_connect_StorageLevel_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Common.internal_static_spark_connect_StorageLevel_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.StorageLevel.class, org.apache.spark.connect.proto.StorageLevel.Builder.class);
  }

  public static final int USE_DISK_FIELD_NUMBER = 1;
  private boolean useDisk_ = false;
  /**
   * <pre>
   * (Required) Whether the cache should use disk or not.
   * </pre>
   *
   * <code>bool use_disk = 1;</code>
   * @return The useDisk.
   */
  @java.lang.Override
  public boolean getUseDisk() {
    return useDisk_;
  }

  public static final int USE_MEMORY_FIELD_NUMBER = 2;
  private boolean useMemory_ = false;
  /**
   * <pre>
   * (Required) Whether the cache should use memory or not.
   * </pre>
   *
   * <code>bool use_memory = 2;</code>
   * @return The useMemory.
   */
  @java.lang.Override
  public boolean getUseMemory() {
    return useMemory_;
  }

  public static final int USE_OFF_HEAP_FIELD_NUMBER = 3;
  private boolean useOffHeap_ = false;
  /**
   * <pre>
   * (Required) Whether the cache should use off-heap or not.
   * </pre>
   *
   * <code>bool use_off_heap = 3;</code>
   * @return The useOffHeap.
   */
  @java.lang.Override
  public boolean getUseOffHeap() {
    return useOffHeap_;
  }

  public static final int DESERIALIZED_FIELD_NUMBER = 4;
  private boolean deserialized_ = false;
  /**
   * <pre>
   * (Required) Whether the cached data is deserialized or not.
   * </pre>
   *
   * <code>bool deserialized = 4;</code>
   * @return The deserialized.
   */
  @java.lang.Override
  public boolean getDeserialized() {
    return deserialized_;
  }

  public static final int REPLICATION_FIELD_NUMBER = 5;
  private int replication_ = 0;
  /**
   * <pre>
   * (Required) The number of replicas.
   * </pre>
   *
   * <code>int32 replication = 5;</code>
   * @return The replication.
   */
  @java.lang.Override
  public int getReplication() {
    return replication_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (useDisk_ != false) {
      output.writeBool(1, useDisk_);
    }
    if (useMemory_ != false) {
      output.writeBool(2, useMemory_);
    }
    if (useOffHeap_ != false) {
      output.writeBool(3, useOffHeap_);
    }
    if (deserialized_ != false) {
      output.writeBool(4, deserialized_);
    }
    if (replication_ != 0) {
      output.writeInt32(5, replication_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (useDisk_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, useDisk_);
    }
    if (useMemory_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, useMemory_);
    }
    if (useOffHeap_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, useOffHeap_);
    }
    if (deserialized_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, deserialized_);
    }
    if (replication_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, replication_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.apache.spark.connect.proto.StorageLevel)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.StorageLevel other = (org.apache.spark.connect.proto.StorageLevel) obj;

    if (getUseDisk()
        != other.getUseDisk()) return false;
    if (getUseMemory()
        != other.getUseMemory()) return false;
    if (getUseOffHeap()
        != other.getUseOffHeap()) return false;
    if (getDeserialized()
        != other.getDeserialized()) return false;
    if (getReplication()
        != other.getReplication()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USE_DISK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseDisk());
    hash = (37 * hash) + USE_MEMORY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseMemory());
    hash = (37 * hash) + USE_OFF_HEAP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getUseOffHeap());
    hash = (37 * hash) + DESERIALIZED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDeserialized());
    hash = (37 * hash) + REPLICATION_FIELD_NUMBER;
    hash = (53 * hash) + getReplication();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.StorageLevel parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.StorageLevel parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.StorageLevel parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.apache.spark.connect.proto.StorageLevel prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * StorageLevel for persisting Datasets/Tables.
   * </pre>
   *
   * Protobuf type {@code spark.connect.StorageLevel}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.StorageLevel)
      org.apache.spark.connect.proto.StorageLevelOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Common.internal_static_spark_connect_StorageLevel_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Common.internal_static_spark_connect_StorageLevel_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.StorageLevel.class, org.apache.spark.connect.proto.StorageLevel.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.StorageLevel.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      useDisk_ = false;
      useMemory_ = false;
      useOffHeap_ = false;
      deserialized_ = false;
      replication_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Common.internal_static_spark_connect_StorageLevel_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.StorageLevel getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.StorageLevel.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.StorageLevel build() {
      org.apache.spark.connect.proto.StorageLevel result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.StorageLevel buildPartial() {
      org.apache.spark.connect.proto.StorageLevel result = new org.apache.spark.connect.proto.StorageLevel(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.StorageLevel result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.useDisk_ = useDisk_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.useMemory_ = useMemory_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.useOffHeap_ = useOffHeap_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.deserialized_ = deserialized_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.replication_ = replication_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.apache.spark.connect.proto.StorageLevel) {
        return mergeFrom((org.apache.spark.connect.proto.StorageLevel)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.StorageLevel other) {
      if (other == org.apache.spark.connect.proto.StorageLevel.getDefaultInstance()) return this;
      if (other.getUseDisk() != false) {
        setUseDisk(other.getUseDisk());
      }
      if (other.getUseMemory() != false) {
        setUseMemory(other.getUseMemory());
      }
      if (other.getUseOffHeap() != false) {
        setUseOffHeap(other.getUseOffHeap());
      }
      if (other.getDeserialized() != false) {
        setDeserialized(other.getDeserialized());
      }
      if (other.getReplication() != 0) {
        setReplication(other.getReplication());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {
              useDisk_ = input.readBool();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              useMemory_ = input.readBool();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              useOffHeap_ = input.readBool();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              deserialized_ = input.readBool();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 40: {
              replication_ = input.readInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 40
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private boolean useDisk_ ;
    /**
     * <pre>
     * (Required) Whether the cache should use disk or not.
     * </pre>
     *
     * <code>bool use_disk = 1;</code>
     * @return The useDisk.
     */
    @java.lang.Override
    public boolean getUseDisk() {
      return useDisk_;
    }
    /**
     * <pre>
     * (Required) Whether the cache should use disk or not.
     * </pre>
     *
     * <code>bool use_disk = 1;</code>
     * @param value The useDisk to set.
     * @return This builder for chaining.
     */
    public Builder setUseDisk(boolean value) {

      useDisk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Whether the cache should use disk or not.
     * </pre>
     *
     * <code>bool use_disk = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseDisk() {
      bitField0_ = (bitField0_ & ~0x00000001);
      useDisk_ = false;
      onChanged();
      return this;
    }

    private boolean useMemory_ ;
    /**
     * <pre>
     * (Required) Whether the cache should use memory or not.
     * </pre>
     *
     * <code>bool use_memory = 2;</code>
     * @return The useMemory.
     */
    @java.lang.Override
    public boolean getUseMemory() {
      return useMemory_;
    }
    /**
     * <pre>
     * (Required) Whether the cache should use memory or not.
     * </pre>
     *
     * <code>bool use_memory = 2;</code>
     * @param value The useMemory to set.
     * @return This builder for chaining.
     */
    public Builder setUseMemory(boolean value) {

      useMemory_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Whether the cache should use memory or not.
     * </pre>
     *
     * <code>bool use_memory = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseMemory() {
      bitField0_ = (bitField0_ & ~0x00000002);
      useMemory_ = false;
      onChanged();
      return this;
    }

    private boolean useOffHeap_ ;
    /**
     * <pre>
     * (Required) Whether the cache should use off-heap or not.
     * </pre>
     *
     * <code>bool use_off_heap = 3;</code>
     * @return The useOffHeap.
     */
    @java.lang.Override
    public boolean getUseOffHeap() {
      return useOffHeap_;
    }
    /**
     * <pre>
     * (Required) Whether the cache should use off-heap or not.
     * </pre>
     *
     * <code>bool use_off_heap = 3;</code>
     * @param value The useOffHeap to set.
     * @return This builder for chaining.
     */
    public Builder setUseOffHeap(boolean value) {

      useOffHeap_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Whether the cache should use off-heap or not.
     * </pre>
     *
     * <code>bool use_off_heap = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUseOffHeap() {
      bitField0_ = (bitField0_ & ~0x00000004);
      useOffHeap_ = false;
      onChanged();
      return this;
    }

    private boolean deserialized_ ;
    /**
     * <pre>
     * (Required) Whether the cached data is deserialized or not.
     * </pre>
     *
     * <code>bool deserialized = 4;</code>
     * @return The deserialized.
     */
    @java.lang.Override
    public boolean getDeserialized() {
      return deserialized_;
    }
    /**
     * <pre>
     * (Required) Whether the cached data is deserialized or not.
     * </pre>
     *
     * <code>bool deserialized = 4;</code>
     * @param value The deserialized to set.
     * @return This builder for chaining.
     */
    public Builder setDeserialized(boolean value) {

      deserialized_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Whether the cached data is deserialized or not.
     * </pre>
     *
     * <code>bool deserialized = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeserialized() {
      bitField0_ = (bitField0_ & ~0x00000008);
      deserialized_ = false;
      onChanged();
      return this;
    }

    private int replication_ ;
    /**
     * <pre>
     * (Required) The number of replicas.
     * </pre>
     *
     * <code>int32 replication = 5;</code>
     * @return The replication.
     */
    @java.lang.Override
    public int getReplication() {
      return replication_;
    }
    /**
     * <pre>
     * (Required) The number of replicas.
     * </pre>
     *
     * <code>int32 replication = 5;</code>
     * @param value The replication to set.
     * @return This builder for chaining.
     */
    public Builder setReplication(int value) {

      replication_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The number of replicas.
     * </pre>
     *
     * <code>int32 replication = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearReplication() {
      bitField0_ = (bitField0_ & ~0x00000010);
      replication_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:spark.connect.StorageLevel)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.StorageLevel)
  private static final org.apache.spark.connect.proto.StorageLevel DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.StorageLevel();
  }

  public static org.apache.spark.connect.proto.StorageLevel getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StorageLevel>
      PARSER = new com.google.protobuf.AbstractParser<StorageLevel>() {
    @java.lang.Override
    public StorageLevel parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<StorageLevel> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StorageLevel> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.StorageLevel getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

