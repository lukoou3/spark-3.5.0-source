// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/base.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * A [[Plan]] is the structure that carries the runtime information for the execution from the
 * client to the server. A [[Plan]] can either be of the type [[Relation]] which is a reference
 * to the underlying logical plan or it can be of the [[Command]] type that is used to execute
 * commands on the server.
 * </pre>
 *
 * Protobuf type {@code spark.connect.Plan}
 */
public final class Plan extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.Plan)
    PlanOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Plan.newBuilder() to construct.
  private Plan(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Plan() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Plan();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.Base.internal_static_spark_connect_Plan_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.Base.internal_static_spark_connect_Plan_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.Plan.class, org.apache.spark.connect.proto.Plan.Builder.class);
  }

  private int opTypeCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object opType_;
  public enum OpTypeCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    ROOT(1),
    COMMAND(2),
    OPTYPE_NOT_SET(0);
    private final int value;
    private OpTypeCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OpTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static OpTypeCase forNumber(int value) {
      switch (value) {
        case 1: return ROOT;
        case 2: return COMMAND;
        case 0: return OPTYPE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OpTypeCase
  getOpTypeCase() {
    return OpTypeCase.forNumber(
        opTypeCase_);
  }

  public static final int ROOT_FIELD_NUMBER = 1;
  /**
   * <code>.spark.connect.Relation root = 1;</code>
   * @return Whether the root field is set.
   */
  @java.lang.Override
  public boolean hasRoot() {
    return opTypeCase_ == 1;
  }
  /**
   * <code>.spark.connect.Relation root = 1;</code>
   * @return The root.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Relation getRoot() {
    if (opTypeCase_ == 1) {
       return (org.apache.spark.connect.proto.Relation) opType_;
    }
    return org.apache.spark.connect.proto.Relation.getDefaultInstance();
  }
  /**
   * <code>.spark.connect.Relation root = 1;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.RelationOrBuilder getRootOrBuilder() {
    if (opTypeCase_ == 1) {
       return (org.apache.spark.connect.proto.Relation) opType_;
    }
    return org.apache.spark.connect.proto.Relation.getDefaultInstance();
  }

  public static final int COMMAND_FIELD_NUMBER = 2;
  /**
   * <code>.spark.connect.Command command = 2;</code>
   * @return Whether the command field is set.
   */
  @java.lang.Override
  public boolean hasCommand() {
    return opTypeCase_ == 2;
  }
  /**
   * <code>.spark.connect.Command command = 2;</code>
   * @return The command.
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.Command getCommand() {
    if (opTypeCase_ == 2) {
       return (org.apache.spark.connect.proto.Command) opType_;
    }
    return org.apache.spark.connect.proto.Command.getDefaultInstance();
  }
  /**
   * <code>.spark.connect.Command command = 2;</code>
   */
  @java.lang.Override
  public org.apache.spark.connect.proto.CommandOrBuilder getCommandOrBuilder() {
    if (opTypeCase_ == 2) {
       return (org.apache.spark.connect.proto.Command) opType_;
    }
    return org.apache.spark.connect.proto.Command.getDefaultInstance();
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
    if (opTypeCase_ == 1) {
      output.writeMessage(1, (org.apache.spark.connect.proto.Relation) opType_);
    }
    if (opTypeCase_ == 2) {
      output.writeMessage(2, (org.apache.spark.connect.proto.Command) opType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (opTypeCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.apache.spark.connect.proto.Relation) opType_);
    }
    if (opTypeCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.apache.spark.connect.proto.Command) opType_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.Plan)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.Plan other = (org.apache.spark.connect.proto.Plan) obj;

    if (!getOpTypeCase().equals(other.getOpTypeCase())) return false;
    switch (opTypeCase_) {
      case 1:
        if (!getRoot()
            .equals(other.getRoot())) return false;
        break;
      case 2:
        if (!getCommand()
            .equals(other.getCommand())) return false;
        break;
      case 0:
      default:
    }
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
    switch (opTypeCase_) {
      case 1:
        hash = (37 * hash) + ROOT_FIELD_NUMBER;
        hash = (53 * hash) + getRoot().hashCode();
        break;
      case 2:
        hash = (37 * hash) + COMMAND_FIELD_NUMBER;
        hash = (53 * hash) + getCommand().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.Plan parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.Plan parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.Plan parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.Plan parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.Plan prototype) {
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
   * A [[Plan]] is the structure that carries the runtime information for the execution from the
   * client to the server. A [[Plan]] can either be of the type [[Relation]] which is a reference
   * to the underlying logical plan or it can be of the [[Command]] type that is used to execute
   * commands on the server.
   * </pre>
   *
   * Protobuf type {@code spark.connect.Plan}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.Plan)
      org.apache.spark.connect.proto.PlanOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.Base.internal_static_spark_connect_Plan_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.Base.internal_static_spark_connect_Plan_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.Plan.class, org.apache.spark.connect.proto.Plan.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.Plan.newBuilder()
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
      if (rootBuilder_ != null) {
        rootBuilder_.clear();
      }
      if (commandBuilder_ != null) {
        commandBuilder_.clear();
      }
      opTypeCase_ = 0;
      opType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.Base.internal_static_spark_connect_Plan_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Plan getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.Plan.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Plan build() {
      org.apache.spark.connect.proto.Plan result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.Plan buildPartial() {
      org.apache.spark.connect.proto.Plan result = new org.apache.spark.connect.proto.Plan(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.Plan result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.apache.spark.connect.proto.Plan result) {
      result.opTypeCase_ = opTypeCase_;
      result.opType_ = this.opType_;
      if (opTypeCase_ == 1 &&
          rootBuilder_ != null) {
        result.opType_ = rootBuilder_.build();
      }
      if (opTypeCase_ == 2 &&
          commandBuilder_ != null) {
        result.opType_ = commandBuilder_.build();
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
      if (other instanceof org.apache.spark.connect.proto.Plan) {
        return mergeFrom((org.apache.spark.connect.proto.Plan)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.Plan other) {
      if (other == org.apache.spark.connect.proto.Plan.getDefaultInstance()) return this;
      switch (other.getOpTypeCase()) {
        case ROOT: {
          mergeRoot(other.getRoot());
          break;
        }
        case COMMAND: {
          mergeCommand(other.getCommand());
          break;
        }
        case OPTYPE_NOT_SET: {
          break;
        }
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
                  getRootFieldBuilder().getBuilder(),
                  extensionRegistry);
              opTypeCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getCommandFieldBuilder().getBuilder(),
                  extensionRegistry);
              opTypeCase_ = 2;
              break;
            } // case 18
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
    private int opTypeCase_ = 0;
    private java.lang.Object opType_;
    public OpTypeCase
        getOpTypeCase() {
      return OpTypeCase.forNumber(
          opTypeCase_);
    }

    public Builder clearOpType() {
      opTypeCase_ = 0;
      opType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> rootBuilder_;
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     * @return Whether the root field is set.
     */
    @java.lang.Override
    public boolean hasRoot() {
      return opTypeCase_ == 1;
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     * @return The root.
     */
    @java.lang.Override
    public org.apache.spark.connect.proto.Relation getRoot() {
      if (rootBuilder_ == null) {
        if (opTypeCase_ == 1) {
          return (org.apache.spark.connect.proto.Relation) opType_;
        }
        return org.apache.spark.connect.proto.Relation.getDefaultInstance();
      } else {
        if (opTypeCase_ == 1) {
          return rootBuilder_.getMessage();
        }
        return org.apache.spark.connect.proto.Relation.getDefaultInstance();
      }
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    public Builder setRoot(org.apache.spark.connect.proto.Relation value) {
      if (rootBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        opType_ = value;
        onChanged();
      } else {
        rootBuilder_.setMessage(value);
      }
      opTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    public Builder setRoot(
        org.apache.spark.connect.proto.Relation.Builder builderForValue) {
      if (rootBuilder_ == null) {
        opType_ = builderForValue.build();
        onChanged();
      } else {
        rootBuilder_.setMessage(builderForValue.build());
      }
      opTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    public Builder mergeRoot(org.apache.spark.connect.proto.Relation value) {
      if (rootBuilder_ == null) {
        if (opTypeCase_ == 1 &&
            opType_ != org.apache.spark.connect.proto.Relation.getDefaultInstance()) {
          opType_ = org.apache.spark.connect.proto.Relation.newBuilder((org.apache.spark.connect.proto.Relation) opType_)
              .mergeFrom(value).buildPartial();
        } else {
          opType_ = value;
        }
        onChanged();
      } else {
        if (opTypeCase_ == 1) {
          rootBuilder_.mergeFrom(value);
        } else {
          rootBuilder_.setMessage(value);
        }
      }
      opTypeCase_ = 1;
      return this;
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    public Builder clearRoot() {
      if (rootBuilder_ == null) {
        if (opTypeCase_ == 1) {
          opTypeCase_ = 0;
          opType_ = null;
          onChanged();
        }
      } else {
        if (opTypeCase_ == 1) {
          opTypeCase_ = 0;
          opType_ = null;
        }
        rootBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    public org.apache.spark.connect.proto.Relation.Builder getRootBuilder() {
      return getRootFieldBuilder().getBuilder();
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    @java.lang.Override
    public org.apache.spark.connect.proto.RelationOrBuilder getRootOrBuilder() {
      if ((opTypeCase_ == 1) && (rootBuilder_ != null)) {
        return rootBuilder_.getMessageOrBuilder();
      } else {
        if (opTypeCase_ == 1) {
          return (org.apache.spark.connect.proto.Relation) opType_;
        }
        return org.apache.spark.connect.proto.Relation.getDefaultInstance();
      }
    }
    /**
     * <code>.spark.connect.Relation root = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder> 
        getRootFieldBuilder() {
      if (rootBuilder_ == null) {
        if (!(opTypeCase_ == 1)) {
          opType_ = org.apache.spark.connect.proto.Relation.getDefaultInstance();
        }
        rootBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.Relation, org.apache.spark.connect.proto.Relation.Builder, org.apache.spark.connect.proto.RelationOrBuilder>(
                (org.apache.spark.connect.proto.Relation) opType_,
                getParentForChildren(),
                isClean());
        opType_ = null;
      }
      opTypeCase_ = 1;
      onChanged();
      return rootBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Command, org.apache.spark.connect.proto.Command.Builder, org.apache.spark.connect.proto.CommandOrBuilder> commandBuilder_;
    /**
     * <code>.spark.connect.Command command = 2;</code>
     * @return Whether the command field is set.
     */
    @java.lang.Override
    public boolean hasCommand() {
      return opTypeCase_ == 2;
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     * @return The command.
     */
    @java.lang.Override
    public org.apache.spark.connect.proto.Command getCommand() {
      if (commandBuilder_ == null) {
        if (opTypeCase_ == 2) {
          return (org.apache.spark.connect.proto.Command) opType_;
        }
        return org.apache.spark.connect.proto.Command.getDefaultInstance();
      } else {
        if (opTypeCase_ == 2) {
          return commandBuilder_.getMessage();
        }
        return org.apache.spark.connect.proto.Command.getDefaultInstance();
      }
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    public Builder setCommand(org.apache.spark.connect.proto.Command value) {
      if (commandBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        opType_ = value;
        onChanged();
      } else {
        commandBuilder_.setMessage(value);
      }
      opTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    public Builder setCommand(
        org.apache.spark.connect.proto.Command.Builder builderForValue) {
      if (commandBuilder_ == null) {
        opType_ = builderForValue.build();
        onChanged();
      } else {
        commandBuilder_.setMessage(builderForValue.build());
      }
      opTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    public Builder mergeCommand(org.apache.spark.connect.proto.Command value) {
      if (commandBuilder_ == null) {
        if (opTypeCase_ == 2 &&
            opType_ != org.apache.spark.connect.proto.Command.getDefaultInstance()) {
          opType_ = org.apache.spark.connect.proto.Command.newBuilder((org.apache.spark.connect.proto.Command) opType_)
              .mergeFrom(value).buildPartial();
        } else {
          opType_ = value;
        }
        onChanged();
      } else {
        if (opTypeCase_ == 2) {
          commandBuilder_.mergeFrom(value);
        } else {
          commandBuilder_.setMessage(value);
        }
      }
      opTypeCase_ = 2;
      return this;
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    public Builder clearCommand() {
      if (commandBuilder_ == null) {
        if (opTypeCase_ == 2) {
          opTypeCase_ = 0;
          opType_ = null;
          onChanged();
        }
      } else {
        if (opTypeCase_ == 2) {
          opTypeCase_ = 0;
          opType_ = null;
        }
        commandBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    public org.apache.spark.connect.proto.Command.Builder getCommandBuilder() {
      return getCommandFieldBuilder().getBuilder();
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    @java.lang.Override
    public org.apache.spark.connect.proto.CommandOrBuilder getCommandOrBuilder() {
      if ((opTypeCase_ == 2) && (commandBuilder_ != null)) {
        return commandBuilder_.getMessageOrBuilder();
      } else {
        if (opTypeCase_ == 2) {
          return (org.apache.spark.connect.proto.Command) opType_;
        }
        return org.apache.spark.connect.proto.Command.getDefaultInstance();
      }
    }
    /**
     * <code>.spark.connect.Command command = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.apache.spark.connect.proto.Command, org.apache.spark.connect.proto.Command.Builder, org.apache.spark.connect.proto.CommandOrBuilder> 
        getCommandFieldBuilder() {
      if (commandBuilder_ == null) {
        if (!(opTypeCase_ == 2)) {
          opType_ = org.apache.spark.connect.proto.Command.getDefaultInstance();
        }
        commandBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.apache.spark.connect.proto.Command, org.apache.spark.connect.proto.Command.Builder, org.apache.spark.connect.proto.CommandOrBuilder>(
                (org.apache.spark.connect.proto.Command) opType_,
                getParentForChildren(),
                isClean());
        opType_ = null;
      }
      opTypeCase_ = 2;
      onChanged();
      return commandBuilder_;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.Plan)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.Plan)
  private static final org.apache.spark.connect.proto.Plan DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.Plan();
  }

  public static org.apache.spark.connect.proto.Plan getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Plan>
      PARSER = new com.google.protobuf.AbstractParser<Plan>() {
    @java.lang.Override
    public Plan parsePartialFrom(
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

  public static com.google.protobuf.Parser<Plan> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Plan> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.Plan getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
