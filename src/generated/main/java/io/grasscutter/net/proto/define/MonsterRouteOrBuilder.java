// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: define.proto

package io.grasscutter.net.proto.define;

public interface MonsterRouteOrBuilder extends
    // @@protoc_insertion_point(interface_extends:MonsterRoute)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .RoutePoint route_points = 1;</code>
   */
  java.util.List<io.grasscutter.net.proto.define.RoutePoint> 
      getRoutePointsList();
  /**
   * <code>repeated .RoutePoint route_points = 1;</code>
   */
  io.grasscutter.net.proto.define.RoutePoint getRoutePoints(int index);
  /**
   * <code>repeated .RoutePoint route_points = 1;</code>
   */
  int getRoutePointsCount();
  /**
   * <code>repeated .RoutePoint route_points = 1;</code>
   */
  java.util.List<? extends io.grasscutter.net.proto.define.RoutePointOrBuilder> 
      getRoutePointsOrBuilderList();
  /**
   * <code>repeated .RoutePoint route_points = 1;</code>
   */
  io.grasscutter.net.proto.define.RoutePointOrBuilder getRoutePointsOrBuilder(
      int index);

  /**
   * <code>bool GJAIFGLOAAJ = 6;</code>
   * @return The gJAIFGLOAAJ.
   */
  boolean getGJAIFGLOAAJ();

  /**
   * <code>bool MNIFAHPFIKO = 5;</code>
   * @return The mNIFAHPFIKO.
   */
  boolean getMNIFAHPFIKO();

  /**
   * <code>uint32 route_type = 3;</code>
   * @return The routeType.
   */
  int getRouteType();

  /**
   * <code>uint32 speed_level = 2;</code>
   * @return The speedLevel.
   */
  int getSpeedLevel();

  /**
   * <code>float arrive_range = 4;</code>
   * @return The arriveRange.
   */
  float getArriveRange();
}