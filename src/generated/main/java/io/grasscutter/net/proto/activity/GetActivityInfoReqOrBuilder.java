// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface GetActivityInfoReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GetActivityInfoReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 activity_id_list = 8;</code>
   * @return A list containing the activityIdList.
   */
  java.util.List<java.lang.Integer> getActivityIdListList();
  /**
   * <code>repeated uint32 activity_id_list = 8;</code>
   * @return The count of activityIdList.
   */
  int getActivityIdListCount();
  /**
   * <code>repeated uint32 activity_id_list = 8;</code>
   * @param index The index of the element to return.
   * @return The activityIdList at the given index.
   */
  int getActivityIdList(int index);
}