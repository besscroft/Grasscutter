package emu.grasscutter.server.packet.send;

import emu.grasscutter.game.player.Player;
import emu.grasscutter.game.player.Player.SceneLoadState;
import emu.grasscutter.game.props.EnterReason;
import emu.grasscutter.game.world.Position;
import emu.grasscutter.game.world.data.TeleportProperties;
import emu.grasscutter.net.packet.*;
import io.grasscutter.net.proto.scene.EnterType;
import io.grasscutter.net.proto.scene.PlayerEnterSceneNotify;
import emu.grasscutter.utils.Utils;

public class PacketPlayerEnterSceneNotify extends BasePacket {

    // Login
    public PacketPlayerEnterSceneNotify(Player player) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        var proto =
                PlayerEnterSceneNotify.newBuilder()
                        .setSceneId(player.getSceneId())
                        .setPos(player.getPosition().toProto())
                        .setSceneBeginTime(System.currentTimeMillis())
                        .setType(EnterType.ENTER_TYPE_SELF)
                        .setTargetUid(player.getUid())
                        .setEnterSceneToken(player.getEnterSceneToken())
                        .setWorldLevel(player.getWorldLevel())
                        // .setEnterReason(EnterReason.Login.getValue()) // Removed in 5.0; we don't know what
                        // it is
                        // .setIsFirstLoginEnterScene(player.isFirstLoginEnterScene()) // Removed in 5.0; we
                        // don't know what it is
                        // .setWorldType(1) // Removed in 5.0; we don't know what it is
                        .setSceneTransaction(
                                "3-"
                                        + player.getUid()
                                        + "-"
                                        + (int) (System.currentTimeMillis() / 1000)
                                        + "-"
                                        + 18402);

        this.setData(proto);
    }

    public PacketPlayerEnterSceneNotify(
            Player player, EnterType type, EnterReason reason, int newScene, Position newPos) {
        this(player, player, type, reason, newScene, newPos);
    }

    public PacketPlayerEnterSceneNotify(Player player, TeleportProperties teleportProperties) {
        this(player, player, teleportProperties);
    }

    public PacketPlayerEnterSceneNotify(
            Player player,
            Player target,
            EnterType type,
            EnterReason reason,
            int newScene,
            Position newPos) {
        this(
                player,
                target,
                TeleportProperties.builder()
                        .enterType(type)
                        .enterReason(reason)
                        .sceneId(newScene)
                        .teleportTo(newPos)
                        .build());
    }

    // Teleport or go somewhere
    public PacketPlayerEnterSceneNotify(
            Player player, Player target, TeleportProperties teleportProperties) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        var proto =
                PlayerEnterSceneNotify.newBuilder()
                        // .setPrevSceneId(player.getSceneId()) // Removed in 5.0; we don't know what it is
                        // .setPrevPos(player.getPosition().toProto()) // Removed in 5.0; we don't know what it
                        // is
                        .setSceneId(teleportProperties.getSceneId())
                        .setPos(teleportProperties.getTeleportTo().toProto())
                        .setSceneBeginTime(System.currentTimeMillis())
                        .setType(teleportProperties.getEnterType())
                        .setTargetUid(target.getUid())
                        .setEnterSceneToken(player.getEnterSceneToken())
                        .setWorldLevel(target.getWorld().getWorldLevel())
                        // .setEnterReason(teleportProperties.getEnterReason().getValue()) // Removed in 5.0; we
                        // don't know what it is
                        // .setWorldType(1) // Removed in 5.0; we don't know what it is
                        .setSceneTransaction(
                                teleportProperties.getSceneId()
                                        + "-"
                                        + target.getUid()
                                        + "-"
                                        + (int) (System.currentTimeMillis() / 1000)
                                        + "-"
                                        + 18402);

        // Apply the dungeon ID to the packet if it's a dungeon.
        if (teleportProperties.getDungeonId() != 0) {
            proto.setDungeonId(teleportProperties.getDungeonId());
        }

        this.setData(proto);
    }

    // Go home
    public PacketPlayerEnterSceneNotify(
            Player player, int targetUid, TeleportProperties teleportProperties, boolean other) {
        super(PacketOpcodes.PlayerEnterSceneNotify);

        player.setSceneLoadState(SceneLoadState.LOADING);
        player.setEnterSceneToken(Utils.randomRange(1000, 99999));

        var proto =
                PlayerEnterSceneNotify.newBuilder()
                        // .setPrevSceneId(player.getSceneId()) // Removed in 5.0; we don't know what it is
                        // .setPrevPos(player.getPosition().toProto()) // Removed in 5.0; we don't know what it
                        // is
                        .setSceneId(teleportProperties.getSceneId())
                        .setPos(teleportProperties.getTeleportTo().toProto())
                        .setSceneBeginTime(System.currentTimeMillis())
                        .setType(other ? EnterType.ENTER_TYPE_OTHER_HOME : EnterType.ENTER_TYPE_SELF_HOME)
                        .setTargetUid(targetUid)
                        .setEnterSceneToken(player.getEnterSceneToken())
                        // .setEnterReason(teleportProperties.getEnterReason().getValue()) // Removed in 5.0; we
                        // don't know what it is
                        // .setWorldType(64) // Removed in 5.0; we don't know what it is
                        .setSceneTransaction(
                                teleportProperties.getSceneId()
                                        + "-"
                                        + targetUid
                                        + "-"
                                        + (int) (System.currentTimeMillis() / 1000)
                                        + "-"
                                        + 27573);

        this.setData(proto);
    }
}
