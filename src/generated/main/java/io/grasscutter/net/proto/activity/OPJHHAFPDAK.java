// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code OPJHHAFPDAK}
 */
public final class OPJHHAFPDAK extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OPJHHAFPDAK)
    OPJHHAFPDAKOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OPJHHAFPDAK.newBuilder() to construct.
  private OPJHHAFPDAK(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OPJHHAFPDAK() {
    chapterInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OPJHHAFPDAK();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OPJHHAFPDAK(
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
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              chapterInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.CNHHCBOMMBH>();
              mutable_bitField0_ |= 0x00000001;
            }
            chapterInfoList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.CNHHCBOMMBH.parser(), extensionRegistry));
            break;
          }
          case 48: {

            isContentClosed_ = input.readBool();
            break;
          }
          case 64: {

            contentCloseTime_ = input.readUInt32();
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
        chapterInfoList_ = java.util.Collections.unmodifiableList(chapterInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_OPJHHAFPDAK_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_OPJHHAFPDAK_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.OPJHHAFPDAK.class, io.grasscutter.net.proto.activity.OPJHHAFPDAK.Builder.class);
  }

  public static final int CHAPTER_INFO_LIST_FIELD_NUMBER = 1;
  private java.util.List<io.grasscutter.net.proto.activity.CNHHCBOMMBH> chapterInfoList_;
  /**
   * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.CNHHCBOMMBH> getChapterInfoListList() {
    return chapterInfoList_;
  }
  /**
   * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder> 
      getChapterInfoListOrBuilderList() {
    return chapterInfoList_;
  }
  /**
   * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
   */
  @java.lang.Override
  public int getChapterInfoListCount() {
    return chapterInfoList_.size();
  }
  /**
   * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.CNHHCBOMMBH getChapterInfoList(int index) {
    return chapterInfoList_.get(index);
  }
  /**
   * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder getChapterInfoListOrBuilder(
      int index) {
    return chapterInfoList_.get(index);
  }

  public static final int CONTENT_CLOSE_TIME_FIELD_NUMBER = 8;
  private int contentCloseTime_;
  /**
   * <code>uint32 content_close_time = 8;</code>
   * @return The contentCloseTime.
   */
  @java.lang.Override
  public int getContentCloseTime() {
    return contentCloseTime_;
  }

  public static final int IS_CONTENT_CLOSED_FIELD_NUMBER = 6;
  private boolean isContentClosed_;
  /**
   * <code>bool is_content_closed = 6;</code>
   * @return The isContentClosed.
   */
  @java.lang.Override
  public boolean getIsContentClosed() {
    return isContentClosed_;
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
    for (int i = 0; i < chapterInfoList_.size(); i++) {
      output.writeMessage(1, chapterInfoList_.get(i));
    }
    if (isContentClosed_ != false) {
      output.writeBool(6, isContentClosed_);
    }
    if (contentCloseTime_ != 0) {
      output.writeUInt32(8, contentCloseTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < chapterInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, chapterInfoList_.get(i));
    }
    if (isContentClosed_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isContentClosed_);
    }
    if (contentCloseTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, contentCloseTime_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.OPJHHAFPDAK)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.OPJHHAFPDAK other = (io.grasscutter.net.proto.activity.OPJHHAFPDAK) obj;

    if (!getChapterInfoListList()
        .equals(other.getChapterInfoListList())) return false;
    if (getContentCloseTime()
        != other.getContentCloseTime()) return false;
    if (getIsContentClosed()
        != other.getIsContentClosed()) return false;
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
    if (getChapterInfoListCount() > 0) {
      hash = (37 * hash) + CHAPTER_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getChapterInfoListList().hashCode();
    }
    hash = (37 * hash) + CONTENT_CLOSE_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getContentCloseTime();
    hash = (37 * hash) + IS_CONTENT_CLOSED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsContentClosed());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.OPJHHAFPDAK prototype) {
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
   * Protobuf type {@code OPJHHAFPDAK}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OPJHHAFPDAK)
      io.grasscutter.net.proto.activity.OPJHHAFPDAKOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_OPJHHAFPDAK_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_OPJHHAFPDAK_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.OPJHHAFPDAK.class, io.grasscutter.net.proto.activity.OPJHHAFPDAK.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.OPJHHAFPDAK.newBuilder()
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
        getChapterInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (chapterInfoListBuilder_ == null) {
        chapterInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        chapterInfoListBuilder_.clear();
      }
      contentCloseTime_ = 0;

      isContentClosed_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_OPJHHAFPDAK_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.OPJHHAFPDAK getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.OPJHHAFPDAK.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.OPJHHAFPDAK build() {
      io.grasscutter.net.proto.activity.OPJHHAFPDAK result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.OPJHHAFPDAK buildPartial() {
      io.grasscutter.net.proto.activity.OPJHHAFPDAK result = new io.grasscutter.net.proto.activity.OPJHHAFPDAK(this);
      int from_bitField0_ = bitField0_;
      if (chapterInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          chapterInfoList_ = java.util.Collections.unmodifiableList(chapterInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.chapterInfoList_ = chapterInfoList_;
      } else {
        result.chapterInfoList_ = chapterInfoListBuilder_.build();
      }
      result.contentCloseTime_ = contentCloseTime_;
      result.isContentClosed_ = isContentClosed_;
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
      if (other instanceof io.grasscutter.net.proto.activity.OPJHHAFPDAK) {
        return mergeFrom((io.grasscutter.net.proto.activity.OPJHHAFPDAK)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.OPJHHAFPDAK other) {
      if (other == io.grasscutter.net.proto.activity.OPJHHAFPDAK.getDefaultInstance()) return this;
      if (chapterInfoListBuilder_ == null) {
        if (!other.chapterInfoList_.isEmpty()) {
          if (chapterInfoList_.isEmpty()) {
            chapterInfoList_ = other.chapterInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureChapterInfoListIsMutable();
            chapterInfoList_.addAll(other.chapterInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.chapterInfoList_.isEmpty()) {
          if (chapterInfoListBuilder_.isEmpty()) {
            chapterInfoListBuilder_.dispose();
            chapterInfoListBuilder_ = null;
            chapterInfoList_ = other.chapterInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            chapterInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getChapterInfoListFieldBuilder() : null;
          } else {
            chapterInfoListBuilder_.addAllMessages(other.chapterInfoList_);
          }
        }
      }
      if (other.getContentCloseTime() != 0) {
        setContentCloseTime(other.getContentCloseTime());
      }
      if (other.getIsContentClosed() != false) {
        setIsContentClosed(other.getIsContentClosed());
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
      io.grasscutter.net.proto.activity.OPJHHAFPDAK parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.OPJHHAFPDAK) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.CNHHCBOMMBH> chapterInfoList_ =
      java.util.Collections.emptyList();
    private void ensureChapterInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        chapterInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.CNHHCBOMMBH>(chapterInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.CNHHCBOMMBH, io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder, io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder> chapterInfoListBuilder_;

    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.CNHHCBOMMBH> getChapterInfoListList() {
      if (chapterInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(chapterInfoList_);
      } else {
        return chapterInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public int getChapterInfoListCount() {
      if (chapterInfoListBuilder_ == null) {
        return chapterInfoList_.size();
      } else {
        return chapterInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.CNHHCBOMMBH getChapterInfoList(int index) {
      if (chapterInfoListBuilder_ == null) {
        return chapterInfoList_.get(index);
      } else {
        return chapterInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder setChapterInfoList(
        int index, io.grasscutter.net.proto.activity.CNHHCBOMMBH value) {
      if (chapterInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChapterInfoListIsMutable();
        chapterInfoList_.set(index, value);
        onChanged();
      } else {
        chapterInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder setChapterInfoList(
        int index, io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder builderForValue) {
      if (chapterInfoListBuilder_ == null) {
        ensureChapterInfoListIsMutable();
        chapterInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        chapterInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder addChapterInfoList(io.grasscutter.net.proto.activity.CNHHCBOMMBH value) {
      if (chapterInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChapterInfoListIsMutable();
        chapterInfoList_.add(value);
        onChanged();
      } else {
        chapterInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder addChapterInfoList(
        int index, io.grasscutter.net.proto.activity.CNHHCBOMMBH value) {
      if (chapterInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureChapterInfoListIsMutable();
        chapterInfoList_.add(index, value);
        onChanged();
      } else {
        chapterInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder addChapterInfoList(
        io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder builderForValue) {
      if (chapterInfoListBuilder_ == null) {
        ensureChapterInfoListIsMutable();
        chapterInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        chapterInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder addChapterInfoList(
        int index, io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder builderForValue) {
      if (chapterInfoListBuilder_ == null) {
        ensureChapterInfoListIsMutable();
        chapterInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        chapterInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder addAllChapterInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.CNHHCBOMMBH> values) {
      if (chapterInfoListBuilder_ == null) {
        ensureChapterInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, chapterInfoList_);
        onChanged();
      } else {
        chapterInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder clearChapterInfoList() {
      if (chapterInfoListBuilder_ == null) {
        chapterInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        chapterInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public Builder removeChapterInfoList(int index) {
      if (chapterInfoListBuilder_ == null) {
        ensureChapterInfoListIsMutable();
        chapterInfoList_.remove(index);
        onChanged();
      } else {
        chapterInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder getChapterInfoListBuilder(
        int index) {
      return getChapterInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder getChapterInfoListOrBuilder(
        int index) {
      if (chapterInfoListBuilder_ == null) {
        return chapterInfoList_.get(index);  } else {
        return chapterInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder> 
         getChapterInfoListOrBuilderList() {
      if (chapterInfoListBuilder_ != null) {
        return chapterInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(chapterInfoList_);
      }
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder addChapterInfoListBuilder() {
      return getChapterInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.CNHHCBOMMBH.getDefaultInstance());
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder addChapterInfoListBuilder(
        int index) {
      return getChapterInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.CNHHCBOMMBH.getDefaultInstance());
    }
    /**
     * <code>repeated .CNHHCBOMMBH chapter_info_list = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder> 
         getChapterInfoListBuilderList() {
      return getChapterInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.CNHHCBOMMBH, io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder, io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder> 
        getChapterInfoListFieldBuilder() {
      if (chapterInfoListBuilder_ == null) {
        chapterInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.CNHHCBOMMBH, io.grasscutter.net.proto.activity.CNHHCBOMMBH.Builder, io.grasscutter.net.proto.activity.CNHHCBOMMBHOrBuilder>(
                chapterInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        chapterInfoList_ = null;
      }
      return chapterInfoListBuilder_;
    }

    private int contentCloseTime_ ;
    /**
     * <code>uint32 content_close_time = 8;</code>
     * @return The contentCloseTime.
     */
    @java.lang.Override
    public int getContentCloseTime() {
      return contentCloseTime_;
    }
    /**
     * <code>uint32 content_close_time = 8;</code>
     * @param value The contentCloseTime to set.
     * @return This builder for chaining.
     */
    public Builder setContentCloseTime(int value) {
      
      contentCloseTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 content_close_time = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearContentCloseTime() {
      
      contentCloseTime_ = 0;
      onChanged();
      return this;
    }

    private boolean isContentClosed_ ;
    /**
     * <code>bool is_content_closed = 6;</code>
     * @return The isContentClosed.
     */
    @java.lang.Override
    public boolean getIsContentClosed() {
      return isContentClosed_;
    }
    /**
     * <code>bool is_content_closed = 6;</code>
     * @param value The isContentClosed to set.
     * @return This builder for chaining.
     */
    public Builder setIsContentClosed(boolean value) {
      
      isContentClosed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_content_closed = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsContentClosed() {
      
      isContentClosed_ = false;
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


    // @@protoc_insertion_point(builder_scope:OPJHHAFPDAK)
  }

  // @@protoc_insertion_point(class_scope:OPJHHAFPDAK)
  private static final io.grasscutter.net.proto.activity.OPJHHAFPDAK DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.OPJHHAFPDAK();
  }

  public static io.grasscutter.net.proto.activity.OPJHHAFPDAK getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OPJHHAFPDAK>
      PARSER = new com.google.protobuf.AbstractParser<OPJHHAFPDAK>() {
    @java.lang.Override
    public OPJHHAFPDAK parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OPJHHAFPDAK(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OPJHHAFPDAK> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OPJHHAFPDAK> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.OPJHHAFPDAK getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
