// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code GadgetPlayInfo}
 */
public final class GadgetPlayInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GadgetPlayInfo)
    GadgetPlayInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GadgetPlayInfo.newBuilder() to construct.
  private GadgetPlayInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GadgetPlayInfo() {
    progressStageList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GadgetPlayInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GadgetPlayInfo(
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

            playType_ = input.readUInt32();
            break;
          }
          case 16: {

            duration_ = input.readUInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              progressStageList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            progressStageList_.addInt(input.readUInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              progressStageList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              progressStageList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
            break;
          }
          case 32: {

            startCd_ = input.readUInt32();
            break;
          }
          case 40: {

            startTime_ = input.readUInt32();
            break;
          }
          case 48: {

            progress_ = input.readUInt32();
            break;
          }
          case 170: {
            io.grasscutter.net.proto.define.GadgetCrucibleInfo.Builder subBuilder = null;
            if (nCMNBDDIMHECase_ == 21) {
              subBuilder = ((io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_).toBuilder();
            }
            nCMNBDDIMHE_ =
                input.readMessage(io.grasscutter.net.proto.define.GadgetCrucibleInfo.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_);
              nCMNBDDIMHE_ = subBuilder.buildPartial();
            }
            nCMNBDDIMHECase_ = 21;
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
        progressStageList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.define.Define.internal_static_GadgetPlayInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_GadgetPlayInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.GadgetPlayInfo.class, io.grasscutter.net.proto.define.GadgetPlayInfo.Builder.class);
  }

  private int nCMNBDDIMHECase_ = 0;
  private java.lang.Object nCMNBDDIMHE_;
  public enum NCMNBDDIMHECase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    CRUCIBLE_INFO(21),
    NCMNBDDIMHE_NOT_SET(0);
    private final int value;
    private NCMNBDDIMHECase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static NCMNBDDIMHECase valueOf(int value) {
      return forNumber(value);
    }

    public static NCMNBDDIMHECase forNumber(int value) {
      switch (value) {
        case 21: return CRUCIBLE_INFO;
        case 0: return NCMNBDDIMHE_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public NCMNBDDIMHECase
  getNCMNBDDIMHECase() {
    return NCMNBDDIMHECase.forNumber(
        nCMNBDDIMHECase_);
  }

  public static final int PROGRESS_STAGE_LIST_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList progressStageList_;
  /**
   * <code>repeated uint32 progress_stage_list = 3;</code>
   * @return A list containing the progressStageList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getProgressStageListList() {
    return progressStageList_;
  }
  /**
   * <code>repeated uint32 progress_stage_list = 3;</code>
   * @return The count of progressStageList.
   */
  public int getProgressStageListCount() {
    return progressStageList_.size();
  }
  /**
   * <code>repeated uint32 progress_stage_list = 3;</code>
   * @param index The index of the element to return.
   * @return The progressStageList at the given index.
   */
  public int getProgressStageList(int index) {
    return progressStageList_.getInt(index);
  }
  private int progressStageListMemoizedSerializedSize = -1;

  public static final int START_CD_FIELD_NUMBER = 4;
  private int startCd_;
  /**
   * <code>uint32 start_cd = 4;</code>
   * @return The startCd.
   */
  @java.lang.Override
  public int getStartCd() {
    return startCd_;
  }

  public static final int CRUCIBLE_INFO_FIELD_NUMBER = 21;
  /**
   * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
   * @return Whether the crucibleInfo field is set.
   */
  @java.lang.Override
  public boolean hasCrucibleInfo() {
    return nCMNBDDIMHECase_ == 21;
  }
  /**
   * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
   * @return The crucibleInfo.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.GadgetCrucibleInfo getCrucibleInfo() {
    if (nCMNBDDIMHECase_ == 21) {
       return (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_;
    }
    return io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance();
  }
  /**
   * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.GadgetCrucibleInfoOrBuilder getCrucibleInfoOrBuilder() {
    if (nCMNBDDIMHECase_ == 21) {
       return (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_;
    }
    return io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance();
  }

  public static final int PLAY_TYPE_FIELD_NUMBER = 1;
  private int playType_;
  /**
   * <code>uint32 play_type = 1;</code>
   * @return The playType.
   */
  @java.lang.Override
  public int getPlayType() {
    return playType_;
  }

  public static final int DURATION_FIELD_NUMBER = 2;
  private int duration_;
  /**
   * <code>uint32 duration = 2;</code>
   * @return The duration.
   */
  @java.lang.Override
  public int getDuration() {
    return duration_;
  }

  public static final int PROGRESS_FIELD_NUMBER = 6;
  private int progress_;
  /**
   * <code>uint32 progress = 6;</code>
   * @return The progress.
   */
  @java.lang.Override
  public int getProgress() {
    return progress_;
  }

  public static final int START_TIME_FIELD_NUMBER = 5;
  private int startTime_;
  /**
   * <code>uint32 start_time = 5;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public int getStartTime() {
    return startTime_;
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
    if (playType_ != 0) {
      output.writeUInt32(1, playType_);
    }
    if (duration_ != 0) {
      output.writeUInt32(2, duration_);
    }
    if (getProgressStageListList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(progressStageListMemoizedSerializedSize);
    }
    for (int i = 0; i < progressStageList_.size(); i++) {
      output.writeUInt32NoTag(progressStageList_.getInt(i));
    }
    if (startCd_ != 0) {
      output.writeUInt32(4, startCd_);
    }
    if (startTime_ != 0) {
      output.writeUInt32(5, startTime_);
    }
    if (progress_ != 0) {
      output.writeUInt32(6, progress_);
    }
    if (nCMNBDDIMHECase_ == 21) {
      output.writeMessage(21, (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (playType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, playType_);
    }
    if (duration_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, duration_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < progressStageList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(progressStageList_.getInt(i));
      }
      size += dataSize;
      if (!getProgressStageListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      progressStageListMemoizedSerializedSize = dataSize;
    }
    if (startCd_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, startCd_);
    }
    if (startTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(5, startTime_);
    }
    if (progress_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, progress_);
    }
    if (nCMNBDDIMHECase_ == 21) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(21, (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.GadgetPlayInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.GadgetPlayInfo other = (io.grasscutter.net.proto.define.GadgetPlayInfo) obj;

    if (!getProgressStageListList()
        .equals(other.getProgressStageListList())) return false;
    if (getStartCd()
        != other.getStartCd()) return false;
    if (getPlayType()
        != other.getPlayType()) return false;
    if (getDuration()
        != other.getDuration()) return false;
    if (getProgress()
        != other.getProgress()) return false;
    if (getStartTime()
        != other.getStartTime()) return false;
    if (!getNCMNBDDIMHECase().equals(other.getNCMNBDDIMHECase())) return false;
    switch (nCMNBDDIMHECase_) {
      case 21:
        if (!getCrucibleInfo()
            .equals(other.getCrucibleInfo())) return false;
        break;
      case 0:
      default:
    }
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
    if (getProgressStageListCount() > 0) {
      hash = (37 * hash) + PROGRESS_STAGE_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getProgressStageListList().hashCode();
    }
    hash = (37 * hash) + START_CD_FIELD_NUMBER;
    hash = (53 * hash) + getStartCd();
    hash = (37 * hash) + PLAY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getPlayType();
    hash = (37 * hash) + DURATION_FIELD_NUMBER;
    hash = (53 * hash) + getDuration();
    hash = (37 * hash) + PROGRESS_FIELD_NUMBER;
    hash = (53 * hash) + getProgress();
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime();
    switch (nCMNBDDIMHECase_) {
      case 21:
        hash = (37 * hash) + CRUCIBLE_INFO_FIELD_NUMBER;
        hash = (53 * hash) + getCrucibleInfo().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.GadgetPlayInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.GadgetPlayInfo prototype) {
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
   * Protobuf type {@code GadgetPlayInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GadgetPlayInfo)
      io.grasscutter.net.proto.define.GadgetPlayInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_GadgetPlayInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_GadgetPlayInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.GadgetPlayInfo.class, io.grasscutter.net.proto.define.GadgetPlayInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.GadgetPlayInfo.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      progressStageList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      startCd_ = 0;

      playType_ = 0;

      duration_ = 0;

      progress_ = 0;

      startTime_ = 0;

      nCMNBDDIMHECase_ = 0;
      nCMNBDDIMHE_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_GadgetPlayInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.GadgetPlayInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.GadgetPlayInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.GadgetPlayInfo build() {
      io.grasscutter.net.proto.define.GadgetPlayInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.GadgetPlayInfo buildPartial() {
      io.grasscutter.net.proto.define.GadgetPlayInfo result = new io.grasscutter.net.proto.define.GadgetPlayInfo(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        progressStageList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.progressStageList_ = progressStageList_;
      result.startCd_ = startCd_;
      if (nCMNBDDIMHECase_ == 21) {
        if (crucibleInfoBuilder_ == null) {
          result.nCMNBDDIMHE_ = nCMNBDDIMHE_;
        } else {
          result.nCMNBDDIMHE_ = crucibleInfoBuilder_.build();
        }
      }
      result.playType_ = playType_;
      result.duration_ = duration_;
      result.progress_ = progress_;
      result.startTime_ = startTime_;
      result.nCMNBDDIMHECase_ = nCMNBDDIMHECase_;
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
      if (other instanceof io.grasscutter.net.proto.define.GadgetPlayInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.GadgetPlayInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.GadgetPlayInfo other) {
      if (other == io.grasscutter.net.proto.define.GadgetPlayInfo.getDefaultInstance()) return this;
      if (!other.progressStageList_.isEmpty()) {
        if (progressStageList_.isEmpty()) {
          progressStageList_ = other.progressStageList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureProgressStageListIsMutable();
          progressStageList_.addAll(other.progressStageList_);
        }
        onChanged();
      }
      if (other.getStartCd() != 0) {
        setStartCd(other.getStartCd());
      }
      if (other.getPlayType() != 0) {
        setPlayType(other.getPlayType());
      }
      if (other.getDuration() != 0) {
        setDuration(other.getDuration());
      }
      if (other.getProgress() != 0) {
        setProgress(other.getProgress());
      }
      if (other.getStartTime() != 0) {
        setStartTime(other.getStartTime());
      }
      switch (other.getNCMNBDDIMHECase()) {
        case CRUCIBLE_INFO: {
          mergeCrucibleInfo(other.getCrucibleInfo());
          break;
        }
        case NCMNBDDIMHE_NOT_SET: {
          break;
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
      io.grasscutter.net.proto.define.GadgetPlayInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.GadgetPlayInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int nCMNBDDIMHECase_ = 0;
    private java.lang.Object nCMNBDDIMHE_;
    public NCMNBDDIMHECase
        getNCMNBDDIMHECase() {
      return NCMNBDDIMHECase.forNumber(
          nCMNBDDIMHECase_);
    }

    public Builder clearNCMNBDDIMHE() {
      nCMNBDDIMHECase_ = 0;
      nCMNBDDIMHE_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.Internal.IntList progressStageList_ = emptyIntList();
    private void ensureProgressStageListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        progressStageList_ = mutableCopy(progressStageList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @return A list containing the progressStageList.
     */
    public java.util.List<java.lang.Integer>
        getProgressStageListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(progressStageList_) : progressStageList_;
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @return The count of progressStageList.
     */
    public int getProgressStageListCount() {
      return progressStageList_.size();
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @param index The index of the element to return.
     * @return The progressStageList at the given index.
     */
    public int getProgressStageList(int index) {
      return progressStageList_.getInt(index);
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @param index The index to set the value at.
     * @param value The progressStageList to set.
     * @return This builder for chaining.
     */
    public Builder setProgressStageList(
        int index, int value) {
      ensureProgressStageListIsMutable();
      progressStageList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @param value The progressStageList to add.
     * @return This builder for chaining.
     */
    public Builder addProgressStageList(int value) {
      ensureProgressStageListIsMutable();
      progressStageList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @param values The progressStageList to add.
     * @return This builder for chaining.
     */
    public Builder addAllProgressStageList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureProgressStageListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, progressStageList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 progress_stage_list = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgressStageList() {
      progressStageList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int startCd_ ;
    /**
     * <code>uint32 start_cd = 4;</code>
     * @return The startCd.
     */
    @java.lang.Override
    public int getStartCd() {
      return startCd_;
    }
    /**
     * <code>uint32 start_cd = 4;</code>
     * @param value The startCd to set.
     * @return This builder for chaining.
     */
    public Builder setStartCd(int value) {
      
      startCd_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 start_cd = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartCd() {
      
      startCd_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.GadgetCrucibleInfo, io.grasscutter.net.proto.define.GadgetCrucibleInfo.Builder, io.grasscutter.net.proto.define.GadgetCrucibleInfoOrBuilder> crucibleInfoBuilder_;
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     * @return Whether the crucibleInfo field is set.
     */
    @java.lang.Override
    public boolean hasCrucibleInfo() {
      return nCMNBDDIMHECase_ == 21;
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     * @return The crucibleInfo.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.define.GadgetCrucibleInfo getCrucibleInfo() {
      if (crucibleInfoBuilder_ == null) {
        if (nCMNBDDIMHECase_ == 21) {
          return (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_;
        }
        return io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance();
      } else {
        if (nCMNBDDIMHECase_ == 21) {
          return crucibleInfoBuilder_.getMessage();
        }
        return io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance();
      }
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    public Builder setCrucibleInfo(io.grasscutter.net.proto.define.GadgetCrucibleInfo value) {
      if (crucibleInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nCMNBDDIMHE_ = value;
        onChanged();
      } else {
        crucibleInfoBuilder_.setMessage(value);
      }
      nCMNBDDIMHECase_ = 21;
      return this;
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    public Builder setCrucibleInfo(
        io.grasscutter.net.proto.define.GadgetCrucibleInfo.Builder builderForValue) {
      if (crucibleInfoBuilder_ == null) {
        nCMNBDDIMHE_ = builderForValue.build();
        onChanged();
      } else {
        crucibleInfoBuilder_.setMessage(builderForValue.build());
      }
      nCMNBDDIMHECase_ = 21;
      return this;
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    public Builder mergeCrucibleInfo(io.grasscutter.net.proto.define.GadgetCrucibleInfo value) {
      if (crucibleInfoBuilder_ == null) {
        if (nCMNBDDIMHECase_ == 21 &&
            nCMNBDDIMHE_ != io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance()) {
          nCMNBDDIMHE_ = io.grasscutter.net.proto.define.GadgetCrucibleInfo.newBuilder((io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_)
              .mergeFrom(value).buildPartial();
        } else {
          nCMNBDDIMHE_ = value;
        }
        onChanged();
      } else {
        if (nCMNBDDIMHECase_ == 21) {
          crucibleInfoBuilder_.mergeFrom(value);
        }
        crucibleInfoBuilder_.setMessage(value);
      }
      nCMNBDDIMHECase_ = 21;
      return this;
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    public Builder clearCrucibleInfo() {
      if (crucibleInfoBuilder_ == null) {
        if (nCMNBDDIMHECase_ == 21) {
          nCMNBDDIMHECase_ = 0;
          nCMNBDDIMHE_ = null;
          onChanged();
        }
      } else {
        if (nCMNBDDIMHECase_ == 21) {
          nCMNBDDIMHECase_ = 0;
          nCMNBDDIMHE_ = null;
        }
        crucibleInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    public io.grasscutter.net.proto.define.GadgetCrucibleInfo.Builder getCrucibleInfoBuilder() {
      return getCrucibleInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    @java.lang.Override
    public io.grasscutter.net.proto.define.GadgetCrucibleInfoOrBuilder getCrucibleInfoOrBuilder() {
      if ((nCMNBDDIMHECase_ == 21) && (crucibleInfoBuilder_ != null)) {
        return crucibleInfoBuilder_.getMessageOrBuilder();
      } else {
        if (nCMNBDDIMHECase_ == 21) {
          return (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_;
        }
        return io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance();
      }
    }
    /**
     * <code>.GadgetCrucibleInfo crucible_info = 21;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.GadgetCrucibleInfo, io.grasscutter.net.proto.define.GadgetCrucibleInfo.Builder, io.grasscutter.net.proto.define.GadgetCrucibleInfoOrBuilder> 
        getCrucibleInfoFieldBuilder() {
      if (crucibleInfoBuilder_ == null) {
        if (!(nCMNBDDIMHECase_ == 21)) {
          nCMNBDDIMHE_ = io.grasscutter.net.proto.define.GadgetCrucibleInfo.getDefaultInstance();
        }
        crucibleInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.GadgetCrucibleInfo, io.grasscutter.net.proto.define.GadgetCrucibleInfo.Builder, io.grasscutter.net.proto.define.GadgetCrucibleInfoOrBuilder>(
                (io.grasscutter.net.proto.define.GadgetCrucibleInfo) nCMNBDDIMHE_,
                getParentForChildren(),
                isClean());
        nCMNBDDIMHE_ = null;
      }
      nCMNBDDIMHECase_ = 21;
      onChanged();;
      return crucibleInfoBuilder_;
    }

    private int playType_ ;
    /**
     * <code>uint32 play_type = 1;</code>
     * @return The playType.
     */
    @java.lang.Override
    public int getPlayType() {
      return playType_;
    }
    /**
     * <code>uint32 play_type = 1;</code>
     * @param value The playType to set.
     * @return This builder for chaining.
     */
    public Builder setPlayType(int value) {
      
      playType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 play_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPlayType() {
      
      playType_ = 0;
      onChanged();
      return this;
    }

    private int duration_ ;
    /**
     * <code>uint32 duration = 2;</code>
     * @return The duration.
     */
    @java.lang.Override
    public int getDuration() {
      return duration_;
    }
    /**
     * <code>uint32 duration = 2;</code>
     * @param value The duration to set.
     * @return This builder for chaining.
     */
    public Builder setDuration(int value) {
      
      duration_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 duration = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDuration() {
      
      duration_ = 0;
      onChanged();
      return this;
    }

    private int progress_ ;
    /**
     * <code>uint32 progress = 6;</code>
     * @return The progress.
     */
    @java.lang.Override
    public int getProgress() {
      return progress_;
    }
    /**
     * <code>uint32 progress = 6;</code>
     * @param value The progress to set.
     * @return This builder for chaining.
     */
    public Builder setProgress(int value) {
      
      progress_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 progress = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearProgress() {
      
      progress_ = 0;
      onChanged();
      return this;
    }

    private int startTime_ ;
    /**
     * <code>uint32 start_time = 5;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }
    /**
     * <code>uint32 start_time = 5;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(int value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 start_time = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GadgetPlayInfo)
  }

  // @@protoc_insertion_point(class_scope:GadgetPlayInfo)
  private static final io.grasscutter.net.proto.define.GadgetPlayInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.GadgetPlayInfo();
  }

  public static io.grasscutter.net.proto.define.GadgetPlayInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GadgetPlayInfo>
      PARSER = new com.google.protobuf.AbstractParser<GadgetPlayInfo>() {
    @java.lang.Override
    public GadgetPlayInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GadgetPlayInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GadgetPlayInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GadgetPlayInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.GadgetPlayInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
