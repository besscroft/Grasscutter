// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: AbilityMixinWindZone.proto

package emu.grasscutter.net.proto;

public final class AbilityMixinWindZoneOuterClass {
  private AbilityMixinWindZoneOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface AbilityMixinWindZoneOrBuilder extends
      // @@protoc_insertion_point(interface_extends:AbilityMixinWindZone)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated uint32 OOMECOLCCFO = 1;</code>
     * @return A list containing the oOMECOLCCFO.
     */
    java.util.List<java.lang.Integer> getOOMECOLCCFOList();
    /**
     * <code>repeated uint32 OOMECOLCCFO = 1;</code>
     * @return The count of oOMECOLCCFO.
     */
    int getOOMECOLCCFOCount();
    /**
     * <code>repeated uint32 OOMECOLCCFO = 1;</code>
     * @param index The index of the element to return.
     * @return The oOMECOLCCFO at the given index.
     */
    int getOOMECOLCCFO(int index);

    /**
     * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
     * @return A list containing the iJMOCHLFJGC.
     */
    java.util.List<java.lang.Integer> getIJMOCHLFJGCList();
    /**
     * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
     * @return The count of iJMOCHLFJGC.
     */
    int getIJMOCHLFJGCCount();
    /**
     * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
     * @param index The index of the element to return.
     * @return The iJMOCHLFJGC at the given index.
     */
    int getIJMOCHLFJGC(int index);
  }
  /**
   * <pre>
   * Obf: LHDGHFOILLH
   * </pre>
   *
   * Protobuf type {@code AbilityMixinWindZone}
   */
  public static final class AbilityMixinWindZone extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:AbilityMixinWindZone)
      AbilityMixinWindZoneOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use AbilityMixinWindZone.newBuilder() to construct.
    private AbilityMixinWindZone(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private AbilityMixinWindZone() {
      oOMECOLCCFO_ = emptyIntList();
      iJMOCHLFJGC_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new AbilityMixinWindZone();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private AbilityMixinWindZone(
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
                oOMECOLCCFO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              oOMECOLCCFO_.addInt(input.readUInt32());
              break;
            }
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                oOMECOLCCFO_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                oOMECOLCCFO_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            case 112: {
              if (!((mutable_bitField0_ & 0x00000002) != 0)) {
                iJMOCHLFJGC_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              iJMOCHLFJGC_.addInt(input.readUInt32());
              break;
            }
            case 114: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000002) != 0) && input.getBytesUntilLimit() > 0) {
                iJMOCHLFJGC_ = newIntList();
                mutable_bitField0_ |= 0x00000002;
              }
              while (input.getBytesUntilLimit() > 0) {
                iJMOCHLFJGC_.addInt(input.readUInt32());
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
          oOMECOLCCFO_.makeImmutable(); // C
        }
        if (((mutable_bitField0_ & 0x00000002) != 0)) {
          iJMOCHLFJGC_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.internal_static_AbilityMixinWindZone_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.internal_static_AbilityMixinWindZone_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.class, emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.Builder.class);
    }

    public static final int OOMECOLCCFO_FIELD_NUMBER = 1;
    private com.google.protobuf.Internal.IntList oOMECOLCCFO_;
    /**
     * <code>repeated uint32 OOMECOLCCFO = 1;</code>
     * @return A list containing the oOMECOLCCFO.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getOOMECOLCCFOList() {
      return oOMECOLCCFO_;
    }
    /**
     * <code>repeated uint32 OOMECOLCCFO = 1;</code>
     * @return The count of oOMECOLCCFO.
     */
    public int getOOMECOLCCFOCount() {
      return oOMECOLCCFO_.size();
    }
    /**
     * <code>repeated uint32 OOMECOLCCFO = 1;</code>
     * @param index The index of the element to return.
     * @return The oOMECOLCCFO at the given index.
     */
    public int getOOMECOLCCFO(int index) {
      return oOMECOLCCFO_.getInt(index);
    }
    private int oOMECOLCCFOMemoizedSerializedSize = -1;

    public static final int IJMOCHLFJGC_FIELD_NUMBER = 14;
    private com.google.protobuf.Internal.IntList iJMOCHLFJGC_;
    /**
     * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
     * @return A list containing the iJMOCHLFJGC.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getIJMOCHLFJGCList() {
      return iJMOCHLFJGC_;
    }
    /**
     * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
     * @return The count of iJMOCHLFJGC.
     */
    public int getIJMOCHLFJGCCount() {
      return iJMOCHLFJGC_.size();
    }
    /**
     * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
     * @param index The index of the element to return.
     * @return The iJMOCHLFJGC at the given index.
     */
    public int getIJMOCHLFJGC(int index) {
      return iJMOCHLFJGC_.getInt(index);
    }
    private int iJMOCHLFJGCMemoizedSerializedSize = -1;

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
      if (getOOMECOLCCFOList().size() > 0) {
        output.writeUInt32NoTag(10);
        output.writeUInt32NoTag(oOMECOLCCFOMemoizedSerializedSize);
      }
      for (int i = 0; i < oOMECOLCCFO_.size(); i++) {
        output.writeUInt32NoTag(oOMECOLCCFO_.getInt(i));
      }
      if (getIJMOCHLFJGCList().size() > 0) {
        output.writeUInt32NoTag(114);
        output.writeUInt32NoTag(iJMOCHLFJGCMemoizedSerializedSize);
      }
      for (int i = 0; i < iJMOCHLFJGC_.size(); i++) {
        output.writeUInt32NoTag(iJMOCHLFJGC_.getInt(i));
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
        for (int i = 0; i < oOMECOLCCFO_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(oOMECOLCCFO_.getInt(i));
        }
        size += dataSize;
        if (!getOOMECOLCCFOList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        oOMECOLCCFOMemoizedSerializedSize = dataSize;
      }
      {
        int dataSize = 0;
        for (int i = 0; i < iJMOCHLFJGC_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(iJMOCHLFJGC_.getInt(i));
        }
        size += dataSize;
        if (!getIJMOCHLFJGCList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        iJMOCHLFJGCMemoizedSerializedSize = dataSize;
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
      if (!(obj instanceof emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone other = (emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone) obj;

      if (!getOOMECOLCCFOList()
          .equals(other.getOOMECOLCCFOList())) return false;
      if (!getIJMOCHLFJGCList()
          .equals(other.getIJMOCHLFJGCList())) return false;
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
      if (getOOMECOLCCFOCount() > 0) {
        hash = (37 * hash) + OOMECOLCCFO_FIELD_NUMBER;
        hash = (53 * hash) + getOOMECOLCCFOList().hashCode();
      }
      if (getIJMOCHLFJGCCount() > 0) {
        hash = (37 * hash) + IJMOCHLFJGC_FIELD_NUMBER;
        hash = (53 * hash) + getIJMOCHLFJGCList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone prototype) {
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
     * Obf: LHDGHFOILLH
     * </pre>
     *
     * Protobuf type {@code AbilityMixinWindZone}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:AbilityMixinWindZone)
        emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZoneOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.internal_static_AbilityMixinWindZone_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.internal_static_AbilityMixinWindZone_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.class, emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.newBuilder()
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
        oOMECOLCCFO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        iJMOCHLFJGC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.internal_static_AbilityMixinWindZone_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone build() {
        emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone buildPartial() {
        emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone result = new emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone(this);
        int from_bitField0_ = bitField0_;
        if (((bitField0_ & 0x00000001) != 0)) {
          oOMECOLCCFO_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.oOMECOLCCFO_ = oOMECOLCCFO_;
        if (((bitField0_ & 0x00000002) != 0)) {
          iJMOCHLFJGC_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.iJMOCHLFJGC_ = iJMOCHLFJGC_;
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
        if (other instanceof emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone) {
          return mergeFrom((emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone other) {
        if (other == emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone.getDefaultInstance()) return this;
        if (!other.oOMECOLCCFO_.isEmpty()) {
          if (oOMECOLCCFO_.isEmpty()) {
            oOMECOLCCFO_ = other.oOMECOLCCFO_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOOMECOLCCFOIsMutable();
            oOMECOLCCFO_.addAll(other.oOMECOLCCFO_);
          }
          onChanged();
        }
        if (!other.iJMOCHLFJGC_.isEmpty()) {
          if (iJMOCHLFJGC_.isEmpty()) {
            iJMOCHLFJGC_ = other.iJMOCHLFJGC_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureIJMOCHLFJGCIsMutable();
            iJMOCHLFJGC_.addAll(other.iJMOCHLFJGC_);
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
        emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private com.google.protobuf.Internal.IntList oOMECOLCCFO_ = emptyIntList();
      private void ensureOOMECOLCCFOIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          oOMECOLCCFO_ = mutableCopy(oOMECOLCCFO_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @return A list containing the oOMECOLCCFO.
       */
      public java.util.List<java.lang.Integer>
          getOOMECOLCCFOList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(oOMECOLCCFO_) : oOMECOLCCFO_;
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @return The count of oOMECOLCCFO.
       */
      public int getOOMECOLCCFOCount() {
        return oOMECOLCCFO_.size();
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @param index The index of the element to return.
       * @return The oOMECOLCCFO at the given index.
       */
      public int getOOMECOLCCFO(int index) {
        return oOMECOLCCFO_.getInt(index);
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @param index The index to set the value at.
       * @param value The oOMECOLCCFO to set.
       * @return This builder for chaining.
       */
      public Builder setOOMECOLCCFO(
          int index, int value) {
        ensureOOMECOLCCFOIsMutable();
        oOMECOLCCFO_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @param value The oOMECOLCCFO to add.
       * @return This builder for chaining.
       */
      public Builder addOOMECOLCCFO(int value) {
        ensureOOMECOLCCFOIsMutable();
        oOMECOLCCFO_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @param values The oOMECOLCCFO to add.
       * @return This builder for chaining.
       */
      public Builder addAllOOMECOLCCFO(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureOOMECOLCCFOIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, oOMECOLCCFO_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 OOMECOLCCFO = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearOOMECOLCCFO() {
        oOMECOLCCFO_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList iJMOCHLFJGC_ = emptyIntList();
      private void ensureIJMOCHLFJGCIsMutable() {
        if (!((bitField0_ & 0x00000002) != 0)) {
          iJMOCHLFJGC_ = mutableCopy(iJMOCHLFJGC_);
          bitField0_ |= 0x00000002;
         }
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @return A list containing the iJMOCHLFJGC.
       */
      public java.util.List<java.lang.Integer>
          getIJMOCHLFJGCList() {
        return ((bitField0_ & 0x00000002) != 0) ?
                 java.util.Collections.unmodifiableList(iJMOCHLFJGC_) : iJMOCHLFJGC_;
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @return The count of iJMOCHLFJGC.
       */
      public int getIJMOCHLFJGCCount() {
        return iJMOCHLFJGC_.size();
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @param index The index of the element to return.
       * @return The iJMOCHLFJGC at the given index.
       */
      public int getIJMOCHLFJGC(int index) {
        return iJMOCHLFJGC_.getInt(index);
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @param index The index to set the value at.
       * @param value The iJMOCHLFJGC to set.
       * @return This builder for chaining.
       */
      public Builder setIJMOCHLFJGC(
          int index, int value) {
        ensureIJMOCHLFJGCIsMutable();
        iJMOCHLFJGC_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @param value The iJMOCHLFJGC to add.
       * @return This builder for chaining.
       */
      public Builder addIJMOCHLFJGC(int value) {
        ensureIJMOCHLFJGCIsMutable();
        iJMOCHLFJGC_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @param values The iJMOCHLFJGC to add.
       * @return This builder for chaining.
       */
      public Builder addAllIJMOCHLFJGC(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureIJMOCHLFJGCIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, iJMOCHLFJGC_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 IJMOCHLFJGC = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearIJMOCHLFJGC() {
        iJMOCHLFJGC_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000002);
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


      // @@protoc_insertion_point(builder_scope:AbilityMixinWindZone)
    }

    // @@protoc_insertion_point(class_scope:AbilityMixinWindZone)
    private static final emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone();
    }

    public static emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<AbilityMixinWindZone>
        PARSER = new com.google.protobuf.AbstractParser<AbilityMixinWindZone>() {
      @java.lang.Override
      public AbilityMixinWindZone parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new AbilityMixinWindZone(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<AbilityMixinWindZone> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<AbilityMixinWindZone> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.AbilityMixinWindZoneOuterClass.AbilityMixinWindZone getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityMixinWindZone_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityMixinWindZone_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\032AbilityMixinWindZone.proto\"@\n\024AbilityM" +
      "ixinWindZone\022\023\n\013OOMECOLCCFO\030\001 \003(\r\022\023\n\013IJM" +
      "OCHLFJGC\030\016 \003(\rB\033\n\031emu.grasscutter.net.pr" +
      "otob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_AbilityMixinWindZone_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityMixinWindZone_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityMixinWindZone_descriptor,
        new java.lang.String[] { "OOMECOLCCFO", "IJMOCHLFJGC", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}