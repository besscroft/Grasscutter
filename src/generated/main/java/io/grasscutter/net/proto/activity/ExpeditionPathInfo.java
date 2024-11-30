// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code ExpeditionPathInfo}
 */
public final class ExpeditionPathInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ExpeditionPathInfo)
    ExpeditionPathInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExpeditionPathInfo.newBuilder() to construct.
  private ExpeditionPathInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExpeditionPathInfo() {
    avatarIdList_ = emptyIntList();
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExpeditionPathInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private ExpeditionPathInfo(
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
          case 16: {
            int rawValue = input.readEnum();

            state_ = rawValue;
            break;
          }
          case 32: {

            startTime_ = input.readUInt32();
            break;
          }
          case 48: {

            gCKFOKIDOHK_ = input.readUInt32();
            break;
          }
          case 56: {

            bIKOAKJLPBE_ = input.readUInt32();
            break;
          }
          case 72: {

            bKPGNCLDGCK_ = input.readUInt32();
            break;
          }
          case 93: {

            bonusProbability_ = input.readFloat();
            break;
          }
          case 96: {

            dBAMDFEJMFG_ = input.readUInt32();
            break;
          }
          case 104: {

            iDOLOJJNLOB_ = input.readUInt32();
            break;
          }
          case 112: {

            challengeId_ = input.readUInt32();
            break;
          }
          case 120: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              avatarIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            avatarIdList_.addInt(input.readUInt32());
            break;
          }
          case 122: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              avatarIdList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              avatarIdList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
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
        avatarIdList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionPathInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionPathInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.ExpeditionPathInfo.class, io.grasscutter.net.proto.activity.ExpeditionPathInfo.Builder.class);
  }

  public static final int AVATAR_ID_LIST_FIELD_NUMBER = 15;
  private com.google.protobuf.Internal.IntList avatarIdList_;
  /**
   * <code>repeated uint32 avatar_id_list = 15;</code>
   * @return A list containing the avatarIdList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getAvatarIdListList() {
    return avatarIdList_;
  }
  /**
   * <code>repeated uint32 avatar_id_list = 15;</code>
   * @return The count of avatarIdList.
   */
  public int getAvatarIdListCount() {
    return avatarIdList_.size();
  }
  /**
   * <code>repeated uint32 avatar_id_list = 15;</code>
   * @param index The index of the element to return.
   * @return The avatarIdList at the given index.
   */
  public int getAvatarIdList(int index) {
    return avatarIdList_.getInt(index);
  }
  private int avatarIdListMemoizedSerializedSize = -1;

  public static final int GCKFOKIDOHK_FIELD_NUMBER = 6;
  private int gCKFOKIDOHK_;
  /**
   * <code>uint32 GCKFOKIDOHK = 6;</code>
   * @return The gCKFOKIDOHK.
   */
  @java.lang.Override
  public int getGCKFOKIDOHK() {
    return gCKFOKIDOHK_;
  }

  public static final int BIKOAKJLPBE_FIELD_NUMBER = 7;
  private int bIKOAKJLPBE_;
  /**
   * <code>uint32 BIKOAKJLPBE = 7;</code>
   * @return The bIKOAKJLPBE.
   */
  @java.lang.Override
  public int getBIKOAKJLPBE() {
    return bIKOAKJLPBE_;
  }

  public static final int BONUS_PROBABILITY_FIELD_NUMBER = 11;
  private float bonusProbability_;
  /**
   * <code>float bonus_probability = 11;</code>
   * @return The bonusProbability.
   */
  @java.lang.Override
  public float getBonusProbability() {
    return bonusProbability_;
  }

  public static final int DBAMDFEJMFG_FIELD_NUMBER = 12;
  private int dBAMDFEJMFG_;
  /**
   * <code>uint32 DBAMDFEJMFG = 12;</code>
   * @return The dBAMDFEJMFG.
   */
  @java.lang.Override
  public int getDBAMDFEJMFG() {
    return dBAMDFEJMFG_;
  }

  public static final int CHALLENGE_ID_FIELD_NUMBER = 14;
  private int challengeId_;
  /**
   * <code>uint32 challenge_id = 14;</code>
   * @return The challengeId.
   */
  @java.lang.Override
  public int getChallengeId() {
    return challengeId_;
  }

  public static final int BKPGNCLDGCK_FIELD_NUMBER = 9;
  private int bKPGNCLDGCK_;
  /**
   * <code>uint32 BKPGNCLDGCK = 9;</code>
   * @return The bKPGNCLDGCK.
   */
  @java.lang.Override
  public int getBKPGNCLDGCK() {
    return bKPGNCLDGCK_;
  }

  public static final int IDOLOJJNLOB_FIELD_NUMBER = 13;
  private int iDOLOJJNLOB_;
  /**
   * <code>uint32 IDOLOJJNLOB = 13;</code>
   * @return The iDOLOJJNLOB.
   */
  @java.lang.Override
  public int getIDOLOJJNLOB() {
    return iDOLOJJNLOB_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_;
  /**
   * <code>.ExpeditionState state = 2;</code>
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override public int getStateValue() {
    return state_;
  }
  /**
   * <code>.ExpeditionState state = 2;</code>
   * @return The state.
   */
  @java.lang.Override public io.grasscutter.net.proto.define.ExpeditionState getState() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.define.ExpeditionState result = io.grasscutter.net.proto.define.ExpeditionState.valueOf(state_);
    return result == null ? io.grasscutter.net.proto.define.ExpeditionState.UNRECOGNIZED : result;
  }

  public static final int START_TIME_FIELD_NUMBER = 4;
  private int startTime_;
  /**
   * <code>uint32 start_time = 4;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public int getStartTime() {
    return startTime_;
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
    getSerializedSize();
    if (state_ != io.grasscutter.net.proto.define.ExpeditionState.ExpeditionState_EXPEDITION_NONE.getNumber()) {
      output.writeEnum(2, state_);
    }
    if (startTime_ != 0) {
      output.writeUInt32(4, startTime_);
    }
    if (gCKFOKIDOHK_ != 0) {
      output.writeUInt32(6, gCKFOKIDOHK_);
    }
    if (bIKOAKJLPBE_ != 0) {
      output.writeUInt32(7, bIKOAKJLPBE_);
    }
    if (bKPGNCLDGCK_ != 0) {
      output.writeUInt32(9, bKPGNCLDGCK_);
    }
    if (bonusProbability_ != 0F) {
      output.writeFloat(11, bonusProbability_);
    }
    if (dBAMDFEJMFG_ != 0) {
      output.writeUInt32(12, dBAMDFEJMFG_);
    }
    if (iDOLOJJNLOB_ != 0) {
      output.writeUInt32(13, iDOLOJJNLOB_);
    }
    if (challengeId_ != 0) {
      output.writeUInt32(14, challengeId_);
    }
    if (getAvatarIdListList().size() > 0) {
      output.writeUInt32NoTag(122);
      output.writeUInt32NoTag(avatarIdListMemoizedSerializedSize);
    }
    for (int i = 0; i < avatarIdList_.size(); i++) {
      output.writeUInt32NoTag(avatarIdList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_ != io.grasscutter.net.proto.define.ExpeditionState.ExpeditionState_EXPEDITION_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
    }
    if (startTime_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, startTime_);
    }
    if (gCKFOKIDOHK_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(6, gCKFOKIDOHK_);
    }
    if (bIKOAKJLPBE_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, bIKOAKJLPBE_);
    }
    if (bKPGNCLDGCK_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, bKPGNCLDGCK_);
    }
    if (bonusProbability_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(11, bonusProbability_);
    }
    if (dBAMDFEJMFG_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, dBAMDFEJMFG_);
    }
    if (iDOLOJJNLOB_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, iDOLOJJNLOB_);
    }
    if (challengeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, challengeId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < avatarIdList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(avatarIdList_.getInt(i));
      }
      size += dataSize;
      if (!getAvatarIdListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      avatarIdListMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.ExpeditionPathInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.ExpeditionPathInfo other = (io.grasscutter.net.proto.activity.ExpeditionPathInfo) obj;

    if (!getAvatarIdListList()
        .equals(other.getAvatarIdListList())) return false;
    if (getGCKFOKIDOHK()
        != other.getGCKFOKIDOHK()) return false;
    if (getBIKOAKJLPBE()
        != other.getBIKOAKJLPBE()) return false;
    if (java.lang.Float.floatToIntBits(getBonusProbability())
        != java.lang.Float.floatToIntBits(
            other.getBonusProbability())) return false;
    if (getDBAMDFEJMFG()
        != other.getDBAMDFEJMFG()) return false;
    if (getChallengeId()
        != other.getChallengeId()) return false;
    if (getBKPGNCLDGCK()
        != other.getBKPGNCLDGCK()) return false;
    if (getIDOLOJJNLOB()
        != other.getIDOLOJJNLOB()) return false;
    if (state_ != other.state_) return false;
    if (getStartTime()
        != other.getStartTime()) return false;
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
    if (getAvatarIdListCount() > 0) {
      hash = (37 * hash) + AVATAR_ID_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getAvatarIdListList().hashCode();
    }
    hash = (37 * hash) + GCKFOKIDOHK_FIELD_NUMBER;
    hash = (53 * hash) + getGCKFOKIDOHK();
    hash = (37 * hash) + BIKOAKJLPBE_FIELD_NUMBER;
    hash = (53 * hash) + getBIKOAKJLPBE();
    hash = (37 * hash) + BONUS_PROBABILITY_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getBonusProbability());
    hash = (37 * hash) + DBAMDFEJMFG_FIELD_NUMBER;
    hash = (53 * hash) + getDBAMDFEJMFG();
    hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChallengeId();
    hash = (37 * hash) + BKPGNCLDGCK_FIELD_NUMBER;
    hash = (53 * hash) + getBKPGNCLDGCK();
    hash = (37 * hash) + IDOLOJJNLOB_FIELD_NUMBER;
    hash = (53 * hash) + getIDOLOJJNLOB();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + getStartTime();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.ExpeditionPathInfo prototype) {
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
   * Protobuf type {@code ExpeditionPathInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ExpeditionPathInfo)
      io.grasscutter.net.proto.activity.ExpeditionPathInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionPathInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionPathInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.ExpeditionPathInfo.class, io.grasscutter.net.proto.activity.ExpeditionPathInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.ExpeditionPathInfo.newBuilder()
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
      avatarIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      gCKFOKIDOHK_ = 0;

      bIKOAKJLPBE_ = 0;

      bonusProbability_ = 0F;

      dBAMDFEJMFG_ = 0;

      challengeId_ = 0;

      bKPGNCLDGCK_ = 0;

      iDOLOJJNLOB_ = 0;

      state_ = 0;

      startTime_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_ExpeditionPathInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ExpeditionPathInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.ExpeditionPathInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ExpeditionPathInfo build() {
      io.grasscutter.net.proto.activity.ExpeditionPathInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.ExpeditionPathInfo buildPartial() {
      io.grasscutter.net.proto.activity.ExpeditionPathInfo result = new io.grasscutter.net.proto.activity.ExpeditionPathInfo(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        avatarIdList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.avatarIdList_ = avatarIdList_;
      result.gCKFOKIDOHK_ = gCKFOKIDOHK_;
      result.bIKOAKJLPBE_ = bIKOAKJLPBE_;
      result.bonusProbability_ = bonusProbability_;
      result.dBAMDFEJMFG_ = dBAMDFEJMFG_;
      result.challengeId_ = challengeId_;
      result.bKPGNCLDGCK_ = bKPGNCLDGCK_;
      result.iDOLOJJNLOB_ = iDOLOJJNLOB_;
      result.state_ = state_;
      result.startTime_ = startTime_;
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
      if (other instanceof io.grasscutter.net.proto.activity.ExpeditionPathInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.ExpeditionPathInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.ExpeditionPathInfo other) {
      if (other == io.grasscutter.net.proto.activity.ExpeditionPathInfo.getDefaultInstance()) return this;
      if (!other.avatarIdList_.isEmpty()) {
        if (avatarIdList_.isEmpty()) {
          avatarIdList_ = other.avatarIdList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureAvatarIdListIsMutable();
          avatarIdList_.addAll(other.avatarIdList_);
        }
        onChanged();
      }
      if (other.getGCKFOKIDOHK() != 0) {
        setGCKFOKIDOHK(other.getGCKFOKIDOHK());
      }
      if (other.getBIKOAKJLPBE() != 0) {
        setBIKOAKJLPBE(other.getBIKOAKJLPBE());
      }
      if (other.getBonusProbability() != 0F) {
        setBonusProbability(other.getBonusProbability());
      }
      if (other.getDBAMDFEJMFG() != 0) {
        setDBAMDFEJMFG(other.getDBAMDFEJMFG());
      }
      if (other.getChallengeId() != 0) {
        setChallengeId(other.getChallengeId());
      }
      if (other.getBKPGNCLDGCK() != 0) {
        setBKPGNCLDGCK(other.getBKPGNCLDGCK());
      }
      if (other.getIDOLOJJNLOB() != 0) {
        setIDOLOJJNLOB(other.getIDOLOJJNLOB());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (other.getStartTime() != 0) {
        setStartTime(other.getStartTime());
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
      io.grasscutter.net.proto.activity.ExpeditionPathInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.ExpeditionPathInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList avatarIdList_ = emptyIntList();
    private void ensureAvatarIdListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        avatarIdList_ = mutableCopy(avatarIdList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return A list containing the avatarIdList.
     */
    public java.util.List<java.lang.Integer>
        getAvatarIdListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(avatarIdList_) : avatarIdList_;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return The count of avatarIdList.
     */
    public int getAvatarIdListCount() {
      return avatarIdList_.size();
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @param index The index of the element to return.
     * @return The avatarIdList at the given index.
     */
    public int getAvatarIdList(int index) {
      return avatarIdList_.getInt(index);
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @param index The index to set the value at.
     * @param value The avatarIdList to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarIdList(
        int index, int value) {
      ensureAvatarIdListIsMutable();
      avatarIdList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @param value The avatarIdList to add.
     * @return This builder for chaining.
     */
    public Builder addAvatarIdList(int value) {
      ensureAvatarIdListIsMutable();
      avatarIdList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @param values The avatarIdList to add.
     * @return This builder for chaining.
     */
    public Builder addAllAvatarIdList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAvatarIdListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, avatarIdList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 avatar_id_list = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvatarIdList() {
      avatarIdList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int gCKFOKIDOHK_ ;
    /**
     * <code>uint32 GCKFOKIDOHK = 6;</code>
     * @return The gCKFOKIDOHK.
     */
    @java.lang.Override
    public int getGCKFOKIDOHK() {
      return gCKFOKIDOHK_;
    }
    /**
     * <code>uint32 GCKFOKIDOHK = 6;</code>
     * @param value The gCKFOKIDOHK to set.
     * @return This builder for chaining.
     */
    public Builder setGCKFOKIDOHK(int value) {
      
      gCKFOKIDOHK_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 GCKFOKIDOHK = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearGCKFOKIDOHK() {
      
      gCKFOKIDOHK_ = 0;
      onChanged();
      return this;
    }

    private int bIKOAKJLPBE_ ;
    /**
     * <code>uint32 BIKOAKJLPBE = 7;</code>
     * @return The bIKOAKJLPBE.
     */
    @java.lang.Override
    public int getBIKOAKJLPBE() {
      return bIKOAKJLPBE_;
    }
    /**
     * <code>uint32 BIKOAKJLPBE = 7;</code>
     * @param value The bIKOAKJLPBE to set.
     * @return This builder for chaining.
     */
    public Builder setBIKOAKJLPBE(int value) {
      
      bIKOAKJLPBE_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 BIKOAKJLPBE = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBIKOAKJLPBE() {
      
      bIKOAKJLPBE_ = 0;
      onChanged();
      return this;
    }

    private float bonusProbability_ ;
    /**
     * <code>float bonus_probability = 11;</code>
     * @return The bonusProbability.
     */
    @java.lang.Override
    public float getBonusProbability() {
      return bonusProbability_;
    }
    /**
     * <code>float bonus_probability = 11;</code>
     * @param value The bonusProbability to set.
     * @return This builder for chaining.
     */
    public Builder setBonusProbability(float value) {
      
      bonusProbability_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float bonus_probability = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearBonusProbability() {
      
      bonusProbability_ = 0F;
      onChanged();
      return this;
    }

    private int dBAMDFEJMFG_ ;
    /**
     * <code>uint32 DBAMDFEJMFG = 12;</code>
     * @return The dBAMDFEJMFG.
     */
    @java.lang.Override
    public int getDBAMDFEJMFG() {
      return dBAMDFEJMFG_;
    }
    /**
     * <code>uint32 DBAMDFEJMFG = 12;</code>
     * @param value The dBAMDFEJMFG to set.
     * @return This builder for chaining.
     */
    public Builder setDBAMDFEJMFG(int value) {
      
      dBAMDFEJMFG_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 DBAMDFEJMFG = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearDBAMDFEJMFG() {
      
      dBAMDFEJMFG_ = 0;
      onChanged();
      return this;
    }

    private int challengeId_ ;
    /**
     * <code>uint32 challenge_id = 14;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }
    /**
     * <code>uint32 challenge_id = 14;</code>
     * @param value The challengeId to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeId(int value) {
      
      challengeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 challenge_id = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearChallengeId() {
      
      challengeId_ = 0;
      onChanged();
      return this;
    }

    private int bKPGNCLDGCK_ ;
    /**
     * <code>uint32 BKPGNCLDGCK = 9;</code>
     * @return The bKPGNCLDGCK.
     */
    @java.lang.Override
    public int getBKPGNCLDGCK() {
      return bKPGNCLDGCK_;
    }
    /**
     * <code>uint32 BKPGNCLDGCK = 9;</code>
     * @param value The bKPGNCLDGCK to set.
     * @return This builder for chaining.
     */
    public Builder setBKPGNCLDGCK(int value) {
      
      bKPGNCLDGCK_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 BKPGNCLDGCK = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearBKPGNCLDGCK() {
      
      bKPGNCLDGCK_ = 0;
      onChanged();
      return this;
    }

    private int iDOLOJJNLOB_ ;
    /**
     * <code>uint32 IDOLOJJNLOB = 13;</code>
     * @return The iDOLOJJNLOB.
     */
    @java.lang.Override
    public int getIDOLOJJNLOB() {
      return iDOLOJJNLOB_;
    }
    /**
     * <code>uint32 IDOLOJJNLOB = 13;</code>
     * @param value The iDOLOJJNLOB to set.
     * @return This builder for chaining.
     */
    public Builder setIDOLOJJNLOB(int value) {
      
      iDOLOJJNLOB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 IDOLOJJNLOB = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearIDOLOJJNLOB() {
      
      iDOLOJJNLOB_ = 0;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>.ExpeditionState state = 2;</code>
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override public int getStateValue() {
      return state_;
    }
    /**
     * <code>.ExpeditionState state = 2;</code>
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ExpeditionState state = 2;</code>
     * @return The state.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.define.ExpeditionState getState() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.define.ExpeditionState result = io.grasscutter.net.proto.define.ExpeditionState.valueOf(state_);
      return result == null ? io.grasscutter.net.proto.define.ExpeditionState.UNRECOGNIZED : result;
    }
    /**
     * <code>.ExpeditionState state = 2;</code>
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(io.grasscutter.net.proto.define.ExpeditionState value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ExpeditionState state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearState() {
      
      state_ = 0;
      onChanged();
      return this;
    }

    private int startTime_ ;
    /**
     * <code>uint32 start_time = 4;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public int getStartTime() {
      return startTime_;
    }
    /**
     * <code>uint32 start_time = 4;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(int value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 start_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = 0;
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


    // @@protoc_insertion_point(builder_scope:ExpeditionPathInfo)
  }

  // @@protoc_insertion_point(class_scope:ExpeditionPathInfo)
  private static final io.grasscutter.net.proto.activity.ExpeditionPathInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.ExpeditionPathInfo();
  }

  public static io.grasscutter.net.proto.activity.ExpeditionPathInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpeditionPathInfo>
      PARSER = new com.google.protobuf.AbstractParser<ExpeditionPathInfo>() {
    @java.lang.Override
    public ExpeditionPathInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new ExpeditionPathInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ExpeditionPathInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpeditionPathInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.ExpeditionPathInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
