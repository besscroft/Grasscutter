// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: achievement.proto

package io.grasscutter.net.proto.achievement;

public interface AchievementUpdateNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AchievementUpdateNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Achievement achievement_list = 1;</code>
   */
  java.util.List<io.grasscutter.net.proto.achievement.Achievement> 
      getAchievementListList();
  /**
   * <code>repeated .Achievement achievement_list = 1;</code>
   */
  io.grasscutter.net.proto.achievement.Achievement getAchievementList(int index);
  /**
   * <code>repeated .Achievement achievement_list = 1;</code>
   */
  int getAchievementListCount();
  /**
   * <code>repeated .Achievement achievement_list = 1;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.achievement.AchievementOrBuilder> 
      getAchievementListOrBuilderList();
  /**
   * <code>repeated .Achievement achievement_list = 1;</code>
   */
  io.grasscutter.net.proto.achievement.AchievementOrBuilder getAchievementListOrBuilder(
      int index);
}