// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code BBKPGDLLJHP}
 */
public final class BBKPGDLLJHP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BBKPGDLLJHP)
    BBKPGDLLJHPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BBKPGDLLJHP.newBuilder() to construct.
  private BBKPGDLLJHP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BBKPGDLLJHP() {
    stageInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BBKPGDLLJHP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BBKPGDLLJHP(
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
          case 34: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              stageInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.LKNMMGECLJM>();
              mutable_bitField0_ |= 0x00000001;
            }
            stageInfoList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.LKNMMGECLJM.parser(), extensionRegistry));
            break;
          }
          case 72: {

            gLGGFPOKIBE_ = input.readUInt32();
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
        stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_BBKPGDLLJHP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_BBKPGDLLJHP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.BBKPGDLLJHP.class, io.grasscutter.net.proto.activity.BBKPGDLLJHP.Builder.class);
  }

  public static final int STAGE_INFO_LIST_FIELD_NUMBER = 4;
  private java.util.List<io.grasscutter.net.proto.activity.LKNMMGECLJM> stageInfoList_;
  /**
   * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.LKNMMGECLJM> getStageInfoListList() {
    return stageInfoList_;
  }
  /**
   * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder> 
      getStageInfoListOrBuilderList() {
    return stageInfoList_;
  }
  /**
   * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
   */
  @java.lang.Override
  public int getStageInfoListCount() {
    return stageInfoList_.size();
  }
  /**
   * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.LKNMMGECLJM getStageInfoList(int index) {
    return stageInfoList_.get(index);
  }
  /**
   * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder getStageInfoListOrBuilder(
      int index) {
    return stageInfoList_.get(index);
  }

  public static final int GLGGFPOKIBE_FIELD_NUMBER = 9;
  private int gLGGFPOKIBE_;
  /**
   * <code>uint32 GLGGFPOKIBE = 9;</code>
   * @return The gLGGFPOKIBE.
   */
  @java.lang.Override
  public int getGLGGFPOKIBE() {
    return gLGGFPOKIBE_;
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
    for (int i = 0; i < stageInfoList_.size(); i++) {
      output.writeMessage(4, stageInfoList_.get(i));
    }
    if (gLGGFPOKIBE_ != 0) {
      output.writeUInt32(9, gLGGFPOKIBE_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stageInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, stageInfoList_.get(i));
    }
    if (gLGGFPOKIBE_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, gLGGFPOKIBE_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.BBKPGDLLJHP)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.BBKPGDLLJHP other = (io.grasscutter.net.proto.activity.BBKPGDLLJHP) obj;

    if (!getStageInfoListList()
        .equals(other.getStageInfoListList())) return false;
    if (getGLGGFPOKIBE()
        != other.getGLGGFPOKIBE()) return false;
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
    if (getStageInfoListCount() > 0) {
      hash = (37 * hash) + STAGE_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getStageInfoListList().hashCode();
    }
    hash = (37 * hash) + GLGGFPOKIBE_FIELD_NUMBER;
    hash = (53 * hash) + getGLGGFPOKIBE();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.BBKPGDLLJHP prototype) {
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
   * Protobuf type {@code BBKPGDLLJHP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BBKPGDLLJHP)
      io.grasscutter.net.proto.activity.BBKPGDLLJHPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_BBKPGDLLJHP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_BBKPGDLLJHP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.BBKPGDLLJHP.class, io.grasscutter.net.proto.activity.BBKPGDLLJHP.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.BBKPGDLLJHP.newBuilder()
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
        getStageInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (stageInfoListBuilder_ == null) {
        stageInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        stageInfoListBuilder_.clear();
      }
      gLGGFPOKIBE_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_BBKPGDLLJHP_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.BBKPGDLLJHP getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.BBKPGDLLJHP.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.BBKPGDLLJHP build() {
      io.grasscutter.net.proto.activity.BBKPGDLLJHP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.BBKPGDLLJHP buildPartial() {
      io.grasscutter.net.proto.activity.BBKPGDLLJHP result = new io.grasscutter.net.proto.activity.BBKPGDLLJHP(this);
      int from_bitField0_ = bitField0_;
      if (stageInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stageInfoList_ = java.util.Collections.unmodifiableList(stageInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stageInfoList_ = stageInfoList_;
      } else {
        result.stageInfoList_ = stageInfoListBuilder_.build();
      }
      result.gLGGFPOKIBE_ = gLGGFPOKIBE_;
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
      if (other instanceof io.grasscutter.net.proto.activity.BBKPGDLLJHP) {
        return mergeFrom((io.grasscutter.net.proto.activity.BBKPGDLLJHP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.BBKPGDLLJHP other) {
      if (other == io.grasscutter.net.proto.activity.BBKPGDLLJHP.getDefaultInstance()) return this;
      if (stageInfoListBuilder_ == null) {
        if (!other.stageInfoList_.isEmpty()) {
          if (stageInfoList_.isEmpty()) {
            stageInfoList_ = other.stageInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStageInfoListIsMutable();
            stageInfoList_.addAll(other.stageInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.stageInfoList_.isEmpty()) {
          if (stageInfoListBuilder_.isEmpty()) {
            stageInfoListBuilder_.dispose();
            stageInfoListBuilder_ = null;
            stageInfoList_ = other.stageInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stageInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStageInfoListFieldBuilder() : null;
          } else {
            stageInfoListBuilder_.addAllMessages(other.stageInfoList_);
          }
        }
      }
      if (other.getGLGGFPOKIBE() != 0) {
        setGLGGFPOKIBE(other.getGLGGFPOKIBE());
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
      io.grasscutter.net.proto.activity.BBKPGDLLJHP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.BBKPGDLLJHP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.LKNMMGECLJM> stageInfoList_ =
      java.util.Collections.emptyList();
    private void ensureStageInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stageInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.LKNMMGECLJM>(stageInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.LKNMMGECLJM, io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder, io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder> stageInfoListBuilder_;

    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.LKNMMGECLJM> getStageInfoListList() {
      if (stageInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stageInfoList_);
      } else {
        return stageInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public int getStageInfoListCount() {
      if (stageInfoListBuilder_ == null) {
        return stageInfoList_.size();
      } else {
        return stageInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public io.grasscutter.net.proto.activity.LKNMMGECLJM getStageInfoList(int index) {
      if (stageInfoListBuilder_ == null) {
        return stageInfoList_.get(index);
      } else {
        return stageInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder setStageInfoList(
        int index, io.grasscutter.net.proto.activity.LKNMMGECLJM value) {
      if (stageInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStageInfoListIsMutable();
        stageInfoList_.set(index, value);
        onChanged();
      } else {
        stageInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder setStageInfoList(
        int index, io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder builderForValue) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        stageInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder addStageInfoList(io.grasscutter.net.proto.activity.LKNMMGECLJM value) {
      if (stageInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStageInfoListIsMutable();
        stageInfoList_.add(value);
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder addStageInfoList(
        int index, io.grasscutter.net.proto.activity.LKNMMGECLJM value) {
      if (stageInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStageInfoListIsMutable();
        stageInfoList_.add(index, value);
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder addStageInfoList(
        io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder builderForValue) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder addStageInfoList(
        int index, io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder builderForValue) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        stageInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder addAllStageInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.LKNMMGECLJM> values) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, stageInfoList_);
        onChanged();
      } else {
        stageInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder clearStageInfoList() {
      if (stageInfoListBuilder_ == null) {
        stageInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stageInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public Builder removeStageInfoList(int index) {
      if (stageInfoListBuilder_ == null) {
        ensureStageInfoListIsMutable();
        stageInfoList_.remove(index);
        onChanged();
      } else {
        stageInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder getStageInfoListBuilder(
        int index) {
      return getStageInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder getStageInfoListOrBuilder(
        int index) {
      if (stageInfoListBuilder_ == null) {
        return stageInfoList_.get(index);  } else {
        return stageInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder> 
         getStageInfoListOrBuilderList() {
      if (stageInfoListBuilder_ != null) {
        return stageInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stageInfoList_);
      }
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder addStageInfoListBuilder() {
      return getStageInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.LKNMMGECLJM.getDefaultInstance());
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder addStageInfoListBuilder(
        int index) {
      return getStageInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.LKNMMGECLJM.getDefaultInstance());
    }
    /**
     * <code>repeated .LKNMMGECLJM stage_info_list = 4;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder> 
         getStageInfoListBuilderList() {
      return getStageInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.LKNMMGECLJM, io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder, io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder> 
        getStageInfoListFieldBuilder() {
      if (stageInfoListBuilder_ == null) {
        stageInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.LKNMMGECLJM, io.grasscutter.net.proto.activity.LKNMMGECLJM.Builder, io.grasscutter.net.proto.activity.LKNMMGECLJMOrBuilder>(
                stageInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        stageInfoList_ = null;
      }
      return stageInfoListBuilder_;
    }

    private int gLGGFPOKIBE_ ;
    /**
     * <code>uint32 GLGGFPOKIBE = 9;</code>
     * @return The gLGGFPOKIBE.
     */
    @java.lang.Override
    public int getGLGGFPOKIBE() {
      return gLGGFPOKIBE_;
    }
    /**
     * <code>uint32 GLGGFPOKIBE = 9;</code>
     * @param value The gLGGFPOKIBE to set.
     * @return This builder for chaining.
     */
    public Builder setGLGGFPOKIBE(int value) {
      
      gLGGFPOKIBE_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 GLGGFPOKIBE = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearGLGGFPOKIBE() {
      
      gLGGFPOKIBE_ = 0;
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


    // @@protoc_insertion_point(builder_scope:BBKPGDLLJHP)
  }

  // @@protoc_insertion_point(class_scope:BBKPGDLLJHP)
  private static final io.grasscutter.net.proto.activity.BBKPGDLLJHP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.BBKPGDLLJHP();
  }

  public static io.grasscutter.net.proto.activity.BBKPGDLLJHP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BBKPGDLLJHP>
      PARSER = new com.google.protobuf.AbstractParser<BBKPGDLLJHP>() {
    @java.lang.Override
    public BBKPGDLLJHP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BBKPGDLLJHP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BBKPGDLLJHP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BBKPGDLLJHP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.BBKPGDLLJHP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
