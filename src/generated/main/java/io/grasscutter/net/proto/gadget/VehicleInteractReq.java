// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gadget.proto

package io.grasscutter.net.proto.gadget;

/**
 * <pre>
 * CmdId: 1121
 * </pre>
 *
 * Protobuf type {@code VehicleInteractReq}
 */
public final class VehicleInteractReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:VehicleInteractReq)
    VehicleInteractReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use VehicleInteractReq.newBuilder() to construct.
  private VehicleInteractReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private VehicleInteractReq() {
    interactType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new VehicleInteractReq();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private VehicleInteractReq(
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

            isNeedDestroy_ = input.readBool();
            break;
          }
          case 56: {

            pos_ = input.readUInt32();
            break;
          }
          case 88: {
            int rawValue = input.readEnum();

            interactType_ = rawValue;
            break;
          }
          case 96: {

            entityId_ = input.readUInt32();
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
    return io.grasscutter.net.proto.gadget.Gadget.internal_static_VehicleInteractReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.gadget.Gadget.internal_static_VehicleInteractReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.gadget.VehicleInteractReq.class, io.grasscutter.net.proto.gadget.VehicleInteractReq.Builder.class);
  }

  public static final int INTERACT_TYPE_FIELD_NUMBER = 11;
  private int interactType_;
  /**
   * <code>.VehicleInteractType interact_type = 11;</code>
   * @return The enum numeric value on the wire for interactType.
   */
  @java.lang.Override public int getInteractTypeValue() {
    return interactType_;
  }
  /**
   * <code>.VehicleInteractType interact_type = 11;</code>
   * @return The interactType.
   */
  @java.lang.Override public io.grasscutter.net.proto.gadget.VehicleInteractType getInteractType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.gadget.VehicleInteractType result = io.grasscutter.net.proto.gadget.VehicleInteractType.valueOf(interactType_);
    return result == null ? io.grasscutter.net.proto.gadget.VehicleInteractType.UNRECOGNIZED : result;
  }

  public static final int IS_NEED_DESTROY_FIELD_NUMBER = 5;
  private boolean isNeedDestroy_;
  /**
   * <code>bool is_need_destroy = 5;</code>
   * @return The isNeedDestroy.
   */
  @java.lang.Override
  public boolean getIsNeedDestroy() {
    return isNeedDestroy_;
  }

  public static final int ENTITY_ID_FIELD_NUMBER = 12;
  private int entityId_;
  /**
   * <code>uint32 entity_id = 12;</code>
   * @return The entityId.
   */
  @java.lang.Override
  public int getEntityId() {
    return entityId_;
  }

  public static final int POS_FIELD_NUMBER = 7;
  private int pos_;
  /**
   * <code>uint32 pos = 7;</code>
   * @return The pos.
   */
  @java.lang.Override
  public int getPos() {
    return pos_;
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
    if (isNeedDestroy_ != false) {
      output.writeBool(5, isNeedDestroy_);
    }
    if (pos_ != 0) {
      output.writeUInt32(7, pos_);
    }
    if (interactType_ != io.grasscutter.net.proto.gadget.VehicleInteractType.VehicleInteractType_VEHICLE_INTERACT_NONE.getNumber()) {
      output.writeEnum(11, interactType_);
    }
    if (entityId_ != 0) {
      output.writeUInt32(12, entityId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isNeedDestroy_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(5, isNeedDestroy_);
    }
    if (pos_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, pos_);
    }
    if (interactType_ != io.grasscutter.net.proto.gadget.VehicleInteractType.VehicleInteractType_VEHICLE_INTERACT_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(11, interactType_);
    }
    if (entityId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(12, entityId_);
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
    if (!(obj instanceof io.grasscutter.net.proto.gadget.VehicleInteractReq)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.gadget.VehicleInteractReq other = (io.grasscutter.net.proto.gadget.VehicleInteractReq) obj;

    if (interactType_ != other.interactType_) return false;
    if (getIsNeedDestroy()
        != other.getIsNeedDestroy()) return false;
    if (getEntityId()
        != other.getEntityId()) return false;
    if (getPos()
        != other.getPos()) return false;
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
    hash = (37 * hash) + INTERACT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + interactType_;
    hash = (37 * hash) + IS_NEED_DESTROY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsNeedDestroy());
    hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getEntityId();
    hash = (37 * hash) + POS_FIELD_NUMBER;
    hash = (53 * hash) + getPos();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.gadget.VehicleInteractReq parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.gadget.VehicleInteractReq prototype) {
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
   * CmdId: 1121
   * </pre>
   *
   * Protobuf type {@code VehicleInteractReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:VehicleInteractReq)
      io.grasscutter.net.proto.gadget.VehicleInteractReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.gadget.Gadget.internal_static_VehicleInteractReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.gadget.Gadget.internal_static_VehicleInteractReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.gadget.VehicleInteractReq.class, io.grasscutter.net.proto.gadget.VehicleInteractReq.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.gadget.VehicleInteractReq.newBuilder()
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
      interactType_ = 0;

      isNeedDestroy_ = false;

      entityId_ = 0;

      pos_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.gadget.Gadget.internal_static_VehicleInteractReq_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.gadget.VehicleInteractReq getDefaultInstanceForType() {
      return io.grasscutter.net.proto.gadget.VehicleInteractReq.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.gadget.VehicleInteractReq build() {
      io.grasscutter.net.proto.gadget.VehicleInteractReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.gadget.VehicleInteractReq buildPartial() {
      io.grasscutter.net.proto.gadget.VehicleInteractReq result = new io.grasscutter.net.proto.gadget.VehicleInteractReq(this);
      result.interactType_ = interactType_;
      result.isNeedDestroy_ = isNeedDestroy_;
      result.entityId_ = entityId_;
      result.pos_ = pos_;
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
      if (other instanceof io.grasscutter.net.proto.gadget.VehicleInteractReq) {
        return mergeFrom((io.grasscutter.net.proto.gadget.VehicleInteractReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.gadget.VehicleInteractReq other) {
      if (other == io.grasscutter.net.proto.gadget.VehicleInteractReq.getDefaultInstance()) return this;
      if (other.interactType_ != 0) {
        setInteractTypeValue(other.getInteractTypeValue());
      }
      if (other.getIsNeedDestroy() != false) {
        setIsNeedDestroy(other.getIsNeedDestroy());
      }
      if (other.getEntityId() != 0) {
        setEntityId(other.getEntityId());
      }
      if (other.getPos() != 0) {
        setPos(other.getPos());
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
      io.grasscutter.net.proto.gadget.VehicleInteractReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.gadget.VehicleInteractReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int interactType_ = 0;
    /**
     * <code>.VehicleInteractType interact_type = 11;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.VehicleInteractType interact_type = 11;</code>
     * @param value The enum numeric value on the wire for interactType to set.
     * @return This builder for chaining.
     */
    public Builder setInteractTypeValue(int value) {
      
      interactType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.VehicleInteractType interact_type = 11;</code>
     * @return The interactType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.gadget.VehicleInteractType getInteractType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.gadget.VehicleInteractType result = io.grasscutter.net.proto.gadget.VehicleInteractType.valueOf(interactType_);
      return result == null ? io.grasscutter.net.proto.gadget.VehicleInteractType.UNRECOGNIZED : result;
    }
    /**
     * <code>.VehicleInteractType interact_type = 11;</code>
     * @param value The interactType to set.
     * @return This builder for chaining.
     */
    public Builder setInteractType(io.grasscutter.net.proto.gadget.VehicleInteractType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      interactType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.VehicleInteractType interact_type = 11;</code>
     * @return This builder for chaining.
     */
    public Builder clearInteractType() {
      
      interactType_ = 0;
      onChanged();
      return this;
    }

    private boolean isNeedDestroy_ ;
    /**
     * <code>bool is_need_destroy = 5;</code>
     * @return The isNeedDestroy.
     */
    @java.lang.Override
    public boolean getIsNeedDestroy() {
      return isNeedDestroy_;
    }
    /**
     * <code>bool is_need_destroy = 5;</code>
     * @param value The isNeedDestroy to set.
     * @return This builder for chaining.
     */
    public Builder setIsNeedDestroy(boolean value) {
      
      isNeedDestroy_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_need_destroy = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsNeedDestroy() {
      
      isNeedDestroy_ = false;
      onChanged();
      return this;
    }

    private int entityId_ ;
    /**
     * <code>uint32 entity_id = 12;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }
    /**
     * <code>uint32 entity_id = 12;</code>
     * @param value The entityId to set.
     * @return This builder for chaining.
     */
    public Builder setEntityId(int value) {
      
      entityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 entity_id = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearEntityId() {
      
      entityId_ = 0;
      onChanged();
      return this;
    }

    private int pos_ ;
    /**
     * <code>uint32 pos = 7;</code>
     * @return The pos.
     */
    @java.lang.Override
    public int getPos() {
      return pos_;
    }
    /**
     * <code>uint32 pos = 7;</code>
     * @param value The pos to set.
     * @return This builder for chaining.
     */
    public Builder setPos(int value) {
      
      pos_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 pos = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearPos() {
      
      pos_ = 0;
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


    // @@protoc_insertion_point(builder_scope:VehicleInteractReq)
  }

  // @@protoc_insertion_point(class_scope:VehicleInteractReq)
  private static final io.grasscutter.net.proto.gadget.VehicleInteractReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.gadget.VehicleInteractReq();
  }

  public static io.grasscutter.net.proto.gadget.VehicleInteractReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VehicleInteractReq>
      PARSER = new com.google.protobuf.AbstractParser<VehicleInteractReq>() {
    @java.lang.Override
    public VehicleInteractReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new VehicleInteractReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<VehicleInteractReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VehicleInteractReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.gadget.VehicleInteractReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
