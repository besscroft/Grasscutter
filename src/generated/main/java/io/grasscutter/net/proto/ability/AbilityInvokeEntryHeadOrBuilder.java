// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ability.proto

package io.grasscutter.net.proto.ability;

public interface AbilityInvokeEntryHeadOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AbilityInvokeEntryHead)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 target_id = 13;</code>
   * @return The targetId.
   */
  int getTargetId();

  /**
   * <code>int32 modifier_config_local_id = 5;</code>
   * @return The modifierConfigLocalId.
   */
  int getModifierConfigLocalId();

  /**
   * <code>uint32 server_buff_uid = 2;</code>
   * @return The serverBuffUid.
   */
  int getServerBuffUid();

  /**
   * <code>bool is_serverbuff_modifier = 4;</code>
   * @return The isServerbuffModifier.
   */
  boolean getIsServerbuffModifier();

  /**
   * <code>uint32 instanced_modifier_id = 3;</code>
   * @return The instancedModifierId.
   */
  int getInstancedModifierId();

  /**
   * <code>uint32 instanced_ability_id = 8;</code>
   * @return The instancedAbilityId.
   */
  int getInstancedAbilityId();

  /**
   * <code>int32 local_id = 1;</code>
   * @return The localId.
   */
  int getLocalId();
}