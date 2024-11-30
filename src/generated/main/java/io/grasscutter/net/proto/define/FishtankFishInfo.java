// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code FishtankFishInfo}
 */
public final class FishtankFishInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FishtankFishInfo)
    FishtankFishInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FishtankFishInfo.newBuilder() to construct.
  private FishtankFishInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FishtankFishInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FishtankFishInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FishtankFishInfo(
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
          case 13: {

            fishDistanceFromWater_ = input.readFloat();
            break;
          }
          case 21: {

            fishScale_ = input.readFloat();
            break;
          }
          case 29: {

            initialRotationY_ = input.readFloat();
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
    return io.grasscutter.net.proto.define.Define.internal_static_FishtankFishInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_FishtankFishInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.FishtankFishInfo.class, io.grasscutter.net.proto.define.FishtankFishInfo.Builder.class);
  }

  public static final int FISH_DISTANCE_FROM_WATER_FIELD_NUMBER = 1;
  private float fishDistanceFromWater_;
  /**
   * <code>float fish_distance_from_water = 1;</code>
   * @return The fishDistanceFromWater.
   */
  @java.lang.Override
  public float getFishDistanceFromWater() {
    return fishDistanceFromWater_;
  }

  public static final int FISH_SCALE_FIELD_NUMBER = 2;
  private float fishScale_;
  /**
   * <code>float fish_scale = 2;</code>
   * @return The fishScale.
   */
  @java.lang.Override
  public float getFishScale() {
    return fishScale_;
  }

  public static final int INITIAL_ROTATION_Y_FIELD_NUMBER = 3;
  private float initialRotationY_;
  /**
   * <code>float initial_rotation_y = 3;</code>
   * @return The initialRotationY.
   */
  @java.lang.Override
  public float getInitialRotationY() {
    return initialRotationY_;
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
    if (fishDistanceFromWater_ != 0F) {
      output.writeFloat(1, fishDistanceFromWater_);
    }
    if (fishScale_ != 0F) {
      output.writeFloat(2, fishScale_);
    }
    if (initialRotationY_ != 0F) {
      output.writeFloat(3, initialRotationY_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fishDistanceFromWater_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(1, fishDistanceFromWater_);
    }
    if (fishScale_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(2, fishScale_);
    }
    if (initialRotationY_ != 0F) {
      size += com.google.protobuf.CodedOutputStream
        .computeFloatSize(3, initialRotationY_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.FishtankFishInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.FishtankFishInfo other = (io.grasscutter.net.proto.define.FishtankFishInfo) obj;

    if (java.lang.Float.floatToIntBits(getFishDistanceFromWater())
        != java.lang.Float.floatToIntBits(
            other.getFishDistanceFromWater())) return false;
    if (java.lang.Float.floatToIntBits(getFishScale())
        != java.lang.Float.floatToIntBits(
            other.getFishScale())) return false;
    if (java.lang.Float.floatToIntBits(getInitialRotationY())
        != java.lang.Float.floatToIntBits(
            other.getInitialRotationY())) return false;
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
    hash = (37 * hash) + FISH_DISTANCE_FROM_WATER_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFishDistanceFromWater());
    hash = (37 * hash) + FISH_SCALE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getFishScale());
    hash = (37 * hash) + INITIAL_ROTATION_Y_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(
        getInitialRotationY());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.FishtankFishInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.FishtankFishInfo prototype) {
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
   * Protobuf type {@code FishtankFishInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FishtankFishInfo)
      io.grasscutter.net.proto.define.FishtankFishInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_FishtankFishInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_FishtankFishInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.FishtankFishInfo.class, io.grasscutter.net.proto.define.FishtankFishInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.FishtankFishInfo.newBuilder()
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
      fishDistanceFromWater_ = 0F;

      fishScale_ = 0F;

      initialRotationY_ = 0F;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_FishtankFishInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.FishtankFishInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.FishtankFishInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.FishtankFishInfo build() {
      io.grasscutter.net.proto.define.FishtankFishInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.FishtankFishInfo buildPartial() {
      io.grasscutter.net.proto.define.FishtankFishInfo result = new io.grasscutter.net.proto.define.FishtankFishInfo(this);
      result.fishDistanceFromWater_ = fishDistanceFromWater_;
      result.fishScale_ = fishScale_;
      result.initialRotationY_ = initialRotationY_;
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
      if (other instanceof io.grasscutter.net.proto.define.FishtankFishInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.FishtankFishInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.FishtankFishInfo other) {
      if (other == io.grasscutter.net.proto.define.FishtankFishInfo.getDefaultInstance()) return this;
      if (other.getFishDistanceFromWater() != 0F) {
        setFishDistanceFromWater(other.getFishDistanceFromWater());
      }
      if (other.getFishScale() != 0F) {
        setFishScale(other.getFishScale());
      }
      if (other.getInitialRotationY() != 0F) {
        setInitialRotationY(other.getInitialRotationY());
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
      io.grasscutter.net.proto.define.FishtankFishInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.FishtankFishInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private float fishDistanceFromWater_ ;
    /**
     * <code>float fish_distance_from_water = 1;</code>
     * @return The fishDistanceFromWater.
     */
    @java.lang.Override
    public float getFishDistanceFromWater() {
      return fishDistanceFromWater_;
    }
    /**
     * <code>float fish_distance_from_water = 1;</code>
     * @param value The fishDistanceFromWater to set.
     * @return This builder for chaining.
     */
    public Builder setFishDistanceFromWater(float value) {
      
      fishDistanceFromWater_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float fish_distance_from_water = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFishDistanceFromWater() {
      
      fishDistanceFromWater_ = 0F;
      onChanged();
      return this;
    }

    private float fishScale_ ;
    /**
     * <code>float fish_scale = 2;</code>
     * @return The fishScale.
     */
    @java.lang.Override
    public float getFishScale() {
      return fishScale_;
    }
    /**
     * <code>float fish_scale = 2;</code>
     * @param value The fishScale to set.
     * @return This builder for chaining.
     */
    public Builder setFishScale(float value) {
      
      fishScale_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float fish_scale = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFishScale() {
      
      fishScale_ = 0F;
      onChanged();
      return this;
    }

    private float initialRotationY_ ;
    /**
     * <code>float initial_rotation_y = 3;</code>
     * @return The initialRotationY.
     */
    @java.lang.Override
    public float getInitialRotationY() {
      return initialRotationY_;
    }
    /**
     * <code>float initial_rotation_y = 3;</code>
     * @param value The initialRotationY to set.
     * @return This builder for chaining.
     */
    public Builder setInitialRotationY(float value) {
      
      initialRotationY_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>float initial_rotation_y = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearInitialRotationY() {
      
      initialRotationY_ = 0F;
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


    // @@protoc_insertion_point(builder_scope:FishtankFishInfo)
  }

  // @@protoc_insertion_point(class_scope:FishtankFishInfo)
  private static final io.grasscutter.net.proto.define.FishtankFishInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.FishtankFishInfo();
  }

  public static io.grasscutter.net.proto.define.FishtankFishInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FishtankFishInfo>
      PARSER = new com.google.protobuf.AbstractParser<FishtankFishInfo>() {
    @java.lang.Override
    public FishtankFishInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FishtankFishInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FishtankFishInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FishtankFishInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.FishtankFishInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
