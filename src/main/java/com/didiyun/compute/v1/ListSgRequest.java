// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.ListSgRequest}
 */
public  final class ListSgRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.ListSgRequest)
    ListSgRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSgRequest.newBuilder() to construct.
  private ListSgRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSgRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSgRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListSgRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 16: {

            start_ = input.readInt32();
            break;
          }
          case 24: {

            limit_ = input.readInt32();
            break;
          }
          case 34: {
            com.didiyun.compute.v1.ListSgCondition.Builder subBuilder = null;
            if (condition_ != null) {
              subBuilder = condition_.toBuilder();
            }
            condition_ = input.readMessage(com.didiyun.compute.v1.ListSgCondition.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(condition_);
              condition_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.ListSgRequest.class, com.didiyun.compute.v1.ListSgRequest.Builder.class);
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

  public static final int START_FIELD_NUMBER = 2;
  private int start_;
  /**
   * <pre>
   *列表开始位置
   * </pre>
   *
   * <code>int32 start = 2;</code>
   * @return The start.
   */
  public int getStart() {
    return start_;
  }

  public static final int LIMIT_FIELD_NUMBER = 3;
  private int limit_;
  /**
   * <pre>
   *取出数量
   * </pre>
   *
   * <code>int32 limit = 3;</code>
   * @return The limit.
   */
  public int getLimit() {
    return limit_;
  }

  public static final int CONDITION_FIELD_NUMBER = 4;
  private com.didiyun.compute.v1.ListSgCondition condition_;
  /**
   * <pre>
   *过滤条件
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
   * @return Whether the condition field is set.
   */
  public boolean hasCondition() {
    return condition_ != null;
  }
  /**
   * <pre>
   *过滤条件
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
   * @return The condition.
   */
  public com.didiyun.compute.v1.ListSgCondition getCondition() {
    return condition_ == null ? com.didiyun.compute.v1.ListSgCondition.getDefaultInstance() : condition_;
  }
  /**
   * <pre>
   *过滤条件
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
   */
  public com.didiyun.compute.v1.ListSgConditionOrBuilder getConditionOrBuilder() {
    return getCondition();
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
    if (start_ != 0) {
      output.writeInt32(2, start_);
    }
    if (limit_ != 0) {
      output.writeInt32(3, limit_);
    }
    if (condition_ != null) {
      output.writeMessage(4, getCondition());
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
    if (start_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, start_);
    }
    if (limit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, limit_);
    }
    if (condition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getCondition());
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
    if (!(obj instanceof com.didiyun.compute.v1.ListSgRequest)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.ListSgRequest other = (com.didiyun.compute.v1.ListSgRequest) obj;

    if (hasHeader() != other.hasHeader()) return false;
    if (hasHeader()) {
      if (!getHeader()
          .equals(other.getHeader())) return false;
    }
    if (getStart()
        != other.getStart()) return false;
    if (getLimit()
        != other.getLimit()) return false;
    if (hasCondition() != other.hasCondition()) return false;
    if (hasCondition()) {
      if (!getCondition()
          .equals(other.getCondition())) return false;
    }
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
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart();
    hash = (37 * hash) + LIMIT_FIELD_NUMBER;
    hash = (53 * hash) + getLimit();
    if (hasCondition()) {
      hash = (37 * hash) + CONDITION_FIELD_NUMBER;
      hash = (53 * hash) + getCondition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.ListSgRequest parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.ListSgRequest prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.ListSgRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.ListSgRequest)
      com.didiyun.compute.v1.ListSgRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.ListSgRequest.class, com.didiyun.compute.v1.ListSgRequest.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.ListSgRequest.newBuilder()
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
      start_ = 0;

      limit_ = 0;

      if (conditionBuilder_ == null) {
        condition_ = null;
      } else {
        condition_ = null;
        conditionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.SgOuterClass.internal_static_didi_cloud_compute_v1_ListSgRequest_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgRequest getDefaultInstanceForType() {
      return com.didiyun.compute.v1.ListSgRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgRequest build() {
      com.didiyun.compute.v1.ListSgRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.ListSgRequest buildPartial() {
      com.didiyun.compute.v1.ListSgRequest result = new com.didiyun.compute.v1.ListSgRequest(this);
      if (headerBuilder_ == null) {
        result.header_ = header_;
      } else {
        result.header_ = headerBuilder_.build();
      }
      result.start_ = start_;
      result.limit_ = limit_;
      if (conditionBuilder_ == null) {
        result.condition_ = condition_;
      } else {
        result.condition_ = conditionBuilder_.build();
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
      if (other instanceof com.didiyun.compute.v1.ListSgRequest) {
        return mergeFrom((com.didiyun.compute.v1.ListSgRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.ListSgRequest other) {
      if (other == com.didiyun.compute.v1.ListSgRequest.getDefaultInstance()) return this;
      if (other.hasHeader()) {
        mergeHeader(other.getHeader());
      }
      if (other.getStart() != 0) {
        setStart(other.getStart());
      }
      if (other.getLimit() != 0) {
        setLimit(other.getLimit());
      }
      if (other.hasCondition()) {
        mergeCondition(other.getCondition());
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
      com.didiyun.compute.v1.ListSgRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.ListSgRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

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

    private int start_ ;
    /**
     * <pre>
     *列表开始位置
     * </pre>
     *
     * <code>int32 start = 2;</code>
     * @return The start.
     */
    public int getStart() {
      return start_;
    }
    /**
     * <pre>
     *列表开始位置
     * </pre>
     *
     * <code>int32 start = 2;</code>
     * @param value The start to set.
     * @return This builder for chaining.
     */
    public Builder setStart(int value) {
      
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *列表开始位置
     * </pre>
     *
     * <code>int32 start = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStart() {
      
      start_ = 0;
      onChanged();
      return this;
    }

    private int limit_ ;
    /**
     * <pre>
     *取出数量
     * </pre>
     *
     * <code>int32 limit = 3;</code>
     * @return The limit.
     */
    public int getLimit() {
      return limit_;
    }
    /**
     * <pre>
     *取出数量
     * </pre>
     *
     * <code>int32 limit = 3;</code>
     * @param value The limit to set.
     * @return This builder for chaining.
     */
    public Builder setLimit(int value) {
      
      limit_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *取出数量
     * </pre>
     *
     * <code>int32 limit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearLimit() {
      
      limit_ = 0;
      onChanged();
      return this;
    }

    private com.didiyun.compute.v1.ListSgCondition condition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.compute.v1.ListSgCondition, com.didiyun.compute.v1.ListSgCondition.Builder, com.didiyun.compute.v1.ListSgConditionOrBuilder> conditionBuilder_;
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     * @return Whether the condition field is set.
     */
    public boolean hasCondition() {
      return conditionBuilder_ != null || condition_ != null;
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     * @return The condition.
     */
    public com.didiyun.compute.v1.ListSgCondition getCondition() {
      if (conditionBuilder_ == null) {
        return condition_ == null ? com.didiyun.compute.v1.ListSgCondition.getDefaultInstance() : condition_;
      } else {
        return conditionBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    public Builder setCondition(com.didiyun.compute.v1.ListSgCondition value) {
      if (conditionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        condition_ = value;
        onChanged();
      } else {
        conditionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    public Builder setCondition(
        com.didiyun.compute.v1.ListSgCondition.Builder builderForValue) {
      if (conditionBuilder_ == null) {
        condition_ = builderForValue.build();
        onChanged();
      } else {
        conditionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    public Builder mergeCondition(com.didiyun.compute.v1.ListSgCondition value) {
      if (conditionBuilder_ == null) {
        if (condition_ != null) {
          condition_ =
            com.didiyun.compute.v1.ListSgCondition.newBuilder(condition_).mergeFrom(value).buildPartial();
        } else {
          condition_ = value;
        }
        onChanged();
      } else {
        conditionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    public Builder clearCondition() {
      if (conditionBuilder_ == null) {
        condition_ = null;
        onChanged();
      } else {
        condition_ = null;
        conditionBuilder_ = null;
      }

      return this;
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    public com.didiyun.compute.v1.ListSgCondition.Builder getConditionBuilder() {
      
      onChanged();
      return getConditionFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    public com.didiyun.compute.v1.ListSgConditionOrBuilder getConditionOrBuilder() {
      if (conditionBuilder_ != null) {
        return conditionBuilder_.getMessageOrBuilder();
      } else {
        return condition_ == null ?
            com.didiyun.compute.v1.ListSgCondition.getDefaultInstance() : condition_;
      }
    }
    /**
     * <pre>
     *过滤条件
     * </pre>
     *
     * <code>.didi.cloud.compute.v1.ListSgCondition condition = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.compute.v1.ListSgCondition, com.didiyun.compute.v1.ListSgCondition.Builder, com.didiyun.compute.v1.ListSgConditionOrBuilder> 
        getConditionFieldBuilder() {
      if (conditionBuilder_ == null) {
        conditionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.compute.v1.ListSgCondition, com.didiyun.compute.v1.ListSgCondition.Builder, com.didiyun.compute.v1.ListSgConditionOrBuilder>(
                getCondition(),
                getParentForChildren(),
                isClean());
        condition_ = null;
      }
      return conditionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.ListSgRequest)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.ListSgRequest)
  private static final com.didiyun.compute.v1.ListSgRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.ListSgRequest();
  }

  public static com.didiyun.compute.v1.ListSgRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSgRequest>
      PARSER = new com.google.protobuf.AbstractParser<ListSgRequest>() {
    @java.lang.Override
    public ListSgRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListSgRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListSgRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSgRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.ListSgRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

