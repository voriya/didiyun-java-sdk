// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

public interface ListSgRuleResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListSgRuleResponse)
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
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.SgRuleInfo data = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.SgRuleInfo> 
      getDataList();
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.SgRuleInfo data = 2;</code>
   */
  com.didiyun.compute.v1.SgRuleInfo getData(int index);
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.SgRuleInfo data = 2;</code>
   */
  int getDataCount();
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.SgRuleInfo data = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.SgRuleInfoOrBuilder> 
      getDataOrBuilderList();
  /**
   * <pre>
   *dc2列表
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.SgRuleInfo data = 2;</code>
   */
  com.didiyun.compute.v1.SgRuleInfoOrBuilder getDataOrBuilder(
      int index);
}
