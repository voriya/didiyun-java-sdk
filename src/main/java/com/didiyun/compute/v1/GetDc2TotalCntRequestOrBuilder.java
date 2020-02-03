// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/dc2.proto

package com.didiyun.compute.v1;

public interface GetDc2TotalCntRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.GetDc2TotalCntRequest)
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
   *精确匹配内网IP
   * </pre>
   *
   * <code>string ip = 2;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <pre>
   *精确匹配内网IP
   * </pre>
   *
   * <code>string ip = 2;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <pre>
   *精确匹配公司EIP
   * </pre>
   *
   * <code>string eip = 3;</code>
   * @return The eip.
   */
  java.lang.String getEip();
  /**
   * <pre>
   *精确匹配公司EIP
   * </pre>
   *
   * <code>string eip = 3;</code>
   * @return The bytes for eip.
   */
  com.google.protobuf.ByteString
      getEipBytes();

  /**
   * <pre>
   *模糊匹配dc2名字
   * </pre>
   *
   * <code>string dc2name = 4;</code>
   * @return The dc2name.
   */
  java.lang.String getDc2Name();
  /**
   * <pre>
   *模糊匹配dc2名字
   * </pre>
   *
   * <code>string dc2name = 4;</code>
   * @return The bytes for dc2name.
   */
  com.google.protobuf.ByteString
      getDc2NameBytes();

  /**
   * <pre>
   *查询对应vpc列表下的dc2, vpc UUID支持
   * </pre>
   *
   * <code>repeated string vpcUuids = 5;</code>
   * @return A list containing the vpcUuids.
   */
  java.util.List<java.lang.String>
      getVpcUuidsList();
  /**
   * <pre>
   *查询对应vpc列表下的dc2, vpc UUID支持
   * </pre>
   *
   * <code>repeated string vpcUuids = 5;</code>
   * @return The count of vpcUuids.
   */
  int getVpcUuidsCount();
  /**
   * <pre>
   *查询对应vpc列表下的dc2, vpc UUID支持
   * </pre>
   *
   * <code>repeated string vpcUuids = 5;</code>
   * @param index The index of the element to return.
   * @return The vpcUuids at the given index.
   */
  java.lang.String getVpcUuids(int index);
  /**
   * <pre>
   *查询对应vpc列表下的dc2, vpc UUID支持
   * </pre>
   *
   * <code>repeated string vpcUuids = 5;</code>
   * @param index The index of the value to return.
   * @return The bytes of the vpcUuids at the given index.
   */
  com.google.protobuf.ByteString
      getVpcUuidsBytes(int index);

  /**
   * <pre>
   *查询指定vpc下的dc2，vpc UUID支持
   * </pre>
   *
   * <code>string vpcUuid = 6;</code>
   * @return The vpcUuid.
   */
  java.lang.String getVpcUuid();
  /**
   * <pre>
   *查询指定vpc下的dc2，vpc UUID支持
   * </pre>
   *
   * <code>string vpcUuid = 6;</code>
   * @return The bytes for vpcUuid.
   */
  com.google.protobuf.ByteString
      getVpcUuidBytes();

  /**
   * <pre>
   *查询指定安全组下的dc2，sg UUID支持
   * </pre>
   *
   * <code>string sgUuid = 7;</code>
   * @return The sgUuid.
   */
  java.lang.String getSgUuid();
  /**
   * <pre>
   *查询指定安全组下的dc2，sg UUID支持
   * </pre>
   *
   * <code>string sgUuid = 7;</code>
   * @return The bytes for sgUuid.
   */
  com.google.protobuf.ByteString
      getSgUuidBytes();

  /**
   * <pre>
   *查询不在此sg下的dc2,默认为true, 需要与sgUuuid配合使用
   * </pre>
   *
   * <code>bool sgExclude = 8;</code>
   * @return The sgExclude.
   */
  boolean getSgExclude();

  /**
   * <pre>
   *查询指定dc2的信息,UUID
   * </pre>
   *
   * <code>repeated string dc2Uuids = 9;</code>
   * @return A list containing the dc2Uuids.
   */
  java.util.List<java.lang.String>
      getDc2UuidsList();
  /**
   * <pre>
   *查询指定dc2的信息,UUID
   * </pre>
   *
   * <code>repeated string dc2Uuids = 9;</code>
   * @return The count of dc2Uuids.
   */
  int getDc2UuidsCount();
  /**
   * <pre>
   *查询指定dc2的信息,UUID
   * </pre>
   *
   * <code>repeated string dc2Uuids = 9;</code>
   * @param index The index of the element to return.
   * @return The dc2Uuids at the given index.
   */
  java.lang.String getDc2Uuids(int index);
  /**
   * <pre>
   *查询指定dc2的信息,UUID
   * </pre>
   *
   * <code>repeated string dc2Uuids = 9;</code>
   * @param index The index of the value to return.
   * @return The bytes of the dc2Uuids at the given index.
   */
  com.google.protobuf.ByteString
      getDc2UuidsBytes(int index);
}
