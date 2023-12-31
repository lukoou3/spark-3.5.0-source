// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/relations.proto

package org.apache.spark.connect.proto;

/**
 * Protobuf type {@code spark.connect.PythonUDTF}
 */
public final class PythonUDTF extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.PythonUDTF)
    PythonUDTFOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PythonUDTF.newBuilder() to construct.
  private PythonUDTF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PythonUDTF() {
    command_ = com.google.protobuf.ByteString.EMPTY;
    pythonVer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PythonUDTF();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_PythonUDTF_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_PythonUDTF_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.PythonUDTF.class, org.apache.spark.connect.proto.PythonUDTF.Builder.class);
  }

  private int bitField0_;
  public static final int RETURN_TYPE_FIELD_NUMBER = 1;
  private org.apache.spark.connect.proto.DataType returnType_;
  /**
   * <pre>
   * (Optional) Return type of the Python UDTF.
   * </pre>
   *
   * <code>optional .spark.connect.DataType return_type = 1;</code>
   * @return Whether the returnType field is set.
   */
  @java.lang.Override
  public boolean hasReturnType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <pre>
   * (Optional) Return type of the Python UDTF.
   * </pre>
   *
   * <code>optional .spark.connect.DataType return_type = 1;</code>
   * @return The returnType.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.DataType getReturnType() {
    return returnType_ == null ? org.apache.spark.connect.proto.DataType.getDefaultInstance() : returnType_;
  }
  /**
   * <pre>
   * (Optional) Return type of the Python UDTF.
   * </pre>
   *
   * <code>optional .spark.connect.DataType return_type = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.DataTypeOrBuilder getReturnTypeOrBuilder() {
    return returnType_ == null ? org.apache.spark.connect.proto.DataType.getDefaultInstance() : returnType_;
  }

  public static final int EVAL_TYPE_FIELD_NUMBER = 2;
  private int evalType_ = 0;
  /**
   * <pre>
   * (Required) EvalType of the Python UDTF.
   * </pre>
   *
   * <code>int32 eval_type = 2;</code>
   * @return The evalType.
   */
  @java.lang.Override
  public int getEvalType() {
    return evalType_;
  }

  public static final int COMMAND_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString command_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * (Required) The encoded commands of the Python UDTF.
   * </pre>
   *
   * <code>bytes command = 3;</code>
   * @return The command.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCommand() {
    return command_;
  }

  public static final int PYTHON_VER_FIELD_NUMBER = 4;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pythonVer_ = "";
  /**
   * <pre>
   * (Required) Python version being used in the client.
   * </pre>
   *
   * <code>string python_ver = 4;</code>
   * @return The pythonVer.
   */
  @java.lang.Override
  public java.lang.String getPythonVer() {
    java.lang.Object ref = pythonVer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pythonVer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required) Python version being used in the client.
   * </pre>
   *
   * <code>string python_ver = 4;</code>
   * @return The bytes for pythonVer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPythonVerBytes() {
    java.lang.Object ref = pythonVer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pythonVer_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getReturnType());
    }
    if (evalType_ != 0) {
      output.writeInt32(2, evalType_);
    }
    if (!command_.isEmpty()) {
      output.writeBytes(3, command_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pythonVer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, pythonVer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReturnType());
    }
    if (evalType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, evalType_);
    }
    if (!command_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, command_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pythonVer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, pythonVer_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.PythonUDTF)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.PythonUDTF other = (org.apache.spark.connect.proto.PythonUDTF) obj;

    if (hasReturnType() != other.hasReturnType()) return false;
    if (hasReturnType()) {
      if (!getReturnType()
          .equals(other.getReturnType())) return false;
    }
    if (getEvalType()
        != other.getEvalType()) return false;
    if (!getCommand()
        .equals(other.getCommand())) return false;
    if (!getPythonVer()
        .equals(other.getPythonVer())) return false;
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
    if (hasReturnType()) {
      hash = (37 * hash) + RETURN_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getReturnType().hashCode();
    }
    hash = (37 * hash) + EVAL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getEvalType();
    hash = (37 * hash) + COMMAND_FIELD_NUMBER;
    hash = (53 * hash) + getCommand().hashCode();
    hash = (37 * hash) + PYTHON_VER_FIELD_NUMBER;
    hash = (53 * hash) + getPythonVer().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.PythonUDTF parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.PythonUDTF parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.PythonUDTF parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.PythonUDTF prototype) {
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
   * Protobuf type {@code spark.connect.PythonUDTF}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.PythonUDTF)
      org.apache.spark.connect.proto.PythonUDTFOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_PythonUDTF_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_PythonUDTF_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.PythonUDTF.class, org.apache.spark.connect.proto.PythonUDTF.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.PythonUDTF.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getReturnTypeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      returnType_ = null;
      if (returnTypeBuilder_ != null) {
        returnTypeBuilder_.dispose();
        returnTypeBuilder_ = null;
      }
      evalType_ = 0;
      command_ = com.google.protobuf.ByteString.EMPTY;
      pythonVer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Relations.internal_static_spark_connect_PythonUDTF_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.PythonUDTF getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.PythonUDTF.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.PythonUDTF build() {
      org.apache.spark.connect.proto.PythonUDTF result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.PythonUDTF buildPartial() {
      org.apache.spark.connect.proto.PythonUDTF result = new org.apache.spark.connect.proto.PythonUDTF(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.PythonUDTF result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.returnType_ = returnTypeBuilder_ == null
            ? returnType_
            : returnTypeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.evalType_ = evalType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.command_ = command_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.pythonVer_ = pythonVer_;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof org.apache.spark.connect.proto.PythonUDTF) {
        return mergeFrom((org.apache.spark.connect.proto.PythonUDTF)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.PythonUDTF other) {
      if (other == org.apache.spark.connect.proto.PythonUDTF.getDefaultInstance()) return this;
      if (other.hasReturnType()) {
        mergeReturnType(other.getReturnType());
      }
      if (other.getEvalType() != 0) {
        setEvalType(other.getEvalType());
      }
      if (other.getCommand() != com.google.protobuf.ByteString.EMPTY) {
        setCommand(other.getCommand());
      }
      if (!other.getPythonVer().isEmpty()) {
        pythonVer_ = other.pythonVer_;
        bitField0_ |= 0x00000008;
        onChanged();
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
                  getReturnTypeFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              evalType_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              command_ = input.readBytes();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              pythonVer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private org.apache.spark.connect.proto.DataType returnType_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.DataType, org.apache.spark.connect.proto.DataType.Builder, org.apache.spark.connect.proto.DataTypeOrBuilder> returnTypeBuilder_;
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     * @return Whether the returnType field is set.
     */
    public boolean hasReturnType() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     * @return The returnType.
     */
    public org.apache.spark.connect.proto.DataType getReturnType() {
      if (returnTypeBuilder_ == null) {
        return returnType_ == null ? org.apache.spark.connect.proto.DataType.getDefaultInstance() : returnType_;
      } else {
        return returnTypeBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    public Builder setReturnType(org.apache.spark.connect.proto.DataType value) {
      if (returnTypeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        returnType_ = value;
      } else {
        returnTypeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    public Builder setReturnType(
        org.apache.spark.connect.proto.DataType.Builder builderForValue) {
      if (returnTypeBuilder_ == null) {
        returnType_ = builderForValue.build();
      } else {
        returnTypeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    public Builder mergeReturnType(org.apache.spark.connect.proto.DataType value) {
      if (returnTypeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          returnType_ != null &&
          returnType_ != org.apache.spark.connect.proto.DataType.getDefaultInstance()) {
          getReturnTypeBuilder().mergeFrom(value);
        } else {
          returnType_ = value;
        }
      } else {
        returnTypeBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    public Builder clearReturnType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      returnType_ = null;
      if (returnTypeBuilder_ != null) {
        returnTypeBuilder_.dispose();
        returnTypeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    public org.apache.spark.connect.proto.DataType.Builder getReturnTypeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReturnTypeFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    public org.apache.spark.connect.proto.DataTypeOrBuilder getReturnTypeOrBuilder() {
      if (returnTypeBuilder_ != null) {
        return returnTypeBuilder_.getMessageOrBuilder();
      } else {
        return returnType_ == null ?
            org.apache.spark.connect.proto.DataType.getDefaultInstance() : returnType_;
      }
    }
    /**
     * <pre>
     * (Optional) Return type of the Python UDTF.
     * </pre>
     *
     * <code>optional .spark.connect.DataType return_type = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.DataType, org.apache.spark.connect.proto.DataType.Builder, org.apache.spark.connect.proto.DataTypeOrBuilder> 
        getReturnTypeFieldBuilder() {
      if (returnTypeBuilder_ == null) {
        returnTypeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.DataType, org.apache.spark.connect.proto.DataType.Builder, org.apache.spark.connect.proto.DataTypeOrBuilder>(
                getReturnType(),
                getParentForChildren(),
                isClean());
        returnType_ = null;
      }
      return returnTypeBuilder_;
    }

    private int evalType_ ;
    /**
     * <pre>
     * (Required) EvalType of the Python UDTF.
     * </pre>
     *
     * <code>int32 eval_type = 2;</code>
     * @return The evalType.
     */
    @java.lang.Override
    public int getEvalType() {
      return evalType_;
    }
    /**
     * <pre>
     * (Required) EvalType of the Python UDTF.
     * </pre>
     *
     * <code>int32 eval_type = 2;</code>
     * @param value The evalType to set.
     * @return This builder for chaining.
     */
    public Builder setEvalType(int value) {

      evalType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) EvalType of the Python UDTF.
     * </pre>
     *
     * <code>int32 eval_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEvalType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      evalType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString command_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * (Required) The encoded commands of the Python UDTF.
     * </pre>
     *
     * <code>bytes command = 3;</code>
     * @return The command.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCommand() {
      return command_;
    }
    /**
     * <pre>
     * (Required) The encoded commands of the Python UDTF.
     * </pre>
     *
     * <code>bytes command = 3;</code>
     * @param value The command to set.
     * @return This builder for chaining.
     */
    public Builder setCommand(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      command_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) The encoded commands of the Python UDTF.
     * </pre>
     *
     * <code>bytes command = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCommand() {
      bitField0_ = (bitField0_ & ~0x00000004);
      command_ = getDefaultInstance().getCommand();
      onChanged();
      return this;
    }

    private java.lang.Object pythonVer_ = "";
    /**
     * <pre>
     * (Required) Python version being used in the client.
     * </pre>
     *
     * <code>string python_ver = 4;</code>
     * @return The pythonVer.
     */
    public java.lang.String getPythonVer() {
      java.lang.Object ref = pythonVer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pythonVer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required) Python version being used in the client.
     * </pre>
     *
     * <code>string python_ver = 4;</code>
     * @return The bytes for pythonVer.
     */
    public com.google.protobuf.ByteString
        getPythonVerBytes() {
      java.lang.Object ref = pythonVer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pythonVer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required) Python version being used in the client.
     * </pre>
     *
     * <code>string python_ver = 4;</code>
     * @param value The pythonVer to set.
     * @return This builder for chaining.
     */
    public Builder setPythonVer(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pythonVer_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Python version being used in the client.
     * </pre>
     *
     * <code>string python_ver = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPythonVer() {
      pythonVer_ = getDefaultInstance().getPythonVer();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required) Python version being used in the client.
     * </pre>
     *
     * <code>string python_ver = 4;</code>
     * @param value The bytes for pythonVer to set.
     * @return This builder for chaining.
     */
    public Builder setPythonVerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pythonVer_ = value;
      bitField0_ |= 0x00000008;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.PythonUDTF)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.PythonUDTF)
  private static final org.apache.spark.connect.proto.PythonUDTF DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.PythonUDTF();
  }

  public static org.apache.spark.connect.proto.PythonUDTF getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PythonUDTF>
      PARSER = new com.google.protobuf.AbstractParser<PythonUDTF>() {
    @java.lang.Override
    public PythonUDTF parsePartialFrom(
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

  public static com.google.protobuf.Parser<PythonUDTF> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PythonUDTF> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.PythonUDTF getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

