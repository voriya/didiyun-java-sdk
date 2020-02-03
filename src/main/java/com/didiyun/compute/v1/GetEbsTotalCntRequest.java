// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/ebs.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.GetEbsTotalCntRequest}
 */
public  final class GetEbsTotalCntRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.GetEbsTotalCntRequest)
    GetEbsTotalCntRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetEbsTotalCntRequest.newBuilder() to construct.
  private GetEbsTotalCntRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetEbsTotalCntRequest() {
    dc2Uuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetEbsTotalCntRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GetEbsTotalCntRequest(
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
            com.didiyun.base.v1.Header.Builder subBuilder = null;
            if (header_ != null) {
              subBuilder = header_.toBuilder();
            }
            header_ = input.readMessage(com.didiyun.base.v1.Header.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(header_);
              header_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dc2Uuids_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            dc2Uuids_.add(s);
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
        dc2Uuids_ = dc2Uuids_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.GetEbsTotalCntRequest.class, com.didiyun.compute.v1.GetEbsTotalCntRequest.Builder.class);
  }

  public static final int HEADER_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Header header_;
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  public boolean hasHeader() {
    return header_ != null;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   * @return The header.
   */
  public com.didiyun.base.v1.Header getHeader() {
    return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
  }
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
    return getHeader();
  }

  public static final int DC2UUIDS_FIELD_NUMBER = 2;
  private com.google.protobuf.LazyStringList dc2Uuids_;
  /**
   * <pre>
   *DC2唯一标识
   * </pre>
   *
   * <code>repeated string dc2Uuids = 2;</code>
   * @return A list containing the dc2Uuids.
   */
  public com.google.protobuf.ProtocolStringList
      getDc2UuidsList() {
    return dc2Uuids_;
  }
  /**
   * <pre>
   *DC2唯一标识
   * </pre>
   *
   * <code>repeated string dc2Uuids = 2;</code>
   * @return The count of dc2Uuids.
   */
  public int getDc2UuidsCount() {
    return dc2Uuids_.size();
  }
  /**
   * <pre>
   *DC2唯一标识
   * </pre>
   *
   * <code>repeated string dc2Uuids = 2;</code>
   * @param index The index of the element to return.
   * @return The dc2Uuids at the given index.
   */
  public java.lang.String getDc2Uuids(int index) {
    return dc2Uuids_.get(index);
  }
  /**
   * <pre>
   *DC2唯一标识
   * </pre>
   *
   * <code>repeated string dc2Uuids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dc2Uuids at the given index.
   */
  public com.google.protobuf.ByteString
      getDc2UuidsBytes(int index) {
    return dc2Uuids_.getByteString(index);
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
    if (header_ != null) {
      output.writeMessage(1, getHeader());
    }
    for (int i = 0; i < dc2Uuids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, dc2Uuids_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (header_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getHeader());
    }
    {
      int dataSize = 0;
      for (int i = 0; i < dc2Uuids_.size(); i++) {
        dataSize += computeStringSizeNoTag(dc2Uuids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getDc2UuidsList().size();
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
    if (!(obj instanceof com.didiyun.compute.v1.GetEbsTotalCntRequest)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.GetEbsTotalCntRequest other = (com.didiyun.compute.v1.GetEbsTotalCntRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getDc2UuidsList()
        .equals(other.getDc2UuidsList())) return false;
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
    if (hasHeader()) {
      hash = (37 * hash) + HEADER_FIELD_NUMBER;
      hash = (53 * hash) + getHeader().hashCode();
    }
    if (getDc2UuidsCount() > 0) {
      hash = (37 * hash) + DC2UUIDS_FIELD_NUMBER;
      hash = (53 * hash) + getDc2UuidsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.GetEbsTotalCntRequest parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.GetEbsTotalCntRequest prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.GetEbsTotalCntRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.GetEbsTotalCntRequest)
      com.didiyun.compute.v1.GetEbsTotalCntRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.GetEbsTotalCntRequest.class, com.didiyun.compute.v1.GetEbsTotalCntRequest.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.GetEbsTotalCntRequest.newBuilder()
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
      if (headerBuilder_ == null) {
        header_ = null;
      } else {
        header_ = null;
        headerBuilder_ = null;
      }
      dc2Uuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.EbsOuterClass.internal_static_didi_cloud_compute_v1_GetEbsTotalCntRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEbsTotalCntRequest getDefaultInstanceForType() {
      return com.didiyun.compute.v1.GetEbsTotalCntRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEbsTotalCntRequest build() {
      com.didiyun.compute.v1.GetEbsTotalCntRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.GetEbsTotalCntRequest buildPartial() {
      com.didiyun.compute.v1.GetEbsTotalCntRequest result = new com.didiyun.compute.v1.GetEbsTotalCntRequest(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      if (((bitField0_ & 0x00000001) != 0)) {
        dc2Uuids_ = dc2Uuids_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.dc2Uuids_ = dc2Uuids_;
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
      if (other instanceof com.didiyun.compute.v1.GetEbsTotalCntRequest) {
        return mergeFrom((com.didiyun.compute.v1.GetEbsTotalCntRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.GetEbsTotalCntRequest other) {
      if (other == com.didiyun.compute.v1.GetEbsTotalCntRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.dc2Uuids_.isEmpty()) {
        if (dc2Uuids_.isEmpty()) {
          dc2Uuids_ = other.dc2Uuids_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureDc2UuidsIsMutable();
          dc2Uuids_.addAll(other.dc2Uuids_);
        }
        onChanged();
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
      com.didiyun.compute.v1.GetEbsTotalCntRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.GetEbsTotalCntRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.didiyun.base.v1.Header header_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> headerBuilder_;
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     * @return Whether the header field is set.
     */
    public boolean hasHeader() {
      return headerBuilder_ != null || header_ != null;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     * @return The header.
     */
    public com.didiyun.base.v1.Header getHeader() {
      if (headerBuilder_ == null) {
        return header_ == null ? com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      } else {
        return headerBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        header_ = value;
        onChanged();
      } else {
        headerBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder setHeader(
        com.didiyun.base.v1.Header.Builder builderForValue) {
      if (headerBuilder_ == null) {
        header_ = builderForValue.build();
        onChanged();
      } else {
        headerBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder mergeHeader(com.didiyun.base.v1.Header value) {
      if (headerBuilder_ == null) {
        if (header_ != null) {
          header_ =
            com.didiyun.base.v1.Header.newBuilder(header_).mergeFrom(value).buildPartial();
        } else {
          header_ = value;
        }
        onChanged();
      } else {
        headerBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public Builder clearHeader() {
      if (headerBuilder_ == null) {
        header_ = null;
        onChanged();
      } else {
        header_ = null;
        headerBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.Header.Builder getHeaderBuilder() {
      
      onChanged();
      return getHeaderFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    public com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder() {
      if (headerBuilder_ != null) {
        return headerBuilder_.getMessageOrBuilder();
      } else {
        return header_ == null ?
            com.didiyun.base.v1.Header.getDefaultInstance() : header_;
      }
    }
    /**
     * <pre>
     *公共的请求头
     * </pre>
     *
     * <code>.didi.cloud.base.v1.Header header = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder> 
        getHeaderFieldBuilder() {
      if (headerBuilder_ == null) {
        headerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Header, com.didiyun.base.v1.Header.Builder, com.didiyun.base.v1.HeaderOrBuilder>(
                getHeader(),
                getParentForChildren(),
                isClean());
        header_ = null;
      }
      return headerBuilder_;
    }

    private com.google.protobuf.LazyStringList dc2Uuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureDc2UuidsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dc2Uuids_ = new com.google.protobuf.LazyStringArrayList(dc2Uuids_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @return A list containing the dc2Uuids.
     */
    public com.google.protobuf.ProtocolStringList
        getDc2UuidsList() {
      return dc2Uuids_.getUnmodifiableView();
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @return The count of dc2Uuids.
     */
    public int getDc2UuidsCount() {
      return dc2Uuids_.size();
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @param index The index of the element to return.
     * @return The dc2Uuids at the given index.
     */
    public java.lang.String getDc2Uuids(int index) {
      return dc2Uuids_.get(index);
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @param index The index of the value to return.
     * @return The bytes of the dc2Uuids at the given index.
     */
    public com.google.protobuf.ByteString
        getDc2UuidsBytes(int index) {
      return dc2Uuids_.getByteString(index);
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @param index The index to set the value at.
     * @param value The dc2Uuids to set.
     * @return This builder for chaining.
     */
    public Builder setDc2Uuids(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDc2UuidsIsMutable();
      dc2Uuids_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @param value The dc2Uuids to add.
     * @return This builder for chaining.
     */
    public Builder addDc2Uuids(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureDc2UuidsIsMutable();
      dc2Uuids_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @param values The dc2Uuids to add.
     * @return This builder for chaining.
     */
    public Builder addAllDc2Uuids(
        java.lang.Iterable<java.lang.String> values) {
      ensureDc2UuidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, dc2Uuids_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDc2Uuids() {
      dc2Uuids_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     *DC2唯一标识
     * </pre>
     *
     * <code>repeated string dc2Uuids = 2;</code>
     * @param value The bytes of the dc2Uuids to add.
     * @return This builder for chaining.
     */
    public Builder addDc2UuidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureDc2UuidsIsMutable();
      dc2Uuids_.add(value);
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.GetEbsTotalCntRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.GetEbsTotalCntRequest)
  private static final com.didiyun.compute.v1.GetEbsTotalCntRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.GetEbsTotalCntRequest();
  }

  public static com.didiyun.compute.v1.GetEbsTotalCntRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetEbsTotalCntRequest>
      PARSER = new com.google.protobuf.AbstractParser<GetEbsTotalCntRequest>() {
    @java.lang.Override
    public GetEbsTotalCntRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GetEbsTotalCntRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GetEbsTotalCntRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetEbsTotalCntRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.GetEbsTotalCntRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

