// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code LanternRiteFireworksChallengeInfo}
 */
public final class LanternRiteFireworksChallengeInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LanternRiteFireworksChallengeInfo)
    LanternRiteFireworksChallengeInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LanternRiteFireworksChallengeInfo.newBuilder() to construct.
  private LanternRiteFireworksChallengeInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LanternRiteFireworksChallengeInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LanternRiteFireworksChallengeInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LanternRiteFireworksChallengeInfo(
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
          case 40: {

            isFullScore_ = input.readBool();
            break;
          }
          case 72: {

            challengeId_ = input.readUInt32();
            break;
          }
          case 112: {

            bestScore_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.class, io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.Builder.class);
  }

  public static final int BEST_SCORE_FIELD_NUMBER = 14;
  private int bestScore_;
  /**
   * <code>uint32 best_score = 14;</code>
   * @return The bestScore.
   */
  @java.lang.Override
  public int getBestScore() {
    return bestScore_;
  }

  public static final int CHALLENGE_ID_FIELD_NUMBER = 9;
  private int challengeId_;
  /**
   * <code>uint32 challenge_id = 9;</code>
   * @return The challengeId.
   */
  @java.lang.Override
  public int getChallengeId() {
    return challengeId_;
  }

  public static final int IS_FULL_SCORE_FIELD_NUMBER = 5;
  private boolean isFullScore_;
  /**
   * <code>bool is_full_score = 5;</code>
   * @return The isFullScore.
   */
  @java.lang.Override
  public boolean getIsFullScore() {
    return isFullScore_;
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
    if (isFullScore_ != false) {
      output.writeBool(5, isFullScore_);
    }
    if (challengeId_ != 0) {
      output.writeUInt32(9, challengeId_);
    }
    if (bestScore_ != 0) {
      output.writeUInt32(14, bestScore_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isFullScore_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isFullScore_);
    }
    if (challengeId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(9, challengeId_);
    }
    if (bestScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(14, bestScore_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo other = (io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo) obj;

    if (getBestScore()
        != other.getBestScore()) return false;
    if (getChallengeId()
        != other.getChallengeId()) return false;
    if (getIsFullScore()
        != other.getIsFullScore()) return false;
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
    hash = (37 * hash) + BEST_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getBestScore();
    hash = (37 * hash) + CHALLENGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChallengeId();
    hash = (37 * hash) + IS_FULL_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFullScore());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo prototype) {
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
   * Protobuf type {@code LanternRiteFireworksChallengeInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LanternRiteFireworksChallengeInfo)
      io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LanternRiteFireworksChallengeInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.class, io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.newBuilder()
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
      bestScore_ = 0;

      challengeId_ = 0;

      isFullScore_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_LanternRiteFireworksChallengeInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo build() {
      io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo buildPartial() {
      io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo result = new io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo(this);
      result.bestScore_ = bestScore_;
      result.challengeId_ = challengeId_;
      result.isFullScore_ = isFullScore_;
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
      if (other instanceof io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo) {
        return mergeFrom((io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo other) {
      if (other == io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo.getDefaultInstance()) return this;
      if (other.getBestScore() != 0) {
        setBestScore(other.getBestScore());
      }
      if (other.getChallengeId() != 0) {
        setChallengeId(other.getChallengeId());
      }
      if (other.getIsFullScore() != false) {
        setIsFullScore(other.getIsFullScore());
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
      io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bestScore_ ;
    /**
     * <code>uint32 best_score = 14;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }
    /**
     * <code>uint32 best_score = 14;</code>
     * @param value The bestScore to set.
     * @return This builder for chaining.
     */
    public Builder setBestScore(int value) {
      
      bestScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 best_score = 14;</code>
     * @return This builder for chaining.
     */
    public Builder clearBestScore() {
      
      bestScore_ = 0;
      onChanged();
      return this;
    }

    private int challengeId_ ;
    /**
     * <code>uint32 challenge_id = 9;</code>
     * @return The challengeId.
     */
    @java.lang.Override
    public int getChallengeId() {
      return challengeId_;
    }
    /**
     * <code>uint32 challenge_id = 9;</code>
     * @param value The challengeId to set.
     * @return This builder for chaining.
     */
    public Builder setChallengeId(int value) {
      
      challengeId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 challenge_id = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearChallengeId() {
      
      challengeId_ = 0;
      onChanged();
      return this;
    }

    private boolean isFullScore_ ;
    /**
     * <code>bool is_full_score = 5;</code>
     * @return The isFullScore.
     */
    @java.lang.Override
    public boolean getIsFullScore() {
      return isFullScore_;
    }
    /**
     * <code>bool is_full_score = 5;</code>
     * @param value The isFullScore to set.
     * @return This builder for chaining.
     */
    public Builder setIsFullScore(boolean value) {
      
      isFullScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_full_score = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFullScore() {
      
      isFullScore_ = false;
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


    // @@protoc_insertion_point(builder_scope:LanternRiteFireworksChallengeInfo)
  }

  // @@protoc_insertion_point(class_scope:LanternRiteFireworksChallengeInfo)
  private static final io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo();
  }

  public static io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo>
      PARSER = new com.google.protobuf.AbstractParser<LanternRiteFireworksChallengeInfo>() {
    @java.lang.Override
    public LanternRiteFireworksChallengeInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LanternRiteFireworksChallengeInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LanternRiteFireworksChallengeInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.LanternRiteFireworksChallengeInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
