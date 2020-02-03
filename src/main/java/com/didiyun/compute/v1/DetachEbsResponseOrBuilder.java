// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/ebs.proto

package com.didiyun.compute.v1;

public interface DetachEbsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.DetachEbsResponse)
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
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  java.util.List<com.didiyun.base.v1.JobInfo> 
      getDataList();
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  com.didiyun.base.v1.JobInfo getData(int index);
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  java.util.List<? extends com.didiyun.base.v1.JobInfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *任务进度
   * </pre>
   *
   * <code>repeated .didi.cloud.base.v1.JobInfo data = 2;</code>
   */
  com.didiyun.base.v1.JobInfoOrBuilder getDataOrBuilder(
      int index);
}
