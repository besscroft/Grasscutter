// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface EvtBeingHealedNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EvtBeingHealedNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string heal_tag = 10;</code>
   * @return The healTag.
   */
  java.lang.String getHealTag();
  /**
   * <code>string heal_tag = 10;</code>
   * @return The bytes for healTag.
   */
  com.google.protobuf.ByteString
      getHealTagBytes();

  /**
   * <code>uint32 source_id = 2;</code>
   * @return The sourceId.
   */
  int getSourceId();

  /**
   * <code>uint32 target_id = 3;</code>
   * @return The targetId.
   */
  int getTargetId();

  /**
   * <code>bool CKMAJKEHGGF = 15;</code>
   * @return The cKMAJKEHGGF.
   */
  boolean getCKMAJKEHGGF();

  /**
   * <code>float real_heal_amount = 4;</code>
   * @return The realHealAmount.
   */
  float getRealHealAmount();

  /**
   * <code>float heal_amount = 5;</code>
   * @return The healAmount.
   */
  float getHealAmount();
}