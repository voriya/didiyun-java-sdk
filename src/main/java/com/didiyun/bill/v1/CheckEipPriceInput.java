// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

/**
 * Protobuf type {@code didi.cloud.bill.v1.CheckEipPriceInput}
 */
public  final class CheckEipPriceInput extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:didi.cloud.bill.v1.CheckEipPriceInput)
    CheckEipPriceInputOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CheckEipPriceInput.newBuilder() to construct.
  private CheckEipPriceInput(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CheckEipPriceInput() {
    count_ = 0;
    payPeriod_ = 0;
    bandwidth_ = 0;
    chargeWithFlow_ = false;
    eipUuid_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CheckEipPriceInput(
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
          case 8: {

            count_ = input.readInt32();
            break;
          }
          case 16: {

            payPeriod_ = input.readInt32();
            break;
          }
          case 24: {

            bandwidth_ = input.readInt32();
            break;
          }
          case 32: {

            chargeWithFlow_ = input.readBool();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            eipUuid_ = s;
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
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEipPriceInput_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEipPriceInput_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.didiyun.bill.v1.CheckEipPriceInput.class, com.didiyun.bill.v1.CheckEipPriceInput.Builder.class);
  }

  public static final int COUNT_FIELD_NUMBER = 1;
  private int count_;
  /**
   * <pre>
   *eip数量
   * </pre>
   *
   * <code>int32 count = 1;</code>
   */
  public int getCount() {
    return count_;
  }

  public static final int PAYPERIOD_FIELD_NUMBER = 2;
  private int payPeriod_;
  /**
   * <pre>
   *购买包月时长，单位为月，不传或传0表示后付费
   * </pre>
   *
   * <code>int32 payPeriod = 2;</code>
   */
  public int getPayPeriod() {
    return payPeriod_;
  }

  public static final int BANDWIDTH_FIELD_NUMBER = 3;
  private int bandwidth_;
  /**
   * <pre>
   *eip带宽
   * </pre>
   *
   * <code>int32 bandwidth = 3;</code>
   */
  public int getBandwidth() {
    return bandwidth_;
  }

  public static final int CHARGEWITHFLOW_FIELD_NUMBER = 4;
  private boolean chargeWithFlow_;
  /**
   * <pre>
   *是否按流量计费
   * </pre>
   *
   * <code>bool chargeWithFlow = 4;</code>
   */
  public boolean getChargeWithFlow() {
    return chargeWithFlow_;
  }

  public static final int EIPUUID_FIELD_NUMBER = 5;
  private volatile java.lang.Object eipUuid_;
  /**
   * <pre>
   *当为更改规格时，传此eipUuid
   * </pre>
   *
   * <code>string eipUuid = 5;</code>
   */
  public java.lang.String getEipUuid() {
    java.lang.Object ref = eipUuid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eipUuid_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *当为更改规格时，传此eipUuid
   * </pre>
   *
   * <code>string eipUuid = 5;</code>
   */
  public com.google.protobuf.ByteString
      getEipUuidBytes() {
    java.lang.Object ref = eipUuid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      eipUuid_ = b;
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
    if (count_ != 0) {
      output.writeInt32(1, count_);
    }
    if (payPeriod_ != 0) {
      output.writeInt32(2, payPeriod_);
    }
    if (bandwidth_ != 0) {
      output.writeInt32(3, bandwidth_);
    }
    if (chargeWithFlow_ != false) {
      output.writeBool(4, chargeWithFlow_);
    }
    if (!getEipUuidBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, eipUuid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, count_);
    }
    if (payPeriod_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, payPeriod_);
    }
    if (bandwidth_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, bandwidth_);
    }
    if (chargeWithFlow_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, chargeWithFlow_);
    }
    if (!getEipUuidBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, eipUuid_);
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
    if (!(obj instanceof com.didiyun.bill.v1.CheckEipPriceInput)) {
      return super.equals(obj);
    }
    com.didiyun.bill.v1.CheckEipPriceInput other = (com.didiyun.bill.v1.CheckEipPriceInput) obj;

    boolean result = true;
    result = result && (getCount()
        == other.getCount());
    result = result && (getPayPeriod()
        == other.getPayPeriod());
    result = result && (getBandwidth()
        == other.getBandwidth());
    result = result && (getChargeWithFlow()
        == other.getChargeWithFlow());
    result = result && getEipUuid()
        .equals(other.getEipUuid());
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
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    hash = (37 * hash) + PAYPERIOD_FIELD_NUMBER;
    hash = (53 * hash) + getPayPeriod();
    hash = (37 * hash) + BANDWIDTH_FIELD_NUMBER;
    hash = (53 * hash) + getBandwidth();
    hash = (37 * hash) + CHARGEWITHFLOW_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getChargeWithFlow());
    hash = (37 * hash) + EIPUUID_FIELD_NUMBER;
    hash = (53 * hash) + getEipUuid().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.didiyun.bill.v1.CheckEipPriceInput parseFrom(
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
  public static Builder newBuilder(com.didiyun.bill.v1.CheckEipPriceInput prototype) {
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
   * Protobuf type {@code didi.cloud.bill.v1.CheckEipPriceInput}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:didi.cloud.bill.v1.CheckEipPriceInput)
      com.didiyun.bill.v1.CheckEipPriceInputOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEipPriceInput_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEipPriceInput_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.didiyun.bill.v1.CheckEipPriceInput.class, com.didiyun.bill.v1.CheckEipPriceInput.Builder.class);
    }

    // Construct using com.didiyun.bill.v1.CheckEipPriceInput.newBuilder()
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
      count_ = 0;

      payPeriod_ = 0;

      bandwidth_ = 0;

      chargeWithFlow_ = false;

      eipUuid_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.didiyun.bill.v1.BillOuterClass.internal_static_didi_cloud_bill_v1_CheckEipPriceInput_descriptor;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckEipPriceInput getDefaultInstanceForType() {
      return com.didiyun.bill.v1.CheckEipPriceInput.getDefaultInstance();
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckEipPriceInput build() {
      com.didiyun.bill.v1.CheckEipPriceInput result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.didiyun.bill.v1.CheckEipPriceInput buildPartial() {
      com.didiyun.bill.v1.CheckEipPriceInput result = new com.didiyun.bill.v1.CheckEipPriceInput(this);
      result.count_ = count_;
      result.payPeriod_ = payPeriod_;
      result.bandwidth_ = bandwidth_;
      result.chargeWithFlow_ = chargeWithFlow_;
      result.eipUuid_ = eipUuid_;
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
      if (other instanceof com.didiyun.bill.v1.CheckEipPriceInput) {
        return mergeFrom((com.didiyun.bill.v1.CheckEipPriceInput)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.didiyun.bill.v1.CheckEipPriceInput other) {
      if (other == com.didiyun.bill.v1.CheckEipPriceInput.getDefaultInstance()) return this;
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.getPayPeriod() != 0) {
        setPayPeriod(other.getPayPeriod());
      }
      if (other.getBandwidth() != 0) {
        setBandwidth(other.getBandwidth());
      }
      if (other.getChargeWithFlow() != false) {
        setChargeWithFlow(other.getChargeWithFlow());
      }
      if (!other.getEipUuid().isEmpty()) {
        eipUuid_ = other.eipUuid_;
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
      com.didiyun.bill.v1.CheckEipPriceInput parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.didiyun.bill.v1.CheckEipPriceInput) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int count_ ;
    /**
     * <pre>
     *eip数量
     * </pre>
     *
     * <code>int32 count = 1;</code>
     */
    public int getCount() {
      return count_;
    }
    /**
     * <pre>
     *eip数量
     * </pre>
     *
     * <code>int32 count = 1;</code>
     */
    public Builder setCount(int value) {
      
      count_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *eip数量
     * </pre>
     *
     * <code>int32 count = 1;</code>
     */
    public Builder clearCount() {
      
      count_ = 0;
      onChanged();
      return this;
    }

    private int payPeriod_ ;
    /**
     * <pre>
     *购买包月时长，单位为月，不传或传0表示后付费
     * </pre>
     *
     * <code>int32 payPeriod = 2;</code>
     */
    public int getPayPeriod() {
      return payPeriod_;
    }
    /**
     * <pre>
     *购买包月时长，单位为月，不传或传0表示后付费
     * </pre>
     *
     * <code>int32 payPeriod = 2;</code>
     */
    public Builder setPayPeriod(int value) {
      
      payPeriod_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *购买包月时长，单位为月，不传或传0表示后付费
     * </pre>
     *
     * <code>int32 payPeriod = 2;</code>
     */
    public Builder clearPayPeriod() {
      
      payPeriod_ = 0;
      onChanged();
      return this;
    }

    private int bandwidth_ ;
    /**
     * <pre>
     *eip带宽
     * </pre>
     *
     * <code>int32 bandwidth = 3;</code>
     */
    public int getBandwidth() {
      return bandwidth_;
    }
    /**
     * <pre>
     *eip带宽
     * </pre>
     *
     * <code>int32 bandwidth = 3;</code>
     */
    public Builder setBandwidth(int value) {
      
      bandwidth_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *eip带宽
     * </pre>
     *
     * <code>int32 bandwidth = 3;</code>
     */
    public Builder clearBandwidth() {
      
      bandwidth_ = 0;
      onChanged();
      return this;
    }

    private boolean chargeWithFlow_ ;
    /**
     * <pre>
     *是否按流量计费
     * </pre>
     *
     * <code>bool chargeWithFlow = 4;</code>
     */
    public boolean getChargeWithFlow() {
      return chargeWithFlow_;
    }
    /**
     * <pre>
     *是否按流量计费
     * </pre>
     *
     * <code>bool chargeWithFlow = 4;</code>
     */
    public Builder setChargeWithFlow(boolean value) {
      
      chargeWithFlow_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *是否按流量计费
     * </pre>
     *
     * <code>bool chargeWithFlow = 4;</code>
     */
    public Builder clearChargeWithFlow() {
      
      chargeWithFlow_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object eipUuid_ = "";
    /**
     * <pre>
     *当为更改规格时，传此eipUuid
     * </pre>
     *
     * <code>string eipUuid = 5;</code>
     */
    public java.lang.String getEipUuid() {
      java.lang.Object ref = eipUuid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eipUuid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *当为更改规格时，传此eipUuid
     * </pre>
     *
     * <code>string eipUuid = 5;</code>
     */
    public com.google.protobuf.ByteString
        getEipUuidBytes() {
      java.lang.Object ref = eipUuid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        eipUuid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *当为更改规格时，传此eipUuid
     * </pre>
     *
     * <code>string eipUuid = 5;</code>
     */
    public Builder setEipUuid(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      eipUuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *当为更改规格时，传此eipUuid
     * </pre>
     *
     * <code>string eipUuid = 5;</code>
     */
    public Builder clearEipUuid() {
      
      eipUuid_ = getDefaultInstance().getEipUuid();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *当为更改规格时，传此eipUuid
     * </pre>
     *
     * <code>string eipUuid = 5;</code>
     */
    public Builder setEipUuidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      eipUuid_ = value;
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


    // @@protoc_insertion_point(builder_scope:didi.cloud.bill.v1.CheckEipPriceInput)
  }

  // @@protoc_insertion_point(class_scope:didi.cloud.bill.v1.CheckEipPriceInput)
  private static final com.didiyun.bill.v1.CheckEipPriceInput DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.didiyun.bill.v1.CheckEipPriceInput();
  }

  public static com.didiyun.bill.v1.CheckEipPriceInput getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckEipPriceInput>
      PARSER = new com.google.protobuf.AbstractParser<CheckEipPriceInput>() {
    @java.lang.Override
    public CheckEipPriceInput parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CheckEipPriceInput(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CheckEipPriceInput> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckEipPriceInput> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.didiyun.bill.v1.CheckEipPriceInput getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

