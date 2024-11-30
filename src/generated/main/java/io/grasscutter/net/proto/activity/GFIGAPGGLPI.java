// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code GFIGAPGGLPI}
 */
public final class GFIGAPGGLPI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GFIGAPGGLPI)
    GFIGAPGGLPIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GFIGAPGGLPI.newBuilder() to construct.
  private GFIGAPGGLPI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GFIGAPGGLPI() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GFIGAPGGLPI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GFIGAPGGLPI(
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
          case 8: {

            kDKCOBNNGLO_ = input.readUInt32();
            break;
          }
          case 16: {

            isDone_ = input.readBool();
            break;
          }
          case 24: {

            sceneId_ = input.readUInt32();
            break;
          }
          case 48: {

            lOANKPMKDCC_ = input.readUInt32();
            break;
          }
          case 58: {
            io.grasscutter.net.proto.define.Vector.Builder subBuilder = null;
            if (regionCenterPos_ != null) {
              subBuilder = regionCenterPos_.toBuilder();
            }
            regionCenterPos_ = input.readMessage(io.grasscutter.net.proto.define.Vector.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(regionCenterPos_);
              regionCenterPos_ = subBuilder.buildPartial();
            }

            break;
          }
          case 64: {

            regionId_ = input.readUInt32();
            break;
          }
          case 72: {

            lLFLJCIGKCM_ = input.readUInt32();
            break;
          }
          case 88: {

            isOpen_ = input.readBool();
            break;
          }
          case 101: {

            oBCLCJEJIML_ = input.readFloat();
            break;
          }
          case 120: {

            openTime_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_GFIGAPGGLPI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_GFIGAPGGLPI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.GFIGAPGGLPI.class, io.grasscutter.net.proto.activity.GFIGAPGGLPI.Builder.class);
  }

  public static final int REGION_CENTER_POS_FIELD_NUMBER = 7;
  private io.grasscutter.net.proto.define.Vector regionCenterPos_;
  /**
   * <code>.Vector region_center_pos = 7;</code>
   * @return Whether the regionCenterPos field is set.
   */
  @java.lang.Override
  public boolean hasRegionCenterPos() {
    return regionCenterPos_ != null;
  }
  /**
   * <code>.Vector region_center_pos = 7;</code>
   * @return The regionCenterPos.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Vector getRegionCenterPos() {
    return regionCenterPos_ == null ? io.grasscutter.net.proto.define.Vector.getDefaultInstance() : regionCenterPos_;
  }
  /**
   * <code>.Vector region_center_pos = 7;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.VectorOrBuilder getRegionCenterPosOrBuilder() {
    return getRegionCenterPos();
  }

  public static final int IS_DONE_FIELD_NUMBER = 2;
  private boolean isDone_;
  /**
   * <code>bool is_done = 2;</code>
   * @return The isDone.
   */
  @java.lang.Override
  public boolean getIsDone() {
    return isDone_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 11;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 11;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int REGION_ID_FIELD_NUMBER = 8;
  private int regionId_;
  /**
   * <code>uint32 region_id = 8;</code>
   * @return The regionId.
   */
  @java.lang.Override
  public int getRegionId() {
    return regionId_;
  }

  public static final int KDKCOBNNGLO_FIELD_NUMBER = 1;
  private int kDKCOBNNGLO_;
  /**
   * <code>uint32 KDKCOBNNGLO = 1;</code>
   * @return The kDKCOBNNGLO.
   */
  @java.lang.Override
  public int getKDKCOBNNGLO() {
    return kDKCOBNNGLO_;
  }

  public static final int OBCLCJEJIML_FIELD_NUMBER = 12;
  private float oBCLCJEJIML_;
  /**
   * <code>float OBCLCJEJIML = 12;</code>
   * @return The oBCLCJEJIML.
   */
  @java.lang.Override
  public float getOBCLCJEJIML() {
    return oBCLCJEJIML_;
  }

  public static final int LLFLJCIGKCM_FIELD_NUMBER = 9;
  private int lLFLJCIGKCM_;
  /**
   * <code>uint32 LLFLJCIGKCM = 9;</code>
   * @return The lLFLJCIGKCM.
   */
  @java.lang.Override
  public int getLLFLJCIGKCM() {
    return lLFLJCIGKCM_;
  }

  public static final int LOANKPMKDCC_FIELD_NUMBER = 6;
  private int lOANKPMKDCC_;
  /**
   * <code>uint32 LOANKPMKDCC = 6;</code>
   * @return The lOANKPMKDCC.
   */
  @java.lang.Override
  public int getLOANKPMKDCC() {
    return lOANKPMKDCC_;
  }

  public static final int SCENE_ID_FIELD_NUMBER = 3;
  private int sceneId_;
  /**
   * <code>uint32 scene_id = 3;</code>
   * @return The sceneId.
   */
  @java.lang.Override
  public int getSceneId() {
    return sceneId_;
  }

  public static final int OPEN_TIME_FIELD_NUMBER = 15;
  private int openTime_;
  /**
   * <code>uint32 open_time = 15;</code>
   * @return The openTime.
   */
  @java.lang.Override
  public int getOpenTime() {
    return openTime_;
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
    if (kDKCOBNNGLO_ != 0) {
      output.writeUInt32(1, kDKCOBNNGLO_);
    }
    if (isDone_ != false) {
      output.writeBool(2, isDone_);
    }
    if (sceneId_ != 0) {
      output.writeUInt32(3, sceneId_);
    }
    if (lOANKPMKDCC_ != 0) {
      output.writeUInt32(6, lOANKPMKDCC_);
    }
    if (regionCenterPos_ != null) {
      output.writeMessage(7, getRegionCenterPos());
    }
    if (regionId_ != 0) {
      output.writeUInt32(8, regionId_);
    }
    if (lLFLJCIGKCM_ != 0) {
      output.writeUInt32(9, lLFLJCIGKCM_);
    }
    if (isOpen_ != false) {
      output.writeBool(11, isOpen_);
    }
    if (oBCLCJEJIML_ != 0F) {
      output.writeFloat(12, oBCLCJEJIML_);
    }
    if (openTime_ != 0) {
      output.writeUInt32(15, openTime_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (kDKCOBNNGLO_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, kDKCOBNNGLO_);
    }
    if (isDone_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isDone_);
    }
    if (sceneId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, sceneId_);
    }
    if (lOANKPMKDCC_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, lOANKPMKDCC_);
    }
    if (regionCenterPos_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(7, getRegionCenterPos());
    }
    if (regionId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, regionId_);
    }
    if (lLFLJCIGKCM_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, lLFLJCIGKCM_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(11, isOpen_);
    }
    if (oBCLCJEJIML_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(12, oBCLCJEJIML_);
    }
    if (openTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, openTime_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.GFIGAPGGLPI)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.GFIGAPGGLPI other = (io.grasscutter.net.proto.activity.GFIGAPGGLPI) obj;

    if (hasRegionCenterPos() != other.hasRegionCenterPos()) return false;
    if (hasRegionCenterPos()) {
      if (!getRegionCenterPos()
          .equals(other.getRegionCenterPos())) return false;
    }
    if (getIsDone()
        != other.getIsDone()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getRegionId()
        != other.getRegionId()) return false;
    if (getKDKCOBNNGLO()
        != other.getKDKCOBNNGLO()) return false;
    if (java.lang.Float.floatToIntBits(getOBCLCJEJIML())
        != java.lang.Float.floatToIntBits(
            other.getOBCLCJEJIML())) return false;
    if (getLLFLJCIGKCM()
        != other.getLLFLJCIGKCM()) return false;
    if (getLOANKPMKDCC()
        != other.getLOANKPMKDCC()) return false;
    if (getSceneId()
        != other.getSceneId()) return false;
    if (getOpenTime()
        != other.getOpenTime()) return false;
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
    if (hasRegionCenterPos()) {
      hash = (37 * hash) + REGION_CENTER_POS_FIELD_NUMBER;
      hash = (53 * hash) + getRegionCenterPos().hashCode();
    }
    hash = (37 * hash) + IS_DONE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDone());
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + REGION_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRegionId();
    hash = (37 * hash) + KDKCOBNNGLO_FIELD_NUMBER;
    hash = (53 * hash) + getKDKCOBNNGLO();
    hash = (37 * hash) + OBCLCJEJIML_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getOBCLCJEJIML());
    hash = (37 * hash) + LLFLJCIGKCM_FIELD_NUMBER;
    hash = (53 * hash) + getLLFLJCIGKCM();
    hash = (37 * hash) + LOANKPMKDCC_FIELD_NUMBER;
    hash = (53 * hash) + getLOANKPMKDCC();
    hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getSceneId();
    hash = (37 * hash) + OPEN_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getOpenTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.GFIGAPGGLPI prototype) {
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
   * Protobuf type {@code GFIGAPGGLPI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GFIGAPGGLPI)
      io.grasscutter.net.proto.activity.GFIGAPGGLPIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GFIGAPGGLPI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GFIGAPGGLPI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.GFIGAPGGLPI.class, io.grasscutter.net.proto.activity.GFIGAPGGLPI.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.GFIGAPGGLPI.newBuilder()
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
      if (regionCenterPosBuilder_ == null) {
        regionCenterPos_ = null;
      } else {
        regionCenterPos_ = null;
        regionCenterPosBuilder_ = null;
      }
      isDone_ = false;

      isOpen_ = false;

      regionId_ = 0;

      kDKCOBNNGLO_ = 0;

      oBCLCJEJIML_ = 0F;

      lLFLJCIGKCM_ = 0;

      lOANKPMKDCC_ = 0;

      sceneId_ = 0;

      openTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GFIGAPGGLPI_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GFIGAPGGLPI getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.GFIGAPGGLPI.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GFIGAPGGLPI build() {
      io.grasscutter.net.proto.activity.GFIGAPGGLPI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GFIGAPGGLPI buildPartial() {
      io.grasscutter.net.proto.activity.GFIGAPGGLPI result = new io.grasscutter.net.proto.activity.GFIGAPGGLPI(this);
      if (regionCenterPosBuilder_ == null) {
        result.regionCenterPos_ = regionCenterPos_;
      } else {
        result.regionCenterPos_ = regionCenterPosBuilder_.build();
      }
      result.isDone_ = isDone_;
      result.isOpen_ = isOpen_;
      result.regionId_ = regionId_;
      result.kDKCOBNNGLO_ = kDKCOBNNGLO_;
      result.oBCLCJEJIML_ = oBCLCJEJIML_;
      result.lLFLJCIGKCM_ = lLFLJCIGKCM_;
      result.lOANKPMKDCC_ = lOANKPMKDCC_;
      result.sceneId_ = sceneId_;
      result.openTime_ = openTime_;
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
      if (other instanceof io.grasscutter.net.proto.activity.GFIGAPGGLPI) {
        return mergeFrom((io.grasscutter.net.proto.activity.GFIGAPGGLPI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.GFIGAPGGLPI other) {
      if (other == io.grasscutter.net.proto.activity.GFIGAPGGLPI.getDefaultInstance()) return this;
      if (other.hasRegionCenterPos()) {
        mergeRegionCenterPos(other.getRegionCenterPos());
      }
      if (other.getIsDone() != false) {
        setIsDone(other.getIsDone());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getRegionId() != 0) {
        setRegionId(other.getRegionId());
      }
      if (other.getKDKCOBNNGLO() != 0) {
        setKDKCOBNNGLO(other.getKDKCOBNNGLO());
      }
      if (other.getOBCLCJEJIML() != 0F) {
        setOBCLCJEJIML(other.getOBCLCJEJIML());
      }
      if (other.getLLFLJCIGKCM() != 0) {
        setLLFLJCIGKCM(other.getLLFLJCIGKCM());
      }
      if (other.getLOANKPMKDCC() != 0) {
        setLOANKPMKDCC(other.getLOANKPMKDCC());
      }
      if (other.getSceneId() != 0) {
        setSceneId(other.getSceneId());
      }
      if (other.getOpenTime() != 0) {
        setOpenTime(other.getOpenTime());
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
      io.grasscutter.net.proto.activity.GFIGAPGGLPI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.GFIGAPGGLPI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.define.Vector regionCenterPos_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder> regionCenterPosBuilder_;
    /**
     * <code>.Vector region_center_pos = 7;</code>
     * @return Whether the regionCenterPos field is set.
     */
    public boolean hasRegionCenterPos() {
      return regionCenterPosBuilder_ != null || regionCenterPos_ != null;
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     * @return The regionCenterPos.
     */
    public io.grasscutter.net.proto.define.Vector getRegionCenterPos() {
      if (regionCenterPosBuilder_ == null) {
        return regionCenterPos_ == null ? io.grasscutter.net.proto.define.Vector.getDefaultInstance() : regionCenterPos_;
      } else {
        return regionCenterPosBuilder_.getMessage();
      }
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    public Builder setRegionCenterPos(io.grasscutter.net.proto.define.Vector value) {
      if (regionCenterPosBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        regionCenterPos_ = value;
        onChanged();
      } else {
        regionCenterPosBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    public Builder setRegionCenterPos(
        io.grasscutter.net.proto.define.Vector.Builder builderForValue) {
      if (regionCenterPosBuilder_ == null) {
        regionCenterPos_ = builderForValue.build();
        onChanged();
      } else {
        regionCenterPosBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    public Builder mergeRegionCenterPos(io.grasscutter.net.proto.define.Vector value) {
      if (regionCenterPosBuilder_ == null) {
        if (regionCenterPos_ != null) {
          regionCenterPos_ =
            io.grasscutter.net.proto.define.Vector.newBuilder(regionCenterPos_).mergeFrom(value).buildPartial();
        } else {
          regionCenterPos_ = value;
        }
        onChanged();
      } else {
        regionCenterPosBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    public Builder clearRegionCenterPos() {
      if (regionCenterPosBuilder_ == null) {
        regionCenterPos_ = null;
        onChanged();
      } else {
        regionCenterPos_ = null;
        regionCenterPosBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    public io.grasscutter.net.proto.define.Vector.Builder getRegionCenterPosBuilder() {
      
      onChanged();
      return getRegionCenterPosFieldBuilder().getBuilder();
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    public io.grasscutter.net.proto.define.VectorOrBuilder getRegionCenterPosOrBuilder() {
      if (regionCenterPosBuilder_ != null) {
        return regionCenterPosBuilder_.getMessageOrBuilder();
      } else {
        return regionCenterPos_ == null ?
            io.grasscutter.net.proto.define.Vector.getDefaultInstance() : regionCenterPos_;
      }
    }
    /**
     * <code>.Vector region_center_pos = 7;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder> 
        getRegionCenterPosFieldBuilder() {
      if (regionCenterPosBuilder_ == null) {
        regionCenterPosBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder>(
                getRegionCenterPos(),
                getParentForChildren(),
                isClean());
        regionCenterPos_ = null;
      }
      return regionCenterPosBuilder_;
    }

    private boolean isDone_ ;
    /**
     * <code>bool is_done = 2;</code>
     * @return The isDone.
     */
    @java.lang.Override
    public boolean getIsDone() {
      return isDone_;
    }
    /**
     * <code>bool is_done = 2;</code>
     * @param value The isDone to set.
     * @return This builder for chaining.
     */
    public Builder setIsDone(boolean value) {
      
      isDone_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_done = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDone() {
      
      isDone_ = false;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 11;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 11;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int regionId_ ;
    /**
     * <code>uint32 region_id = 8;</code>
     * @return The regionId.
     */
    @java.lang.Override
    public int getRegionId() {
      return regionId_;
    }
    /**
     * <code>uint32 region_id = 8;</code>
     * @param value The regionId to set.
     * @return This builder for chaining.
     */
    public Builder setRegionId(int value) {
      
      regionId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 region_id = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearRegionId() {
      
      regionId_ = 0;
      onChanged();
      return this;
    }

    private int kDKCOBNNGLO_ ;
    /**
     * <code>uint32 KDKCOBNNGLO = 1;</code>
     * @return The kDKCOBNNGLO.
     */
    @java.lang.Override
    public int getKDKCOBNNGLO() {
      return kDKCOBNNGLO_;
    }
    /**
     * <code>uint32 KDKCOBNNGLO = 1;</code>
     * @param value The kDKCOBNNGLO to set.
     * @return This builder for chaining.
     */
    public Builder setKDKCOBNNGLO(int value) {
      
      kDKCOBNNGLO_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 KDKCOBNNGLO = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearKDKCOBNNGLO() {
      
      kDKCOBNNGLO_ = 0;
      onChanged();
      return this;
    }

    private float oBCLCJEJIML_ ;
    /**
     * <code>float OBCLCJEJIML = 12;</code>
     * @return The oBCLCJEJIML.
     */
    @java.lang.Override
    public float getOBCLCJEJIML() {
      return oBCLCJEJIML_;
    }
    /**
     * <code>float OBCLCJEJIML = 12;</code>
     * @param value The oBCLCJEJIML to set.
     * @return This builder for chaining.
     */
    public Builder setOBCLCJEJIML(float value) {
      
      oBCLCJEJIML_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float OBCLCJEJIML = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearOBCLCJEJIML() {
      
      oBCLCJEJIML_ = 0F;
      onChanged();
      return this;
    }

    private int lLFLJCIGKCM_ ;
    /**
     * <code>uint32 LLFLJCIGKCM = 9;</code>
     * @return The lLFLJCIGKCM.
     */
    @java.lang.Override
    public int getLLFLJCIGKCM() {
      return lLFLJCIGKCM_;
    }
    /**
     * <code>uint32 LLFLJCIGKCM = 9;</code>
     * @param value The lLFLJCIGKCM to set.
     * @return This builder for chaining.
     */
    public Builder setLLFLJCIGKCM(int value) {
      
      lLFLJCIGKCM_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 LLFLJCIGKCM = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearLLFLJCIGKCM() {
      
      lLFLJCIGKCM_ = 0;
      onChanged();
      return this;
    }

    private int lOANKPMKDCC_ ;
    /**
     * <code>uint32 LOANKPMKDCC = 6;</code>
     * @return The lOANKPMKDCC.
     */
    @java.lang.Override
    public int getLOANKPMKDCC() {
      return lOANKPMKDCC_;
    }
    /**
     * <code>uint32 LOANKPMKDCC = 6;</code>
     * @param value The lOANKPMKDCC to set.
     * @return This builder for chaining.
     */
    public Builder setLOANKPMKDCC(int value) {
      
      lOANKPMKDCC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 LOANKPMKDCC = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLOANKPMKDCC() {
      
      lOANKPMKDCC_ = 0;
      onChanged();
      return this;
    }

    private int sceneId_ ;
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }
    /**
     * <code>uint32 scene_id = 3;</code>
     * @param value The sceneId to set.
     * @return This builder for chaining.
     */
    public Builder setSceneId(int value) {
      
      sceneId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 scene_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearSceneId() {
      
      sceneId_ = 0;
      onChanged();
      return this;
    }

    private int openTime_ ;
    /**
     * <code>uint32 open_time = 15;</code>
     * @return The openTime.
     */
    @java.lang.Override
    public int getOpenTime() {
      return openTime_;
    }
    /**
     * <code>uint32 open_time = 15;</code>
     * @param value The openTime to set.
     * @return This builder for chaining.
     */
    public Builder setOpenTime(int value) {
      
      openTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 open_time = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpenTime() {
      
      openTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GFIGAPGGLPI)
  }

  // @@protoc_insertion_point(class_scope:GFIGAPGGLPI)
  private static final io.grasscutter.net.proto.activity.GFIGAPGGLPI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.GFIGAPGGLPI();
  }

  public static io.grasscutter.net.proto.activity.GFIGAPGGLPI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GFIGAPGGLPI>
      PARSER = new com.google.protobuf.AbstractParser<GFIGAPGGLPI>() {
    @java.lang.Override
    public GFIGAPGGLPI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GFIGAPGGLPI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GFIGAPGGLPI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GFIGAPGGLPI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.GFIGAPGGLPI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
