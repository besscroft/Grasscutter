// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface HitCollisionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:HitCollision)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.Vector NLJPLCOLKFJ = 6;</code>
   * @return Whether the nLJPLCOLKFJ field is set.
   */
  boolean hasNLJPLCOLKFJ();
  /**
   * <code>.Vector NLJPLCOLKFJ = 6;</code>
   * @return The nLJPLCOLKFJ.
   */
  io.grasscutter.net.proto.define.Vector getNLJPLCOLKFJ();
  /**
   * <code>.Vector NLJPLCOLKFJ = 6;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getNLJPLCOLKFJOrBuilder();

  /**
   * <code>.Vector GJHMJAFNLOJ = 3;</code>
   * @return Whether the gJHMJAFNLOJ field is set.
   */
  boolean hasGJHMJAFNLOJ();
  /**
   * <code>.Vector GJHMJAFNLOJ = 3;</code>
   * @return The gJHMJAFNLOJ.
   */
  io.grasscutter.net.proto.define.Vector getGJHMJAFNLOJ();
  /**
   * <code>.Vector GJHMJAFNLOJ = 3;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getGJHMJAFNLOJOrBuilder();

  /**
   * <code>float HCGDIDCAOFF = 10;</code>
   * @return The hCGDIDCAOFF.
   */
  float getHCGDIDCAOFF();

  /**
   * <code>.HitColliderType hit_collider_type = 4;</code>
   * @return The enum numeric value on the wire for hitColliderType.
   */
  int getHitColliderTypeValue();
  /**
   * <code>.HitColliderType hit_collider_type = 4;</code>
   * @return The hitColliderType.
   */
  io.grasscutter.net.proto.fight.HitColliderType getHitColliderType();

  /**
   * <code>float LIHAKPPEMKL = 1;</code>
   * @return The lIHAKPPEMKL.
   */
  float getLIHAKPPEMKL();

  /**
   * <code>int32 hit_box_index = 12;</code>
   * @return The hitBoxIndex.
   */
  int getHitBoxIndex();
}