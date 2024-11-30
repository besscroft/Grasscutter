// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: item.proto

package io.grasscutter.net.proto.item;

/**
 * <pre>
 * CmdId: 8622
 * </pre>
 *
 * Protobuf type {@code StoreItemChangeNotify}
 */
public final class StoreItemChangeNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:StoreItemChangeNotify)
    StoreItemChangeNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StoreItemChangeNotify.newBuilder() to construct.
  private StoreItemChangeNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StoreItemChangeNotify() {
    itemList_ = java.util.Collections.emptyList();
    reason_ = 0;
    storeType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StoreItemChangeNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private StoreItemChangeNotify(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 24: {
            int rawValue = input.readEnum();

            reason_ = rawValue;
            break;
          }
          case 80: {
            int rawValue = input.readEnum();

            storeType_ = rawValue;
            break;
          }
          case 98: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              itemList_ = new java.util.ArrayList<io.grasscutter.net.proto.define.Item>();
              mutable_bitField0_ |= 0x00000001;
            }
            itemList_.add(
                input.readMessage(io.grasscutter.net.proto.define.Item.parser(), extensionRegistry));
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        itemList_ = java.util.Collections.unmodifiableList(itemList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.item.Item.internal_static_StoreItemChangeNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.item.Item.internal_static_StoreItemChangeNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.item.StoreItemChangeNotify.class, io.grasscutter.net.proto.item.StoreItemChangeNotify.Builder.class);
  }

  public static final int ITEM_LIST_FIELD_NUMBER = 12;
  private java.util.List<io.grasscutter.net.proto.define.Item> itemList_;
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.define.Item> getItemListList() {
    return itemList_;
  }
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.define.ItemOrBuilder> 
      getItemListOrBuilderList() {
    return itemList_;
  }
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  @java.lang.Override
  public int getItemListCount() {
    return itemList_.size();
  }
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Item getItemList(int index) {
    return itemList_.get(index);
  }
  /**
   * <code>repeated .Item item_list = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.ItemOrBuilder getItemListOrBuilder(
      int index) {
    return itemList_.get(index);
  }

  public static final int REASON_FIELD_NUMBER = 3;
  private int reason_;
  /**
   * <code>.StoreItemChangeReason reason = 3;</code>
   * @return The enum numeric value on the wire for reason.
   */
  @java.lang.Override public int getReasonValue() {
    return reason_;
  }
  /**
   * <code>.StoreItemChangeReason reason = 3;</code>
   * @return The reason.
   */
  @java.lang.Override public io.grasscutter.net.proto.item.StoreItemChangeReason getReason() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.item.StoreItemChangeReason result = io.grasscutter.net.proto.item.StoreItemChangeReason.valueOf(reason_);
    return result == null ? io.grasscutter.net.proto.item.StoreItemChangeReason.UNRECOGNIZED : result;
  }

  public static final int STORE_TYPE_FIELD_NUMBER = 10;
  private int storeType_;
  /**
   * <code>.StoreType store_type = 10;</code>
   * @return The enum numeric value on the wire for storeType.
   */
  @java.lang.Override public int getStoreTypeValue() {
    return storeType_;
  }
  /**
   * <code>.StoreType store_type = 10;</code>
   * @return The storeType.
   */
  @java.lang.Override public io.grasscutter.net.proto.define.StoreType getStoreType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.define.StoreType result = io.grasscutter.net.proto.define.StoreType.valueOf(storeType_);
    return result == null ? io.grasscutter.net.proto.define.StoreType.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (reason_ != io.grasscutter.net.proto.item.StoreItemChangeReason.StoreItemChangeReason_OTHERS.getNumber()) {
      output.writeEnum(3, reason_);
    }
    if (storeType_ != io.grasscutter.net.proto.define.StoreType.StoreType_STORE_NONE.getNumber()) {
      output.writeEnum(10, storeType_);
    }
    for (int i = 0; i < itemList_.size(); i++) {
      output.writeMessage(12, itemList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reason_ != io.grasscutter.net.proto.item.StoreItemChangeReason.StoreItemChangeReason_OTHERS.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, reason_);
    }
    if (storeType_ != io.grasscutter.net.proto.define.StoreType.StoreType_STORE_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(10, storeType_);
    }
    for (int i = 0; i < itemList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, itemList_.get(i));
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.grasscutter.net.proto.item.StoreItemChangeNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.item.StoreItemChangeNotify other = (io.grasscutter.net.proto.item.StoreItemChangeNotify) obj;

    if (!getItemListList()
        .equals(other.getItemListList())) return false;
    if (reason_ != other.reason_) return false;
    if (storeType_ != other.storeType_) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getItemListCount() > 0) {
      hash = (37 * hash) + ITEM_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getItemListList().hashCode();
    }
    hash = (37 * hash) + REASON_FIELD_NUMBER;
    hash = (53 * hash) + reason_;
    hash = (37 * hash) + STORE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + storeType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.item.StoreItemChangeNotify parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grasscutter.net.proto.item.StoreItemChangeNotify prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * CmdId: 8622
   * </pre>
   *
   * Protobuf type {@code StoreItemChangeNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:StoreItemChangeNotify)
      io.grasscutter.net.proto.item.StoreItemChangeNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.item.Item.internal_static_StoreItemChangeNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.item.Item.internal_static_StoreItemChangeNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.item.StoreItemChangeNotify.class, io.grasscutter.net.proto.item.StoreItemChangeNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.item.StoreItemChangeNotify.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getItemListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (itemListBuilder_ == null) {
        itemList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        itemListBuilder_.clear();
      }
      reason_ = 0;

      storeType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.item.Item.internal_static_StoreItemChangeNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.item.StoreItemChangeNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.item.StoreItemChangeNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.item.StoreItemChangeNotify build() {
      io.grasscutter.net.proto.item.StoreItemChangeNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.item.StoreItemChangeNotify buildPartial() {
      io.grasscutter.net.proto.item.StoreItemChangeNotify result = new io.grasscutter.net.proto.item.StoreItemChangeNotify(this);
      int from_bitField0_ = bitField0_;
      if (itemListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          itemList_ = java.util.Collections.unmodifiableList(itemList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.itemList_ = itemList_;
      } else {
        result.itemList_ = itemListBuilder_.build();
      }
      result.reason_ = reason_;
      result.storeType_ = storeType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grasscutter.net.proto.item.StoreItemChangeNotify) {
        return mergeFrom((io.grasscutter.net.proto.item.StoreItemChangeNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.item.StoreItemChangeNotify other) {
      if (other == io.grasscutter.net.proto.item.StoreItemChangeNotify.getDefaultInstance()) return this;
      if (itemListBuilder_ == null) {
        if (!other.itemList_.isEmpty()) {
          if (itemList_.isEmpty()) {
            itemList_ = other.itemList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureItemListIsMutable();
            itemList_.addAll(other.itemList_);
          }
          onChanged();
        }
      } else {
        if (!other.itemList_.isEmpty()) {
          if (itemListBuilder_.isEmpty()) {
            itemListBuilder_.dispose();
            itemListBuilder_ = null;
            itemList_ = other.itemList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            itemListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getItemListFieldBuilder() : null;
          } else {
            itemListBuilder_.addAllMessages(other.itemList_);
          }
        }
      }
      if (other.reason_ != 0) {
        setReasonValue(other.getReasonValue());
      }
      if (other.storeType_ != 0) {
        setStoreTypeValue(other.getStoreTypeValue());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.grasscutter.net.proto.item.StoreItemChangeNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.item.StoreItemChangeNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.define.Item> itemList_ =
      java.util.Collections.emptyList();
    private void ensureItemListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        itemList_ = new java.util.ArrayList<io.grasscutter.net.proto.define.Item>(itemList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder> itemListBuilder_;

    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public java.util.List<io.grasscutter.net.proto.define.Item> getItemListList() {
      if (itemListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(itemList_);
      } else {
        return itemListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public int getItemListCount() {
      if (itemListBuilder_ == null) {
        return itemList_.size();
      } else {
        return itemListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public io.grasscutter.net.proto.define.Item getItemList(int index) {
      if (itemListBuilder_ == null) {
        return itemList_.get(index);
      } else {
        return itemListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder setItemList(
        int index, io.grasscutter.net.proto.define.Item value) {
      if (itemListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemListIsMutable();
        itemList_.set(index, value);
        onChanged();
      } else {
        itemListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder setItemList(
        int index, io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (itemListBuilder_ == null) {
        ensureItemListIsMutable();
        itemList_.set(index, builderForValue.build());
        onChanged();
      } else {
        itemListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder addItemList(io.grasscutter.net.proto.define.Item value) {
      if (itemListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemListIsMutable();
        itemList_.add(value);
        onChanged();
      } else {
        itemListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder addItemList(
        int index, io.grasscutter.net.proto.define.Item value) {
      if (itemListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureItemListIsMutable();
        itemList_.add(index, value);
        onChanged();
      } else {
        itemListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder addItemList(
        io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (itemListBuilder_ == null) {
        ensureItemListIsMutable();
        itemList_.add(builderForValue.build());
        onChanged();
      } else {
        itemListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder addItemList(
        int index, io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (itemListBuilder_ == null) {
        ensureItemListIsMutable();
        itemList_.add(index, builderForValue.build());
        onChanged();
      } else {
        itemListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder addAllItemList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.define.Item> values) {
      if (itemListBuilder_ == null) {
        ensureItemListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, itemList_);
        onChanged();
      } else {
        itemListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder clearItemList() {
      if (itemListBuilder_ == null) {
        itemList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        itemListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public Builder removeItemList(int index) {
      if (itemListBuilder_ == null) {
        ensureItemListIsMutable();
        itemList_.remove(index);
        onChanged();
      } else {
        itemListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder getItemListBuilder(
        int index) {
      return getItemListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public io.grasscutter.net.proto.define.ItemOrBuilder getItemListOrBuilder(
        int index) {
      if (itemListBuilder_ == null) {
        return itemList_.get(index);  } else {
        return itemListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.define.ItemOrBuilder> 
         getItemListOrBuilderList() {
      if (itemListBuilder_ != null) {
        return itemListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(itemList_);
      }
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder addItemListBuilder() {
      return getItemListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.define.Item.getDefaultInstance());
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder addItemListBuilder(
        int index) {
      return getItemListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.define.Item.getDefaultInstance());
    }
    /**
     * <code>repeated .Item item_list = 12;</code>
     */
    public java.util.List<io.grasscutter.net.proto.define.Item.Builder> 
         getItemListBuilderList() {
      return getItemListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder> 
        getItemListFieldBuilder() {
      if (itemListBuilder_ == null) {
        itemListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder>(
                itemList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        itemList_ = null;
      }
      return itemListBuilder_;
    }

    private int reason_ = 0;
    /**
     * <code>.StoreItemChangeReason reason = 3;</code>
     * @return The enum numeric value on the wire for reason.
     */
    @java.lang.Override public int getReasonValue() {
      return reason_;
    }
    /**
     * <code>.StoreItemChangeReason reason = 3;</code>
     * @param value The enum numeric value on the wire for reason to set.
     * @return This builder for chaining.
     */
    public Builder setReasonValue(int value) {
      
      reason_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.StoreItemChangeReason reason = 3;</code>
     * @return The reason.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.item.StoreItemChangeReason getReason() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.item.StoreItemChangeReason result = io.grasscutter.net.proto.item.StoreItemChangeReason.valueOf(reason_);
      return result == null ? io.grasscutter.net.proto.item.StoreItemChangeReason.UNRECOGNIZED : result;
    }
    /**
     * <code>.StoreItemChangeReason reason = 3;</code>
     * @param value The reason to set.
     * @return This builder for chaining.
     */
    public Builder setReason(io.grasscutter.net.proto.item.StoreItemChangeReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      reason_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.StoreItemChangeReason reason = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearReason() {
      
      reason_ = 0;
      onChanged();
      return this;
    }

    private int storeType_ = 0;
    /**
     * <code>.StoreType store_type = 10;</code>
     * @return The enum numeric value on the wire for storeType.
     */
    @java.lang.Override public int getStoreTypeValue() {
      return storeType_;
    }
    /**
     * <code>.StoreType store_type = 10;</code>
     * @param value The enum numeric value on the wire for storeType to set.
     * @return This builder for chaining.
     */
    public Builder setStoreTypeValue(int value) {
      
      storeType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.StoreType store_type = 10;</code>
     * @return The storeType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.define.StoreType getStoreType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.define.StoreType result = io.grasscutter.net.proto.define.StoreType.valueOf(storeType_);
      return result == null ? io.grasscutter.net.proto.define.StoreType.UNRECOGNIZED : result;
    }
    /**
     * <code>.StoreType store_type = 10;</code>
     * @param value The storeType to set.
     * @return This builder for chaining.
     */
    public Builder setStoreType(io.grasscutter.net.proto.define.StoreType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      storeType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.StoreType store_type = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearStoreType() {
      
      storeType_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:StoreItemChangeNotify)
  }

  // @@protoc_insertion_point(class_scope:StoreItemChangeNotify)
  private static final io.grasscutter.net.proto.item.StoreItemChangeNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.item.StoreItemChangeNotify();
  }

  public static io.grasscutter.net.proto.item.StoreItemChangeNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StoreItemChangeNotify>
      PARSER = new com.google.protobuf.AbstractParser<StoreItemChangeNotify>() {
    @java.lang.Override
    public StoreItemChangeNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new StoreItemChangeNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<StoreItemChangeNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StoreItemChangeNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.item.StoreItemChangeNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
