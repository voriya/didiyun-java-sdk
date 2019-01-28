// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

/**
 * Protobuf type {@code didi.cloud.bill.v1.FactorRuleDetail}
 */
public  final class FactorRuleDetail extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.bill.v1.FactorRuleDetail)
    FactorRuleDetailOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FactorRuleDetail.newBuilder() to construct.
  private FactorRuleDetail(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FactorRuleDetail() {
    autoRenewCnt_ = 0L;
    autoSwitch_ = false;
    payType_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FactorRuleDetail(
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
          case 32: {

            autoRenewCnt_ = input.readInt64();
            break;
          }
          case 40: {

            autoSwitch_ = input.readBool();
            break;
          }
          case 50: {
            java.lang.String s = input.readStringRequireUtf8();

            payType_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
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
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_FactorRuleDetail_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_FactorRuleDetail_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.bill.v1.FactorRuleDetail.class, com.didiyun.bill.v1.FactorRuleDetail.Builder.class);
  }

  public static final int AUTORENEWCNT_FIELD_NUMBER = 4;
  private long autoRenewCnt_;
  /**
   * <pre>
   *int64 ruleId = 1;               //标识这个计费因子的规则id
   *int64 leftUsage = 2;            //当前计费rule的余量
   *int64 nextRuleId = 3;           //下个阶段的ruleId
   * </pre>
   *
   * <code>int64 autoRenewCnt = 4;</code>
   */
  public long getAutoRenewCnt() {
    return autoRenewCnt_;
  }

  public static final int AUTOSWITCH_FIELD_NUMBER = 5;
  private boolean autoSwitch_;
  /**
   * <pre>
   *到期是否自动转为按时长
   * </pre>
   *
   * <code>bool autoSwitch = 5;</code>
   */
  public boolean getAutoSwitch() {
    return autoSwitch_;
  }

  public static final int PAYTYPE_FIELD_NUMBER = 6;
  private volatile java.lang.Object payType_;
  /**
   * <pre>
   *扣费类型字符串描述
   * </pre>
   *
   * <code>string payType = 6;</code>
   */
  public java.lang.String getPayType() {
    java.lang.Object ref = payType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      payType_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *扣费类型字符串描述
   * </pre>
   *
   * <code>string payType = 6;</code>
   */
  public com.google.protobuf.ByteString
      getPayTypeBytes() {
    java.lang.Object ref = payType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      payType_ = b;
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
    if (autoRenewCnt_ != 0L) {
      output.writeInt64(4, autoRenewCnt_);
    }
    if (autoSwitch_ != false) {
      output.writeBool(5, autoSwitch_);
    }
    if (!getPayTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, payType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (autoRenewCnt_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, autoRenewCnt_);
    }
    if (autoSwitch_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, autoSwitch_);
    }
    if (!getPayTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, payType_);
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
    if (!(obj instanceof com.didiyun.bill.v1.FactorRuleDetail)) {
      return super.equals(obj);
    }
    com.didiyun.bill.v1.FactorRuleDetail other = (com.didiyun.bill.v1.FactorRuleDetail) obj;

    boolean result = true;
    result = result && (getAutoRenewCnt()
        == other.getAutoRenewCnt());
    result = result && (getAutoSwitch()
        == other.getAutoSwitch());
    result = result && getPayType()
        .equals(other.getPayType());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + AUTORENEWCNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAutoRenewCnt());
    hash = (37 * hash) + AUTOSWITCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAutoSwitch());
    hash = (37 * hash) + PAYTYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPayType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.FactorRuleDetail parseFrom(
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
  public static Builder newBuilder(com.didiyun.bill.v1.FactorRuleDetail prototype) {
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
   * Protobuf type {@code didi.cloud.bill.v1.FactorRuleDetail}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.bill.v1.FactorRuleDetail)
      com.didiyun.bill.v1.FactorRuleDetailOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_FactorRuleDetail_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_FactorRuleDetail_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.bill.v1.FactorRuleDetail.class, com.didiyun.bill.v1.FactorRuleDetail.Builder.class);
    }

    // Construct using com.didiyun.bill.v1.FactorRuleDetail.newBuilder()
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
      autoRenewCnt_ = 0L;

      autoSwitch_ = false;

      payType_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_FactorRuleDetail_descriptor;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.FactorRuleDetail getDefaultInstanceForType() {
      return com.didiyun.bill.v1.FactorRuleDetail.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.bill.v1.FactorRuleDetail build() {
      com.didiyun.bill.v1.FactorRuleDetail result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.FactorRuleDetail buildPartial() {
      com.didiyun.bill.v1.FactorRuleDetail result = new com.didiyun.bill.v1.FactorRuleDetail(this);
      result.autoRenewCnt_ = autoRenewCnt_;
      result.autoSwitch_ = autoSwitch_;
      result.payType_ = payType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.didiyun.bill.v1.FactorRuleDetail) {
        return mergeFrom((com.didiyun.bill.v1.FactorRuleDetail)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.bill.v1.FactorRuleDetail other) {
      if (other == com.didiyun.bill.v1.FactorRuleDetail.getDefaultInstance()) return this;
      if (other.getAutoRenewCnt() != 0L) {
        setAutoRenewCnt(other.getAutoRenewCnt());
      }
      if (other.getAutoSwitch() != false) {
        setAutoSwitch(other.getAutoSwitch());
      }
      if (!other.getPayType().isEmpty()) {
        payType_ = other.payType_;
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
      com.didiyun.bill.v1.FactorRuleDetail parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.bill.v1.FactorRuleDetail) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long autoRenewCnt_ ;
    /**
     * <pre>
     *int64 ruleId = 1;               //标识这个计费因子的规则id
     *int64 leftUsage = 2;            //当前计费rule的余量
     *int64 nextRuleId = 3;           //下个阶段的ruleId
     * </pre>
     *
     * <code>int64 autoRenewCnt = 4;</code>
     */
    public long getAutoRenewCnt() {
      return autoRenewCnt_;
    }
    /**
     * <pre>
     *int64 ruleId = 1;               //标识这个计费因子的规则id
     *int64 leftUsage = 2;            //当前计费rule的余量
     *int64 nextRuleId = 3;           //下个阶段的ruleId
     * </pre>
     *
     * <code>int64 autoRenewCnt = 4;</code>
     */
    public Builder setAutoRenewCnt(long value) {
      
      autoRenewCnt_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *int64 ruleId = 1;               //标识这个计费因子的规则id
     *int64 leftUsage = 2;            //当前计费rule的余量
     *int64 nextRuleId = 3;           //下个阶段的ruleId
     * </pre>
     *
     * <code>int64 autoRenewCnt = 4;</code>
     */
    public Builder clearAutoRenewCnt() {
      
      autoRenewCnt_ = 0L;
      onChanged();
      return this;
    }

    private boolean autoSwitch_ ;
    /**
     * <pre>
     *到期是否自动转为按时长
     * </pre>
     *
     * <code>bool autoSwitch = 5;</code>
     */
    public boolean getAutoSwitch() {
      return autoSwitch_;
    }
    /**
     * <pre>
     *到期是否自动转为按时长
     * </pre>
     *
     * <code>bool autoSwitch = 5;</code>
     */
    public Builder setAutoSwitch(boolean value) {
      
      autoSwitch_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *到期是否自动转为按时长
     * </pre>
     *
     * <code>bool autoSwitch = 5;</code>
     */
    public Builder clearAutoSwitch() {
      
      autoSwitch_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object payType_ = "";
    /**
     * <pre>
     *扣费类型字符串描述
     * </pre>
     *
     * <code>string payType = 6;</code>
     */
    public java.lang.String getPayType() {
      java.lang.Object ref = payType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        payType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *扣费类型字符串描述
     * </pre>
     *
     * <code>string payType = 6;</code>
     */
    public com.google.protobuf.ByteString
        getPayTypeBytes() {
      java.lang.Object ref = payType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        payType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *扣费类型字符串描述
     * </pre>
     *
     * <code>string payType = 6;</code>
     */
    public Builder setPayType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      payType_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *扣费类型字符串描述
     * </pre>
     *
     * <code>string payType = 6;</code>
     */
    public Builder clearPayType() {
      
      payType_ = getDefaultInstance().getPayType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *扣费类型字符串描述
     * </pre>
     *
     * <code>string payType = 6;</code>
     */
    public Builder setPayTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      payType_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:didi.cloud.bill.v1.FactorRuleDetail)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.bill.v1.FactorRuleDetail)
  private static final com.didiyun.bill.v1.FactorRuleDetail DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.bill.v1.FactorRuleDetail();
  }

  public static com.didiyun.bill.v1.FactorRuleDetail getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FactorRuleDetail>
      PARSER = new com.google.protobuf.AbstractParser<FactorRuleDetail>() {
    @java.lang.Override
    public FactorRuleDetail parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FactorRuleDetail(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FactorRuleDetail> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FactorRuleDetail> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.bill.v1.FactorRuleDetail getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
