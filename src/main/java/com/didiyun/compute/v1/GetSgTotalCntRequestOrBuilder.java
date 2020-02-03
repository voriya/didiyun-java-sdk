// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/sg.proto

package com.didiyun.compute.v1;

public interface GetSgTotalCntRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.GetSgTotalCntRequest)
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
   *查询此uuid集合下的SG数量
   * </pre>
   *
   * <code>repeated string sgUuids = 2;</code>
   * @return A list containing the sgUuids.
   */
  java.util.List<java.lang.String>
      getSgUuidsList();
  /**
   * <pre>
   *查询此uuid集合下的SG数量
   * </pre>
   *
   * <code>repeated string sgUuids = 2;</code>
   * @return The count of sgUuids.
   */
  int getSgUuidsCount();
  /**
   * <pre>
   *查询此uuid集合下的SG数量
   * </pre>
   *
   * <code>repeated string sgUuids = 2;</code>
   * @param index The index of the element to return.
   * @return The sgUuids at the given index.
   */
  java.lang.String getSgUuids(int index);
  /**
   * <pre>
   *查询此uuid集合下的SG数量
   * </pre>
   *
   * <code>repeated string sgUuids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the sgUuids at the given index.
   */
  com.google.protobuf.ByteString
      getSgUuidsBytes(int index);

  /**
   * <pre>
   *查询此uuid对应的VPC下的SG数量
   * </pre>
   *
   * <code>string vpcUuid = 3;</code>
   * @return The vpcUuid.
   */
  java.lang.String getVpcUuid();
  /**
   * <pre>
   *查询此uuid对应的VPC下的SG数量
   * </pre>
   *
   * <code>string vpcUuid = 3;</code>
   * @return The bytes for vpcUuid.
   */
  com.google.protobuf.ByteString
      getVpcUuidBytes();

  /**
   * <pre>
   *查询此uuid对应的DC2相关的SG数量
   * </pre>
   *
   * <code>string dc2Uuid = 4;</code>
   * @return The dc2Uuid.
   */
  java.lang.String getDc2Uuid();
  /**
   * <pre>
   *查询此uuid对应的DC2相关的SG数量
   * </pre>
   *
   * <code>string dc2Uuid = 4;</code>
   * @return The bytes for dc2Uuid.
   */
  com.google.protobuf.ByteString
      getDc2UuidBytes();

  /**
   * <pre>
   *与dc2Uuid配合使用，不传或传false，表示查询此DC2所绑定的SG数量，传true表示查询此DC2未绑定的SG数量
   * </pre>
   *
   * <code>bool dc2Exclude = 5;</code>
   * @return The dc2Exclude.
   */
  boolean getDc2Exclude();
}
