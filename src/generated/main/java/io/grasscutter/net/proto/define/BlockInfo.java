// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code BlockInfo}
 */
public final class BlockInfo extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:BlockInfo)
    BlockInfoOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BlockInfo.newBuilder() to construct.
  private BlockInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BlockInfo() {
    binData_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BlockInfo();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BlockInfo(
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

            blockId_ = input.readUInt32();
            break;
          }
          case 16: {

            dataVersion_ = input.readUInt32();
            break;
          }
          case 26: {

            binData_ = input.readBytes();
            break;
          }
          case 32: {

            isDirty_ = input.readBool();
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
    return io.grasscutter.net.proto.define.Define.internal_static_BlockInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_BlockInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.BlockInfo.class, io.grasscutter.net.proto.define.BlockInfo.Builder.class);
  }

  public static final int BIN_DATA_FIELD_NUMBER = 3;
  private com.google.protobuf.ByteString binData_;
  /**
   * <code>bytes bin_data = 3;</code>
   * @return The binData.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBinData() {
    return binData_;
  }

  public static final int DATA_VERSION_FIELD_NUMBER = 2;
  private int dataVersion_;
  /**
   * <code>uint32 data_version = 2;</code>
   * @return The dataVersion.
   */
  @java.lang.Override
  public int getDataVersion() {
    return dataVersion_;
  }

  public static final int BLOCK_ID_FIELD_NUMBER = 1;
  private int blockId_;
  /**
   * <code>uint32 block_id = 1;</code>
   * @return The blockId.
   */
  @java.lang.Override
  public int getBlockId() {
    return blockId_;
  }

  public static final int IS_DIRTY_FIELD_NUMBER = 4;
  private boolean isDirty_;
  /**
   * <code>bool is_dirty = 4;</code>
   * @return The isDirty.
   */
  @java.lang.Override
  public boolean getIsDirty() {
    return isDirty_;
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
    if (blockId_ != 0) {
      output.writeUInt32(1, blockId_);
    }
    if (dataVersion_ != 0) {
      output.writeUInt32(2, dataVersion_);
    }
    if (!binData_.isEmpty()) {
      output.writeBytes(3, binData_);
    }
    if (isDirty_ != false) {
      output.writeBool(4, isDirty_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blockId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, blockId_);
    }
    if (dataVersion_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, dataVersion_);
    }
    if (!binData_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(3, binData_);
    }
    if (isDirty_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(4, isDirty_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.BlockInfo)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.BlockInfo other = (io.grasscutter.net.proto.define.BlockInfo) obj;

    if (!getBinData()
        .equals(other.getBinData())) return false;
    if (getDataVersion()
        != other.getDataVersion()) return false;
    if (getBlockId()
        != other.getBlockId()) return false;
    if (getIsDirty()
        != other.getIsDirty()) return false;
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
    hash = (37 * hash) + BIN_DATA_FIELD_NUMBER;
    hash = (53 * hash) + getBinData().hashCode();
    hash = (37 * hash) + DATA_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getDataVersion();
    hash = (37 * hash) + BLOCK_ID_FIELD_NUMBER;
    hash = (53 * hash) + getBlockId();
    hash = (37 * hash) + IS_DIRTY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsDirty());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.BlockInfo parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.BlockInfo prototype) {
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
   * Protobuf type {@code BlockInfo}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:BlockInfo)
      io.grasscutter.net.proto.define.BlockInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_BlockInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_BlockInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.BlockInfo.class, io.grasscutter.net.proto.define.BlockInfo.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.BlockInfo.newBuilder()
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
      binData_ = com.google.protobuf.ByteString.EMPTY;

      dataVersion_ = 0;

      blockId_ = 0;

      isDirty_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_BlockInfo_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BlockInfo getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.BlockInfo.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BlockInfo build() {
      io.grasscutter.net.proto.define.BlockInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.BlockInfo buildPartial() {
      io.grasscutter.net.proto.define.BlockInfo result = new io.grasscutter.net.proto.define.BlockInfo(this);
      result.binData_ = binData_;
      result.dataVersion_ = dataVersion_;
      result.blockId_ = blockId_;
      result.isDirty_ = isDirty_;
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
      if (other instanceof io.grasscutter.net.proto.define.BlockInfo) {
        return mergeFrom((io.grasscutter.net.proto.define.BlockInfo)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.BlockInfo other) {
      if (other == io.grasscutter.net.proto.define.BlockInfo.getDefaultInstance()) return this;
      if (other.getBinData() != com.google.protobuf.ByteString.EMPTY) {
        setBinData(other.getBinData());
      }
      if (other.getDataVersion() != 0) {
        setDataVersion(other.getDataVersion());
      }
      if (other.getBlockId() != 0) {
        setBlockId(other.getBlockId());
      }
      if (other.getIsDirty() != false) {
        setIsDirty(other.getIsDirty());
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
      io.grasscutter.net.proto.define.BlockInfo parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.BlockInfo) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.protobuf.ByteString binData_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes bin_data = 3;</code>
     * @return The binData.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBinData() {
      return binData_;
    }
    /**
     * <code>bytes bin_data = 3;</code>
     * @param value The binData to set.
     * @return This builder for chaining.
     */
    public Builder setBinData(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      binData_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bytes bin_data = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearBinData() {
      
      binData_ = getDefaultInstance().getBinData();
      onChanged();
      return this;
    }

    private int dataVersion_ ;
    /**
     * <code>uint32 data_version = 2;</code>
     * @return The dataVersion.
     */
    @java.lang.Override
    public int getDataVersion() {
      return dataVersion_;
    }
    /**
     * <code>uint32 data_version = 2;</code>
     * @param value The dataVersion to set.
     * @return This builder for chaining.
     */
    public Builder setDataVersion(int value) {
      
      dataVersion_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 data_version = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDataVersion() {
      
      dataVersion_ = 0;
      onChanged();
      return this;
    }

    private int blockId_ ;
    /**
     * <code>uint32 block_id = 1;</code>
     * @return The blockId.
     */
    @java.lang.Override
    public int getBlockId() {
      return blockId_;
    }
    /**
     * <code>uint32 block_id = 1;</code>
     * @param value The blockId to set.
     * @return This builder for chaining.
     */
    public Builder setBlockId(int value) {
      
      blockId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 block_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockId() {
      
      blockId_ = 0;
      onChanged();
      return this;
    }

    private boolean isDirty_ ;
    /**
     * <code>bool is_dirty = 4;</code>
     * @return The isDirty.
     */
    @java.lang.Override
    public boolean getIsDirty() {
      return isDirty_;
    }
    /**
     * <code>bool is_dirty = 4;</code>
     * @param value The isDirty to set.
     * @return This builder for chaining.
     */
    public Builder setIsDirty(boolean value) {
      
      isDirty_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool is_dirty = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsDirty() {
      
      isDirty_ = false;
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


    // @@protoc_insertion_point(builder_scope:BlockInfo)
  }

  // @@protoc_insertion_point(class_scope:BlockInfo)
  private static final io.grasscutter.net.proto.define.BlockInfo DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.BlockInfo();
  }

  public static io.grasscutter.net.proto.define.BlockInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BlockInfo>
      PARSER = new com.google.protobuf.AbstractParser<BlockInfo>() {
    @java.lang.Override
    public BlockInfo parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BlockInfo(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BlockInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BlockInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.BlockInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
