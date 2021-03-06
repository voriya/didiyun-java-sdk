// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface ListRegionAndZoneResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListRegionAndZoneResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  boolean hasError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.Error getError();
  /**
   * <code>.didi.cloud.base.v1.Error error = 1;</code>
   */
  com.didiyun.base.v1.ErrorOrBuilder getErrorOrBuilder();

  /**
   * <pre>
   *产品可用的region和zone信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.RegionData data = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.RegionData> 
      getDataList();
  /**
   * <pre>
   *产品可用的region和zone信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.RegionData data = 2;</code>
   */
  com.didiyun.compute.v1.RegionData getData(int index);
  /**
   * <pre>
   *产品可用的region和zone信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.RegionData data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *产品可用的region和zone信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.RegionData data = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.RegionDataOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *产品可用的region和zone信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.RegionData data = 2;</code>
   */
  com.didiyun.compute.v1.RegionDataOrBuilder getDataOrBuilder(
      int index);
}
