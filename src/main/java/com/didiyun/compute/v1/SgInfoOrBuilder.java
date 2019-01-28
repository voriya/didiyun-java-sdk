// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface SgInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.SgInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *Sg唯一标识
   * </pre>
   *
   * <code>string sgUuid = 1;</code>
   */
  java.lang.String getSgUuid();
  /**
   * <pre>
   *Sg唯一标识
   * </pre>
   *
   * <code>string sgUuid = 1;</code>
   */
  com.google.protobuf.ByteString
      getSgUuidBytes();

  /**
   * <pre>
   *Sg名称
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   *Sg名称
   * </pre>
   *
   * <code>string name = 2;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *Sg创建时间
   * </pre>
   *
   * <code>int64 createTime = 3;</code>
   */
  long getCreateTime();

  /**
   * <pre>
   *Sg更新时间
   * </pre>
   *
   * <code>int64 updateTime = 4;</code>
   */
  long getUpdateTime();

  /**
   * <pre>
   *Sg是否是当前VPC下的默认Sg
   * </pre>
   *
   * <code>bool isDefault = 5;</code>
   */
  boolean getIsDefault();

  /**
   * <pre>
   *Sg绑定的DC2数量
   * </pre>
   *
   * <code>int64 dc2Cnt = 6;</code>
   */
  long getDc2Cnt();

  /**
   * <pre>
   *Sg包含的Sg规则数量
   * </pre>
   *
   * <code>int64 sgRuleCnt = 7;</code>
   */
  long getSgRuleCnt();

  /**
   * <pre>
   *Sg所属的VPC信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.VpcInfo vpc = 8;</code>
   */
  boolean hasVpc();
  /**
   * <pre>
   *Sg所属的VPC信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.VpcInfo vpc = 8;</code>
   */
  com.didiyun.compute.v1.VpcInfo getVpc();
  /**
   * <pre>
   *Sg所属的VPC信息
   * </pre>
   *
   * <code>.didi.cloud.compute.v1.VpcInfo vpc = 8;</code>
   */
  com.didiyun.compute.v1.VpcInfoOrBuilder getVpcOrBuilder();

  /**
   * <pre>
   *Sg所在的Region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 9;</code>
   */
  boolean hasRegion();
  /**
   * <pre>
   *Sg所在的Region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 9;</code>
   */
  com.didiyun.base.v1.RegionInfo getRegion();
  /**
   * <pre>
   *Sg所在的Region信息
   * </pre>
   *
   * <code>.didi.cloud.base.v1.RegionInfo region = 9;</code>
   */
  com.didiyun.base.v1.RegionInfoOrBuilder getRegionOrBuilder();

  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 10;</code>
   */
  boolean hasJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 10;</code>
   */
  com.didiyun.base.v1.JobInfo getJob();
  /**
   * <pre>
   *任务
   * </pre>
   *
   * <code>.didi.cloud.base.v1.JobInfo job = 10;</code>
   */
  com.didiyun.base.v1.JobInfoOrBuilder getJobOrBuilder();
}