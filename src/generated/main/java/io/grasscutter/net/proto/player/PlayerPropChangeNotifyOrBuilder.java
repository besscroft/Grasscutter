// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player.proto

package io.grasscutter.net.proto.player;

public interface PlayerPropChangeNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PlayerPropChangeNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint32 prop_type = 10;</code>
   * @return The propType.
   */
  int getPropType();

  /**
   * <code>uint32 prop_delta = 8;</code>
   * @return The propDelta.
   */
  int getPropDelta();
}