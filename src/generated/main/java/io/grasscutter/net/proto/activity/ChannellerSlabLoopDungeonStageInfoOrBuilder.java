// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface ChannellerSlabLoopDungeonStageInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ChannellerSlabLoopDungeonStageInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .ChannellerSlabLoopDungeonInfo dungeon_info_list = 7;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.ChannellerSlabLoopDungeonInfo> 
      getDungeonInfoListList();
  /**
   * <code>repeated .ChannellerSlabLoopDungeonInfo dungeon_info_list = 7;</code>
   */
  io.grasscutter.net.proto.activity.ChannellerSlabLoopDungeonInfo getDungeonInfoList(int index);
  /**
   * <code>repeated .ChannellerSlabLoopDungeonInfo dungeon_info_list = 7;</code>
   */
  int getDungeonInfoListCount();
  /**
   * <code>repeated .ChannellerSlabLoopDungeonInfo dungeon_info_list = 7;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.ChannellerSlabLoopDungeonInfoOrBuilder> 
      getDungeonInfoListOrBuilderList();
  /**
   * <code>repeated .ChannellerSlabLoopDungeonInfo dungeon_info_list = 7;</code>
   */
  io.grasscutter.net.proto.activity.ChannellerSlabLoopDungeonInfoOrBuilder getDungeonInfoListOrBuilder(
      int index);

  /**
   * <code>repeated uint32 taken_reward_index_list = 13;</code>
   * @return A list containing the takenRewardIndexList.
   */
  java.util.List<java.lang.Integer> getTakenRewardIndexListList();
  /**
   * <code>repeated uint32 taken_reward_index_list = 13;</code>
   * @return The count of takenRewardIndexList.
   */
  int getTakenRewardIndexListCount();
  /**
   * <code>repeated uint32 taken_reward_index_list = 13;</code>
   * @param index The index of the element to return.
   * @return The takenRewardIndexList at the given index.
   */
  int getTakenRewardIndexList(int index);

  /**
   * <code>uint32 open_time = 2;</code>
   * @return The openTime.
   */
  int getOpenTime();

  /**
   * <code>uint32 last_difficulty_id = 11;</code>
   * @return The lastDifficultyId.
   */
  int getLastDifficultyId();

  /**
   * <code>bool is_open = 14;</code>
   * @return The isOpen.
   */
  boolean getIsOpen();
}