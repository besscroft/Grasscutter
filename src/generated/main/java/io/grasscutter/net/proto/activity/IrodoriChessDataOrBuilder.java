// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface IrodoriChessDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:IrodoriChessData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .IrodoriChessLevelData level_data_list = 2;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.IrodoriChessLevelData> 
      getLevelDataListList();
  /**
   * <code>repeated .IrodoriChessLevelData level_data_list = 2;</code>
   */
  io.grasscutter.net.proto.activity.IrodoriChessLevelData getLevelDataList(int index);
  /**
   * <code>repeated .IrodoriChessLevelData level_data_list = 2;</code>
   */
  int getLevelDataListCount();
  /**
   * <code>repeated .IrodoriChessLevelData level_data_list = 2;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.IrodoriChessLevelDataOrBuilder> 
      getLevelDataListOrBuilderList();
  /**
   * <code>repeated .IrodoriChessLevelData level_data_list = 2;</code>
   */
  io.grasscutter.net.proto.activity.IrodoriChessLevelDataOrBuilder getLevelDataListOrBuilder(
      int index);

  /**
   * <code>bool is_open = 1;</code>
   * @return The isOpen.
   */
  boolean getIsOpen();
}