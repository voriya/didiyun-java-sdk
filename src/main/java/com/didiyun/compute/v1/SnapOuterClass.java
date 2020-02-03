// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: compute/v1/snap.proto

package com.didiyun.compute.v1;

public final class SnapOuterClass {
  private SnapOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ListSnapshotRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ListSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ListSnapshotCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ListSnapshotCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ListSnapshotResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ListSnapshotResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_CreateSnapshotRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_CreateSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_CreateSnapshotResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_CreateSnapshotResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_Input_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_Input_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_DeleteSnapshotResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_DeleteSnapshotResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_Input_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_Input_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_RevertSnapshotResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_RevertSnapshotResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_Input_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_Input_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_didi_cloud_compute_v1_ChangeSnapshotNameResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025compute/v1/snap.proto\022\025didi.cloud.comp" +
      "ute.v1\032\022base/v1/base.proto\032\027compute/v1/c" +
      "ommon.proto\032\034google/api/annotations.prot" +
      "o\"\262\001\n\023ListSnapshotRequest\022*\n\006header\030\001 \001(" +
      "\0132\032.didi.cloud.base.v1.Header\022\r\n\005start\030\002" +
      " \001(\005\022\r\n\005limit\030\003 \001(\005\022\020\n\010simplify\030\004 \001(\010\022?\n" +
      "\tcondition\030\005 \001(\0132,.didi.cloud.compute.v1" +
      ".ListSnapshotCondition\"K\n\025ListSnapshotCo" +
      "ndition\022\017\n\007ebsUuid\030\001 \001(\t\022\020\n\010snapName\030\002 \001" +
      "(\t\022\017\n\007dc2Uuid\030\003 \001(\t\"o\n\024ListSnapshotRespo" +
      "nse\022(\n\005error\030\001 \001(\0132\031.didi.cloud.base.v1." +
      "Error\022-\n\004data\030\002 \003(\0132\037.didi.cloud.compute" +
      ".v1.SnapInfo\"|\n\032GetSnapshotTotalCntReque" +
      "st\022*\n\006header\030\001 \001(\0132\032.didi.cloud.base.v1." +
      "Header\022\017\n\007ebsUuid\030\002 \001(\t\022\020\n\010snapName\030\003 \001(" +
      "\t\022\017\n\007dc2Uuid\030\004 \001(\t\"z\n\033GetSnapshotTotalCn" +
      "tResponse\022(\n\005error\030\001 \001(\0132\031.didi.cloud.ba" +
      "se.v1.Error\0221\n\004data\030\002 \003(\0132#.didi.cloud.c" +
      "ompute.v1.TotalCntInfo\"w\n\025CreateSnapshot" +
      "Request\022*\n\006header\030\001 \001(\0132\032.didi.cloud.bas" +
      "e.v1.Header\022\017\n\007dc2Uuid\030\002 \001(\t\022\017\n\007ebsUuid\030" +
      "\003 \001(\t\022\020\n\010snapName\030\004 \001(\t\"m\n\026CreateSnapsho" +
      "tResponse\022(\n\005error\030\001 \001(\0132\031.didi.cloud.ba" +
      "se.v1.Error\022)\n\004data\030\002 \003(\0132\033.didi.cloud.b" +
      "ase.v1.JobInfo\"\240\001\n\025DeleteSnapshotRequest" +
      "\022*\n\006header\030\001 \001(\0132\032.didi.cloud.base.v1.He" +
      "ader\022@\n\004snap\030\002 \003(\01322.didi.cloud.compute." +
      "v1.DeleteSnapshotRequest.Input\032\031\n\005Input\022" +
      "\020\n\010snapUuid\030\001 \001(\t\"m\n\026DeleteSnapshotRespo" +
      "nse\022(\n\005error\030\001 \001(\0132\031.didi.cloud.base.v1." +
      "Error\022)\n\004data\030\002 \003(\0132\033.didi.cloud.base.v1" +
      ".JobInfo\"\303\001\n\025RevertSnapshotRequest\022*\n\006he" +
      "ader\030\001 \001(\0132\032.didi.cloud.base.v1.Header\022@" +
      "\n\004snap\030\002 \003(\01322.didi.cloud.compute.v1.Rev" +
      "ertSnapshotRequest.Input\022\017\n\007stopDc2\030\003 \001(" +
      "\010\022\020\n\010startDc2\030\004 \001(\010\032\031\n\005Input\022\020\n\010snapUuid" +
      "\030\001 \001(\t\"m\n\026RevertSnapshotResponse\022(\n\005erro" +
      "r\030\001 \001(\0132\031.didi.cloud.base.v1.Error\022)\n\004da" +
      "ta\030\002 \003(\0132\033.didi.cloud.base.v1.JobInfo\"\331\001" +
      "\n\031ChangeSnapshotNameRequest\022*\n\006header\030\001 " +
      "\001(\0132\032.didi.cloud.base.v1.Header\022D\n\004snap\030" +
      "\002 \003(\01326.didi.cloud.compute.v1.ChangeSnap" +
      "shotNameRequest.Input\022\017\n\007stopDc2\030\003 \001(\010\022\020" +
      "\n\010startDc2\030\004 \001(\010\032\'\n\005Input\022\020\n\010snapUuid\030\001 " +
      "\001(\t\022\014\n\004name\030\002 \001(\t\"q\n\032ChangeSnapshotNameR" +
      "esponse\022(\n\005error\030\001 \001(\0132\031.didi.cloud.base" +
      ".v1.Error\022)\n\004data\030\002 \003(\0132\033.didi.cloud.bas" +
      "e.v1.JobInfo2\276\007\n\004Snap\022\220\001\n\014ListSnapshot\022*" +
      ".didi.cloud.compute.v1.ListSnapshotReque" +
      "st\032+.didi.cloud.compute.v1.ListSnapshotR" +
      "esponse\"\'\202\323\344\223\002!\"\037dicloud/i/storage/snaps" +
      "hot/list\022\246\001\n\023GetSnapshotTotalCnt\0221.didi." +
      "cloud.compute.v1.GetSnapshotTotalCntRequ" +
      "est\0322.didi.cloud.compute.v1.GetSnapshotT" +
      "otalCntResponse\"(\202\323\344\223\002\"\" dicloud/i/stora" +
      "ge/snapshot/count\022\230\001\n\016CreateSnapshot\022,.d" +
      "idi.cloud.compute.v1.CreateSnapshotReque" +
      "st\032-.didi.cloud.compute.v1.CreateSnapsho" +
      "tResponse\")\202\323\344\223\002#\"!dicloud/i/storage/sna" +
      "pshot/assign\022\230\001\n\016DeleteSnapshot\022,.didi.c" +
      "loud.compute.v1.DeleteSnapshotRequest\032-." +
      "didi.cloud.compute.v1.DeleteSnapshotResp" +
      "onse\")\202\323\344\223\002#\"!dicloud/i/storage/snapshot" +
      "/delete\022\230\001\n\016RevertSnapshot\022,.didi.cloud." +
      "compute.v1.RevertSnapshotRequest\032-.didi." +
      "cloud.compute.v1.RevertSnapshotResponse\"" +
      ")\202\323\344\223\002#\"!dicloud/i/storage/snapshot/reve" +
      "rt\022\250\001\n\022ChangeSnapshotName\0220.didi.cloud.c" +
      "ompute.v1.ChangeSnapshotNameRequest\0321.di" +
      "di.cloud.compute.v1.ChangeSnapshotNameRe" +
      "sponse\"-\202\323\344\223\002\'\"%dicloud/i/storage/snapsh" +
      "ot/changeNameB\207\001\n\026com.didiyun.compute.v1" +
      "P\001Z4github.com/didiyun/didiyun-go-sdk/co" +
      "mpute/v1;compute\370\001\001\252\002\027Didi.Dicloud.Compu" +
      "te.V1\312\002\027Didi\\Dicloud\\Compute\\V1b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.didiyun.base.v1.Base.getDescriptor(),
          com.didiyun.compute.v1.CommonOuterClass.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_didi_cloud_compute_v1_ListSnapshotRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_didi_cloud_compute_v1_ListSnapshotRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ListSnapshotRequest_descriptor,
        new java.lang.String[] { "Header", "Start", "Limit", "Simplify", "Condition", });
    internal_static_didi_cloud_compute_v1_ListSnapshotCondition_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_didi_cloud_compute_v1_ListSnapshotCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ListSnapshotCondition_descriptor,
        new java.lang.String[] { "EbsUuid", "SnapName", "Dc2Uuid", });
    internal_static_didi_cloud_compute_v1_ListSnapshotResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_didi_cloud_compute_v1_ListSnapshotResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ListSnapshotResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntRequest_descriptor,
        new java.lang.String[] { "Header", "EbsUuid", "SnapName", "Dc2Uuid", });
    internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_GetSnapshotTotalCntResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_didi_cloud_compute_v1_CreateSnapshotRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_didi_cloud_compute_v1_CreateSnapshotRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_CreateSnapshotRequest_descriptor,
        new java.lang.String[] { "Header", "Dc2Uuid", "EbsUuid", "SnapName", });
    internal_static_didi_cloud_compute_v1_CreateSnapshotResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_didi_cloud_compute_v1_CreateSnapshotResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_CreateSnapshotResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_descriptor,
        new java.lang.String[] { "Header", "Snap", });
    internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_Input_descriptor =
      internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_descriptor.getNestedTypes().get(0);
    internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_Input_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_DeleteSnapshotRequest_Input_descriptor,
        new java.lang.String[] { "SnapUuid", });
    internal_static_didi_cloud_compute_v1_DeleteSnapshotResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_didi_cloud_compute_v1_DeleteSnapshotResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_DeleteSnapshotResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_descriptor,
        new java.lang.String[] { "Header", "Snap", "StopDc2", "StartDc2", });
    internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_Input_descriptor =
      internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_descriptor.getNestedTypes().get(0);
    internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_Input_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_RevertSnapshotRequest_Input_descriptor,
        new java.lang.String[] { "SnapUuid", });
    internal_static_didi_cloud_compute_v1_RevertSnapshotResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_didi_cloud_compute_v1_RevertSnapshotResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_RevertSnapshotResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_descriptor,
        new java.lang.String[] { "Header", "Snap", "StopDc2", "StartDc2", });
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_Input_descriptor =
      internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_descriptor.getNestedTypes().get(0);
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_Input_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ChangeSnapshotNameRequest_Input_descriptor,
        new java.lang.String[] { "SnapUuid", "Name", });
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_didi_cloud_compute_v1_ChangeSnapshotNameResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_didi_cloud_compute_v1_ChangeSnapshotNameResponse_descriptor,
        new java.lang.String[] { "Error", "Data", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.didiyun.base.v1.Base.getDescriptor();
    com.didiyun.compute.v1.CommonOuterClass.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
