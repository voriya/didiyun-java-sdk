// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/eip.proto

package com.didiyun.compute.v1;

public interface AttachEipToDc2RequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.AttachEipToDc2Request)
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
   * <code>repeated .didi.cloud.compute.v1.AttachEipToDc2Request.Input eip = 2;</code>
   */
  java.util.List<com.didiyun.compute.v1.AttachEipToDc2Request.Input> 
      getEipList();
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEipToDc2Request.Input eip = 2;</code>
   */
  com.didiyun.compute.v1.AttachEipToDc2Request.Input getEip(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEipToDc2Request.Input eip = 2;</code>
   */
  int getEipCount();
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEipToDc2Request.Input eip = 2;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.AttachEipToDc2Request.InputOrBuilder> 
      getEipOrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.AttachEipToDc2Request.Input eip = 2;</code>
   */
  com.didiyun.compute.v1.AttachEipToDc2Request.InputOrBuilder getEipOrBuilder(
      int index);
}
