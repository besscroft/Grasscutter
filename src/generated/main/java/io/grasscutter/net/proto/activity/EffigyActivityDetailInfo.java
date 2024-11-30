// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code EffigyActivityDetailInfo}
 */
public final class EffigyActivityDetailInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EffigyActivityDetailInfo)
    EffigyActivityDetailInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EffigyActivityDetailInfo.newBuilder() to construct.
  private EffigyActivityDetailInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EffigyActivityDetailInfo() {
    dailyInfoList_ = java.util.Collections.emptyList();
    takenRewardIndexList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EffigyActivityDetailInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EffigyActivityDetailInfo(
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

            curScore_ = input.readUInt32();
            break;
          }
          case 96: {

            lastDifficultyId_ = input.readUInt32();
            break;
          }
          case 114: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              dailyInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.EffigyDailyInfo>();
              mutable_bitField0_ |= 0x00000001;
            }
            dailyInfoList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.EffigyDailyInfo.parser(), extensionRegistry));
            break;
          }
          case 120: {
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              takenRewardIndexList_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            takenRewardIndexList_.addInt(input.readUInt32());
            break;
          }
          case 122: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
              takenRewardIndexList_ = newIntList();
              mutable_bitField0_ |= 0x00000002;
            }
            while (input.getBytesUntilLimit() > 0) {
              takenRewardIndexList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
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
        dailyInfoList_ = java.util.Collections.unmodifiableList(dailyInfoList_);
      }
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        takenRewardIndexList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_EffigyActivityDetailInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_EffigyActivityDetailInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.class, io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.Builder.class);
  }

  public static final int DAILY_INFO_LIST_FIELD_NUMBER = 14;
  private java.util.List<io.grasscutter.net.proto.activity.EffigyDailyInfo> dailyInfoList_;
  /**
   * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.EffigyDailyInfo> getDailyInfoListList() {
    return dailyInfoList_;
  }
  /**
   * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder> 
      getDailyInfoListOrBuilderList() {
    return dailyInfoList_;
  }
  /**
   * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
   */
  @java.lang.Override
  public int getDailyInfoListCount() {
    return dailyInfoList_.size();
  }
  /**
   * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.EffigyDailyInfo getDailyInfoList(int index) {
    return dailyInfoList_.get(index);
  }
  /**
   * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder getDailyInfoListOrBuilder(
      int index) {
    return dailyInfoList_.get(index);
  }

  public static final int TAKEN_REWARD_INDEX_LIST_FIELD_NUMBER = 15;
  private com.google.protobuf.Internal.IntList takenRewardIndexList_;
  /**
   * <code>repeated uint32 taken_reward_index_list = 15;</code>
   * @return A list containing the takenRewardIndexList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getTakenRewardIndexListList() {
    return takenRewardIndexList_;
  }
  /**
   * <code>repeated uint32 taken_reward_index_list = 15;</code>
   * @return The count of takenRewardIndexList.
   */
  public int getTakenRewardIndexListCount() {
    return takenRewardIndexList_.size();
  }
  /**
   * <code>repeated uint32 taken_reward_index_list = 15;</code>
   * @param index The index of the element to return.
   * @return The takenRewardIndexList at the given index.
   */
  public int getTakenRewardIndexList(int index) {
    return takenRewardIndexList_.getInt(index);
  }
  private int takenRewardIndexListMemoizedSerializedSize = -1;

  public static final int CUR_SCORE_FIELD_NUMBER = 1;
  private int curScore_;
  /**
   * <code>uint32 cur_score = 1;</code>
   * @return The curScore.
   */
  @java.lang.Override
  public int getCurScore() {
    return curScore_;
  }

  public static final int LAST_DIFFICULTY_ID_FIELD_NUMBER = 12;
  private int lastDifficultyId_;
  /**
   * <code>uint32 last_difficulty_id = 12;</code>
   * @return The lastDifficultyId.
   */
  @java.lang.Override
  public int getLastDifficultyId() {
    return lastDifficultyId_;
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
    if (curScore_ != 0) {
      output.writeUInt32(1, curScore_);
    }
    if (lastDifficultyId_ != 0) {
      output.writeUInt32(12, lastDifficultyId_);
    }
    for (int i = 0; i < dailyInfoList_.size(); i++) {
      output.writeMessage(14, dailyInfoList_.get(i));
    }
    if (getTakenRewardIndexListList().size() > 0) {
      output.writeUInt32NoTag(122);
      output.writeUInt32NoTag(takenRewardIndexListMemoizedSerializedSize);
    }
    for (int i = 0; i < takenRewardIndexList_.size(); i++) {
      output.writeUInt32NoTag(takenRewardIndexList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (curScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, curScore_);
    }
    if (lastDifficultyId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, lastDifficultyId_);
    }
    for (int i = 0; i < dailyInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(14, dailyInfoList_.get(i));
    }
    {
      int dataSize = 0;
      for (int i = 0; i < takenRewardIndexList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(takenRewardIndexList_.getInt(i));
      }
      size += dataSize;
      if (!getTakenRewardIndexListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      takenRewardIndexListMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.EffigyActivityDetailInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.EffigyActivityDetailInfo other = (io.grasscutter.net.proto.activity.EffigyActivityDetailInfo) obj;

    if (!getDailyInfoListList()
        .equals(other.getDailyInfoListList())) return false;
    if (!getTakenRewardIndexListList()
        .equals(other.getTakenRewardIndexListList())) return false;
    if (getCurScore()
        != other.getCurScore()) return false;
    if (getLastDifficultyId()
        != other.getLastDifficultyId()) return false;
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
    if (getDailyInfoListCount() > 0) {
      hash = (37 * hash) + DAILY_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getDailyInfoListList().hashCode();
    }
    if (getTakenRewardIndexListCount() > 0) {
      hash = (37 * hash) + TAKEN_REWARD_INDEX_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getTakenRewardIndexListList().hashCode();
    }
    hash = (37 * hash) + CUR_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getCurScore();
    hash = (37 * hash) + LAST_DIFFICULTY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLastDifficultyId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.EffigyActivityDetailInfo prototype) {
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
   * Protobuf type {@code EffigyActivityDetailInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EffigyActivityDetailInfo)
      io.grasscutter.net.proto.activity.EffigyActivityDetailInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EffigyActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EffigyActivityDetailInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.class, io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.newBuilder()
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
        getDailyInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (dailyInfoListBuilder_ == null) {
        dailyInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        dailyInfoListBuilder_.clear();
      }
      takenRewardIndexList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      curScore_ = 0;

      lastDifficultyId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EffigyActivityDetailInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EffigyActivityDetailInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EffigyActivityDetailInfo build() {
      io.grasscutter.net.proto.activity.EffigyActivityDetailInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EffigyActivityDetailInfo buildPartial() {
      io.grasscutter.net.proto.activity.EffigyActivityDetailInfo result = new io.grasscutter.net.proto.activity.EffigyActivityDetailInfo(this);
      int from_bitField0_ = bitField0_;
      if (dailyInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dailyInfoList_ = java.util.Collections.unmodifiableList(dailyInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dailyInfoList_ = dailyInfoList_;
      } else {
        result.dailyInfoList_ = dailyInfoListBuilder_.build();
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        takenRewardIndexList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.takenRewardIndexList_ = takenRewardIndexList_;
      result.curScore_ = curScore_;
      result.lastDifficultyId_ = lastDifficultyId_;
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
      if (other instanceof io.grasscutter.net.proto.activity.EffigyActivityDetailInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.EffigyActivityDetailInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.EffigyActivityDetailInfo other) {
      if (other == io.grasscutter.net.proto.activity.EffigyActivityDetailInfo.getDefaultInstance()) return this;
      if (dailyInfoListBuilder_ == null) {
        if (!other.dailyInfoList_.isEmpty()) {
          if (dailyInfoList_.isEmpty()) {
            dailyInfoList_ = other.dailyInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDailyInfoListIsMutable();
            dailyInfoList_.addAll(other.dailyInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.dailyInfoList_.isEmpty()) {
          if (dailyInfoListBuilder_.isEmpty()) {
            dailyInfoListBuilder_.dispose();
            dailyInfoListBuilder_ = null;
            dailyInfoList_ = other.dailyInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dailyInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDailyInfoListFieldBuilder() : null;
          } else {
            dailyInfoListBuilder_.addAllMessages(other.dailyInfoList_);
          }
        }
      }
      if (!other.takenRewardIndexList_.isEmpty()) {
        if (takenRewardIndexList_.isEmpty()) {
          takenRewardIndexList_ = other.takenRewardIndexList_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureTakenRewardIndexListIsMutable();
          takenRewardIndexList_.addAll(other.takenRewardIndexList_);
        }
        onChanged();
      }
      if (other.getCurScore() != 0) {
        setCurScore(other.getCurScore());
      }
      if (other.getLastDifficultyId() != 0) {
        setLastDifficultyId(other.getLastDifficultyId());
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
      io.grasscutter.net.proto.activity.EffigyActivityDetailInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.EffigyActivityDetailInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.EffigyDailyInfo> dailyInfoList_ =
      java.util.Collections.emptyList();
    private void ensureDailyInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dailyInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.EffigyDailyInfo>(dailyInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.EffigyDailyInfo, io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder, io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder> dailyInfoListBuilder_;

    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.EffigyDailyInfo> getDailyInfoListList() {
      if (dailyInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dailyInfoList_);
      } else {
        return dailyInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public int getDailyInfoListCount() {
      if (dailyInfoListBuilder_ == null) {
        return dailyInfoList_.size();
      } else {
        return dailyInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public io.grasscutter.net.proto.activity.EffigyDailyInfo getDailyInfoList(int index) {
      if (dailyInfoListBuilder_ == null) {
        return dailyInfoList_.get(index);
      } else {
        return dailyInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder setDailyInfoList(
        int index, io.grasscutter.net.proto.activity.EffigyDailyInfo value) {
      if (dailyInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDailyInfoListIsMutable();
        dailyInfoList_.set(index, value);
        onChanged();
      } else {
        dailyInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder setDailyInfoList(
        int index, io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder builderForValue) {
      if (dailyInfoListBuilder_ == null) {
        ensureDailyInfoListIsMutable();
        dailyInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        dailyInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder addDailyInfoList(io.grasscutter.net.proto.activity.EffigyDailyInfo value) {
      if (dailyInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDailyInfoListIsMutable();
        dailyInfoList_.add(value);
        onChanged();
      } else {
        dailyInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder addDailyInfoList(
        int index, io.grasscutter.net.proto.activity.EffigyDailyInfo value) {
      if (dailyInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDailyInfoListIsMutable();
        dailyInfoList_.add(index, value);
        onChanged();
      } else {
        dailyInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder addDailyInfoList(
        io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder builderForValue) {
      if (dailyInfoListBuilder_ == null) {
        ensureDailyInfoListIsMutable();
        dailyInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        dailyInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder addDailyInfoList(
        int index, io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder builderForValue) {
      if (dailyInfoListBuilder_ == null) {
        ensureDailyInfoListIsMutable();
        dailyInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        dailyInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder addAllDailyInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.EffigyDailyInfo> values) {
      if (dailyInfoListBuilder_ == null) {
        ensureDailyInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, dailyInfoList_);
        onChanged();
      } else {
        dailyInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder clearDailyInfoList() {
      if (dailyInfoListBuilder_ == null) {
        dailyInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dailyInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public Builder removeDailyInfoList(int index) {
      if (dailyInfoListBuilder_ == null) {
        ensureDailyInfoListIsMutable();
        dailyInfoList_.remove(index);
        onChanged();
      } else {
        dailyInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder getDailyInfoListBuilder(
        int index) {
      return getDailyInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder getDailyInfoListOrBuilder(
        int index) {
      if (dailyInfoListBuilder_ == null) {
        return dailyInfoList_.get(index);  } else {
        return dailyInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder> 
         getDailyInfoListOrBuilderList() {
      if (dailyInfoListBuilder_ != null) {
        return dailyInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dailyInfoList_);
      }
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder addDailyInfoListBuilder() {
      return getDailyInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.EffigyDailyInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder addDailyInfoListBuilder(
        int index) {
      return getDailyInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.EffigyDailyInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .EffigyDailyInfo daily_info_list = 14;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder> 
         getDailyInfoListBuilderList() {
      return getDailyInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.EffigyDailyInfo, io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder, io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder> 
        getDailyInfoListFieldBuilder() {
      if (dailyInfoListBuilder_ == null) {
        dailyInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.EffigyDailyInfo, io.grasscutter.net.proto.activity.EffigyDailyInfo.Builder, io.grasscutter.net.proto.activity.EffigyDailyInfoOrBuilder>(
                dailyInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        dailyInfoList_ = null;
      }
      return dailyInfoListBuilder_;
    }

    private com.google.protobuf.Internal.IntList takenRewardIndexList_ = emptyIntList();
    private void ensureTakenRewardIndexListIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        takenRewardIndexList_ = mutableCopy(takenRewardIndexList_);
        bitField0_ |= 0x00000002;
       }
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @return A list containing the takenRewardIndexList.
     */
    public java.util.List<java.lang.Integer>
        getTakenRewardIndexListList() {
      return ((bitField0_ & 0x00000002) != 0) ?
               java.util.Collections.unmodifiableList(takenRewardIndexList_) : takenRewardIndexList_;
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @return The count of takenRewardIndexList.
     */
    public int getTakenRewardIndexListCount() {
      return takenRewardIndexList_.size();
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @param index The index of the element to return.
     * @return The takenRewardIndexList at the given index.
     */
    public int getTakenRewardIndexList(int index) {
      return takenRewardIndexList_.getInt(index);
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @param index The index to set the value at.
     * @param value The takenRewardIndexList to set.
     * @return This builder for chaining.
     */
    public Builder setTakenRewardIndexList(
        int index, int value) {
      ensureTakenRewardIndexListIsMutable();
      takenRewardIndexList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @param value The takenRewardIndexList to add.
     * @return This builder for chaining.
     */
    public Builder addTakenRewardIndexList(int value) {
      ensureTakenRewardIndexListIsMutable();
      takenRewardIndexList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @param values The takenRewardIndexList to add.
     * @return This builder for chaining.
     */
    public Builder addAllTakenRewardIndexList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureTakenRewardIndexListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, takenRewardIndexList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 taken_reward_index_list = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearTakenRewardIndexList() {
      takenRewardIndexList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    private int curScore_ ;
    /**
     * <code>uint32 cur_score = 1;</code>
     * @return The curScore.
     */
    @java.lang.Override
    public int getCurScore() {
      return curScore_;
    }
    /**
     * <code>uint32 cur_score = 1;</code>
     * @param value The curScore to set.
     * @return This builder for chaining.
     */
    public Builder setCurScore(int value) {
      
      curScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 cur_score = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearCurScore() {
      
      curScore_ = 0;
      onChanged();
      return this;
    }

    private int lastDifficultyId_ ;
    /**
     * <code>uint32 last_difficulty_id = 12;</code>
     * @return The lastDifficultyId.
     */
    @java.lang.Override
    public int getLastDifficultyId() {
      return lastDifficultyId_;
    }
    /**
     * <code>uint32 last_difficulty_id = 12;</code>
     * @param value The lastDifficultyId to set.
     * @return This builder for chaining.
     */
    public Builder setLastDifficultyId(int value) {
      
      lastDifficultyId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 last_difficulty_id = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastDifficultyId() {
      
      lastDifficultyId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EffigyActivityDetailInfo)
  }

  // @@protoc_insertion_point(class_scope:EffigyActivityDetailInfo)
  private static final io.grasscutter.net.proto.activity.EffigyActivityDetailInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.EffigyActivityDetailInfo();
  }

  public static io.grasscutter.net.proto.activity.EffigyActivityDetailInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EffigyActivityDetailInfo>
      PARSER = new com.google.protobuf.AbstractParser<EffigyActivityDetailInfo>() {
    @java.lang.Override
    public EffigyActivityDetailInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EffigyActivityDetailInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EffigyActivityDetailInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EffigyActivityDetailInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.EffigyActivityDetailInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
