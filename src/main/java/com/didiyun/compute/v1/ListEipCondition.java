// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.ListEipCondition}
 */
public  final class ListEipCondition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.ListEipCondition)
    ListEipConditionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListEipCondition.newBuilder() to construct.
  private ListEipCondition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListEipCondition() {
    eip_ = "";
    eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    dc2Uuid_ = "";
    dc2Name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListEipCondition();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListEipCondition(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            eip_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              eipUuids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            eipUuids_.add(s);
            break;
          }
          case 24: {

            eipNotAttached_ = input.readBool();
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            dc2Uuid_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            dc2Name_ = s;
            break;
          }
          case 48: {

            bandwidth_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        eipUuids_ = eipUuids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_ListEipCondition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_ListEipCondition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.ListEipCondition.class, com.didiyun.compute.v1.ListEipCondition.Builder.class);
  }

  public static final int EIP_FIELD_NUMBER = 1;
  private volatile java.lang.Object eip_;
  /**
   * <pre>
   *精确匹配EIP
   * </pre>
   *
   * <code>string eip = 1;</code>
   * @return The eip.
   */
  public java.lang.String getEip() {
    java.lang.Object ref = eip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eip_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *精确匹配EIP
   * </pre>
   *
   * <code>string eip = 1;</code>
   * @return The bytes for eip.
   */
  public com.google.protobuf.ByteString
      getEipBytes() {
    java.lang.Object ref = eip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EIPUUIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList eipUuids_;
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 2;</code>
   * @return A list containing the eipUuids.
   */
  public com.google.protobuf.ProtocolStringList
      getEipUuidsList() {
    return eipUuids_;
  }
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 2;</code>
   * @return The count of eipUuids.
   */
  public int getEipUuidsCount() {
    return eipUuids_.size();
  }
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 2;</code>
   * @param index The index of the element to return.
   * @return The eipUuids at the given index.
   */
  public java.lang.String getEipUuids(int index) {
    return eipUuids_.get(index);
  }
  /**
   * <pre>
   *查询指定EIP的信息,UUID
   * </pre>
   *
   * <code>repeated string eipUuids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the eipUuids at the given index.
   */
  public com.google.protobuf.ByteString
      getEipUuidsBytes(int index) {
    return eipUuids_.getByteString(index);
  }

  public static final int EIPNOTATTACHED_FIELD_NUMBER = 3;
  private boolean eipNotAttached_;
  /**
   * <pre>
   *查询未绑定的eip
   * </pre>
   *
   * <code>bool eipNotAttached = 3;</code>
   * @return The eipNotAttached.
   */
  public boolean getEipNotAttached() {
    return eipNotAttached_;
  }

  public static final int DC2UUID_FIELD_NUMBER = 4;
  private volatile java.lang.Object dc2Uuid_;
  /**
   * <pre>
   *根据dc2Uuid查询
   * </pre>
   *
   * <code>string dc2Uuid = 4;</code>
   * @return The dc2Uuid.
   */
  public java.lang.String getDc2Uuid() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dc2Uuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *根据dc2Uuid查询
   * </pre>
   *
   * <code>string dc2Uuid = 4;</code>
   * @return The bytes for dc2Uuid.
   */
  public com.google.protobuf.ByteString
      getDc2UuidBytes() {
    java.lang.Object ref = dc2Uuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dc2Uuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DC2NAME_FIELD_NUMBER = 5;
  private volatile java.lang.Object dc2Name_;
  /**
   * <pre>
   *根据dc2名称查询
   * </pre>
   *
   * <code>string dc2Name = 5;</code>
   * @return The dc2Name.
   */
  public java.lang.String getDc2Name() {
    java.lang.Object ref = dc2Name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dc2Name_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *根据dc2名称查询
   * </pre>
   *
   * <code>string dc2Name = 5;</code>
   * @return The bytes for dc2Name.
   */
  public com.google.protobuf.ByteString
      getDc2NameBytes() {
    java.lang.Object ref = dc2Name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dc2Name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BANDWIDTH_FIELD_NUMBER = 6;
  private int bandwidth_;
  /**
   * <pre>
   *根据出向带宽查询
   * </pre>
   *
   * <code>int32 bandwidth = 6;</code>
   * @return The bandwidth.
   */
  public int getBandwidth() {
    return bandwidth_;
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
    if (!getEipBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eip_);
    }
    for (int i = 0; i < eipUuids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, eipUuids_.getRaw(i));
    }
    if (eipNotAttached_ != false) {
      output.writeBool(3, eipNotAttached_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, dc2Uuid_);
    }
    if (!getDc2NameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, dc2Name_);
    }
    if (bandwidth_ != 0) {
      output.writeInt32(6, bandwidth_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getEipBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eip_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < eipUuids_.size(); i++) {
        dataSize += computeStringSizeNoTag(eipUuids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getEipUuidsList().size();
    }
    if (eipNotAttached_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, eipNotAttached_);
    }
    if (!getDc2UuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, dc2Uuid_);
    }
    if (!getDc2NameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, dc2Name_);
    }
    if (bandwidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(6, bandwidth_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.didiyun.compute.v1.ListEipCondition)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.ListEipCondition other = (com.didiyun.compute.v1.ListEipCondition) obj;

    if (!getEip()
        .equals(other.getEip())) return false;
    if (!getEipUuidsList()
        .equals(other.getEipUuidsList())) return false;
    if (getEipNotAttached()
        != other.getEipNotAttached()) return false;
    if (!getDc2Uuid()
        .equals(other.getDc2Uuid())) return false;
    if (!getDc2Name()
        .equals(other.getDc2Name())) return false;
    if (getBandwidth()
        != other.getBandwidth()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + EIP_FIELD_NUMBER;
    hash = (53 * hash) + getEip().hashCode();
    if (getEipUuidsCount() > 0) {
      hash = (37 * hash) + EIPUUIDS_FIELD_NUMBER;
      hash = (53 * hash) + getEipUuidsList().hashCode();
    }
    hash = (37 * hash) + EIPNOTATTACHED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEipNotAttached());
    hash = (37 * hash) + DC2UUID_FIELD_NUMBER;
    hash = (53 * hash) + getDc2Uuid().hashCode();
    hash = (37 * hash) + DC2NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDc2Name().hashCode();
    hash = (37 * hash) + BANDWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getBandwidth();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListEipCondition parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.ListEipCondition prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.ListEipCondition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.ListEipCondition)
      com.didiyun.compute.v1.ListEipConditionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_ListEipCondition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_ListEipCondition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.ListEipCondition.class, com.didiyun.compute.v1.ListEipCondition.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.ListEipCondition.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      eip_ = "";

      eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      eipNotAttached_ = false;

      dc2Uuid_ = "";

      dc2Name_ = "";

      bandwidth_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_ListEipCondition_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListEipCondition getDefaultInstanceForType() {
      return com.didiyun.compute.v1.ListEipCondition.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListEipCondition build() {
      com.didiyun.compute.v1.ListEipCondition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListEipCondition buildPartial() {
      com.didiyun.compute.v1.ListEipCondition result = new com.didiyun.compute.v1.ListEipCondition(this);
      int from_bitField0_ = bitField0_;
      result.eip_ = eip_;
      if (((bitField0_ & 0x00000001) != 0)) {
        eipUuids_ = eipUuids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.eipUuids_ = eipUuids_;
      result.eipNotAttached_ = eipNotAttached_;
      result.dc2Uuid_ = dc2Uuid_;
      result.dc2Name_ = dc2Name_;
      result.bandwidth_ = bandwidth_;
      onBuilt();
      return result;
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
      if (other instanceof com.didiyun.compute.v1.ListEipCondition) {
        return mergeFrom((com.didiyun.compute.v1.ListEipCondition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.ListEipCondition other) {
      if (other == com.didiyun.compute.v1.ListEipCondition.getDefaultInstance()) return this;
      if (!other.getEip().isEmpty()) {
        eip_ = other.eip_;
        onChanged();
      }
      if (!other.eipUuids_.isEmpty()) {
        if (eipUuids_.isEmpty()) {
          eipUuids_ = other.eipUuids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureEipUuidsIsMutable();
          eipUuids_.addAll(other.eipUuids_);
        }
        onChanged();
      }
      if (other.getEipNotAttached() != false) {
        setEipNotAttached(other.getEipNotAttached());
      }
      if (!other.getDc2Uuid().isEmpty()) {
        dc2Uuid_ = other.dc2Uuid_;
        onChanged();
      }
      if (!other.getDc2Name().isEmpty()) {
        dc2Name_ = other.dc2Name_;
        onChanged();
      }
      if (other.getBandwidth() != 0) {
        setBandwidth(other.getBandwidth());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.didiyun.compute.v1.ListEipCondition parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.ListEipCondition) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.lang.Object eip_ = "";
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 1;</code>
     * @return The eip.
     */
    public java.lang.String getEip() {
      java.lang.Object ref = eip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 1;</code>
     * @return The bytes for eip.
     */
    public com.google.protobuf.ByteString
        getEipBytes() {
      java.lang.Object ref = eip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 1;</code>
     * @param value The eip to set.
     * @return This builder for chaining.
     */
    public Builder setEip(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eip_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEip() {
      
      eip_ = getDefaultInstance().getEip();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *精确匹配EIP
     * </pre>
     *
     * <code>string eip = 1;</code>
     * @param value The bytes for eip to set.
     * @return This builder for chaining.
     */
    public Builder setEipBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eip_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringList eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureEipUuidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        eipUuids_ = new com.google.protobuf.LazyStringArrayList(eipUuids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @return A list containing the eipUuids.
     */
    public com.google.protobuf.ProtocolStringList
        getEipUuidsList() {
      return eipUuids_.getUnmodifiableView();
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @return The count of eipUuids.
     */
    public int getEipUuidsCount() {
      return eipUuids_.size();
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @param index The index of the element to return.
     * @return The eipUuids at the given index.
     */
    public java.lang.String getEipUuids(int index) {
      return eipUuids_.get(index);
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the eipUuids at the given index.
     */
    public com.google.protobuf.ByteString
        getEipUuidsBytes(int index) {
      return eipUuids_.getByteString(index);
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @param index The index to set the value at.
     * @param value The eipUuids to set.
     * @return This builder for chaining.
     */
    public Builder setEipUuids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEipUuidsIsMutable();
      eipUuids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @param value The eipUuids to add.
     * @return This builder for chaining.
     */
    public Builder addEipUuids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureEipUuidsIsMutable();
      eipUuids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @param values The eipUuids to add.
     * @return This builder for chaining.
     */
    public Builder addAllEipUuids(
        java.lang.Iterable<java.lang.String> values) {
      ensureEipUuidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, eipUuids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEipUuids() {
      eipUuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询指定EIP的信息,UUID
     * </pre>
     *
     * <code>repeated string eipUuids = 2;</code>
     * @param value The bytes of the eipUuids to add.
     * @return This builder for chaining.
     */
    public Builder addEipUuidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureEipUuidsIsMutable();
      eipUuids_.add(value);
      onChanged();
      return this;
    }

    private boolean eipNotAttached_ ;
    /**
     * <pre>
     *查询未绑定的eip
     * </pre>
     *
     * <code>bool eipNotAttached = 3;</code>
     * @return The eipNotAttached.
     */
    public boolean getEipNotAttached() {
      return eipNotAttached_;
    }
    /**
     * <pre>
     *查询未绑定的eip
     * </pre>
     *
     * <code>bool eipNotAttached = 3;</code>
     * @param value The eipNotAttached to set.
     * @return This builder for chaining.
     */
    public Builder setEipNotAttached(boolean value) {
      
      eipNotAttached_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *查询未绑定的eip
     * </pre>
     *
     * <code>bool eipNotAttached = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearEipNotAttached() {
      
      eipNotAttached_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object dc2Uuid_ = "";
    /**
     * <pre>
     *根据dc2Uuid查询
     * </pre>
     *
     * <code>string dc2Uuid = 4;</code>
     * @return The dc2Uuid.
     */
    public java.lang.String getDc2Uuid() {
      java.lang.Object ref = dc2Uuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dc2Uuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *根据dc2Uuid查询
     * </pre>
     *
     * <code>string dc2Uuid = 4;</code>
     * @return The bytes for dc2Uuid.
     */
    public com.google.protobuf.ByteString
        getDc2UuidBytes() {
      java.lang.Object ref = dc2Uuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dc2Uuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *根据dc2Uuid查询
     * </pre>
     *
     * <code>string dc2Uuid = 4;</code>
     * @param value The dc2Uuid to set.
     * @return This builder for chaining.
     */
    public Builder setDc2Uuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dc2Uuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *根据dc2Uuid查询
     * </pre>
     *
     * <code>string dc2Uuid = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDc2Uuid() {
      
      dc2Uuid_ = getDefaultInstance().getDc2Uuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *根据dc2Uuid查询
     * </pre>
     *
     * <code>string dc2Uuid = 4;</code>
     * @param value The bytes for dc2Uuid to set.
     * @return This builder for chaining.
     */
    public Builder setDc2UuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dc2Uuid_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dc2Name_ = "";
    /**
     * <pre>
     *根据dc2名称查询
     * </pre>
     *
     * <code>string dc2Name = 5;</code>
     * @return The dc2Name.
     */
    public java.lang.String getDc2Name() {
      java.lang.Object ref = dc2Name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dc2Name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *根据dc2名称查询
     * </pre>
     *
     * <code>string dc2Name = 5;</code>
     * @return The bytes for dc2Name.
     */
    public com.google.protobuf.ByteString
        getDc2NameBytes() {
      java.lang.Object ref = dc2Name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dc2Name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *根据dc2名称查询
     * </pre>
     *
     * <code>string dc2Name = 5;</code>
     * @param value The dc2Name to set.
     * @return This builder for chaining.
     */
    public Builder setDc2Name(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dc2Name_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *根据dc2名称查询
     * </pre>
     *
     * <code>string dc2Name = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDc2Name() {
      
      dc2Name_ = getDefaultInstance().getDc2Name();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *根据dc2名称查询
     * </pre>
     *
     * <code>string dc2Name = 5;</code>
     * @param value The bytes for dc2Name to set.
     * @return This builder for chaining.
     */
    public Builder setDc2NameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dc2Name_ = value;
      onChanged();
      return this;
    }

    private int bandwidth_ ;
    /**
     * <pre>
     *根据出向带宽查询
     * </pre>
     *
     * <code>int32 bandwidth = 6;</code>
     * @return The bandwidth.
     */
    public int getBandwidth() {
      return bandwidth_;
    }
    /**
     * <pre>
     *根据出向带宽查询
     * </pre>
     *
     * <code>int32 bandwidth = 6;</code>
     * @param value The bandwidth to set.
     * @return This builder for chaining.
     */
    public Builder setBandwidth(int value) {
      
      bandwidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *根据出向带宽查询
     * </pre>
     *
     * <code>int32 bandwidth = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBandwidth() {
      
      bandwidth_ = 0;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.ListEipCondition)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.ListEipCondition)
  private static final com.didiyun.compute.v1.ListEipCondition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.ListEipCondition();
  }

  public static com.didiyun.compute.v1.ListEipCondition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListEipCondition>
      PARSER = new com.google.protobuf.AbstractParser<ListEipCondition>() {
    @java.lang.Override
    public ListEipCondition parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListEipCondition(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListEipCondition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListEipCondition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.ListEipCondition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

