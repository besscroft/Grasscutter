// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface SalvageChallengeInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SalvageChallengeInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool is_unlock = 11;</code>
   * @return The isUnlock.
   */
  boolean getIsUnlock();

  /**
   * <code>uint32 challenge_type = 13;</code>
   * @return The challengeType.
   */
  int getChallengeType();

  /**
   * <code>.SalvageScoreChallengeInfo score_challenge_info = 6;</code>
   * @return Whether the scoreChallengeInfo field is set.
   */
  boolean hasScoreChallengeInfo();
  /**
   * <code>.SalvageScoreChallengeInfo score_challenge_info = 6;</code>
   * @return The scoreChallengeInfo.
   */
  io.grasscutter.net.proto.activity.SalvageScoreChallengeInfo getScoreChallengeInfo();
  /**
   * <code>.SalvageScoreChallengeInfo score_challenge_info = 6;</code>
   */
  io.grasscutter.net.proto.activity.SalvageScoreChallengeInfoOrBuilder getScoreChallengeInfoOrBuilder();

  /**
   * <code>.SalvageBundleChallengeInfo bundle_info = 5;</code>
   * @return Whether the bundleInfo field is set.
   */
  boolean hasBundleInfo();
  /**
   * <code>.SalvageBundleChallengeInfo bundle_info = 5;</code>
   * @return The bundleInfo.
   */
  io.grasscutter.net.proto.activity.SalvageBundleChallengeInfo getBundleInfo();
  /**
   * <code>.SalvageBundleChallengeInfo bundle_info = 5;</code>
   */
  io.grasscutter.net.proto.activity.SalvageBundleChallengeInfoOrBuilder getBundleInfoOrBuilder();

  /**
   * <code>uint32 boss_challenge_id = 15;</code>
   * @return Whether the bossChallengeId field is set.
   */
  boolean hasBossChallengeId();
  /**
   * <code>uint32 boss_challenge_id = 15;</code>
   * @return The bossChallengeId.
   */
  int getBossChallengeId();

  public io.grasscutter.net.proto.activity.SalvageChallengeInfo.LFPGPCBEAHPCase getLFPGPCBEAHPCase();
}