// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/cport.proto

package com.didiyun.compute.v1;

public interface ListCportConditionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.ListCportCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *查询的cportUuid集合
   * </pre>
   *
   * <code>repeated string cportUuids = 1;</code>
   * @return A list containing the cportUuids.
   */
  java.util.List<java.lang.String>
      getCportUuidsList();
  /**
   * <pre>
   *查询的cportUuid集合
   * </pre>
   *
   * <code>repeated string cportUuids = 1;</code>
   * @return The count of cportUuids.
   */
  int getCportUuidsCount();
  /**
   * <pre>
   *查询的cportUuid集合
   * </pre>
   *
   * <code>repeated string cportUuids = 1;</code>
   * @param index The index of the element to return.
   * @return The cportUuids at the given index.
   */
  java.lang.String getCportUuids(int index);
  /**
   * <pre>
   *查询的cportUuid集合
   * </pre>
   *
   * <code>repeated string cportUuids = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the cportUuids at the given index.
   */
  com.google.protobuf.ByteString
      getCportUuidsBytes(int index);

  /**
   * <pre>
   *是否排除此cportUuid集合
   * </pre>
   *
   * <code>bool cportExclude = 2;</code>
   * @return The cportExclude.
   */
  boolean getCportExclude();
}