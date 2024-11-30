// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code DKIBLFIGLAP}
 */
public final class DKIBLFIGLAP extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:DKIBLFIGLAP)
    DKIBLFIGLAPOrBuilder {
private static final long serialVersionUID = 0L;
  // Use DKIBLFIGLAP.newBuilder() to construct.
  private DKIBLFIGLAP(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private DKIBLFIGLAP() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new DKIBLFIGLAP();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private DKIBLFIGLAP(
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

            startTime_ = input.readUInt64();
            break;
          }
          case 16: {

            eBHOKCEGLDB_ = input.readUInt32();
            break;
          }
          case 24: {

            arcId_ = input.readUInt32();
            break;
          }
          case 37: {

            eOAECODKEAG_ = input.readFloat();
            break;
          }
          case 45: {

            speed_ = input.readFloat();
            break;
          }
          case 48: {

            isStarted_ = input.readBool();
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
    return io.grasscutter.net.proto.define.Define.internal_static_DKIBLFIGLAP_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_DKIBLFIGLAP_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.DKIBLFIGLAP.class, io.grasscutter.net.proto.define.DKIBLFIGLAP.Builder.class);
  }

  public static final int EBHOKCEGLDB_FIELD_NUMBER = 2;
  private int eBHOKCEGLDB_;
  /**
   * <code>uint32 EBHOKCEGLDB = 2;</code>
   * @return The eBHOKCEGLDB.
   */
  @java.lang.Override
  public int getEBHOKCEGLDB() {
    return eBHOKCEGLDB_;
  }

  public static final int ARC_ID_FIELD_NUMBER = 3;
  private int arcId_;
  /**
   * <code>uint32 arc_id = 3;</code>
   * @return The arcId.
   */
  @java.lang.Override
  public int getArcId() {
    return arcId_;
  }

  public static final int START_TIME_FIELD_NUMBER = 1;
  private long startTime_;
  /**
   * <code>uint64 start_time = 1;</code>
   * @return The startTime.
   */
  @java.lang.Override
  public long getStartTime() {
    return startTime_;
  }

  public static final int SPEED_FIELD_NUMBER = 5;
  private float speed_;
  /**
   * <code>float speed = 5;</code>
   * @return The speed.
   */
  @java.lang.Override
  public float getSpeed() {
    return speed_;
  }

  public static final int EOAECODKEAG_FIELD_NUMBER = 4;
  private float eOAECODKEAG_;
  /**
   * <code>float EOAECODKEAG = 4;</code>
   * @return The eOAECODKEAG.
   */
  @java.lang.Override
  public float getEOAECODKEAG() {
    return eOAECODKEAG_;
  }

  public static final int IS_STARTED_FIELD_NUMBER = 6;
  private boolean isStarted_;
  /**
   * <code>bool is_started = 6;</code>
   * @return The isStarted.
   */
  @java.lang.Override
  public boolean getIsStarted() {
    return isStarted_;
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
    if (startTime_ != 0L) {
      output.writeUInt64(1, startTime_);
    }
    if (eBHOKCEGLDB_ != 0) {
      output.writeUInt32(2, eBHOKCEGLDB_);
    }
    if (arcId_ != 0) {
      output.writeUInt32(3, arcId_);
    }
    if (eOAECODKEAG_ != 0F) {
      output.writeFloat(4, eOAECODKEAG_);
    }
    if (speed_ != 0F) {
      output.writeFloat(5, speed_);
    }
    if (isStarted_ != false) {
      output.writeBool(6, isStarted_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startTime_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, startTime_);
    }
    if (eBHOKCEGLDB_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, eBHOKCEGLDB_);
    }
    if (arcId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, arcId_);
    }
    if (eOAECODKEAG_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(4, eOAECODKEAG_);
    }
    if (speed_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(5, speed_);
    }
    if (isStarted_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isStarted_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.DKIBLFIGLAP)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.DKIBLFIGLAP other = (io.grasscutter.net.proto.define.DKIBLFIGLAP) obj;

    if (getEBHOKCEGLDB()
        != other.getEBHOKCEGLDB()) return false;
    if (getArcId()
        != other.getArcId()) return false;
    if (getStartTime()
        != other.getStartTime()) return false;
    if (java.lang.Float.floatToIntBits(getSpeed())
        != java.lang.Float.floatToIntBits(
            other.getSpeed())) return false;
    if (java.lang.Float.floatToIntBits(getEOAECODKEAG())
        != java.lang.Float.floatToIntBits(
            other.getEOAECODKEAG())) return false;
    if (getIsStarted()
        != other.getIsStarted()) return false;
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
    hash = (37 * hash) + EBHOKCEGLDB_FIELD_NUMBER;
    hash = (53 * hash) + getEBHOKCEGLDB();
    hash = (37 * hash) + ARC_ID_FIELD_NUMBER;
    hash = (53 * hash) + getArcId();
    hash = (37 * hash) + START_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartTime());
    hash = (37 * hash) + SPEED_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getSpeed());
    hash = (37 * hash) + EOAECODKEAG_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getEOAECODKEAG());
    hash = (37 * hash) + IS_STARTED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsStarted());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.DKIBLFIGLAP parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.DKIBLFIGLAP prototype) {
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
   * Protobuf type {@code DKIBLFIGLAP}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:DKIBLFIGLAP)
      io.grasscutter.net.proto.define.DKIBLFIGLAPOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_DKIBLFIGLAP_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_DKIBLFIGLAP_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.DKIBLFIGLAP.class, io.grasscutter.net.proto.define.DKIBLFIGLAP.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.DKIBLFIGLAP.newBuilder()
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
      eBHOKCEGLDB_ = 0;

      arcId_ = 0;

      startTime_ = 0L;

      speed_ = 0F;

      eOAECODKEAG_ = 0F;

      isStarted_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_DKIBLFIGLAP_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.DKIBLFIGLAP getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.DKIBLFIGLAP.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.DKIBLFIGLAP build() {
      io.grasscutter.net.proto.define.DKIBLFIGLAP result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.DKIBLFIGLAP buildPartial() {
      io.grasscutter.net.proto.define.DKIBLFIGLAP result = new io.grasscutter.net.proto.define.DKIBLFIGLAP(this);
      result.eBHOKCEGLDB_ = eBHOKCEGLDB_;
      result.arcId_ = arcId_;
      result.startTime_ = startTime_;
      result.speed_ = speed_;
      result.eOAECODKEAG_ = eOAECODKEAG_;
      result.isStarted_ = isStarted_;
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
      if (other instanceof io.grasscutter.net.proto.define.DKIBLFIGLAP) {
        return mergeFrom((io.grasscutter.net.proto.define.DKIBLFIGLAP)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.DKIBLFIGLAP other) {
      if (other == io.grasscutter.net.proto.define.DKIBLFIGLAP.getDefaultInstance()) return this;
      if (other.getEBHOKCEGLDB() != 0) {
        setEBHOKCEGLDB(other.getEBHOKCEGLDB());
      }
      if (other.getArcId() != 0) {
        setArcId(other.getArcId());
      }
      if (other.getStartTime() != 0L) {
        setStartTime(other.getStartTime());
      }
      if (other.getSpeed() != 0F) {
        setSpeed(other.getSpeed());
      }
      if (other.getEOAECODKEAG() != 0F) {
        setEOAECODKEAG(other.getEOAECODKEAG());
      }
      if (other.getIsStarted() != false) {
        setIsStarted(other.getIsStarted());
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
      io.grasscutter.net.proto.define.DKIBLFIGLAP parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.DKIBLFIGLAP) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int eBHOKCEGLDB_ ;
    /**
     * <code>uint32 EBHOKCEGLDB = 2;</code>
     * @return The eBHOKCEGLDB.
     */
    @java.lang.Override
    public int getEBHOKCEGLDB() {
      return eBHOKCEGLDB_;
    }
    /**
     * <code>uint32 EBHOKCEGLDB = 2;</code>
     * @param value The eBHOKCEGLDB to set.
     * @return This builder for chaining.
     */
    public Builder setEBHOKCEGLDB(int value) {
      
      eBHOKCEGLDB_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 EBHOKCEGLDB = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearEBHOKCEGLDB() {
      
      eBHOKCEGLDB_ = 0;
      onChanged();
      return this;
    }

    private int arcId_ ;
    /**
     * <code>uint32 arc_id = 3;</code>
     * @return The arcId.
     */
    @java.lang.Override
    public int getArcId() {
      return arcId_;
    }
    /**
     * <code>uint32 arc_id = 3;</code>
     * @param value The arcId to set.
     * @return This builder for chaining.
     */
    public Builder setArcId(int value) {
      
      arcId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 arc_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearArcId() {
      
      arcId_ = 0;
      onChanged();
      return this;
    }

    private long startTime_ ;
    /**
     * <code>uint64 start_time = 1;</code>
     * @return The startTime.
     */
    @java.lang.Override
    public long getStartTime() {
      return startTime_;
    }
    /**
     * <code>uint64 start_time = 1;</code>
     * @param value The startTime to set.
     * @return This builder for chaining.
     */
    public Builder setStartTime(long value) {
      
      startTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 start_time = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartTime() {
      
      startTime_ = 0L;
      onChanged();
      return this;
    }

    private float speed_ ;
    /**
     * <code>float speed = 5;</code>
     * @return The speed.
     */
    @java.lang.Override
    public float getSpeed() {
      return speed_;
    }
    /**
     * <code>float speed = 5;</code>
     * @param value The speed to set.
     * @return This builder for chaining.
     */
    public Builder setSpeed(float value) {
      
      speed_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float speed = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearSpeed() {
      
      speed_ = 0F;
      onChanged();
      return this;
    }

    private float eOAECODKEAG_ ;
    /**
     * <code>float EOAECODKEAG = 4;</code>
     * @return The eOAECODKEAG.
     */
    @java.lang.Override
    public float getEOAECODKEAG() {
      return eOAECODKEAG_;
    }
    /**
     * <code>float EOAECODKEAG = 4;</code>
     * @param value The eOAECODKEAG to set.
     * @return This builder for chaining.
     */
    public Builder setEOAECODKEAG(float value) {
      
      eOAECODKEAG_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float EOAECODKEAG = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearEOAECODKEAG() {
      
      eOAECODKEAG_ = 0F;
      onChanged();
      return this;
    }

    private boolean isStarted_ ;
    /**
     * <code>bool is_started = 6;</code>
     * @return The isStarted.
     */
    @java.lang.Override
    public boolean getIsStarted() {
      return isStarted_;
    }
    /**
     * <code>bool is_started = 6;</code>
     * @param value The isStarted to set.
     * @return This builder for chaining.
     */
    public Builder setIsStarted(boolean value) {
      
      isStarted_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_started = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsStarted() {
      
      isStarted_ = false;
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


    // @@protoc_insertion_point(builder_scope:DKIBLFIGLAP)
  }

  // @@protoc_insertion_point(class_scope:DKIBLFIGLAP)
  private static final io.grasscutter.net.proto.define.DKIBLFIGLAP DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.DKIBLFIGLAP();
  }

  public static io.grasscutter.net.proto.define.DKIBLFIGLAP getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DKIBLFIGLAP>
      PARSER = new com.google.protobuf.AbstractParser<DKIBLFIGLAP>() {
    @java.lang.Override
    public DKIBLFIGLAP parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new DKIBLFIGLAP(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<DKIBLFIGLAP> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DKIBLFIGLAP> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.DKIBLFIGLAP getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
