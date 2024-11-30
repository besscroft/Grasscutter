// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

/**
 * Protobuf type {@code CombatInvokeEntry}
 */
public final class CombatInvokeEntry extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:CombatInvokeEntry)
    CombatInvokeEntryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CombatInvokeEntry.newBuilder() to construct.
  private CombatInvokeEntry(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CombatInvokeEntry() {
    combatData_ = com.google.protobuf.ByteString.EMPTY;
    argumentType_ = 0;
    forwardType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CombatInvokeEntry();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private CombatInvokeEntry(
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

            argumentType_ = rawValue;
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            forwardType_ = rawValue;
            break;
          }
          case 66: {

            combatData_ = input.readBytes();
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
    return io.grasscutter.net.proto.fight.Fight.internal_static_CombatInvokeEntry_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.fight.Fight.internal_static_CombatInvokeEntry_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.fight.CombatInvokeEntry.class, io.grasscutter.net.proto.fight.CombatInvokeEntry.Builder.class);
  }

  public static final int COMBAT_DATA_FIELD_NUMBER = 8;
  private com.google.protobuf.ByteString combatData_;
  /**
   * <code>bytes combat_data = 8;</code>
   * @return The combatData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCombatData() {
    return combatData_;
  }

  public static final int ARGUMENT_TYPE_FIELD_NUMBER = 1;
  private int argumentType_;
  /**
   * <code>.CombatTypeArgument argument_type = 1;</code>
   * @return The enum numeric value on the wire for argumentType.
   */
  @java.lang.Override public int getArgumentTypeValue() {
    return argumentType_;
  }
  /**
   * <code>.CombatTypeArgument argument_type = 1;</code>
   * @return The argumentType.
   */
  @java.lang.Override public io.grasscutter.net.proto.fight.CombatTypeArgument getArgumentType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.fight.CombatTypeArgument result = io.grasscutter.net.proto.fight.CombatTypeArgument.valueOf(argumentType_);
    return result == null ? io.grasscutter.net.proto.fight.CombatTypeArgument.UNRECOGNIZED : result;
  }

  public static final int FORWARD_TYPE_FIELD_NUMBER = 7;
  private int forwardType_;
  /**
   * <code>.ForwardType forward_type = 7;</code>
   * @return The enum numeric value on the wire for forwardType.
   */
  @java.lang.Override public int getForwardTypeValue() {
    return forwardType_;
  }
  /**
   * <code>.ForwardType forward_type = 7;</code>
   * @return The forwardType.
   */
  @java.lang.Override public io.grasscutter.net.proto.fight.ForwardType getForwardType() {
    @SuppressWarnings("deprecation")
    io.grasscutter.net.proto.fight.ForwardType result = io.grasscutter.net.proto.fight.ForwardType.valueOf(forwardType_);
    return result == null ? io.grasscutter.net.proto.fight.ForwardType.UNRECOGNIZED : result;
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
    if (argumentType_ != io.grasscutter.net.proto.fight.CombatTypeArgument.CombatTypeArgument_COMBAT_NONE.getNumber()) {
      output.writeEnum(1, argumentType_);
    }
    if (forwardType_ != io.grasscutter.net.proto.fight.ForwardType.ForwardType_FORWARD_LOCAL.getNumber()) {
      output.writeEnum(7, forwardType_);
    }
    if (!combatData_.isEmpty()) {
      output.writeBytes(8, combatData_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (argumentType_ != io.grasscutter.net.proto.fight.CombatTypeArgument.CombatTypeArgument_COMBAT_NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(1, argumentType_);
    }
    if (forwardType_ != io.grasscutter.net.proto.fight.ForwardType.ForwardType_FORWARD_LOCAL.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, forwardType_);
    }
    if (!combatData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(8, combatData_);
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
    if (!(obj instanceof io.grasscutter.net.proto.fight.CombatInvokeEntry)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.fight.CombatInvokeEntry other = (io.grasscutter.net.proto.fight.CombatInvokeEntry) obj;

    if (!getCombatData()
        .equals(other.getCombatData())) return false;
    if (argumentType_ != other.argumentType_) return false;
    if (forwardType_ != other.forwardType_) return false;
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
    hash = (37 * hash) + COMBAT_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getCombatData().hashCode();
    hash = (37 * hash) + ARGUMENT_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + argumentType_;
    hash = (37 * hash) + FORWARD_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + forwardType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.CombatInvokeEntry parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.fight.CombatInvokeEntry prototype) {
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
   * Protobuf type {@code CombatInvokeEntry}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:CombatInvokeEntry)
      io.grasscutter.net.proto.fight.CombatInvokeEntryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_CombatInvokeEntry_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_CombatInvokeEntry_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.fight.CombatInvokeEntry.class, io.grasscutter.net.proto.fight.CombatInvokeEntry.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.fight.CombatInvokeEntry.newBuilder()
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
      combatData_ = com.google.protobuf.ByteString.EMPTY;

      argumentType_ = 0;

      forwardType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_CombatInvokeEntry_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.CombatInvokeEntry getDefaultInstanceForType() {
      return io.grasscutter.net.proto.fight.CombatInvokeEntry.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.CombatInvokeEntry build() {
      io.grasscutter.net.proto.fight.CombatInvokeEntry result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.CombatInvokeEntry buildPartial() {
      io.grasscutter.net.proto.fight.CombatInvokeEntry result = new io.grasscutter.net.proto.fight.CombatInvokeEntry(this);
      result.combatData_ = combatData_;
      result.argumentType_ = argumentType_;
      result.forwardType_ = forwardType_;
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
      if (other instanceof io.grasscutter.net.proto.fight.CombatInvokeEntry) {
        return mergeFrom((io.grasscutter.net.proto.fight.CombatInvokeEntry)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.fight.CombatInvokeEntry other) {
      if (other == io.grasscutter.net.proto.fight.CombatInvokeEntry.getDefaultInstance()) return this;
      if (other.getCombatData() != com.google.protobuf.ByteString.EMPTY) {
        setCombatData(other.getCombatData());
      }
      if (other.argumentType_ != 0) {
        setArgumentTypeValue(other.getArgumentTypeValue());
      }
      if (other.forwardType_ != 0) {
        setForwardTypeValue(other.getForwardTypeValue());
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
      io.grasscutter.net.proto.fight.CombatInvokeEntry parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.fight.CombatInvokeEntry) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString combatData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes combat_data = 8;</code>
     * @return The combatData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getCombatData() {
      return combatData_;
    }
    /**
     * <code>bytes combat_data = 8;</code>
     * @param value The combatData to set.
     * @return This builder for chaining.
     */
    public Builder setCombatData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      combatData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes combat_data = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearCombatData() {
      
      combatData_ = getDefaultInstance().getCombatData();
      onChanged();
      return this;
    }

    private int argumentType_ = 0;
    /**
     * <code>.CombatTypeArgument argument_type = 1;</code>
     * @return The enum numeric value on the wire for argumentType.
     */
    @java.lang.Override public int getArgumentTypeValue() {
      return argumentType_;
    }
    /**
     * <code>.CombatTypeArgument argument_type = 1;</code>
     * @param value The enum numeric value on the wire for argumentType to set.
     * @return This builder for chaining.
     */
    public Builder setArgumentTypeValue(int value) {
      
      argumentType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.CombatTypeArgument argument_type = 1;</code>
     * @return The argumentType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.fight.CombatTypeArgument getArgumentType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.fight.CombatTypeArgument result = io.grasscutter.net.proto.fight.CombatTypeArgument.valueOf(argumentType_);
      return result == null ? io.grasscutter.net.proto.fight.CombatTypeArgument.UNRECOGNIZED : result;
    }
    /**
     * <code>.CombatTypeArgument argument_type = 1;</code>
     * @param value The argumentType to set.
     * @return This builder for chaining.
     */
    public Builder setArgumentType(io.grasscutter.net.proto.fight.CombatTypeArgument value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      argumentType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.CombatTypeArgument argument_type = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearArgumentType() {
      
      argumentType_ = 0;
      onChanged();
      return this;
    }

    private int forwardType_ = 0;
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return The enum numeric value on the wire for forwardType.
     */
    @java.lang.Override public int getForwardTypeValue() {
      return forwardType_;
    }
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @param value The enum numeric value on the wire for forwardType to set.
     * @return This builder for chaining.
     */
    public Builder setForwardTypeValue(int value) {
      
      forwardType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return The forwardType.
     */
    @java.lang.Override
    public io.grasscutter.net.proto.fight.ForwardType getForwardType() {
      @SuppressWarnings("deprecation")
      io.grasscutter.net.proto.fight.ForwardType result = io.grasscutter.net.proto.fight.ForwardType.valueOf(forwardType_);
      return result == null ? io.grasscutter.net.proto.fight.ForwardType.UNRECOGNIZED : result;
    }
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @param value The forwardType to set.
     * @return This builder for chaining.
     */
    public Builder setForwardType(io.grasscutter.net.proto.fight.ForwardType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      forwardType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.ForwardType forward_type = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearForwardType() {
      
      forwardType_ = 0;
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


    // @@protoc_insertion_point(builder_scope:CombatInvokeEntry)
  }

  // @@protoc_insertion_point(class_scope:CombatInvokeEntry)
  private static final io.grasscutter.net.proto.fight.CombatInvokeEntry DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.fight.CombatInvokeEntry();
  }

  public static io.grasscutter.net.proto.fight.CombatInvokeEntry getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CombatInvokeEntry>
      PARSER = new com.google.protobuf.AbstractParser<CombatInvokeEntry>() {
    @java.lang.Override
    public CombatInvokeEntry parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new CombatInvokeEntry(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<CombatInvokeEntry> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CombatInvokeEntry> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.fight.CombatInvokeEntry getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
