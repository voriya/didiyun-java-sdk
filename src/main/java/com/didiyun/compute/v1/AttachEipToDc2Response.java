// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

/**
 * Protobuf type {@code didi.cloud.compute.v1.AttachEipToDc2Response}
 */
public  final class AttachEipToDc2Response extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.compute.v1.AttachEipToDc2Response)
    AttachEipToDc2ResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttachEipToDc2Response.newBuilder() to construct.
  private AttachEipToDc2Response(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttachEipToDc2Response() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttachEipToDc2Response();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AttachEipToDc2Response(
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
            com.didiyun.base.v1.Error.Builder subBuilder = null;
            if (error_ != null) {
              subBuilder = error_.toBuilder();
            }
            error_ = input.readMessage(com.didiyun.base.v1.Error.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(error_);
              error_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              data_ = new java.util.ArrayList<com.didiyun.base.v1.JobInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.didiyun.base.v1.JobInfo.parser(), extensionRegistry));
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
        data_ = java.util.Collections.unmodifiableList(data_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_AttachEipToDc2Response_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_AttachEipToDc2Response_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.compute.v1.AttachEipToDc2Response.class, com.didiyun.compute.v1.AttachEipToDc2Response.Builder.class);
  }

  public static final int ERROR_FIELD_NUMBER = 1;
  private com.didiyun.base.v1.Error error_;
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   * @return Whether the error field is set.
   */
  public boolean hasError() {
    return error_ != null;
  }
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   * @return The error.
   */
  public com.didiyun.base.v1.Error getError() {
    return error_ == null ? com.didiyun.base.v1.Error.getDefaultInstance() : error_;
  }
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  public com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder() {
    return getError();
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private java.util.List<com.didiyun.base.v1.JobInfo> data_;
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  public java.util.List<com.didiyun.base.v1.JobInfo> getDataList() {
    return data_;
  }
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  public java.util.List<? extends com.didiyun.base.v1.JobInfoOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  public com.didiyun.base.v1.JobInfo getData(int index) {
    return data_.get(index);
  }
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  public com.didiyun.base.v1.JobInfoOrBuilder getDataOrBuilder(
      int index) {
    return data_.get(index);
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
    if (error_ != null) {
      output.writeMessage(1, getError());
    }
    for (int i = 0; i < data_.size(); i++) {
      output.writeMessage(2, data_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (error_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getError());
    }
    for (int i = 0; i < data_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, data_.get(i));
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
    if (!(obj instanceof com.didiyun.compute.v1.AttachEipToDc2Response)) {
      return super.equals(obj);
    }
    com.didiyun.compute.v1.AttachEipToDc2Response other = (com.didiyun.compute.v1.AttachEipToDc2Response) obj;

    if (hasError() != other.hasError()) return false;
    if (hasError()) {
      if (!getError()
          .equals(other.getError())) return false;
    }
    if (!getDataList()
        .equals(other.getDataList())) return false;
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
    if (hasError()) {
      hash = (37 * hash) + ERROR_FIELD_NUMBER;
      hash = (53 * hash) + getError().hashCode();
    }
    if (getDataCount() > 0) {
      hash = (37 * hash) + DATA_FIELD_NUMBER;
      hash = (53 * hash) + getDataList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.compute.v1.AttachEipToDc2Response parseFrom(
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
  public static Builder newBuilder(com.didiyun.compute.v1.AttachEipToDc2Response prototype) {
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
   * Protobuf type {@code didi.cloud.compute.v1.AttachEipToDc2Response}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.compute.v1.AttachEipToDc2Response)
      com.didiyun.compute.v1.AttachEipToDc2ResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_AttachEipToDc2Response_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_AttachEipToDc2Response_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.compute.v1.AttachEipToDc2Response.class, com.didiyun.compute.v1.AttachEipToDc2Response.Builder.class);
    }

    // Construct using com.didiyun.compute.v1.AttachEipToDc2Response.newBuilder()
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
        getDataFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (errorBuilder_ == null) {
        error_ = null;
      } else {
        error_ = null;
        errorBuilder_ = null;
      }
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dataBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.compute.v1.EipOuterClass.internal_static_didi_cloud_compute_v1_AttachEipToDc2Response_descriptor;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.AttachEipToDc2Response getDefaultInstanceForType() {
      return com.didiyun.compute.v1.AttachEipToDc2Response.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.compute.v1.AttachEipToDc2Response build() {
      com.didiyun.compute.v1.AttachEipToDc2Response result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.compute.v1.AttachEipToDc2Response buildPartial() {
      com.didiyun.compute.v1.AttachEipToDc2Response result = new com.didiyun.compute.v1.AttachEipToDc2Response(this);
      int from_bitField0_ = bitField0_;
      if (errorBuilder_ == null) {
        result.error_ = error_;
      } else {
        result.error_ = errorBuilder_.build();
      }
      if (dataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          data_ = java.util.Collections.unmodifiableList(data_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.data_ = data_;
      } else {
        result.data_ = dataBuilder_.build();
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
      if (other instanceof com.didiyun.compute.v1.AttachEipToDc2Response) {
        return mergeFrom((com.didiyun.compute.v1.AttachEipToDc2Response)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.compute.v1.AttachEipToDc2Response other) {
      if (other == com.didiyun.compute.v1.AttachEipToDc2Response.getDefaultInstance()) return this;
      if (other.hasError()) {
        mergeError(other.getError());
      }
      if (dataBuilder_ == null) {
        if (!other.data_.isEmpty()) {
          if (data_.isEmpty()) {
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataIsMutable();
            data_.addAll(other.data_);
          }
          onChanged();
        }
      } else {
        if (!other.data_.isEmpty()) {
          if (dataBuilder_.isEmpty()) {
            dataBuilder_.dispose();
            dataBuilder_ = null;
            data_ = other.data_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDataFieldBuilder() : null;
          } else {
            dataBuilder_.addAllMessages(other.data_);
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
      com.didiyun.compute.v1.AttachEipToDc2Response parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.compute.v1.AttachEipToDc2Response) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.didiyun.base.v1.Error error_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Error, com.didiyun.base.v1.Error.Builder, com.didiyun.base.v1.ErrorOrBuilder> errorBuilder_;
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     * @return Whether the error field is set.
     */
    public boolean hasError() {
      return errorBuilder_ != null || error_ != null;
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     * @return The error.
     */
    public com.didiyun.base.v1.Error getError() {
      if (errorBuilder_ == null) {
        return error_ == null ? com.didiyun.base.v1.Error.getDefaultInstance() : error_;
      } else {
        return errorBuilder_.getMessage();
      }
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder setError(com.didiyun.base.v1.Error value) {
      if (errorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        error_ = value;
        onChanged();
      } else {
        errorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder setError(
        com.didiyun.base.v1.Error.Builder builderForValue) {
      if (errorBuilder_ == null) {
        error_ = builderForValue.build();
        onChanged();
      } else {
        errorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder mergeError(com.didiyun.base.v1.Error value) {
      if (errorBuilder_ == null) {
        if (error_ != null) {
          error_ =
            com.didiyun.base.v1.Error.newBuilder(error_).mergeFrom(value).buildPartial();
        } else {
          error_ = value;
        }
        onChanged();
      } else {
        errorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public Builder clearError() {
      if (errorBuilder_ == null) {
        error_ = null;
        onChanged();
      } else {
        error_ = null;
        errorBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public com.didiyun.base.v1.Error.Builder getErrorBuilder() {
      
      onChanged();
      return getErrorFieldBuilder().getBuilder();
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    public com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder() {
      if (errorBuilder_ != null) {
        return errorBuilder_.getMessageOrBuilder();
      } else {
        return error_ == null ?
            com.didiyun.base.v1.Error.getDefaultInstance() : error_;
      }
    }
    /**
     * <code>.didi.cloud.base.v1.Error error = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.didiyun.base.v1.Error, com.didiyun.base.v1.Error.Builder, com.didiyun.base.v1.ErrorOrBuilder> 
        getErrorFieldBuilder() {
      if (errorBuilder_ == null) {
        errorBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.didiyun.base.v1.Error, com.didiyun.base.v1.Error.Builder, com.didiyun.base.v1.ErrorOrBuilder>(
                getError(),
                getParentForChildren(),
                isClean());
        error_ = null;
      }
      return errorBuilder_;
    }

    private java.util.List<com.didiyun.base.v1.JobInfo> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.didiyun.base.v1.JobInfo>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.base.v1.JobInfo, com.didiyun.base.v1.JobInfo.Builder, com.didiyun.base.v1.JobInfoOrBuilder> dataBuilder_;

    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public java.util.List<com.didiyun.base.v1.JobInfo> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public com.didiyun.base.v1.JobInfo getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.didiyun.base.v1.JobInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.set(index, value);
        onChanged();
      } else {
        dataBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder setData(
        int index, com.didiyun.base.v1.JobInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder addData(com.didiyun.base.v1.JobInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(value);
        onChanged();
      } else {
        dataBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.didiyun.base.v1.JobInfo value) {
      if (dataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataIsMutable();
        data_.add(index, value);
        onChanged();
      } else {
        dataBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder addData(
        com.didiyun.base.v1.JobInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder addData(
        int index, com.didiyun.base.v1.JobInfo.Builder builderForValue) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.didiyun.base.v1.JobInfo> values) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, data_);
        onChanged();
      } else {
        dataBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder clearData() {
      if (dataBuilder_ == null) {
        data_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public Builder removeData(int index) {
      if (dataBuilder_ == null) {
        ensureDataIsMutable();
        data_.remove(index);
        onChanged();
      } else {
        dataBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public com.didiyun.base.v1.JobInfo.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public com.didiyun.base.v1.JobInfoOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public java.util.List<? extends com.didiyun.base.v1.JobInfoOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public com.didiyun.base.v1.JobInfo.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.didiyun.base.v1.JobInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public com.didiyun.base.v1.JobInfo.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.didiyun.base.v1.JobInfo.getDefaultInstance());
    }
    /**
     * <pre>
     *任务进度
     * </pre>
     *
     * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
     */
    public java.util.List<com.didiyun.base.v1.JobInfo.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.base.v1.JobInfo, com.didiyun.base.v1.JobInfo.Builder, com.didiyun.base.v1.JobInfoOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.didiyun.base.v1.JobInfo, com.didiyun.base.v1.JobInfo.Builder, com.didiyun.base.v1.JobInfoOrBuilder>(
                data_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        data_ = null;
      }
      return dataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.compute.v1.AttachEipToDc2Response)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.compute.v1.AttachEipToDc2Response)
  private static final com.didiyun.compute.v1.AttachEipToDc2Response DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.compute.v1.AttachEipToDc2Response();
  }

  public static com.didiyun.compute.v1.AttachEipToDc2Response getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttachEipToDc2Response>
      PARSER = new com.google.protobuf.AbstractParser<AttachEipToDc2Response>() {
    @java.lang.Override
    public AttachEipToDc2Response parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AttachEipToDc2Response(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AttachEipToDc2Response> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttachEipToDc2Response> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.compute.v1.AttachEipToDc2Response getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

