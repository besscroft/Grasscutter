// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

/**
 * <pre>
 * CmdId: 23191
 * </pre>
 *
 * Protobuf type {@code PostEnterSceneReq}
 */
public final class PostEnterSceneReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:PostEnterSceneReq)
    PostEnterSceneReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use PostEnterSceneReq.newBuilder() to construct.
  private PostEnterSceneReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private PostEnterSceneReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new PostEnterSceneReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private PostEnterSceneReq(
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
          case 33: {

            totalTickTime_ = input.readDouble();
            break;
          }
          case 56: {

            enterSceneToken_ = input.readUInt32();
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
    return io.grasscutter.net.proto.scene.Scene.internal_static_PostEnterSceneReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.scene.Scene.internal_static_PostEnterSceneReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.scene.PostEnterSceneReq.class, io.grasscutter.net.proto.scene.PostEnterSceneReq.Builder.class);
  }

  public static final int ENTER_SCENE_TOKEN_FIELD_NUMBER = 7;
  private int enterSceneToken_;
  /**
   * <code>uint32 enter_scene_token = 7;</code>
   * @return The enterSceneToken.
   */
  @java.lang.Override
  public int getEnterSceneToken() {
    return enterSceneToken_;
  }

  public static final int TOTAL_TICK_TIME_FIELD_NUMBER = 4;
  private double totalTickTime_;
  /**
   * <code>double total_tick_time = 4;</code>
   * @return The totalTickTime.
   */
  @java.lang.Override
  public double getTotalTickTime() {
    return totalTickTime_;
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
    if (totalTickTime_ != 0D) {
      output.writeDouble(4, totalTickTime_);
    }
    if (enterSceneToken_ != 0) {
      output.writeUInt32(7, enterSceneToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (totalTickTime_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, totalTickTime_);
    }
    if (enterSceneToken_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, enterSceneToken_);
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
    if (!(obj instanceof io.grasscutter.net.proto.scene.PostEnterSceneReq)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.scene.PostEnterSceneReq other = (io.grasscutter.net.proto.scene.PostEnterSceneReq) obj;

    if (getEnterSceneToken()
        != other.getEnterSceneToken()) return false;
    if (java.lang.Double.doubleToLongBits(getTotalTickTime())
        != java.lang.Double.doubleToLongBits(
            other.getTotalTickTime())) return false;
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
    hash = (37 * hash) + ENTER_SCENE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getEnterSceneToken();
    hash = (37 * hash) + TOTAL_TICK_TIME_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getTotalTickTime()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.scene.PostEnterSceneReq parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.scene.PostEnterSceneReq prototype) {
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
   * <pre>
   * CmdId: 23191
   * </pre>
   *
   * Protobuf type {@code PostEnterSceneReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:PostEnterSceneReq)
      io.grasscutter.net.proto.scene.PostEnterSceneReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.scene.Scene.internal_static_PostEnterSceneReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.scene.Scene.internal_static_PostEnterSceneReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.scene.PostEnterSceneReq.class, io.grasscutter.net.proto.scene.PostEnterSceneReq.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.scene.PostEnterSceneReq.newBuilder()
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
      enterSceneToken_ = 0;

      totalTickTime_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.scene.Scene.internal_static_PostEnterSceneReq_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.scene.PostEnterSceneReq getDefaultInstanceForType() {
      return io.grasscutter.net.proto.scene.PostEnterSceneReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.scene.PostEnterSceneReq build() {
      io.grasscutter.net.proto.scene.PostEnterSceneReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.scene.PostEnterSceneReq buildPartial() {
      io.grasscutter.net.proto.scene.PostEnterSceneReq result = new io.grasscutter.net.proto.scene.PostEnterSceneReq(this);
      result.enterSceneToken_ = enterSceneToken_;
      result.totalTickTime_ = totalTickTime_;
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
      if (other instanceof io.grasscutter.net.proto.scene.PostEnterSceneReq) {
        return mergeFrom((io.grasscutter.net.proto.scene.PostEnterSceneReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.scene.PostEnterSceneReq other) {
      if (other == io.grasscutter.net.proto.scene.PostEnterSceneReq.getDefaultInstance()) return this;
      if (other.getEnterSceneToken() != 0) {
        setEnterSceneToken(other.getEnterSceneToken());
      }
      if (other.getTotalTickTime() != 0D) {
        setTotalTickTime(other.getTotalTickTime());
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
      io.grasscutter.net.proto.scene.PostEnterSceneReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.scene.PostEnterSceneReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int enterSceneToken_ ;
    /**
     * <code>uint32 enter_scene_token = 7;</code>
     * @return The enterSceneToken.
     */
    @java.lang.Override
    public int getEnterSceneToken() {
      return enterSceneToken_;
    }
    /**
     * <code>uint32 enter_scene_token = 7;</code>
     * @param value The enterSceneToken to set.
     * @return This builder for chaining.
     */
    public Builder setEnterSceneToken(int value) {
      
      enterSceneToken_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 enter_scene_token = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnterSceneToken() {
      
      enterSceneToken_ = 0;
      onChanged();
      return this;
    }

    private double totalTickTime_ ;
    /**
     * <code>double total_tick_time = 4;</code>
     * @return The totalTickTime.
     */
    @java.lang.Override
    public double getTotalTickTime() {
      return totalTickTime_;
    }
    /**
     * <code>double total_tick_time = 4;</code>
     * @param value The totalTickTime to set.
     * @return This builder for chaining.
     */
    public Builder setTotalTickTime(double value) {
      
      totalTickTime_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double total_tick_time = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalTickTime() {
      
      totalTickTime_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:PostEnterSceneReq)
  }

  // @@protoc_insertion_point(class_scope:PostEnterSceneReq)
  private static final io.grasscutter.net.proto.scene.PostEnterSceneReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.scene.PostEnterSceneReq();
  }

  public static io.grasscutter.net.proto.scene.PostEnterSceneReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PostEnterSceneReq>
      PARSER = new com.google.protobuf.AbstractParser<PostEnterSceneReq>() {
    @java.lang.Override
    public PostEnterSceneReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new PostEnterSceneReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<PostEnterSceneReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PostEnterSceneReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.scene.PostEnterSceneReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
