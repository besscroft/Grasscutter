// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface KCBMFCPADFOOrBuilder extends
    // @@protoc_insertion_point(interface_extends:KCBMFCPADFO)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated uint32 IBGBHIMFGOL = 2;</code>
   * @return A list containing the iBGBHIMFGOL.
   */
  java.util.List<java.lang.Integer> getIBGBHIMFGOLList();
  /**
   * <code>repeated uint32 IBGBHIMFGOL = 2;</code>
   * @return The count of iBGBHIMFGOL.
   */
  int getIBGBHIMFGOLCount();
  /**
   * <code>repeated uint32 IBGBHIMFGOL = 2;</code>
   * @param index The index of the element to return.
   * @return The iBGBHIMFGOL at the given index.
   */
  int getIBGBHIMFGOL(int index);

  /**
   * <code>map&lt;uint32, uint32&gt; GBEEEDLGPOB = 11;</code>
   */
  int getGBEEEDLGPOBCount();
  /**
   * <code>map&lt;uint32, uint32&gt; GBEEEDLGPOB = 11;</code>
   */
  boolean containsGBEEEDLGPOB(
      int key);
  /**
   * Use {@link #getGBEEEDLGPOBMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getGBEEEDLGPOB();
  /**
   * <code>map&lt;uint32, uint32&gt; GBEEEDLGPOB = 11;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getGBEEEDLGPOBMap();
  /**
   * <code>map&lt;uint32, uint32&gt; GBEEEDLGPOB = 11;</code>
   */

  int getGBEEEDLGPOBOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; GBEEEDLGPOB = 11;</code>
   */

  int getGBEEEDLGPOBOrThrow(
      int key);
}