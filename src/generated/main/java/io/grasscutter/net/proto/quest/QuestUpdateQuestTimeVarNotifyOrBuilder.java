// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quest.proto

package io.grasscutter.net.proto.quest;

public interface QuestUpdateQuestTimeVarNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:QuestUpdateQuestTimeVarNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, uint32&gt; time_var_map = 14;</code>
   */
  int getTimeVarMapCount();
  /**
   * <code>map&lt;uint32, uint32&gt; time_var_map = 14;</code>
   */
  boolean containsTimeVarMap(
      int key);
  /**
   * Use {@link #getTimeVarMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getTimeVarMap();
  /**
   * <code>map&lt;uint32, uint32&gt; time_var_map = 14;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getTimeVarMapMap();
  /**
   * <code>map&lt;uint32, uint32&gt; time_var_map = 14;</code>
   */

  int getTimeVarMapOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; time_var_map = 14;</code>
   */

  int getTimeVarMapOrThrow(
      int key);

  /**
   * <code>uint32 parent_quest_id = 8;</code>
   * @return The parentQuestId.
   */
  int getParentQuestId();
}