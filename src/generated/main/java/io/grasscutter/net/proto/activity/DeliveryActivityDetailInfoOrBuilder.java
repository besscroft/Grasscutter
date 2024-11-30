// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface DeliveryActivityDetailInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:DeliveryActivityDetailInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 finished_delivery_quest_index = 8;</code>
   * @return A list containing the finishedDeliveryQuestIndex.
   */
  java.util.List<java.lang.Integer> getFinishedDeliveryQuestIndexList();
  /**
   * <code>repeated uint32 finished_delivery_quest_index = 8;</code>
   * @return The count of finishedDeliveryQuestIndex.
   */
  int getFinishedDeliveryQuestIndexCount();
  /**
   * <code>repeated uint32 finished_delivery_quest_index = 8;</code>
   * @param index The index of the element to return.
   * @return The finishedDeliveryQuestIndex at the given index.
   */
  int getFinishedDeliveryQuestIndex(int index);

  /**
   * <code>uint32 day_index = 2;</code>
   * @return The dayIndex.
   */
  int getDayIndex();

  /**
   * <code>bool is_taken_reward = 15;</code>
   * @return The isTakenReward.
   */
  boolean getIsTakenReward();
}