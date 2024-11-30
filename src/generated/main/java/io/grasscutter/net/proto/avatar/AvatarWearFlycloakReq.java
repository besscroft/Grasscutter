// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: avatar.proto

package io.grasscutter.net.proto.avatar;

/**
 * <pre>
 * CmdId: 20729
 * </pre>
 *
 * Protobuf type {@code AvatarWearFlycloakReq}
 */
public final class AvatarWearFlycloakReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:AvatarWearFlycloakReq)
    AvatarWearFlycloakReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AvatarWearFlycloakReq.newBuilder() to construct.
  private AvatarWearFlycloakReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AvatarWearFlycloakReq() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AvatarWearFlycloakReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AvatarWearFlycloakReq(
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
          case 80: {

            flycloakId_ = input.readUInt32();
            break;
          }
          case 96: {

            avatarGuid_ = input.readUInt64();
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
    return io.grasscutter.net.proto.avatar.Avatar.internal_static_AvatarWearFlycloakReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.avatar.Avatar.internal_static_AvatarWearFlycloakReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.class, io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.Builder.class);
  }

  public static final int FLYCLOAK_ID_FIELD_NUMBER = 10;
  private int flycloakId_;
  /**
   * <code>uint32 flycloak_id = 10;</code>
   * @return The flycloakId.
   */
  @java.lang.Override
  public int getFlycloakId() {
    return flycloakId_;
  }

  public static final int AVATAR_GUID_FIELD_NUMBER = 12;
  private long avatarGuid_;
  /**
   * <code>uint64 avatar_guid = 12;</code>
   * @return The avatarGuid.
   */
  @java.lang.Override
  public long getAvatarGuid() {
    return avatarGuid_;
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
    if (flycloakId_ != 0) {
      output.writeUInt32(10, flycloakId_);
    }
    if (avatarGuid_ != 0L) {
      output.writeUInt64(12, avatarGuid_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (flycloakId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, flycloakId_);
    }
    if (avatarGuid_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(12, avatarGuid_);
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
    if (!(obj instanceof io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq other = (io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq) obj;

    if (getFlycloakId()
        != other.getFlycloakId()) return false;
    if (getAvatarGuid()
        != other.getAvatarGuid()) return false;
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
    hash = (37 * hash) + FLYCLOAK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFlycloakId();
    hash = (37 * hash) + AVATAR_GUID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAvatarGuid());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq prototype) {
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
   * CmdId: 20729
   * </pre>
   *
   * Protobuf type {@code AvatarWearFlycloakReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:AvatarWearFlycloakReq)
      io.grasscutter.net.proto.avatar.AvatarWearFlycloakReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.avatar.Avatar.internal_static_AvatarWearFlycloakReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.avatar.Avatar.internal_static_AvatarWearFlycloakReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.class, io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.newBuilder()
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
      flycloakId_ = 0;

      avatarGuid_ = 0L;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.avatar.Avatar.internal_static_AvatarWearFlycloakReq_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq getDefaultInstanceForType() {
      return io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq build() {
      io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq buildPartial() {
      io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq result = new io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq(this);
      result.flycloakId_ = flycloakId_;
      result.avatarGuid_ = avatarGuid_;
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
      if (other instanceof io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq) {
        return mergeFrom((io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq other) {
      if (other == io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq.getDefaultInstance()) return this;
      if (other.getFlycloakId() != 0) {
        setFlycloakId(other.getFlycloakId());
      }
      if (other.getAvatarGuid() != 0L) {
        setAvatarGuid(other.getAvatarGuid());
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
      io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int flycloakId_ ;
    /**
     * <code>uint32 flycloak_id = 10;</code>
     * @return The flycloakId.
     */
    @java.lang.Override
    public int getFlycloakId() {
      return flycloakId_;
    }
    /**
     * <code>uint32 flycloak_id = 10;</code>
     * @param value The flycloakId to set.
     * @return This builder for chaining.
     */
    public Builder setFlycloakId(int value) {
      
      flycloakId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 flycloak_id = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearFlycloakId() {
      
      flycloakId_ = 0;
      onChanged();
      return this;
    }

    private long avatarGuid_ ;
    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @return The avatarGuid.
     */
    @java.lang.Override
    public long getAvatarGuid() {
      return avatarGuid_;
    }
    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @param value The avatarGuid to set.
     * @return This builder for chaining.
     */
    public Builder setAvatarGuid(long value) {
      
      avatarGuid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 avatar_guid = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearAvatarGuid() {
      
      avatarGuid_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:AvatarWearFlycloakReq)
  }

  // @@protoc_insertion_point(class_scope:AvatarWearFlycloakReq)
  private static final io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq();
  }

  public static io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AvatarWearFlycloakReq>
      PARSER = new com.google.protobuf.AbstractParser<AvatarWearFlycloakReq>() {
    @java.lang.Override
    public AvatarWearFlycloakReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AvatarWearFlycloakReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AvatarWearFlycloakReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AvatarWearFlycloakReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.avatar.AvatarWearFlycloakReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
