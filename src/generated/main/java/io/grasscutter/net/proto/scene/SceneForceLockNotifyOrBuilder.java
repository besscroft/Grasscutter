// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

public interface SceneForceLockNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SceneForceLockNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 force_id_list = 12;</code>
   * @return A list containing the forceIdList.
   */
  java.util.List<java.lang.Integer> getForceIdListList();
  /**
   * <code>repeated uint32 force_id_list = 12;</code>
   * @return The count of forceIdList.
   */
  int getForceIdListCount();
  /**
   * <code>repeated uint32 force_id_list = 12;</code>
   * @param index The index of the element to return.
   * @return The forceIdList at the given index.
   */
  int getForceIdList(int index);
}