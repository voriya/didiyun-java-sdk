// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/dc2.proto

package com.didiyun.compute.v1;

public interface ListDc2ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListDc2Response)
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
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.Dc2Info data = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.Dc2Info> 
      getDataList();
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.Dc2Info data = 2;</code>
   */
  com.didiyun.compute.v1.Dc2Info getData(int index);
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.Dc2Info data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.Dc2Info data = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.Dc2InfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.Dc2Info data = 2;</code>
   */
  com.didiyun.compute.v1.Dc2InfoOrBuilder getDataOrBuilder(
      int index);
}