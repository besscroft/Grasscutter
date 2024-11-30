// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

/**
 * <pre>
 * CmdId: 24576
 * </pre>
 *
 * Protobuf type {@code EntityAiSyncNotify}
 */
public final class EntityAiSyncNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EntityAiSyncNotify)
    EntityAiSyncNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityAiSyncNotify.newBuilder() to construct.
  private EntityAiSyncNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityAiSyncNotify() {
    localAvatarAlertedMonsterList_ = emptyIntList();
    infoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntityAiSyncNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityAiSyncNotify(
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
          case 8: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              localAvatarAlertedMonsterList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            localAvatarAlertedMonsterList_.addInt(input.readUInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              localAvatarAlertedMonsterList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              localAvatarAlertedMonsterList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 106: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              infoList_ = new java.util.ArrayList<io.grasscutter.net.proto.fight.AiSyncInfo>();
              mutable_bitField0_ |= 0x00000002;
            }
            infoList_.add(
                input.readMessage(io.grasscutter.net.proto.fight.AiSyncInfo.parser(), extensionRegistry));
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
        localAvatarAlertedMonsterList_.makeImmutable(); // C
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        infoList_ = java.util.Collections.unmodifiableList(infoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.fight.Fight.internal_static_EntityAiSyncNotify_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.fight.Fight.internal_static_EntityAiSyncNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.fight.EntityAiSyncNotify.class, io.grasscutter.net.proto.fight.EntityAiSyncNotify.Builder.class);
  }

  public static final int LOCAL_AVATAR_ALERTED_MONSTER_LIST_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList localAvatarAlertedMonsterList_;
  /**
   * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
   * @return A list containing the localAvatarAlertedMonsterList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getLocalAvatarAlertedMonsterListList() {
    return localAvatarAlertedMonsterList_;
  }
  /**
   * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
   * @return The count of localAvatarAlertedMonsterList.
   */
  public int getLocalAvatarAlertedMonsterListCount() {
    return localAvatarAlertedMonsterList_.size();
  }
  /**
   * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
   * @param index The index of the element to return.
   * @return The localAvatarAlertedMonsterList at the given index.
   */
  public int getLocalAvatarAlertedMonsterList(int index) {
    return localAvatarAlertedMonsterList_.getInt(index);
  }
  private int localAvatarAlertedMonsterListMemoizedSerializedSize = -1;

  public static final int INFO_LIST_FIELD_NUMBER = 13;
  private java.util.List<io.grasscutter.net.proto.fight.AiSyncInfo> infoList_;
  /**
   * <code>repeated .AiSyncInfo info_list = 13;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.fight.AiSyncInfo> getInfoListList() {
    return infoList_;
  }
  /**
   * <code>repeated .AiSyncInfo info_list = 13;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder> 
      getInfoListOrBuilderList() {
    return infoList_;
  }
  /**
   * <code>repeated .AiSyncInfo info_list = 13;</code>
   */
  @java.lang.Override
  public int getInfoListCount() {
    return infoList_.size();
  }
  /**
   * <code>repeated .AiSyncInfo info_list = 13;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.fight.AiSyncInfo getInfoList(int index) {
    return infoList_.get(index);
  }
  /**
   * <code>repeated .AiSyncInfo info_list = 13;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder getInfoListOrBuilder(
      int index) {
    return infoList_.get(index);
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
    getSerializedSize();
    if (getLocalAvatarAlertedMonsterListList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(localAvatarAlertedMonsterListMemoizedSerializedSize);
    }
    for (int i = 0; i < localAvatarAlertedMonsterList_.size(); i++) {
      output.writeUInt32NoTag(localAvatarAlertedMonsterList_.getInt(i));
    }
    for (int i = 0; i < infoList_.size(); i++) {
      output.writeMessage(13, infoList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < localAvatarAlertedMonsterList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(localAvatarAlertedMonsterList_.getInt(i));
      }
      size += dataSize;
      if (!getLocalAvatarAlertedMonsterListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      localAvatarAlertedMonsterListMemoizedSerializedSize = dataSize;
    }
    for (int i = 0; i < infoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(13, infoList_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.fight.EntityAiSyncNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.fight.EntityAiSyncNotify other = (io.grasscutter.net.proto.fight.EntityAiSyncNotify) obj;

    if (!getLocalAvatarAlertedMonsterListList()
        .equals(other.getLocalAvatarAlertedMonsterListList())) return false;
    if (!getInfoListList()
        .equals(other.getInfoListList())) return false;
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
    if (getLocalAvatarAlertedMonsterListCount() > 0) {
      hash = (37 * hash) + LOCAL_AVATAR_ALERTED_MONSTER_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getLocalAvatarAlertedMonsterListList().hashCode();
    }
    if (getInfoListCount() > 0) {
      hash = (37 * hash) + INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getInfoListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.fight.EntityAiSyncNotify prototype) {
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
   * CmdId: 24576
   * </pre>
   *
   * Protobuf type {@code EntityAiSyncNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EntityAiSyncNotify)
      io.grasscutter.net.proto.fight.EntityAiSyncNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EntityAiSyncNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EntityAiSyncNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.fight.EntityAiSyncNotify.class, io.grasscutter.net.proto.fight.EntityAiSyncNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.fight.EntityAiSyncNotify.newBuilder()
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
        getInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      localAvatarAlertedMonsterList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      if (infoListBuilder_ == null) {
        infoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        infoListBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EntityAiSyncNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EntityAiSyncNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.fight.EntityAiSyncNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EntityAiSyncNotify build() {
      io.grasscutter.net.proto.fight.EntityAiSyncNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EntityAiSyncNotify buildPartial() {
      io.grasscutter.net.proto.fight.EntityAiSyncNotify result = new io.grasscutter.net.proto.fight.EntityAiSyncNotify(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        localAvatarAlertedMonsterList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.localAvatarAlertedMonsterList_ = localAvatarAlertedMonsterList_;
      if (infoListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          infoList_ = java.util.Collections.unmodifiableList(infoList_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.infoList_ = infoList_;
      } else {
        result.infoList_ = infoListBuilder_.build();
      }
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
      if (other instanceof io.grasscutter.net.proto.fight.EntityAiSyncNotify) {
        return mergeFrom((io.grasscutter.net.proto.fight.EntityAiSyncNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.fight.EntityAiSyncNotify other) {
      if (other == io.grasscutter.net.proto.fight.EntityAiSyncNotify.getDefaultInstance()) return this;
      if (!other.localAvatarAlertedMonsterList_.isEmpty()) {
        if (localAvatarAlertedMonsterList_.isEmpty()) {
          localAvatarAlertedMonsterList_ = other.localAvatarAlertedMonsterList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureLocalAvatarAlertedMonsterListIsMutable();
          localAvatarAlertedMonsterList_.addAll(other.localAvatarAlertedMonsterList_);
        }
        onChanged();
      }
      if (infoListBuilder_ == null) {
        if (!other.infoList_.isEmpty()) {
          if (infoList_.isEmpty()) {
            infoList_ = other.infoList_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureInfoListIsMutable();
            infoList_.addAll(other.infoList_);
          }
          onChanged();
        }
      } else {
        if (!other.infoList_.isEmpty()) {
          if (infoListBuilder_.isEmpty()) {
            infoListBuilder_.dispose();
            infoListBuilder_ = null;
            infoList_ = other.infoList_;
            bitField0_ = (bitField0_ & ~0x00000002);
            infoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInfoListFieldBuilder() : null;
          } else {
            infoListBuilder_.addAllMessages(other.infoList_);
          }
        }
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
      io.grasscutter.net.proto.fight.EntityAiSyncNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.fight.EntityAiSyncNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList localAvatarAlertedMonsterList_ = emptyIntList();
    private void ensureLocalAvatarAlertedMonsterListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        localAvatarAlertedMonsterList_ = mutableCopy(localAvatarAlertedMonsterList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @return A list containing the localAvatarAlertedMonsterList.
     */
    public java.util.List<java.lang.Integer>
        getLocalAvatarAlertedMonsterListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(localAvatarAlertedMonsterList_) : localAvatarAlertedMonsterList_;
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @return The count of localAvatarAlertedMonsterList.
     */
    public int getLocalAvatarAlertedMonsterListCount() {
      return localAvatarAlertedMonsterList_.size();
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @param index The index of the element to return.
     * @return The localAvatarAlertedMonsterList at the given index.
     */
    public int getLocalAvatarAlertedMonsterList(int index) {
      return localAvatarAlertedMonsterList_.getInt(index);
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @param index The index to set the value at.
     * @param value The localAvatarAlertedMonsterList to set.
     * @return This builder for chaining.
     */
    public Builder setLocalAvatarAlertedMonsterList(
        int index, int value) {
      ensureLocalAvatarAlertedMonsterListIsMutable();
      localAvatarAlertedMonsterList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @param value The localAvatarAlertedMonsterList to add.
     * @return This builder for chaining.
     */
    public Builder addLocalAvatarAlertedMonsterList(int value) {
      ensureLocalAvatarAlertedMonsterListIsMutable();
      localAvatarAlertedMonsterList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @param values The localAvatarAlertedMonsterList to add.
     * @return This builder for chaining.
     */
    public Builder addAllLocalAvatarAlertedMonsterList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureLocalAvatarAlertedMonsterListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, localAvatarAlertedMonsterList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 local_avatar_alerted_monster_list = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLocalAvatarAlertedMonsterList() {
      localAvatarAlertedMonsterList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.util.List<io.grasscutter.net.proto.fight.AiSyncInfo> infoList_ =
      java.util.Collections.emptyList();
    private void ensureInfoListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        infoList_ = new java.util.ArrayList<io.grasscutter.net.proto.fight.AiSyncInfo>(infoList_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.fight.AiSyncInfo, io.grasscutter.net.proto.fight.AiSyncInfo.Builder, io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder> infoListBuilder_;

    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public java.util.List<io.grasscutter.net.proto.fight.AiSyncInfo> getInfoListList() {
      if (infoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(infoList_);
      } else {
        return infoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public int getInfoListCount() {
      if (infoListBuilder_ == null) {
        return infoList_.size();
      } else {
        return infoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public io.grasscutter.net.proto.fight.AiSyncInfo getInfoList(int index) {
      if (infoListBuilder_ == null) {
        return infoList_.get(index);
      } else {
        return infoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder setInfoList(
        int index, io.grasscutter.net.proto.fight.AiSyncInfo value) {
      if (infoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoListIsMutable();
        infoList_.set(index, value);
        onChanged();
      } else {
        infoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder setInfoList(
        int index, io.grasscutter.net.proto.fight.AiSyncInfo.Builder builderForValue) {
      if (infoListBuilder_ == null) {
        ensureInfoListIsMutable();
        infoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        infoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder addInfoList(io.grasscutter.net.proto.fight.AiSyncInfo value) {
      if (infoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoListIsMutable();
        infoList_.add(value);
        onChanged();
      } else {
        infoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder addInfoList(
        int index, io.grasscutter.net.proto.fight.AiSyncInfo value) {
      if (infoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInfoListIsMutable();
        infoList_.add(index, value);
        onChanged();
      } else {
        infoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder addInfoList(
        io.grasscutter.net.proto.fight.AiSyncInfo.Builder builderForValue) {
      if (infoListBuilder_ == null) {
        ensureInfoListIsMutable();
        infoList_.add(builderForValue.build());
        onChanged();
      } else {
        infoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder addInfoList(
        int index, io.grasscutter.net.proto.fight.AiSyncInfo.Builder builderForValue) {
      if (infoListBuilder_ == null) {
        ensureInfoListIsMutable();
        infoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        infoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder addAllInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.fight.AiSyncInfo> values) {
      if (infoListBuilder_ == null) {
        ensureInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, infoList_);
        onChanged();
      } else {
        infoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder clearInfoList() {
      if (infoListBuilder_ == null) {
        infoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        infoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public Builder removeInfoList(int index) {
      if (infoListBuilder_ == null) {
        ensureInfoListIsMutable();
        infoList_.remove(index);
        onChanged();
      } else {
        infoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public io.grasscutter.net.proto.fight.AiSyncInfo.Builder getInfoListBuilder(
        int index) {
      return getInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder getInfoListOrBuilder(
        int index) {
      if (infoListBuilder_ == null) {
        return infoList_.get(index);  } else {
        return infoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder> 
         getInfoListOrBuilderList() {
      if (infoListBuilder_ != null) {
        return infoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(infoList_);
      }
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public io.grasscutter.net.proto.fight.AiSyncInfo.Builder addInfoListBuilder() {
      return getInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.fight.AiSyncInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public io.grasscutter.net.proto.fight.AiSyncInfo.Builder addInfoListBuilder(
        int index) {
      return getInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.fight.AiSyncInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .AiSyncInfo info_list = 13;</code>
     */
    public java.util.List<io.grasscutter.net.proto.fight.AiSyncInfo.Builder> 
         getInfoListBuilderList() {
      return getInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.fight.AiSyncInfo, io.grasscutter.net.proto.fight.AiSyncInfo.Builder, io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder> 
        getInfoListFieldBuilder() {
      if (infoListBuilder_ == null) {
        infoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.fight.AiSyncInfo, io.grasscutter.net.proto.fight.AiSyncInfo.Builder, io.grasscutter.net.proto.fight.AiSyncInfoOrBuilder>(
                infoList_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        infoList_ = null;
      }
      return infoListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EntityAiSyncNotify)
  }

  // @@protoc_insertion_point(class_scope:EntityAiSyncNotify)
  private static final io.grasscutter.net.proto.fight.EntityAiSyncNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.fight.EntityAiSyncNotify();
  }

  public static io.grasscutter.net.proto.fight.EntityAiSyncNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityAiSyncNotify>
      PARSER = new com.google.protobuf.AbstractParser<EntityAiSyncNotify>() {
    @java.lang.Override
    public EntityAiSyncNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityAiSyncNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityAiSyncNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityAiSyncNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.fight.EntityAiSyncNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
