// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: monitor/v1/counter.proto

package com.didiyun.monitor.v1;

/**
 * Protobuf type {@code didi.cloud.monitor.v1.ListCounterDataResponse}
 */
public  final class ListCounterDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.monitor.v1.ListCounterDataResponse)
    ListCounterDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListCounterDataResponse.newBuilder() to construct.
  private ListCounterDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListCounterDataResponse() {
    data_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListCounterDataResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ListCounterDataResponse(
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
              data_ = new java.util.ArrayList<com.didiyun.monitor.v1.CounterDataOutput>();
              mutable_bitField0_ |= 0x00000001;
            }
            data_.add(
                input.readMessage(com.didiyun.monitor.v1.CounterDataOutput.parser(), extensionRegistry));
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
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.monitor.v1.ListCounterDataResponse.class, com.didiyun.monitor.v1.ListCounterDataResponse.Builder.class);
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
  private java.util.List<com.didiyun.monitor.v1.CounterDataOutput> data_;
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
   */
  public java.util.List<com.didiyun.monitor.v1.CounterDataOutput> getDataList() {
    return data_;
  }
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
   */
  public java.util.List<? extends com.didiyun.monitor.v1.CounterDataOutputOrBuilder> 
      getDataOrBuilderList() {
    return data_;
  }
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
   */
  public int getDataCount() {
    return data_.size();
  }
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
   */
  public com.didiyun.monitor.v1.CounterDataOutput getData(int index) {
    return data_.get(index);
  }
  /**
   * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
   */
  public com.didiyun.monitor.v1.CounterDataOutputOrBuilder getDataOrBuilder(
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
    if (!(obj instanceof com.didiyun.monitor.v1.ListCounterDataResponse)) {
      return super.equals(obj);
    }
    com.didiyun.monitor.v1.ListCounterDataResponse other = (com.didiyun.monitor.v1.ListCounterDataResponse) obj;

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

  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.monitor.v1.ListCounterDataResponse parseFrom(
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
  public static Builder newBuilder(com.didiyun.monitor.v1.ListCounterDataResponse prototype) {
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
   * Protobuf type {@code didi.cloud.monitor.v1.ListCounterDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.monitor.v1.ListCounterDataResponse)
      com.didiyun.monitor.v1.ListCounterDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.monitor.v1.ListCounterDataResponse.class, com.didiyun.monitor.v1.ListCounterDataResponse.Builder.class);
    }

    // Construct using com.didiyun.monitor.v1.ListCounterDataResponse.newBuilder()
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
      return com.didiyun.monitor.v1.Counter.internal_static_didi_cloud_monitor_v1_ListCounterDataResponse_descriptor;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.ListCounterDataResponse getDefaultInstanceForType() {
      return com.didiyun.monitor.v1.ListCounterDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.ListCounterDataResponse build() {
      com.didiyun.monitor.v1.ListCounterDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.monitor.v1.ListCounterDataResponse buildPartial() {
      com.didiyun.monitor.v1.ListCounterDataResponse result = new com.didiyun.monitor.v1.ListCounterDataResponse(this);
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
      if (other instanceof com.didiyun.monitor.v1.ListCounterDataResponse) {
        return mergeFrom((com.didiyun.monitor.v1.ListCounterDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.monitor.v1.ListCounterDataResponse other) {
      if (other == com.didiyun.monitor.v1.ListCounterDataResponse.getDefaultInstance()) return this;
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
      com.didiyun.monitor.v1.ListCounterDataResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.monitor.v1.ListCounterDataResponse) e.getUnfinishedMessage();
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

    private java.util.List<com.didiyun.monitor.v1.CounterDataOutput> data_ =
      java.util.Collections.emptyList();
    private void ensureDataIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        data_ = new java.util.ArrayList<com.didiyun.monitor.v1.CounterDataOutput>(data_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.monitor.v1.CounterDataOutput, com.didiyun.monitor.v1.CounterDataOutput.Builder, com.didiyun.monitor.v1.CounterDataOutputOrBuilder> dataBuilder_;

    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public java.util.List<com.didiyun.monitor.v1.CounterDataOutput> getDataList() {
      if (dataBuilder_ == null) {
        return java.util.Collections.unmodifiableList(data_);
      } else {
        return dataBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public int getDataCount() {
      if (dataBuilder_ == null) {
        return data_.size();
      } else {
        return dataBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataOutput getData(int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);
      } else {
        return dataBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder setData(
        int index, com.didiyun.monitor.v1.CounterDataOutput value) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder setData(
        int index, com.didiyun.monitor.v1.CounterDataOutput.Builder builderForValue) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder addData(com.didiyun.monitor.v1.CounterDataOutput value) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder addData(
        int index, com.didiyun.monitor.v1.CounterDataOutput value) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder addData(
        com.didiyun.monitor.v1.CounterDataOutput.Builder builderForValue) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder addData(
        int index, com.didiyun.monitor.v1.CounterDataOutput.Builder builderForValue) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public Builder addAllData(
        java.lang.Iterable<? extends com.didiyun.monitor.v1.CounterDataOutput> values) {
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
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
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataOutput.Builder getDataBuilder(
        int index) {
      return getDataFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataOutputOrBuilder getDataOrBuilder(
        int index) {
      if (dataBuilder_ == null) {
        return data_.get(index);  } else {
        return dataBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public java.util.List<? extends com.didiyun.monitor.v1.CounterDataOutputOrBuilder> 
         getDataOrBuilderList() {
      if (dataBuilder_ != null) {
        return dataBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(data_);
      }
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataOutput.Builder addDataBuilder() {
      return getDataFieldBuilder().addBuilder(
          com.didiyun.monitor.v1.CounterDataOutput.getDefaultInstance());
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public com.didiyun.monitor.v1.CounterDataOutput.Builder addDataBuilder(
        int index) {
      return getDataFieldBuilder().addBuilder(
          index, com.didiyun.monitor.v1.CounterDataOutput.getDefaultInstance());
    }
    /**
     * <code>repeated .didi.cloud.monitor.v1.CounterDataOutput data = 2;</code>
     */
    public java.util.List<com.didiyun.monitor.v1.CounterDataOutput.Builder> 
         getDataBuilderList() {
      return getDataFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.didiyun.monitor.v1.CounterDataOutput, com.didiyun.monitor.v1.CounterDataOutput.Builder, com.didiyun.monitor.v1.CounterDataOutputOrBuilder> 
        getDataFieldBuilder() {
      if (dataBuilder_ == null) {
        dataBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.didiyun.monitor.v1.CounterDataOutput, com.didiyun.monitor.v1.CounterDataOutput.Builder, com.didiyun.monitor.v1.CounterDataOutputOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.monitor.v1.ListCounterDataResponse)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.monitor.v1.ListCounterDataResponse)
  private static final com.didiyun.monitor.v1.ListCounterDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.monitor.v1.ListCounterDataResponse();
  }

  public static com.didiyun.monitor.v1.ListCounterDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListCounterDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListCounterDataResponse>() {
    @java.lang.Override
    public ListCounterDataResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ListCounterDataResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ListCounterDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListCounterDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.monitor.v1.ListCounterDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

