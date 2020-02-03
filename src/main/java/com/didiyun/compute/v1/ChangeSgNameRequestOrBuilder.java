// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

public interface ChangeSgNameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ChangeSgNameRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   * @return The header.
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   *需要改名的Sg的信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.ChangeSgNameRequest.Input sg = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.ChangeSgNameRequest.Input> 
      getSgList();
  /**
   * <pre>
   *需要改名的Sg的信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.ChangeSgNameRequest.Input sg = 2;</code>
   */
  com.didiyun.compute.v1.ChangeSgNameRequest.Input getSg(int index);
  /**
   * <pre>
   *需要改名的Sg的信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.ChangeSgNameRequest.Input sg = 2;</code>
   */
  int getSgCount();
  /**
   * <pre>
   *需要改名的Sg的信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.ChangeSgNameRequest.Input sg = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.ChangeSgNameRequest.InputOrBuilder> 
      getSgOrBuilderList();
  /**
   * <pre>
   *需要改名的Sg的信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.ChangeSgNameRequest.Input sg = 2;</code>
   */
  com.didiyun.compute.v1.ChangeSgNameRequest.InputOrBuilder getSgOrBuilder(
      int index);
}
