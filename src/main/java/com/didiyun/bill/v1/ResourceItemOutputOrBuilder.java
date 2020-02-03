// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: bill/v1/bill.proto

package com.didiyun.bill.v1;

public interface ResourceItemOutputOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.bill.v1.ResourceItemOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *资源uuid
   * </pre>
   *
   * <code>string resourceUuid = 1;</code>
   * @return The resourceUuid.
   */
  java.lang.String getResourceUuid();
  /**
   * <pre>
   *资源uuid
   * </pre>
   *
   * <code>string resourceUuid = 1;</code>
   * @return The bytes for resourceUuid.
   */
  com.google.protobuf.ByteString
      getResourceUuidBytes();

  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourcetype = 2;</code>
   * @return The resourcetype.
   */
  java.lang.String getResourcetype();
  /**
   * <pre>
   *资源类型
   * </pre>
   *
   * <code>string resourcetype = 2;</code>
   * @return The bytes for resourcetype.
   */
  com.google.protobuf.ByteString
      getResourcetypeBytes();

  /**
   * <pre>
   *资源对应规格信息，如Dc2Spec，EipSpec，EbsSpec
   * </pre>
   *
   * <code>.didi.cloud.bill.v1.ResourceSpec resourceSpec = 3;</code>
   * @return Whether the resourceSpec field is set.
   */
  boolean hasResourceSpec();
  /**
   * <pre>
   *资源对应规格信息，如Dc2Spec，EipSpec，EbsSpec
   * </pre>
   *
   * <code>.didi.cloud.bill.v1.ResourceSpec resourceSpec = 3;</code>
   * @return The resourceSpec.
   */
  com.didiyun.bill.v1.ResourceSpec getResourceSpec();
  /**
   * <pre>
   *资源对应规格信息，如Dc2Spec，EipSpec，EbsSpec
   * </pre>
   *
   * <code>.didi.cloud.bill.v1.ResourceSpec resourceSpec = 3;</code>
   */
  com.didiyun.bill.v1.ResourceSpecOrBuilder getResourceSpecOrBuilder();
}
