// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code NKHBDLCJPGM}
 */
public final class NKHBDLCJPGM extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NKHBDLCJPGM)
    NKHBDLCJPGMOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NKHBDLCJPGM.newBuilder() to construct.
  private NKHBDLCJPGM(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NKHBDLCJPGM() {
    avatarInfoList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NKHBDLCJPGM();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NKHBDLCJPGM(
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

            iENCBCEGPBC_ = input.readUInt32();
            break;
          }
          case 16: {

            isOpen_ = input.readBool();
            break;
          }
          case 48: {

            oFNMJNCBNHK_ = input.readUInt32();
            break;
          }
          case 58: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              avatarInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.EALKFDEADIC>();
              mutable_bitField0_ |= 0x00000001;
            }
            avatarInfoList_.add(
                input.readMessage(io.grasscutter.net.proto.activity.EALKFDEADIC.parser(), extensionRegistry));
            break;
          }
          case 72: {

            stageId_ = input.readUInt32();
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
        avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_NKHBDLCJPGM_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_NKHBDLCJPGM_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.NKHBDLCJPGM.class, io.grasscutter.net.proto.activity.NKHBDLCJPGM.Builder.class);
  }

  public static final int AVATAR_INFO_LIST_FIELD_NUMBER = 7;
  private java.util.List<io.grasscutter.net.proto.activity.EALKFDEADIC> avatarInfoList_;
  /**
   * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.EALKFDEADIC> getAvatarInfoListList() {
    return avatarInfoList_;
  }
  /**
   * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder> 
      getAvatarInfoListOrBuilderList() {
    return avatarInfoList_;
  }
  /**
   * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
   */
  @java.lang.Override
  public int getAvatarInfoListCount() {
    return avatarInfoList_.size();
  }
  /**
   * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.EALKFDEADIC getAvatarInfoList(int index) {
    return avatarInfoList_.get(index);
  }
  /**
   * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder getAvatarInfoListOrBuilder(
      int index) {
    return avatarInfoList_.get(index);
  }

  public static final int OFNMJNCBNHK_FIELD_NUMBER = 6;
  private int oFNMJNCBNHK_;
  /**
   * <code>uint32 OFNMJNCBNHK = 6;</code>
   * @return The oFNMJNCBNHK.
   */
  @java.lang.Override
  public int getOFNMJNCBNHK() {
    return oFNMJNCBNHK_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 2;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 2;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int STAGE_ID_FIELD_NUMBER = 9;
  private int stageId_;
  /**
   * <code>uint32 stage_id = 9;</code>
   * @return The stageId.
   */
  @java.lang.Override
  public int getStageId() {
    return stageId_;
  }

  public static final int IENCBCEGPBC_FIELD_NUMBER = 1;
  private int iENCBCEGPBC_;
  /**
   * <code>uint32 IENCBCEGPBC = 1;</code>
   * @return The iENCBCEGPBC.
   */
  @java.lang.Override
  public int getIENCBCEGPBC() {
    return iENCBCEGPBC_;
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
    if (iENCBCEGPBC_ != 0) {
      output.writeUInt32(1, iENCBCEGPBC_);
    }
    if (isOpen_ != false) {
      output.writeBool(2, isOpen_);
    }
    if (oFNMJNCBNHK_ != 0) {
      output.writeUInt32(6, oFNMJNCBNHK_);
    }
    for (int i = 0; i < avatarInfoList_.size(); i++) {
      output.writeMessage(7, avatarInfoList_.get(i));
    }
    if (stageId_ != 0) {
      output.writeUInt32(9, stageId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (iENCBCEGPBC_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, iENCBCEGPBC_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isOpen_);
    }
    if (oFNMJNCBNHK_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, oFNMJNCBNHK_);
    }
    for (int i = 0; i < avatarInfoList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, avatarInfoList_.get(i));
    }
    if (stageId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, stageId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.NKHBDLCJPGM)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.NKHBDLCJPGM other = (io.grasscutter.net.proto.activity.NKHBDLCJPGM) obj;

    if (!getAvatarInfoListList()
        .equals(other.getAvatarInfoListList())) return false;
    if (getOFNMJNCBNHK()
        != other.getOFNMJNCBNHK()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getStageId()
        != other.getStageId()) return false;
    if (getIENCBCEGPBC()
        != other.getIENCBCEGPBC()) return false;
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
    if (getAvatarInfoListCount() > 0) {
      hash = (37 * hash) + AVATAR_INFO_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarInfoListList().hashCode();
    }
    hash = (37 * hash) + OFNMJNCBNHK_FIELD_NUMBER;
    hash = (53 * hash) + getOFNMJNCBNHK();
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId();
    hash = (37 * hash) + IENCBCEGPBC_FIELD_NUMBER;
    hash = (53 * hash) + getIENCBCEGPBC();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.NKHBDLCJPGM prototype) {
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
   * Protobuf type {@code NKHBDLCJPGM}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NKHBDLCJPGM)
      io.grasscutter.net.proto.activity.NKHBDLCJPGMOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_NKHBDLCJPGM_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_NKHBDLCJPGM_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.NKHBDLCJPGM.class, io.grasscutter.net.proto.activity.NKHBDLCJPGM.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.NKHBDLCJPGM.newBuilder()
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
        getAvatarInfoListFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (avatarInfoListBuilder_ == null) {
        avatarInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        avatarInfoListBuilder_.clear();
      }
      oFNMJNCBNHK_ = 0;

      isOpen_ = false;

      stageId_ = 0;

      iENCBCEGPBC_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_NKHBDLCJPGM_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.NKHBDLCJPGM getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.NKHBDLCJPGM.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.NKHBDLCJPGM build() {
      io.grasscutter.net.proto.activity.NKHBDLCJPGM result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.NKHBDLCJPGM buildPartial() {
      io.grasscutter.net.proto.activity.NKHBDLCJPGM result = new io.grasscutter.net.proto.activity.NKHBDLCJPGM(this);
      int from_bitField0_ = bitField0_;
      if (avatarInfoListBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          avatarInfoList_ = java.util.Collections.unmodifiableList(avatarInfoList_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.avatarInfoList_ = avatarInfoList_;
      } else {
        result.avatarInfoList_ = avatarInfoListBuilder_.build();
      }
      result.oFNMJNCBNHK_ = oFNMJNCBNHK_;
      result.isOpen_ = isOpen_;
      result.stageId_ = stageId_;
      result.iENCBCEGPBC_ = iENCBCEGPBC_;
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
      if (other instanceof io.grasscutter.net.proto.activity.NKHBDLCJPGM) {
        return mergeFrom((io.grasscutter.net.proto.activity.NKHBDLCJPGM)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.NKHBDLCJPGM other) {
      if (other == io.grasscutter.net.proto.activity.NKHBDLCJPGM.getDefaultInstance()) return this;
      if (avatarInfoListBuilder_ == null) {
        if (!other.avatarInfoList_.isEmpty()) {
          if (avatarInfoList_.isEmpty()) {
            avatarInfoList_ = other.avatarInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvatarInfoListIsMutable();
            avatarInfoList_.addAll(other.avatarInfoList_);
          }
          onChanged();
        }
      } else {
        if (!other.avatarInfoList_.isEmpty()) {
          if (avatarInfoListBuilder_.isEmpty()) {
            avatarInfoListBuilder_.dispose();
            avatarInfoListBuilder_ = null;
            avatarInfoList_ = other.avatarInfoList_;
            bitField0_ = (bitField0_ & ~0x00000001);
            avatarInfoListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAvatarInfoListFieldBuilder() : null;
          } else {
            avatarInfoListBuilder_.addAllMessages(other.avatarInfoList_);
          }
        }
      }
      if (other.getOFNMJNCBNHK() != 0) {
        setOFNMJNCBNHK(other.getOFNMJNCBNHK());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getStageId() != 0) {
        setStageId(other.getStageId());
      }
      if (other.getIENCBCEGPBC() != 0) {
        setIENCBCEGPBC(other.getIENCBCEGPBC());
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
      io.grasscutter.net.proto.activity.NKHBDLCJPGM parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.NKHBDLCJPGM) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.EALKFDEADIC> avatarInfoList_ =
      java.util.Collections.emptyList();
    private void ensureAvatarInfoListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        avatarInfoList_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.EALKFDEADIC>(avatarInfoList_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.EALKFDEADIC, io.grasscutter.net.proto.activity.EALKFDEADIC.Builder, io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder> avatarInfoListBuilder_;

    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.EALKFDEADIC> getAvatarInfoListList() {
      if (avatarInfoListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(avatarInfoList_);
      } else {
        return avatarInfoListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public int getAvatarInfoListCount() {
      if (avatarInfoListBuilder_ == null) {
        return avatarInfoList_.size();
      } else {
        return avatarInfoListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public io.grasscutter.net.proto.activity.EALKFDEADIC getAvatarInfoList(int index) {
      if (avatarInfoListBuilder_ == null) {
        return avatarInfoList_.get(index);
      } else {
        return avatarInfoListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder setAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.EALKFDEADIC value) {
      if (avatarInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.set(index, value);
        onChanged();
      } else {
        avatarInfoListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder setAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.EALKFDEADIC.Builder builderForValue) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.set(index, builderForValue.build());
        onChanged();
      } else {
        avatarInfoListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder addAvatarInfoList(io.grasscutter.net.proto.activity.EALKFDEADIC value) {
      if (avatarInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(value);
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder addAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.EALKFDEADIC value) {
      if (avatarInfoListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(index, value);
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder addAvatarInfoList(
        io.grasscutter.net.proto.activity.EALKFDEADIC.Builder builderForValue) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(builderForValue.build());
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder addAvatarInfoList(
        int index, io.grasscutter.net.proto.activity.EALKFDEADIC.Builder builderForValue) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.add(index, builderForValue.build());
        onChanged();
      } else {
        avatarInfoListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder addAllAvatarInfoList(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.EALKFDEADIC> values) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, avatarInfoList_);
        onChanged();
      } else {
        avatarInfoListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder clearAvatarInfoList() {
      if (avatarInfoListBuilder_ == null) {
        avatarInfoList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        avatarInfoListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public Builder removeAvatarInfoList(int index) {
      if (avatarInfoListBuilder_ == null) {
        ensureAvatarInfoListIsMutable();
        avatarInfoList_.remove(index);
        onChanged();
      } else {
        avatarInfoListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public io.grasscutter.net.proto.activity.EALKFDEADIC.Builder getAvatarInfoListBuilder(
        int index) {
      return getAvatarInfoListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder getAvatarInfoListOrBuilder(
        int index) {
      if (avatarInfoListBuilder_ == null) {
        return avatarInfoList_.get(index);  } else {
        return avatarInfoListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder> 
         getAvatarInfoListOrBuilderList() {
      if (avatarInfoListBuilder_ != null) {
        return avatarInfoListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(avatarInfoList_);
      }
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public io.grasscutter.net.proto.activity.EALKFDEADIC.Builder addAvatarInfoListBuilder() {
      return getAvatarInfoListFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.EALKFDEADIC.getDefaultInstance());
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public io.grasscutter.net.proto.activity.EALKFDEADIC.Builder addAvatarInfoListBuilder(
        int index) {
      return getAvatarInfoListFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.EALKFDEADIC.getDefaultInstance());
    }
    /**
     * <code>repeated .EALKFDEADIC avatar_info_list = 7;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.EALKFDEADIC.Builder> 
         getAvatarInfoListBuilderList() {
      return getAvatarInfoListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.EALKFDEADIC, io.grasscutter.net.proto.activity.EALKFDEADIC.Builder, io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder> 
        getAvatarInfoListFieldBuilder() {
      if (avatarInfoListBuilder_ == null) {
        avatarInfoListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.EALKFDEADIC, io.grasscutter.net.proto.activity.EALKFDEADIC.Builder, io.grasscutter.net.proto.activity.EALKFDEADICOrBuilder>(
                avatarInfoList_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        avatarInfoList_ = null;
      }
      return avatarInfoListBuilder_;
    }

    private int oFNMJNCBNHK_ ;
    /**
     * <code>uint32 OFNMJNCBNHK = 6;</code>
     * @return The oFNMJNCBNHK.
     */
    @java.lang.Override
    public int getOFNMJNCBNHK() {
      return oFNMJNCBNHK_;
    }
    /**
     * <code>uint32 OFNMJNCBNHK = 6;</code>
     * @param value The oFNMJNCBNHK to set.
     * @return This builder for chaining.
     */
    public Builder setOFNMJNCBNHK(int value) {
      
      oFNMJNCBNHK_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 OFNMJNCBNHK = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearOFNMJNCBNHK() {
      
      oFNMJNCBNHK_ = 0;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 2;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int stageId_ ;
    /**
     * <code>uint32 stage_id = 9;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }
    /**
     * <code>uint32 stage_id = 9;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(int value) {
      
      stageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 stage_id = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      
      stageId_ = 0;
      onChanged();
      return this;
    }

    private int iENCBCEGPBC_ ;
    /**
     * <code>uint32 IENCBCEGPBC = 1;</code>
     * @return The iENCBCEGPBC.
     */
    @java.lang.Override
    public int getIENCBCEGPBC() {
      return iENCBCEGPBC_;
    }
    /**
     * <code>uint32 IENCBCEGPBC = 1;</code>
     * @param value The iENCBCEGPBC to set.
     * @return This builder for chaining.
     */
    public Builder setIENCBCEGPBC(int value) {
      
      iENCBCEGPBC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 IENCBCEGPBC = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIENCBCEGPBC() {
      
      iENCBCEGPBC_ = 0;
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


    // @@protoc_insertion_point(builder_scope:NKHBDLCJPGM)
  }

  // @@protoc_insertion_point(class_scope:NKHBDLCJPGM)
  private static final io.grasscutter.net.proto.activity.NKHBDLCJPGM DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.NKHBDLCJPGM();
  }

  public static io.grasscutter.net.proto.activity.NKHBDLCJPGM getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NKHBDLCJPGM>
      PARSER = new com.google.protobuf.AbstractParser<NKHBDLCJPGM>() {
    @java.lang.Override
    public NKHBDLCJPGM parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NKHBDLCJPGM(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NKHBDLCJPGM> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NKHBDLCJPGM> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.NKHBDLCJPGM getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
