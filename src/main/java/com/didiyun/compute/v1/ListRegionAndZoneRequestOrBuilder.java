// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface ListRegionAndZoneRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListRegionAndZoneRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  boolean hasHeader();
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <code>.didi.cloud.compute.v1.ListRegionAndZoneRequest.Condition condition = 2;</code>
   */
  boolean hasCondition();
  /**
   * <code>.didi.cloud.compute.v1.ListRegionAndZoneRequest.Condition condition = 2;</code>
   */
  com.didiyun.compute.v1.ListRegionAndZoneRequest.Condition getCondition();
  /**
   * <code>.didi.cloud.compute.v1.ListRegionAndZoneRequest.Condition condition = 2;</code>
   */
  com.didiyun.compute.v1.ListRegionAndZoneRequest.ConditionOrBuilder getConditionOrBuilder();
}
