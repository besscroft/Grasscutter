// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: skill.proto

package io.grasscutter.net.proto.skill;

public interface AvatarSkillInfoNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AvatarSkillInfoNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 3;</code>
   */
  int getSkillMapCount();
  /**
   * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 3;</code>
   */
  boolean containsSkillMap(
      int key);
  /**
   * Use {@link #getSkillMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, io.grasscutter.net.proto.define.AvatarSkillInfo>
  getSkillMap();
  /**
   * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 3;</code>
   */
  java.util.Map<java.lang.Integer, io.grasscutter.net.proto.define.AvatarSkillInfo>
  getSkillMapMap();
  /**
   * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 3;</code>
   */

  io.grasscutter.net.proto.define.AvatarSkillInfo getSkillMapOrDefault(
      int key,
      io.grasscutter.net.proto.define.AvatarSkillInfo defaultValue);
  /**
   * <code>map&lt;uint32, .AvatarSkillInfo&gt; skill_map = 3;</code>
   */

  io.grasscutter.net.proto.define.AvatarSkillInfo getSkillMapOrThrow(
      int key);

  /**
   * <code>uint64 guid = 8;</code>
   * @return The guid.
   */
  long getGuid();
}