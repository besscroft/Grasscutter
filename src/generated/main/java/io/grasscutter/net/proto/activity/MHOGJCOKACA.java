// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code MHOGJCOKACA}
 */
public final class MHOGJCOKACA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MHOGJCOKACA)
    MHOGJCOKACAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MHOGJCOKACA.newBuilder() to construct.
  private MHOGJCOKACA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MHOGJCOKACA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MHOGJCOKACA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MHOGJCOKACA(
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

            isOpen_ = input.readBool();
            break;
          }
          case 40: {

            dHIGBAIMMCN_ = input.readBool();
            break;
          }
          case 104: {

            bestScore_ = input.readUInt32();
            break;
          }
          case 120: {

            stageId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.activity.Activity.internal_static_MHOGJCOKACA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_MHOGJCOKACA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.MHOGJCOKACA.class, io.grasscutter.net.proto.activity.MHOGJCOKACA.Builder.class);
  }

  public static final int BEST_SCORE_FIELD_NUMBER = 13;
  private int bestScore_;
  /**
   * <code>uint32 best_score = 13;</code>
   * @return The bestScore.
   */
  @java.lang.Override
  public int getBestScore() {
    return bestScore_;
  }

  public static final int STAGE_ID_FIELD_NUMBER = 15;
  private int stageId_;
  /**
   * <code>uint32 stage_id = 15;</code>
   * @return The stageId.
   */
  @java.lang.Override
  public int getStageId() {
    return stageId_;
  }

  public static final int IS_OPEN_FIELD_NUMBER = 2;
  private boolean isOpen_;
  /**
   * <code>bool is_open = 2;</code>
   * @return The isOpen.
   */
  @java.lang.Override
  public boolean getIsOpen() {
    return isOpen_;
  }

  public static final int DHIGBAIMMCN_FIELD_NUMBER = 5;
  private boolean dHIGBAIMMCN_;
  /**
   * <code>bool DHIGBAIMMCN = 5;</code>
   * @return The dHIGBAIMMCN.
   */
  @java.lang.Override
  public boolean getDHIGBAIMMCN() {
    return dHIGBAIMMCN_;
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
    if (isOpen_ != false) {
      output.writeBool(2, isOpen_);
    }
    if (dHIGBAIMMCN_ != false) {
      output.writeBool(5, dHIGBAIMMCN_);
    }
    if (bestScore_ != 0) {
      output.writeUInt32(13, bestScore_);
    }
    if (stageId_ != 0) {
      output.writeUInt32(15, stageId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isOpen_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(2, isOpen_);
    }
    if (dHIGBAIMMCN_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, dHIGBAIMMCN_);
    }
    if (bestScore_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(13, bestScore_);
    }
    if (stageId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(15, stageId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.MHOGJCOKACA)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.MHOGJCOKACA other = (io.grasscutter.net.proto.activity.MHOGJCOKACA) obj;

    if (getBestScore()
        != other.getBestScore()) return false;
    if (getStageId()
        != other.getStageId()) return false;
    if (getIsOpen()
        != other.getIsOpen()) return false;
    if (getDHIGBAIMMCN()
        != other.getDHIGBAIMMCN()) return false;
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
    hash = (37 * hash) + STAGE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getStageId();
    hash = (37 * hash) + IS_OPEN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsOpen());
    hash = (37 * hash) + DHIGBAIMMCN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getDHIGBAIMMCN());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.MHOGJCOKACA parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.MHOGJCOKACA prototype) {
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
   * Protobuf type {@code MHOGJCOKACA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MHOGJCOKACA)
      io.grasscutter.net.proto.activity.MHOGJCOKACAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MHOGJCOKACA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MHOGJCOKACA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.MHOGJCOKACA.class, io.grasscutter.net.proto.activity.MHOGJCOKACA.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.MHOGJCOKACA.newBuilder()
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

      stageId_ = 0;

      isOpen_ = false;

      dHIGBAIMMCN_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_MHOGJCOKACA_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MHOGJCOKACA getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.MHOGJCOKACA.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MHOGJCOKACA build() {
      io.grasscutter.net.proto.activity.MHOGJCOKACA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.MHOGJCOKACA buildPartial() {
      io.grasscutter.net.proto.activity.MHOGJCOKACA result = new io.grasscutter.net.proto.activity.MHOGJCOKACA(this);
      result.bestScore_ = bestScore_;
      result.stageId_ = stageId_;
      result.isOpen_ = isOpen_;
      result.dHIGBAIMMCN_ = dHIGBAIMMCN_;
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
      if (other instanceof io.grasscutter.net.proto.activity.MHOGJCOKACA) {
        return mergeFrom((io.grasscutter.net.proto.activity.MHOGJCOKACA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.MHOGJCOKACA other) {
      if (other == io.grasscutter.net.proto.activity.MHOGJCOKACA.getDefaultInstance()) return this;
      if (other.getBestScore() != 0) {
        setBestScore(other.getBestScore());
      }
      if (other.getStageId() != 0) {
        setStageId(other.getStageId());
      }
      if (other.getIsOpen() != false) {
        setIsOpen(other.getIsOpen());
      }
      if (other.getDHIGBAIMMCN() != false) {
        setDHIGBAIMMCN(other.getDHIGBAIMMCN());
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
      io.grasscutter.net.proto.activity.MHOGJCOKACA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.MHOGJCOKACA) e.getUnfinishedMessage();
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
     * <code>uint32 best_score = 13;</code>
     * @return The bestScore.
     */
    @java.lang.Override
    public int getBestScore() {
      return bestScore_;
    }
    /**
     * <code>uint32 best_score = 13;</code>
     * @param value The bestScore to set.
     * @return This builder for chaining.
     */
    public Builder setBestScore(int value) {
      
      bestScore_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 best_score = 13;</code>
     * @return This builder for chaining.
     */
    public Builder clearBestScore() {
      
      bestScore_ = 0;
      onChanged();
      return this;
    }

    private int stageId_ ;
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return The stageId.
     */
    @java.lang.Override
    public int getStageId() {
      return stageId_;
    }
    /**
     * <code>uint32 stage_id = 15;</code>
     * @param value The stageId to set.
     * @return This builder for chaining.
     */
    public Builder setStageId(int value) {
      
      stageId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 stage_id = 15;</code>
     * @return This builder for chaining.
     */
    public Builder clearStageId() {
      
      stageId_ = 0;
      onChanged();
      return this;
    }

    private boolean isOpen_ ;
    /**
     * <code>bool is_open = 2;</code>
     * @return The isOpen.
     */
    @java.lang.Override
    public boolean getIsOpen() {
      return isOpen_;
    }
    /**
     * <code>bool is_open = 2;</code>
     * @param value The isOpen to set.
     * @return This builder for chaining.
     */
    public Builder setIsOpen(boolean value) {
      
      isOpen_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_open = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsOpen() {
      
      isOpen_ = false;
      onChanged();
      return this;
    }

    private boolean dHIGBAIMMCN_ ;
    /**
     * <code>bool DHIGBAIMMCN = 5;</code>
     * @return The dHIGBAIMMCN.
     */
    @java.lang.Override
    public boolean getDHIGBAIMMCN() {
      return dHIGBAIMMCN_;
    }
    /**
     * <code>bool DHIGBAIMMCN = 5;</code>
     * @param value The dHIGBAIMMCN to set.
     * @return This builder for chaining.
     */
    public Builder setDHIGBAIMMCN(boolean value) {
      
      dHIGBAIMMCN_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool DHIGBAIMMCN = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearDHIGBAIMMCN() {
      
      dHIGBAIMMCN_ = false;
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


    // @@protoc_insertion_point(builder_scope:MHOGJCOKACA)
  }

  // @@protoc_insertion_point(class_scope:MHOGJCOKACA)
  private static final io.grasscutter.net.proto.activity.MHOGJCOKACA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.MHOGJCOKACA();
  }

  public static io.grasscutter.net.proto.activity.MHOGJCOKACA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MHOGJCOKACA>
      PARSER = new com.google.protobuf.AbstractParser<MHOGJCOKACA>() {
    @java.lang.Override
    public MHOGJCOKACA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MHOGJCOKACA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MHOGJCOKACA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MHOGJCOKACA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.MHOGJCOKACA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
