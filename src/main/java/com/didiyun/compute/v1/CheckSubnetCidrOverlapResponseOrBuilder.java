// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

public interface CheckSubnetCidrOverlapResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CheckSubnetCidrOverlapResponse)
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
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.IsOverlapOutput data = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.IsOverlapOutput> 
      getDataList();
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.IsOverlapOutput data = 2;</code>
   */
  com.didiyun.compute.v1.IsOverlapOutput getData(int index);
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.IsOverlapOutput data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.IsOverlapOutput data = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.IsOverlapOutputOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.IsOverlapOutput data = 2;</code>
   */
  com.didiyun.compute.v1.IsOverlapOutputOrBuilder getDataOrBuilder(
      int index);
}
