// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/common.proto

package com.didiyun.compute.v1;

public interface JobResultRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:didi.cloud.compute.v1.JobResultRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   * @return Whether the header field is set.
   */
  boolean hasHeader();
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   * @return The header.
   */
  com.didiyun.base.v1.Header getHeader();
  /**
   * <code>.didi.cloud.base.v1.Header header = 1;</code>
   */
  com.didiyun.base.v1.HeaderOrBuilder getHeaderOrBuilder();

  /**
   * <pre>
   *查询任务的uuid
   * </pre>
   *
   * <code>repeated string jobUuids = 2;</code>
   * @return A list containing the jobUuids.
   */
  java.util.List<java.lang.String>
      getJobUuidsList();
  /**
   * <pre>
   *查询任务的uuid
   * </pre>
   *
   * <code>repeated string jobUuids = 2;</code>
   * @return The count of jobUuids.
   */
  int getJobUuidsCount();
  /**
   * <pre>
   *查询任务的uuid
   * </pre>
   *
   * <code>repeated string jobUuids = 2;</code>
   * @param index The index of the element to return.
   * @return The jobUuids at the given index.
   */
  java.lang.String getJobUuids(int index);
  /**
   * <pre>
   *查询任务的uuid
   * </pre>
   *
   * <code>repeated string jobUuids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the jobUuids at the given index.
   */
  com.google.protobuf.ByteString
      getJobUuidsBytes(int index);
}
