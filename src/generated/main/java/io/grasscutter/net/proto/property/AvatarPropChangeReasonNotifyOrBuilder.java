// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: property.proto

package io.grasscutter.net.proto.property;

public interface AvatarPropChangeReasonNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AvatarPropChangeReasonNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>float old_value = 3;</code>
   * @return The oldValue.
   */
  float getOldValue();

  /**
   * <code>uint32 prop_type = 9;</code>
   * @return The propType.
   */
  int getPropType();

  /**
   * <code>uint64 avatar_guid = 12;</code>
   * @return The avatarGuid.
   */
  long getAvatarGuid();

  /**
   * <code>float cur_value = 6;</code>
   * @return The curValue.
   */
  float getCurValue();

  /**
   * <code>.PropChangeReason reason = 11;</code>
   * @return The enum numeric value on the wire for reason.
   */
  int getReasonValue();
  /**
   * <code>.PropChangeReason reason = 11;</code>
   * @return The reason.
   */
  io.grasscutter.net.proto.property.PropChangeReason getReason();
}