// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: activity.proto

package io.grasscutter.net.proto.activity;

/**
 * Protobuf type {@code OAMILBDLAID}
 */
public final class OAMILBDLAID extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OAMILBDLAID)
    OAMILBDLAIDOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OAMILBDLAID.newBuilder() to construct.
  private OAMILBDLAID(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OAMILBDLAID() {
    lILDONIELDM_ = java.util.Collections.emptyList();
    aDMKPEPMOAH_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OAMILBDLAID();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OAMILBDLAID(
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
            if (!((mutable_bitField0_ & 0x00000002) != 0)) {
              aDMKPEPMOAH_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.FIDFLFBFHHH>();
              mutable_bitField0_ |= 0x00000002;
            }
            aDMKPEPMOAH_.add(
                input.readMessage(io.grasscutter.net.proto.activity.FIDFLFBFHHH.parser(), extensionRegistry));
            break;
          }
          case 90: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              lILDONIELDM_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.LKKFHDFBAHJ>();
              mutable_bitField0_ |= 0x00000001;
            }
            lILDONIELDM_.add(
                input.readMessage(io.grasscutter.net.proto.activity.LKKFHDFBAHJ.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000002) != 0)) {
        aDMKPEPMOAH_ = java.util.Collections.unmodifiableList(aDMKPEPMOAH_);
      }
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        lILDONIELDM_ = java.util.Collections.unmodifiableList(lILDONIELDM_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_OAMILBDLAID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grasscutter.net.proto.activity.Activity.internal_static_OAMILBDLAID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grasscutter.net.proto.activity.OAMILBDLAID.class, io.grasscutter.net.proto.activity.OAMILBDLAID.Builder.class);
  }

  public static final int LILDONIELDM_FIELD_NUMBER = 11;
  private java.util.List<io.grasscutter.net.proto.activity.LKKFHDFBAHJ> lILDONIELDM_;
  /**
   * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.LKKFHDFBAHJ> getLILDONIELDMList() {
    return lILDONIELDM_;
  }
  /**
   * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder> 
      getLILDONIELDMOrBuilderList() {
    return lILDONIELDM_;
  }
  /**
   * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
   */
  @java.lang.Override
  public int getLILDONIELDMCount() {
    return lILDONIELDM_.size();
  }
  /**
   * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.LKKFHDFBAHJ getLILDONIELDM(int index) {
    return lILDONIELDM_.get(index);
  }
  /**
   * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder getLILDONIELDMOrBuilder(
      int index) {
    return lILDONIELDM_.get(index);
  }

  public static final int ADMKPEPMOAH_FIELD_NUMBER = 8;
  private java.util.List<io.grasscutter.net.proto.activity.FIDFLFBFHHH> aDMKPEPMOAH_;
  /**
   * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
   */
  @java.lang.Override
  public java.util.List<io.grasscutter.net.proto.activity.FIDFLFBFHHH> getADMKPEPMOAHList() {
    return aDMKPEPMOAH_;
  }
  /**
   * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder> 
      getADMKPEPMOAHOrBuilderList() {
    return aDMKPEPMOAH_;
  }
  /**
   * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
   */
  @java.lang.Override
  public int getADMKPEPMOAHCount() {
    return aDMKPEPMOAH_.size();
  }
  /**
   * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.FIDFLFBFHHH getADMKPEPMOAH(int index) {
    return aDMKPEPMOAH_.get(index);
  }
  /**
   * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
   */
  @java.lang.Override
  public io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder getADMKPEPMOAHOrBuilder(
      int index) {
    return aDMKPEPMOAH_.get(index);
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
    for (int i = 0; i < aDMKPEPMOAH_.size(); i++) {
      output.writeMessage(8, aDMKPEPMOAH_.get(i));
    }
    for (int i = 0; i < lILDONIELDM_.size(); i++) {
      output.writeMessage(11, lILDONIELDM_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < aDMKPEPMOAH_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(8, aDMKPEPMOAH_.get(i));
    }
    for (int i = 0; i < lILDONIELDM_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(11, lILDONIELDM_.get(i));
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
    if (!(obj instanceof io.grasscutter.net.proto.activity.OAMILBDLAID)) {
      return super.equals(obj);
    }
    io.grasscutter.net.proto.activity.OAMILBDLAID other = (io.grasscutter.net.proto.activity.OAMILBDLAID) obj;

    if (!getLILDONIELDMList()
        .equals(other.getLILDONIELDMList())) return false;
    if (!getADMKPEPMOAHList()
        .equals(other.getADMKPEPMOAHList())) return false;
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
    if (getLILDONIELDMCount() > 0) {
      hash = (37 * hash) + LILDONIELDM_FIELD_NUMBER;
      hash = (53 * hash) + getLILDONIELDMList().hashCode();
    }
    if (getADMKPEPMOAHCount() > 0) {
      hash = (37 * hash) + ADMKPEPMOAH_FIELD_NUMBER;
      hash = (53 * hash) + getADMKPEPMOAHList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.grasscutter.net.proto.activity.OAMILBDLAID parseFrom(
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
  public static Builder newBuilder(io.grasscutter.net.proto.activity.OAMILBDLAID prototype) {
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
   * Protobuf type {@code OAMILBDLAID}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OAMILBDLAID)
      io.grasscutter.net.proto.activity.OAMILBDLAIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_OAMILBDLAID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_OAMILBDLAID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grasscutter.net.proto.activity.OAMILBDLAID.class, io.grasscutter.net.proto.activity.OAMILBDLAID.Builder.class);
    }

    // Construct using io.grasscutter.net.proto.activity.OAMILBDLAID.newBuilder()
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
        getLILDONIELDMFieldBuilder();
        getADMKPEPMOAHFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (lILDONIELDMBuilder_ == null) {
        lILDONIELDM_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        lILDONIELDMBuilder_.clear();
      }
      if (aDMKPEPMOAHBuilder_ == null) {
        aDMKPEPMOAH_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        aDMKPEPMOAHBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grasscutter.net.proto.activity.Activity.internal_static_OAMILBDLAID_descriptor;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.OAMILBDLAID getDefaultInstanceForType() {
      return io.grasscutter.net.proto.activity.OAMILBDLAID.getDefaultInstance();
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.OAMILBDLAID build() {
      io.grasscutter.net.proto.activity.OAMILBDLAID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grasscutter.net.proto.activity.OAMILBDLAID buildPartial() {
      io.grasscutter.net.proto.activity.OAMILBDLAID result = new io.grasscutter.net.proto.activity.OAMILBDLAID(this);
      int from_bitField0_ = bitField0_;
      if (lILDONIELDMBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          lILDONIELDM_ = java.util.Collections.unmodifiableList(lILDONIELDM_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.lILDONIELDM_ = lILDONIELDM_;
      } else {
        result.lILDONIELDM_ = lILDONIELDMBuilder_.build();
      }
      if (aDMKPEPMOAHBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          aDMKPEPMOAH_ = java.util.Collections.unmodifiableList(aDMKPEPMOAH_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.aDMKPEPMOAH_ = aDMKPEPMOAH_;
      } else {
        result.aDMKPEPMOAH_ = aDMKPEPMOAHBuilder_.build();
      }
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
      if (other instanceof io.grasscutter.net.proto.activity.OAMILBDLAID) {
        return mergeFrom((io.grasscutter.net.proto.activity.OAMILBDLAID)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grasscutter.net.proto.activity.OAMILBDLAID other) {
      if (other == io.grasscutter.net.proto.activity.OAMILBDLAID.getDefaultInstance()) return this;
      if (lILDONIELDMBuilder_ == null) {
        if (!other.lILDONIELDM_.isEmpty()) {
          if (lILDONIELDM_.isEmpty()) {
            lILDONIELDM_ = other.lILDONIELDM_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureLILDONIELDMIsMutable();
            lILDONIELDM_.addAll(other.lILDONIELDM_);
          }
          onChanged();
        }
      } else {
        if (!other.lILDONIELDM_.isEmpty()) {
          if (lILDONIELDMBuilder_.isEmpty()) {
            lILDONIELDMBuilder_.dispose();
            lILDONIELDMBuilder_ = null;
            lILDONIELDM_ = other.lILDONIELDM_;
            bitField0_ = (bitField0_ & ~0x00000001);
            lILDONIELDMBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getLILDONIELDMFieldBuilder() : null;
          } else {
            lILDONIELDMBuilder_.addAllMessages(other.lILDONIELDM_);
          }
        }
      }
      if (aDMKPEPMOAHBuilder_ == null) {
        if (!other.aDMKPEPMOAH_.isEmpty()) {
          if (aDMKPEPMOAH_.isEmpty()) {
            aDMKPEPMOAH_ = other.aDMKPEPMOAH_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureADMKPEPMOAHIsMutable();
            aDMKPEPMOAH_.addAll(other.aDMKPEPMOAH_);
          }
          onChanged();
        }
      } else {
        if (!other.aDMKPEPMOAH_.isEmpty()) {
          if (aDMKPEPMOAHBuilder_.isEmpty()) {
            aDMKPEPMOAHBuilder_.dispose();
            aDMKPEPMOAHBuilder_ = null;
            aDMKPEPMOAH_ = other.aDMKPEPMOAH_;
            bitField0_ = (bitField0_ & ~0x00000002);
            aDMKPEPMOAHBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getADMKPEPMOAHFieldBuilder() : null;
          } else {
            aDMKPEPMOAHBuilder_.addAllMessages(other.aDMKPEPMOAH_);
          }
        }
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
      io.grasscutter.net.proto.activity.OAMILBDLAID parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grasscutter.net.proto.activity.OAMILBDLAID) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<io.grasscutter.net.proto.activity.LKKFHDFBAHJ> lILDONIELDM_ =
      java.util.Collections.emptyList();
    private void ensureLILDONIELDMIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        lILDONIELDM_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.LKKFHDFBAHJ>(lILDONIELDM_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.LKKFHDFBAHJ, io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder, io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder> lILDONIELDMBuilder_;

    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.LKKFHDFBAHJ> getLILDONIELDMList() {
      if (lILDONIELDMBuilder_ == null) {
        return java.util.Collections.unmodifiableList(lILDONIELDM_);
      } else {
        return lILDONIELDMBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public int getLILDONIELDMCount() {
      if (lILDONIELDMBuilder_ == null) {
        return lILDONIELDM_.size();
      } else {
        return lILDONIELDMBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public io.grasscutter.net.proto.activity.LKKFHDFBAHJ getLILDONIELDM(int index) {
      if (lILDONIELDMBuilder_ == null) {
        return lILDONIELDM_.get(index);
      } else {
        return lILDONIELDMBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder setLILDONIELDM(
        int index, io.grasscutter.net.proto.activity.LKKFHDFBAHJ value) {
      if (lILDONIELDMBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.set(index, value);
        onChanged();
      } else {
        lILDONIELDMBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder setLILDONIELDM(
        int index, io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder builderForValue) {
      if (lILDONIELDMBuilder_ == null) {
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.set(index, builderForValue.build());
        onChanged();
      } else {
        lILDONIELDMBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder addLILDONIELDM(io.grasscutter.net.proto.activity.LKKFHDFBAHJ value) {
      if (lILDONIELDMBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.add(value);
        onChanged();
      } else {
        lILDONIELDMBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder addLILDONIELDM(
        int index, io.grasscutter.net.proto.activity.LKKFHDFBAHJ value) {
      if (lILDONIELDMBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.add(index, value);
        onChanged();
      } else {
        lILDONIELDMBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder addLILDONIELDM(
        io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder builderForValue) {
      if (lILDONIELDMBuilder_ == null) {
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.add(builderForValue.build());
        onChanged();
      } else {
        lILDONIELDMBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder addLILDONIELDM(
        int index, io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder builderForValue) {
      if (lILDONIELDMBuilder_ == null) {
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.add(index, builderForValue.build());
        onChanged();
      } else {
        lILDONIELDMBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder addAllLILDONIELDM(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.LKKFHDFBAHJ> values) {
      if (lILDONIELDMBuilder_ == null) {
        ensureLILDONIELDMIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, lILDONIELDM_);
        onChanged();
      } else {
        lILDONIELDMBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder clearLILDONIELDM() {
      if (lILDONIELDMBuilder_ == null) {
        lILDONIELDM_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        lILDONIELDMBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public Builder removeLILDONIELDM(int index) {
      if (lILDONIELDMBuilder_ == null) {
        ensureLILDONIELDMIsMutable();
        lILDONIELDM_.remove(index);
        onChanged();
      } else {
        lILDONIELDMBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder getLILDONIELDMBuilder(
        int index) {
      return getLILDONIELDMFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder getLILDONIELDMOrBuilder(
        int index) {
      if (lILDONIELDMBuilder_ == null) {
        return lILDONIELDM_.get(index);  } else {
        return lILDONIELDMBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder> 
         getLILDONIELDMOrBuilderList() {
      if (lILDONIELDMBuilder_ != null) {
        return lILDONIELDMBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(lILDONIELDM_);
      }
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder addLILDONIELDMBuilder() {
      return getLILDONIELDMFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.LKKFHDFBAHJ.getDefaultInstance());
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder addLILDONIELDMBuilder(
        int index) {
      return getLILDONIELDMFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.LKKFHDFBAHJ.getDefaultInstance());
    }
    /**
     * <code>repeated .LKKFHDFBAHJ LILDONIELDM = 11;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder> 
         getLILDONIELDMBuilderList() {
      return getLILDONIELDMFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.LKKFHDFBAHJ, io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder, io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder> 
        getLILDONIELDMFieldBuilder() {
      if (lILDONIELDMBuilder_ == null) {
        lILDONIELDMBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.LKKFHDFBAHJ, io.grasscutter.net.proto.activity.LKKFHDFBAHJ.Builder, io.grasscutter.net.proto.activity.LKKFHDFBAHJOrBuilder>(
                lILDONIELDM_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        lILDONIELDM_ = null;
      }
      return lILDONIELDMBuilder_;
    }

    private java.util.List<io.grasscutter.net.proto.activity.FIDFLFBFHHH> aDMKPEPMOAH_ =
      java.util.Collections.emptyList();
    private void ensureADMKPEPMOAHIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        aDMKPEPMOAH_ = new java.util.ArrayList<io.grasscutter.net.proto.activity.FIDFLFBFHHH>(aDMKPEPMOAH_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.FIDFLFBFHHH, io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder, io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder> aDMKPEPMOAHBuilder_;

    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.FIDFLFBFHHH> getADMKPEPMOAHList() {
      if (aDMKPEPMOAHBuilder_ == null) {
        return java.util.Collections.unmodifiableList(aDMKPEPMOAH_);
      } else {
        return aDMKPEPMOAHBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public int getADMKPEPMOAHCount() {
      if (aDMKPEPMOAHBuilder_ == null) {
        return aDMKPEPMOAH_.size();
      } else {
        return aDMKPEPMOAHBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public io.grasscutter.net.proto.activity.FIDFLFBFHHH getADMKPEPMOAH(int index) {
      if (aDMKPEPMOAHBuilder_ == null) {
        return aDMKPEPMOAH_.get(index);
      } else {
        return aDMKPEPMOAHBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder setADMKPEPMOAH(
        int index, io.grasscutter.net.proto.activity.FIDFLFBFHHH value) {
      if (aDMKPEPMOAHBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.set(index, value);
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder setADMKPEPMOAH(
        int index, io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder builderForValue) {
      if (aDMKPEPMOAHBuilder_ == null) {
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.set(index, builderForValue.build());
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder addADMKPEPMOAH(io.grasscutter.net.proto.activity.FIDFLFBFHHH value) {
      if (aDMKPEPMOAHBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.add(value);
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder addADMKPEPMOAH(
        int index, io.grasscutter.net.proto.activity.FIDFLFBFHHH value) {
      if (aDMKPEPMOAHBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.add(index, value);
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder addADMKPEPMOAH(
        io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder builderForValue) {
      if (aDMKPEPMOAHBuilder_ == null) {
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.add(builderForValue.build());
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder addADMKPEPMOAH(
        int index, io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder builderForValue) {
      if (aDMKPEPMOAHBuilder_ == null) {
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.add(index, builderForValue.build());
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder addAllADMKPEPMOAH(
        java.lang.Iterable<? extends io.grasscutter.net.proto.activity.FIDFLFBFHHH> values) {
      if (aDMKPEPMOAHBuilder_ == null) {
        ensureADMKPEPMOAHIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, aDMKPEPMOAH_);
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder clearADMKPEPMOAH() {
      if (aDMKPEPMOAHBuilder_ == null) {
        aDMKPEPMOAH_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public Builder removeADMKPEPMOAH(int index) {
      if (aDMKPEPMOAHBuilder_ == null) {
        ensureADMKPEPMOAHIsMutable();
        aDMKPEPMOAH_.remove(index);
        onChanged();
      } else {
        aDMKPEPMOAHBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder getADMKPEPMOAHBuilder(
        int index) {
      return getADMKPEPMOAHFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder getADMKPEPMOAHOrBuilder(
        int index) {
      if (aDMKPEPMOAHBuilder_ == null) {
        return aDMKPEPMOAH_.get(index);  } else {
        return aDMKPEPMOAHBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public java.util.List<? extends io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder> 
         getADMKPEPMOAHOrBuilderList() {
      if (aDMKPEPMOAHBuilder_ != null) {
        return aDMKPEPMOAHBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(aDMKPEPMOAH_);
      }
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder addADMKPEPMOAHBuilder() {
      return getADMKPEPMOAHFieldBuilder().addBuilder(
          io.grasscutter.net.proto.activity.FIDFLFBFHHH.getDefaultInstance());
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder addADMKPEPMOAHBuilder(
        int index) {
      return getADMKPEPMOAHFieldBuilder().addBuilder(
          index, io.grasscutter.net.proto.activity.FIDFLFBFHHH.getDefaultInstance());
    }
    /**
     * <code>repeated .FIDFLFBFHHH ADMKPEPMOAH = 8;</code>
     */
    public java.util.List<io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder> 
         getADMKPEPMOAHBuilderList() {
      return getADMKPEPMOAHFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.grasscutter.net.proto.activity.FIDFLFBFHHH, io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder, io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder> 
        getADMKPEPMOAHFieldBuilder() {
      if (aDMKPEPMOAHBuilder_ == null) {
        aDMKPEPMOAHBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.grasscutter.net.proto.activity.FIDFLFBFHHH, io.grasscutter.net.proto.activity.FIDFLFBFHHH.Builder, io.grasscutter.net.proto.activity.FIDFLFBFHHHOrBuilder>(
                aDMKPEPMOAH_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        aDMKPEPMOAH_ = null;
      }
      return aDMKPEPMOAHBuilder_;
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


    // @@protoc_insertion_point(builder_scope:OAMILBDLAID)
  }

  // @@protoc_insertion_point(class_scope:OAMILBDLAID)
  private static final io.grasscutter.net.proto.activity.OAMILBDLAID DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grasscutter.net.proto.activity.OAMILBDLAID();
  }

  public static io.grasscutter.net.proto.activity.OAMILBDLAID getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OAMILBDLAID>
      PARSER = new com.google.protobuf.AbstractParser<OAMILBDLAID>() {
    @java.lang.Override
    public OAMILBDLAID parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OAMILBDLAID(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OAMILBDLAID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OAMILBDLAID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grasscutter.net.proto.activity.OAMILBDLAID getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
