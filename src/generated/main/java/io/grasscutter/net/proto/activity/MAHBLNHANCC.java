// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code MAHBLNHANCC}
 */
public final class MAHBLNHANCC extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MAHBLNHANCC)
    MAHBLNHANCCOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MAHBLNHANCC.newBuilder() to construct.
  private MAHBLNHANCC(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MAHBLNHANCC() {
    oIIPLHCBIOK_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MAHBLNHANCC();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MAHBLNHANCC(
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
          case 42: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              oIIPLHCBIOK_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.PMNBPEPIJIK>();
              mutable_bitField0_ |= 0x00000001;
            }
            oIIPLHCBIOK_.add(
                input.readMessage(io.grasscutter.net.proto.activity.PMNBPEPIJIK.parser(), extensionRegistry));
            break;
          }
          case 80: {

            bKPHJKHILOD_ = input.readUInt32();
            break;
          }
          case 120: {

            cPHMIDONIPH_ = input.readUInt32();
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
        oIIPLHCBIOK_ = java.util.Collections.unmodifiableList(oIIPLHCBIOK_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_MAHBLNHANCC_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_MAHBLNHANCC_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.MAHBLNHANCC.class, io.grasscutter.net.proto.activity.MAHBLNHANCC.Builder.class);
  }

  public static final int OIIPLHCBIOK_FIELD_NUMBER = 5;
  private java.util.List<io.grasscutter.net.proto.activity.PMNBPEPIJIK> oIIPLHCBIOK_;
  /**
   * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.PMNBPEPIJIK> getOIIPLHCBIOKList() {
    return oIIPLHCBIOK_;
  }
  /**
   * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder> 
      getOIIPLHCBIOKOrBuilderList() {
    return oIIPLHCBIOK_;
  }
  /**
   * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
   */
  @java.lang.Override
  public int getOIIPLHCBIOKCount() {
    return oIIPLHCBIOK_.size();
  }
  /**
   * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.PMNBPEPIJIK getOIIPLHCBIOK(int index) {
    return oIIPLHCBIOK_.get(index);
  }
  /**
   * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder getOIIPLHCBIOKOrBuilder(
      int index) {
    return oIIPLHCBIOK_.get(index);
  }

  public static final int CPHMIDONIPH_FIELD_NUMBER = 15;
  private int cPHMIDONIPH_;
  /**
   * <code>uint32 CPHMIDONIPH = 15;</code>
   * @return The cPHMIDONIPH.
   */
  @java.lang.Override
  public int getCPHMIDONIPH() {
    return cPHMIDONIPH_;
  }

  public static final int BKPHJKHILOD_FIELD_NUMBER = 10;
  private int bKPHJKHILOD_;
  /**
   * <code>uint32 BKPHJKHILOD = 10;</code>
   * @return The bKPHJKHILOD.
   */
  @java.lang.Override
  public int getBKPHJKHILOD() {
    return bKPHJKHILOD_;
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
    for (int i = 0; i < oIIPLHCBIOK_.size(); i++) {
      output.writeMessage(5, oIIPLHCBIOK_.get(i));
    }
    if (bKPHJKHILOD_ != 0) {
      output.writeUInt32(10, bKPHJKHILOD_);
    }
    if (cPHMIDONIPH_ != 0) {
      output.writeUInt32(15, cPHMIDONIPH_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < oIIPLHCBIOK_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(5, oIIPLHCBIOK_.get(i));
    }
    if (bKPHJKHILOD_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, bKPHJKHILOD_);
    }
    if (cPHMIDONIPH_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, cPHMIDONIPH_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.MAHBLNHANCC)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.MAHBLNHANCC other = (io.grasscutter.net.proto.activity.MAHBLNHANCC) obj;

    if (!getOIIPLHCBIOKList()
        .equals(other.getOIIPLHCBIOKList())) return false;
    if (getCPHMIDONIPH()
        != other.getCPHMIDONIPH()) return false;
    if (getBKPHJKHILOD()
        != other.getBKPHJKHILOD()) return false;
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
    if (getOIIPLHCBIOKCount() > 0) {
      hash = (37 * hash) + OIIPLHCBIOK_FIELD_NUMBER;
      hash = (53 * hash) + getOIIPLHCBIOKList().hashCode();
    }
    hash = (37 * hash) + CPHMIDONIPH_FIELD_NUMBER;
    hash = (53 * hash) + getCPHMIDONIPH();
    hash = (37 * hash) + BKPHJKHILOD_FIELD_NUMBER;
    hash = (53 * hash) + getBKPHJKHILOD();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MAHBLNHANCC parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.MAHBLNHANCC prototype) {
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
   * Protobuf type {@code MAHBLNHANCC}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MAHBLNHANCC)
      io.grasscutter.net.proto.activity.MAHBLNHANCCOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MAHBLNHANCC_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MAHBLNHANCC_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.MAHBLNHANCC.class, io.grasscutter.net.proto.activity.MAHBLNHANCC.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.MAHBLNHANCC.newBuilder()
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
        getOIIPLHCBIOKFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (oIIPLHCBIOKBuilder_ == null) {
        oIIPLHCBIOK_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        oIIPLHCBIOKBuilder_.clear();
      }
      cPHMIDONIPH_ = 0;

      bKPHJKHILOD_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MAHBLNHANCC_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MAHBLNHANCC getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.MAHBLNHANCC.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MAHBLNHANCC build() {
      io.grasscutter.net.proto.activity.MAHBLNHANCC result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MAHBLNHANCC buildPartial() {
      io.grasscutter.net.proto.activity.MAHBLNHANCC result = new io.grasscutter.net.proto.activity.MAHBLNHANCC(this);
      int from_bitField0_ = bitField0_;
      if (oIIPLHCBIOKBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          oIIPLHCBIOK_ = java.util.Collections.unmodifiableList(oIIPLHCBIOK_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oIIPLHCBIOK_ = oIIPLHCBIOK_;
      } else {
        result.oIIPLHCBIOK_ = oIIPLHCBIOKBuilder_.build();
      }
      result.cPHMIDONIPH_ = cPHMIDONIPH_;
      result.bKPHJKHILOD_ = bKPHJKHILOD_;
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
      if (other instanceof io.grasscutter.net.proto.activity.MAHBLNHANCC) {
        return mergeFrom((io.grasscutter.net.proto.activity.MAHBLNHANCC)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.MAHBLNHANCC other) {
      if (other == io.grasscutter.net.proto.activity.MAHBLNHANCC.getDefaultInstance()) return this;
      if (oIIPLHCBIOKBuilder_ == null) {
        if (!other.oIIPLHCBIOK_.isEmpty()) {
          if (oIIPLHCBIOK_.isEmpty()) {
            oIIPLHCBIOK_ = other.oIIPLHCBIOK_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOIIPLHCBIOKIsMutable();
            oIIPLHCBIOK_.addAll(other.oIIPLHCBIOK_);
          }
          onChanged();
        }
      } else {
        if (!other.oIIPLHCBIOK_.isEmpty()) {
          if (oIIPLHCBIOKBuilder_.isEmpty()) {
            oIIPLHCBIOKBuilder_.dispose();
            oIIPLHCBIOKBuilder_ = null;
            oIIPLHCBIOK_ = other.oIIPLHCBIOK_;
            bitField0_ = (bitField0_ & ~0x00000001);
            oIIPLHCBIOKBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOIIPLHCBIOKFieldBuilder() : null;
          } else {
            oIIPLHCBIOKBuilder_.addAllMessages(other.oIIPLHCBIOK_);
          }
        }
      }
      if (other.getCPHMIDONIPH() != 0) {
        setCPHMIDONIPH(other.getCPHMIDONIPH());
      }
      if (other.getBKPHJKHILOD() != 0) {
        setBKPHJKHILOD(other.getBKPHJKHILOD());
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
      io.grasscutter.net.proto.activity.MAHBLNHANCC parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.MAHBLNHANCC) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.PMNBPEPIJIK> oIIPLHCBIOK_ =
      java.util.Collections.emptyList();
    private void ensureOIIPLHCBIOKIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        oIIPLHCBIOK_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.PMNBPEPIJIK>(oIIPLHCBIOK_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.PMNBPEPIJIK, io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder, io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder> oIIPLHCBIOKBuilder_;

    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.PMNBPEPIJIK> getOIIPLHCBIOKList() {
      if (oIIPLHCBIOKBuilder_ == null) {
        return java.util.Collections.unmodifiableList(oIIPLHCBIOK_);
      } else {
        return oIIPLHCBIOKBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public int getOIIPLHCBIOKCount() {
      if (oIIPLHCBIOKBuilder_ == null) {
        return oIIPLHCBIOK_.size();
      } else {
        return oIIPLHCBIOKBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public io.grasscutter.net.proto.activity.PMNBPEPIJIK getOIIPLHCBIOK(int index) {
      if (oIIPLHCBIOKBuilder_ == null) {
        return oIIPLHCBIOK_.get(index);
      } else {
        return oIIPLHCBIOKBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder setOIIPLHCBIOK(
        int index, io.grasscutter.net.proto.activity.PMNBPEPIJIK value) {
      if (oIIPLHCBIOKBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.set(index, value);
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder setOIIPLHCBIOK(
        int index, io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder builderForValue) {
      if (oIIPLHCBIOKBuilder_ == null) {
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.set(index, builderForValue.build());
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder addOIIPLHCBIOK(io.grasscutter.net.proto.activity.PMNBPEPIJIK value) {
      if (oIIPLHCBIOKBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.add(value);
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder addOIIPLHCBIOK(
        int index, io.grasscutter.net.proto.activity.PMNBPEPIJIK value) {
      if (oIIPLHCBIOKBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.add(index, value);
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder addOIIPLHCBIOK(
        io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder builderForValue) {
      if (oIIPLHCBIOKBuilder_ == null) {
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.add(builderForValue.build());
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder addOIIPLHCBIOK(
        int index, io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder builderForValue) {
      if (oIIPLHCBIOKBuilder_ == null) {
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.add(index, builderForValue.build());
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder addAllOIIPLHCBIOK(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.PMNBPEPIJIK> values) {
      if (oIIPLHCBIOKBuilder_ == null) {
        ensureOIIPLHCBIOKIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oIIPLHCBIOK_);
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder clearOIIPLHCBIOK() {
      if (oIIPLHCBIOKBuilder_ == null) {
        oIIPLHCBIOK_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public Builder removeOIIPLHCBIOK(int index) {
      if (oIIPLHCBIOKBuilder_ == null) {
        ensureOIIPLHCBIOKIsMutable();
        oIIPLHCBIOK_.remove(index);
        onChanged();
      } else {
        oIIPLHCBIOKBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder getOIIPLHCBIOKBuilder(
        int index) {
      return getOIIPLHCBIOKFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder getOIIPLHCBIOKOrBuilder(
        int index) {
      if (oIIPLHCBIOKBuilder_ == null) {
        return oIIPLHCBIOK_.get(index);  } else {
        return oIIPLHCBIOKBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder> 
         getOIIPLHCBIOKOrBuilderList() {
      if (oIIPLHCBIOKBuilder_ != null) {
        return oIIPLHCBIOKBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(oIIPLHCBIOK_);
      }
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder addOIIPLHCBIOKBuilder() {
      return getOIIPLHCBIOKFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.PMNBPEPIJIK.getDefaultInstance());
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder addOIIPLHCBIOKBuilder(
        int index) {
      return getOIIPLHCBIOKFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.PMNBPEPIJIK.getDefaultInstance());
    }
    /**
     * <code>repeated .PMNBPEPIJIK OIIPLHCBIOK = 5;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder> 
         getOIIPLHCBIOKBuilderList() {
      return getOIIPLHCBIOKFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.PMNBPEPIJIK, io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder, io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder> 
        getOIIPLHCBIOKFieldBuilder() {
      if (oIIPLHCBIOKBuilder_ == null) {
        oIIPLHCBIOKBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.PMNBPEPIJIK, io.grasscutter.net.proto.activity.PMNBPEPIJIK.Builder, io.grasscutter.net.proto.activity.PMNBPEPIJIKOrBuilder>(
                oIIPLHCBIOK_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        oIIPLHCBIOK_ = null;
      }
      return oIIPLHCBIOKBuilder_;
    }

    private int cPHMIDONIPH_ ;
    /**
     * <code>uint32 CPHMIDONIPH = 15;</code>
     * @return The cPHMIDONIPH.
     */
    @java.lang.Override
    public int getCPHMIDONIPH() {
      return cPHMIDONIPH_;
    }
    /**
     * <code>uint32 CPHMIDONIPH = 15;</code>
     * @param value The cPHMIDONIPH to set.
     * @return This builder for chaining.
     */
    public Builder setCPHMIDONIPH(int value) {
      
      cPHMIDONIPH_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 CPHMIDONIPH = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearCPHMIDONIPH() {
      
      cPHMIDONIPH_ = 0;
      onChanged();
      return this;
    }

    private int bKPHJKHILOD_ ;
    /**
     * <code>uint32 BKPHJKHILOD = 10;</code>
     * @return The bKPHJKHILOD.
     */
    @java.lang.Override
    public int getBKPHJKHILOD() {
      return bKPHJKHILOD_;
    }
    /**
     * <code>uint32 BKPHJKHILOD = 10;</code>
     * @param value The bKPHJKHILOD to set.
     * @return This builder for chaining.
     */
    public Builder setBKPHJKHILOD(int value) {
      
      bKPHJKHILOD_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 BKPHJKHILOD = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearBKPHJKHILOD() {
      
      bKPHJKHILOD_ = 0;
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


    // @@protoc_insertion_point(builder_scope:MAHBLNHANCC)
  }

  // @@protoc_insertion_point(class_scope:MAHBLNHANCC)
  private static final io.grasscutter.net.proto.activity.MAHBLNHANCC DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.MAHBLNHANCC();
  }

  public static io.grasscutter.net.proto.activity.MAHBLNHANCC getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MAHBLNHANCC>
      PARSER = new com.google.protobuf.AbstractParser<MAHBLNHANCC>() {
    @java.lang.Override
    public MAHBLNHANCC parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MAHBLNHANCC(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MAHBLNHANCC> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MAHBLNHANCC> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.MAHBLNHANCC getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
