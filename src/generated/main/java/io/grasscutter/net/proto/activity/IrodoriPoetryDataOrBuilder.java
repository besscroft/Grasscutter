// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface IrodoriPoetryDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:IrodoriPoetryData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.IrodoriPoetryThemeData> 
      getThemeDataListList();
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  io.grasscutter.net.proto.activity.IrodoriPoetryThemeData getThemeDataList(int index);
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  int getThemeDataListCount();
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder> 
      getThemeDataListOrBuilderList();
  /**
   * <code>repeated .IrodoriPoetryThemeData theme_data_list = 11;</code>
   */
  io.grasscutter.net.proto.activity.IrodoriPoetryThemeDataOrBuilder getThemeDataListOrBuilder(
      int index);

  /**
   * <code>uint32 cur_theme_id = 10;</code>
   * @return The curThemeId.
   */
  int getCurThemeId();
}