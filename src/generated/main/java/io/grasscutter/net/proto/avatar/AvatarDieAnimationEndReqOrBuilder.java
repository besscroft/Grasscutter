// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: avatar.proto

package io.grasscutter.net.proto.avatar;

public interface AvatarDieAnimationEndReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AvatarDieAnimationEndReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Vector reborn_pos = 12;</code>
   * @return Whether the rebornPos field is set.
   */
  boolean hasRebornPos();
  /**
   * <code>.Vector reborn_pos = 12;</code>
   * @return The rebornPos.
   */
  io.grasscutter.net.proto.define.Vector getRebornPos();
  /**
   * <code>.Vector reborn_pos = 12;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getRebornPosOrBuilder();

  /**
   * <code>uint64 die_guid = 11;</code>
   * @return The dieGuid.
   */
  long getDieGuid();

  /**
   * <code>uint32 skill_id = 14;</code>
   * @return The skillId.
   */
  int getSkillId();
}