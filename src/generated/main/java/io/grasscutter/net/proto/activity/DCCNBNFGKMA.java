// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code DCCNBNFGKMA}
 */
public final class DCCNBNFGKMA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DCCNBNFGKMA)
    DCCNBNFGKMAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DCCNBNFGKMA.newBuilder() to construct.
  private DCCNBNFGKMA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DCCNBNFGKMA() {
    bAGJBBKNADL_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DCCNBNFGKMA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DCCNBNFGKMA(
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
              bAGJBBKNADL_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.IGODKMGOCFI>();
              mutable_bitField0_ |= 0x00000001;
            }
            bAGJBBKNADL_.add(
                input.readMessage(io.grasscutter.net.proto.activity.IGODKMGOCFI.parser(), extensionRegistry));
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
        bAGJBBKNADL_ = java.util.Collections.unmodifiableList(bAGJBBKNADL_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DCCNBNFGKMA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_DCCNBNFGKMA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.DCCNBNFGKMA.class, io.grasscutter.net.proto.activity.DCCNBNFGKMA.Builder.class);
  }

  public static final int BAGJBBKNADL_FIELD_NUMBER = 1;
  private java.util.List<io.grasscutter.net.proto.activity.IGODKMGOCFI> bAGJBBKNADL_;
  /**
   * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.IGODKMGOCFI> getBAGJBBKNADLList() {
    return bAGJBBKNADL_;
  }
  /**
   * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder> 
      getBAGJBBKNADLOrBuilderList() {
    return bAGJBBKNADL_;
  }
  /**
   * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
   */
  @java.lang.Override
  public int getBAGJBBKNADLCount() {
    return bAGJBBKNADL_.size();
  }
  /**
   * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IGODKMGOCFI getBAGJBBKNADL(int index) {
    return bAGJBBKNADL_.get(index);
  }
  /**
   * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder getBAGJBBKNADLOrBuilder(
      int index) {
    return bAGJBBKNADL_.get(index);
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
    for (int i = 0; i < bAGJBBKNADL_.size(); i++) {
      output.writeMessage(1, bAGJBBKNADL_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < bAGJBBKNADL_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, bAGJBBKNADL_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.DCCNBNFGKMA)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.DCCNBNFGKMA other = (io.grasscutter.net.proto.activity.DCCNBNFGKMA) obj;

    if (!getBAGJBBKNADLList()
        .equals(other.getBAGJBBKNADLList())) return false;
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
    if (getBAGJBBKNADLCount() > 0) {
      hash = (37 * hash) + BAGJBBKNADL_FIELD_NUMBER;
      hash = (53 * hash) + getBAGJBBKNADLList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.DCCNBNFGKMA prototype) {
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
   * Protobuf type {@code DCCNBNFGKMA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DCCNBNFGKMA)
      io.grasscutter.net.proto.activity.DCCNBNFGKMAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DCCNBNFGKMA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DCCNBNFGKMA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.DCCNBNFGKMA.class, io.grasscutter.net.proto.activity.DCCNBNFGKMA.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.DCCNBNFGKMA.newBuilder()
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
        getBAGJBBKNADLFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (bAGJBBKNADLBuilder_ == null) {
        bAGJBBKNADL_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        bAGJBBKNADLBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_DCCNBNFGKMA_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DCCNBNFGKMA getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.DCCNBNFGKMA.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DCCNBNFGKMA build() {
      io.grasscutter.net.proto.activity.DCCNBNFGKMA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.DCCNBNFGKMA buildPartial() {
      io.grasscutter.net.proto.activity.DCCNBNFGKMA result = new io.grasscutter.net.proto.activity.DCCNBNFGKMA(this);
      int from_bitField0_ = bitField0_;
      if (bAGJBBKNADLBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          bAGJBBKNADL_ = java.util.Collections.unmodifiableList(bAGJBBKNADL_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.bAGJBBKNADL_ = bAGJBBKNADL_;
      } else {
        result.bAGJBBKNADL_ = bAGJBBKNADLBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.DCCNBNFGKMA) {
        return mergeFrom((io.grasscutter.net.proto.activity.DCCNBNFGKMA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.DCCNBNFGKMA other) {
      if (other == io.grasscutter.net.proto.activity.DCCNBNFGKMA.getDefaultInstance()) return this;
      if (bAGJBBKNADLBuilder_ == null) {
        if (!other.bAGJBBKNADL_.isEmpty()) {
          if (bAGJBBKNADL_.isEmpty()) {
            bAGJBBKNADL_ = other.bAGJBBKNADL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBAGJBBKNADLIsMutable();
            bAGJBBKNADL_.addAll(other.bAGJBBKNADL_);
          }
          onChanged();
        }
      } else {
        if (!other.bAGJBBKNADL_.isEmpty()) {
          if (bAGJBBKNADLBuilder_.isEmpty()) {
            bAGJBBKNADLBuilder_.dispose();
            bAGJBBKNADLBuilder_ = null;
            bAGJBBKNADL_ = other.bAGJBBKNADL_;
            bitField0_ = (bitField0_ & ~0x00000001);
            bAGJBBKNADLBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBAGJBBKNADLFieldBuilder() : null;
          } else {
            bAGJBBKNADLBuilder_.addAllMessages(other.bAGJBBKNADL_);
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
      io.grasscutter.net.proto.activity.DCCNBNFGKMA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.DCCNBNFGKMA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.IGODKMGOCFI> bAGJBBKNADL_ =
      java.util.Collections.emptyList();
    private void ensureBAGJBBKNADLIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        bAGJBBKNADL_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.IGODKMGOCFI>(bAGJBBKNADL_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.IGODKMGOCFI, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder, io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder> bAGJBBKNADLBuilder_;

    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.IGODKMGOCFI> getBAGJBBKNADLList() {
      if (bAGJBBKNADLBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bAGJBBKNADL_);
      } else {
        return bAGJBBKNADLBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public int getBAGJBBKNADLCount() {
      if (bAGJBBKNADLBuilder_ == null) {
        return bAGJBBKNADL_.size();
      } else {
        return bAGJBBKNADLBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.IGODKMGOCFI getBAGJBBKNADL(int index) {
      if (bAGJBBKNADLBuilder_ == null) {
        return bAGJBBKNADL_.get(index);
      } else {
        return bAGJBBKNADLBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder setBAGJBBKNADL(
        int index, io.grasscutter.net.proto.activity.IGODKMGOCFI value) {
      if (bAGJBBKNADLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.set(index, value);
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder setBAGJBBKNADL(
        int index, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder builderForValue) {
      if (bAGJBBKNADLBuilder_ == null) {
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.set(index, builderForValue.build());
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder addBAGJBBKNADL(io.grasscutter.net.proto.activity.IGODKMGOCFI value) {
      if (bAGJBBKNADLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.add(value);
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder addBAGJBBKNADL(
        int index, io.grasscutter.net.proto.activity.IGODKMGOCFI value) {
      if (bAGJBBKNADLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.add(index, value);
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder addBAGJBBKNADL(
        io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder builderForValue) {
      if (bAGJBBKNADLBuilder_ == null) {
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.add(builderForValue.build());
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder addBAGJBBKNADL(
        int index, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder builderForValue) {
      if (bAGJBBKNADLBuilder_ == null) {
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.add(index, builderForValue.build());
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder addAllBAGJBBKNADL(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.IGODKMGOCFI> values) {
      if (bAGJBBKNADLBuilder_ == null) {
        ensureBAGJBBKNADLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bAGJBBKNADL_);
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder clearBAGJBBKNADL() {
      if (bAGJBBKNADLBuilder_ == null) {
        bAGJBBKNADL_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public Builder removeBAGJBBKNADL(int index) {
      if (bAGJBBKNADLBuilder_ == null) {
        ensureBAGJBBKNADLIsMutable();
        bAGJBBKNADL_.remove(index);
        onChanged();
      } else {
        bAGJBBKNADLBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder getBAGJBBKNADLBuilder(
        int index) {
      return getBAGJBBKNADLFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder getBAGJBBKNADLOrBuilder(
        int index) {
      if (bAGJBBKNADLBuilder_ == null) {
        return bAGJBBKNADL_.get(index);  } else {
        return bAGJBBKNADLBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder> 
         getBAGJBBKNADLOrBuilderList() {
      if (bAGJBBKNADLBuilder_ != null) {
        return bAGJBBKNADLBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bAGJBBKNADL_);
      }
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder addBAGJBBKNADLBuilder() {
      return getBAGJBBKNADLFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.IGODKMGOCFI.getDefaultInstance());
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder addBAGJBBKNADLBuilder(
        int index) {
      return getBAGJBBKNADLFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.IGODKMGOCFI.getDefaultInstance());
    }
    /**
     * <code>repeated .IGODKMGOCFI BAGJBBKNADL = 1;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder> 
         getBAGJBBKNADLBuilderList() {
      return getBAGJBBKNADLFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.IGODKMGOCFI, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder, io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder> 
        getBAGJBBKNADLFieldBuilder() {
      if (bAGJBBKNADLBuilder_ == null) {
        bAGJBBKNADLBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.IGODKMGOCFI, io.grasscutter.net.proto.activity.IGODKMGOCFI.Builder, io.grasscutter.net.proto.activity.IGODKMGOCFIOrBuilder>(
                bAGJBBKNADL_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        bAGJBBKNADL_ = null;
      }
      return bAGJBBKNADLBuilder_;
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


    // @@protoc_insertion_point(builder_scope:DCCNBNFGKMA)
  }

  // @@protoc_insertion_point(class_scope:DCCNBNFGKMA)
  private static final io.grasscutter.net.proto.activity.DCCNBNFGKMA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.DCCNBNFGKMA();
  }

  public static io.grasscutter.net.proto.activity.DCCNBNFGKMA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DCCNBNFGKMA>
      PARSER = new com.google.protobuf.AbstractParser<DCCNBNFGKMA>() {
    @java.lang.Override
    public DCCNBNFGKMA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DCCNBNFGKMA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DCCNBNFGKMA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DCCNBNFGKMA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.DCCNBNFGKMA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
