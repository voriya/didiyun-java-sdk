// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

public interface CreateVpcRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.CreateVpcRequest)
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
   *vpc名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   *vpc名称
   * </pre>
   *
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *vpc网段
   * </pre>
   *
   * <code>string cidr = 3;</code>
   * @return The cidr.
   */
  java.lang.String getCidr();
  /**
   * <pre>
   *vpc网段
   * </pre>
   *
   * <code>string cidr = 3;</code>
   * @return The bytes for cidr.
   */
  com.google.protobuf.ByteString
      getCidrBytes();

  /**
   * <pre>
   *同时创建的子网
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSubnetInput subnet = 4;</code>
   */
  java.util.List<com.didiyun.compute.v1.CreateSubnetInput> 
      getSubnetList();
  /**
   * <pre>
   *同时创建的子网
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSubnetInput subnet = 4;</code>
   */
  com.didiyun.compute.v1.CreateSubnetInput getSubnet(int index);
  /**
   * <pre>
   *同时创建的子网
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSubnetInput subnet = 4;</code>
   */
  int getSubnetCount();
  /**
   * <pre>
   *同时创建的子网
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSubnetInput subnet = 4;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.CreateSubnetInputOrBuilder> 
      getSubnetOrBuilderList();
  /**
   * <pre>
   *同时创建的子网
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.CreateSubnetInput subnet = 4;</code>
   */
  com.didiyun.compute.v1.CreateSubnetInputOrBuilder getSubnetOrBuilder(
      int index);
}
