// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface OOIMBBPDCMMOrBuilder extends
    // @@protoc_insertion_point(interface_extends:OOIMBBPDCMM)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 JPDLCDGLLAC = 14;</code>
   * @return A list containing the jPDLCDGLLAC.
   */
  java.util.List<java.lang.Integer> getJPDLCDGLLACList();
  /**
   * <code>repeated uint32 JPDLCDGLLAC = 14;</code>
   * @return The count of jPDLCDGLLAC.
   */
  int getJPDLCDGLLACCount();
  /**
   * <code>repeated uint32 JPDLCDGLLAC = 14;</code>
   * @param index The index of the element to return.
   * @return The jPDLCDGLLAC at the given index.
   */
  int getJPDLCDGLLAC(int index);

  /**
   * <code>uint32 level_id = 8;</code>
   * @return The levelId.
   */
  int getLevelId();

  /**
   * <code>bool is_finish = 12;</code>
   * @return The isFinish.
   */
  boolean getIsFinish();

  /**
   * <code>bool is_open = 1;</code>
   * @return The isOpen.
   */
  boolean getIsOpen();
}