// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code IKOPLPGJPJE}
 */
public final class IKOPLPGJPJE extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IKOPLPGJPJE)
    IKOPLPGJPJEOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IKOPLPGJPJE.newBuilder() to construct.
  private IKOPLPGJPJE(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IKOPLPGJPJE() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IKOPLPGJPJE();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IKOPLPGJPJE(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 58: {
            io.grasscutter.net.proto.activity.HPCCMBDADFI.Builder subBuilder = null;
            if (gAFMCJBMFAE_ != null) {
              subBuilder = gAFMCJBMFAE_.toBuilder();
            }
            gAFMCJBMFAE_ = input.readMessage(io.grasscutter.net.proto.activity.HPCCMBDADFI.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(gAFMCJBMFAE_);
              gAFMCJBMFAE_ = subBuilder.buildPartial();
            }

            break;
          }
          case 82: {
            io.grasscutter.net.proto.activity.EBPBOJINPGP.Builder subBuilder = null;
            if (aDDHBJKMOIM_ != null) {
              subBuilder = aDDHBJKMOIM_.toBuilder();
            }
            aDDHBJKMOIM_ = input.readMessage(io.grasscutter.net.proto.activity.EBPBOJINPGP.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(aDDHBJKMOIM_);
              aDDHBJKMOIM_ = subBuilder.buildPartial();
            }

            break;
          }
          case 98: {
            io.grasscutter.net.proto.activity.IEBKHMDMHII.Builder subBuilder = null;
            if (pIKPHKJINIB_ != null) {
              subBuilder = pIKPHKJINIB_.toBuilder();
            }
            pIKPHKJINIB_ = input.readMessage(io.grasscutter.net.proto.activity.IEBKHMDMHII.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(pIKPHKJINIB_);
              pIKPHKJINIB_ = subBuilder.buildPartial();
            }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IKOPLPGJPJE_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_IKOPLPGJPJE_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.IKOPLPGJPJE.class, io.grasscutter.net.proto.activity.IKOPLPGJPJE.Builder.class);
  }

  public static final int GAFMCJBMFAE_FIELD_NUMBER = 7;
  private io.grasscutter.net.proto.activity.HPCCMBDADFI gAFMCJBMFAE_;
  /**
   * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
   * @return Whether the gAFMCJBMFAE field is set.
   */
  @java.lang.Override
  public boolean hasGAFMCJBMFAE() {
    return gAFMCJBMFAE_ != null;
  }
  /**
   * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
   * @return The gAFMCJBMFAE.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.HPCCMBDADFI getGAFMCJBMFAE() {
    return gAFMCJBMFAE_ == null ? io.grasscutter.net.proto.activity.HPCCMBDADFI.getDefaultInstance() : gAFMCJBMFAE_;
  }
  /**
   * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.HPCCMBDADFIOrBuilder getGAFMCJBMFAEOrBuilder() {
    return getGAFMCJBMFAE();
  }

  public static final int ADDHBJKMOIM_FIELD_NUMBER = 10;
  private io.grasscutter.net.proto.activity.EBPBOJINPGP aDDHBJKMOIM_;
  /**
   * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
   * @return Whether the aDDHBJKMOIM field is set.
   */
  @java.lang.Override
  public boolean hasADDHBJKMOIM() {
    return aDDHBJKMOIM_ != null;
  }
  /**
   * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
   * @return The aDDHBJKMOIM.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.EBPBOJINPGP getADDHBJKMOIM() {
    return aDDHBJKMOIM_ == null ? io.grasscutter.net.proto.activity.EBPBOJINPGP.getDefaultInstance() : aDDHBJKMOIM_;
  }
  /**
   * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.EBPBOJINPGPOrBuilder getADDHBJKMOIMOrBuilder() {
    return getADDHBJKMOIM();
  }

  public static final int PIKPHKJINIB_FIELD_NUMBER = 12;
  private io.grasscutter.net.proto.activity.IEBKHMDMHII pIKPHKJINIB_;
  /**
   * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
   * @return Whether the pIKPHKJINIB field is set.
   */
  @java.lang.Override
  public boolean hasPIKPHKJINIB() {
    return pIKPHKJINIB_ != null;
  }
  /**
   * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
   * @return The pIKPHKJINIB.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IEBKHMDMHII getPIKPHKJINIB() {
    return pIKPHKJINIB_ == null ? io.grasscutter.net.proto.activity.IEBKHMDMHII.getDefaultInstance() : pIKPHKJINIB_;
  }
  /**
   * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.IEBKHMDMHIIOrBuilder getPIKPHKJINIBOrBuilder() {
    return getPIKPHKJINIB();
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
    if (gAFMCJBMFAE_ != null) {
      output.writeMessage(7, getGAFMCJBMFAE());
    }
    if (aDDHBJKMOIM_ != null) {
      output.writeMessage(10, getADDHBJKMOIM());
    }
    if (pIKPHKJINIB_ != null) {
      output.writeMessage(12, getPIKPHKJINIB());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gAFMCJBMFAE_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getGAFMCJBMFAE());
    }
    if (aDDHBJKMOIM_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(10, getADDHBJKMOIM());
    }
    if (pIKPHKJINIB_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(12, getPIKPHKJINIB());
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.IKOPLPGJPJE)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.IKOPLPGJPJE other = (io.grasscutter.net.proto.activity.IKOPLPGJPJE) obj;

    if (hasGAFMCJBMFAE() != other.hasGAFMCJBMFAE()) return false;
    if (hasGAFMCJBMFAE()) {
      if (!getGAFMCJBMFAE()
          .equals(other.getGAFMCJBMFAE())) return false;
    }
    if (hasADDHBJKMOIM() != other.hasADDHBJKMOIM()) return false;
    if (hasADDHBJKMOIM()) {
      if (!getADDHBJKMOIM()
          .equals(other.getADDHBJKMOIM())) return false;
    }
    if (hasPIKPHKJINIB() != other.hasPIKPHKJINIB()) return false;
    if (hasPIKPHKJINIB()) {
      if (!getPIKPHKJINIB()
          .equals(other.getPIKPHKJINIB())) return false;
    }
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
    if (hasGAFMCJBMFAE()) {
      hash = (37 * hash) + GAFMCJBMFAE_FIELD_NUMBER;
      hash = (53 * hash) + getGAFMCJBMFAE().hashCode();
    }
    if (hasADDHBJKMOIM()) {
      hash = (37 * hash) + ADDHBJKMOIM_FIELD_NUMBER;
      hash = (53 * hash) + getADDHBJKMOIM().hashCode();
    }
    if (hasPIKPHKJINIB()) {
      hash = (37 * hash) + PIKPHKJINIB_FIELD_NUMBER;
      hash = (53 * hash) + getPIKPHKJINIB().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.IKOPLPGJPJE prototype) {
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
   * Protobuf type {@code IKOPLPGJPJE}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IKOPLPGJPJE)
      io.grasscutter.net.proto.activity.IKOPLPGJPJEOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IKOPLPGJPJE_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IKOPLPGJPJE_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.IKOPLPGJPJE.class, io.grasscutter.net.proto.activity.IKOPLPGJPJE.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.IKOPLPGJPJE.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (gAFMCJBMFAEBuilder_ == null) {
        gAFMCJBMFAE_ = null;
      } else {
        gAFMCJBMFAE_ = null;
        gAFMCJBMFAEBuilder_ = null;
      }
      if (aDDHBJKMOIMBuilder_ == null) {
        aDDHBJKMOIM_ = null;
      } else {
        aDDHBJKMOIM_ = null;
        aDDHBJKMOIMBuilder_ = null;
      }
      if (pIKPHKJINIBBuilder_ == null) {
        pIKPHKJINIB_ = null;
      } else {
        pIKPHKJINIB_ = null;
        pIKPHKJINIBBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_IKOPLPGJPJE_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IKOPLPGJPJE getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.IKOPLPGJPJE.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IKOPLPGJPJE build() {
      io.grasscutter.net.proto.activity.IKOPLPGJPJE result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.IKOPLPGJPJE buildPartial() {
      io.grasscutter.net.proto.activity.IKOPLPGJPJE result = new io.grasscutter.net.proto.activity.IKOPLPGJPJE(this);
      if (gAFMCJBMFAEBuilder_ == null) {
        result.gAFMCJBMFAE_ = gAFMCJBMFAE_;
      } else {
        result.gAFMCJBMFAE_ = gAFMCJBMFAEBuilder_.build();
      }
      if (aDDHBJKMOIMBuilder_ == null) {
        result.aDDHBJKMOIM_ = aDDHBJKMOIM_;
      } else {
        result.aDDHBJKMOIM_ = aDDHBJKMOIMBuilder_.build();
      }
      if (pIKPHKJINIBBuilder_ == null) {
        result.pIKPHKJINIB_ = pIKPHKJINIB_;
      } else {
        result.pIKPHKJINIB_ = pIKPHKJINIBBuilder_.build();
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
      if (other instanceof io.grasscutter.net.proto.activity.IKOPLPGJPJE) {
        return mergeFrom((io.grasscutter.net.proto.activity.IKOPLPGJPJE)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.IKOPLPGJPJE other) {
      if (other == io.grasscutter.net.proto.activity.IKOPLPGJPJE.getDefaultInstance()) return this;
      if (other.hasGAFMCJBMFAE()) {
        mergeGAFMCJBMFAE(other.getGAFMCJBMFAE());
      }
      if (other.hasADDHBJKMOIM()) {
        mergeADDHBJKMOIM(other.getADDHBJKMOIM());
      }
      if (other.hasPIKPHKJINIB()) {
        mergePIKPHKJINIB(other.getPIKPHKJINIB());
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
      io.grasscutter.net.proto.activity.IKOPLPGJPJE parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.IKOPLPGJPJE) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.activity.HPCCMBDADFI gAFMCJBMFAE_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.HPCCMBDADFI, io.grasscutter.net.proto.activity.HPCCMBDADFI.Builder, io.grasscutter.net.proto.activity.HPCCMBDADFIOrBuilder> gAFMCJBMFAEBuilder_;
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     * @return Whether the gAFMCJBMFAE field is set.
     */
    public boolean hasGAFMCJBMFAE() {
      return gAFMCJBMFAEBuilder_ != null || gAFMCJBMFAE_ != null;
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     * @return The gAFMCJBMFAE.
     */
    public io.grasscutter.net.proto.activity.HPCCMBDADFI getGAFMCJBMFAE() {
      if (gAFMCJBMFAEBuilder_ == null) {
        return gAFMCJBMFAE_ == null ? io.grasscutter.net.proto.activity.HPCCMBDADFI.getDefaultInstance() : gAFMCJBMFAE_;
      } else {
        return gAFMCJBMFAEBuilder_.getMessage();
      }
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    public Builder setGAFMCJBMFAE(io.grasscutter.net.proto.activity.HPCCMBDADFI value) {
      if (gAFMCJBMFAEBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gAFMCJBMFAE_ = value;
        onChanged();
      } else {
        gAFMCJBMFAEBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    public Builder setGAFMCJBMFAE(
        io.grasscutter.net.proto.activity.HPCCMBDADFI.Builder builderForValue) {
      if (gAFMCJBMFAEBuilder_ == null) {
        gAFMCJBMFAE_ = builderForValue.build();
        onChanged();
      } else {
        gAFMCJBMFAEBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    public Builder mergeGAFMCJBMFAE(io.grasscutter.net.proto.activity.HPCCMBDADFI value) {
      if (gAFMCJBMFAEBuilder_ == null) {
        if (gAFMCJBMFAE_ != null) {
          gAFMCJBMFAE_ =
            io.grasscutter.net.proto.activity.HPCCMBDADFI.newBuilder(gAFMCJBMFAE_).mergeFrom(value).buildPartial();
        } else {
          gAFMCJBMFAE_ = value;
        }
        onChanged();
      } else {
        gAFMCJBMFAEBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    public Builder clearGAFMCJBMFAE() {
      if (gAFMCJBMFAEBuilder_ == null) {
        gAFMCJBMFAE_ = null;
        onChanged();
      } else {
        gAFMCJBMFAE_ = null;
        gAFMCJBMFAEBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    public io.grasscutter.net.proto.activity.HPCCMBDADFI.Builder getGAFMCJBMFAEBuilder() {
      
      onChanged();
      return getGAFMCJBMFAEFieldBuilder().getBuilder();
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    public io.grasscutter.net.proto.activity.HPCCMBDADFIOrBuilder getGAFMCJBMFAEOrBuilder() {
      if (gAFMCJBMFAEBuilder_ != null) {
        return gAFMCJBMFAEBuilder_.getMessageOrBuilder();
      } else {
        return gAFMCJBMFAE_ == null ?
            io.grasscutter.net.proto.activity.HPCCMBDADFI.getDefaultInstance() : gAFMCJBMFAE_;
      }
    }
    /**
     * <code>.HPCCMBDADFI GAFMCJBMFAE = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.HPCCMBDADFI, io.grasscutter.net.proto.activity.HPCCMBDADFI.Builder, io.grasscutter.net.proto.activity.HPCCMBDADFIOrBuilder> 
        getGAFMCJBMFAEFieldBuilder() {
      if (gAFMCJBMFAEBuilder_ == null) {
        gAFMCJBMFAEBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.activity.HPCCMBDADFI, io.grasscutter.net.proto.activity.HPCCMBDADFI.Builder, io.grasscutter.net.proto.activity.HPCCMBDADFIOrBuilder>(
                getGAFMCJBMFAE(),
                getParentForChildren(),
                isClean());
        gAFMCJBMFAE_ = null;
      }
      return gAFMCJBMFAEBuilder_;
    }

    private io.grasscutter.net.proto.activity.EBPBOJINPGP aDDHBJKMOIM_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.EBPBOJINPGP, io.grasscutter.net.proto.activity.EBPBOJINPGP.Builder, io.grasscutter.net.proto.activity.EBPBOJINPGPOrBuilder> aDDHBJKMOIMBuilder_;
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     * @return Whether the aDDHBJKMOIM field is set.
     */
    public boolean hasADDHBJKMOIM() {
      return aDDHBJKMOIMBuilder_ != null || aDDHBJKMOIM_ != null;
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     * @return The aDDHBJKMOIM.
     */
    public io.grasscutter.net.proto.activity.EBPBOJINPGP getADDHBJKMOIM() {
      if (aDDHBJKMOIMBuilder_ == null) {
        return aDDHBJKMOIM_ == null ? io.grasscutter.net.proto.activity.EBPBOJINPGP.getDefaultInstance() : aDDHBJKMOIM_;
      } else {
        return aDDHBJKMOIMBuilder_.getMessage();
      }
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    public Builder setADDHBJKMOIM(io.grasscutter.net.proto.activity.EBPBOJINPGP value) {
      if (aDDHBJKMOIMBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        aDDHBJKMOIM_ = value;
        onChanged();
      } else {
        aDDHBJKMOIMBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    public Builder setADDHBJKMOIM(
        io.grasscutter.net.proto.activity.EBPBOJINPGP.Builder builderForValue) {
      if (aDDHBJKMOIMBuilder_ == null) {
        aDDHBJKMOIM_ = builderForValue.build();
        onChanged();
      } else {
        aDDHBJKMOIMBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    public Builder mergeADDHBJKMOIM(io.grasscutter.net.proto.activity.EBPBOJINPGP value) {
      if (aDDHBJKMOIMBuilder_ == null) {
        if (aDDHBJKMOIM_ != null) {
          aDDHBJKMOIM_ =
            io.grasscutter.net.proto.activity.EBPBOJINPGP.newBuilder(aDDHBJKMOIM_).mergeFrom(value).buildPartial();
        } else {
          aDDHBJKMOIM_ = value;
        }
        onChanged();
      } else {
        aDDHBJKMOIMBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    public Builder clearADDHBJKMOIM() {
      if (aDDHBJKMOIMBuilder_ == null) {
        aDDHBJKMOIM_ = null;
        onChanged();
      } else {
        aDDHBJKMOIM_ = null;
        aDDHBJKMOIMBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    public io.grasscutter.net.proto.activity.EBPBOJINPGP.Builder getADDHBJKMOIMBuilder() {
      
      onChanged();
      return getADDHBJKMOIMFieldBuilder().getBuilder();
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    public io.grasscutter.net.proto.activity.EBPBOJINPGPOrBuilder getADDHBJKMOIMOrBuilder() {
      if (aDDHBJKMOIMBuilder_ != null) {
        return aDDHBJKMOIMBuilder_.getMessageOrBuilder();
      } else {
        return aDDHBJKMOIM_ == null ?
            io.grasscutter.net.proto.activity.EBPBOJINPGP.getDefaultInstance() : aDDHBJKMOIM_;
      }
    }
    /**
     * <code>.EBPBOJINPGP ADDHBJKMOIM = 10;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.EBPBOJINPGP, io.grasscutter.net.proto.activity.EBPBOJINPGP.Builder, io.grasscutter.net.proto.activity.EBPBOJINPGPOrBuilder> 
        getADDHBJKMOIMFieldBuilder() {
      if (aDDHBJKMOIMBuilder_ == null) {
        aDDHBJKMOIMBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.activity.EBPBOJINPGP, io.grasscutter.net.proto.activity.EBPBOJINPGP.Builder, io.grasscutter.net.proto.activity.EBPBOJINPGPOrBuilder>(
                getADDHBJKMOIM(),
                getParentForChildren(),
                isClean());
        aDDHBJKMOIM_ = null;
      }
      return aDDHBJKMOIMBuilder_;
    }

    private io.grasscutter.net.proto.activity.IEBKHMDMHII pIKPHKJINIB_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.IEBKHMDMHII, io.grasscutter.net.proto.activity.IEBKHMDMHII.Builder, io.grasscutter.net.proto.activity.IEBKHMDMHIIOrBuilder> pIKPHKJINIBBuilder_;
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     * @return Whether the pIKPHKJINIB field is set.
     */
    public boolean hasPIKPHKJINIB() {
      return pIKPHKJINIBBuilder_ != null || pIKPHKJINIB_ != null;
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     * @return The pIKPHKJINIB.
     */
    public io.grasscutter.net.proto.activity.IEBKHMDMHII getPIKPHKJINIB() {
      if (pIKPHKJINIBBuilder_ == null) {
        return pIKPHKJINIB_ == null ? io.grasscutter.net.proto.activity.IEBKHMDMHII.getDefaultInstance() : pIKPHKJINIB_;
      } else {
        return pIKPHKJINIBBuilder_.getMessage();
      }
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    public Builder setPIKPHKJINIB(io.grasscutter.net.proto.activity.IEBKHMDMHII value) {
      if (pIKPHKJINIBBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pIKPHKJINIB_ = value;
        onChanged();
      } else {
        pIKPHKJINIBBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    public Builder setPIKPHKJINIB(
        io.grasscutter.net.proto.activity.IEBKHMDMHII.Builder builderForValue) {
      if (pIKPHKJINIBBuilder_ == null) {
        pIKPHKJINIB_ = builderForValue.build();
        onChanged();
      } else {
        pIKPHKJINIBBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    public Builder mergePIKPHKJINIB(io.grasscutter.net.proto.activity.IEBKHMDMHII value) {
      if (pIKPHKJINIBBuilder_ == null) {
        if (pIKPHKJINIB_ != null) {
          pIKPHKJINIB_ =
            io.grasscutter.net.proto.activity.IEBKHMDMHII.newBuilder(pIKPHKJINIB_).mergeFrom(value).buildPartial();
        } else {
          pIKPHKJINIB_ = value;
        }
        onChanged();
      } else {
        pIKPHKJINIBBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    public Builder clearPIKPHKJINIB() {
      if (pIKPHKJINIBBuilder_ == null) {
        pIKPHKJINIB_ = null;
        onChanged();
      } else {
        pIKPHKJINIB_ = null;
        pIKPHKJINIBBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    public io.grasscutter.net.proto.activity.IEBKHMDMHII.Builder getPIKPHKJINIBBuilder() {
      
      onChanged();
      return getPIKPHKJINIBFieldBuilder().getBuilder();
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    public io.grasscutter.net.proto.activity.IEBKHMDMHIIOrBuilder getPIKPHKJINIBOrBuilder() {
      if (pIKPHKJINIBBuilder_ != null) {
        return pIKPHKJINIBBuilder_.getMessageOrBuilder();
      } else {
        return pIKPHKJINIB_ == null ?
            io.grasscutter.net.proto.activity.IEBKHMDMHII.getDefaultInstance() : pIKPHKJINIB_;
      }
    }
    /**
     * <code>.IEBKHMDMHII PIKPHKJINIB = 12;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.activity.IEBKHMDMHII, io.grasscutter.net.proto.activity.IEBKHMDMHII.Builder, io.grasscutter.net.proto.activity.IEBKHMDMHIIOrBuilder> 
        getPIKPHKJINIBFieldBuilder() {
      if (pIKPHKJINIBBuilder_ == null) {
        pIKPHKJINIBBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.activity.IEBKHMDMHII, io.grasscutter.net.proto.activity.IEBKHMDMHII.Builder, io.grasscutter.net.proto.activity.IEBKHMDMHIIOrBuilder>(
                getPIKPHKJINIB(),
                getParentForChildren(),
                isClean());
        pIKPHKJINIB_ = null;
      }
      return pIKPHKJINIBBuilder_;
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


    // @@protoc_insertion_point(builder_scope:IKOPLPGJPJE)
  }

  // @@protoc_insertion_point(class_scope:IKOPLPGJPJE)
  private static final io.grasscutter.net.proto.activity.IKOPLPGJPJE DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.IKOPLPGJPJE();
  }

  public static io.grasscutter.net.proto.activity.IKOPLPGJPJE getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IKOPLPGJPJE>
      PARSER = new com.google.protobuf.AbstractParser<IKOPLPGJPJE>() {
    @java.lang.Override
    public IKOPLPGJPJE parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IKOPLPGJPJE(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IKOPLPGJPJE> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IKOPLPGJPJE> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.IKOPLPGJPJE getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
