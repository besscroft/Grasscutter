// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface EvtAvatarStandUpNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EvtAvatarStandUpNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int32 perform_id = 3;</code>
   * @return The performId.
   */
  int getPerformId();

  /**
   * <code>int32 direction = 9;</code>
   * @return The direction.
   */
  int getDirection();

  /**
   * <code>uint64 chair_id = 15;</code>
   * @return The chairId.
   */
  long getChairId();

  /**
   * <code>uint32 entity_id = 11;</code>
   * @return The entityId.
   */
  int getEntityId();
}