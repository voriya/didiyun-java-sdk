// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface GetEipChargeInfoAndSpecResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.GetEipChargeInfoAndSpecResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   * @return Whether the error field is set.
   */
  boolean hasError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   * @return The error.
   */
  com.didiyun.base.v1.Error getError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <code>repeated .didi.cloud.bill.v1.EipChargeInfoAndSpec data = 2;</code>
   */
  java.util.List<com.didiyun.bill.v1.EipChargeInfoAndSpec> 
      getDataList();
  /**
   * <code>repeated .didi.cloud.bill.v1.EipChargeInfoAndSpec data = 2;</code>
   */
  com.didiyun.bill.v1.EipChargeInfoAndSpec getData(int index);
  /**
   * <code>repeated .didi.cloud.bill.v1.EipChargeInfoAndSpec data = 2;</code>
   */
  int getDataCount();
  /**
   * <code>repeated .didi.cloud.bill.v1.EipChargeInfoAndSpec data = 2;</code>
   */
  java.util.List<? extends com.didiyun.bill.v1.EipChargeInfoAndSpecOrBuilder> 
      getDataOrBuilderList();
  /**
   * <code>repeated .didi.cloud.bill.v1.EipChargeInfoAndSpec data = 2;</code>
   */
  com.didiyun.bill.v1.EipChargeInfoAndSpecOrBuilder getDataOrBuilder(
      int index);
}
