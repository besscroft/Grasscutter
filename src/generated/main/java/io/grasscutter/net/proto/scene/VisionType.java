// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: scene.proto

package io.grasscutter.net.proto.scene;

/**
 * Protobuf enum {@code VisionType}
 */
public enum VisionType
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>VisionType_VISION_NONE = 0;</code>
   */
  VisionType_VISION_NONE(0),
  /**
   * <code>VisionType_VISION_MEET = 1;</code>
   */
  VisionType_VISION_MEET(1),
  /**
   * <code>VisionType_VISION_REBORN = 2;</code>
   */
  VisionType_VISION_REBORN(2),
  /**
   * <code>VisionType_VISION_REPLACE = 3;</code>
   */
  VisionType_VISION_REPLACE(3),
  /**
   * <code>VisionType_VISION_WAYPOINT_REBORN = 4;</code>
   */
  VisionType_VISION_WAYPOINT_REBORN(4),
  /**
   * <code>VisionType_VISION_MISS = 5;</code>
   */
  VisionType_VISION_MISS(5),
  /**
   * <code>VisionType_VISION_DIE = 6;</code>
   */
  VisionType_VISION_DIE(6),
  /**
   * <code>VisionType_VISION_GATHER_ESCAPE = 7;</code>
   */
  VisionType_VISION_GATHER_ESCAPE(7),
  /**
   * <code>VisionType_VISION_REFRESH = 8;</code>
   */
  VisionType_VISION_REFRESH(8),
  /**
   * <code>VisionType_VISION_TRANSPORT = 9;</code>
   */
  VisionType_VISION_TRANSPORT(9),
  /**
   * <code>VisionType_VISION_REPLACE_DIE = 10;</code>
   */
  VisionType_VISION_REPLACE_DIE(10),
  /**
   * <code>VisionType_VISION_REPLACE_NO_NOTIFY = 11;</code>
   */
  VisionType_VISION_REPLACE_NO_NOTIFY(11),
  /**
   * <code>VisionType_VISION_BORN = 12;</code>
   */
  VisionType_VISION_BORN(12),
  /**
   * <code>VisionType_VISION_PICKUP = 13;</code>
   */
  VisionType_VISION_PICKUP(13),
  /**
   * <code>VisionType_VISION_REMOVE = 14;</code>
   */
  VisionType_VISION_REMOVE(14),
  /**
   * <code>VisionType_VISION_CHANGE_COSTUME = 15;</code>
   */
  VisionType_VISION_CHANGE_COSTUME(15),
  /**
   * <code>VisionType_VISION_FISH_REFRESH = 16;</code>
   */
  VisionType_VISION_FISH_REFRESH(16),
  /**
   * <code>VisionType_VISION_FISH_BIG_SHOCK = 17;</code>
   */
  VisionType_VISION_FISH_BIG_SHOCK(17),
  /**
   * <code>VisionType_VISION_FISH_QTE_SUCC = 18;</code>
   */
  VisionType_VISION_FISH_QTE_SUCC(18),
  /**
   * <code>VisionType_VISION_CAPTURE_DISAPPEAR = 19;</code>
   */
  VisionType_VISION_CAPTURE_DISAPPEAR(19),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>VisionType_VISION_NONE = 0;</code>
   */
  public static final int VisionType_VISION_NONE_VALUE = 0;
  /**
   * <code>VisionType_VISION_MEET = 1;</code>
   */
  public static final int VisionType_VISION_MEET_VALUE = 1;
  /**
   * <code>VisionType_VISION_REBORN = 2;</code>
   */
  public static final int VisionType_VISION_REBORN_VALUE = 2;
  /**
   * <code>VisionType_VISION_REPLACE = 3;</code>
   */
  public static final int VisionType_VISION_REPLACE_VALUE = 3;
  /**
   * <code>VisionType_VISION_WAYPOINT_REBORN = 4;</code>
   */
  public static final int VisionType_VISION_WAYPOINT_REBORN_VALUE = 4;
  /**
   * <code>VisionType_VISION_MISS = 5;</code>
   */
  public static final int VisionType_VISION_MISS_VALUE = 5;
  /**
   * <code>VisionType_VISION_DIE = 6;</code>
   */
  public static final int VisionType_VISION_DIE_VALUE = 6;
  /**
   * <code>VisionType_VISION_GATHER_ESCAPE = 7;</code>
   */
  public static final int VisionType_VISION_GATHER_ESCAPE_VALUE = 7;
  /**
   * <code>VisionType_VISION_REFRESH = 8;</code>
   */
  public static final int VisionType_VISION_REFRESH_VALUE = 8;
  /**
   * <code>VisionType_VISION_TRANSPORT = 9;</code>
   */
  public static final int VisionType_VISION_TRANSPORT_VALUE = 9;
  /**
   * <code>VisionType_VISION_REPLACE_DIE = 10;</code>
   */
  public static final int VisionType_VISION_REPLACE_DIE_VALUE = 10;
  /**
   * <code>VisionType_VISION_REPLACE_NO_NOTIFY = 11;</code>
   */
  public static final int VisionType_VISION_REPLACE_NO_NOTIFY_VALUE = 11;
  /**
   * <code>VisionType_VISION_BORN = 12;</code>
   */
  public static final int VisionType_VISION_BORN_VALUE = 12;
  /**
   * <code>VisionType_VISION_PICKUP = 13;</code>
   */
  public static final int VisionType_VISION_PICKUP_VALUE = 13;
  /**
   * <code>VisionType_VISION_REMOVE = 14;</code>
   */
  public static final int VisionType_VISION_REMOVE_VALUE = 14;
  /**
   * <code>VisionType_VISION_CHANGE_COSTUME = 15;</code>
   */
  public static final int VisionType_VISION_CHANGE_COSTUME_VALUE = 15;
  /**
   * <code>VisionType_VISION_FISH_REFRESH = 16;</code>
   */
  public static final int VisionType_VISION_FISH_REFRESH_VALUE = 16;
  /**
   * <code>VisionType_VISION_FISH_BIG_SHOCK = 17;</code>
   */
  public static final int VisionType_VISION_FISH_BIG_SHOCK_VALUE = 17;
  /**
   * <code>VisionType_VISION_FISH_QTE_SUCC = 18;</code>
   */
  public static final int VisionType_VISION_FISH_QTE_SUCC_VALUE = 18;
  /**
   * <code>VisionType_VISION_CAPTURE_DISAPPEAR = 19;</code>
   */
  public static final int VisionType_VISION_CAPTURE_DISAPPEAR_VALUE = 19;


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
  public static VisionType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VisionType forNumber(int value) {
    switch (value) {
      case 0: return VisionType_VISION_NONE;
      case 1: return VisionType_VISION_MEET;
      case 2: return VisionType_VISION_REBORN;
      case 3: return VisionType_VISION_REPLACE;
      case 4: return VisionType_VISION_WAYPOINT_REBORN;
      case 5: return VisionType_VISION_MISS;
      case 6: return VisionType_VISION_DIE;
      case 7: return VisionType_VISION_GATHER_ESCAPE;
      case 8: return VisionType_VISION_REFRESH;
      case 9: return VisionType_VISION_TRANSPORT;
      case 10: return VisionType_VISION_REPLACE_DIE;
      case 11: return VisionType_VISION_REPLACE_NO_NOTIFY;
      case 12: return VisionType_VISION_BORN;
      case 13: return VisionType_VISION_PICKUP;
      case 14: return VisionType_VISION_REMOVE;
      case 15: return VisionType_VISION_CHANGE_COSTUME;
      case 16: return VisionType_VISION_FISH_REFRESH;
      case 17: return VisionType_VISION_FISH_BIG_SHOCK;
      case 18: return VisionType_VISION_FISH_QTE_SUCC;
      case 19: return VisionType_VISION_CAPTURE_DISAPPEAR;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VisionType>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      VisionType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VisionType>() {
          public VisionType findValueByNumber(int number) {
            return VisionType.forNumber(number);
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
    return io.grasscutter.net.proto.scene.Scene.getDescriptor().getEnumTypes().get(2);
  }

  private static final VisionType[] VALUES = values();

  public static VisionType valueOf(
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

  private VisionType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:VisionType)
}
