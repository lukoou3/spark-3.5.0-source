// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * Relation of type [[Offset]] that is used to read rows staring from the `offset` on
 * the input relation.
 * </pre>
 *
 * Protobuf type {@code spark.connect.Offset}
 */
public final class Offset extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.Offset)
    OffsetOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Offset.newBuilder() to construct.
  private Offset(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Offset() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Offset();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Offset_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Offset_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.Offset.class, org.apache.spark.connect.proto.Offset.Builder.class);
  }

  public static final int INPUT_FIELD_NUMBER = 1;
  private org.apache.spark.connect.proto.Relation input_;
  /**
   * <pre>
   * (Required) Input relation for an Offset.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return Whether the input field is set.
   */
  @java.lang.Override
  public boolean hasInput() {
    return input_ != null;
  }
  /**
   * <pre>
   * (Required) Input relation for an Offset.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   * @return The input.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Relation getInput() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }
  /**
   * <pre>
   * (Required) Input relation for an Offset.
   * </pre>
   *
   * <code>.spark.connect.Relation input = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
    return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
  }

  public static final int OFFSET_FIELD_NUMBER = 2;
  private int offset_ = 0;
  /**
   * <pre>
   * (Required) the limit.
   * </pre>
   *
   * <code>int32 offset = 2;</code>
   * @return The offset.
   */
  @java.lang.Override
  public int getOffset() {
    return offset_;
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
    if (input_ != null) {
      output.writeMessage(1, getInput());
    }
    if (offset_ != 0) {
      output.writeInt32(2, offset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (input_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getInput());
    }
    if (offset_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, offset_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.Offset)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.Offset other = (org.apache.spark.connect.proto.Offset) obj;

    if (hasInput() != other.hasInput()) return false;
    if (hasInput()) {
      if (!getInput()
          .equals(other.getInput())) return false;
    }
    if (getOffset()
        != other.getOffset()) return false;
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
    if (hasInput()) {
      hash = (37 * hash) + INPUT_FIELD_NUMBER;
      hash = (53 * hash) + getInput().hashCode();
    }
    hash = (37 * hash) + OFFSET_FIELD_NUMBER;
    hash = (53 * hash) + getOffset();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.Offset parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.Offset parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.Offset parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.Offset parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.Offset prototype) {
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
   * Relation of type [[Offset]] that is used to read rows staring from the `offset` on
   * the input relation.
   * </pre>
   *
   * Protobuf type {@code spark.connect.Offset}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.Offset)
      org.apache.spark.connect.proto.OffsetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Offset_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Offset_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.Offset.class, org.apache.spark.connect.proto.Offset.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.Offset.newBuilder()
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
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      offset_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_Offset_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Offset getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.Offset.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Offset build() {
      org.apache.spark.connect.proto.Offset result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Offset buildPartial() {
      org.apache.spark.connect.proto.Offset result = new org.apache.spark.connect.proto.Offset(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.Offset result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.input_ = inputBuilder_ == null
            ? input_
            : inputBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.offset_ = offset_;
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
      if (other instanceof org.apache.spark.connect.proto.Offset) {
        return mergeFrom((org.apache.spark.connect.proto.Offset)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.Offset other) {
      if (other == org.apache.spark.connect.proto.Offset.getDefaultInstance()) return this;
      if (other.hasInput()) {
        mergeInput(other.getInput());
      }
      if (other.getOffset() != 0) {
        setOffset(other.getOffset());
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
            case 10: {
              input.readMessage(
                  getInputFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              offset_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private org.apache.spark.connect.proto.Relation input_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> inputBuilder_;
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     * @return Whether the input field is set.
     */
    public boolean hasInput() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     * @return The input.
     */
    public org.apache.spark.connect.proto.Relation getInput() {
      if (inputBuilder_ == null) {
        return input_ == null ? org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
      } else {
        return inputBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder setInput(org.apache.spark.connect.proto.Relation value) {
      if (inputBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        input_ = value;
      } else {
        inputBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder setInput(
        org.apache.spark.connect.proto.Relation.Builder builderForValue) {
      if (inputBuilder_ == null) {
        input_ = builderForValue.build();
      } else {
        inputBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder mergeInput(org.apache.spark.connect.proto.Relation value) {
      if (inputBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          input_ != null &&
          input_ != org.apache.spark.connect.proto.Relation.getDefaultInstance()) {
          getInputBuilder().mergeFrom(value);
        } else {
          input_ = value;
        }
      } else {
        inputBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public Builder clearInput() {
      bitField0_ = (bitField0_ & ~0x00000001);
      input_ = null;
      if (inputBuilder_ != null) {
        inputBuilder_.dispose();
        inputBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public org.apache.spark.connect.proto.Relation.Builder getInputBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getInputFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    public org.apache.spark.connect.proto.RelationOrBuilder getInputOrBuilder() {
      if (inputBuilder_ != null) {
        return inputBuilder_.getMessageOrBuilder();
      } else {
        return input_ == null ?
            org.apache.spark.connect.proto.Relation.getDefaultInstance() : input_;
      }
    }
    /**
     * <pre>
     * (Required) Input relation for an Offset.
     * </pre>
     *
     * <code>.spark.connect.Relation input = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> 
        getInputFieldBuilder() {
      if (inputBuilder_ == null) {
        inputBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder>(
                getInput(),
                getParentForChildren(),
                isClean());
        input_ = null;
      }
      return inputBuilder_;
    }

    private int offset_ ;
    /**
     * <pre>
     * (Required) the limit.
     * </pre>
     *
     * <code>int32 offset = 2;</code>
     * @return The offset.
     */
    @java.lang.Override
    public int getOffset() {
      return offset_;
    }
    /**
     * <pre>
     * (Required) the limit.
     * </pre>
     *
     * <code>int32 offset = 2;</code>
     * @param value The offset to set.
     * @return This builder for chaining.
     */
    public Builder setOffset(int value) {

      offset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) the limit.
     * </pre>
     *
     * <code>int32 offset = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOffset() {
      bitField0_ = (bitField0_ & ~0x00000002);
      offset_ = 0;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.Offset)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.Offset)
  private static final org.apache.spark.connect.proto.Offset DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.Offset();
  }

  public static org.apache.spark.connect.proto.Offset getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Offset>
      PARSER = new com.google.protobuf.AbstractParser<Offset>() {
    @java.lang.Override
    public Offset parsePartialFrom(
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

  public static com.google.protobuf.Parser<Offset> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Offset> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.Offset getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

