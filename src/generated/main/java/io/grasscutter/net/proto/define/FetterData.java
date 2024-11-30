// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code FetterData}
 */
public final class FetterData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:FetterData)
    FetterDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FetterData.newBuilder() to construct.
  private FetterData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FetterData() {
    condIndexList_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FetterData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private FetterData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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

            fetterId_ = input.readUInt32();
            break;
          }
          case 16: {

            fetterState_ = input.readUInt32();
            break;
          }
          case 24: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              condIndexList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            condIndexList_.addInt(input.readUInt32());
            break;
          }
          case 26: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              condIndexList_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              condIndexList_.addInt(input.readUInt32());
            }
            input.popLimit(limit);
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        condIndexList_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.define.Define.internal_static_FetterData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_FetterData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.FetterData.class, io.grasscutter.net.proto.define.FetterData.Builder.class);
  }

  public static final int COND_INDEX_LIST_FIELD_NUMBER = 3;
  private com.google.protobuf.Internal.IntList condIndexList_;
  /**
   * <code>repeated uint32 cond_index_list = 3;</code>
   * @return A list containing the condIndexList.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getCondIndexListList() {
    return condIndexList_;
  }
  /**
   * <code>repeated uint32 cond_index_list = 3;</code>
   * @return The count of condIndexList.
   */
  public int getCondIndexListCount() {
    return condIndexList_.size();
  }
  /**
   * <code>repeated uint32 cond_index_list = 3;</code>
   * @param index The index of the element to return.
   * @return The condIndexList at the given index.
   */
  public int getCondIndexList(int index) {
    return condIndexList_.getInt(index);
  }
  private int condIndexListMemoizedSerializedSize = -1;

  public static final int FETTER_STATE_FIELD_NUMBER = 2;
  private int fetterState_;
  /**
   * <code>uint32 fetter_state = 2;</code>
   * @return The fetterState.
   */
  @java.lang.Override
  public int getFetterState() {
    return fetterState_;
  }

  public static final int FETTER_ID_FIELD_NUMBER = 1;
  private int fetterId_;
  /**
   * <code>uint32 fetter_id = 1;</code>
   * @return The fetterId.
   */
  @java.lang.Override
  public int getFetterId() {
    return fetterId_;
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
    getSerializedSize();
    if (fetterId_ != 0) {
      output.writeUInt32(1, fetterId_);
    }
    if (fetterState_ != 0) {
      output.writeUInt32(2, fetterState_);
    }
    if (getCondIndexListList().size() > 0) {
      output.writeUInt32NoTag(26);
      output.writeUInt32NoTag(condIndexListMemoizedSerializedSize);
    }
    for (int i = 0; i < condIndexList_.size(); i++) {
      output.writeUInt32NoTag(condIndexList_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fetterId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, fetterId_);
    }
    if (fetterState_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, fetterState_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < condIndexList_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(condIndexList_.getInt(i));
      }
      size += dataSize;
      if (!getCondIndexListList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      condIndexListMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.define.FetterData)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.FetterData other = (io.grasscutter.net.proto.define.FetterData) obj;

    if (!getCondIndexListList()
        .equals(other.getCondIndexListList())) return false;
    if (getFetterState()
        != other.getFetterState()) return false;
    if (getFetterId()
        != other.getFetterId()) return false;
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
    if (getCondIndexListCount() > 0) {
      hash = (37 * hash) + COND_INDEX_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getCondIndexListList().hashCode();
    }
    hash = (37 * hash) + FETTER_STATE_FIELD_NUMBER;
    hash = (53 * hash) + getFetterState();
    hash = (37 * hash) + FETTER_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFetterId();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FetterData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.FetterData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.FetterData parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.FetterData prototype) {
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
   * Protobuf type {@code FetterData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:FetterData)
      io.grasscutter.net.proto.define.FetterDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_FetterData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_FetterData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.FetterData.class, io.grasscutter.net.proto.define.FetterData.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.FetterData.newBuilder()
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
      condIndexList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      fetterState_ = 0;

      fetterId_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_FetterData_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.FetterData getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.FetterData.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.FetterData build() {
      io.grasscutter.net.proto.define.FetterData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.FetterData buildPartial() {
      io.grasscutter.net.proto.define.FetterData result = new io.grasscutter.net.proto.define.FetterData(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        condIndexList_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.condIndexList_ = condIndexList_;
      result.fetterState_ = fetterState_;
      result.fetterId_ = fetterId_;
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
      if (other instanceof io.grasscutter.net.proto.define.FetterData) {
        return mergeFrom((io.grasscutter.net.proto.define.FetterData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.FetterData other) {
      if (other == io.grasscutter.net.proto.define.FetterData.getDefaultInstance()) return this;
      if (!other.condIndexList_.isEmpty()) {
        if (condIndexList_.isEmpty()) {
          condIndexList_ = other.condIndexList_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureCondIndexListIsMutable();
          condIndexList_.addAll(other.condIndexList_);
        }
        onChanged();
      }
      if (other.getFetterState() != 0) {
        setFetterState(other.getFetterState());
      }
      if (other.getFetterId() != 0) {
        setFetterId(other.getFetterId());
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
      io.grasscutter.net.proto.define.FetterData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.FetterData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList condIndexList_ = emptyIntList();
    private void ensureCondIndexListIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        condIndexList_ = mutableCopy(condIndexList_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @return A list containing the condIndexList.
     */
    public java.util.List<java.lang.Integer>
        getCondIndexListList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(condIndexList_) : condIndexList_;
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @return The count of condIndexList.
     */
    public int getCondIndexListCount() {
      return condIndexList_.size();
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @param index The index of the element to return.
     * @return The condIndexList at the given index.
     */
    public int getCondIndexList(int index) {
      return condIndexList_.getInt(index);
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @param index The index to set the value at.
     * @param value The condIndexList to set.
     * @return This builder for chaining.
     */
    public Builder setCondIndexList(
        int index, int value) {
      ensureCondIndexListIsMutable();
      condIndexList_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @param value The condIndexList to add.
     * @return This builder for chaining.
     */
    public Builder addCondIndexList(int value) {
      ensureCondIndexListIsMutable();
      condIndexList_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @param values The condIndexList to add.
     * @return This builder for chaining.
     */
    public Builder addAllCondIndexList(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureCondIndexListIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, condIndexList_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 cond_index_list = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearCondIndexList() {
      condIndexList_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int fetterState_ ;
    /**
     * <code>uint32 fetter_state = 2;</code>
     * @return The fetterState.
     */
    @java.lang.Override
    public int getFetterState() {
      return fetterState_;
    }
    /**
     * <code>uint32 fetter_state = 2;</code>
     * @param value The fetterState to set.
     * @return This builder for chaining.
     */
    public Builder setFetterState(int value) {
      
      fetterState_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fetter_state = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearFetterState() {
      
      fetterState_ = 0;
      onChanged();
      return this;
    }

    private int fetterId_ ;
    /**
     * <code>uint32 fetter_id = 1;</code>
     * @return The fetterId.
     */
    @java.lang.Override
    public int getFetterId() {
      return fetterId_;
    }
    /**
     * <code>uint32 fetter_id = 1;</code>
     * @param value The fetterId to set.
     * @return This builder for chaining.
     */
    public Builder setFetterId(int value) {
      
      fetterId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 fetter_id = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearFetterId() {
      
      fetterId_ = 0;
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


    // @@protoc_insertion_point(builder_scope:FetterData)
  }

  // @@protoc_insertion_point(class_scope:FetterData)
  private static final io.grasscutter.net.proto.define.FetterData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.FetterData();
  }

  public static io.grasscutter.net.proto.define.FetterData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetterData>
      PARSER = new com.google.protobuf.AbstractParser<FetterData>() {
    @java.lang.Override
    public FetterData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new FetterData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<FetterData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetterData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.FetterData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
