// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.CreateSgRuleRequest}
 */
public  final class CreateSgRuleRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.CreateSgRuleRequest)
    CreateSgRuleRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateSgRuleRequest.newBuilder() to construct.
  private CreateSgRuleRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateSgRuleRequest() {
    sgUuid_ = "";
    sgRule_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateSgRuleRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateSgRuleRequest(
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

            sgUuid_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              sgRule_ = new java.util.ArrayList<com.didiyun.compute.v1.CreateSgRuleInput>();
              mutable_bitField0_ |= 0x00000001;
            }
            sgRule_.add(
                input.readMessage(com.didiyun.compute.v1.CreateSgRuleInput.parser(), extensionRegistry));
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
        sgRule_ = java.util.Collections.unmodifiableList(sgRule_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_CreateSgRuleRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_CreateSgRuleRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.CreateSgRuleRequest.class, com.didiyun.compute.v1.CreateSgRuleRequest.Builder.class);
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

  public static final int SGUUID_FIELD_NUMBER = 2;
  private volatile java.lang.Object sgUuid_;
  /**
   * <pre>
   *待创建的SGRule所属的SG的uuid
   * </pre>
   *
   * <code>string sgUuid = 2;</code>
   * @return The sgUuid.
   */
  public java.lang.String getSgUuid() {
    java.lang.Object ref = sgUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sgUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *待创建的SGRule所属的SG的uuid
   * </pre>
   *
   * <code>string sgUuid = 2;</code>
   * @return The bytes for sgUuid.
   */
  public com.google.protobuf.ByteString
      getSgUuidBytes() {
    java.lang.Object ref = sgUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sgUuid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SGRULE_FIELD_NUMBER = 3;
  private java.util.List<com.didiyun.compute.v1.CreateSgRuleInput> sgRule_;
  /**
   * <pre>
   *创建的SGRule信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
   */
  public java.util.List<com.didiyun.compute.v1.CreateSgRuleInput> getSgRuleList() {
    return sgRule_;
  }
  /**
   * <pre>
   *创建的SGRule信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
   */
  public java.util.List<? extends com.didiyun.compute.v1.CreateSgRuleInputOrBuilder> 
      getSgRuleOrBuilderList() {
    return sgRule_;
  }
  /**
   * <pre>
   *创建的SGRule信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
   */
  public int getSgRuleCount() {
    return sgRule_.size();
  }
  /**
   * <pre>
   *创建的SGRule信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
   */
  public com.didiyun.compute.v1.CreateSgRuleInput getSgRule(int index) {
    return sgRule_.get(index);
  }
  /**
   * <pre>
   *创建的SGRule信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
   */
  public com.didiyun.compute.v1.CreateSgRuleInputOrBuilder getSgRuleOrBuilder(
      int index) {
    return sgRule_.get(index);
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
    if (!getSgUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, sgUuid_);
    }
    for (int i = 0; i < sgRule_.size(); i++) {
      output.writeMessage(3, sgRule_.get(i));
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
    if (!getSgUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, sgUuid_);
    }
    for (int i = 0; i < sgRule_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, sgRule_.get(i));
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
    if (!(obj instanceof com.didiyun.compute.v1.CreateSgRuleRequest)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.CreateSgRuleRequest other = (com.didiyun.compute.v1.CreateSgRuleRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (!getSgUuid()
        .equals(other.getSgUuid())) return false;
    if (!getSgRuleList()
        .equals(other.getSgRuleList())) return false;
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
    hash = (37 * hash) + SGUUID_FIELD_NUMBER;
    hash = (53 * hash) + getSgUuid().hashCode();
    if (getSgRuleCount() > 0) {
      hash = (37 * hash) + SGRULE_FIELD_NUMBER;
      hash = (53 * hash) + getSgRuleList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.CreateSgRuleRequest parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.CreateSgRuleRequest prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.CreateSgRuleRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.CreateSgRuleRequest)
      com.didiyun.compute.v1.CreateSgRuleRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_CreateSgRuleRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_CreateSgRuleRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.CreateSgRuleRequest.class, com.didiyun.compute.v1.CreateSgRuleRequest.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.CreateSgRuleRequest.newBuilder()
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
        getSgRuleFieldBuilder();
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
      sgUuid_ = "";

      if (sgRuleBuilder_ == null) {
        sgRule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        sgRuleBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_CreateSgRuleRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.CreateSgRuleRequest getDefaultInstanceForType() {
      return com.didiyun.compute.v1.CreateSgRuleRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.CreateSgRuleRequest build() {
      com.didiyun.compute.v1.CreateSgRuleRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.CreateSgRuleRequest buildPartial() {
      com.didiyun.compute.v1.CreateSgRuleRequest result = new com.didiyun.compute.v1.CreateSgRuleRequest(this);
      int from_bitField0_ = bitField0_;
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.sgUuid_ = sgUuid_;
      if (sgRuleBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          sgRule_ = java.util.Collections.unmodifiableList(sgRule_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.sgRule_ = sgRule_;
      } else {
        result.sgRule_ = sgRuleBuilder_.build();
      }
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
      if (other instanceof com.didiyun.compute.v1.CreateSgRuleRequest) {
        return mergeFrom((com.didiyun.compute.v1.CreateSgRuleRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.CreateSgRuleRequest other) {
      if (other == com.didiyun.compute.v1.CreateSgRuleRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (!other.getSgUuid().isEmpty()) {
        sgUuid_ = other.sgUuid_;
        onChanged();
      }
      if (sgRuleBuilder_ == null) {
        if (!other.sgRule_.isEmpty()) {
          if (sgRule_.isEmpty()) {
            sgRule_ = other.sgRule_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSgRuleIsMutable();
            sgRule_.addAll(other.sgRule_);
          }
          onChanged();
        }
      } else {
        if (!other.sgRule_.isEmpty()) {
          if (sgRuleBuilder_.isEmpty()) {
            sgRuleBuilder_.dispose();
            sgRuleBuilder_ = null;
            sgRule_ = other.sgRule_;
            bitField0_ = (bitField0_ & ~0x00000001);
            sgRuleBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSgRuleFieldBuilder() : null;
          } else {
            sgRuleBuilder_.addAllMessages(other.sgRule_);
          }
        }
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
      com.didiyun.compute.v1.CreateSgRuleRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.CreateSgRuleRequest) e.getUnfinishedMessage();
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

    private java.lang.Object sgUuid_ = "";
    /**
     * <pre>
     *待创建的SGRule所属的SG的uuid
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     * @return The sgUuid.
     */
    public java.lang.String getSgUuid() {
      java.lang.Object ref = sgUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sgUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *待创建的SGRule所属的SG的uuid
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     * @return The bytes for sgUuid.
     */
    public com.google.protobuf.ByteString
        getSgUuidBytes() {
      java.lang.Object ref = sgUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sgUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *待创建的SGRule所属的SG的uuid
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     * @param value The sgUuid to set.
     * @return This builder for chaining.
     */
    public Builder setSgUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      sgUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *待创建的SGRule所属的SG的uuid
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearSgUuid() {
      
      sgUuid_ = getDefaultInstance().getSgUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *待创建的SGRule所属的SG的uuid
     * </pre>
     *
     * <code>string sgUuid = 2;</code>
     * @param value The bytes for sgUuid to set.
     * @return This builder for chaining.
     */
    public Builder setSgUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      sgUuid_ = value;
      onChanged();
      return this;
    }

    private java.util.List<com.didiyun.compute.v1.CreateSgRuleInput> sgRule_ =
      java.util.Collections.emptyList();
    private void ensureSgRuleIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        sgRule_ = new java.util.ArrayList<com.didiyun.compute.v1.CreateSgRuleInput>(sgRule_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.compute.v1.CreateSgRuleInput, com.didiyun.compute.v1.CreateSgRuleInput.Builder, com.didiyun.compute.v1.CreateSgRuleInputOrBuilder> sgRuleBuilder_;

    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public java.util.List<com.didiyun.compute.v1.CreateSgRuleInput> getSgRuleList() {
      if (sgRuleBuilder_ == null) {
        return java.util.Collections.unmodifiableList(sgRule_);
      } else {
        return sgRuleBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public int getSgRuleCount() {
      if (sgRuleBuilder_ == null) {
        return sgRule_.size();
      } else {
        return sgRuleBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public com.didiyun.compute.v1.CreateSgRuleInput getSgRule(int index) {
      if (sgRuleBuilder_ == null) {
        return sgRule_.get(index);
      } else {
        return sgRuleBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder setSgRule(
        int index, com.didiyun.compute.v1.CreateSgRuleInput value) {
      if (sgRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSgRuleIsMutable();
        sgRule_.set(index, value);
        onChanged();
      } else {
        sgRuleBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder setSgRule(
        int index, com.didiyun.compute.v1.CreateSgRuleInput.Builder builderForValue) {
      if (sgRuleBuilder_ == null) {
        ensureSgRuleIsMutable();
        sgRule_.set(index, builderForValue.build());
        onChanged();
      } else {
        sgRuleBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder addSgRule(com.didiyun.compute.v1.CreateSgRuleInput value) {
      if (sgRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSgRuleIsMutable();
        sgRule_.add(value);
        onChanged();
      } else {
        sgRuleBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder addSgRule(
        int index, com.didiyun.compute.v1.CreateSgRuleInput value) {
      if (sgRuleBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSgRuleIsMutable();
        sgRule_.add(index, value);
        onChanged();
      } else {
        sgRuleBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder addSgRule(
        com.didiyun.compute.v1.CreateSgRuleInput.Builder builderForValue) {
      if (sgRuleBuilder_ == null) {
        ensureSgRuleIsMutable();
        sgRule_.add(builderForValue.build());
        onChanged();
      } else {
        sgRuleBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder addSgRule(
        int index, com.didiyun.compute.v1.CreateSgRuleInput.Builder builderForValue) {
      if (sgRuleBuilder_ == null) {
        ensureSgRuleIsMutable();
        sgRule_.add(index, builderForValue.build());
        onChanged();
      } else {
        sgRuleBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder addAllSgRule(
        java.lang.Iterable<? extends com.didiyun.compute.v1.CreateSgRuleInput> values) {
      if (sgRuleBuilder_ == null) {
        ensureSgRuleIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, sgRule_);
        onChanged();
      } else {
        sgRuleBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder clearSgRule() {
      if (sgRuleBuilder_ == null) {
        sgRule_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        sgRuleBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public Builder removeSgRule(int index) {
      if (sgRuleBuilder_ == null) {
        ensureSgRuleIsMutable();
        sgRule_.remove(index);
        onChanged();
      } else {
        sgRuleBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public com.didiyun.compute.v1.CreateSgRuleInput.Builder getSgRuleBuilder(
        int index) {
      return getSgRuleFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public com.didiyun.compute.v1.CreateSgRuleInputOrBuilder getSgRuleOrBuilder(
        int index) {
      if (sgRuleBuilder_ == null) {
        return sgRule_.get(index);  } else {
        return sgRuleBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public java.util.List<? extends com.didiyun.compute.v1.CreateSgRuleInputOrBuilder> 
         getSgRuleOrBuilderList() {
      if (sgRuleBuilder_ != null) {
        return sgRuleBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(sgRule_);
      }
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public com.didiyun.compute.v1.CreateSgRuleInput.Builder addSgRuleBuilder() {
      return getSgRuleFieldBuilder().addBuilder(
          com.didiyun.compute.v1.CreateSgRuleInput.getDefaultInstance());
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public com.didiyun.compute.v1.CreateSgRuleInput.Builder addSgRuleBuilder(
        int index) {
      return getSgRuleFieldBuilder().addBuilder(
          index, com.didiyun.compute.v1.CreateSgRuleInput.getDefaultInstance());
    }
    /**
     * <pre>
     *创建的SGRule信息
     * </pre>
     *
     * <code>repeated .didi.cloud.compute.v1.CreateSgRuleInput sgRule = 3;</code>
     */
    public java.util.List<com.didiyun.compute.v1.CreateSgRuleInput.Builder> 
         getSgRuleBuilderList() {
      return getSgRuleFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.compute.v1.CreateSgRuleInput, com.didiyun.compute.v1.CreateSgRuleInput.Builder, com.didiyun.compute.v1.CreateSgRuleInputOrBuilder> 
        getSgRuleFieldBuilder() {
      if (sgRuleBuilder_ == null) {
        sgRuleBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.didiyun.compute.v1.CreateSgRuleInput, com.didiyun.compute.v1.CreateSgRuleInput.Builder, com.didiyun.compute.v1.CreateSgRuleInputOrBuilder>(
                sgRule_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        sgRule_ = null;
      }
      return sgRuleBuilder_;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.CreateSgRuleRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.CreateSgRuleRequest)
  private static final com.didiyun.compute.v1.CreateSgRuleRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.CreateSgRuleRequest();
  }

  public static com.didiyun.compute.v1.CreateSgRuleRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateSgRuleRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateSgRuleRequest>() {
    @java.lang.Override
    public CreateSgRuleRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateSgRuleRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateSgRuleRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateSgRuleRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.CreateSgRuleRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

