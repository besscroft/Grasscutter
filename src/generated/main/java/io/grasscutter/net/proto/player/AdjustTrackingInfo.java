// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: player.proto

package io.grasscutter.net.proto.player;

/**
 * Protobuf type {@code AdjustTrackingInfo}
 */
public final class AdjustTrackingInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AdjustTrackingInfo)
    AdjustTrackingInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AdjustTrackingInfo.newBuilder() to construct.
  private AdjustTrackingInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AdjustTrackingInfo() {
    aLGEHHAMIOH_ = "";
    lFILMIAGPJC_ = "";
    dPJAEAEEMDG_ = "";
    cGNENDPEILC_ = "";
    cJONGOENGPK_ = "";
    jNPANNNBLPJ_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AdjustTrackingInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AdjustTrackingInfo(
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
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            aLGEHHAMIOH_ = s;
            break;
          }
          case 58: {
            java.lang.String s = input.readStringRequireUtf8();

            lFILMIAGPJC_ = s;
            break;
          }
          case 82: {
            java.lang.String s = input.readStringRequireUtf8();

            jNPANNNBLPJ_ = s;
            break;
          }
          case 90: {
            java.lang.String s = input.readStringRequireUtf8();

            cJONGOENGPK_ = s;
            break;
          }
          case 98: {
            java.lang.String s = input.readStringRequireUtf8();

            dPJAEAEEMDG_ = s;
            break;
          }
          case 114: {
            java.lang.String s = input.readStringRequireUtf8();

            cGNENDPEILC_ = s;
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
    return io.grasscutter.net.proto.player.Player.internal_static_AdjustTrackingInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.player.Player.internal_static_AdjustTrackingInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.player.AdjustTrackingInfo.class, io.grasscutter.net.proto.player.AdjustTrackingInfo.Builder.class);
  }

  public static final int ALGEHHAMIOH_FIELD_NUMBER = 5;
  private volatile java.lang.Object aLGEHHAMIOH_;
  /**
   * <code>string ALGEHHAMIOH = 5;</code>
   * @return The aLGEHHAMIOH.
   */
  @java.lang.Override
  public java.lang.String getALGEHHAMIOH() {
    java.lang.Object ref = aLGEHHAMIOH_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      aLGEHHAMIOH_ = s;
      return s;
    }
  }
  /**
   * <code>string ALGEHHAMIOH = 5;</code>
   * @return The bytes for aLGEHHAMIOH.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getALGEHHAMIOHBytes() {
    java.lang.Object ref = aLGEHHAMIOH_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      aLGEHHAMIOH_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int LFILMIAGPJC_FIELD_NUMBER = 7;
  private volatile java.lang.Object lFILMIAGPJC_;
  /**
   * <code>string LFILMIAGPJC = 7;</code>
   * @return The lFILMIAGPJC.
   */
  @java.lang.Override
  public java.lang.String getLFILMIAGPJC() {
    java.lang.Object ref = lFILMIAGPJC_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lFILMIAGPJC_ = s;
      return s;
    }
  }
  /**
   * <code>string LFILMIAGPJC = 7;</code>
   * @return The bytes for lFILMIAGPJC.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getLFILMIAGPJCBytes() {
    java.lang.Object ref = lFILMIAGPJC_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lFILMIAGPJC_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DPJAEAEEMDG_FIELD_NUMBER = 12;
  private volatile java.lang.Object dPJAEAEEMDG_;
  /**
   * <code>string DPJAEAEEMDG = 12;</code>
   * @return The dPJAEAEEMDG.
   */
  @java.lang.Override
  public java.lang.String getDPJAEAEEMDG() {
    java.lang.Object ref = dPJAEAEEMDG_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dPJAEAEEMDG_ = s;
      return s;
    }
  }
  /**
   * <code>string DPJAEAEEMDG = 12;</code>
   * @return The bytes for dPJAEAEEMDG.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDPJAEAEEMDGBytes() {
    java.lang.Object ref = dPJAEAEEMDG_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      dPJAEAEEMDG_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CGNENDPEILC_FIELD_NUMBER = 14;
  private volatile java.lang.Object cGNENDPEILC_;
  /**
   * <code>string CGNENDPEILC = 14;</code>
   * @return The cGNENDPEILC.
   */
  @java.lang.Override
  public java.lang.String getCGNENDPEILC() {
    java.lang.Object ref = cGNENDPEILC_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cGNENDPEILC_ = s;
      return s;
    }
  }
  /**
   * <code>string CGNENDPEILC = 14;</code>
   * @return The bytes for cGNENDPEILC.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCGNENDPEILCBytes() {
    java.lang.Object ref = cGNENDPEILC_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cGNENDPEILC_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CJONGOENGPK_FIELD_NUMBER = 11;
  private volatile java.lang.Object cJONGOENGPK_;
  /**
   * <code>string CJONGOENGPK = 11;</code>
   * @return The cJONGOENGPK.
   */
  @java.lang.Override
  public java.lang.String getCJONGOENGPK() {
    java.lang.Object ref = cJONGOENGPK_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cJONGOENGPK_ = s;
      return s;
    }
  }
  /**
   * <code>string CJONGOENGPK = 11;</code>
   * @return The bytes for cJONGOENGPK.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCJONGOENGPKBytes() {
    java.lang.Object ref = cJONGOENGPK_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cJONGOENGPK_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JNPANNNBLPJ_FIELD_NUMBER = 10;
  private volatile java.lang.Object jNPANNNBLPJ_;
  /**
   * <code>string JNPANNNBLPJ = 10;</code>
   * @return The jNPANNNBLPJ.
   */
  @java.lang.Override
  public java.lang.String getJNPANNNBLPJ() {
    java.lang.Object ref = jNPANNNBLPJ_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jNPANNNBLPJ_ = s;
      return s;
    }
  }
  /**
   * <code>string JNPANNNBLPJ = 10;</code>
   * @return The bytes for jNPANNNBLPJ.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getJNPANNNBLPJBytes() {
    java.lang.Object ref = jNPANNNBLPJ_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jNPANNNBLPJ_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(aLGEHHAMIOH_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, aLGEHHAMIOH_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lFILMIAGPJC_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 7, lFILMIAGPJC_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jNPANNNBLPJ_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 10, jNPANNNBLPJ_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cJONGOENGPK_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 11, cJONGOENGPK_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dPJAEAEEMDG_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 12, dPJAEAEEMDG_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cGNENDPEILC_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 14, cGNENDPEILC_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(aLGEHHAMIOH_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, aLGEHHAMIOH_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(lFILMIAGPJC_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(7, lFILMIAGPJC_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jNPANNNBLPJ_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(10, jNPANNNBLPJ_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cJONGOENGPK_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(11, cJONGOENGPK_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dPJAEAEEMDG_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(12, dPJAEAEEMDG_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cGNENDPEILC_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(14, cGNENDPEILC_);
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
    if (!(obj instanceof io.grasscutter.net.proto.player.AdjustTrackingInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.player.AdjustTrackingInfo other = (io.grasscutter.net.proto.player.AdjustTrackingInfo) obj;

    if (!getALGEHHAMIOH()
        .equals(other.getALGEHHAMIOH())) return false;
    if (!getLFILMIAGPJC()
        .equals(other.getLFILMIAGPJC())) return false;
    if (!getDPJAEAEEMDG()
        .equals(other.getDPJAEAEEMDG())) return false;
    if (!getCGNENDPEILC()
        .equals(other.getCGNENDPEILC())) return false;
    if (!getCJONGOENGPK()
        .equals(other.getCJONGOENGPK())) return false;
    if (!getJNPANNNBLPJ()
        .equals(other.getJNPANNNBLPJ())) return false;
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
    hash = (37 * hash) + ALGEHHAMIOH_FIELD_NUMBER;
    hash = (53 * hash) + getALGEHHAMIOH().hashCode();
    hash = (37 * hash) + LFILMIAGPJC_FIELD_NUMBER;
    hash = (53 * hash) + getLFILMIAGPJC().hashCode();
    hash = (37 * hash) + DPJAEAEEMDG_FIELD_NUMBER;
    hash = (53 * hash) + getDPJAEAEEMDG().hashCode();
    hash = (37 * hash) + CGNENDPEILC_FIELD_NUMBER;
    hash = (53 * hash) + getCGNENDPEILC().hashCode();
    hash = (37 * hash) + CJONGOENGPK_FIELD_NUMBER;
    hash = (53 * hash) + getCJONGOENGPK().hashCode();
    hash = (37 * hash) + JNPANNNBLPJ_FIELD_NUMBER;
    hash = (53 * hash) + getJNPANNNBLPJ().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.player.AdjustTrackingInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.player.AdjustTrackingInfo prototype) {
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
   * Protobuf type {@code AdjustTrackingInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AdjustTrackingInfo)
      io.grasscutter.net.proto.player.AdjustTrackingInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.player.Player.internal_static_AdjustTrackingInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.player.Player.internal_static_AdjustTrackingInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.player.AdjustTrackingInfo.class, io.grasscutter.net.proto.player.AdjustTrackingInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.player.AdjustTrackingInfo.newBuilder()
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
      aLGEHHAMIOH_ = "";

      lFILMIAGPJC_ = "";

      dPJAEAEEMDG_ = "";

      cGNENDPEILC_ = "";

      cJONGOENGPK_ = "";

      jNPANNNBLPJ_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.player.Player.internal_static_AdjustTrackingInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.player.AdjustTrackingInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.player.AdjustTrackingInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.player.AdjustTrackingInfo build() {
      io.grasscutter.net.proto.player.AdjustTrackingInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.player.AdjustTrackingInfo buildPartial() {
      io.grasscutter.net.proto.player.AdjustTrackingInfo result = new io.grasscutter.net.proto.player.AdjustTrackingInfo(this);
      result.aLGEHHAMIOH_ = aLGEHHAMIOH_;
      result.lFILMIAGPJC_ = lFILMIAGPJC_;
      result.dPJAEAEEMDG_ = dPJAEAEEMDG_;
      result.cGNENDPEILC_ = cGNENDPEILC_;
      result.cJONGOENGPK_ = cJONGOENGPK_;
      result.jNPANNNBLPJ_ = jNPANNNBLPJ_;
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
      if (other instanceof io.grasscutter.net.proto.player.AdjustTrackingInfo) {
        return mergeFrom((io.grasscutter.net.proto.player.AdjustTrackingInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.player.AdjustTrackingInfo other) {
      if (other == io.grasscutter.net.proto.player.AdjustTrackingInfo.getDefaultInstance()) return this;
      if (!other.getALGEHHAMIOH().isEmpty()) {
        aLGEHHAMIOH_ = other.aLGEHHAMIOH_;
        onChanged();
      }
      if (!other.getLFILMIAGPJC().isEmpty()) {
        lFILMIAGPJC_ = other.lFILMIAGPJC_;
        onChanged();
      }
      if (!other.getDPJAEAEEMDG().isEmpty()) {
        dPJAEAEEMDG_ = other.dPJAEAEEMDG_;
        onChanged();
      }
      if (!other.getCGNENDPEILC().isEmpty()) {
        cGNENDPEILC_ = other.cGNENDPEILC_;
        onChanged();
      }
      if (!other.getCJONGOENGPK().isEmpty()) {
        cJONGOENGPK_ = other.cJONGOENGPK_;
        onChanged();
      }
      if (!other.getJNPANNNBLPJ().isEmpty()) {
        jNPANNNBLPJ_ = other.jNPANNNBLPJ_;
        onChanged();
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
      io.grasscutter.net.proto.player.AdjustTrackingInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.player.AdjustTrackingInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object aLGEHHAMIOH_ = "";
    /**
     * <code>string ALGEHHAMIOH = 5;</code>
     * @return The aLGEHHAMIOH.
     */
    public java.lang.String getALGEHHAMIOH() {
      java.lang.Object ref = aLGEHHAMIOH_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        aLGEHHAMIOH_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string ALGEHHAMIOH = 5;</code>
     * @return The bytes for aLGEHHAMIOH.
     */
    public com.google.protobuf.ByteString
        getALGEHHAMIOHBytes() {
      java.lang.Object ref = aLGEHHAMIOH_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        aLGEHHAMIOH_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string ALGEHHAMIOH = 5;</code>
     * @param value The aLGEHHAMIOH to set.
     * @return This builder for chaining.
     */
    public Builder setALGEHHAMIOH(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      aLGEHHAMIOH_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string ALGEHHAMIOH = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearALGEHHAMIOH() {
      
      aLGEHHAMIOH_ = getDefaultInstance().getALGEHHAMIOH();
      onChanged();
      return this;
    }
    /**
     * <code>string ALGEHHAMIOH = 5;</code>
     * @param value The bytes for aLGEHHAMIOH to set.
     * @return This builder for chaining.
     */
    public Builder setALGEHHAMIOHBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      aLGEHHAMIOH_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object lFILMIAGPJC_ = "";
    /**
     * <code>string LFILMIAGPJC = 7;</code>
     * @return The lFILMIAGPJC.
     */
    public java.lang.String getLFILMIAGPJC() {
      java.lang.Object ref = lFILMIAGPJC_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lFILMIAGPJC_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string LFILMIAGPJC = 7;</code>
     * @return The bytes for lFILMIAGPJC.
     */
    public com.google.protobuf.ByteString
        getLFILMIAGPJCBytes() {
      java.lang.Object ref = lFILMIAGPJC_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lFILMIAGPJC_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string LFILMIAGPJC = 7;</code>
     * @param value The lFILMIAGPJC to set.
     * @return This builder for chaining.
     */
    public Builder setLFILMIAGPJC(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lFILMIAGPJC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string LFILMIAGPJC = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLFILMIAGPJC() {
      
      lFILMIAGPJC_ = getDefaultInstance().getLFILMIAGPJC();
      onChanged();
      return this;
    }
    /**
     * <code>string LFILMIAGPJC = 7;</code>
     * @param value The bytes for lFILMIAGPJC to set.
     * @return This builder for chaining.
     */
    public Builder setLFILMIAGPJCBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lFILMIAGPJC_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object dPJAEAEEMDG_ = "";
    /**
     * <code>string DPJAEAEEMDG = 12;</code>
     * @return The dPJAEAEEMDG.
     */
    public java.lang.String getDPJAEAEEMDG() {
      java.lang.Object ref = dPJAEAEEMDG_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dPJAEAEEMDG_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string DPJAEAEEMDG = 12;</code>
     * @return The bytes for dPJAEAEEMDG.
     */
    public com.google.protobuf.ByteString
        getDPJAEAEEMDGBytes() {
      java.lang.Object ref = dPJAEAEEMDG_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        dPJAEAEEMDG_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string DPJAEAEEMDG = 12;</code>
     * @param value The dPJAEAEEMDG to set.
     * @return This builder for chaining.
     */
    public Builder setDPJAEAEEMDG(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      dPJAEAEEMDG_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string DPJAEAEEMDG = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearDPJAEAEEMDG() {
      
      dPJAEAEEMDG_ = getDefaultInstance().getDPJAEAEEMDG();
      onChanged();
      return this;
    }
    /**
     * <code>string DPJAEAEEMDG = 12;</code>
     * @param value The bytes for dPJAEAEEMDG to set.
     * @return This builder for chaining.
     */
    public Builder setDPJAEAEEMDGBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      dPJAEAEEMDG_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cGNENDPEILC_ = "";
    /**
     * <code>string CGNENDPEILC = 14;</code>
     * @return The cGNENDPEILC.
     */
    public java.lang.String getCGNENDPEILC() {
      java.lang.Object ref = cGNENDPEILC_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cGNENDPEILC_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CGNENDPEILC = 14;</code>
     * @return The bytes for cGNENDPEILC.
     */
    public com.google.protobuf.ByteString
        getCGNENDPEILCBytes() {
      java.lang.Object ref = cGNENDPEILC_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cGNENDPEILC_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CGNENDPEILC = 14;</code>
     * @param value The cGNENDPEILC to set.
     * @return This builder for chaining.
     */
    public Builder setCGNENDPEILC(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cGNENDPEILC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CGNENDPEILC = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearCGNENDPEILC() {
      
      cGNENDPEILC_ = getDefaultInstance().getCGNENDPEILC();
      onChanged();
      return this;
    }
    /**
     * <code>string CGNENDPEILC = 14;</code>
     * @param value The bytes for cGNENDPEILC to set.
     * @return This builder for chaining.
     */
    public Builder setCGNENDPEILCBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cGNENDPEILC_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object cJONGOENGPK_ = "";
    /**
     * <code>string CJONGOENGPK = 11;</code>
     * @return The cJONGOENGPK.
     */
    public java.lang.String getCJONGOENGPK() {
      java.lang.Object ref = cJONGOENGPK_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cJONGOENGPK_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string CJONGOENGPK = 11;</code>
     * @return The bytes for cJONGOENGPK.
     */
    public com.google.protobuf.ByteString
        getCJONGOENGPKBytes() {
      java.lang.Object ref = cJONGOENGPK_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cJONGOENGPK_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string CJONGOENGPK = 11;</code>
     * @param value The cJONGOENGPK to set.
     * @return This builder for chaining.
     */
    public Builder setCJONGOENGPK(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      cJONGOENGPK_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string CJONGOENGPK = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearCJONGOENGPK() {
      
      cJONGOENGPK_ = getDefaultInstance().getCJONGOENGPK();
      onChanged();
      return this;
    }
    /**
     * <code>string CJONGOENGPK = 11;</code>
     * @param value The bytes for cJONGOENGPK to set.
     * @return This builder for chaining.
     */
    public Builder setCJONGOENGPKBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      cJONGOENGPK_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jNPANNNBLPJ_ = "";
    /**
     * <code>string JNPANNNBLPJ = 10;</code>
     * @return The jNPANNNBLPJ.
     */
    public java.lang.String getJNPANNNBLPJ() {
      java.lang.Object ref = jNPANNNBLPJ_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jNPANNNBLPJ_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string JNPANNNBLPJ = 10;</code>
     * @return The bytes for jNPANNNBLPJ.
     */
    public com.google.protobuf.ByteString
        getJNPANNNBLPJBytes() {
      java.lang.Object ref = jNPANNNBLPJ_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jNPANNNBLPJ_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string JNPANNNBLPJ = 10;</code>
     * @param value The jNPANNNBLPJ to set.
     * @return This builder for chaining.
     */
    public Builder setJNPANNNBLPJ(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jNPANNNBLPJ_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string JNPANNNBLPJ = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearJNPANNNBLPJ() {
      
      jNPANNNBLPJ_ = getDefaultInstance().getJNPANNNBLPJ();
      onChanged();
      return this;
    }
    /**
     * <code>string JNPANNNBLPJ = 10;</code>
     * @param value The bytes for jNPANNNBLPJ to set.
     * @return This builder for chaining.
     */
    public Builder setJNPANNNBLPJBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jNPANNNBLPJ_ = value;
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


    // @@protoc_insertion_point(builder_scope:AdjustTrackingInfo)
  }

  // @@protoc_insertion_point(class_scope:AdjustTrackingInfo)
  private static final io.grasscutter.net.proto.player.AdjustTrackingInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.player.AdjustTrackingInfo();
  }

  public static io.grasscutter.net.proto.player.AdjustTrackingInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdjustTrackingInfo>
      PARSER = new com.google.protobuf.AbstractParser<AdjustTrackingInfo>() {
    @java.lang.Override
    public AdjustTrackingInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AdjustTrackingInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AdjustTrackingInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdjustTrackingInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.player.AdjustTrackingInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
