// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code NNKIJPDEJKE}
 */
public final class NNKIJPDEJKE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:NNKIJPDEJKE)
    NNKIJPDEJKEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use NNKIJPDEJKE.newBuilder() to construct.
  private NNKIJPDEJKE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private NNKIJPDEJKE() {
    kIKEOBNGPPO_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new NNKIJPDEJKE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private NNKIJPDEJKE(
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
          case 66: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              kIKEOBNGPPO_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.KEPNFKBPGHM>();
              mutable_bitField0_ |= 0x00000001;
            }
            kIKEOBNGPPO_.add(
                input.readMessage(io.grasscutter.net.proto.activity.KEPNFKBPGHM.parser(), extensionRegistry));
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
        kIKEOBNGPPO_ = java.util.Collections.unmodifiableList(kIKEOBNGPPO_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_NNKIJPDEJKE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_NNKIJPDEJKE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.NNKIJPDEJKE.class, io.grasscutter.net.proto.activity.NNKIJPDEJKE.Builder.class);
  }

  public static final int KIKEOBNGPPO_FIELD_NUMBER = 8;
  private java.util.List<io.grasscutter.net.proto.activity.KEPNFKBPGHM> kIKEOBNGPPO_;
  /**
   * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.KEPNFKBPGHM> getKIKEOBNGPPOList() {
    return kIKEOBNGPPO_;
  }
  /**
   * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder> 
      getKIKEOBNGPPOOrBuilderList() {
    return kIKEOBNGPPO_;
  }
  /**
   * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
   */
  @java.lang.Override
  public int getKIKEOBNGPPOCount() {
    return kIKEOBNGPPO_.size();
  }
  /**
   * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.KEPNFKBPGHM getKIKEOBNGPPO(int index) {
    return kIKEOBNGPPO_.get(index);
  }
  /**
   * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder getKIKEOBNGPPOOrBuilder(
      int index) {
    return kIKEOBNGPPO_.get(index);
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
    for (int i = 0; i < kIKEOBNGPPO_.size(); i++) {
      output.writeMessage(8, kIKEOBNGPPO_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < kIKEOBNGPPO_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, kIKEOBNGPPO_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.NNKIJPDEJKE)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.NNKIJPDEJKE other = (io.grasscutter.net.proto.activity.NNKIJPDEJKE) obj;

    if (!getKIKEOBNGPPOList()
        .equals(other.getKIKEOBNGPPOList())) return false;
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
    if (getKIKEOBNGPPOCount() > 0) {
      hash = (37 * hash) + KIKEOBNGPPO_FIELD_NUMBER;
      hash = (53 * hash) + getKIKEOBNGPPOList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.NNKIJPDEJKE prototype) {
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
   * Protobuf type {@code NNKIJPDEJKE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:NNKIJPDEJKE)
      io.grasscutter.net.proto.activity.NNKIJPDEJKEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_NNKIJPDEJKE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_NNKIJPDEJKE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.NNKIJPDEJKE.class, io.grasscutter.net.proto.activity.NNKIJPDEJKE.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.NNKIJPDEJKE.newBuilder()
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
        getKIKEOBNGPPOFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (kIKEOBNGPPOBuilder_ == null) {
        kIKEOBNGPPO_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        kIKEOBNGPPOBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_NNKIJPDEJKE_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.NNKIJPDEJKE getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.NNKIJPDEJKE.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.NNKIJPDEJKE build() {
      io.grasscutter.net.proto.activity.NNKIJPDEJKE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.NNKIJPDEJKE buildPartial() {
      io.grasscutter.net.proto.activity.NNKIJPDEJKE result = new io.grasscutter.net.proto.activity.NNKIJPDEJKE(this);
      int from_bitField0_ = bitField0_;
      if (kIKEOBNGPPOBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          kIKEOBNGPPO_ = java.util.Collections.unmodifiableList(kIKEOBNGPPO_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.kIKEOBNGPPO_ = kIKEOBNGPPO_;
      } else {
        result.kIKEOBNGPPO_ = kIKEOBNGPPOBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.NNKIJPDEJKE) {
        return mergeFrom((io.grasscutter.net.proto.activity.NNKIJPDEJKE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.NNKIJPDEJKE other) {
      if (other == io.grasscutter.net.proto.activity.NNKIJPDEJKE.getDefaultInstance()) return this;
      if (kIKEOBNGPPOBuilder_ == null) {
        if (!other.kIKEOBNGPPO_.isEmpty()) {
          if (kIKEOBNGPPO_.isEmpty()) {
            kIKEOBNGPPO_ = other.kIKEOBNGPPO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureKIKEOBNGPPOIsMutable();
            kIKEOBNGPPO_.addAll(other.kIKEOBNGPPO_);
          }
          onChanged();
        }
      } else {
        if (!other.kIKEOBNGPPO_.isEmpty()) {
          if (kIKEOBNGPPOBuilder_.isEmpty()) {
            kIKEOBNGPPOBuilder_.dispose();
            kIKEOBNGPPOBuilder_ = null;
            kIKEOBNGPPO_ = other.kIKEOBNGPPO_;
            bitField0_ = (bitField0_ & ~0x00000001);
            kIKEOBNGPPOBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getKIKEOBNGPPOFieldBuilder() : null;
          } else {
            kIKEOBNGPPOBuilder_.addAllMessages(other.kIKEOBNGPPO_);
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
      io.grasscutter.net.proto.activity.NNKIJPDEJKE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.NNKIJPDEJKE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.KEPNFKBPGHM> kIKEOBNGPPO_ =
      java.util.Collections.emptyList();
    private void ensureKIKEOBNGPPOIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        kIKEOBNGPPO_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.KEPNFKBPGHM>(kIKEOBNGPPO_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.KEPNFKBPGHM, io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder, io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder> kIKEOBNGPPOBuilder_;

    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.KEPNFKBPGHM> getKIKEOBNGPPOList() {
      if (kIKEOBNGPPOBuilder_ == null) {
        return java.util.Collections.unmodifiableList(kIKEOBNGPPO_);
      } else {
        return kIKEOBNGPPOBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public int getKIKEOBNGPPOCount() {
      if (kIKEOBNGPPOBuilder_ == null) {
        return kIKEOBNGPPO_.size();
      } else {
        return kIKEOBNGPPOBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public io.grasscutter.net.proto.activity.KEPNFKBPGHM getKIKEOBNGPPO(int index) {
      if (kIKEOBNGPPOBuilder_ == null) {
        return kIKEOBNGPPO_.get(index);
      } else {
        return kIKEOBNGPPOBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder setKIKEOBNGPPO(
        int index, io.grasscutter.net.proto.activity.KEPNFKBPGHM value) {
      if (kIKEOBNGPPOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.set(index, value);
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder setKIKEOBNGPPO(
        int index, io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder builderForValue) {
      if (kIKEOBNGPPOBuilder_ == null) {
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.set(index, builderForValue.build());
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder addKIKEOBNGPPO(io.grasscutter.net.proto.activity.KEPNFKBPGHM value) {
      if (kIKEOBNGPPOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.add(value);
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder addKIKEOBNGPPO(
        int index, io.grasscutter.net.proto.activity.KEPNFKBPGHM value) {
      if (kIKEOBNGPPOBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.add(index, value);
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder addKIKEOBNGPPO(
        io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder builderForValue) {
      if (kIKEOBNGPPOBuilder_ == null) {
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.add(builderForValue.build());
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder addKIKEOBNGPPO(
        int index, io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder builderForValue) {
      if (kIKEOBNGPPOBuilder_ == null) {
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.add(index, builderForValue.build());
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder addAllKIKEOBNGPPO(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.KEPNFKBPGHM> values) {
      if (kIKEOBNGPPOBuilder_ == null) {
        ensureKIKEOBNGPPOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, kIKEOBNGPPO_);
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder clearKIKEOBNGPPO() {
      if (kIKEOBNGPPOBuilder_ == null) {
        kIKEOBNGPPO_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public Builder removeKIKEOBNGPPO(int index) {
      if (kIKEOBNGPPOBuilder_ == null) {
        ensureKIKEOBNGPPOIsMutable();
        kIKEOBNGPPO_.remove(index);
        onChanged();
      } else {
        kIKEOBNGPPOBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder getKIKEOBNGPPOBuilder(
        int index) {
      return getKIKEOBNGPPOFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder getKIKEOBNGPPOOrBuilder(
        int index) {
      if (kIKEOBNGPPOBuilder_ == null) {
        return kIKEOBNGPPO_.get(index);  } else {
        return kIKEOBNGPPOBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder> 
         getKIKEOBNGPPOOrBuilderList() {
      if (kIKEOBNGPPOBuilder_ != null) {
        return kIKEOBNGPPOBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(kIKEOBNGPPO_);
      }
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder addKIKEOBNGPPOBuilder() {
      return getKIKEOBNGPPOFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.KEPNFKBPGHM.getDefaultInstance());
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder addKIKEOBNGPPOBuilder(
        int index) {
      return getKIKEOBNGPPOFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.KEPNFKBPGHM.getDefaultInstance());
    }
    /**
     * <code>repeated .KEPNFKBPGHM KIKEOBNGPPO = 8;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder> 
         getKIKEOBNGPPOBuilderList() {
      return getKIKEOBNGPPOFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.KEPNFKBPGHM, io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder, io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder> 
        getKIKEOBNGPPOFieldBuilder() {
      if (kIKEOBNGPPOBuilder_ == null) {
        kIKEOBNGPPOBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.KEPNFKBPGHM, io.grasscutter.net.proto.activity.KEPNFKBPGHM.Builder, io.grasscutter.net.proto.activity.KEPNFKBPGHMOrBuilder>(
                kIKEOBNGPPO_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        kIKEOBNGPPO_ = null;
      }
      return kIKEOBNGPPOBuilder_;
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


    // @@protoc_insertion_point(builder_scope:NNKIJPDEJKE)
  }

  // @@protoc_insertion_point(class_scope:NNKIJPDEJKE)
  private static final io.grasscutter.net.proto.activity.NNKIJPDEJKE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.NNKIJPDEJKE();
  }

  public static io.grasscutter.net.proto.activity.NNKIJPDEJKE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NNKIJPDEJKE>
      PARSER = new com.google.protobuf.AbstractParser<NNKIJPDEJKE>() {
    @java.lang.Override
    public NNKIJPDEJKE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new NNKIJPDEJKE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<NNKIJPDEJKE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NNKIJPDEJKE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.NNKIJPDEJKE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
