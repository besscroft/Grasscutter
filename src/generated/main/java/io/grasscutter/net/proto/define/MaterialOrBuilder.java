// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

public interface MaterialOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Material)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.MaterialDeleteInfo delete_info = 2;</code>
   * @return Whether the deleteInfo field is set.
   */
  boolean hasDeleteInfo();
  /**
   * <code>.MaterialDeleteInfo delete_info = 2;</code>
   * @return The deleteInfo.
   */
  io.grasscutter.net.proto.define.MaterialDeleteInfo getDeleteInfo();
  /**
   * <code>.MaterialDeleteInfo delete_info = 2;</code>
   */
  io.grasscutter.net.proto.define.MaterialDeleteInfoOrBuilder getDeleteInfoOrBuilder();

  /**
   * <code>uint32 count = 1;</code>
   * @return The count.
   */
  int getCount();
}