// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface SnapInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.SnapInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *快照唯一标识
   * </pre>
   *
   * <code>string snapUuid = 1;</code>
   */
  java.lang.String getSnapUuid();
  /**
   * <pre>
   *快照唯一标识
   * </pre>
   *
   * <code>string snapUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getSnapUuidBytes();

  /**
   * <pre>
   *快照名称
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *快照名称
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *是否可用于还原
   * </pre>
   *
   * <code>bool canBeReverted = 3;</code>
   */
  boolean getCanBeReverted();

  /**
   * <pre>
   *是否是通用系列（e1,g1,g2）DC2快照(通用系列DC2快照目前只支持用于创建通用系列DC2)
   * </pre>
   *
   * <code>bool isGeneral = 4;</code>
   */
  boolean getIsGeneral();

  /**
   * <pre>
   *创建时间
   * </pre>
   *
   * <code>int64 createTime = 5;</code>
   */
  long getCreateTime();

  /**
   * <pre>
   *更新时间
   * </pre>
   *
   * <code>int64 updateTime = 6;</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   *快照大小
   * </pre>
   *
   * <code>int64 size = 7;</code>
   */
  long getSize();

  /**
   * <pre>
   *快照类型，为"Root"为系统盘快照，为"Data"为数据盘快照，只有系统盘快照可以用于创建新的DC2
   * </pre>
   *
   * <code>string type = 8;</code>
   */
  java.lang.String getType();
  /**
   * <pre>
   *快照类型，为"Root"为系统盘快照，为"Data"为数据盘快照，只有系统盘快照可以用于创建新的DC2
   * </pre>
   *
   * <code>string type = 8;</code>
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   *与快照关联的DC2
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 9;</code>
   */
  boolean hasDc2();
  /**
   * <pre>
   *与快照关联的DC2
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 9;</code>
   */
  com.didiyun.compute.v1.Dc2Info getDc2();
  /**
   * <pre>
   *与快照关联的DC2
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.Dc2Info dc2 = 9;</code>
   */
  com.didiyun.compute.v1.Dc2InfoOrBuilder getDc2OrBuilder();

  /**
   * <pre>
   *与快照关联的EBS
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.EbsInfo ebs = 10;</code>
   */
  boolean hasEbs();
  /**
   * <pre>
   *与快照关联的EBS
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.EbsInfo ebs = 10;</code>
   */
  com.didiyun.compute.v1.EbsInfo getEbs();
  /**
   * <pre>
   *与快照关联的EBS
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.EbsInfo ebs = 10;</code>
   */
  com.didiyun.compute.v1.EbsInfoOrBuilder getEbsOrBuilder();

  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 11;</code>
   */
  boolean hasRegion();
  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 11;</code>
   */
  com.didiyun.base.v1.RegionInfo getRegion();
  /**
   * <pre>
   *region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 11;</code>
   */
  com.didiyun.base.v1.RegionInfoOrBuilder getRegionOrBuilder();

  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 12;</code>
   */
  boolean hasJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 12;</code>
   */
  com.didiyun.base.v1.JobInfo getJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 12;</code>
   */
  com.didiyun.base.v1.JobInfoOrBuilder getJobOrBuilder();
}
