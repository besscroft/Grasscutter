// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

/**
 * Protobuf enum {@code MotionState}
 */
public enum MotionState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>MotionState_MOTION_NONE = 0;</code>
   */
  MotionState_MOTION_NONE(0),
  /**
   * <code>MotionState_MOTION_RESET = 1;</code>
   */
  MotionState_MOTION_RESET(1),
  /**
   * <code>MotionState_MOTION_STANDBY = 2;</code>
   */
  MotionState_MOTION_STANDBY(2),
  /**
   * <code>MotionState_MOTION_STANDBY_MOVE = 3;</code>
   */
  MotionState_MOTION_STANDBY_MOVE(3),
  /**
   * <code>MotionState_MOTION_WALK = 4;</code>
   */
  MotionState_MOTION_WALK(4),
  /**
   * <code>MotionState_MOTION_RUN = 5;</code>
   */
  MotionState_MOTION_RUN(5),
  /**
   * <code>MotionState_MOTION_DASH = 6;</code>
   */
  MotionState_MOTION_DASH(6),
  /**
   * <code>MotionState_MOTION_CLIMB = 7;</code>
   */
  MotionState_MOTION_CLIMB(7),
  /**
   * <code>MotionState_MOTION_CLIMB_JUMP = 8;</code>
   */
  MotionState_MOTION_CLIMB_JUMP(8),
  /**
   * <code>MotionState_MOTION_STANDBY_TO_CLIMB = 9;</code>
   */
  MotionState_MOTION_STANDBY_TO_CLIMB(9),
  /**
   * <code>MotionState_MOTION_FIGHT = 10;</code>
   */
  MotionState_MOTION_FIGHT(10),
  /**
   * <code>MotionState_MOTION_JUMP = 11;</code>
   */
  MotionState_MOTION_JUMP(11),
  /**
   * <code>MotionState_MOTION_DROP = 12;</code>
   */
  MotionState_MOTION_DROP(12),
  /**
   * <code>MotionState_MOTION_FLY = 13;</code>
   */
  MotionState_MOTION_FLY(13),
  /**
   * <code>MotionState_MOTION_SWIM_MOVE = 14;</code>
   */
  MotionState_MOTION_SWIM_MOVE(14),
  /**
   * <code>MotionState_MOTION_SWIM_IDLE = 15;</code>
   */
  MotionState_MOTION_SWIM_IDLE(15),
  /**
   * <code>MotionState_MOTION_SWIM_DASH = 16;</code>
   */
  MotionState_MOTION_SWIM_DASH(16),
  /**
   * <code>MotionState_MOTION_SWIM_JUMP = 17;</code>
   */
  MotionState_MOTION_SWIM_JUMP(17),
  /**
   * <code>MotionState_MOTION_SLIP = 18;</code>
   */
  MotionState_MOTION_SLIP(18),
  /**
   * <code>MotionState_MOTION_GO_UPSTAIRS = 19;</code>
   */
  MotionState_MOTION_GO_UPSTAIRS(19),
  /**
   * <code>MotionState_MOTION_FALL_ON_GROUND = 20;</code>
   */
  MotionState_MOTION_FALL_ON_GROUND(20),
  /**
   * <code>MotionState_MOTION_JUMP_UP_WALL_FOR_STANDBY = 21;</code>
   */
  MotionState_MOTION_JUMP_UP_WALL_FOR_STANDBY(21),
  /**
   * <code>MotionState_MOTION_JUMP_OFF_WALL = 22;</code>
   */
  MotionState_MOTION_JUMP_OFF_WALL(22),
  /**
   * <code>MotionState_MOTION_POWERED_FLY = 23;</code>
   */
  MotionState_MOTION_POWERED_FLY(23),
  /**
   * <code>MotionState_MOTION_LADDER_IDLE = 24;</code>
   */
  MotionState_MOTION_LADDER_IDLE(24),
  /**
   * <code>MotionState_MOTION_LADDER_MOVE = 25;</code>
   */
  MotionState_MOTION_LADDER_MOVE(25),
  /**
   * <code>MotionState_MOTION_LADDER_SLIP = 26;</code>
   */
  MotionState_MOTION_LADDER_SLIP(26),
  /**
   * <code>MotionState_MOTION_STANDBY_TO_LADDER = 27;</code>
   */
  MotionState_MOTION_STANDBY_TO_LADDER(27),
  /**
   * <code>MotionState_MOTION_LADDER_TO_STANDBY = 28;</code>
   */
  MotionState_MOTION_LADDER_TO_STANDBY(28),
  /**
   * <code>MotionState_MOTION_DANGER_STANDBY = 29;</code>
   */
  MotionState_MOTION_DANGER_STANDBY(29),
  /**
   * <code>MotionState_MOTION_DANGER_STANDBY_MOVE = 30;</code>
   */
  MotionState_MOTION_DANGER_STANDBY_MOVE(30),
  /**
   * <code>MotionState_MOTION_DANGER_WALK = 31;</code>
   */
  MotionState_MOTION_DANGER_WALK(31),
  /**
   * <code>MotionState_MOTION_DANGER_RUN = 32;</code>
   */
  MotionState_MOTION_DANGER_RUN(32),
  /**
   * <code>MotionState_MOTION_DANGER_DASH = 33;</code>
   */
  MotionState_MOTION_DANGER_DASH(33),
  /**
   * <code>MotionState_MOTION_CROUCH_IDLE = 34;</code>
   */
  MotionState_MOTION_CROUCH_IDLE(34),
  /**
   * <code>MotionState_MOTION_CROUCH_MOVE = 35;</code>
   */
  MotionState_MOTION_CROUCH_MOVE(35),
  /**
   * <code>MotionState_MOTION_CROUCH_ROLL = 36;</code>
   */
  MotionState_MOTION_CROUCH_ROLL(36),
  /**
   * <code>MotionState_MOTION_NOTIFY = 37;</code>
   */
  MotionState_MOTION_NOTIFY(37),
  /**
   * <code>MotionState_MOTION_LAND_SPEED = 38;</code>
   */
  MotionState_MOTION_LAND_SPEED(38),
  /**
   * <code>MotionState_MOTION_MOVE_FAIL_ACK = 39;</code>
   */
  MotionState_MOTION_MOVE_FAIL_ACK(39),
  /**
   * <code>MotionState_MOTION_WATERFALL = 40;</code>
   */
  MotionState_MOTION_WATERFALL(40),
  /**
   * <code>MotionState_MOTION_DASH_BEFORE_SHAKE = 41;</code>
   */
  MotionState_MOTION_DASH_BEFORE_SHAKE(41),
  /**
   * <code>MotionState_MOTION_SIT_IDLE = 42;</code>
   */
  MotionState_MOTION_SIT_IDLE(42),
  /**
   * <code>MotionState_MOTION_FORCE_SET_POS = 43;</code>
   */
  MotionState_MOTION_FORCE_SET_POS(43),
  /**
   * <code>MotionState_MOTION_QUEST_FORCE_DRAG = 44;</code>
   */
  MotionState_MOTION_QUEST_FORCE_DRAG(44),
  /**
   * <code>MotionState_MOTION_FOLLOW_ROUTE = 45;</code>
   */
  MotionState_MOTION_FOLLOW_ROUTE(45),
  /**
   * <code>MotionState_MOTION_SKIFF_BOARDING = 46;</code>
   */
  MotionState_MOTION_SKIFF_BOARDING(46),
  /**
   * <code>MotionState_MOTION_SKIFF_NORMAL = 47;</code>
   */
  MotionState_MOTION_SKIFF_NORMAL(47),
  /**
   * <code>MotionState_MOTION_SKIFF_DASH = 48;</code>
   */
  MotionState_MOTION_SKIFF_DASH(48),
  /**
   * <code>MotionState_MOTION_SKIFF_POWERED_DASH = 49;</code>
   */
  MotionState_MOTION_SKIFF_POWERED_DASH(49),
  /**
   * <code>MotionState_MOTION_DESTROY_VEHICLE = 50;</code>
   */
  MotionState_MOTION_DESTROY_VEHICLE(50),
  /**
   * <code>MotionState_MOTION_FLY_IDLE = 51;</code>
   */
  MotionState_MOTION_FLY_IDLE(51),
  /**
   * <code>MotionState_MOTION_FLY_SLOW = 52;</code>
   */
  MotionState_MOTION_FLY_SLOW(52),
  /**
   * <code>MotionState_MOTION_FLY_FAST = 53;</code>
   */
  MotionState_MOTION_FLY_FAST(53),
  /**
   * <code>MotionState_MOTION_AIM_MOVE = 54;</code>
   */
  MotionState_MOTION_AIM_MOVE(54),
  /**
   * <code>MotionState_MOTION_AIR_COMPENSATION = 55;</code>
   */
  MotionState_MOTION_AIR_COMPENSATION(55),
  /**
   * <code>MotionState_MOTION_SORUSH_NORMAL = 56;</code>
   */
  MotionState_MOTION_SORUSH_NORMAL(56),
  /**
   * <code>MotionState_MOTION_ROLLER_COASTER = 57;</code>
   */
  MotionState_MOTION_ROLLER_COASTER(57),
  /**
   * <code>MotionState_MOTION_DIVE_IDLE = 58;</code>
   */
  MotionState_MOTION_DIVE_IDLE(58),
  /**
   * <code>MotionState_MOTION_DIVE_MOVE = 59;</code>
   */
  MotionState_MOTION_DIVE_MOVE(59),
  /**
   * <code>MotionState_MOTION_DIVE_DASH = 60;</code>
   */
  MotionState_MOTION_DIVE_DASH(60),
  /**
   * <code>MotionState_MOTION_DIVE_DOLPHINE = 61;</code>
   */
  MotionState_MOTION_DIVE_DOLPHINE(61),
  /**
   * <code>MotionState_MOTION_DEBUG = 62;</code>
   */
  MotionState_MOTION_DEBUG(62),
  /**
   * <code>MotionState_MOTION_OCEAN_CURRENT = 63;</code>
   */
  MotionState_MOTION_OCEAN_CURRENT(63),
  /**
   * <code>MotionState_MOTION_DIVE_SWIM_MOVE = 64;</code>
   */
  MotionState_MOTION_DIVE_SWIM_MOVE(64),
  /**
   * <code>MotionState_MOTION_DIVE_SWIM_IDLE = 65;</code>
   */
  MotionState_MOTION_DIVE_SWIM_IDLE(65),
  /**
   * <code>MotionState_MOTION_DIVE_SWIM_DASH = 66;</code>
   */
  MotionState_MOTION_DIVE_SWIM_DASH(66),
  /**
   * <code>MotionState_MOTION_ARC_LIGHT = 67;</code>
   */
  MotionState_MOTION_ARC_LIGHT(67),
  /**
   * <code>MotionState_MOTION_ARC_LIGHT_SAFE = 68;</code>
   */
  MotionState_MOTION_ARC_LIGHT_SAFE(68),
  /**
   * <code>MotionState_MOTION_VEHICLE_STANDBY = 69;</code>
   */
  MotionState_MOTION_VEHICLE_STANDBY(69),
  /**
   * <code>MotionState_MOTION_VEHICLE_RUN = 70;</code>
   */
  MotionState_MOTION_VEHICLE_RUN(70),
  /**
   * <code>MotionState_MOTION_VEHICLE_DASH = 71;</code>
   */
  MotionState_MOTION_VEHICLE_DASH(71),
  /**
   * <code>MotionState_MOTION_VEHICLE_CLIMB = 72;</code>
   */
  MotionState_MOTION_VEHICLE_CLIMB(72),
  /**
   * <code>MotionState_MOTION_VEHICLE_CLIMB_JUMP = 73;</code>
   */
  MotionState_MOTION_VEHICLE_CLIMB_JUMP(73),
  /**
   * <code>MotionState_MOTION_VEHICLE_STANDBY_TO_CLIMB = 74;</code>
   */
  MotionState_MOTION_VEHICLE_STANDBY_TO_CLIMB(74),
  /**
   * <code>MotionState_MOTION_VEHICLE_FIGHT = 75;</code>
   */
  MotionState_MOTION_VEHICLE_FIGHT(75),
  /**
   * <code>MotionState_MOTION_VEHICLE_JUMP = 76;</code>
   */
  MotionState_MOTION_VEHICLE_JUMP(76),
  /**
   * <code>MotionState_MOTION_VEHICLE_DROP = 77;</code>
   */
  MotionState_MOTION_VEHICLE_DROP(77),
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY = 78;</code>
   */
  MotionState_MOTION_VEHICLE_FLY(78),
  /**
   * <code>MotionState_MOTION_VEHICLE_SWIM_MOVE = 79;</code>
   */
  MotionState_MOTION_VEHICLE_SWIM_MOVE(79),
  /**
   * <code>MotionState_MOTION_VEHICLE_SWIM_IDLE = 80;</code>
   */
  MotionState_MOTION_VEHICLE_SWIM_IDLE(80),
  /**
   * <code>MotionState_MOTION_VEHICLE_SWIM_DASH = 81;</code>
   */
  MotionState_MOTION_VEHICLE_SWIM_DASH(81),
  /**
   * <code>MotionState_MOTION_VEHICLE_SLIP = 82;</code>
   */
  MotionState_MOTION_VEHICLE_SLIP(82),
  /**
   * <code>MotionState_MOTION_VEHICLE_GO_UPSTAIRS = 83;</code>
   */
  MotionState_MOTION_VEHICLE_GO_UPSTAIRS(83),
  /**
   * <code>MotionState_MOTION_VEHICLE_FALL_ON_GROUND = 84;</code>
   */
  MotionState_MOTION_VEHICLE_FALL_ON_GROUND(84),
  /**
   * <code>MotionState_MOTION_VEHICLE_JUMP_OFF_WALL = 85;</code>
   */
  MotionState_MOTION_VEHICLE_JUMP_OFF_WALL(85),
  /**
   * <code>MotionState_MOTION_VEHICLE_POWERED_FLY = 86;</code>
   */
  MotionState_MOTION_VEHICLE_POWERED_FLY(86),
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_STANDBY = 87;</code>
   */
  MotionState_MOTION_VEHICLE_DANGER_STANDBY(87),
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_RUN = 88;</code>
   */
  MotionState_MOTION_VEHICLE_DANGER_RUN(88),
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_DASH = 89;</code>
   */
  MotionState_MOTION_VEHICLE_DANGER_DASH(89),
  /**
   * <code>MotionState_MOTION_VEHICLE_NOTIFY = 90;</code>
   */
  MotionState_MOTION_VEHICLE_NOTIFY(90),
  /**
   * <code>MotionState_MOTION_VEHICLE_LAND_SPEED = 91;</code>
   */
  MotionState_MOTION_VEHICLE_LAND_SPEED(91),
  /**
   * <code>MotionState_MOTION_VEHICLE_DASH_BEFORE_SHAKE = 92;</code>
   */
  MotionState_MOTION_VEHICLE_DASH_BEFORE_SHAKE(92),
  /**
   * <code>MotionState_MOTION_VEHICLE_QUEST_FORCE_DRAG = 93;</code>
   */
  MotionState_MOTION_VEHICLE_QUEST_FORCE_DRAG(93),
  /**
   * <code>MotionState_MOTION_VEHICLE_FOLLOW_ROUTE = 94;</code>
   */
  MotionState_MOTION_VEHICLE_FOLLOW_ROUTE(94),
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY_IDLE = 95;</code>
   */
  MotionState_MOTION_VEHICLE_FLY_IDLE(95),
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY_SLOW = 96;</code>
   */
  MotionState_MOTION_VEHICLE_FLY_SLOW(96),
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY_FAST = 97;</code>
   */
  MotionState_MOTION_VEHICLE_FLY_FAST(97),
  /**
   * <code>MotionState_MOTION_VEHICLE_AIR_COMPENSATION = 98;</code>
   */
  MotionState_MOTION_VEHICLE_AIR_COMPENSATION(98),
  /**
   * <code>MotionState_MOTION_VEHICLE_ARC_LIGHT = 99;</code>
   */
  MotionState_MOTION_VEHICLE_ARC_LIGHT(99),
  /**
   * <code>MotionState_MOTION_VEHICLE_ARC_LIGHT_SAFE = 100;</code>
   */
  MotionState_MOTION_VEHICLE_ARC_LIGHT_SAFE(100),
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_SWIM_MOVE = 101;</code>
   */
  MotionState_MOTION_VEHICLE_DANGER_SWIM_MOVE(101),
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_SWIM_IDLE = 102;</code>
   */
  MotionState_MOTION_VEHICLE_DANGER_SWIM_IDLE(102),
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_SWIM_DASH = 103;</code>
   */
  MotionState_MOTION_VEHICLE_DANGER_SWIM_DASH(103),
  /**
   * <code>MotionState_MOTION_FOLLOW_CURVE_ROUTE = 104;</code>
   */
  MotionState_MOTION_FOLLOW_CURVE_ROUTE(104),
  /**
   * <code>MotionState_MOTION_VEHICLE_FOLLOW_CURVE_ROUTE = 105;</code>
   */
  MotionState_MOTION_VEHICLE_FOLLOW_CURVE_ROUTE(105),
  /**
   * <code>MotionState_MOTION_NATSAURUS_NORMAL = 106;</code>
   */
  MotionState_MOTION_NATSAURUS_NORMAL(106),
  /**
   * <code>MotionState_MOTION_NATSAURUS_ENTERING = 107;</code>
   */
  MotionState_MOTION_NATSAURUS_ENTERING(107),
  /**
   * <code>MotionState_MOTION_NUM = 108;</code>
   */
  MotionState_MOTION_NUM(108),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>MotionState_MOTION_NONE = 0;</code>
   */
  public static final int MotionState_MOTION_NONE_VALUE = 0;
  /**
   * <code>MotionState_MOTION_RESET = 1;</code>
   */
  public static final int MotionState_MOTION_RESET_VALUE = 1;
  /**
   * <code>MotionState_MOTION_STANDBY = 2;</code>
   */
  public static final int MotionState_MOTION_STANDBY_VALUE = 2;
  /**
   * <code>MotionState_MOTION_STANDBY_MOVE = 3;</code>
   */
  public static final int MotionState_MOTION_STANDBY_MOVE_VALUE = 3;
  /**
   * <code>MotionState_MOTION_WALK = 4;</code>
   */
  public static final int MotionState_MOTION_WALK_VALUE = 4;
  /**
   * <code>MotionState_MOTION_RUN = 5;</code>
   */
  public static final int MotionState_MOTION_RUN_VALUE = 5;
  /**
   * <code>MotionState_MOTION_DASH = 6;</code>
   */
  public static final int MotionState_MOTION_DASH_VALUE = 6;
  /**
   * <code>MotionState_MOTION_CLIMB = 7;</code>
   */
  public static final int MotionState_MOTION_CLIMB_VALUE = 7;
  /**
   * <code>MotionState_MOTION_CLIMB_JUMP = 8;</code>
   */
  public static final int MotionState_MOTION_CLIMB_JUMP_VALUE = 8;
  /**
   * <code>MotionState_MOTION_STANDBY_TO_CLIMB = 9;</code>
   */
  public static final int MotionState_MOTION_STANDBY_TO_CLIMB_VALUE = 9;
  /**
   * <code>MotionState_MOTION_FIGHT = 10;</code>
   */
  public static final int MotionState_MOTION_FIGHT_VALUE = 10;
  /**
   * <code>MotionState_MOTION_JUMP = 11;</code>
   */
  public static final int MotionState_MOTION_JUMP_VALUE = 11;
  /**
   * <code>MotionState_MOTION_DROP = 12;</code>
   */
  public static final int MotionState_MOTION_DROP_VALUE = 12;
  /**
   * <code>MotionState_MOTION_FLY = 13;</code>
   */
  public static final int MotionState_MOTION_FLY_VALUE = 13;
  /**
   * <code>MotionState_MOTION_SWIM_MOVE = 14;</code>
   */
  public static final int MotionState_MOTION_SWIM_MOVE_VALUE = 14;
  /**
   * <code>MotionState_MOTION_SWIM_IDLE = 15;</code>
   */
  public static final int MotionState_MOTION_SWIM_IDLE_VALUE = 15;
  /**
   * <code>MotionState_MOTION_SWIM_DASH = 16;</code>
   */
  public static final int MotionState_MOTION_SWIM_DASH_VALUE = 16;
  /**
   * <code>MotionState_MOTION_SWIM_JUMP = 17;</code>
   */
  public static final int MotionState_MOTION_SWIM_JUMP_VALUE = 17;
  /**
   * <code>MotionState_MOTION_SLIP = 18;</code>
   */
  public static final int MotionState_MOTION_SLIP_VALUE = 18;
  /**
   * <code>MotionState_MOTION_GO_UPSTAIRS = 19;</code>
   */
  public static final int MotionState_MOTION_GO_UPSTAIRS_VALUE = 19;
  /**
   * <code>MotionState_MOTION_FALL_ON_GROUND = 20;</code>
   */
  public static final int MotionState_MOTION_FALL_ON_GROUND_VALUE = 20;
  /**
   * <code>MotionState_MOTION_JUMP_UP_WALL_FOR_STANDBY = 21;</code>
   */
  public static final int MotionState_MOTION_JUMP_UP_WALL_FOR_STANDBY_VALUE = 21;
  /**
   * <code>MotionState_MOTION_JUMP_OFF_WALL = 22;</code>
   */
  public static final int MotionState_MOTION_JUMP_OFF_WALL_VALUE = 22;
  /**
   * <code>MotionState_MOTION_POWERED_FLY = 23;</code>
   */
  public static final int MotionState_MOTION_POWERED_FLY_VALUE = 23;
  /**
   * <code>MotionState_MOTION_LADDER_IDLE = 24;</code>
   */
  public static final int MotionState_MOTION_LADDER_IDLE_VALUE = 24;
  /**
   * <code>MotionState_MOTION_LADDER_MOVE = 25;</code>
   */
  public static final int MotionState_MOTION_LADDER_MOVE_VALUE = 25;
  /**
   * <code>MotionState_MOTION_LADDER_SLIP = 26;</code>
   */
  public static final int MotionState_MOTION_LADDER_SLIP_VALUE = 26;
  /**
   * <code>MotionState_MOTION_STANDBY_TO_LADDER = 27;</code>
   */
  public static final int MotionState_MOTION_STANDBY_TO_LADDER_VALUE = 27;
  /**
   * <code>MotionState_MOTION_LADDER_TO_STANDBY = 28;</code>
   */
  public static final int MotionState_MOTION_LADDER_TO_STANDBY_VALUE = 28;
  /**
   * <code>MotionState_MOTION_DANGER_STANDBY = 29;</code>
   */
  public static final int MotionState_MOTION_DANGER_STANDBY_VALUE = 29;
  /**
   * <code>MotionState_MOTION_DANGER_STANDBY_MOVE = 30;</code>
   */
  public static final int MotionState_MOTION_DANGER_STANDBY_MOVE_VALUE = 30;
  /**
   * <code>MotionState_MOTION_DANGER_WALK = 31;</code>
   */
  public static final int MotionState_MOTION_DANGER_WALK_VALUE = 31;
  /**
   * <code>MotionState_MOTION_DANGER_RUN = 32;</code>
   */
  public static final int MotionState_MOTION_DANGER_RUN_VALUE = 32;
  /**
   * <code>MotionState_MOTION_DANGER_DASH = 33;</code>
   */
  public static final int MotionState_MOTION_DANGER_DASH_VALUE = 33;
  /**
   * <code>MotionState_MOTION_CROUCH_IDLE = 34;</code>
   */
  public static final int MotionState_MOTION_CROUCH_IDLE_VALUE = 34;
  /**
   * <code>MotionState_MOTION_CROUCH_MOVE = 35;</code>
   */
  public static final int MotionState_MOTION_CROUCH_MOVE_VALUE = 35;
  /**
   * <code>MotionState_MOTION_CROUCH_ROLL = 36;</code>
   */
  public static final int MotionState_MOTION_CROUCH_ROLL_VALUE = 36;
  /**
   * <code>MotionState_MOTION_NOTIFY = 37;</code>
   */
  public static final int MotionState_MOTION_NOTIFY_VALUE = 37;
  /**
   * <code>MotionState_MOTION_LAND_SPEED = 38;</code>
   */
  public static final int MotionState_MOTION_LAND_SPEED_VALUE = 38;
  /**
   * <code>MotionState_MOTION_MOVE_FAIL_ACK = 39;</code>
   */
  public static final int MotionState_MOTION_MOVE_FAIL_ACK_VALUE = 39;
  /**
   * <code>MotionState_MOTION_WATERFALL = 40;</code>
   */
  public static final int MotionState_MOTION_WATERFALL_VALUE = 40;
  /**
   * <code>MotionState_MOTION_DASH_BEFORE_SHAKE = 41;</code>
   */
  public static final int MotionState_MOTION_DASH_BEFORE_SHAKE_VALUE = 41;
  /**
   * <code>MotionState_MOTION_SIT_IDLE = 42;</code>
   */
  public static final int MotionState_MOTION_SIT_IDLE_VALUE = 42;
  /**
   * <code>MotionState_MOTION_FORCE_SET_POS = 43;</code>
   */
  public static final int MotionState_MOTION_FORCE_SET_POS_VALUE = 43;
  /**
   * <code>MotionState_MOTION_QUEST_FORCE_DRAG = 44;</code>
   */
  public static final int MotionState_MOTION_QUEST_FORCE_DRAG_VALUE = 44;
  /**
   * <code>MotionState_MOTION_FOLLOW_ROUTE = 45;</code>
   */
  public static final int MotionState_MOTION_FOLLOW_ROUTE_VALUE = 45;
  /**
   * <code>MotionState_MOTION_SKIFF_BOARDING = 46;</code>
   */
  public static final int MotionState_MOTION_SKIFF_BOARDING_VALUE = 46;
  /**
   * <code>MotionState_MOTION_SKIFF_NORMAL = 47;</code>
   */
  public static final int MotionState_MOTION_SKIFF_NORMAL_VALUE = 47;
  /**
   * <code>MotionState_MOTION_SKIFF_DASH = 48;</code>
   */
  public static final int MotionState_MOTION_SKIFF_DASH_VALUE = 48;
  /**
   * <code>MotionState_MOTION_SKIFF_POWERED_DASH = 49;</code>
   */
  public static final int MotionState_MOTION_SKIFF_POWERED_DASH_VALUE = 49;
  /**
   * <code>MotionState_MOTION_DESTROY_VEHICLE = 50;</code>
   */
  public static final int MotionState_MOTION_DESTROY_VEHICLE_VALUE = 50;
  /**
   * <code>MotionState_MOTION_FLY_IDLE = 51;</code>
   */
  public static final int MotionState_MOTION_FLY_IDLE_VALUE = 51;
  /**
   * <code>MotionState_MOTION_FLY_SLOW = 52;</code>
   */
  public static final int MotionState_MOTION_FLY_SLOW_VALUE = 52;
  /**
   * <code>MotionState_MOTION_FLY_FAST = 53;</code>
   */
  public static final int MotionState_MOTION_FLY_FAST_VALUE = 53;
  /**
   * <code>MotionState_MOTION_AIM_MOVE = 54;</code>
   */
  public static final int MotionState_MOTION_AIM_MOVE_VALUE = 54;
  /**
   * <code>MotionState_MOTION_AIR_COMPENSATION = 55;</code>
   */
  public static final int MotionState_MOTION_AIR_COMPENSATION_VALUE = 55;
  /**
   * <code>MotionState_MOTION_SORUSH_NORMAL = 56;</code>
   */
  public static final int MotionState_MOTION_SORUSH_NORMAL_VALUE = 56;
  /**
   * <code>MotionState_MOTION_ROLLER_COASTER = 57;</code>
   */
  public static final int MotionState_MOTION_ROLLER_COASTER_VALUE = 57;
  /**
   * <code>MotionState_MOTION_DIVE_IDLE = 58;</code>
   */
  public static final int MotionState_MOTION_DIVE_IDLE_VALUE = 58;
  /**
   * <code>MotionState_MOTION_DIVE_MOVE = 59;</code>
   */
  public static final int MotionState_MOTION_DIVE_MOVE_VALUE = 59;
  /**
   * <code>MotionState_MOTION_DIVE_DASH = 60;</code>
   */
  public static final int MotionState_MOTION_DIVE_DASH_VALUE = 60;
  /**
   * <code>MotionState_MOTION_DIVE_DOLPHINE = 61;</code>
   */
  public static final int MotionState_MOTION_DIVE_DOLPHINE_VALUE = 61;
  /**
   * <code>MotionState_MOTION_DEBUG = 62;</code>
   */
  public static final int MotionState_MOTION_DEBUG_VALUE = 62;
  /**
   * <code>MotionState_MOTION_OCEAN_CURRENT = 63;</code>
   */
  public static final int MotionState_MOTION_OCEAN_CURRENT_VALUE = 63;
  /**
   * <code>MotionState_MOTION_DIVE_SWIM_MOVE = 64;</code>
   */
  public static final int MotionState_MOTION_DIVE_SWIM_MOVE_VALUE = 64;
  /**
   * <code>MotionState_MOTION_DIVE_SWIM_IDLE = 65;</code>
   */
  public static final int MotionState_MOTION_DIVE_SWIM_IDLE_VALUE = 65;
  /**
   * <code>MotionState_MOTION_DIVE_SWIM_DASH = 66;</code>
   */
  public static final int MotionState_MOTION_DIVE_SWIM_DASH_VALUE = 66;
  /**
   * <code>MotionState_MOTION_ARC_LIGHT = 67;</code>
   */
  public static final int MotionState_MOTION_ARC_LIGHT_VALUE = 67;
  /**
   * <code>MotionState_MOTION_ARC_LIGHT_SAFE = 68;</code>
   */
  public static final int MotionState_MOTION_ARC_LIGHT_SAFE_VALUE = 68;
  /**
   * <code>MotionState_MOTION_VEHICLE_STANDBY = 69;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_STANDBY_VALUE = 69;
  /**
   * <code>MotionState_MOTION_VEHICLE_RUN = 70;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_RUN_VALUE = 70;
  /**
   * <code>MotionState_MOTION_VEHICLE_DASH = 71;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DASH_VALUE = 71;
  /**
   * <code>MotionState_MOTION_VEHICLE_CLIMB = 72;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_CLIMB_VALUE = 72;
  /**
   * <code>MotionState_MOTION_VEHICLE_CLIMB_JUMP = 73;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_CLIMB_JUMP_VALUE = 73;
  /**
   * <code>MotionState_MOTION_VEHICLE_STANDBY_TO_CLIMB = 74;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_STANDBY_TO_CLIMB_VALUE = 74;
  /**
   * <code>MotionState_MOTION_VEHICLE_FIGHT = 75;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FIGHT_VALUE = 75;
  /**
   * <code>MotionState_MOTION_VEHICLE_JUMP = 76;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_JUMP_VALUE = 76;
  /**
   * <code>MotionState_MOTION_VEHICLE_DROP = 77;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DROP_VALUE = 77;
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY = 78;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FLY_VALUE = 78;
  /**
   * <code>MotionState_MOTION_VEHICLE_SWIM_MOVE = 79;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_SWIM_MOVE_VALUE = 79;
  /**
   * <code>MotionState_MOTION_VEHICLE_SWIM_IDLE = 80;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_SWIM_IDLE_VALUE = 80;
  /**
   * <code>MotionState_MOTION_VEHICLE_SWIM_DASH = 81;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_SWIM_DASH_VALUE = 81;
  /**
   * <code>MotionState_MOTION_VEHICLE_SLIP = 82;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_SLIP_VALUE = 82;
  /**
   * <code>MotionState_MOTION_VEHICLE_GO_UPSTAIRS = 83;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_GO_UPSTAIRS_VALUE = 83;
  /**
   * <code>MotionState_MOTION_VEHICLE_FALL_ON_GROUND = 84;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FALL_ON_GROUND_VALUE = 84;
  /**
   * <code>MotionState_MOTION_VEHICLE_JUMP_OFF_WALL = 85;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_JUMP_OFF_WALL_VALUE = 85;
  /**
   * <code>MotionState_MOTION_VEHICLE_POWERED_FLY = 86;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_POWERED_FLY_VALUE = 86;
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_STANDBY = 87;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DANGER_STANDBY_VALUE = 87;
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_RUN = 88;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DANGER_RUN_VALUE = 88;
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_DASH = 89;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DANGER_DASH_VALUE = 89;
  /**
   * <code>MotionState_MOTION_VEHICLE_NOTIFY = 90;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_NOTIFY_VALUE = 90;
  /**
   * <code>MotionState_MOTION_VEHICLE_LAND_SPEED = 91;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_LAND_SPEED_VALUE = 91;
  /**
   * <code>MotionState_MOTION_VEHICLE_DASH_BEFORE_SHAKE = 92;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DASH_BEFORE_SHAKE_VALUE = 92;
  /**
   * <code>MotionState_MOTION_VEHICLE_QUEST_FORCE_DRAG = 93;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_QUEST_FORCE_DRAG_VALUE = 93;
  /**
   * <code>MotionState_MOTION_VEHICLE_FOLLOW_ROUTE = 94;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FOLLOW_ROUTE_VALUE = 94;
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY_IDLE = 95;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FLY_IDLE_VALUE = 95;
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY_SLOW = 96;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FLY_SLOW_VALUE = 96;
  /**
   * <code>MotionState_MOTION_VEHICLE_FLY_FAST = 97;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FLY_FAST_VALUE = 97;
  /**
   * <code>MotionState_MOTION_VEHICLE_AIR_COMPENSATION = 98;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_AIR_COMPENSATION_VALUE = 98;
  /**
   * <code>MotionState_MOTION_VEHICLE_ARC_LIGHT = 99;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_ARC_LIGHT_VALUE = 99;
  /**
   * <code>MotionState_MOTION_VEHICLE_ARC_LIGHT_SAFE = 100;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_ARC_LIGHT_SAFE_VALUE = 100;
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_SWIM_MOVE = 101;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DANGER_SWIM_MOVE_VALUE = 101;
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_SWIM_IDLE = 102;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DANGER_SWIM_IDLE_VALUE = 102;
  /**
   * <code>MotionState_MOTION_VEHICLE_DANGER_SWIM_DASH = 103;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_DANGER_SWIM_DASH_VALUE = 103;
  /**
   * <code>MotionState_MOTION_FOLLOW_CURVE_ROUTE = 104;</code>
   */
  public static final int MotionState_MOTION_FOLLOW_CURVE_ROUTE_VALUE = 104;
  /**
   * <code>MotionState_MOTION_VEHICLE_FOLLOW_CURVE_ROUTE = 105;</code>
   */
  public static final int MotionState_MOTION_VEHICLE_FOLLOW_CURVE_ROUTE_VALUE = 105;
  /**
   * <code>MotionState_MOTION_NATSAURUS_NORMAL = 106;</code>
   */
  public static final int MotionState_MOTION_NATSAURUS_NORMAL_VALUE = 106;
  /**
   * <code>MotionState_MOTION_NATSAURUS_ENTERING = 107;</code>
   */
  public static final int MotionState_MOTION_NATSAURUS_ENTERING_VALUE = 107;
  /**
   * <code>MotionState_MOTION_NUM = 108;</code>
   */
  public static final int MotionState_MOTION_NUM_VALUE = 108;


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
  public static MotionState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static MotionState forNumber(int value) {
    switch (value) {
      case 0: return MotionState_MOTION_NONE;
      case 1: return MotionState_MOTION_RESET;
      case 2: return MotionState_MOTION_STANDBY;
      case 3: return MotionState_MOTION_STANDBY_MOVE;
      case 4: return MotionState_MOTION_WALK;
      case 5: return MotionState_MOTION_RUN;
      case 6: return MotionState_MOTION_DASH;
      case 7: return MotionState_MOTION_CLIMB;
      case 8: return MotionState_MOTION_CLIMB_JUMP;
      case 9: return MotionState_MOTION_STANDBY_TO_CLIMB;
      case 10: return MotionState_MOTION_FIGHT;
      case 11: return MotionState_MOTION_JUMP;
      case 12: return MotionState_MOTION_DROP;
      case 13: return MotionState_MOTION_FLY;
      case 14: return MotionState_MOTION_SWIM_MOVE;
      case 15: return MotionState_MOTION_SWIM_IDLE;
      case 16: return MotionState_MOTION_SWIM_DASH;
      case 17: return MotionState_MOTION_SWIM_JUMP;
      case 18: return MotionState_MOTION_SLIP;
      case 19: return MotionState_MOTION_GO_UPSTAIRS;
      case 20: return MotionState_MOTION_FALL_ON_GROUND;
      case 21: return MotionState_MOTION_JUMP_UP_WALL_FOR_STANDBY;
      case 22: return MotionState_MOTION_JUMP_OFF_WALL;
      case 23: return MotionState_MOTION_POWERED_FLY;
      case 24: return MotionState_MOTION_LADDER_IDLE;
      case 25: return MotionState_MOTION_LADDER_MOVE;
      case 26: return MotionState_MOTION_LADDER_SLIP;
      case 27: return MotionState_MOTION_STANDBY_TO_LADDER;
      case 28: return MotionState_MOTION_LADDER_TO_STANDBY;
      case 29: return MotionState_MOTION_DANGER_STANDBY;
      case 30: return MotionState_MOTION_DANGER_STANDBY_MOVE;
      case 31: return MotionState_MOTION_DANGER_WALK;
      case 32: return MotionState_MOTION_DANGER_RUN;
      case 33: return MotionState_MOTION_DANGER_DASH;
      case 34: return MotionState_MOTION_CROUCH_IDLE;
      case 35: return MotionState_MOTION_CROUCH_MOVE;
      case 36: return MotionState_MOTION_CROUCH_ROLL;
      case 37: return MotionState_MOTION_NOTIFY;
      case 38: return MotionState_MOTION_LAND_SPEED;
      case 39: return MotionState_MOTION_MOVE_FAIL_ACK;
      case 40: return MotionState_MOTION_WATERFALL;
      case 41: return MotionState_MOTION_DASH_BEFORE_SHAKE;
      case 42: return MotionState_MOTION_SIT_IDLE;
      case 43: return MotionState_MOTION_FORCE_SET_POS;
      case 44: return MotionState_MOTION_QUEST_FORCE_DRAG;
      case 45: return MotionState_MOTION_FOLLOW_ROUTE;
      case 46: return MotionState_MOTION_SKIFF_BOARDING;
      case 47: return MotionState_MOTION_SKIFF_NORMAL;
      case 48: return MotionState_MOTION_SKIFF_DASH;
      case 49: return MotionState_MOTION_SKIFF_POWERED_DASH;
      case 50: return MotionState_MOTION_DESTROY_VEHICLE;
      case 51: return MotionState_MOTION_FLY_IDLE;
      case 52: return MotionState_MOTION_FLY_SLOW;
      case 53: return MotionState_MOTION_FLY_FAST;
      case 54: return MotionState_MOTION_AIM_MOVE;
      case 55: return MotionState_MOTION_AIR_COMPENSATION;
      case 56: return MotionState_MOTION_SORUSH_NORMAL;
      case 57: return MotionState_MOTION_ROLLER_COASTER;
      case 58: return MotionState_MOTION_DIVE_IDLE;
      case 59: return MotionState_MOTION_DIVE_MOVE;
      case 60: return MotionState_MOTION_DIVE_DASH;
      case 61: return MotionState_MOTION_DIVE_DOLPHINE;
      case 62: return MotionState_MOTION_DEBUG;
      case 63: return MotionState_MOTION_OCEAN_CURRENT;
      case 64: return MotionState_MOTION_DIVE_SWIM_MOVE;
      case 65: return MotionState_MOTION_DIVE_SWIM_IDLE;
      case 66: return MotionState_MOTION_DIVE_SWIM_DASH;
      case 67: return MotionState_MOTION_ARC_LIGHT;
      case 68: return MotionState_MOTION_ARC_LIGHT_SAFE;
      case 69: return MotionState_MOTION_VEHICLE_STANDBY;
      case 70: return MotionState_MOTION_VEHICLE_RUN;
      case 71: return MotionState_MOTION_VEHICLE_DASH;
      case 72: return MotionState_MOTION_VEHICLE_CLIMB;
      case 73: return MotionState_MOTION_VEHICLE_CLIMB_JUMP;
      case 74: return MotionState_MOTION_VEHICLE_STANDBY_TO_CLIMB;
      case 75: return MotionState_MOTION_VEHICLE_FIGHT;
      case 76: return MotionState_MOTION_VEHICLE_JUMP;
      case 77: return MotionState_MOTION_VEHICLE_DROP;
      case 78: return MotionState_MOTION_VEHICLE_FLY;
      case 79: return MotionState_MOTION_VEHICLE_SWIM_MOVE;
      case 80: return MotionState_MOTION_VEHICLE_SWIM_IDLE;
      case 81: return MotionState_MOTION_VEHICLE_SWIM_DASH;
      case 82: return MotionState_MOTION_VEHICLE_SLIP;
      case 83: return MotionState_MOTION_VEHICLE_GO_UPSTAIRS;
      case 84: return MotionState_MOTION_VEHICLE_FALL_ON_GROUND;
      case 85: return MotionState_MOTION_VEHICLE_JUMP_OFF_WALL;
      case 86: return MotionState_MOTION_VEHICLE_POWERED_FLY;
      case 87: return MotionState_MOTION_VEHICLE_DANGER_STANDBY;
      case 88: return MotionState_MOTION_VEHICLE_DANGER_RUN;
      case 89: return MotionState_MOTION_VEHICLE_DANGER_DASH;
      case 90: return MotionState_MOTION_VEHICLE_NOTIFY;
      case 91: return MotionState_MOTION_VEHICLE_LAND_SPEED;
      case 92: return MotionState_MOTION_VEHICLE_DASH_BEFORE_SHAKE;
      case 93: return MotionState_MOTION_VEHICLE_QUEST_FORCE_DRAG;
      case 94: return MotionState_MOTION_VEHICLE_FOLLOW_ROUTE;
      case 95: return MotionState_MOTION_VEHICLE_FLY_IDLE;
      case 96: return MotionState_MOTION_VEHICLE_FLY_SLOW;
      case 97: return MotionState_MOTION_VEHICLE_FLY_FAST;
      case 98: return MotionState_MOTION_VEHICLE_AIR_COMPENSATION;
      case 99: return MotionState_MOTION_VEHICLE_ARC_LIGHT;
      case 100: return MotionState_MOTION_VEHICLE_ARC_LIGHT_SAFE;
      case 101: return MotionState_MOTION_VEHICLE_DANGER_SWIM_MOVE;
      case 102: return MotionState_MOTION_VEHICLE_DANGER_SWIM_IDLE;
      case 103: return MotionState_MOTION_VEHICLE_DANGER_SWIM_DASH;
      case 104: return MotionState_MOTION_FOLLOW_CURVE_ROUTE;
      case 105: return MotionState_MOTION_VEHICLE_FOLLOW_CURVE_ROUTE;
      case 106: return MotionState_MOTION_NATSAURUS_NORMAL;
      case 107: return MotionState_MOTION_NATSAURUS_ENTERING;
      case 108: return MotionState_MOTION_NUM;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<MotionState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      MotionState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<MotionState>() {
          public MotionState findValueByNumber(int number) {
            return MotionState.forNumber(number);
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
    return io.grasscutter.net.proto.define.Define.getDescriptor().getEnumTypes().get(10);
  }

  private static final MotionState[] VALUES = values();

  public static MotionState valueOf(
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

  private MotionState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:MotionState)
}
