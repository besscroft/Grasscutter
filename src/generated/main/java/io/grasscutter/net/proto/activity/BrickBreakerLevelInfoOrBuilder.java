// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface BrickBreakerLevelInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BrickBreakerLevelInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 CPMFMPHHFKI = 1;</code>
   * @return A list containing the cPMFMPHHFKI.
   */
  java.util.List<java.lang.Integer> getCPMFMPHHFKIList();
  /**
   * <code>repeated uint32 CPMFMPHHFKI = 1;</code>
   * @return The count of cPMFMPHHFKI.
   */
  int getCPMFMPHHFKICount();
  /**
   * <code>repeated uint32 CPMFMPHHFKI = 1;</code>
   * @param index The index of the element to return.
   * @return The cPMFMPHHFKI at the given index.
   */
  int getCPMFMPHHFKI(int index);

  /**
   * <code>repeated uint32 DDBDIFLNHDG = 6;</code>
   * @return A list containing the dDBDIFLNHDG.
   */
  java.util.List<java.lang.Integer> getDDBDIFLNHDGList();
  /**
   * <code>repeated uint32 DDBDIFLNHDG = 6;</code>
   * @return The count of dDBDIFLNHDG.
   */
  int getDDBDIFLNHDGCount();
  /**
   * <code>repeated uint32 DDBDIFLNHDG = 6;</code>
   * @param index The index of the element to return.
   * @return The dDBDIFLNHDG at the given index.
   */
  int getDDBDIFLNHDG(int index);

  /**
   * <code>bool is_finish = 5;</code>
   * @return The isFinish.
   */
  boolean getIsFinish();

  /**
   * <code>bool is_can_start = 13;</code>
   * @return The isCanStart.
   */
  boolean getIsCanStart();

  /**
   * <code>uint32 max_score = 4;</code>
   * @return The maxScore.
   */
  int getMaxScore();

  /**
   * <code>uint32 level_id = 10;</code>
   * @return The levelId.
   */
  int getLevelId();
}