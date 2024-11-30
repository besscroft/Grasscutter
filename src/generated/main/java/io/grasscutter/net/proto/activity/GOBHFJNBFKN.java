// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code GOBHFJNBFKN}
 */
public final class GOBHFJNBFKN extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GOBHFJNBFKN)
    GOBHFJNBFKNOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GOBHFJNBFKN.newBuilder() to construct.
  private GOBHFJNBFKN(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GOBHFJNBFKN() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GOBHFJNBFKN();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GOBHFJNBFKN(
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
          case 16: {

            oGDCENFLHJN_ = input.readUInt32();
            break;
          }
          case 24: {

            isFinish_ = input.readBool();
            break;
          }
          case 48: {

            isOpen_ = input.readBool();
            break;
          }
          case 64: {

            maxScore_ = input.readUInt32();
            break;
          }
          case 80: {

            levelId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_GOBHFJNBFKN_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_GOBHFJNBFKN_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.GOBHFJNBFKN.class, io.grasscutter.net.proto.activity.GOBHFJNBFKN.Builder.class);
  }

  public static final int MAX_SCORE_FIELD_NUMBER = 8;
  private int maxScore_;
  /**
   * <code>uint32 max_score = 8;</code>
   * @return The maxScore.
   */
  @java.lang.Override
  public int getMaxScore() {
    return maxScore_;
  }

  public static final int IS_FINISH_FIELD_NUMBER = 3;
  private boolean isFinish_;
  /**
   * <code>bool is_finish = 3;</code>
   * @return The isFinish.
   */
  @java.lang.Override
  public boolean getIsFinish() {
    return isFinish_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 6;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 6;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int OGDCENFLHJN_FIELD_NUMBER = 2;
  private int oGDCENFLHJN_;
  /**
   * <code>uint32 OGDCENFLHJN = 2;</code>
   * @return The oGDCENFLHJN.
   */
  @java.lang.Override
  public int getOGDCENFLHJN() {
    return oGDCENFLHJN_;
  }

  public static final int LEVEL_ID_FIELD_NUMBER = 10;
  private int levelId_;
  /**
   * <code>uint32 level_id = 10;</code>
   * @return The levelId.
   */
  @java.lang.Override
  public int getLevelId() {
    return levelId_;
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
    if (oGDCENFLHJN_ != 0) {
      output.writeUInt32(2, oGDCENFLHJN_);
    }
    if (isFinish_ != false) {
      output.writeBool(3, isFinish_);
    }
    if (isOpen_ != false) {
      output.writeBool(6, isOpen_);
    }
    if (maxScore_ != 0) {
      output.writeUInt32(8, maxScore_);
    }
    if (levelId_ != 0) {
      output.writeUInt32(10, levelId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oGDCENFLHJN_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, oGDCENFLHJN_);
    }
    if (isFinish_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, isFinish_);
    }
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isOpen_);
    }
    if (maxScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(8, maxScore_);
    }
    if (levelId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, levelId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.GOBHFJNBFKN)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.GOBHFJNBFKN other = (io.grasscutter.net.proto.activity.GOBHFJNBFKN) obj;

    if (getMaxScore()
        != other.getMaxScore()) return false;
    if (getIsFinish()
        != other.getIsFinish()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getOGDCENFLHJN()
        != other.getOGDCENFLHJN()) return false;
    if (getLevelId()
        != other.getLevelId()) return false;
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
    hash = (37 * hash) + MAX_SCORE_FIELD_NUMBER;
    hash = (53 * hash) + getMaxScore();
    hash = (37 * hash) + IS_FINISH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsFinish());
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + OGDCENFLHJN_FIELD_NUMBER;
    hash = (53 * hash) + getOGDCENFLHJN();
    hash = (37 * hash) + LEVEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getLevelId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.GOBHFJNBFKN prototype) {
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
   * Protobuf type {@code GOBHFJNBFKN}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GOBHFJNBFKN)
      io.grasscutter.net.proto.activity.GOBHFJNBFKNOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GOBHFJNBFKN_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GOBHFJNBFKN_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.GOBHFJNBFKN.class, io.grasscutter.net.proto.activity.GOBHFJNBFKN.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.GOBHFJNBFKN.newBuilder()
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
      maxScore_ = 0;

      isFinish_ = false;

      isOpen_ = false;

      oGDCENFLHJN_ = 0;

      levelId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_GOBHFJNBFKN_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GOBHFJNBFKN getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.GOBHFJNBFKN.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GOBHFJNBFKN build() {
      io.grasscutter.net.proto.activity.GOBHFJNBFKN result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.GOBHFJNBFKN buildPartial() {
      io.grasscutter.net.proto.activity.GOBHFJNBFKN result = new io.grasscutter.net.proto.activity.GOBHFJNBFKN(this);
      result.maxScore_ = maxScore_;
      result.isFinish_ = isFinish_;
      result.isOpen_ = isOpen_;
      result.oGDCENFLHJN_ = oGDCENFLHJN_;
      result.levelId_ = levelId_;
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
      if (other instanceof io.grasscutter.net.proto.activity.GOBHFJNBFKN) {
        return mergeFrom((io.grasscutter.net.proto.activity.GOBHFJNBFKN)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.GOBHFJNBFKN other) {
      if (other == io.grasscutter.net.proto.activity.GOBHFJNBFKN.getDefaultInstance()) return this;
      if (other.getMaxScore() != 0) {
        setMaxScore(other.getMaxScore());
      }
      if (other.getIsFinish() != false) {
        setIsFinish(other.getIsFinish());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getOGDCENFLHJN() != 0) {
        setOGDCENFLHJN(other.getOGDCENFLHJN());
      }
      if (other.getLevelId() != 0) {
        setLevelId(other.getLevelId());
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
      io.grasscutter.net.proto.activity.GOBHFJNBFKN parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.GOBHFJNBFKN) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int maxScore_ ;
    /**
     * <code>uint32 max_score = 8;</code>
     * @return The maxScore.
     */
    @java.lang.Override
    public int getMaxScore() {
      return maxScore_;
    }
    /**
     * <code>uint32 max_score = 8;</code>
     * @param value The maxScore to set.
     * @return This builder for chaining.
     */
    public Builder setMaxScore(int value) {
      
      maxScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 max_score = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxScore() {
      
      maxScore_ = 0;
      onChanged();
      return this;
    }

    private boolean isFinish_ ;
    /**
     * <code>bool is_finish = 3;</code>
     * @return The isFinish.
     */
    @java.lang.Override
    public boolean getIsFinish() {
      return isFinish_;
    }
    /**
     * <code>bool is_finish = 3;</code>
     * @param value The isFinish to set.
     * @return This builder for chaining.
     */
    public Builder setIsFinish(boolean value) {
      
      isFinish_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_finish = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsFinish() {
      
      isFinish_ = false;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 6;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 6;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private int oGDCENFLHJN_ ;
    /**
     * <code>uint32 OGDCENFLHJN = 2;</code>
     * @return The oGDCENFLHJN.
     */
    @java.lang.Override
    public int getOGDCENFLHJN() {
      return oGDCENFLHJN_;
    }
    /**
     * <code>uint32 OGDCENFLHJN = 2;</code>
     * @param value The oGDCENFLHJN to set.
     * @return This builder for chaining.
     */
    public Builder setOGDCENFLHJN(int value) {
      
      oGDCENFLHJN_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 OGDCENFLHJN = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearOGDCENFLHJN() {
      
      oGDCENFLHJN_ = 0;
      onChanged();
      return this;
    }

    private int levelId_ ;
    /**
     * <code>uint32 level_id = 10;</code>
     * @return The levelId.
     */
    @java.lang.Override
    public int getLevelId() {
      return levelId_;
    }
    /**
     * <code>uint32 level_id = 10;</code>
     * @param value The levelId to set.
     * @return This builder for chaining.
     */
    public Builder setLevelId(int value) {
      
      levelId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 level_id = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearLevelId() {
      
      levelId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GOBHFJNBFKN)
  }

  // @@protoc_insertion_point(class_scope:GOBHFJNBFKN)
  private static final io.grasscutter.net.proto.activity.GOBHFJNBFKN DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.GOBHFJNBFKN();
  }

  public static io.grasscutter.net.proto.activity.GOBHFJNBFKN getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GOBHFJNBFKN>
      PARSER = new com.google.protobuf.AbstractParser<GOBHFJNBFKN>() {
    @java.lang.Override
    public GOBHFJNBFKN parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GOBHFJNBFKN(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GOBHFJNBFKN> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GOBHFJNBFKN> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.GOBHFJNBFKN getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
