// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: avatar.proto

package io.grasscutter.net.proto.avatar;

public interface AvatarTeamOrBuilder extends
    // @@protoc_insertion_point(interface_extends:AvatarTeam)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string team_name = 2;</code>
   * @return The teamName.
   */
  java.lang.String getTeamName();
  /**
   * <code>string team_name = 2;</code>
   * @return The bytes for teamName.
   */
  com.google.protobuf.ByteString
      getTeamNameBytes();

  /**
   * <code>repeated uint64 avatar_guid_list = 3;</code>
   * @return A list containing the avatarGuidList.
   */
  java.util.List<java.lang.Long> getAvatarGuidListList();
  /**
   * <code>repeated uint64 avatar_guid_list = 3;</code>
   * @return The count of avatarGuidList.
   */
  int getAvatarGuidListCount();
  /**
   * <code>repeated uint64 avatar_guid_list = 3;</code>
   * @param index The index of the element to return.
   * @return The avatarGuidList at the given index.
   */
  long getAvatarGuidList(int index);
}