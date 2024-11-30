// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code ChannelerSlabChallenge}
 */
public final class ChannelerSlabChallenge extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ChannelerSlabChallenge)
    ChannelerSlabChallengeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ChannelerSlabChallenge.newBuilder() to construct.
  private ChannelerSlabChallenge(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ChannelerSlabChallenge() {
    campList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ChannelerSlabChallenge();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ChannelerSlabChallenge(
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
          case 64: {

            activeCampIndex_ = input.readUInt32();
            break;
          }
          case 98: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              campList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.ChannelerSlabCamp>();
              mutable_bitField0_ |= 0x00000001;
            }
            campList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.ChannelerSlabCamp.parser(), extensionRegistry));
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
        campList_ = java.util.Collections.unmodifiableList(campList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ChannelerSlabChallenge_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ChannelerSlabChallenge_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.ChannelerSlabChallenge.class, io.grasscutter.net.proto.activity.ChannelerSlabChallenge.Builder.class);
  }

  public static final int CAMP_LIST_FIELD_NUMBER = 12;
  private java.util.List<io.grasscutter.net.proto.activity.ChannelerSlabCamp> campList_;
  /**
   * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.ChannelerSlabCamp> getCampListList() {
    return campList_;
  }
  /**
   * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder> 
      getCampListOrBuilderList() {
    return campList_;
  }
  /**
   * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
   */
  @java.lang.Override
  public int getCampListCount() {
    return campList_.size();
  }
  /**
   * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.ChannelerSlabCamp getCampList(int index) {
    return campList_.get(index);
  }
  /**
   * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder getCampListOrBuilder(
      int index) {
    return campList_.get(index);
  }

  public static final int ACTIVE_CAMP_INDEX_FIELD_NUMBER = 8;
  private int activeCampIndex_;
  /**
   * <code>uint32 active_camp_index = 8;</code>
   * @return The activeCampIndex.
   */
  @java.lang.Override
  public int getActiveCampIndex() {
    return activeCampIndex_;
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
    if (activeCampIndex_ != 0) {
      output.writeUInt32(8, activeCampIndex_);
    }
    for (int i = 0; i < campList_.size(); i++) {
      output.writeMessage(12, campList_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (activeCampIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, activeCampIndex_);
    }
    for (int i = 0; i < campList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, campList_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.ChannelerSlabChallenge)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.ChannelerSlabChallenge other = (io.grasscutter.net.proto.activity.ChannelerSlabChallenge) obj;

    if (!getCampListList()
        .equals(other.getCampListList())) return false;
    if (getActiveCampIndex()
        != other.getActiveCampIndex()) return false;
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
    if (getCampListCount() > 0) {
      hash = (37 * hash) + CAMP_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getCampListList().hashCode();
    }
    hash = (37 * hash) + ACTIVE_CAMP_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getActiveCampIndex();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.ChannelerSlabChallenge prototype) {
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
   * Protobuf type {@code ChannelerSlabChallenge}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ChannelerSlabChallenge)
      io.grasscutter.net.proto.activity.ChannelerSlabChallengeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ChannelerSlabChallenge_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ChannelerSlabChallenge_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.ChannelerSlabChallenge.class, io.grasscutter.net.proto.activity.ChannelerSlabChallenge.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.ChannelerSlabChallenge.newBuilder()
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
        getCampListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (campListBuilder_ == null) {
        campList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        campListBuilder_.clear();
      }
      activeCampIndex_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ChannelerSlabChallenge_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ChannelerSlabChallenge getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.ChannelerSlabChallenge.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ChannelerSlabChallenge build() {
      io.grasscutter.net.proto.activity.ChannelerSlabChallenge result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ChannelerSlabChallenge buildPartial() {
      io.grasscutter.net.proto.activity.ChannelerSlabChallenge result = new io.grasscutter.net.proto.activity.ChannelerSlabChallenge(this);
      int from_bitField0_ = bitField0_;
      if (campListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          campList_ = java.util.Collections.unmodifiableList(campList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.campList_ = campList_;
      } else {
        result.campList_ = campListBuilder_.build();
      }
      result.activeCampIndex_ = activeCampIndex_;
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
      if (other instanceof io.grasscutter.net.proto.activity.ChannelerSlabChallenge) {
        return mergeFrom((io.grasscutter.net.proto.activity.ChannelerSlabChallenge)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.ChannelerSlabChallenge other) {
      if (other == io.grasscutter.net.proto.activity.ChannelerSlabChallenge.getDefaultInstance()) return this;
      if (campListBuilder_ == null) {
        if (!other.campList_.isEmpty()) {
          if (campList_.isEmpty()) {
            campList_ = other.campList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCampListIsMutable();
            campList_.addAll(other.campList_);
          }
          onChanged();
        }
      } else {
        if (!other.campList_.isEmpty()) {
          if (campListBuilder_.isEmpty()) {
            campListBuilder_.dispose();
            campListBuilder_ = null;
            campList_ = other.campList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            campListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCampListFieldBuilder() : null;
          } else {
            campListBuilder_.addAllMessages(other.campList_);
          }
        }
      }
      if (other.getActiveCampIndex() != 0) {
        setActiveCampIndex(other.getActiveCampIndex());
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
      io.grasscutter.net.proto.activity.ChannelerSlabChallenge parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.ChannelerSlabChallenge) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.ChannelerSlabCamp> campList_ =
      java.util.Collections.emptyList();
    private void ensureCampListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        campList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.ChannelerSlabCamp>(campList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.ChannelerSlabCamp, io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder, io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder> campListBuilder_;

    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.ChannelerSlabCamp> getCampListList() {
      if (campListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(campList_);
      } else {
        return campListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public int getCampListCount() {
      if (campListBuilder_ == null) {
        return campList_.size();
      } else {
        return campListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public io.grasscutter.net.proto.activity.ChannelerSlabCamp getCampList(int index) {
      if (campListBuilder_ == null) {
        return campList_.get(index);
      } else {
        return campListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder setCampList(
        int index, io.grasscutter.net.proto.activity.ChannelerSlabCamp value) {
      if (campListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampListIsMutable();
        campList_.set(index, value);
        onChanged();
      } else {
        campListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder setCampList(
        int index, io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder builderForValue) {
      if (campListBuilder_ == null) {
        ensureCampListIsMutable();
        campList_.set(index, builderForValue.build());
        onChanged();
      } else {
        campListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder addCampList(io.grasscutter.net.proto.activity.ChannelerSlabCamp value) {
      if (campListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampListIsMutable();
        campList_.add(value);
        onChanged();
      } else {
        campListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder addCampList(
        int index, io.grasscutter.net.proto.activity.ChannelerSlabCamp value) {
      if (campListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCampListIsMutable();
        campList_.add(index, value);
        onChanged();
      } else {
        campListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder addCampList(
        io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder builderForValue) {
      if (campListBuilder_ == null) {
        ensureCampListIsMutable();
        campList_.add(builderForValue.build());
        onChanged();
      } else {
        campListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder addCampList(
        int index, io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder builderForValue) {
      if (campListBuilder_ == null) {
        ensureCampListIsMutable();
        campList_.add(index, builderForValue.build());
        onChanged();
      } else {
        campListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder addAllCampList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.ChannelerSlabCamp> values) {
      if (campListBuilder_ == null) {
        ensureCampListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, campList_);
        onChanged();
      } else {
        campListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder clearCampList() {
      if (campListBuilder_ == null) {
        campList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        campListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public Builder removeCampList(int index) {
      if (campListBuilder_ == null) {
        ensureCampListIsMutable();
        campList_.remove(index);
        onChanged();
      } else {
        campListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder getCampListBuilder(
        int index) {
      return getCampListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder getCampListOrBuilder(
        int index) {
      if (campListBuilder_ == null) {
        return campList_.get(index);  } else {
        return campListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder> 
         getCampListOrBuilderList() {
      if (campListBuilder_ != null) {
        return campListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(campList_);
      }
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder addCampListBuilder() {
      return getCampListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.ChannelerSlabCamp.getDefaultInstance());
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder addCampListBuilder(
        int index) {
      return getCampListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.ChannelerSlabCamp.getDefaultInstance());
    }
    /**
     * <code>repeated .ChannelerSlabCamp camp_list = 12;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder> 
         getCampListBuilderList() {
      return getCampListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.ChannelerSlabCamp, io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder, io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder> 
        getCampListFieldBuilder() {
      if (campListBuilder_ == null) {
        campListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.ChannelerSlabCamp, io.grasscutter.net.proto.activity.ChannelerSlabCamp.Builder, io.grasscutter.net.proto.activity.ChannelerSlabCampOrBuilder>(
                campList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        campList_ = null;
      }
      return campListBuilder_;
    }

    private int activeCampIndex_ ;
    /**
     * <code>uint32 active_camp_index = 8;</code>
     * @return The activeCampIndex.
     */
    @java.lang.Override
    public int getActiveCampIndex() {
      return activeCampIndex_;
    }
    /**
     * <code>uint32 active_camp_index = 8;</code>
     * @param value The activeCampIndex to set.
     * @return This builder for chaining.
     */
    public Builder setActiveCampIndex(int value) {
      
      activeCampIndex_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 active_camp_index = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearActiveCampIndex() {
      
      activeCampIndex_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ChannelerSlabChallenge)
  }

  // @@protoc_insertion_point(class_scope:ChannelerSlabChallenge)
  private static final io.grasscutter.net.proto.activity.ChannelerSlabChallenge DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.ChannelerSlabChallenge();
  }

  public static io.grasscutter.net.proto.activity.ChannelerSlabChallenge getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ChannelerSlabChallenge>
      PARSER = new com.google.protobuf.AbstractParser<ChannelerSlabChallenge>() {
    @java.lang.Override
    public ChannelerSlabChallenge parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ChannelerSlabChallenge(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ChannelerSlabChallenge> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ChannelerSlabChallenge> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.ChannelerSlabChallenge getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
