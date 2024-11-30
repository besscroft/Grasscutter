// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf type {@code IACHJPIMDFA}
 */
public final class IACHJPIMDFA extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:IACHJPIMDFA)
    IACHJPIMDFAOrBuilder {
private static final long serialVersionUID = 0L;
  // Use IACHJPIMDFA.newBuilder() to construct.
  private IACHJPIMDFA(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private IACHJPIMDFA() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new IACHJPIMDFA();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private IACHJPIMDFA(
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
            io.grasscutter.net.proto.define.Item.Builder subBuilder = null;
            if (item_ != null) {
              subBuilder = item_.toBuilder();
            }
            item_ = input.readMessage(io.grasscutter.net.proto.define.Item.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(item_);
              item_ = subBuilder.buildPartial();
            }

            break;
          }
          case 16: {

            hMPDPHHDMLC_ = input.readUInt32();
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
    return io.grasscutter.net.proto.define.Define.internal_static_IACHJPIMDFA_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.define.Define.internal_static_IACHJPIMDFA_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.define.IACHJPIMDFA.class, io.grasscutter.net.proto.define.IACHJPIMDFA.Builder.class);
  }

  public static final int ITEM_FIELD_NUMBER = 1;
  private io.grasscutter.net.proto.define.Item item_;
  /**
   * <code>.Item item = 1;</code>
   * @return Whether the item field is set.
   */
  @java.lang.Override
  public boolean hasItem() {
    return item_ != null;
  }
  /**
   * <code>.Item item = 1;</code>
   * @return The item.
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.Item getItem() {
    return item_ == null ? io.grasscutter.net.proto.define.Item.getDefaultInstance() : item_;
  }
  /**
   * <code>.Item item = 1;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.define.ItemOrBuilder getItemOrBuilder() {
    return getItem();
  }

  public static final int HMPDPHHDMLC_FIELD_NUMBER = 2;
  private int hMPDPHHDMLC_;
  /**
   * <code>uint32 HMPDPHHDMLC = 2;</code>
   * @return The hMPDPHHDMLC.
   */
  @java.lang.Override
  public int getHMPDPHHDMLC() {
    return hMPDPHHDMLC_;
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
    if (item_ != null) {
      output.writeMessage(1, getItem());
    }
    if (hMPDPHHDMLC_ != 0) {
      output.writeUInt32(2, hMPDPHHDMLC_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (item_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getItem());
    }
    if (hMPDPHHDMLC_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, hMPDPHHDMLC_);
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
    if (!(obj instanceof io.grasscutter.net.proto.define.IACHJPIMDFA)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.define.IACHJPIMDFA other = (io.grasscutter.net.proto.define.IACHJPIMDFA) obj;

    if (hasItem() != other.hasItem()) return false;
    if (hasItem()) {
      if (!getItem()
          .equals(other.getItem())) return false;
    }
    if (getHMPDPHHDMLC()
        != other.getHMPDPHHDMLC()) return false;
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
    if (hasItem()) {
      hash = (37 * hash) + ITEM_FIELD_NUMBER;
      hash = (53 * hash) + getItem().hashCode();
    }
    hash = (37 * hash) + HMPDPHHDMLC_FIELD_NUMBER;
    hash = (53 * hash) + getHMPDPHHDMLC();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.define.IACHJPIMDFA parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.define.IACHJPIMDFA prototype) {
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
   * Protobuf type {@code IACHJPIMDFA}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:IACHJPIMDFA)
      io.grasscutter.net.proto.define.IACHJPIMDFAOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.define.Define.internal_static_IACHJPIMDFA_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.define.Define.internal_static_IACHJPIMDFA_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.define.IACHJPIMDFA.class, io.grasscutter.net.proto.define.IACHJPIMDFA.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.define.IACHJPIMDFA.newBuilder()
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
      if (itemBuilder_ == null) {
        item_ = null;
      } else {
        item_ = null;
        itemBuilder_ = null;
      }
      hMPDPHHDMLC_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.define.Define.internal_static_IACHJPIMDFA_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.IACHJPIMDFA getDefaultInstanceForType() {
      return io.grasscutter.net.proto.define.IACHJPIMDFA.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.IACHJPIMDFA build() {
      io.grasscutter.net.proto.define.IACHJPIMDFA result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.define.IACHJPIMDFA buildPartial() {
      io.grasscutter.net.proto.define.IACHJPIMDFA result = new io.grasscutter.net.proto.define.IACHJPIMDFA(this);
      if (itemBuilder_ == null) {
        result.item_ = item_;
      } else {
        result.item_ = itemBuilder_.build();
      }
      result.hMPDPHHDMLC_ = hMPDPHHDMLC_;
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
      if (other instanceof io.grasscutter.net.proto.define.IACHJPIMDFA) {
        return mergeFrom((io.grasscutter.net.proto.define.IACHJPIMDFA)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.define.IACHJPIMDFA other) {
      if (other == io.grasscutter.net.proto.define.IACHJPIMDFA.getDefaultInstance()) return this;
      if (other.hasItem()) {
        mergeItem(other.getItem());
      }
      if (other.getHMPDPHHDMLC() != 0) {
        setHMPDPHHDMLC(other.getHMPDPHHDMLC());
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
      io.grasscutter.net.proto.define.IACHJPIMDFA parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.define.IACHJPIMDFA) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private io.grasscutter.net.proto.define.Item item_;
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder> itemBuilder_;
    /**
     * <code>.Item item = 1;</code>
     * @return Whether the item field is set.
     */
    public boolean hasItem() {
      return itemBuilder_ != null || item_ != null;
    }
    /**
     * <code>.Item item = 1;</code>
     * @return The item.
     */
    public io.grasscutter.net.proto.define.Item getItem() {
      if (itemBuilder_ == null) {
        return item_ == null ? io.grasscutter.net.proto.define.Item.getDefaultInstance() : item_;
      } else {
        return itemBuilder_.getMessage();
      }
    }
    /**
     * <code>.Item item = 1;</code>
     */
    public Builder setItem(io.grasscutter.net.proto.define.Item value) {
      if (itemBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        item_ = value;
        onChanged();
      } else {
        itemBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.Item item = 1;</code>
     */
    public Builder setItem(
        io.grasscutter.net.proto.define.Item.Builder builderForValue) {
      if (itemBuilder_ == null) {
        item_ = builderForValue.build();
        onChanged();
      } else {
        itemBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.Item item = 1;</code>
     */
    public Builder mergeItem(io.grasscutter.net.proto.define.Item value) {
      if (itemBuilder_ == null) {
        if (item_ != null) {
          item_ =
            io.grasscutter.net.proto.define.Item.newBuilder(item_).mergeFrom(value).buildPartial();
        } else {
          item_ = value;
        }
        onChanged();
      } else {
        itemBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.Item item = 1;</code>
     */
    public Builder clearItem() {
      if (itemBuilder_ == null) {
        item_ = null;
        onChanged();
      } else {
        item_ = null;
        itemBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.Item item = 1;</code>
     */
    public io.grasscutter.net.proto.define.Item.Builder getItemBuilder() {
      
      onChanged();
      return getItemFieldBuilder().getBuilder();
    }
    /**
     * <code>.Item item = 1;</code>
     */
    public io.grasscutter.net.proto.define.ItemOrBuilder getItemOrBuilder() {
      if (itemBuilder_ != null) {
        return itemBuilder_.getMessageOrBuilder();
      } else {
        return item_ == null ?
            io.grasscutter.net.proto.define.Item.getDefaultInstance() : item_;
      }
    }
    /**
     * <code>.Item item = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder> 
        getItemFieldBuilder() {
      if (itemBuilder_ == null) {
        itemBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            io.grasscutter.net.proto.define.Item, io.grasscutter.net.proto.define.Item.Builder, io.grasscutter.net.proto.define.ItemOrBuilder>(
                getItem(),
                getParentForChildren(),
                isClean());
        item_ = null;
      }
      return itemBuilder_;
    }

    private int hMPDPHHDMLC_ ;
    /**
     * <code>uint32 HMPDPHHDMLC = 2;</code>
     * @return The hMPDPHHDMLC.
     */
    @java.lang.Override
    public int getHMPDPHHDMLC() {
      return hMPDPHHDMLC_;
    }
    /**
     * <code>uint32 HMPDPHHDMLC = 2;</code>
     * @param value The hMPDPHHDMLC to set.
     * @return This builder for chaining.
     */
    public Builder setHMPDPHHDMLC(int value) {
      
      hMPDPHHDMLC_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 HMPDPHHDMLC = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHMPDPHHDMLC() {
      
      hMPDPHHDMLC_ = 0;
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


    // @@protoc_insertion_point(builder_scope:IACHJPIMDFA)
  }

  // @@protoc_insertion_point(class_scope:IACHJPIMDFA)
  private static final io.grasscutter.net.proto.define.IACHJPIMDFA DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.define.IACHJPIMDFA();
  }

  public static io.grasscutter.net.proto.define.IACHJPIMDFA getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IACHJPIMDFA>
      PARSER = new com.google.protobuf.AbstractParser<IACHJPIMDFA>() {
    @java.lang.Override
    public IACHJPIMDFA parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new IACHJPIMDFA(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<IACHJPIMDFA> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IACHJPIMDFA> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.define.IACHJPIMDFA getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
