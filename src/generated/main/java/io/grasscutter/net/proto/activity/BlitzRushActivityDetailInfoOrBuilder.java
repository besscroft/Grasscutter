// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface BlitzRushActivityDetailInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BlitzRushActivityDetailInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ParkourLevelInfo parkour_level_info_list = 14;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.ParkourLevelInfo> 
      getParkourLevelInfoListList();
  /**
   * <code>repeated .ParkourLevelInfo parkour_level_info_list = 14;</code>
   */
  io.grasscutter.net.proto.activity.ParkourLevelInfo getParkourLevelInfoList(int index);
  /**
   * <code>repeated .ParkourLevelInfo parkour_level_info_list = 14;</code>
   */
  int getParkourLevelInfoListCount();
  /**
   * <code>repeated .ParkourLevelInfo parkour_level_info_list = 14;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.ParkourLevelInfoOrBuilder> 
      getParkourLevelInfoListOrBuilderList();
  /**
   * <code>repeated .ParkourLevelInfo parkour_level_info_list = 14;</code>
   */
  io.grasscutter.net.proto.activity.ParkourLevelInfoOrBuilder getParkourLevelInfoListOrBuilder(
      int index);

  /**
   * <code>repeated .BlitzRushStage stage_list = 4;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.BlitzRushStage> 
      getStageListList();
  /**
   * <code>repeated .BlitzRushStage stage_list = 4;</code>
   */
  io.grasscutter.net.proto.activity.BlitzRushStage getStageList(int index);
  /**
   * <code>repeated .BlitzRushStage stage_list = 4;</code>
   */
  int getStageListCount();
  /**
   * <code>repeated .BlitzRushStage stage_list = 4;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.BlitzRushStageOrBuilder> 
      getStageListOrBuilderList();
  /**
   * <code>repeated .BlitzRushStage stage_list = 4;</code>
   */
  io.grasscutter.net.proto.activity.BlitzRushStageOrBuilder getStageListOrBuilder(
      int index);

  /**
   * <code>bool is_content_closed = 5;</code>
   * @return The isContentClosed.
   */
  boolean getIsContentClosed();

  /**
   * <code>uint32 content_close_time = 7;</code>
   * @return The contentCloseTime.
   */
  int getContentCloseTime();
}