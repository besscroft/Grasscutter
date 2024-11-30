// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code CreateGadgetInfo}
 */
public final class CreateGadgetInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CreateGadgetInfo)
    CreateGadgetInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateGadgetInfo.newBuilder() to construct.
  private CreateGadgetInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateGadgetInfo() {
    bornType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateGadgetInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CreateGadgetInfo(
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
            int rawValue = input.readEnum();

            bornType_ = rawValue;
            break;
          }
          case 18: {
            io.grasscutter.net.proto.define.Chest.Builder subBuilder = null;
            if (chest_ != null) {
              subBuilder = chest_.toBuilder();
            }
            chest_ = input.readMessage(io.grasscutter.net.proto.define.Chest.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(chest_);
              chest_ = subBuilder.buildPartial();
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
    return io.grasscutter.net.proto.define.Define.internal_static_CreateGadgetInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_CreateGadgetInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.CreateGadgetInfo.class, io.grasscutter.net.proto.define.CreateGadgetInfo.Builder.class);
  }

  public static final int CHEST_FIELD_NUMBER = 2;
  private io.grasscutter.net.proto.define.Chest chest_;
  /**
   * <code>.Chest chest = 2;</code>
   * @return Whether the chest field is set.
   */
  @java.lang.Override
  public boolean hasChest() {
    return chest_ != null;
  }
  /**
   * <code>.Chest chest = 2;</code>
   * @return The chest.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Chest getChest() {
    return chest_ == null ? io.grasscutter.net.proto.define.Chest.getDefaultInstance() : chest_;
  }
  /**
   * <code>.Chest chest = 2;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.ChestOrBuilder getChestOrBuilder() {
    return getChest();
  }

  public static final int BORN_TYPE_FIELD_NUMBER = 1;
  private int bornType_;
  /**
   * <code>.GadgetBornType born_type = 1;</code>
   * @return The enum numeric value on the wire for bornType.
   */
  @java.lang.Override public int getBornTypeValue() {
    return bornType_;
  }
  /**
   * <code>.GadgetBornType born_type = 1;</code>
   * @return The bornType.
   */
  @java.lang.Override public io.grasscutter.net.proto.define.GadgetBornType getBornType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.define.GadgetBornType result = io.grasscutter.net.proto.define.GadgetBornType.valueOf(bornType_);
    return result == null ? io.grasscutter.net.proto.define.GadgetBornType.UNRECOGNIZED : result;
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
    if (bornType_ != io.grasscutter.net.proto.define.GadgetBornType.GadgetBornType_GADGET_BORN_NONE.getNumber()) {
      output.writeEnum(1, bornType_);
    }
    if (chest_ != null) {
      output.writeMessage(2, getChest());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bornType_ != io.grasscutter.net.proto.define.GadgetBornType.GadgetBornType_GADGET_BORN_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, bornType_);
    }
    if (chest_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getChest());
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
    if (!(obj instanceof io.grasscutter.net.proto.define.CreateGadgetInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.CreateGadgetInfo other = (io.grasscutter.net.proto.define.CreateGadgetInfo) obj;

    if (hasChest() != other.hasChest()) return false;
    if (hasChest()) {
      if (!getChest()
          .equals(other.getChest())) return false;
    }
    if (bornType_ != other.bornType_) return false;
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
    if (hasChest()) {
      hash = (37 * hash) + CHEST_FIELD_NUMBER;
      hash = (53 * hash) + getChest().hashCode();
    }
    hash = (37 * hash) + BORN_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + bornType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.CreateGadgetInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.CreateGadgetInfo prototype) {
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
   * Protobuf type {@code CreateGadgetInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CreateGadgetInfo)
      io.grasscutter.net.proto.define.CreateGadgetInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_CreateGadgetInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_CreateGadgetInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.CreateGadgetInfo.class, io.grasscutter.net.proto.define.CreateGadgetInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.CreateGadgetInfo.newBuilder()
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
      if (chestBuilder_ == null) {
        chest_ = null;
      } else {
        chest_ = null;
        chestBuilder_ = null;
      }
      bornType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_CreateGadgetInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.CreateGadgetInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.CreateGadgetInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.CreateGadgetInfo build() {
      io.grasscutter.net.proto.define.CreateGadgetInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.CreateGadgetInfo buildPartial() {
      io.grasscutter.net.proto.define.CreateGadgetInfo result = new io.grasscutter.net.proto.define.CreateGadgetInfo(this);
      if (chestBuilder_ == null) {
        result.chest_ = chest_;
      } else {
        result.chest_ = chestBuilder_.build();
      }
      result.bornType_ = bornType_;
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
      if (other instanceof io.grasscutter.net.proto.define.CreateGadgetInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.CreateGadgetInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.CreateGadgetInfo other) {
      if (other == io.grasscutter.net.proto.define.CreateGadgetInfo.getDefaultInstance()) return this;
      if (other.hasChest()) {
        mergeChest(other.getChest());
      }
      if (other.bornType_ != 0) {
        setBornTypeValue(other.getBornTypeValue());
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
      io.grasscutter.net.proto.define.CreateGadgetInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.CreateGadgetInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.define.Chest chest_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Chest, io.grasscutter.net.proto.define.Chest.Builder, io.grasscutter.net.proto.define.ChestOrBuilder> chestBuilder_;
    /**
     * <code>.Chest chest = 2;</code>
     * @return Whether the chest field is set.
     */
    public boolean hasChest() {
      return chestBuilder_ != null || chest_ != null;
    }
    /**
     * <code>.Chest chest = 2;</code>
     * @return The chest.
     */
    public io.grasscutter.net.proto.define.Chest getChest() {
      if (chestBuilder_ == null) {
        return chest_ == null ? io.grasscutter.net.proto.define.Chest.getDefaultInstance() : chest_;
      } else {
        return chestBuilder_.getMessage();
      }
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    public Builder setChest(io.grasscutter.net.proto.define.Chest value) {
      if (chestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        chest_ = value;
        onChanged();
      } else {
        chestBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    public Builder setChest(
        io.grasscutter.net.proto.define.Chest.Builder builderForValue) {
      if (chestBuilder_ == null) {
        chest_ = builderForValue.build();
        onChanged();
      } else {
        chestBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    public Builder mergeChest(io.grasscutter.net.proto.define.Chest value) {
      if (chestBuilder_ == null) {
        if (chest_ != null) {
          chest_ =
            io.grasscutter.net.proto.define.Chest.newBuilder(chest_).mergeFrom(value).buildPartial();
        } else {
          chest_ = value;
        }
        onChanged();
      } else {
        chestBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    public Builder clearChest() {
      if (chestBuilder_ == null) {
        chest_ = null;
        onChanged();
      } else {
        chest_ = null;
        chestBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    public io.grasscutter.net.proto.define.Chest.Builder getChestBuilder() {
      
      onChanged();
      return getChestFieldBuilder().getBuilder();
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    public io.grasscutter.net.proto.define.ChestOrBuilder getChestOrBuilder() {
      if (chestBuilder_ != null) {
        return chestBuilder_.getMessageOrBuilder();
      } else {
        return chest_ == null ?
            io.grasscutter.net.proto.define.Chest.getDefaultInstance() : chest_;
      }
    }
    /**
     * <code>.Chest chest = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Chest, io.grasscutter.net.proto.define.Chest.Builder, io.grasscutter.net.proto.define.ChestOrBuilder> 
        getChestFieldBuilder() {
      if (chestBuilder_ == null) {
        chestBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.Chest, io.grasscutter.net.proto.define.Chest.Builder, io.grasscutter.net.proto.define.ChestOrBuilder>(
                getChest(),
                getParentForChildren(),
                isClean());
        chest_ = null;
      }
      return chestBuilder_;
    }

    private int bornType_ = 0;
    /**
     * <code>.GadgetBornType born_type = 1;</code>
     * @return The enum numeric value on the wire for bornType.
     */
    @java.lang.Override public int getBornTypeValue() {
      return bornType_;
    }
    /**
     * <code>.GadgetBornType born_type = 1;</code>
     * @param value The enum numeric value on the wire for bornType to set.
     * @return This builder for chaining.
     */
    public Builder setBornTypeValue(int value) {
      
      bornType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.GadgetBornType born_type = 1;</code>
     * @return The bornType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.define.GadgetBornType getBornType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.define.GadgetBornType result = io.grasscutter.net.proto.define.GadgetBornType.valueOf(bornType_);
      return result == null ? io.grasscutter.net.proto.define.GadgetBornType.UNRECOGNIZED : result;
    }
    /**
     * <code>.GadgetBornType born_type = 1;</code>
     * @param value The bornType to set.
     * @return This builder for chaining.
     */
    public Builder setBornType(io.grasscutter.net.proto.define.GadgetBornType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      bornType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.GadgetBornType born_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBornType() {
      
      bornType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:CreateGadgetInfo)
  }

  // @@protoc_insertion_point(class_scope:CreateGadgetInfo)
  private static final io.grasscutter.net.proto.define.CreateGadgetInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.CreateGadgetInfo();
  }

  public static io.grasscutter.net.proto.define.CreateGadgetInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGadgetInfo>
      PARSER = new com.google.protobuf.AbstractParser<CreateGadgetInfo>() {
    @java.lang.Override
    public CreateGadgetInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CreateGadgetInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CreateGadgetInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGadgetInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.CreateGadgetInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
