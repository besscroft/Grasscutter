// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

public interface SceneTransToPointRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SceneTransToPointRsp)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 point_id = 11;</code>
   * @return The pointId.
   */
  int getPointId();

  /**
   * <code>uint32 scene_id = 4;</code>
   * @return The sceneId.
   */
  int getSceneId();

  /**
   * <code>int32 retcode = 15;</code>
   * @return The retcode.
   */
  int getRetcode();
}