// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code BreakoutBrickInfo}
 */
public final class BreakoutBrickInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BreakoutBrickInfo)
    BreakoutBrickInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BreakoutBrickInfo.newBuilder() to construct.
  private BreakoutBrickInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BreakoutBrickInfo() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BreakoutBrickInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BreakoutBrickInfo(
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

            hp_ = input.readUInt32();
            break;
          }
          case 16: {

            elementType_ = input.readUInt32();
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
    return io.grasscutter.net.proto.define.Define.internal_static_BreakoutBrickInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_BreakoutBrickInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.BreakoutBrickInfo.class, io.grasscutter.net.proto.define.BreakoutBrickInfo.Builder.class);
  }

  public static final int HP_FIELD_NUMBER = 1;
  private int hp_;
  /**
   * <code>uint32 hp = 1;</code>
   * @return The hp.
   */
  @java.lang.Override
  public int getHp() {
    return hp_;
  }

  public static final int ELEMENT_TYPE_FIELD_NUMBER = 2;
  private int elementType_;
  /**
   * <code>uint32 element_type = 2;</code>
   * @return The elementType.
   */
  @java.lang.Override
  public int getElementType() {
    return elementType_;
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
    if (hp_ != 0) {
      output.writeUInt32(1, hp_);
    }
    if (elementType_ != 0) {
      output.writeUInt32(2, elementType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (hp_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, hp_);
    }
    if (elementType_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, elementType_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.BreakoutBrickInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.BreakoutBrickInfo other = (io.grasscutter.net.proto.define.BreakoutBrickInfo) obj;

    if (getHp()
        != other.getHp()) return false;
    if (getElementType()
        != other.getElementType()) return false;
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
    hash = (37 * hash) + HP_FIELD_NUMBER;
    hash = (53 * hash) + getHp();
    hash = (37 * hash) + ELEMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getElementType();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BreakoutBrickInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.BreakoutBrickInfo prototype) {
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
   * Protobuf type {@code BreakoutBrickInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BreakoutBrickInfo)
      io.grasscutter.net.proto.define.BreakoutBrickInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_BreakoutBrickInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_BreakoutBrickInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.BreakoutBrickInfo.class, io.grasscutter.net.proto.define.BreakoutBrickInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.BreakoutBrickInfo.newBuilder()
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
      hp_ = 0;

      elementType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_BreakoutBrickInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BreakoutBrickInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.BreakoutBrickInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BreakoutBrickInfo build() {
      io.grasscutter.net.proto.define.BreakoutBrickInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BreakoutBrickInfo buildPartial() {
      io.grasscutter.net.proto.define.BreakoutBrickInfo result = new io.grasscutter.net.proto.define.BreakoutBrickInfo(this);
      result.hp_ = hp_;
      result.elementType_ = elementType_;
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
      if (other instanceof io.grasscutter.net.proto.define.BreakoutBrickInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.BreakoutBrickInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.BreakoutBrickInfo other) {
      if (other == io.grasscutter.net.proto.define.BreakoutBrickInfo.getDefaultInstance()) return this;
      if (other.getHp() != 0) {
        setHp(other.getHp());
      }
      if (other.getElementType() != 0) {
        setElementType(other.getElementType());
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
      io.grasscutter.net.proto.define.BreakoutBrickInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.BreakoutBrickInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int hp_ ;
    /**
     * <code>uint32 hp = 1;</code>
     * @return The hp.
     */
    @java.lang.Override
    public int getHp() {
      return hp_;
    }
    /**
     * <code>uint32 hp = 1;</code>
     * @param value The hp to set.
     * @return This builder for chaining.
     */
    public Builder setHp(int value) {
      
      hp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 hp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHp() {
      
      hp_ = 0;
      onChanged();
      return this;
    }

    private int elementType_ ;
    /**
     * <code>uint32 element_type = 2;</code>
     * @return The elementType.
     */
    @java.lang.Override
    public int getElementType() {
      return elementType_;
    }
    /**
     * <code>uint32 element_type = 2;</code>
     * @param value The elementType to set.
     * @return This builder for chaining.
     */
    public Builder setElementType(int value) {
      
      elementType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 element_type = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearElementType() {
      
      elementType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:BreakoutBrickInfo)
  }

  // @@protoc_insertion_point(class_scope:BreakoutBrickInfo)
  private static final io.grasscutter.net.proto.define.BreakoutBrickInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.BreakoutBrickInfo();
  }

  public static io.grasscutter.net.proto.define.BreakoutBrickInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BreakoutBrickInfo>
      PARSER = new com.google.protobuf.AbstractParser<BreakoutBrickInfo>() {
    @java.lang.Override
    public BreakoutBrickInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BreakoutBrickInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BreakoutBrickInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BreakoutBrickInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.BreakoutBrickInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
