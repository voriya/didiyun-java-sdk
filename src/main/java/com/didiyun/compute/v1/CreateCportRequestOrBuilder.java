// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/cport.proto

package com.didiyun.compute.v1;

public interface CreateCportRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateCportRequest)
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
   * <code>.didi.cloud.compute.v1.CreateCportRequest.Input cport = 2;</code>
   * @return Whether the cport field is set.
   */
  boolean hasCport();
  /**
   * <code>.didi.cloud.compute.v1.CreateCportRequest.Input cport = 2;</code>
   * @return The cport.
   */
  com.didiyun.compute.v1.CreateCportRequest.Input getCport();
  /**
   * <code>.didi.cloud.compute.v1.CreateCportRequest.Input cport = 2;</code>
   */
  com.didiyun.compute.v1.CreateCportRequest.InputOrBuilder getCportOrBuilder();
}