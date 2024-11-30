// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

/**
 * <pre>
 * CmdId: 2189
 * </pre>
 *
 * Protobuf type {@code EvtAiSyncCombatThreatInfoNotify}
 */
public final class EvtAiSyncCombatThreatInfoNotify extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EvtAiSyncCombatThreatInfoNotify)
    EvtAiSyncCombatThreatInfoNotifyOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EvtAiSyncCombatThreatInfoNotify.newBuilder() to construct.
  private EvtAiSyncCombatThreatInfoNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EvtAiSyncCombatThreatInfoNotify() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EvtAiSyncCombatThreatInfoNotify();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EvtAiSyncCombatThreatInfoNotify(
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
          case 66: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              combatThreatInfoMap_ = com.google.protobuf.MapField.newMapField(
                  CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>
            combatThreatInfoMap__ = input.readMessage(
                CombatThreatInfoMapDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            combatThreatInfoMap_.getMutableMap().put(
                combatThreatInfoMap__.getKey(), combatThreatInfoMap__.getValue());
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
    return io.grasscutter.net.proto.fight.Fight.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 8:
        return internalGetCombatThreatInfoMap();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.fight.Fight.internal_static_EvtAiSyncCombatThreatInfoNotify_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.class, io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.Builder.class);
  }

  public static final int COMBAT_THREAT_INFO_MAP_FIELD_NUMBER = 8;
  private static final class CombatThreatInfoMapDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>newDefaultInstance(
                io.grasscutter.net.proto.fight.Fight.internal_static_EvtAiSyncCombatThreatInfoNotify_CombatThreatInfoMapEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                io.grasscutter.net.proto.fight.AiThreatInfo.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> combatThreatInfoMap_;
  private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>
  internalGetCombatThreatInfoMap() {
    if (combatThreatInfoMap_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
    }
    return combatThreatInfoMap_;
  }

  public int getCombatThreatInfoMapCount() {
    return internalGetCombatThreatInfoMap().getMap().size();
  }
  /**
   * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
   */

  @java.lang.Override
  public boolean containsCombatThreatInfoMap(
      int key) {
    
    return internalGetCombatThreatInfoMap().getMap().containsKey(key);
  }
  /**
   * Use {@link #getCombatThreatInfoMapMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> getCombatThreatInfoMap() {
    return getCombatThreatInfoMapMap();
  }
  /**
   * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> getCombatThreatInfoMapMap() {
    return internalGetCombatThreatInfoMap().getMap();
  }
  /**
   * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
   */
  @java.lang.Override

  public io.grasscutter.net.proto.fight.AiThreatInfo getCombatThreatInfoMapOrDefault(
      int key,
      io.grasscutter.net.proto.fight.AiThreatInfo defaultValue) {
    
    java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> map =
        internalGetCombatThreatInfoMap().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
   */
  @java.lang.Override

  public io.grasscutter.net.proto.fight.AiThreatInfo getCombatThreatInfoMapOrThrow(
      int key) {
    
    java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> map =
        internalGetCombatThreatInfoMap().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeIntegerMapTo(
        output,
        internalGetCombatThreatInfoMap(),
        CombatThreatInfoMapDefaultEntryHolder.defaultEntry,
        8);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> entry
         : internalGetCombatThreatInfoMap().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>
      combatThreatInfoMap__ = CombatThreatInfoMapDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(8, combatThreatInfoMap__);
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
    if (!(obj instanceof io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify other = (io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify) obj;

    if (!internalGetCombatThreatInfoMap().equals(
        other.internalGetCombatThreatInfoMap())) return false;
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
    if (!internalGetCombatThreatInfoMap().getMap().isEmpty()) {
      hash = (37 * hash) + COMBAT_THREAT_INFO_MAP_FIELD_NUMBER;
      hash = (53 * hash) + internalGetCombatThreatInfoMap().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify prototype) {
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
   * CmdId: 2189
   * </pre>
   *
   * Protobuf type {@code EvtAiSyncCombatThreatInfoNotify}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EvtAiSyncCombatThreatInfoNotify)
      io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotifyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetCombatThreatInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 8:
          return internalGetMutableCombatThreatInfoMap();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EvtAiSyncCombatThreatInfoNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.class, io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.newBuilder()
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
      internalGetMutableCombatThreatInfoMap().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.fight.Fight.internal_static_EvtAiSyncCombatThreatInfoNotify_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify getDefaultInstanceForType() {
      return io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify build() {
      io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify buildPartial() {
      io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify result = new io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify(this);
      int from_bitField0_ = bitField0_;
      result.combatThreatInfoMap_ = internalGetCombatThreatInfoMap();
      result.combatThreatInfoMap_.makeImmutable();
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
      if (other instanceof io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify) {
        return mergeFrom((io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify other) {
      if (other == io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify.getDefaultInstance()) return this;
      internalGetMutableCombatThreatInfoMap().mergeFrom(
          other.internalGetCombatThreatInfoMap());
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
      io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> combatThreatInfoMap_;
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>
    internalGetCombatThreatInfoMap() {
      if (combatThreatInfoMap_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
      }
      return combatThreatInfoMap_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>
    internalGetMutableCombatThreatInfoMap() {
      onChanged();;
      if (combatThreatInfoMap_ == null) {
        combatThreatInfoMap_ = com.google.protobuf.MapField.newMapField(
            CombatThreatInfoMapDefaultEntryHolder.defaultEntry);
      }
      if (!combatThreatInfoMap_.isMutable()) {
        combatThreatInfoMap_ = combatThreatInfoMap_.copy();
      }
      return combatThreatInfoMap_;
    }

    public int getCombatThreatInfoMapCount() {
      return internalGetCombatThreatInfoMap().getMap().size();
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */

    @java.lang.Override
    public boolean containsCombatThreatInfoMap(
        int key) {
      
      return internalGetCombatThreatInfoMap().getMap().containsKey(key);
    }
    /**
     * Use {@link #getCombatThreatInfoMapMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> getCombatThreatInfoMap() {
      return getCombatThreatInfoMapMap();
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> getCombatThreatInfoMapMap() {
      return internalGetCombatThreatInfoMap().getMap();
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */
    @java.lang.Override

    public io.grasscutter.net.proto.fight.AiThreatInfo getCombatThreatInfoMapOrDefault(
        int key,
        io.grasscutter.net.proto.fight.AiThreatInfo defaultValue) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> map =
          internalGetCombatThreatInfoMap().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */
    @java.lang.Override

    public io.grasscutter.net.proto.fight.AiThreatInfo getCombatThreatInfoMapOrThrow(
        int key) {
      
      java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> map =
          internalGetCombatThreatInfoMap().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearCombatThreatInfoMap() {
      internalGetMutableCombatThreatInfoMap().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */

    public Builder removeCombatThreatInfoMap(
        int key) {
      
      internalGetMutableCombatThreatInfoMap().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo>
    getMutableCombatThreatInfoMap() {
      return internalGetMutableCombatThreatInfoMap().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */
    public Builder putCombatThreatInfoMap(
        int key,
        io.grasscutter.net.proto.fight.AiThreatInfo value) {
      
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableCombatThreatInfoMap().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;uint32, .AiThreatInfo&gt; combat_threat_info_map = 8;</code>
     */

    public Builder putAllCombatThreatInfoMap(
        java.util.Map<java.lang.Integer, io.grasscutter.net.proto.fight.AiThreatInfo> values) {
      internalGetMutableCombatThreatInfoMap().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:EvtAiSyncCombatThreatInfoNotify)
  }

  // @@protoc_insertion_point(class_scope:EvtAiSyncCombatThreatInfoNotify)
  private static final io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify();
  }

  public static io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvtAiSyncCombatThreatInfoNotify>
      PARSER = new com.google.protobuf.AbstractParser<EvtAiSyncCombatThreatInfoNotify>() {
    @java.lang.Override
    public EvtAiSyncCombatThreatInfoNotify parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EvtAiSyncCombatThreatInfoNotify(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EvtAiSyncCombatThreatInfoNotify> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvtAiSyncCombatThreatInfoNotify> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.fight.EvtAiSyncCombatThreatInfoNotify getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
