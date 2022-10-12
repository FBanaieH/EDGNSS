// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FlowRuleProto.proto

package org.onosproject.grpc.models;

public interface FlowRuleProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:proto.FlowRuleProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 priority = 1;</code>
   */
  int getPriority();

  /**
   * <code>int32 app_id = 2;</code>
   */
  int getAppId();

  /**
   * <code>string device_id = 3;</code>
   */
  java.lang.String getDeviceId();
  /**
   * <code>string device_id = 3;</code>
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();

  /**
   * <code>int64 flow_id = 4;</code>
   */
  long getFlowId();

  /**
   * <code>int32 timeout = 5;</code>
   */
  int getTimeout();

  /**
   * <code>bool permanent = 6;</code>
   */
  boolean getPermanent();

  /**
   * <code>int32 table_id = 7;</code>
   */
  int getTableId();

  /**
   * <code>string table_name = 8;</code>
   */
  java.lang.String getTableName();
  /**
   * <code>string table_name = 8;</code>
   */
  com.google.protobuf.ByteString
      getTableNameBytes();

  /**
   * <code>.proto.TrafficSelectorProto selector = 9;</code>
   */
  boolean hasSelector();
  /**
   * <code>.proto.TrafficSelectorProto selector = 9;</code>
   */
  org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProto getSelector();
  /**
   * <code>.proto.TrafficSelectorProto selector = 9;</code>
   */
  org.onosproject.grpc.models.TrafficSelectorProtoOuterClass.TrafficSelectorProtoOrBuilder getSelectorOrBuilder();

  /**
   * <code>.proto.TrafficTreatmentProto treatment = 10;</code>
   */
  boolean hasTreatment();
  /**
   * <code>.proto.TrafficTreatmentProto treatment = 10;</code>
   */
  org.onosproject.grpc.models.TrafficTreatmentProtoOuterClass.TrafficTreatmentProto getTreatment();
  /**
   * <code>.proto.TrafficTreatmentProto treatment = 10;</code>
   */
  org.onosproject.grpc.models.TrafficTreatmentProtoOuterClass.TrafficTreatmentProtoOrBuilder getTreatmentOrBuilder();

  /**
   * <code>.proto.FlowRemoveReasonProto reason = 11;</code>
   */
  int getReasonValue();
  /**
   * <code>.proto.FlowRemoveReasonProto reason = 11;</code>
   */
  org.onosproject.grpc.models.FlowRuleEnumsProto.FlowRemoveReasonProto getReason();

  /**
   * <code>string app_name = 12;</code>
   */
  java.lang.String getAppName();
  /**
   * <code>string app_name = 12;</code>
   */
  com.google.protobuf.ByteString
      getAppNameBytes();
}