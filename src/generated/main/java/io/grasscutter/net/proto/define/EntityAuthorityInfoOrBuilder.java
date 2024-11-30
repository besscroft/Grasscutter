// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

public interface EntityAuthorityInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EntityAuthorityInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.AbilitySyncStateInfo ability_info = 1;</code>
   * @return Whether the abilityInfo field is set.
   */
  boolean hasAbilityInfo();
  /**
   * <code>.AbilitySyncStateInfo ability_info = 1;</code>
   * @return The abilityInfo.
   */
  io.grasscutter.net.proto.define.AbilitySyncStateInfo getAbilityInfo();
  /**
   * <code>.AbilitySyncStateInfo ability_info = 1;</code>
   */
  io.grasscutter.net.proto.define.AbilitySyncStateInfoOrBuilder getAbilityInfoOrBuilder();

  /**
   * <code>repeated .AnimatorParameterValueInfoPair pose_para_list = 5;</code>
   */
  java.util.List<io.grasscutter.net.proto.define.AnimatorParameterValueInfoPair> 
      getPoseParaListList();
  /**
   * <code>repeated .AnimatorParameterValueInfoPair pose_para_list = 5;</code>
   */
  io.grasscutter.net.proto.define.AnimatorParameterValueInfoPair getPoseParaList(int index);
  /**
   * <code>repeated .AnimatorParameterValueInfoPair pose_para_list = 5;</code>
   */
  int getPoseParaListCount();
  /**
   * <code>repeated .AnimatorParameterValueInfoPair pose_para_list = 5;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.define.AnimatorParameterValueInfoPairOrBuilder> 
      getPoseParaListOrBuilderList();
  /**
   * <code>repeated .AnimatorParameterValueInfoPair pose_para_list = 5;</code>
   */
  io.grasscutter.net.proto.define.AnimatorParameterValueInfoPairOrBuilder getPoseParaListOrBuilder(
      int index);

  /**
   * <code>.EntityClientExtraInfo client_extra_info = 6;</code>
   * @return Whether the clientExtraInfo field is set.
   */
  boolean hasClientExtraInfo();
  /**
   * <code>.EntityClientExtraInfo client_extra_info = 6;</code>
   * @return The clientExtraInfo.
   */
  io.grasscutter.net.proto.define.EntityClientExtraInfo getClientExtraInfo();
  /**
   * <code>.EntityClientExtraInfo client_extra_info = 6;</code>
   */
  io.grasscutter.net.proto.define.EntityClientExtraInfoOrBuilder getClientExtraInfoOrBuilder();

  /**
   * <code>.EntityRendererChangedInfo renderer_changed_info = 2;</code>
   * @return Whether the rendererChangedInfo field is set.
   */
  boolean hasRendererChangedInfo();
  /**
   * <code>.EntityRendererChangedInfo renderer_changed_info = 2;</code>
   * @return The rendererChangedInfo.
   */
  io.grasscutter.net.proto.define.EntityRendererChangedInfo getRendererChangedInfo();
  /**
   * <code>.EntityRendererChangedInfo renderer_changed_info = 2;</code>
   */
  io.grasscutter.net.proto.define.EntityRendererChangedInfoOrBuilder getRendererChangedInfoOrBuilder();

  /**
   * <code>.SceneEntityAiInfo ai_info = 3;</code>
   * @return Whether the aiInfo field is set.
   */
  boolean hasAiInfo();
  /**
   * <code>.SceneEntityAiInfo ai_info = 3;</code>
   * @return The aiInfo.
   */
  io.grasscutter.net.proto.define.SceneEntityAiInfo getAiInfo();
  /**
   * <code>.SceneEntityAiInfo ai_info = 3;</code>
   */
  io.grasscutter.net.proto.define.SceneEntityAiInfoOrBuilder getAiInfoOrBuilder();

  /**
   * <code>.Vector born_pos = 4;</code>
   * @return Whether the bornPos field is set.
   */
  boolean hasBornPos();
  /**
   * <code>.Vector born_pos = 4;</code>
   * @return The bornPos.
   */
  io.grasscutter.net.proto.define.Vector getBornPos();
  /**
   * <code>.Vector born_pos = 4;</code>
   */
  io.grasscutter.net.proto.define.VectorOrBuilder getBornPosOrBuilder();
}