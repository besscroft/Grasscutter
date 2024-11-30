// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fight.proto

package io.grasscutter.net.proto.fight;

/**
 * Protobuf enum {@code ServerBuffChangeType}
 */
public enum ServerBuffChangeType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ServerBuffChangeType_ADD_SERVER_BUFF = 0;</code>
   */
  ServerBuffChangeType_ADD_SERVER_BUFF(0),
  /**
   * <code>ServerBuffChangeType_DEL_SERVER_BUFF = 1;</code>
   */
  ServerBuffChangeType_DEL_SERVER_BUFF(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>ServerBuffChangeType_ADD_SERVER_BUFF = 0;</code>
   */
  public static final int ServerBuffChangeType_ADD_SERVER_BUFF_VALUE = 0;
  /**
   * <code>ServerBuffChangeType_DEL_SERVER_BUFF = 1;</code>
   */
  public static final int ServerBuffChangeType_DEL_SERVER_BUFF_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static ServerBuffChangeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ServerBuffChangeType forNumber(int value) {
    switch (value) {
      case 0: return ServerBuffChangeType_ADD_SERVER_BUFF;
      case 1: return ServerBuffChangeType_DEL_SERVER_BUFF;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ServerBuffChangeType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      ServerBuffChangeType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ServerBuffChangeType>() {
          public ServerBuffChangeType findValueByNumber(int number) {
            return ServerBuffChangeType.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return io.grasscutter.net.proto.fight.Fight.getDescriptor().getEnumTypes().get(0);
  }

  private static final ServerBuffChangeType[] VALUES = values();

  public static ServerBuffChangeType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ServerBuffChangeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:ServerBuffChangeType)
}
