// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: spark/connect/catalog.proto

package org.apache.spark.connect.proto;

/**
 * <pre>
 * See `spark.catalog.uncacheTable`
 * </pre>
 *
 * Protobuf type {@code spark.connect.UncacheTable}
 */
public final class UncacheTable extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:spark.connect.UncacheTable)
    UncacheTableOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UncacheTable.newBuilder() to construct.
  private UncacheTable(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UncacheTable() {
    tableName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UncacheTable();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_UncacheTable_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_UncacheTable_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.apache.spark.connect.proto.UncacheTable.class, org.apache.spark.connect.proto.UncacheTable.Builder.class);
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object tableName_ = "";
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * (Required)
   * </pre>
   *
   * <code>string table_name = 1;</code>
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      tableName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, tableName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, tableName_);
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
    if (!(obj instanceof org.apache.spark.connect.proto.UncacheTable)) {
      return super.equals(obj);
    }
    org.apache.spark.connect.proto.UncacheTable other = (org.apache.spark.connect.proto.UncacheTable) obj;

    if (!getTableName()
        .equals(other.getTableName())) return false;
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
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.apache.spark.connect.proto.UncacheTable parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.apache.spark.connect.proto.UncacheTable parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.apache.spark.connect.proto.UncacheTable parseFrom(
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
  public static Builder newBuilder(org.apache.spark.connect.proto.UncacheTable prototype) {
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
   * See `spark.catalog.uncacheTable`
   * </pre>
   *
   * Protobuf type {@code spark.connect.UncacheTable}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:spark.connect.UncacheTable)
      org.apache.spark.connect.proto.UncacheTableOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_UncacheTable_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_UncacheTable_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.apache.spark.connect.proto.UncacheTable.class, org.apache.spark.connect.proto.UncacheTable.Builder.class);
    }

    // Construct using org.apache.spark.connect.proto.UncacheTable.newBuilder()
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
      tableName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.apache.spark.connect.proto.CatalogOuterClass.internal_static_spark_connect_UncacheTable_descriptor;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.UncacheTable getDefaultInstanceForType() {
      return org.apache.spark.connect.proto.UncacheTable.getDefaultInstance();
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.UncacheTable build() {
      org.apache.spark.connect.proto.UncacheTable result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.apache.spark.connect.proto.UncacheTable buildPartial() {
      org.apache.spark.connect.proto.UncacheTable result = new org.apache.spark.connect.proto.UncacheTable(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.apache.spark.connect.proto.UncacheTable result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.tableName_ = tableName_;
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
      if (other instanceof org.apache.spark.connect.proto.UncacheTable) {
        return mergeFrom((org.apache.spark.connect.proto.UncacheTable)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.apache.spark.connect.proto.UncacheTable other) {
      if (other == org.apache.spark.connect.proto.UncacheTable.getDefaultInstance()) return this;
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        bitField0_ |= 0x00000001;
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
              tableName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object tableName_ = "";
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString
        getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      tableName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTableName() {
      tableName_ = getDefaultInstance().getTableName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * (Required)
     * </pre>
     *
     * <code>string table_name = 1;</code>
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      tableName_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:spark.connect.UncacheTable)
  }

  // @@protoc_insertion_point(class_scope:spark.connect.UncacheTable)
  private static final org.apache.spark.connect.proto.UncacheTable DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.apache.spark.connect.proto.UncacheTable();
  }

  public static org.apache.spark.connect.proto.UncacheTable getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UncacheTable>
      PARSER = new com.google.protobuf.AbstractParser<UncacheTable>() {
    @java.lang.Override
    public UncacheTable parsePartialFrom(
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

  public static com.google.protobuf.Parser<UncacheTable> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UncacheTable> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.apache.spark.connect.proto.UncacheTable getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

