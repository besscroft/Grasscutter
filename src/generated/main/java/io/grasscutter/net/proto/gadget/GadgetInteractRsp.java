// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gadget.proto

package io.grasscutter.net.proto.gadget;

/**
 * <pre>
 * CmdId: 1140
 * </pre>
 *
 * Protobuf type {@code GadgetInteractRsp}
 */
public final class GadgetInteractRsp extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GadgetInteractRsp)
    GadgetInteractRspOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GadgetInteractRsp.newBuilder() to construct.
  private GadgetInteractRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GadgetInteractRsp() {
    interactType_ = 0;
    opType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GadgetInteractRsp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GadgetInteractRsp(
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
          case 24: {

            gadgetId_ = input.readUInt32();
            break;
          }
          case 32: {

            retcode_ = input.readInt32();
            break;
          }
          case 56: {

            gadgetEntityId_ = input.readUInt32();
            break;
          }
          case 72: {
            int rawValue = input.readEnum();

            opType_ = rawValue;
            break;
          }
          case 80: {

            dDJFGLFNGJC_ = input.readUInt32();
            break;
          }
          case 96: {
            int rawValue = input.readEnum();

            interactType_ = rawValue;
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
    return io.grasscutter.net.proto.gadget.Gadget.internal_static_GadgetInteractRsp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.gadget.Gadget.internal_static_GadgetInteractRsp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.gadget.GadgetInteractRsp.class, io.grasscutter.net.proto.gadget.GadgetInteractRsp.Builder.class);
  }

  public static final int INTERACT_TYPE_FIELD_NUMBER = 12;
  private int interactType_;
  /**
   * <code>.InteractType interact_type = 12;</code>
   * @return The enum numeric value on the wire for interactType.
   */
  @java.lang.Override public int getInteractTypeValue() {
    return interactType_;
  }
  /**
   * <code>.InteractType interact_type = 12;</code>
   * @return The interactType.
   */
  @java.lang.Override public io.grasscutter.net.proto.gadget.InteractType getInteractType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.gadget.InteractType result = io.grasscutter.net.proto.gadget.InteractType.valueOf(interactType_);
    return result == null ? io.grasscutter.net.proto.gadget.InteractType.UNRECOGNIZED : result;
  }

  public static final int RETCODE_FIELD_NUMBER = 4;
  private int retcode_;
  /**
   * <code>int32 retcode = 4;</code>
   * @return The retcode.
   */
  @java.lang.Override
  public int getRetcode() {
    return retcode_;
  }

  public static final int GADGET_ENTITY_ID_FIELD_NUMBER = 7;
  private int gadgetEntityId_;
  /**
   * <code>uint32 gadget_entity_id = 7;</code>
   * @return The gadgetEntityId.
   */
  @java.lang.Override
  public int getGadgetEntityId() {
    return gadgetEntityId_;
  }

  public static final int DDJFGLFNGJC_FIELD_NUMBER = 10;
  private int dDJFGLFNGJC_;
  /**
   * <code>uint32 DDJFGLFNGJC = 10;</code>
   * @return The dDJFGLFNGJC.
   */
  @java.lang.Override
  public int getDDJFGLFNGJC() {
    return dDJFGLFNGJC_;
  }

  public static final int GADGET_ID_FIELD_NUMBER = 3;
  private int gadgetId_;
  /**
   * <code>uint32 gadget_id = 3;</code>
   * @return The gadgetId.
   */
  @java.lang.Override
  public int getGadgetId() {
    return gadgetId_;
  }

  public static final int OP_TYPE_FIELD_NUMBER = 9;
  private int opType_;
  /**
   * <code>.InterOpType op_type = 9;</code>
   * @return The enum numeric value on the wire for opType.
   */
  @java.lang.Override public int getOpTypeValue() {
    return opType_;
  }
  /**
   * <code>.InterOpType op_type = 9;</code>
   * @return The opType.
   */
  @java.lang.Override public io.grasscutter.net.proto.gadget.InterOpType getOpType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.gadget.InterOpType result = io.grasscutter.net.proto.gadget.InterOpType.valueOf(opType_);
    return result == null ? io.grasscutter.net.proto.gadget.InterOpType.UNRECOGNIZED : result;
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
    if (gadgetId_ != 0) {
      output.writeUInt32(3, gadgetId_);
    }
    if (retcode_ != 0) {
      output.writeInt32(4, retcode_);
    }
    if (gadgetEntityId_ != 0) {
      output.writeUInt32(7, gadgetEntityId_);
    }
    if (opType_ != io.grasscutter.net.proto.gadget.InterOpType.InterOpType_INTER_OP_FINISH.getNumber()) {
      output.writeEnum(9, opType_);
    }
    if (dDJFGLFNGJC_ != 0) {
      output.writeUInt32(10, dDJFGLFNGJC_);
    }
    if (interactType_ != io.grasscutter.net.proto.gadget.InteractType.InteractType_INTERACT_NONE.getNumber()) {
      output.writeEnum(12, interactType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (gadgetId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, gadgetId_);
    }
    if (retcode_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, retcode_);
    }
    if (gadgetEntityId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(7, gadgetEntityId_);
    }
    if (opType_ != io.grasscutter.net.proto.gadget.InterOpType.InterOpType_INTER_OP_FINISH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(9, opType_);
    }
    if (dDJFGLFNGJC_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(10, dDJFGLFNGJC_);
    }
    if (interactType_ != io.grasscutter.net.proto.gadget.InteractType.InteractType_INTERACT_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(12, interactType_);
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
    if (!(obj instanceof io.grasscutter.net.proto.gadget.GadgetInteractRsp)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.gadget.GadgetInteractRsp other = (io.grasscutter.net.proto.gadget.GadgetInteractRsp) obj;

    if (interactType_ != other.interactType_) return false;
    if (getRetcode()
        != other.getRetcode()) return false;
    if (getGadgetEntityId()
        != other.getGadgetEntityId()) return false;
    if (getDDJFGLFNGJC()
        != other.getDDJFGLFNGJC()) return false;
    if (getGadgetId()
        != other.getGadgetId()) return false;
    if (opType_ != other.opType_) return false;
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
    hash = (37 * hash) + RETCODE_FIELD_NUMBER;
    hash = (53 * hash) + getRetcode();
    hash = (37 * hash) + GADGET_ENTITY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGadgetEntityId();
    hash = (37 * hash) + DDJFGLFNGJC_FIELD_NUMBER;
    hash = (53 * hash) + getDDJFGLFNGJC();
    hash = (37 * hash) + GADGET_ID_FIELD_NUMBER;
    hash = (53 * hash) + getGadgetId();
    hash = (37 * hash) + OP_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + opType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.gadget.GadgetInteractRsp prototype) {
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
   * CmdId: 1140
   * </pre>
   *
   * Protobuf type {@code GadgetInteractRsp}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GadgetInteractRsp)
      io.grasscutter.net.proto.gadget.GadgetInteractRspOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.gadget.Gadget.internal_static_GadgetInteractRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.gadget.Gadget.internal_static_GadgetInteractRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.gadget.GadgetInteractRsp.class, io.grasscutter.net.proto.gadget.GadgetInteractRsp.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.gadget.GadgetInteractRsp.newBuilder()
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

      retcode_ = 0;

      gadgetEntityId_ = 0;

      dDJFGLFNGJC_ = 0;

      gadgetId_ = 0;

      opType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.gadget.Gadget.internal_static_GadgetInteractRsp_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.gadget.GadgetInteractRsp getDefaultInstanceForType() {
      return io.grasscutter.net.proto.gadget.GadgetInteractRsp.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.gadget.GadgetInteractRsp build() {
      io.grasscutter.net.proto.gadget.GadgetInteractRsp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.gadget.GadgetInteractRsp buildPartial() {
      io.grasscutter.net.proto.gadget.GadgetInteractRsp result = new io.grasscutter.net.proto.gadget.GadgetInteractRsp(this);
      result.interactType_ = interactType_;
      result.retcode_ = retcode_;
      result.gadgetEntityId_ = gadgetEntityId_;
      result.dDJFGLFNGJC_ = dDJFGLFNGJC_;
      result.gadgetId_ = gadgetId_;
      result.opType_ = opType_;
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
      if (other instanceof io.grasscutter.net.proto.gadget.GadgetInteractRsp) {
        return mergeFrom((io.grasscutter.net.proto.gadget.GadgetInteractRsp)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.gadget.GadgetInteractRsp other) {
      if (other == io.grasscutter.net.proto.gadget.GadgetInteractRsp.getDefaultInstance()) return this;
      if (other.interactType_ != 0) {
        setInteractTypeValue(other.getInteractTypeValue());
      }
      if (other.getRetcode() != 0) {
        setRetcode(other.getRetcode());
      }
      if (other.getGadgetEntityId() != 0) {
        setGadgetEntityId(other.getGadgetEntityId());
      }
      if (other.getDDJFGLFNGJC() != 0) {
        setDDJFGLFNGJC(other.getDDJFGLFNGJC());
      }
      if (other.getGadgetId() != 0) {
        setGadgetId(other.getGadgetId());
      }
      if (other.opType_ != 0) {
        setOpTypeValue(other.getOpTypeValue());
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
      io.grasscutter.net.proto.gadget.GadgetInteractRsp parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.gadget.GadgetInteractRsp) e.getUnfinishedMessage();
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
     * <code>.InteractType interact_type = 12;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.InteractType interact_type = 12;</code>
     * @param value The enum numeric value on the wire for interactType to set.
     * @return This builder for chaining.
     */
    public Builder setInteractTypeValue(int value) {
      
      interactType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.InteractType interact_type = 12;</code>
     * @return The interactType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.gadget.InteractType getInteractType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.gadget.InteractType result = io.grasscutter.net.proto.gadget.InteractType.valueOf(interactType_);
      return result == null ? io.grasscutter.net.proto.gadget.InteractType.UNRECOGNIZED : result;
    }
    /**
     * <code>.InteractType interact_type = 12;</code>
     * @param value The interactType to set.
     * @return This builder for chaining.
     */
    public Builder setInteractType(io.grasscutter.net.proto.gadget.InteractType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      interactType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.InteractType interact_type = 12;</code>
     * @return This builder for chaining.
     */
    public Builder clearInteractType() {
      
      interactType_ = 0;
      onChanged();
      return this;
    }

    private int retcode_ ;
    /**
     * <code>int32 retcode = 4;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }
    /**
     * <code>int32 retcode = 4;</code>
     * @param value The retcode to set.
     * @return This builder for chaining.
     */
    public Builder setRetcode(int value) {
      
      retcode_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 retcode = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearRetcode() {
      
      retcode_ = 0;
      onChanged();
      return this;
    }

    private int gadgetEntityId_ ;
    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return The gadgetEntityId.
     */
    @java.lang.Override
    public int getGadgetEntityId() {
      return gadgetEntityId_;
    }
    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @param value The gadgetEntityId to set.
     * @return This builder for chaining.
     */
    public Builder setGadgetEntityId(int value) {
      
      gadgetEntityId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 gadget_entity_id = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearGadgetEntityId() {
      
      gadgetEntityId_ = 0;
      onChanged();
      return this;
    }

    private int dDJFGLFNGJC_ ;
    /**
     * <code>uint32 DDJFGLFNGJC = 10;</code>
     * @return The dDJFGLFNGJC.
     */
    @java.lang.Override
    public int getDDJFGLFNGJC() {
      return dDJFGLFNGJC_;
    }
    /**
     * <code>uint32 DDJFGLFNGJC = 10;</code>
     * @param value The dDJFGLFNGJC to set.
     * @return This builder for chaining.
     */
    public Builder setDDJFGLFNGJC(int value) {
      
      dDJFGLFNGJC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 DDJFGLFNGJC = 10;</code>
     * @return This builder for chaining.
     */
    public Builder clearDDJFGLFNGJC() {
      
      dDJFGLFNGJC_ = 0;
      onChanged();
      return this;
    }

    private int gadgetId_ ;
    /**
     * <code>uint32 gadget_id = 3;</code>
     * @return The gadgetId.
     */
    @java.lang.Override
    public int getGadgetId() {
      return gadgetId_;
    }
    /**
     * <code>uint32 gadget_id = 3;</code>
     * @param value The gadgetId to set.
     * @return This builder for chaining.
     */
    public Builder setGadgetId(int value) {
      
      gadgetId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 gadget_id = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearGadgetId() {
      
      gadgetId_ = 0;
      onChanged();
      return this;
    }

    private int opType_ = 0;
    /**
     * <code>.InterOpType op_type = 9;</code>
     * @return The enum numeric value on the wire for opType.
     */
    @java.lang.Override public int getOpTypeValue() {
      return opType_;
    }
    /**
     * <code>.InterOpType op_type = 9;</code>
     * @param value The enum numeric value on the wire for opType to set.
     * @return This builder for chaining.
     */
    public Builder setOpTypeValue(int value) {
      
      opType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.InterOpType op_type = 9;</code>
     * @return The opType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.gadget.InterOpType getOpType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.gadget.InterOpType result = io.grasscutter.net.proto.gadget.InterOpType.valueOf(opType_);
      return result == null ? io.grasscutter.net.proto.gadget.InterOpType.UNRECOGNIZED : result;
    }
    /**
     * <code>.InterOpType op_type = 9;</code>
     * @param value The opType to set.
     * @return This builder for chaining.
     */
    public Builder setOpType(io.grasscutter.net.proto.gadget.InterOpType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      opType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.InterOpType op_type = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearOpType() {
      
      opType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:GadgetInteractRsp)
  }

  // @@protoc_insertion_point(class_scope:GadgetInteractRsp)
  private static final io.grasscutter.net.proto.gadget.GadgetInteractRsp DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.gadget.GadgetInteractRsp();
  }

  public static io.grasscutter.net.proto.gadget.GadgetInteractRsp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GadgetInteractRsp>
      PARSER = new com.google.protobuf.AbstractParser<GadgetInteractRsp>() {
    @java.lang.Override
    public GadgetInteractRsp parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GadgetInteractRsp(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GadgetInteractRsp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GadgetInteractRsp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.gadget.GadgetInteractRsp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
