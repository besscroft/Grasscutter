// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

public interface GachaActivityDetailInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GachaActivityDetailInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .GachaStageData gacha_stage_data_list = 15;</code>
   */
  java.util.List<io.grasscutter.net.proto.activity.GachaStageData> 
      getGachaStageDataListList();
  /**
   * <code>repeated .GachaStageData gacha_stage_data_list = 15;</code>
   */
  io.grasscutter.net.proto.activity.GachaStageData getGachaStageDataList(int index);
  /**
   * <code>repeated .GachaStageData gacha_stage_data_list = 15;</code>
   */
  int getGachaStageDataListCount();
  /**
   * <code>repeated .GachaStageData gacha_stage_data_list = 15;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.activity.GachaStageDataOrBuilder> 
      getGachaStageDataListOrBuilderList();
  /**
   * <code>repeated .GachaStageData gacha_stage_data_list = 15;</code>
   */
  io.grasscutter.net.proto.activity.GachaStageDataOrBuilder getGachaStageDataListOrBuilder(
      int index);

  /**
   * <code>map&lt;uint32, uint32&gt; FOLOMOBDODM = 4;</code>
   */
  int getFOLOMOBDODMCount();
  /**
   * <code>map&lt;uint32, uint32&gt; FOLOMOBDODM = 4;</code>
   */
  boolean containsFOLOMOBDODM(
      int key);
  /**
   * Use {@link #getFOLOMOBDODMMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getFOLOMOBDODM();
  /**
   * <code>map&lt;uint32, uint32&gt; FOLOMOBDODM = 4;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getFOLOMOBDODMMap();
  /**
   * <code>map&lt;uint32, uint32&gt; FOLOMOBDODM = 4;</code>
   */

  int getFOLOMOBDODMOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; FOLOMOBDODM = 4;</code>
   */

  int getFOLOMOBDODMOrThrow(
      int key);

  /**
   * <code>repeated uint32 have_get_robot_list = 9;</code>
   * @return A list containing the haveGetRobotList.
   */
  java.util.List<java.lang.Integer> getHaveGetRobotListList();
  /**
   * <code>repeated uint32 have_get_robot_list = 9;</code>
   * @return The count of haveGetRobotList.
   */
  int getHaveGetRobotListCount();
  /**
   * <code>repeated uint32 have_get_robot_list = 9;</code>
   * @param index The index of the element to return.
   * @return The haveGetRobotList at the given index.
   */
  int getHaveGetRobotList(int index);

  /**
   * <code>map&lt;uint32, uint32&gt; KJOGIDLLODK = 1;</code>
   */
  int getKJOGIDLLODKCount();
  /**
   * <code>map&lt;uint32, uint32&gt; KJOGIDLLODK = 1;</code>
   */
  boolean containsKJOGIDLLODK(
      int key);
  /**
   * Use {@link #getKJOGIDLLODKMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getKJOGIDLLODK();
  /**
   * <code>map&lt;uint32, uint32&gt; KJOGIDLLODK = 1;</code>
   */
  java.util.Map<java.lang.Integer, java.lang.Integer>
  getKJOGIDLLODKMap();
  /**
   * <code>map&lt;uint32, uint32&gt; KJOGIDLLODK = 1;</code>
   */

  int getKJOGIDLLODKOrDefault(
      int key,
      int defaultValue);
  /**
   * <code>map&lt;uint32, uint32&gt; KJOGIDLLODK = 1;</code>
   */

  int getKJOGIDLLODKOrThrow(
      int key);

  /**
   * <code>uint32 FMMAKJKIIDN = 5;</code>
   * @return The fMMAKJKIIDN.
   */
  int getFMMAKJKIIDN();

  /**
   * <code>uint32 JINLIBHHLND = 14;</code>
   * @return The jINLIBHHLND.
   */
  int getJINLIBHHLND();
}