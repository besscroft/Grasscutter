// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code FOFBDKCPIDC}
 */
public final class FOFBDKCPIDC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FOFBDKCPIDC)
    FOFBDKCPIDCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FOFBDKCPIDC.newBuilder() to construct.
  private FOFBDKCPIDC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FOFBDKCPIDC() {
    aKAFECACNJL_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FOFBDKCPIDC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FOFBDKCPIDC(
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
              aKAFECACNJL_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.KMJJCHGBLHB>();
              mutable_bitField0_ |= 0x00000001;
            }
            aKAFECACNJL_.add(
                input.readMessage(io.grasscutter.net.proto.activity.KMJJCHGBLHB.parser(), extensionRegistry));
            break;
          }
          case 80: {

            oEEDNMALMIF_ = input.readBool();
            break;
          }
          case 104: {

            fAPDAMIMCMH_ = input.readBool();
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
        aKAFECACNJL_ = java.util.Collections.unmodifiableList(aKAFECACNJL_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_FOFBDKCPIDC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_FOFBDKCPIDC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.FOFBDKCPIDC.class, io.grasscutter.net.proto.activity.FOFBDKCPIDC.Builder.class);
  }

  public static final int AKAFECACNJL_FIELD_NUMBER = 4;
  private java.util.List<io.grasscutter.net.proto.activity.KMJJCHGBLHB> aKAFECACNJL_;
  /**
   * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.KMJJCHGBLHB> getAKAFECACNJLList() {
    return aKAFECACNJL_;
  }
  /**
   * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder> 
      getAKAFECACNJLOrBuilderList() {
    return aKAFECACNJL_;
  }
  /**
   * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
   */
  @java.lang.Override
  public int getAKAFECACNJLCount() {
    return aKAFECACNJL_.size();
  }
  /**
   * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.KMJJCHGBLHB getAKAFECACNJL(int index) {
    return aKAFECACNJL_.get(index);
  }
  /**
   * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder getAKAFECACNJLOrBuilder(
      int index) {
    return aKAFECACNJL_.get(index);
  }

  public static final int FAPDAMIMCMH_FIELD_NUMBER = 13;
  private boolean fAPDAMIMCMH_;
  /**
   * <code>bool FAPDAMIMCMH = 13;</code>
   * @return The fAPDAMIMCMH.
   */
  @java.lang.Override
  public boolean getFAPDAMIMCMH() {
    return fAPDAMIMCMH_;
  }

  public static final int OEEDNMALMIF_FIELD_NUMBER = 10;
  private boolean oEEDNMALMIF_;
  /**
   * <code>bool OEEDNMALMIF = 10;</code>
   * @return The oEEDNMALMIF.
   */
  @java.lang.Override
  public boolean getOEEDNMALMIF() {
    return oEEDNMALMIF_;
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
    for (int i = 0; i < aKAFECACNJL_.size(); i++) {
      output.writeMessage(4, aKAFECACNJL_.get(i));
    }
    if (oEEDNMALMIF_ != false) {
      output.writeBool(10, oEEDNMALMIF_);
    }
    if (fAPDAMIMCMH_ != false) {
      output.writeBool(13, fAPDAMIMCMH_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < aKAFECACNJL_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, aKAFECACNJL_.get(i));
    }
    if (oEEDNMALMIF_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(10, oEEDNMALMIF_);
    }
    if (fAPDAMIMCMH_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(13, fAPDAMIMCMH_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.FOFBDKCPIDC)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.FOFBDKCPIDC other = (io.grasscutter.net.proto.activity.FOFBDKCPIDC) obj;

    if (!getAKAFECACNJLList()
        .equals(other.getAKAFECACNJLList())) return false;
    if (getFAPDAMIMCMH()
        != other.getFAPDAMIMCMH()) return false;
    if (getOEEDNMALMIF()
        != other.getOEEDNMALMIF()) return false;
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
    if (getAKAFECACNJLCount() > 0) {
      hash = (37 * hash) + AKAFECACNJL_FIELD_NUMBER;
      hash = (53 * hash) + getAKAFECACNJLList().hashCode();
    }
    hash = (37 * hash) + FAPDAMIMCMH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getFAPDAMIMCMH());
    hash = (37 * hash) + OEEDNMALMIF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getOEEDNMALMIF());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.FOFBDKCPIDC prototype) {
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
   * Protobuf type {@code FOFBDKCPIDC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FOFBDKCPIDC)
      io.grasscutter.net.proto.activity.FOFBDKCPIDCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_FOFBDKCPIDC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_FOFBDKCPIDC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.FOFBDKCPIDC.class, io.grasscutter.net.proto.activity.FOFBDKCPIDC.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.FOFBDKCPIDC.newBuilder()
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
        getAKAFECACNJLFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (aKAFECACNJLBuilder_ == null) {
        aKAFECACNJL_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        aKAFECACNJLBuilder_.clear();
      }
      fAPDAMIMCMH_ = false;

      oEEDNMALMIF_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_FOFBDKCPIDC_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.FOFBDKCPIDC getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.FOFBDKCPIDC.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.FOFBDKCPIDC build() {
      io.grasscutter.net.proto.activity.FOFBDKCPIDC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.FOFBDKCPIDC buildPartial() {
      io.grasscutter.net.proto.activity.FOFBDKCPIDC result = new io.grasscutter.net.proto.activity.FOFBDKCPIDC(this);
      int from_bitField0_ = bitField0_;
      if (aKAFECACNJLBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          aKAFECACNJL_ = java.util.Collections.unmodifiableList(aKAFECACNJL_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.aKAFECACNJL_ = aKAFECACNJL_;
      } else {
        result.aKAFECACNJL_ = aKAFECACNJLBuilder_.build();
      }
      result.fAPDAMIMCMH_ = fAPDAMIMCMH_;
      result.oEEDNMALMIF_ = oEEDNMALMIF_;
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
      if (other instanceof io.grasscutter.net.proto.activity.FOFBDKCPIDC) {
        return mergeFrom((io.grasscutter.net.proto.activity.FOFBDKCPIDC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.FOFBDKCPIDC other) {
      if (other == io.grasscutter.net.proto.activity.FOFBDKCPIDC.getDefaultInstance()) return this;
      if (aKAFECACNJLBuilder_ == null) {
        if (!other.aKAFECACNJL_.isEmpty()) {
          if (aKAFECACNJL_.isEmpty()) {
            aKAFECACNJL_ = other.aKAFECACNJL_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAKAFECACNJLIsMutable();
            aKAFECACNJL_.addAll(other.aKAFECACNJL_);
          }
          onChanged();
        }
      } else {
        if (!other.aKAFECACNJL_.isEmpty()) {
          if (aKAFECACNJLBuilder_.isEmpty()) {
            aKAFECACNJLBuilder_.dispose();
            aKAFECACNJLBuilder_ = null;
            aKAFECACNJL_ = other.aKAFECACNJL_;
            bitField0_ = (bitField0_ & ~0x00000001);
            aKAFECACNJLBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAKAFECACNJLFieldBuilder() : null;
          } else {
            aKAFECACNJLBuilder_.addAllMessages(other.aKAFECACNJL_);
          }
        }
      }
      if (other.getFAPDAMIMCMH() != false) {
        setFAPDAMIMCMH(other.getFAPDAMIMCMH());
      }
      if (other.getOEEDNMALMIF() != false) {
        setOEEDNMALMIF(other.getOEEDNMALMIF());
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
      io.grasscutter.net.proto.activity.FOFBDKCPIDC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.FOFBDKCPIDC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.KMJJCHGBLHB> aKAFECACNJL_ =
      java.util.Collections.emptyList();
    private void ensureAKAFECACNJLIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        aKAFECACNJL_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.KMJJCHGBLHB>(aKAFECACNJL_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.KMJJCHGBLHB, io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder, io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder> aKAFECACNJLBuilder_;

    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.KMJJCHGBLHB> getAKAFECACNJLList() {
      if (aKAFECACNJLBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aKAFECACNJL_);
      } else {
        return aKAFECACNJLBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public int getAKAFECACNJLCount() {
      if (aKAFECACNJLBuilder_ == null) {
        return aKAFECACNJL_.size();
      } else {
        return aKAFECACNJLBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public io.grasscutter.net.proto.activity.KMJJCHGBLHB getAKAFECACNJL(int index) {
      if (aKAFECACNJLBuilder_ == null) {
        return aKAFECACNJL_.get(index);
      } else {
        return aKAFECACNJLBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder setAKAFECACNJL(
        int index, io.grasscutter.net.proto.activity.KMJJCHGBLHB value) {
      if (aKAFECACNJLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.set(index, value);
        onChanged();
      } else {
        aKAFECACNJLBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder setAKAFECACNJL(
        int index, io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder builderForValue) {
      if (aKAFECACNJLBuilder_ == null) {
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.set(index, builderForValue.build());
        onChanged();
      } else {
        aKAFECACNJLBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder addAKAFECACNJL(io.grasscutter.net.proto.activity.KMJJCHGBLHB value) {
      if (aKAFECACNJLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.add(value);
        onChanged();
      } else {
        aKAFECACNJLBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder addAKAFECACNJL(
        int index, io.grasscutter.net.proto.activity.KMJJCHGBLHB value) {
      if (aKAFECACNJLBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.add(index, value);
        onChanged();
      } else {
        aKAFECACNJLBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder addAKAFECACNJL(
        io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder builderForValue) {
      if (aKAFECACNJLBuilder_ == null) {
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.add(builderForValue.build());
        onChanged();
      } else {
        aKAFECACNJLBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder addAKAFECACNJL(
        int index, io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder builderForValue) {
      if (aKAFECACNJLBuilder_ == null) {
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.add(index, builderForValue.build());
        onChanged();
      } else {
        aKAFECACNJLBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder addAllAKAFECACNJL(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.KMJJCHGBLHB> values) {
      if (aKAFECACNJLBuilder_ == null) {
        ensureAKAFECACNJLIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aKAFECACNJL_);
        onChanged();
      } else {
        aKAFECACNJLBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder clearAKAFECACNJL() {
      if (aKAFECACNJLBuilder_ == null) {
        aKAFECACNJL_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        aKAFECACNJLBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public Builder removeAKAFECACNJL(int index) {
      if (aKAFECACNJLBuilder_ == null) {
        ensureAKAFECACNJLIsMutable();
        aKAFECACNJL_.remove(index);
        onChanged();
      } else {
        aKAFECACNJLBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder getAKAFECACNJLBuilder(
        int index) {
      return getAKAFECACNJLFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder getAKAFECACNJLOrBuilder(
        int index) {
      if (aKAFECACNJLBuilder_ == null) {
        return aKAFECACNJL_.get(index);  } else {
        return aKAFECACNJLBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder> 
         getAKAFECACNJLOrBuilderList() {
      if (aKAFECACNJLBuilder_ != null) {
        return aKAFECACNJLBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aKAFECACNJL_);
      }
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder addAKAFECACNJLBuilder() {
      return getAKAFECACNJLFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.KMJJCHGBLHB.getDefaultInstance());
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder addAKAFECACNJLBuilder(
        int index) {
      return getAKAFECACNJLFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.KMJJCHGBLHB.getDefaultInstance());
    }
    /**
     * <code>repeated .KMJJCHGBLHB AKAFECACNJL = 4;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder> 
         getAKAFECACNJLBuilderList() {
      return getAKAFECACNJLFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.KMJJCHGBLHB, io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder, io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder> 
        getAKAFECACNJLFieldBuilder() {
      if (aKAFECACNJLBuilder_ == null) {
        aKAFECACNJLBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.KMJJCHGBLHB, io.grasscutter.net.proto.activity.KMJJCHGBLHB.Builder, io.grasscutter.net.proto.activity.KMJJCHGBLHBOrBuilder>(
                aKAFECACNJL_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        aKAFECACNJL_ = null;
      }
      return aKAFECACNJLBuilder_;
    }

    private boolean fAPDAMIMCMH_ ;
    /**
     * <code>bool FAPDAMIMCMH = 13;</code>
     * @return The fAPDAMIMCMH.
     */
    @java.lang.Override
    public boolean getFAPDAMIMCMH() {
      return fAPDAMIMCMH_;
    }
    /**
     * <code>bool FAPDAMIMCMH = 13;</code>
     * @param value The fAPDAMIMCMH to set.
     * @return This builder for chaining.
     */
    public Builder setFAPDAMIMCMH(boolean value) {
      
      fAPDAMIMCMH_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool FAPDAMIMCMH = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearFAPDAMIMCMH() {
      
      fAPDAMIMCMH_ = false;
      onChanged();
      return this;
    }

    private boolean oEEDNMALMIF_ ;
    /**
     * <code>bool OEEDNMALMIF = 10;</code>
     * @return The oEEDNMALMIF.
     */
    @java.lang.Override
    public boolean getOEEDNMALMIF() {
      return oEEDNMALMIF_;
    }
    /**
     * <code>bool OEEDNMALMIF = 10;</code>
     * @param value The oEEDNMALMIF to set.
     * @return This builder for chaining.
     */
    public Builder setOEEDNMALMIF(boolean value) {
      
      oEEDNMALMIF_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool OEEDNMALMIF = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearOEEDNMALMIF() {
      
      oEEDNMALMIF_ = false;
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


    // @@protoc_insertion_point(builder_scope:FOFBDKCPIDC)
  }

  // @@protoc_insertion_point(class_scope:FOFBDKCPIDC)
  private static final io.grasscutter.net.proto.activity.FOFBDKCPIDC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.FOFBDKCPIDC();
  }

  public static io.grasscutter.net.proto.activity.FOFBDKCPIDC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FOFBDKCPIDC>
      PARSER = new com.google.protobuf.AbstractParser<FOFBDKCPIDC>() {
    @java.lang.Override
    public FOFBDKCPIDC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FOFBDKCPIDC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FOFBDKCPIDC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FOFBDKCPIDC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.FOFBDKCPIDC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
