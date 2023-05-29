// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: EMPCLMJBHKF.proto

package emu.grasscutter.net.proto;

public final class EMPCLMJBHKFOuterClass {
    private EMPCLMJBHKFOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface EMPCLMJBHKFOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:EMPCLMJBHKF)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>repeated uint32 tag_list = 14;</code>
         *
         * @return A list containing the tagList.
         */
        java.util.List<java.lang.Integer> getTagListList();
        /**
         * <code>repeated uint32 tag_list = 14;</code>
         *
         * @return The count of tagList.
         */
        int getTagListCount();
        /**
         * <code>repeated uint32 tag_list = 14;</code>
         *
         * @param index The index of the element to return.
         * @return The tagList at the given index.
         */
        int getTagList(int index);

        /**
         * <code>bool DNOFGBKGANP = 9;</code>
         *
         * @return The dNOFGBKGANP.
         */
        boolean getDNOFGBKGANP();

        /**
         * <code>uint64 guid = 5;</code>
         *
         * @return The guid.
         */
        long getGuid();
    }
    /**
     *
     *
     * <pre>
     * CmdId: 9248
     * </pre>
     *
     * Protobuf type {@code EMPCLMJBHKF}
     */
    public static final class EMPCLMJBHKF extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:EMPCLMJBHKF)
            EMPCLMJBHKFOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use EMPCLMJBHKF.newBuilder() to construct.
        private EMPCLMJBHKF(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private EMPCLMJBHKF() {
            tagList_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new EMPCLMJBHKF();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private EMPCLMJBHKF(
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
                        case 40:
                            {
                                guid_ = input.readUInt64();
                                break;
                            }
                        case 72:
                            {
                                dNOFGBKGANP_ = input.readBool();
                                break;
                            }
                        case 112:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    tagList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                tagList_.addInt(input.readUInt32());
                                break;
                            }
                        case 114:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    tagList_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    tagList_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        default:
                            {
                                if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                                    done = true;
                                }
                                break;
                            }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
            } finally {
                if (((mutable_bitField0_ & 0x00000001) != 0)) {
                    tagList_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.internal_static_EMPCLMJBHKF_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass
                    .internal_static_EMPCLMJBHKF_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.class,
                            emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.Builder.class);
        }

        public static final int TAG_LIST_FIELD_NUMBER = 14;
        private com.google.protobuf.Internal.IntList tagList_;
        /**
         * <code>repeated uint32 tag_list = 14;</code>
         *
         * @return A list containing the tagList.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getTagListList() {
            return tagList_;
        }
        /**
         * <code>repeated uint32 tag_list = 14;</code>
         *
         * @return The count of tagList.
         */
        public int getTagListCount() {
            return tagList_.size();
        }
        /**
         * <code>repeated uint32 tag_list = 14;</code>
         *
         * @param index The index of the element to return.
         * @return The tagList at the given index.
         */
        public int getTagList(int index) {
            return tagList_.getInt(index);
        }

        private int tagListMemoizedSerializedSize = -1;

        public static final int DNOFGBKGANP_FIELD_NUMBER = 9;
        private boolean dNOFGBKGANP_;
        /**
         * <code>bool DNOFGBKGANP = 9;</code>
         *
         * @return The dNOFGBKGANP.
         */
        @java.lang.Override
        public boolean getDNOFGBKGANP() {
            return dNOFGBKGANP_;
        }

        public static final int GUID_FIELD_NUMBER = 5;
        private long guid_;
        /**
         * <code>uint64 guid = 5;</code>
         *
         * @return The guid.
         */
        @java.lang.Override
        public long getGuid() {
            return guid_;
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
        public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
            getSerializedSize();
            if (guid_ != 0L) {
                output.writeUInt64(5, guid_);
            }
            if (dNOFGBKGANP_ != false) {
                output.writeBool(9, dNOFGBKGANP_);
            }
            if (getTagListList().size() > 0) {
                output.writeUInt32NoTag(114);
                output.writeUInt32NoTag(tagListMemoizedSerializedSize);
            }
            for (int i = 0; i < tagList_.size(); i++) {
                output.writeUInt32NoTag(tagList_.getInt(i));
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (guid_ != 0L) {
                size += com.google.protobuf.CodedOutputStream.computeUInt64Size(5, guid_);
            }
            if (dNOFGBKGANP_ != false) {
                size += com.google.protobuf.CodedOutputStream.computeBoolSize(9, dNOFGBKGANP_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < tagList_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(tagList_.getInt(i));
                }
                size += dataSize;
                if (!getTagListList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                tagListMemoizedSerializedSize = dataSize;
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
            if (!(obj instanceof emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF other =
                    (emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF) obj;

            if (!getTagListList().equals(other.getTagListList())) return false;
            if (getDNOFGBKGANP() != other.getDNOFGBKGANP()) return false;
            if (getGuid() != other.getGuid()) return false;
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
            if (getTagListCount() > 0) {
                hash = (37 * hash) + TAG_LIST_FIELD_NUMBER;
                hash = (53 * hash) + getTagListList().hashCode();
            }
            hash = (37 * hash) + DNOFGBKGANP_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getDNOFGBKGANP());
            hash = (37 * hash) + GUID_FIELD_NUMBER;
            hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getGuid());
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        @java.lang.Override
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Builder newBuilder(
                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF prototype) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
        }

        @java.lang.Override
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }
        /**
         *
         *
         * <pre>
         * CmdId: 9248
         * </pre>
         *
         * Protobuf type {@code EMPCLMJBHKF}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:EMPCLMJBHKF)
                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKFOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass
                        .internal_static_EMPCLMJBHKF_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass
                        .internal_static_EMPCLMJBHKF_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.class,
                                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
            }

            @java.lang.Override
            public Builder clear() {
                super.clear();
                tagList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                dNOFGBKGANP_ = false;

                guid_ = 0L;

                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass
                        .internal_static_EMPCLMJBHKF_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF build() {
                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF buildPartial() {
                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF result =
                        new emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF(this);
                int from_bitField0_ = bitField0_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    tagList_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.tagList_ = tagList_;
                result.dNOFGBKGANP_ = dNOFGBKGANP_;
                result.guid_ = guid_;
                onBuilt();
                return result;
            }

            @java.lang.Override
            public Builder clone() {
                return super.clone();
            }

            @java.lang.Override
            public Builder setField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.setField(field, value);
            }

            @java.lang.Override
            public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
                return super.clearField(field);
            }

            @java.lang.Override
            public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
                return super.clearOneof(oneof);
            }

            @java.lang.Override
            public Builder setRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field,
                    int index,
                    java.lang.Object value) {
                return super.setRepeatedField(field, index, value);
            }

            @java.lang.Override
            public Builder addRepeatedField(
                    com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
                return super.addRepeatedField(field, value);
            }

            @java.lang.Override
            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF) {
                    return mergeFrom((emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF other) {
                if (other
                        == emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF.getDefaultInstance())
                    return this;
                if (!other.tagList_.isEmpty()) {
                    if (tagList_.isEmpty()) {
                        tagList_ = other.tagList_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureTagListIsMutable();
                        tagList_.addAll(other.tagList_);
                    }
                    onChanged();
                }
                if (other.getDNOFGBKGANP() != false) {
                    setDNOFGBKGANP(other.getDNOFGBKGANP());
                }
                if (other.getGuid() != 0L) {
                    setGuid(other.getGuid());
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
                emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF)
                                    e.getUnfinishedMessage();
                    throw e.unwrapIOException();
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            private com.google.protobuf.Internal.IntList tagList_ = emptyIntList();

            private void ensureTagListIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    tagList_ = mutableCopy(tagList_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @return A list containing the tagList.
             */
            public java.util.List<java.lang.Integer> getTagListList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(tagList_)
                        : tagList_;
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @return The count of tagList.
             */
            public int getTagListCount() {
                return tagList_.size();
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @param index The index of the element to return.
             * @return The tagList at the given index.
             */
            public int getTagList(int index) {
                return tagList_.getInt(index);
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @param index The index to set the value at.
             * @param value The tagList to set.
             * @return This builder for chaining.
             */
            public Builder setTagList(int index, int value) {
                ensureTagListIsMutable();
                tagList_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @param value The tagList to add.
             * @return This builder for chaining.
             */
            public Builder addTagList(int value) {
                ensureTagListIsMutable();
                tagList_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @param values The tagList to add.
             * @return This builder for chaining.
             */
            public Builder addAllTagList(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureTagListIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, tagList_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 tag_list = 14;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearTagList() {
                tagList_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                onChanged();
                return this;
            }

            private boolean dNOFGBKGANP_;
            /**
             * <code>bool DNOFGBKGANP = 9;</code>
             *
             * @return The dNOFGBKGANP.
             */
            @java.lang.Override
            public boolean getDNOFGBKGANP() {
                return dNOFGBKGANP_;
            }
            /**
             * <code>bool DNOFGBKGANP = 9;</code>
             *
             * @param value The dNOFGBKGANP to set.
             * @return This builder for chaining.
             */
            public Builder setDNOFGBKGANP(boolean value) {

                dNOFGBKGANP_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>bool DNOFGBKGANP = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearDNOFGBKGANP() {

                dNOFGBKGANP_ = false;
                onChanged();
                return this;
            }

            private long guid_;
            /**
             * <code>uint64 guid = 5;</code>
             *
             * @return The guid.
             */
            @java.lang.Override
            public long getGuid() {
                return guid_;
            }
            /**
             * <code>uint64 guid = 5;</code>
             *
             * @param value The guid to set.
             * @return This builder for chaining.
             */
            public Builder setGuid(long value) {

                guid_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint64 guid = 5;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearGuid() {

                guid_ = 0L;
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

            // @@protoc_insertion_point(builder_scope:EMPCLMJBHKF)
        }

        // @@protoc_insertion_point(class_scope:EMPCLMJBHKF)
        private static final emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF();
        }

        public static emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<EMPCLMJBHKF> PARSER =
                new com.google.protobuf.AbstractParser<EMPCLMJBHKF>() {
                    @java.lang.Override
                    public EMPCLMJBHKF parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new EMPCLMJBHKF(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<EMPCLMJBHKF> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<EMPCLMJBHKF> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.EMPCLMJBHKFOuterClass.EMPCLMJBHKF getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_EMPCLMJBHKF_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_EMPCLMJBHKF_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021EMPCLMJBHKF.proto\"B\n\013EMPCLMJBHKF\022\020\n\010ta"
                    + "g_list\030\016 \003(\r\022\023\n\013DNOFGBKGANP\030\t \001(\010\022\014\n\004gui"
                    + "d\030\005 \001(\004B\033\n\031emu.grasscutter.net.protob\006pr"
                    + "oto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_EMPCLMJBHKF_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_EMPCLMJBHKF_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_EMPCLMJBHKF_descriptor,
                        new java.lang.String[] {
                            "TagList", "DNOFGBKGANP", "Guid",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}