// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

public interface AiSkillCdInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AiSkillCdInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, uint32&gt; skill_group_cd_map = 15;</code>
   */
  int getSkillGroupCdMapCount();
  /**
   * <code>map&lt;uint32, uint32&gt; skill_group_cd_map = 15;</code>
   */
  boolean containsSkillGroupCdMap(
      int key);
  /**
   * Use {@link #getSkillGroupCdMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getSkillGroupCdMap();
  /**
   * <code>map&lt;uint32, uint32&gt; skill_group_cd_map = 15;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getSkillGroupCdMapMap();
  /**
   * <code>map&lt;uint32, uint32&gt; skill_group_cd_map = 15;</code>
   */

  int getSkillGroupCdMapOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; skill_group_cd_map = 15;</code>
   */

  int getSkillGroupCdMapOrThrow(
      int key);

  /**
   * <code>map&lt;uint32, uint32&gt; skill_cd_map = 7;</code>
   */
  int getSkillCdMapCount();
  /**
   * <code>map&lt;uint32, uint32&gt; skill_cd_map = 7;</code>
   */
  boolean containsSkillCdMap(
      int key);
  /**
   * Use {@link #getSkillCdMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getSkillCdMap();
  /**
   * <code>map&lt;uint32, uint32&gt; skill_cd_map = 7;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getSkillCdMapMap();
  /**
   * <code>map&lt;uint32, uint32&gt; skill_cd_map = 7;</code>
   */

  int getSkillCdMapOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; skill_cd_map = 7;</code>
   */

  int getSkillCdMapOrThrow(
      int key);
}