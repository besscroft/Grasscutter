// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code EKGHDLKKKPO}
 */
public final class EKGHDLKKKPO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EKGHDLKKKPO)
    EKGHDLKKKPOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EKGHDLKKKPO.newBuilder() to construct.
  private EKGHDLKKKPO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EKGHDLKKKPO() {
    oHPGBHCIHFL_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EKGHDLKKKPO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EKGHDLKKKPO(
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
              oHPGBHCIHFL_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.GGFEKDPKFOH>();
              mutable_bitField0_ |= 0x00000001;
            }
            oHPGBHCIHFL_.add(
                input.readMessage(io.grasscutter.net.proto.activity.GGFEKDPKFOH.parser(), extensionRegistry));
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
        oHPGBHCIHFL_ = java.util.Collections.unmodifiableList(oHPGBHCIHFL_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_EKGHDLKKKPO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_EKGHDLKKKPO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.EKGHDLKKKPO.class, io.grasscutter.net.proto.activity.EKGHDLKKKPO.Builder.class);
  }

  public static final int OHPGBHCIHFL_FIELD_NUMBER = 1;
  private java.util.List<io.grasscutter.net.proto.activity.GGFEKDPKFOH> oHPGBHCIHFL_;
  /**
   * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.GGFEKDPKFOH> getOHPGBHCIHFLList() {
    return oHPGBHCIHFL_;
  }
  /**
   * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder> 
      getOHPGBHCIHFLOrBuilderList() {
    return oHPGBHCIHFL_;
  }
  /**
   * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
   */
  @java.lang.Override
  public int getOHPGBHCIHFLCount() {
    return oHPGBHCIHFL_.size();
  }
  /**
   * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GGFEKDPKFOH getOHPGBHCIHFL(int index) {
    return oHPGBHCIHFL_.get(index);
  }
  /**
   * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder getOHPGBHCIHFLOrBuilder(
      int index) {
    return oHPGBHCIHFL_.get(index);
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
    for (int i = 0; i < oHPGBHCIHFL_.size(); i++) {
      output.writeMessage(1, oHPGBHCIHFL_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < oHPGBHCIHFL_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, oHPGBHCIHFL_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.EKGHDLKKKPO)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.EKGHDLKKKPO other = (io.grasscutter.net.proto.activity.EKGHDLKKKPO) obj;

    if (!getOHPGBHCIHFLList()
        .equals(other.getOHPGBHCIHFLList())) return false;
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
    if (getOHPGBHCIHFLCount() > 0) {
      hash = (37 * hash) + OHPGBHCIHFL_FIELD_NUMBER;
      hash = (53 * hash) + getOHPGBHCIHFLList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.EKGHDLKKKPO prototype) {
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
   * Protobuf type {@code EKGHDLKKKPO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EKGHDLKKKPO)
      io.grasscutter.net.proto.activity.EKGHDLKKKPOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EKGHDLKKKPO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EKGHDLKKKPO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.EKGHDLKKKPO.class, io.grasscutter.net.proto.activity.EKGHDLKKKPO.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.EKGHDLKKKPO.newBuilder()
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
        getOHPGBHCIHFLFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (oHPGBHCIHFLBuilder_ == null) {
        oHPGBHCIHFL_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        oHPGBHCIHFLBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_EKGHDLKKKPO_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EKGHDLKKKPO getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.EKGHDLKKKPO.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EKGHDLKKKPO build() {
      io.grasscutter.net.proto.activity.EKGHDLKKKPO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.EKGHDLKKKPO buildPartial() {
      io.grasscutter.net.proto.activity.EKGHDLKKKPO result = new io.grasscutter.net.proto.activity.EKGHDLKKKPO(this);
      int from_bitField0_ = bitField0_;
      if (oHPGBHCIHFLBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          oHPGBHCIHFL_ = java.util.Collections.unmodifiableList(oHPGBHCIHFL_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oHPGBHCIHFL_ = oHPGBHCIHFL_;
      } else {
        result.oHPGBHCIHFL_ = oHPGBHCIHFLBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.EKGHDLKKKPO) {
        return mergeFrom((io.grasscutter.net.proto.activity.EKGHDLKKKPO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.EKGHDLKKKPO other) {
      if (other == io.grasscutter.net.proto.activity.EKGHDLKKKPO.getDefaultInstance()) return this;
      if (oHPGBHCIHFLBuilder_ == null) {
        if (!other.oHPGBHCIHFL_.isEmpty()) {
          if (oHPGBHCIHFL_.isEmpty()) {
            oHPGBHCIHFL_ = other.oHPGBHCIHFL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOHPGBHCIHFLIsMutable();
            oHPGBHCIHFL_.addAll(other.oHPGBHCIHFL_);
          }
          onChanged();
        }
      } else {
        if (!other.oHPGBHCIHFL_.isEmpty()) {
          if (oHPGBHCIHFLBuilder_.isEmpty()) {
            oHPGBHCIHFLBuilder_.dispose();
            oHPGBHCIHFLBuilder_ = null;
            oHPGBHCIHFL_ = other.oHPGBHCIHFL_;
            bitField0_ = (bitField0_ & ~0x00000001);
            oHPGBHCIHFLBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOHPGBHCIHFLFieldBuilder() : null;
          } else {
            oHPGBHCIHFLBuilder_.addAllMessages(other.oHPGBHCIHFL_);
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
      io.grasscutter.net.proto.activity.EKGHDLKKKPO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.EKGHDLKKKPO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.GGFEKDPKFOH> oHPGBHCIHFL_ =
      java.util.Collections.emptyList();
    private void ensureOHPGBHCIHFLIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        oHPGBHCIHFL_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.GGFEKDPKFOH>(oHPGBHCIHFL_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.GGFEKDPKFOH, io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder, io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder> oHPGBHCIHFLBuilder_;

    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.GGFEKDPKFOH> getOHPGBHCIHFLList() {
      if (oHPGBHCIHFLBuilder_ == null) {
        return java.util.Collections.unmodifiableList(oHPGBHCIHFL_);
      } else {
        return oHPGBHCIHFLBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public int getOHPGBHCIHFLCount() {
      if (oHPGBHCIHFLBuilder_ == null) {
        return oHPGBHCIHFL_.size();
      } else {
        return oHPGBHCIHFLBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GGFEKDPKFOH getOHPGBHCIHFL(int index) {
      if (oHPGBHCIHFLBuilder_ == null) {
        return oHPGBHCIHFL_.get(index);
      } else {
        return oHPGBHCIHFLBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder setOHPGBHCIHFL(
        int index, io.grasscutter.net.proto.activity.GGFEKDPKFOH value) {
      if (oHPGBHCIHFLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.set(index, value);
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder setOHPGBHCIHFL(
        int index, io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder builderForValue) {
      if (oHPGBHCIHFLBuilder_ == null) {
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.set(index, builderForValue.build());
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder addOHPGBHCIHFL(io.grasscutter.net.proto.activity.GGFEKDPKFOH value) {
      if (oHPGBHCIHFLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.add(value);
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder addOHPGBHCIHFL(
        int index, io.grasscutter.net.proto.activity.GGFEKDPKFOH value) {
      if (oHPGBHCIHFLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.add(index, value);
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder addOHPGBHCIHFL(
        io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder builderForValue) {
      if (oHPGBHCIHFLBuilder_ == null) {
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.add(builderForValue.build());
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder addOHPGBHCIHFL(
        int index, io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder builderForValue) {
      if (oHPGBHCIHFLBuilder_ == null) {
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.add(index, builderForValue.build());
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder addAllOHPGBHCIHFL(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.GGFEKDPKFOH> values) {
      if (oHPGBHCIHFLBuilder_ == null) {
        ensureOHPGBHCIHFLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oHPGBHCIHFL_);
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder clearOHPGBHCIHFL() {
      if (oHPGBHCIHFLBuilder_ == null) {
        oHPGBHCIHFL_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public Builder removeOHPGBHCIHFL(int index) {
      if (oHPGBHCIHFLBuilder_ == null) {
        ensureOHPGBHCIHFLIsMutable();
        oHPGBHCIHFL_.remove(index);
        onChanged();
      } else {
        oHPGBHCIHFLBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder getOHPGBHCIHFLBuilder(
        int index) {
      return getOHPGBHCIHFLFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder getOHPGBHCIHFLOrBuilder(
        int index) {
      if (oHPGBHCIHFLBuilder_ == null) {
        return oHPGBHCIHFL_.get(index);  } else {
        return oHPGBHCIHFLBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder> 
         getOHPGBHCIHFLOrBuilderList() {
      if (oHPGBHCIHFLBuilder_ != null) {
        return oHPGBHCIHFLBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(oHPGBHCIHFL_);
      }
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder addOHPGBHCIHFLBuilder() {
      return getOHPGBHCIHFLFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.GGFEKDPKFOH.getDefaultInstance());
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder addOHPGBHCIHFLBuilder(
        int index) {
      return getOHPGBHCIHFLFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.GGFEKDPKFOH.getDefaultInstance());
    }
    /**
     * <code>repeated .GGFEKDPKFOH OHPGBHCIHFL = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder> 
         getOHPGBHCIHFLBuilderList() {
      return getOHPGBHCIHFLFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.GGFEKDPKFOH, io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder, io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder> 
        getOHPGBHCIHFLFieldBuilder() {
      if (oHPGBHCIHFLBuilder_ == null) {
        oHPGBHCIHFLBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.GGFEKDPKFOH, io.grasscutter.net.proto.activity.GGFEKDPKFOH.Builder, io.grasscutter.net.proto.activity.GGFEKDPKFOHOrBuilder>(
                oHPGBHCIHFL_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        oHPGBHCIHFL_ = null;
      }
      return oHPGBHCIHFLBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EKGHDLKKKPO)
  }

  // @@protoc_insertion_point(class_scope:EKGHDLKKKPO)
  private static final io.grasscutter.net.proto.activity.EKGHDLKKKPO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.EKGHDLKKKPO();
  }

  public static io.grasscutter.net.proto.activity.EKGHDLKKKPO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EKGHDLKKKPO>
      PARSER = new com.google.protobuf.AbstractParser<EKGHDLKKKPO>() {
    @java.lang.Override
    public EKGHDLKKKPO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EKGHDLKKKPO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EKGHDLKKKPO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EKGHDLKKKPO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.EKGHDLKKKPO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
