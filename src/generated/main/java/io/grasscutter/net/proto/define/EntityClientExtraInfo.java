// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code EntityClientExtraInfo}
 */
public final class EntityClientExtraInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EntityClientExtraInfo)
    EntityClientExtraInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EntityClientExtraInfo.newBuilder() to construct.
  private EntityClientExtraInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EntityClientExtraInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EntityClientExtraInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EntityClientExtraInfo(
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
          case 10: {
            io.grasscutter.net.proto.define.Vector.Builder subBuilder = null;
            if (skillAnchorPosition_ != null) {
              subBuilder = skillAnchorPosition_.toBuilder();
            }
            skillAnchorPosition_ = input.readMessage(io.grasscutter.net.proto.define.Vector.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(skillAnchorPosition_);
              skillAnchorPosition_ = subBuilder.buildPartial();
            }

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
    return io.grasscutter.net.proto.define.Define.internal_static_EntityClientExtraInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_EntityClientExtraInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.EntityClientExtraInfo.class, io.grasscutter.net.proto.define.EntityClientExtraInfo.Builder.class);
  }

  public static final int SKILL_ANCHOR_POSITION_FIELD_NUMBER = 1;
  private io.grasscutter.net.proto.define.Vector skillAnchorPosition_;
  /**
   * <code>.Vector skill_anchor_position = 1;</code>
   * @return Whether the skillAnchorPosition field is set.
   */
  @java.lang.Override
  public boolean hasSkillAnchorPosition() {
    return skillAnchorPosition_ != null;
  }
  /**
   * <code>.Vector skill_anchor_position = 1;</code>
   * @return The skillAnchorPosition.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Vector getSkillAnchorPosition() {
    return skillAnchorPosition_ == null ? io.grasscutter.net.proto.define.Vector.getDefaultInstance() : skillAnchorPosition_;
  }
  /**
   * <code>.Vector skill_anchor_position = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
    return getSkillAnchorPosition();
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
    if (skillAnchorPosition_ != null) {
      output.writeMessage(1, getSkillAnchorPosition());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (skillAnchorPosition_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getSkillAnchorPosition());
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
    if (!(obj instanceof io.grasscutter.net.proto.define.EntityClientExtraInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.EntityClientExtraInfo other = (io.grasscutter.net.proto.define.EntityClientExtraInfo) obj;

    if (hasSkillAnchorPosition() != other.hasSkillAnchorPosition()) return false;
    if (hasSkillAnchorPosition()) {
      if (!getSkillAnchorPosition()
          .equals(other.getSkillAnchorPosition())) return false;
    }
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
    if (hasSkillAnchorPosition()) {
      hash = (37 * hash) + SKILL_ANCHOR_POSITION_FIELD_NUMBER;
      hash = (53 * hash) + getSkillAnchorPosition().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.EntityClientExtraInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.EntityClientExtraInfo prototype) {
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
   * Protobuf type {@code EntityClientExtraInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EntityClientExtraInfo)
      io.grasscutter.net.proto.define.EntityClientExtraInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_EntityClientExtraInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_EntityClientExtraInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.EntityClientExtraInfo.class, io.grasscutter.net.proto.define.EntityClientExtraInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.EntityClientExtraInfo.newBuilder()
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
      if (skillAnchorPositionBuilder_ == null) {
        skillAnchorPosition_ = null;
      } else {
        skillAnchorPosition_ = null;
        skillAnchorPositionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_EntityClientExtraInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.EntityClientExtraInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.EntityClientExtraInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.EntityClientExtraInfo build() {
      io.grasscutter.net.proto.define.EntityClientExtraInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.EntityClientExtraInfo buildPartial() {
      io.grasscutter.net.proto.define.EntityClientExtraInfo result = new io.grasscutter.net.proto.define.EntityClientExtraInfo(this);
      if (skillAnchorPositionBuilder_ == null) {
        result.skillAnchorPosition_ = skillAnchorPosition_;
      } else {
        result.skillAnchorPosition_ = skillAnchorPositionBuilder_.build();
      }
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
      if (other instanceof io.grasscutter.net.proto.define.EntityClientExtraInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.EntityClientExtraInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.EntityClientExtraInfo other) {
      if (other == io.grasscutter.net.proto.define.EntityClientExtraInfo.getDefaultInstance()) return this;
      if (other.hasSkillAnchorPosition()) {
        mergeSkillAnchorPosition(other.getSkillAnchorPosition());
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
      io.grasscutter.net.proto.define.EntityClientExtraInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.EntityClientExtraInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.define.Vector skillAnchorPosition_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder> skillAnchorPositionBuilder_;
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return Whether the skillAnchorPosition field is set.
     */
    public boolean hasSkillAnchorPosition() {
      return skillAnchorPositionBuilder_ != null || skillAnchorPosition_ != null;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     * @return The skillAnchorPosition.
     */
    public io.grasscutter.net.proto.define.Vector getSkillAnchorPosition() {
      if (skillAnchorPositionBuilder_ == null) {
        return skillAnchorPosition_ == null ? io.grasscutter.net.proto.define.Vector.getDefaultInstance() : skillAnchorPosition_;
      } else {
        return skillAnchorPositionBuilder_.getMessage();
      }
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    public Builder setSkillAnchorPosition(io.grasscutter.net.proto.define.Vector value) {
      if (skillAnchorPositionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        skillAnchorPosition_ = value;
        onChanged();
      } else {
        skillAnchorPositionBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    public Builder setSkillAnchorPosition(
        io.grasscutter.net.proto.define.Vector.Builder builderForValue) {
      if (skillAnchorPositionBuilder_ == null) {
        skillAnchorPosition_ = builderForValue.build();
        onChanged();
      } else {
        skillAnchorPositionBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    public Builder mergeSkillAnchorPosition(io.grasscutter.net.proto.define.Vector value) {
      if (skillAnchorPositionBuilder_ == null) {
        if (skillAnchorPosition_ != null) {
          skillAnchorPosition_ =
            io.grasscutter.net.proto.define.Vector.newBuilder(skillAnchorPosition_).mergeFrom(value).buildPartial();
        } else {
          skillAnchorPosition_ = value;
        }
        onChanged();
      } else {
        skillAnchorPositionBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    public Builder clearSkillAnchorPosition() {
      if (skillAnchorPositionBuilder_ == null) {
        skillAnchorPosition_ = null;
        onChanged();
      } else {
        skillAnchorPosition_ = null;
        skillAnchorPositionBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    public io.grasscutter.net.proto.define.Vector.Builder getSkillAnchorPositionBuilder() {
      
      onChanged();
      return getSkillAnchorPositionFieldBuilder().getBuilder();
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    public io.grasscutter.net.proto.define.VectorOrBuilder getSkillAnchorPositionOrBuilder() {
      if (skillAnchorPositionBuilder_ != null) {
        return skillAnchorPositionBuilder_.getMessageOrBuilder();
      } else {
        return skillAnchorPosition_ == null ?
            io.grasscutter.net.proto.define.Vector.getDefaultInstance() : skillAnchorPosition_;
      }
    }
    /**
     * <code>.Vector skill_anchor_position = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder> 
        getSkillAnchorPositionFieldBuilder() {
      if (skillAnchorPositionBuilder_ == null) {
        skillAnchorPositionBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.Vector, io.grasscutter.net.proto.define.Vector.Builder, io.grasscutter.net.proto.define.VectorOrBuilder>(
                getSkillAnchorPosition(),
                getParentForChildren(),
                isClean());
        skillAnchorPosition_ = null;
      }
      return skillAnchorPositionBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EntityClientExtraInfo)
  }

  // @@protoc_insertion_point(class_scope:EntityClientExtraInfo)
  private static final io.grasscutter.net.proto.define.EntityClientExtraInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.EntityClientExtraInfo();
  }

  public static io.grasscutter.net.proto.define.EntityClientExtraInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EntityClientExtraInfo>
      PARSER = new com.google.protobuf.AbstractParser<EntityClientExtraInfo>() {
    @java.lang.Override
    public EntityClientExtraInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EntityClientExtraInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EntityClientExtraInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EntityClientExtraInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.EntityClientExtraInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
