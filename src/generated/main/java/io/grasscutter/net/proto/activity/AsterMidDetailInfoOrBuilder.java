// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface AsterMidDetailInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AsterMidDetailInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .AsterMidCampInfo camp_list = 5;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.AsterMidCampInfo> 
      getCampListList();
  /**
   * <code>repeated .AsterMidCampInfo camp_list = 5;</code>
   */
  io.grasscutter.net.proto.activity.AsterMidCampInfo getCampList(int index);
  /**
   * <code>repeated .AsterMidCampInfo camp_list = 5;</code>
   */
  int getCampListCount();
  /**
   * <code>repeated .AsterMidCampInfo camp_list = 5;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.AsterMidCampInfoOrBuilder> 
      getCampListOrBuilderList();
  /**
   * <code>repeated .AsterMidCampInfo camp_list = 5;</code>
   */
  io.grasscutter.net.proto.activity.AsterMidCampInfoOrBuilder getCampListOrBuilder(
      int index);

  /**
   * <code>uint32 collect_count = 11;</code>
   * @return The collectCount.
   */
  int getCollectCount();

  /**
   * <code>bool is_open = 13;</code>
   * @return The isOpen.
   */
  boolean getIsOpen();

  /**
   * <code>uint32 begin_time = 9;</code>
   * @return The beginTime.
   */
  int getBeginTime();
}