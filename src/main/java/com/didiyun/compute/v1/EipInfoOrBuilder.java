// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface EipInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.EipInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *EIP
   * </pre>
   *
   * <code>string ip = 1;</code>
   * @return The ip.
   */
  java.lang.String getIp();
  /**
   * <pre>
   *EIP
   * </pre>
   *
   * <code>string ip = 1;</code>
   * @return The bytes for ip.
   */
  com.google.protobuf.ByteString
      getIpBytes();

  /**
   * <pre>
   *EIPUuid
   * </pre>
   *
   * <code>string eipUuid = 2;</code>
   * @return The eipUuid.
   */
  java.lang.String getEipUuid();
  /**
   * <pre>
   *EIPUuid
   * </pre>
   *
   * <code>string eipUuid = 2;</code>
   * @return The bytes for eipUuid.
   */
  com.google.protobuf.ByteString
      getEipUuidBytes();

  /**
   * <pre>
   *EIP Tag
   * </pre>
   *
   * <code>repeated string eipTags = 3;</code>
   * @return A list containing the eipTags.
   */
  java.util.List<java.lang.String>
      getEipTagsList();
  /**
   * <pre>
   *EIP Tag
   * </pre>
   *
   * <code>repeated string eipTags = 3;</code>
   * @return The count of eipTags.
   */
  int getEipTagsCount();
  /**
   * <pre>
   *EIP Tag
   * </pre>
   *
   * <code>repeated string eipTags = 3;</code>
   * @param index The index of the element to return.
   * @return The eipTags at the given index.
   */
  java.lang.String getEipTags(int index);
  /**
   * <pre>
   *EIP Tag
   * </pre>
   *
   * <code>repeated string eipTags = 3;</code>
   * @param index The index of the value to return.
   * @return The bytes of the eipTags at the given index.
   */
  com.google.protobuf.ByteString
      getEipTagsBytes(int index);

  /**
   * <pre>
   *EIP状态，Active为活跃状态，Inactive为停服状态
   * </pre>
   *
   * <code>string status = 4;</code>
   * @return The status.
   */
  java.lang.String getStatus();
  /**
   * <pre>
   *EIP状态，Active为活跃状态，Inactive为停服状态
   * </pre>
   *
   * <code>string status = 4;</code>
   * @return The bytes for status.
   */
  com.google.protobuf.ByteString
      getStatusBytes();

  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 5;</code>
   * @return Whether the region field is set.
   */
  boolean hasRegion();
  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 5;</code>
   * @return The region.
   */
  com.didiyun.base.v1.RegionInfo getRegion();
  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 5;</code>
   */
  com.didiyun.base.v1.RegionInfoOrBuilder getRegionOrBuilder();

  /**
   * <pre>
   *EIP创建时间
   * </pre>
   *
   * <code>int64 createTime = 6;</code>
   * @return The createTime.
   */
  long getCreateTime();

  /**
   * <pre>
   *EIP更新时间
   * </pre>
   *
   * <code>int64 updateTime = 7;</code>
   * @return The updateTime.
   */
  long getUpdateTime();

  /**
   * <pre>
   *与EIP关联的DC2信息，没有DC2则没有该字段
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 8;</code>
   * @return Whether the dc2 field is set.
   */
  boolean hasDc2();
  /**
   * <pre>
   *与EIP关联的DC2信息，没有DC2则没有该字段
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 8;</code>
   * @return The dc2.
   */
  com.didiyun.compute.v1.Dc2Info getDc2();
  /**
   * <pre>
   *与EIP关联的DC2信息，没有DC2则没有该字段
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 8;</code>
   */
  com.didiyun.compute.v1.Dc2InfoOrBuilder getDc2OrBuilder();

  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 9;</code>
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 9;</code>
   * @return The job.
   */
  com.didiyun.base.v1.JobInfo getJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 9;</code>
   */
  com.didiyun.base.v1.JobInfoOrBuilder getJobOrBuilder();
}
