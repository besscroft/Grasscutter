// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player.proto

package io.grasscutter.net.proto.player;

public interface PlayerPropNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:PlayerPropNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint32, .PropValue&gt; prop_map = 15;</code>
   */
  int getPropMapCount();
  /**
   * <code>map&lt;uint32, .PropValue&gt; prop_map = 15;</code>
   */
  boolean containsPropMap(
      int key);
  /**
   * Use {@link #getPropMapMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Integer, io.grasscutter.net.proto.define.PropValue>
  getPropMap();
  /**
   * <code>map&lt;uint32, .PropValue&gt; prop_map = 15;</code>
   */
  java.util.Map<java.lang.Integer, io.grasscutter.net.proto.define.PropValue>
  getPropMapMap();
  /**
   * <code>map&lt;uint32, .PropValue&gt; prop_map = 15;</code>
   */

  io.grasscutter.net.proto.define.PropValue getPropMapOrDefault(
      int key,
      io.grasscutter.net.proto.define.PropValue defaultValue);
  /**
   * <code>map&lt;uint32, .PropValue&gt; prop_map = 15;</code>
   */

  io.grasscutter.net.proto.define.PropValue getPropMapOrThrow(
      int key);
}