// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code MOOKABDAJLO}
 */
public final class MOOKABDAJLO extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:MOOKABDAJLO)
    MOOKABDAJLOOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MOOKABDAJLO.newBuilder() to construct.
  private MOOKABDAJLO(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MOOKABDAJLO() {
    nKOCEDMEAEO_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MOOKABDAJLO();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MOOKABDAJLO(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              nKOCEDMEAEO_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            nKOCEDMEAEO_.addInt(input.readUInt32());
            break;
          }
          case 10: {
            int length = input.readRawVarint32();
            int limit = input.pushLimit(length);
            if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
              nKOCEDMEAEO_ = newIntList();
              mutable_bitField0_ |= 0x00000001;
            }
            while (input.getBytesUntilLimit() > 0) {
              nKOCEDMEAEO_.addInt(input.readUInt32());
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
        nKOCEDMEAEO_.makeImmutable(); // C
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.define.Define.internal_static_MOOKABDAJLO_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_MOOKABDAJLO_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.MOOKABDAJLO.class, io.grasscutter.net.proto.define.MOOKABDAJLO.Builder.class);
  }

  public static final int NKOCEDMEAEO_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.IntList nKOCEDMEAEO_;
  /**
   * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
   * @return A list containing the nKOCEDMEAEO.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getNKOCEDMEAEOList() {
    return nKOCEDMEAEO_;
  }
  /**
   * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
   * @return The count of nKOCEDMEAEO.
   */
  public int getNKOCEDMEAEOCount() {
    return nKOCEDMEAEO_.size();
  }
  /**
   * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
   * @param index The index of the element to return.
   * @return The nKOCEDMEAEO at the given index.
   */
  public int getNKOCEDMEAEO(int index) {
    return nKOCEDMEAEO_.getInt(index);
  }
  private int nKOCEDMEAEOMemoizedSerializedSize = -1;

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
    if (getNKOCEDMEAEOList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(nKOCEDMEAEOMemoizedSerializedSize);
    }
    for (int i = 0; i < nKOCEDMEAEO_.size(); i++) {
      output.writeUInt32NoTag(nKOCEDMEAEO_.getInt(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < nKOCEDMEAEO_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(nKOCEDMEAEO_.getInt(i));
      }
      size += dataSize;
      if (!getNKOCEDMEAEOList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      nKOCEDMEAEOMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof io.grasscutter.net.proto.define.MOOKABDAJLO)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.MOOKABDAJLO other = (io.grasscutter.net.proto.define.MOOKABDAJLO) obj;

    if (!getNKOCEDMEAEOList()
        .equals(other.getNKOCEDMEAEOList())) return false;
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
    if (getNKOCEDMEAEOCount() > 0) {
      hash = (37 * hash) + NKOCEDMEAEO_FIELD_NUMBER;
      hash = (53 * hash) + getNKOCEDMEAEOList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.MOOKABDAJLO parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.MOOKABDAJLO prototype) {
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
   * Protobuf type {@code MOOKABDAJLO}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:MOOKABDAJLO)
      io.grasscutter.net.proto.define.MOOKABDAJLOOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_MOOKABDAJLO_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_MOOKABDAJLO_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.MOOKABDAJLO.class, io.grasscutter.net.proto.define.MOOKABDAJLO.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.MOOKABDAJLO.newBuilder()
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
      nKOCEDMEAEO_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_MOOKABDAJLO_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.MOOKABDAJLO getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.MOOKABDAJLO.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.MOOKABDAJLO build() {
      io.grasscutter.net.proto.define.MOOKABDAJLO result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.MOOKABDAJLO buildPartial() {
      io.grasscutter.net.proto.define.MOOKABDAJLO result = new io.grasscutter.net.proto.define.MOOKABDAJLO(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        nKOCEDMEAEO_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.nKOCEDMEAEO_ = nKOCEDMEAEO_;
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
      if (other instanceof io.grasscutter.net.proto.define.MOOKABDAJLO) {
        return mergeFrom((io.grasscutter.net.proto.define.MOOKABDAJLO)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.MOOKABDAJLO other) {
      if (other == io.grasscutter.net.proto.define.MOOKABDAJLO.getDefaultInstance()) return this;
      if (!other.nKOCEDMEAEO_.isEmpty()) {
        if (nKOCEDMEAEO_.isEmpty()) {
          nKOCEDMEAEO_ = other.nKOCEDMEAEO_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureNKOCEDMEAEOIsMutable();
          nKOCEDMEAEO_.addAll(other.nKOCEDMEAEO_);
        }
        onChanged();
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
      io.grasscutter.net.proto.define.MOOKABDAJLO parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.MOOKABDAJLO) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.Internal.IntList nKOCEDMEAEO_ = emptyIntList();
    private void ensureNKOCEDMEAEOIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nKOCEDMEAEO_ = mutableCopy(nKOCEDMEAEO_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @return A list containing the nKOCEDMEAEO.
     */
    public java.util.List<java.lang.Integer>
        getNKOCEDMEAEOList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(nKOCEDMEAEO_) : nKOCEDMEAEO_;
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @return The count of nKOCEDMEAEO.
     */
    public int getNKOCEDMEAEOCount() {
      return nKOCEDMEAEO_.size();
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @param index The index of the element to return.
     * @return The nKOCEDMEAEO at the given index.
     */
    public int getNKOCEDMEAEO(int index) {
      return nKOCEDMEAEO_.getInt(index);
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @param index The index to set the value at.
     * @param value The nKOCEDMEAEO to set.
     * @return This builder for chaining.
     */
    public Builder setNKOCEDMEAEO(
        int index, int value) {
      ensureNKOCEDMEAEOIsMutable();
      nKOCEDMEAEO_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @param value The nKOCEDMEAEO to add.
     * @return This builder for chaining.
     */
    public Builder addNKOCEDMEAEO(int value) {
      ensureNKOCEDMEAEOIsMutable();
      nKOCEDMEAEO_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @param values The nKOCEDMEAEO to add.
     * @return This builder for chaining.
     */
    public Builder addAllNKOCEDMEAEO(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureNKOCEDMEAEOIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, nKOCEDMEAEO_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 NKOCEDMEAEO = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearNKOCEDMEAEO() {
      nKOCEDMEAEO_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
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


    // @@protoc_insertion_point(builder_scope:MOOKABDAJLO)
  }

  // @@protoc_insertion_point(class_scope:MOOKABDAJLO)
  private static final io.grasscutter.net.proto.define.MOOKABDAJLO DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.MOOKABDAJLO();
  }

  public static io.grasscutter.net.proto.define.MOOKABDAJLO getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MOOKABDAJLO>
      PARSER = new com.google.protobuf.AbstractParser<MOOKABDAJLO>() {
    @java.lang.Override
    public MOOKABDAJLO parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MOOKABDAJLO(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MOOKABDAJLO> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MOOKABDAJLO> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.MOOKABDAJLO getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
