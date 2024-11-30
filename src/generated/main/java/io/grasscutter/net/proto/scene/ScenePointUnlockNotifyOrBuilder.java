// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

public interface ScenePointUnlockNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ScenePointUnlockNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 point_list = 2;</code>
   * @return A list containing the pointList.
   */
  java.util.List<java.lang.Integer> getPointListList();
  /**
   * <code>repeated uint32 point_list = 2;</code>
   * @return The count of pointList.
   */
  int getPointListCount();
  /**
   * <code>repeated uint32 point_list = 2;</code>
   * @param index The index of the element to return.
   * @return The pointList at the given index.
   */
  int getPointList(int index);

  /**
   * <code>repeated uint32 unhide_point_list = 4;</code>
   * @return A list containing the unhidePointList.
   */
  java.util.List<java.lang.Integer> getUnhidePointListList();
  /**
   * <code>repeated uint32 unhide_point_list = 4;</code>
   * @return The count of unhidePointList.
   */
  int getUnhidePointListCount();
  /**
   * <code>repeated uint32 unhide_point_list = 4;</code>
   * @param index The index of the element to return.
   * @return The unhidePointList at the given index.
   */
  int getUnhidePointList(int index);

  /**
   * <code>repeated uint32 locked_point_list = 12;</code>
   * @return A list containing the lockedPointList.
   */
  java.util.List<java.lang.Integer> getLockedPointListList();
  /**
   * <code>repeated uint32 locked_point_list = 12;</code>
   * @return The count of lockedPointList.
   */
  int getLockedPointListCount();
  /**
   * <code>repeated uint32 locked_point_list = 12;</code>
   * @param index The index of the element to return.
   * @return The lockedPointList at the given index.
   */
  int getLockedPointList(int index);

  /**
   * <code>repeated uint32 hide_point_list = 10;</code>
   * @return A list containing the hidePointList.
   */
  java.util.List<java.lang.Integer> getHidePointListList();
  /**
   * <code>repeated uint32 hide_point_list = 10;</code>
   * @return The count of hidePointList.
   */
  int getHidePointListCount();
  /**
   * <code>repeated uint32 hide_point_list = 10;</code>
   * @param index The index of the element to return.
   * @return The hidePointList at the given index.
   */
  int getHidePointList(int index);

  /**
   * <code>uint32 scene_id = 6;</code>
   * @return The sceneId.
   */
  int getSceneId();
}