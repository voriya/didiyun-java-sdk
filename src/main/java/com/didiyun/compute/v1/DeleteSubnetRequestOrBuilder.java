// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

public interface DeleteSubnetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.DeleteSubnetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <pre>
   *公共的请求头
   * </pre>
   *
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
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
   *要删除哪个VPC下的SUBNET
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   */
  java.lang.String getVpcUuid();
  /**
   * <pre>
   *要删除哪个VPC下的SUBNET
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   */
  com.google.protobuf.ByteString
      getVpcUuidBytes();

  /**
   * <pre>
   *要删除的subnet信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.DeleteSubnetRequest.Input subnet = 3;</code>
   */
  java.util.List<com.didiyun.compute.v1.DeleteSubnetRequest.Input> 
      getSubnetList();
  /**
   * <pre>
   *要删除的subnet信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.DeleteSubnetRequest.Input subnet = 3;</code>
   */
  com.didiyun.compute.v1.DeleteSubnetRequest.Input getSubnet(int index);
  /**
   * <pre>
   *要删除的subnet信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.DeleteSubnetRequest.Input subnet = 3;</code>
   */
  int getSubnetCount();
  /**
   * <pre>
   *要删除的subnet信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.DeleteSubnetRequest.Input subnet = 3;</code>
   */
  java.util.List<? extends com.didiyun.compute.v1.DeleteSubnetRequest.InputOrBuilder> 
      getSubnetOrBuilderList();
  /**
   * <pre>
   *要删除的subnet信息
   * </pre>
   *
   * <code>repeated .didi.cloud.compute.v1.DeleteSubnetRequest.Input subnet = 3;</code>
   */
  com.didiyun.compute.v1.DeleteSubnetRequest.InputOrBuilder getSubnetOrBuilder(
      int index);
}
