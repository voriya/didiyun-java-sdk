// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/vpc.proto

package com.didiyun.compute.v1;

public interface GetSubnetByUuidRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.GetSubnetByUuidRequest)
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
   *查询此VPC下的Subnet
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   * @return The vpcUuid.
   */
  java.lang.String getVpcUuid();
  /**
   * <pre>
   *查询此VPC下的Subnet
   * </pre>
   *
   * <code>string vpcUuid = 2;</code>
   * @return The bytes for vpcUuid.
   */
  com.google.protobuf.ByteString
      getVpcUuidBytes();

  /**
   * <pre>
   *Subnet的唯一标识
   * </pre>
   *
   * <code>string subnetUuid = 3;</code>
   * @return The subnetUuid.
   */
  java.lang.String getSubnetUuid();
  /**
   * <pre>
   *Subnet的唯一标识
   * </pre>
   *
   * <code>string subnetUuid = 3;</code>
   * @return The bytes for subnetUuid.
   */
  com.google.protobuf.ByteString
      getSubnetUuidBytes();
}
