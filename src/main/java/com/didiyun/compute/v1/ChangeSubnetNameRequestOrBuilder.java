// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

public interface ChangeSubnetNameRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ChangeSubnetNameRequest)
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
   *待改名的Subnet所在vpc的Uuid
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   * @return The vpcUuid.
   */
  java.lang.String getVpcUuid();
  /**
   * <pre>
   *待改名的Subnet所在vpc的Uuid
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   * @return The bytes for vpcUuid.
   */
  com.google.protobuf.ByteString
      getVpcUuidBytes();

  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeSubnetNameRequest.Input subnet = 3;</code>
   */
  java.util.List<com.didiyun.compute.v1.ChangeSubnetNameRequest.Input> 
      getSubnetList();
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeSubnetNameRequest.Input subnet = 3;</code>
   */
  com.didiyun.compute.v1.ChangeSubnetNameRequest.Input getSubnet(int index);
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeSubnetNameRequest.Input subnet = 3;</code>
   */
  int getSubnetCount();
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeSubnetNameRequest.Input subnet = 3;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.ChangeSubnetNameRequest.InputOrBuilder> 
      getSubnetOrBuilderList();
  /**
   * <code>repeated .didi.cloud.compute.v1.ChangeSubnetNameRequest.Input subnet = 3;</code>
   */
  com.didiyun.compute.v1.ChangeSubnetNameRequest.InputOrBuilder getSubnetOrBuilder(
      int index);
}
