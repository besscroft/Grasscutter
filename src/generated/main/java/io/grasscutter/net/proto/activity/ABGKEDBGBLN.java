// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code ABGKEDBGBLN}
 */
public final class ABGKEDBGBLN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ABGKEDBGBLN)
    ABGKEDBGBLNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ABGKEDBGBLN.newBuilder() to construct.
  private ABGKEDBGBLN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ABGKEDBGBLN() {
    jLNAKOLCDGN_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ABGKEDBGBLN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ABGKEDBGBLN(
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

            lBEINAHAHKA_ = input.readUInt32();
            break;
          }
          case 24: {

            isOpen_ = input.readBool();
            break;
          }
          case 90: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              jLNAKOLCDGN_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.GFNEAFEFCCL>();
              mutable_bitField0_ |= 0x00000001;
            }
            jLNAKOLCDGN_.add(
                input.readMessage(io.grasscutter.net.proto.activity.GFNEAFEFCCL.parser(), extensionRegistry));
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
        jLNAKOLCDGN_ = java.util.Collections.unmodifiableList(jLNAKOLCDGN_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ABGKEDBGBLN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ABGKEDBGBLN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.ABGKEDBGBLN.class, io.grasscutter.net.proto.activity.ABGKEDBGBLN.Builder.class);
  }

  public static final int JLNAKOLCDGN_FIELD_NUMBER = 11;
  private java.util.List<io.grasscutter.net.proto.activity.GFNEAFEFCCL> jLNAKOLCDGN_;
  /**
   * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.GFNEAFEFCCL> getJLNAKOLCDGNList() {
    return jLNAKOLCDGN_;
  }
  /**
   * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder> 
      getJLNAKOLCDGNOrBuilderList() {
    return jLNAKOLCDGN_;
  }
  /**
   * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
   */
  @java.lang.Override
  public int getJLNAKOLCDGNCount() {
    return jLNAKOLCDGN_.size();
  }
  /**
   * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GFNEAFEFCCL getJLNAKOLCDGN(int index) {
    return jLNAKOLCDGN_.get(index);
  }
  /**
   * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder getJLNAKOLCDGNOrBuilder(
      int index) {
    return jLNAKOLCDGN_.get(index);
  }

  public static final int IS_OPEN_FIELD_NUMBER = 3;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 3;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int LBEINAHAHKA_FIELD_NUMBER = 1;
  private int lBEINAHAHKA_;
  /**
   * <code>uint32 LBEINAHAHKA = 1;</code>
   * @return The lBEINAHAHKA.
   */
  @java.lang.Override
  public int getLBEINAHAHKA() {
    return lBEINAHAHKA_;
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
    if (lBEINAHAHKA_ != 0) {
      output.writeUInt32(1, lBEINAHAHKA_);
    }
    if (isOpen_ != false) {
      output.writeBool(3, isOpen_);
    }
    for (int i = 0; i < jLNAKOLCDGN_.size(); i++) {
      output.writeMessage(11, jLNAKOLCDGN_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (lBEINAHAHKA_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, lBEINAHAHKA_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isOpen_);
    }
    for (int i = 0; i < jLNAKOLCDGN_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, jLNAKOLCDGN_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.ABGKEDBGBLN)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.ABGKEDBGBLN other = (io.grasscutter.net.proto.activity.ABGKEDBGBLN) obj;

    if (!getJLNAKOLCDGNList()
        .equals(other.getJLNAKOLCDGNList())) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getLBEINAHAHKA()
        != other.getLBEINAHAHKA()) return false;
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
    if (getJLNAKOLCDGNCount() > 0) {
      hash = (37 * hash) + JLNAKOLCDGN_FIELD_NUMBER;
      hash = (53 * hash) + getJLNAKOLCDGNList().hashCode();
    }
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + LBEINAHAHKA_FIELD_NUMBER;
    hash = (53 * hash) + getLBEINAHAHKA();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.ABGKEDBGBLN prototype) {
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
   * Protobuf type {@code ABGKEDBGBLN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ABGKEDBGBLN)
      io.grasscutter.net.proto.activity.ABGKEDBGBLNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ABGKEDBGBLN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ABGKEDBGBLN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.ABGKEDBGBLN.class, io.grasscutter.net.proto.activity.ABGKEDBGBLN.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.ABGKEDBGBLN.newBuilder()
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
        getJLNAKOLCDGNFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (jLNAKOLCDGNBuilder_ == null) {
        jLNAKOLCDGN_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        jLNAKOLCDGNBuilder_.clear();
      }
      isOpen_ = false;

      lBEINAHAHKA_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ABGKEDBGBLN_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ABGKEDBGBLN getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.ABGKEDBGBLN.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ABGKEDBGBLN build() {
      io.grasscutter.net.proto.activity.ABGKEDBGBLN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ABGKEDBGBLN buildPartial() {
      io.grasscutter.net.proto.activity.ABGKEDBGBLN result = new io.grasscutter.net.proto.activity.ABGKEDBGBLN(this);
      int from_bitField0_ = bitField0_;
      if (jLNAKOLCDGNBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          jLNAKOLCDGN_ = java.util.Collections.unmodifiableList(jLNAKOLCDGN_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.jLNAKOLCDGN_ = jLNAKOLCDGN_;
      } else {
        result.jLNAKOLCDGN_ = jLNAKOLCDGNBuilder_.build();
      }
      result.isOpen_ = isOpen_;
      result.lBEINAHAHKA_ = lBEINAHAHKA_;
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
      if (other instanceof io.grasscutter.net.proto.activity.ABGKEDBGBLN) {
        return mergeFrom((io.grasscutter.net.proto.activity.ABGKEDBGBLN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.ABGKEDBGBLN other) {
      if (other == io.grasscutter.net.proto.activity.ABGKEDBGBLN.getDefaultInstance()) return this;
      if (jLNAKOLCDGNBuilder_ == null) {
        if (!other.jLNAKOLCDGN_.isEmpty()) {
          if (jLNAKOLCDGN_.isEmpty()) {
            jLNAKOLCDGN_ = other.jLNAKOLCDGN_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureJLNAKOLCDGNIsMutable();
            jLNAKOLCDGN_.addAll(other.jLNAKOLCDGN_);
          }
          onChanged();
        }
      } else {
        if (!other.jLNAKOLCDGN_.isEmpty()) {
          if (jLNAKOLCDGNBuilder_.isEmpty()) {
            jLNAKOLCDGNBuilder_.dispose();
            jLNAKOLCDGNBuilder_ = null;
            jLNAKOLCDGN_ = other.jLNAKOLCDGN_;
            bitField0_ = (bitField0_ & ~0x00000001);
            jLNAKOLCDGNBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getJLNAKOLCDGNFieldBuilder() : null;
          } else {
            jLNAKOLCDGNBuilder_.addAllMessages(other.jLNAKOLCDGN_);
          }
        }
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getLBEINAHAHKA() != 0) {
        setLBEINAHAHKA(other.getLBEINAHAHKA());
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
      io.grasscutter.net.proto.activity.ABGKEDBGBLN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.ABGKEDBGBLN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.GFNEAFEFCCL> jLNAKOLCDGN_ =
      java.util.Collections.emptyList();
    private void ensureJLNAKOLCDGNIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        jLNAKOLCDGN_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.GFNEAFEFCCL>(jLNAKOLCDGN_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.GFNEAFEFCCL, io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder, io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder> jLNAKOLCDGNBuilder_;

    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.GFNEAFEFCCL> getJLNAKOLCDGNList() {
      if (jLNAKOLCDGNBuilder_ == null) {
        return java.util.Collections.unmodifiableList(jLNAKOLCDGN_);
      } else {
        return jLNAKOLCDGNBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public int getJLNAKOLCDGNCount() {
      if (jLNAKOLCDGNBuilder_ == null) {
        return jLNAKOLCDGN_.size();
      } else {
        return jLNAKOLCDGNBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public io.grasscutter.net.proto.activity.GFNEAFEFCCL getJLNAKOLCDGN(int index) {
      if (jLNAKOLCDGNBuilder_ == null) {
        return jLNAKOLCDGN_.get(index);
      } else {
        return jLNAKOLCDGNBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder setJLNAKOLCDGN(
        int index, io.grasscutter.net.proto.activity.GFNEAFEFCCL value) {
      if (jLNAKOLCDGNBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.set(index, value);
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder setJLNAKOLCDGN(
        int index, io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder builderForValue) {
      if (jLNAKOLCDGNBuilder_ == null) {
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.set(index, builderForValue.build());
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder addJLNAKOLCDGN(io.grasscutter.net.proto.activity.GFNEAFEFCCL value) {
      if (jLNAKOLCDGNBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.add(value);
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder addJLNAKOLCDGN(
        int index, io.grasscutter.net.proto.activity.GFNEAFEFCCL value) {
      if (jLNAKOLCDGNBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.add(index, value);
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder addJLNAKOLCDGN(
        io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder builderForValue) {
      if (jLNAKOLCDGNBuilder_ == null) {
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.add(builderForValue.build());
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder addJLNAKOLCDGN(
        int index, io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder builderForValue) {
      if (jLNAKOLCDGNBuilder_ == null) {
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.add(index, builderForValue.build());
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder addAllJLNAKOLCDGN(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.GFNEAFEFCCL> values) {
      if (jLNAKOLCDGNBuilder_ == null) {
        ensureJLNAKOLCDGNIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, jLNAKOLCDGN_);
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder clearJLNAKOLCDGN() {
      if (jLNAKOLCDGNBuilder_ == null) {
        jLNAKOLCDGN_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public Builder removeJLNAKOLCDGN(int index) {
      if (jLNAKOLCDGNBuilder_ == null) {
        ensureJLNAKOLCDGNIsMutable();
        jLNAKOLCDGN_.remove(index);
        onChanged();
      } else {
        jLNAKOLCDGNBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder getJLNAKOLCDGNBuilder(
        int index) {
      return getJLNAKOLCDGNFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder getJLNAKOLCDGNOrBuilder(
        int index) {
      if (jLNAKOLCDGNBuilder_ == null) {
        return jLNAKOLCDGN_.get(index);  } else {
        return jLNAKOLCDGNBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder> 
         getJLNAKOLCDGNOrBuilderList() {
      if (jLNAKOLCDGNBuilder_ != null) {
        return jLNAKOLCDGNBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(jLNAKOLCDGN_);
      }
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder addJLNAKOLCDGNBuilder() {
      return getJLNAKOLCDGNFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.GFNEAFEFCCL.getDefaultInstance());
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder addJLNAKOLCDGNBuilder(
        int index) {
      return getJLNAKOLCDGNFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.GFNEAFEFCCL.getDefaultInstance());
    }
    /**
     * <code>repeated .GFNEAFEFCCL JLNAKOLCDGN = 11;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder> 
         getJLNAKOLCDGNBuilderList() {
      return getJLNAKOLCDGNFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.GFNEAFEFCCL, io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder, io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder> 
        getJLNAKOLCDGNFieldBuilder() {
      if (jLNAKOLCDGNBuilder_ == null) {
        jLNAKOLCDGNBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.GFNEAFEFCCL, io.grasscutter.net.proto.activity.GFNEAFEFCCL.Builder, io.grasscutter.net.proto.activity.GFNEAFEFCCLOrBuilder>(
                jLNAKOLCDGN_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        jLNAKOLCDGN_ = null;
      }
      return jLNAKOLCDGNBuilder_;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 3;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 3;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int lBEINAHAHKA_ ;
    /**
     * <code>uint32 LBEINAHAHKA = 1;</code>
     * @return The lBEINAHAHKA.
     */
    @java.lang.Override
    public int getLBEINAHAHKA() {
      return lBEINAHAHKA_;
    }
    /**
     * <code>uint32 LBEINAHAHKA = 1;</code>
     * @param value The lBEINAHAHKA to set.
     * @return This builder for chaining.
     */
    public Builder setLBEINAHAHKA(int value) {
      
      lBEINAHAHKA_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 LBEINAHAHKA = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearLBEINAHAHKA() {
      
      lBEINAHAHKA_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ABGKEDBGBLN)
  }

  // @@protoc_insertion_point(class_scope:ABGKEDBGBLN)
  private static final io.grasscutter.net.proto.activity.ABGKEDBGBLN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.ABGKEDBGBLN();
  }

  public static io.grasscutter.net.proto.activity.ABGKEDBGBLN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ABGKEDBGBLN>
      PARSER = new com.google.protobuf.AbstractParser<ABGKEDBGBLN>() {
    @java.lang.Override
    public ABGKEDBGBLN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ABGKEDBGBLN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ABGKEDBGBLN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ABGKEDBGBLN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.ABGKEDBGBLN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
