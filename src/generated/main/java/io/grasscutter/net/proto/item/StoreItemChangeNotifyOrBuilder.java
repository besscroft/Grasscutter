// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item.proto

package io.grasscutter.net.proto.item;

public interface StoreItemChangeNotifyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:StoreItemChangeNotify)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  java.util.List<io.grasscutter.net.proto.define.Item> 
      getItemListList();
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  io.grasscutter.net.proto.define.Item getItemList(int index);
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  int getItemListCount();
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.define.ItemOrBuilder> 
      getItemListOrBuilderList();
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  io.grasscutter.net.proto.define.ItemOrBuilder getItemListOrBuilder(
      int index);

  /**
   * <code>.StoreItemChangeReason reason = 3;</code>
   * @return The enum numeric value on the wire for reason.
   */
  int getReasonValue();
  /**
   * <code>.StoreItemChangeReason reason = 3;</code>
   * @return The reason.
   */
  io.grasscutter.net.proto.item.StoreItemChangeReason getReason();

  /**
   * <code>.StoreType store_type = 10;</code>
   * @return The enum numeric value on the wire for storeType.
   */
  int getStoreTypeValue();
  /**
   * <code>.StoreType store_type = 10;</code>
   * @return The storeType.
   */
  io.grasscutter.net.proto.define.StoreType getStoreType();
}