// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: property.proto

package io.grasscutter.net.proto.property;

public interface EntityFightPropChangeReasonNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EntityFightPropChangeReasonNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 param_list = 11;</code>
   * @return A list containing the paramList.
   */
  java.util.List<java.lang.Integer> getParamListList();
  /**
   * <code>repeated uint32 param_list = 11;</code>
   * @return The count of paramList.
   */
  int getParamListCount();
  /**
   * <code>repeated uint32 param_list = 11;</code>
   * @param index The index of the element to return.
   * @return The paramList at the given index.
   */
  int getParamList(int index);

  /**
   * <code>.PropChangeDetailInfo detail_info = 5;</code>
   * @return Whether the detailInfo field is set.
   */
  boolean hasDetailInfo();
  /**
   * <code>.PropChangeDetailInfo detail_info = 5;</code>
   * @return The detailInfo.
   */
  io.grasscutter.net.proto.property.PropChangeDetailInfo getDetailInfo();
  /**
   * <code>.PropChangeDetailInfo detail_info = 5;</code>
   */
  io.grasscutter.net.proto.property.PropChangeDetailInfoOrBuilder getDetailInfoOrBuilder();

  /**
   * <code>uint32 prop_type = 8;</code>
   * @return The propType.
   */
  int getPropType();

  /**
   * <code>.ChangeHpDebts change_hp_debts = 9;</code>
   * @return The enum numeric value on the wire for changeHpDebts.
   */
  int getChangeHpDebtsValue();
  /**
   * <code>.ChangeHpDebts change_hp_debts = 9;</code>
   * @return The changeHpDebts.
   */
  io.grasscutter.net.proto.property.ChangeHpDebts getChangeHpDebts();

  /**
   * <code>float paid_hp_debts = 12;</code>
   * @return The paidHpDebts.
   */
  float getPaidHpDebts();

  /**
   * <code>uint32 entity_id = 3;</code>
   * @return The entityId.
   */
  int getEntityId();

  /**
   * <code>.PropChangeReason reason = 15;</code>
   * @return The enum numeric value on the wire for reason.
   */
  int getReasonValue();
  /**
   * <code>.PropChangeReason reason = 15;</code>
   * @return The reason.
   */
  io.grasscutter.net.proto.property.PropChangeReason getReason();

  /**
   * <code>float prop_delta = 6;</code>
   * @return The propDelta.
   */
  float getPropDelta();

  /**
   * <code>.ChangeEnergyReason change_energy_reason = 10;</code>
   * @return The enum numeric value on the wire for changeEnergyReason.
   */
  int getChangeEnergyReasonValue();
  /**
   * <code>.ChangeEnergyReason change_energy_reason = 10;</code>
   * @return The changeEnergyReason.
   */
  io.grasscutter.net.proto.property.ChangeEnergyReason getChangeEnergyReason();

  /**
   * <code>.ChangeHpReason change_hp_reason = 4;</code>
   * @return The enum numeric value on the wire for changeHpReason.
   */
  int getChangeHpReasonValue();
  /**
   * <code>.ChangeHpReason change_hp_reason = 4;</code>
   * @return The changeHpReason.
   */
  io.grasscutter.net.proto.property.ChangeHpReason getChangeHpReason();
}