// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface PlantFlowerActivityDetailInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PlantFlowerActivityDetailInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, uint32&gt; OGLBNKAEEMI = 3;</code>
   */
  int getOGLBNKAEEMICount();
  /**
   * <code>map&lt;uint32, uint32&gt; OGLBNKAEEMI = 3;</code>
   */
  boolean containsOGLBNKAEEMI(
      int key);
  /**
   * Use {@link #getOGLBNKAEEMIMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getOGLBNKAEEMI();
  /**
   * <code>map&lt;uint32, uint32&gt; OGLBNKAEEMI = 3;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getOGLBNKAEEMIMap();
  /**
   * <code>map&lt;uint32, uint32&gt; OGLBNKAEEMI = 3;</code>
   */

  int getOGLBNKAEEMIOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; OGLBNKAEEMI = 3;</code>
   */

  int getOGLBNKAEEMIOrThrow(
      int key);

  /**
   * <code>map&lt;uint32, uint32&gt; AJKPLBPKCAB = 10;</code>
   */
  int getAJKPLBPKCABCount();
  /**
   * <code>map&lt;uint32, uint32&gt; AJKPLBPKCAB = 10;</code>
   */
  boolean containsAJKPLBPKCAB(
      int key);
  /**
   * Use {@link #getAJKPLBPKCABMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getAJKPLBPKCAB();
  /**
   * <code>map&lt;uint32, uint32&gt; AJKPLBPKCAB = 10;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getAJKPLBPKCABMap();
  /**
   * <code>map&lt;uint32, uint32&gt; AJKPLBPKCAB = 10;</code>
   */

  int getAJKPLBPKCABOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; AJKPLBPKCAB = 10;</code>
   */

  int getAJKPLBPKCABOrThrow(
      int key);

  /**
   * <code>uint32 today_seed_reward_id = 5;</code>
   * @return The todaySeedRewardId.
   */
  int getTodaySeedRewardId();

  /**
   * <code>uint32 day_index = 13;</code>
   * @return The dayIndex.
   */
  int getDayIndex();

  /**
   * <code>bool is_content_closed = 12;</code>
   * @return The isContentClosed.
   */
  boolean getIsContentClosed();

  /**
   * <code>bool is_today_has_awarded = 7;</code>
   * @return The isTodayHasAwarded.
   */
  boolean getIsTodayHasAwarded();
}