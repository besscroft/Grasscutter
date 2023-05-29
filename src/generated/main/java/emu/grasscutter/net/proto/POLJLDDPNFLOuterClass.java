// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: POLJLDDPNFL.proto

package emu.grasscutter.net.proto;

public final class POLJLDDPNFLOuterClass {
    private POLJLDDPNFLOuterClass() {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

    public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
        registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
    }

    public interface POLJLDDPNFLOrBuilder
            extends
            // @@protoc_insertion_point(interface_extends:POLJLDDPNFL)
            com.google.protobuf.MessageOrBuilder {

        /**
         * <code>int32 retcode = 8;</code>
         *
         * @return The retcode.
         */
        int getRetcode();

        /**
         * <code>uint32 EDDCGLBMNLB = 12;</code>
         *
         * @return The eDDCGLBMNLB.
         */
        int getEDDCGLBMNLB();

        /**
         * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
         *
         * @return A list containing the eNNIJLCIBGH.
         */
        java.util.List<java.lang.Integer> getENNIJLCIBGHList();
        /**
         * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
         *
         * @return The count of eNNIJLCIBGH.
         */
        int getENNIJLCIBGHCount();
        /**
         * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
         *
         * @param index The index of the element to return.
         * @return The eNNIJLCIBGH at the given index.
         */
        int getENNIJLCIBGH(int index);
    }
    /**
     *
     *
     * <pre>
     * CmdId: 5986
     * </pre>
     *
     * Protobuf type {@code POLJLDDPNFL}
     */
    public static final class POLJLDDPNFL extends com.google.protobuf.GeneratedMessageV3
            implements
            // @@protoc_insertion_point(message_implements:POLJLDDPNFL)
            POLJLDDPNFLOrBuilder {
        private static final long serialVersionUID = 0L;
        // Use POLJLDDPNFL.newBuilder() to construct.
        private POLJLDDPNFL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
            super(builder);
        }

        private POLJLDDPNFL() {
            eNNIJLCIBGH_ = emptyIntList();
        }

        @java.lang.Override
        @SuppressWarnings({"unused"})
        protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
            return new POLJLDDPNFL();
        }

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
            return this.unknownFields;
        }

        private POLJLDDPNFL(
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
                        case 64:
                            {
                                retcode_ = input.readInt32();
                                break;
                            }
                        case 72:
                            {
                                if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                                    eNNIJLCIBGH_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                eNNIJLCIBGH_.addInt(input.readUInt32());
                                break;
                            }
                        case 74:
                            {
                                int length = input.readRawVarint32();
                                int limit = input.pushLimit(length);
                                if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                                    eNNIJLCIBGH_ = newIntList();
                                    mutable_bitField0_ |= 0x00000001;
                                }
                                while (input.getBytesUntilLimit() > 0) {
                                    eNNIJLCIBGH_.addInt(input.readUInt32());
                                }
                                input.popLimit(limit);
                                break;
                            }
                        case 96:
                            {
                                eDDCGLBMNLB_ = input.readUInt32();
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
                    eNNIJLCIBGH_.makeImmutable(); // C
                }
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
            return emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.internal_static_POLJLDDPNFL_descriptor;
        }

        @java.lang.Override
        protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                internalGetFieldAccessorTable() {
            return emu.grasscutter.net.proto.POLJLDDPNFLOuterClass
                    .internal_static_POLJLDDPNFL_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.class,
                            emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.Builder.class);
        }

        public static final int RETCODE_FIELD_NUMBER = 8;
        private int retcode_;
        /**
         * <code>int32 retcode = 8;</code>
         *
         * @return The retcode.
         */
        @java.lang.Override
        public int getRetcode() {
            return retcode_;
        }

        public static final int EDDCGLBMNLB_FIELD_NUMBER = 12;
        private int eDDCGLBMNLB_;
        /**
         * <code>uint32 EDDCGLBMNLB = 12;</code>
         *
         * @return The eDDCGLBMNLB.
         */
        @java.lang.Override
        public int getEDDCGLBMNLB() {
            return eDDCGLBMNLB_;
        }

        public static final int ENNIJLCIBGH_FIELD_NUMBER = 9;
        private com.google.protobuf.Internal.IntList eNNIJLCIBGH_;
        /**
         * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
         *
         * @return A list containing the eNNIJLCIBGH.
         */
        @java.lang.Override
        public java.util.List<java.lang.Integer> getENNIJLCIBGHList() {
            return eNNIJLCIBGH_;
        }
        /**
         * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
         *
         * @return The count of eNNIJLCIBGH.
         */
        public int getENNIJLCIBGHCount() {
            return eNNIJLCIBGH_.size();
        }
        /**
         * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
         *
         * @param index The index of the element to return.
         * @return The eNNIJLCIBGH at the given index.
         */
        public int getENNIJLCIBGH(int index) {
            return eNNIJLCIBGH_.getInt(index);
        }

        private int eNNIJLCIBGHMemoizedSerializedSize = -1;

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
            if (retcode_ != 0) {
                output.writeInt32(8, retcode_);
            }
            if (getENNIJLCIBGHList().size() > 0) {
                output.writeUInt32NoTag(74);
                output.writeUInt32NoTag(eNNIJLCIBGHMemoizedSerializedSize);
            }
            for (int i = 0; i < eNNIJLCIBGH_.size(); i++) {
                output.writeUInt32NoTag(eNNIJLCIBGH_.getInt(i));
            }
            if (eDDCGLBMNLB_ != 0) {
                output.writeUInt32(12, eDDCGLBMNLB_);
            }
            unknownFields.writeTo(output);
        }

        @java.lang.Override
        public int getSerializedSize() {
            int size = memoizedSize;
            if (size != -1) return size;

            size = 0;
            if (retcode_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeInt32Size(8, retcode_);
            }
            {
                int dataSize = 0;
                for (int i = 0; i < eNNIJLCIBGH_.size(); i++) {
                    dataSize +=
                            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(eNNIJLCIBGH_.getInt(i));
                }
                size += dataSize;
                if (!getENNIJLCIBGHList().isEmpty()) {
                    size += 1;
                    size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
                }
                eNNIJLCIBGHMemoizedSerializedSize = dataSize;
            }
            if (eDDCGLBMNLB_ != 0) {
                size += com.google.protobuf.CodedOutputStream.computeUInt32Size(12, eDDCGLBMNLB_);
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
            if (!(obj instanceof emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL)) {
                return super.equals(obj);
            }
            emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL other =
                    (emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL) obj;

            if (getRetcode() != other.getRetcode()) return false;
            if (getEDDCGLBMNLB() != other.getEDDCGLBMNLB()) return false;
            if (!getENNIJLCIBGHList().equals(other.getENNIJLCIBGHList())) return false;
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
            hash = (37 * hash) + RETCODE_FIELD_NUMBER;
            hash = (53 * hash) + getRetcode();
            hash = (37 * hash) + EDDCGLBMNLB_FIELD_NUMBER;
            hash = (53 * hash) + getEDDCGLBMNLB();
            if (getENNIJLCIBGHCount() > 0) {
                hash = (37 * hash) + ENNIJLCIBGH_FIELD_NUMBER;
                hash = (53 * hash) + getENNIJLCIBGHList().hashCode();
            }
            hash = (29 * hash) + unknownFields.hashCode();
            memoizedHashCode = hash;
            return hash;
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseDelimitedFrom(
                java.io.InputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseDelimitedFrom(
                java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
                    PARSER, input, extensionRegistry);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
                com.google.protobuf.CodedInputStream input) throws java.io.IOException {
            return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parseFrom(
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
                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL prototype) {
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
         * CmdId: 5986
         * </pre>
         *
         * Protobuf type {@code POLJLDDPNFL}
         */
        public static final class Builder
                extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
                implements
                // @@protoc_insertion_point(builder_implements:POLJLDDPNFL)
                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFLOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
                return emu.grasscutter.net.proto.POLJLDDPNFLOuterClass
                        .internal_static_POLJLDDPNFL_descriptor;
            }

            @java.lang.Override
            protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
                    internalGetFieldAccessorTable() {
                return emu.grasscutter.net.proto.POLJLDDPNFLOuterClass
                        .internal_static_POLJLDDPNFL_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.class,
                                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.Builder.class);
            }

            // Construct using emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.newBuilder()
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
                retcode_ = 0;

                eDDCGLBMNLB_ = 0;

                eNNIJLCIBGH_ = emptyIntList();
                bitField0_ = (bitField0_ & ~0x00000001);
                return this;
            }

            @java.lang.Override
            public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
                return emu.grasscutter.net.proto.POLJLDDPNFLOuterClass
                        .internal_static_POLJLDDPNFL_descriptor;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL
                    getDefaultInstanceForType() {
                return emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.getDefaultInstance();
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL build() {
                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            @java.lang.Override
            public emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL buildPartial() {
                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL result =
                        new emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL(this);
                int from_bitField0_ = bitField0_;
                result.retcode_ = retcode_;
                result.eDDCGLBMNLB_ = eDDCGLBMNLB_;
                if (((bitField0_ & 0x00000001) != 0)) {
                    eNNIJLCIBGH_.makeImmutable();
                    bitField0_ = (bitField0_ & ~0x00000001);
                }
                result.eNNIJLCIBGH_ = eNNIJLCIBGH_;
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
                if (other instanceof emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL) {
                    return mergeFrom((emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL other) {
                if (other
                        == emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL.getDefaultInstance())
                    return this;
                if (other.getRetcode() != 0) {
                    setRetcode(other.getRetcode());
                }
                if (other.getEDDCGLBMNLB() != 0) {
                    setEDDCGLBMNLB(other.getEDDCGLBMNLB());
                }
                if (!other.eNNIJLCIBGH_.isEmpty()) {
                    if (eNNIJLCIBGH_.isEmpty()) {
                        eNNIJLCIBGH_ = other.eNNIJLCIBGH_;
                        bitField0_ = (bitField0_ & ~0x00000001);
                    } else {
                        ensureENNIJLCIBGHIsMutable();
                        eNNIJLCIBGH_.addAll(other.eNNIJLCIBGH_);
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
                emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage =
                            (emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL)
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

            private int retcode_;
            /**
             * <code>int32 retcode = 8;</code>
             *
             * @return The retcode.
             */
            @java.lang.Override
            public int getRetcode() {
                return retcode_;
            }
            /**
             * <code>int32 retcode = 8;</code>
             *
             * @param value The retcode to set.
             * @return This builder for chaining.
             */
            public Builder setRetcode(int value) {

                retcode_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>int32 retcode = 8;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearRetcode() {

                retcode_ = 0;
                onChanged();
                return this;
            }

            private int eDDCGLBMNLB_;
            /**
             * <code>uint32 EDDCGLBMNLB = 12;</code>
             *
             * @return The eDDCGLBMNLB.
             */
            @java.lang.Override
            public int getEDDCGLBMNLB() {
                return eDDCGLBMNLB_;
            }
            /**
             * <code>uint32 EDDCGLBMNLB = 12;</code>
             *
             * @param value The eDDCGLBMNLB to set.
             * @return This builder for chaining.
             */
            public Builder setEDDCGLBMNLB(int value) {

                eDDCGLBMNLB_ = value;
                onChanged();
                return this;
            }
            /**
             * <code>uint32 EDDCGLBMNLB = 12;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearEDDCGLBMNLB() {

                eDDCGLBMNLB_ = 0;
                onChanged();
                return this;
            }

            private com.google.protobuf.Internal.IntList eNNIJLCIBGH_ = emptyIntList();

            private void ensureENNIJLCIBGHIsMutable() {
                if (!((bitField0_ & 0x00000001) != 0)) {
                    eNNIJLCIBGH_ = mutableCopy(eNNIJLCIBGH_);
                    bitField0_ |= 0x00000001;
                }
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @return A list containing the eNNIJLCIBGH.
             */
            public java.util.List<java.lang.Integer> getENNIJLCIBGHList() {
                return ((bitField0_ & 0x00000001) != 0)
                        ? java.util.Collections.unmodifiableList(eNNIJLCIBGH_)
                        : eNNIJLCIBGH_;
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @return The count of eNNIJLCIBGH.
             */
            public int getENNIJLCIBGHCount() {
                return eNNIJLCIBGH_.size();
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @param index The index of the element to return.
             * @return The eNNIJLCIBGH at the given index.
             */
            public int getENNIJLCIBGH(int index) {
                return eNNIJLCIBGH_.getInt(index);
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @param index The index to set the value at.
             * @param value The eNNIJLCIBGH to set.
             * @return This builder for chaining.
             */
            public Builder setENNIJLCIBGH(int index, int value) {
                ensureENNIJLCIBGHIsMutable();
                eNNIJLCIBGH_.setInt(index, value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @param value The eNNIJLCIBGH to add.
             * @return This builder for chaining.
             */
            public Builder addENNIJLCIBGH(int value) {
                ensureENNIJLCIBGHIsMutable();
                eNNIJLCIBGH_.addInt(value);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @param values The eNNIJLCIBGH to add.
             * @return This builder for chaining.
             */
            public Builder addAllENNIJLCIBGH(java.lang.Iterable<? extends java.lang.Integer> values) {
                ensureENNIJLCIBGHIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(values, eNNIJLCIBGH_);
                onChanged();
                return this;
            }
            /**
             * <code>repeated uint32 ENNIJLCIBGH = 9;</code>
             *
             * @return This builder for chaining.
             */
            public Builder clearENNIJLCIBGH() {
                eNNIJLCIBGH_ = emptyIntList();
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

            // @@protoc_insertion_point(builder_scope:POLJLDDPNFL)
        }

        // @@protoc_insertion_point(class_scope:POLJLDDPNFL)
        private static final emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL
                DEFAULT_INSTANCE;

        static {
            DEFAULT_INSTANCE = new emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL();
        }

        public static emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private static final com.google.protobuf.Parser<POLJLDDPNFL> PARSER =
                new com.google.protobuf.AbstractParser<POLJLDDPNFL>() {
                    @java.lang.Override
                    public POLJLDDPNFL parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new POLJLDDPNFL(input, extensionRegistry);
                    }
                };

        public static com.google.protobuf.Parser<POLJLDDPNFL> parser() {
            return PARSER;
        }

        @java.lang.Override
        public com.google.protobuf.Parser<POLJLDDPNFL> getParserForType() {
            return PARSER;
        }

        @java.lang.Override
        public emu.grasscutter.net.proto.POLJLDDPNFLOuterClass.POLJLDDPNFL getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }
    }

    private static final com.google.protobuf.Descriptors.Descriptor
            internal_static_POLJLDDPNFL_descriptor;
    private static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
            internal_static_POLJLDDPNFL_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

    static {
        java.lang.String[] descriptorData = {
            "\n\021POLJLDDPNFL.proto\"H\n\013POLJLDDPNFL\022\017\n\007re"
                    + "tcode\030\010 \001(\005\022\023\n\013EDDCGLBMNLB\030\014 \001(\r\022\023\n\013ENNI"
                    + "JLCIBGH\030\t \003(\rB\033\n\031emu.grasscutter.net.pro"
                    + "tob\006proto3"
        };
        descriptor =
                com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
                        descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
        internal_static_POLJLDDPNFL_descriptor = getDescriptor().getMessageTypes().get(0);
        internal_static_POLJLDDPNFL_fieldAccessorTable =
                new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
                        internal_static_POLJLDDPNFL_descriptor,
                        new java.lang.String[] {
                            "Retcode", "EDDCGLBMNLB", "ENNIJLCIBGH",
                        });
    }

    // @@protoc_insertion_point(outer_class_scope)
}