// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ability.proto

package io.grasscutter.net.proto.ability;

public final class Ability {
  private Ability() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvocationsNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvocationsNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvokeEntryHead_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvokeEntryHead_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvokeEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvokeEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityChangeNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityChangeNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientAbilityChangeNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientAbilityChangeNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityAbilityInvokeEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityAbilityInvokeEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvocationFixedNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvocationFixedNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientAbilityInitFinishNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientAbilityInitFinishNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AbilityInvocationFailNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AbilityInvocationFailNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ServerGlobalValueChangeNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ServerGlobalValueChangeNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ClientAbilitiesInitFinishCombineNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ClientAbilitiesInitFinishCombineNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rability.proto\032\013fight.proto\032\014define.pro" +
      "to\"D\n\030AbilityInvocationsNotify\022(\n\013JJBLBL" +
      "MDPHC\030\t \003(\0132\023.AbilityInvokeEntry\"\325\001\n\026Abi" +
      "lityInvokeEntryHead\022\021\n\ttarget_id\030\r \001(\r\022 " +
      "\n\030modifier_config_local_id\030\005 \001(\005\022\027\n\017serv" +
      "er_buff_uid\030\002 \001(\r\022\036\n\026is_serverbuff_modif" +
      "ier\030\004 \001(\010\022\035\n\025instanced_modifier_id\030\003 \001(\r" +
      "\022\034\n\024instanced_ability_id\030\010 \001(\r\022\020\n\010local_" +
      "id\030\001 \001(\005\"\222\002\n\022AbilityInvokeEntry\022\024\n\014abili" +
      "ty_data\030\017 \001(\014\022%\n\004head\030\004 \001(\0132\027.AbilityInv" +
      "okeEntryHead\022\026\n\016is_ignore_auth\030\006 \001(\010\022\021\n\t" +
      "entity_id\030\013 \001(\r\022\"\n\014forward_type\030\t \001(\0162\014." +
      "ForwardType\022\023\n\013JPHBOKDMDAH\030\r \001(\r\022\027\n\017tota" +
      "l_tick_time\030\n \001(\001\022-\n\rargument_type\030\007 \001(\016" +
      "2\026.AbilityInvokeArgument\022\023\n\013HNOGKEHFLHE\030" +
      "\010 \001(\r\"]\n\023AbilityChangeNotify\0223\n\025ability_" +
      "control_block\030\t \001(\0132\024.AbilityControlBloc" +
      "k\022\021\n\tentity_id\030\014 \001(\r\"n\n\031ClientAbilityCha" +
      "ngeNotify\022(\n\013JJBLBLMDPHC\030\017 \003(\0132\023.Ability" +
      "InvokeEntry\022\024\n\014is_init_hash\030\014 \001(\010\022\021\n\tent" +
      "ity_id\030\n \001(\r\"W\n\030EntityAbilityInvokeEntry" +
      "\022(\n\013JJBLBLMDPHC\030\n \003(\0132\023.AbilityInvokeEnt" +
      "ry\022\021\n\tentity_id\030\013 \001(\r\"\232\002\n\034AbilityInvocat" +
      "ionFixedNotify\022(\n\013CNLHMFMMMOL\030\017 \001(\0132\023.Ab" +
      "ilityInvokeEntry\022(\n\013KJADOHHDHNJ\030\001 \001(\0132\023." +
      "AbilityInvokeEntry\022(\n\013FADGNFKGNOG\030\013 \001(\0132" +
      "\023.AbilityInvokeEntry\022(\n\013PEJIJNIJGOO\030\014 \001(" +
      "\0132\023.AbilityInvokeEntry\022(\n\013HBIDFELECFF\030\016 " +
      "\001(\0132\023.AbilityInvokeEntry\022(\n\013IMELONLCKII\030" +
      "\010 \001(\0132\023.AbilityInvokeEntry\"\\\n\035ClientAbil" +
      "ityInitFinishNotify\022(\n\013JJBLBLMDPHC\030\017 \003(\013" +
      "2\023.AbilityInvokeEntry\022\021\n\tentity_id\030\004 \001(\r" +
      "\"e\n\033AbilityInvocationFailNotify\022\016\n\006reaso" +
      "n\030\016 \001(\t\022#\n\006invoke\030\006 \001(\0132\023.AbilityInvokeE" +
      "ntry\022\021\n\tentity_id\030\t \001(\r\"S\n\035ServerGlobalV" +
      "alueChangeNotify\022\r\n\005value\030\r \001(\002\022\020\n\010key_h" +
      "ash\030\t \001(\r\022\021\n\tentity_id\030\001 \001(\r\"_\n&ClientAb" +
      "ilitiesInitFinishCombineNotify\0225\n\022entity" +
      "_invoke_list\030\006 \003(\0132\031.EntityAbilityInvoke" +
      "Entry*\326)\n\025AbilityInvokeArgument\022&\n\"Abili" +
      "tyInvokeArgument_ABILITY_NONE\020\000\0226\n2Abili" +
      "tyInvokeArgument_ABILITY_META_MODIFIER_C" +
      "HANGE\020\001\022F\nBAbilityInvokeArgument_ABILITY" +
      "_META_COMMAND_MODIFIER_CHANGE_REQUEST\020\002\022" +
      "=\n9AbilityInvokeArgument_ABILITY_META_SP" +
      "ECIAL_FLOAT_ARGUMENT\020\003\0225\n1AbilityInvokeA" +
      "rgument_ABILITY_META_OVERRIDE_PARAM\020\004\022;\n" +
      "7AbilityInvokeArgument_ABILITY_META_CLEA" +
      "R_OVERRIDE_PARAM\020\005\0229\n5AbilityInvokeArgum" +
      "ent_ABILITY_META_REINIT_OVERRIDEMAP\020\006\0229\n" +
      "5AbilityInvokeArgument_ABILITY_META_GLOB" +
      "AL_FLOAT_VALUE\020\007\022?\n;AbilityInvokeArgumen" +
      "t_ABILITY_META_CLEAR_GLOBAL_FLOAT_VALUE\020" +
      "\010\022?\n;AbilityInvokeArgument_ABILITY_META_" +
      "ABILITY_ELEMENT_STRENGTH\020\t\022E\nAAbilityInv" +
      "okeArgument_ABILITY_META_ADD_OR_GET_ABIL" +
      "ITY_AND_TRIGGER\020\n\0228\n4AbilityInvokeArgume" +
      "nt_ABILITY_META_SET_KILLED_SETATE\020\013\022:\n6A" +
      "bilityInvokeArgument_ABILITY_META_SET_AB" +
      "ILITY_TRIGGER\020\014\0226\n2AbilityInvokeArgument" +
      "_ABILITY_META_ADD_NEW_ABILITY\020\r\0225\n1Abili" +
      "tyInvokeArgument_ABILITY_META_REMOVE_ABI" +
      "LITY\020\016\022@\n<AbilityInvokeArgument_ABILITY_" +
      "META_SET_MODIFIER_APPLY_ENTITY\020\017\022A\n=Abil" +
      "ityInvokeArgument_ABILITY_META_MODIFIER_" +
      "DURABILITY_CHANGE\020\020\022>\n:AbilityInvokeArgu" +
      "ment_ABILITY_META_ELEMENT_REACTION_VISUA" +
      "L\020\021\0229\n5AbilityInvokeArgument_ABILITY_MET" +
      "A_SET_POSE_PARAMETER\020\022\022B\n>AbilityInvokeA" +
      "rgument_ABILITY_META_UPDATE_BASE_REACTIO" +
      "N_DAMAGE\020\023\022?\n;AbilityInvokeArgument_ABIL" +
      "ITY_META_TRIGGER_ELEMENT_REACTION\020\024\022.\n*A" +
      "bilityInvokeArgument_ABILITY_META_LOSE_H" +
      "P\020\025\0229\n5AbilityInvokeArgument_ABILITY_MET" +
      "A_DURABILITY_IS_ZERO\020\026\022=\n9AbilityInvokeA" +
      "rgument_ABILITY_META_TRIGGER_ARKHE_REACT" +
      "ION\020\027\0227\n3AbilityInvokeArgument_ABILITY_M" +
      "ETA_CHANGE_NYX_VALUE\020\030\0228\n4AbilityInvokeA" +
      "rgument_ABILITY_ACTION_TRIGGER_ABILITY\0202" +
      "\0229\n5AbilityInvokeArgument_ABILITY_ACTION" +
      "_SET_CRASH_DAMAGE\0203\022/\n+AbilityInvokeArgu" +
      "ment_ABILITY_ACTION_EFFECT\0204\022/\n+AbilityI" +
      "nvokeArgument_ABILITY_ACTION_SUMMON\0205\022.\n" +
      "*AbilityInvokeArgument_ABILITY_ACTION_BL" +
      "INK\0206\0226\n2AbilityInvokeArgument_ABILITY_A" +
      "CTION_CREATE_GADGET\0207\022=\n9AbilityInvokeAr" +
      "gument_ABILITY_ACTION_APPLY_LEVEL_MODIFI" +
      "ER\0208\022;\n7AbilityInvokeArgument_ABILITY_AC" +
      "TION_GENERATE_ELEM_BALL\0209\022F\nBAbilityInvo" +
      "keArgument_ABILITY_ACTION_SET_RANDOM_OVE" +
      "RRIDE_MAP_VALUE\020:\022;\n7AbilityInvokeArgume" +
      "nt_ABILITY_ACTION_SERVER_MONSTER_LOG\020;\0224" +
      "\n0AbilityInvokeArgument_ABILITY_ACTION_C" +
      "REATE_TILE\020<\0225\n1AbilityInvokeArgument_AB" +
      "ILITY_ACTION_DESTROY_TILE\020=\0229\n5AbilityIn" +
      "vokeArgument_ABILITY_ACTION_FIRE_AFTER_I" +
      "MAGE\020>\0227\n3AbilityInvokeArgument_ABILITY_" +
      "ACTION_DEDUCT_STAMINA\020?\0223\n/AbilityInvoke" +
      "Argument_ABILITY_ACTION_HIT_EFFECT\020@\022@\n<" +
      "AbilityInvokeArgument_ABILITY_ACTION_SET" +
      "_BULLET_TRACK_TARGET\020A\0228\n4AbilityInvokeA" +
      "rgument_ABILITY_ACTION_FIREWORK_EFFECT\020B" +
      "\022=\n9AbilityInvokeArgument_ABILITY_ACTION" +
      "_LEVEL_BANK_ADD_STUFF\020C\022A\n=AbilityInvoke" +
      "Argument_ABILITY_ACTION_GET_MATERIAL_PAR" +
      "AM_FLOAT\020D\022B\n>AbilityInvokeArgument_ABIL" +
      "ITY_ACTION_GET_MATERIAL_PARAM_VECTOR\020E\022H" +
      "\nDAbilityInvokeArgument_ABILITY_ACTION_S" +
      "PECTACLE_BUILD_RECREATE_GADGET\020F\022>\n:Abil" +
      "ityInvokeArgument_ABILITY_MIXIN_AVATAR_S" +
      "TEER_BY_CAMERA\020d\0226\n2AbilityInvokeArgumen" +
      "t_ABILITY_MIXIN_MONSTER_DEFEND\020e\0221\n-Abil" +
      "ityInvokeArgument_ABILITY_MIXIN_WIND_ZON" +
      "E\020f\0224\n0AbilityInvokeArgument_ABILITY_MIX" +
      "IN_COST_STAMINA\020g\0224\n0AbilityInvokeArgume" +
      "nt_ABILITY_MIXIN_ELITE_SHIELD\020h\0226\n2Abili" +
      "tyInvokeArgument_ABILITY_MIXIN_ELEMENT_S" +
      "HIELD\020i\0225\n1AbilityInvokeArgument_ABILITY" +
      "_MIXIN_GLOBAL_SHIELD\020j\0222\n.AbilityInvokeA" +
      "rgument_ABILITY_MIXIN_SHIELD_BAR\020k\0229\n5Ab" +
      "ilityInvokeArgument_ABILITY_MIXIN_WIND_S" +
      "EED_SPAWNER\020l\022E\nAAbilityInvokeArgument_A" +
      "BILITY_MIXIN_DO_ACTION_BY_ELEMENT_REACTI" +
      "ON\020m\022A\n=AbilityInvokeArgument_ABILITY_MI" +
      "XIN_FIELD_ENTITY_COUNT_CHANGE\020n\0227\n3Abili" +
      "tyInvokeArgument_ABILITY_MIXIN_SCENE_PRO" +
      "P_SYNC\020o\0229\n5AbilityInvokeArgument_ABILIT" +
      "Y_MIXIN_WIDGET_MP_SUPPORT\020p\022[\nWAbilityIn" +
      "vokeArgument_ABILITY_MIXIN_DO_ACTION_BY_" +
      "SELF_MODIFIER_ELEMENT_DURABILITY_RATIO\020q" +
      "\022:\n6AbilityInvokeArgument_ABILITY_MIXIN_" +
      "FIREWORKS_LAUNCHER\020r\022B\n>AbilityInvokeArg" +
      "ument_ABILITY_MIXIN_ATTACK_RESULT_CREATE" +
      "_COUNT\020s\0228\n4AbilityInvokeArgument_ABILIT" +
      "Y_MIXIN_UGC_TIME_CONTROL\020t\0225\n1AbilityInv" +
      "okeArgument_ABILITY_MIXIN_AVATAR_COMBAT\020" +
      "u\022F\nBAbilityInvokeArgument_ABILITY_MIXIN" +
      "_DEATH_ZONE_REGIONAL_PLAY_MIXIN\020v\0223\n/Abi" +
      "lityInvokeArgument_ABILITY_MIXIN_UI_INTE" +
      "RACT\020w\0229\n5AbilityInvokeArgument_ABILITY_" +
      "MIXIN_SHOOT_FROM_CAMERA\020x\022<\n8AbilityInvo" +
      "keArgument_ABILITY_MIXIN_ERASE_BRICK_ACT" +
      "IVITY\020y\0220\n,AbilityInvokeArgument_ABILITY" +
      "_MIXIN_BREAKOUT\020z\0223\n/AbilityInvokeArgume" +
      "nt_ABILITY_MIXIN_DAMAGE_LOAN\020{\0224\n0Abilit" +
      "yInvokeArgument_ABILITY_MIXIN_BROADCAST_" +
      "GV\020|\0222\n.AbilityInvokeArgument_ABILITY_MI" +
      "XIN_RECEIVE_GV\020}\022=\n9AbilityInvokeArgumen" +
      "t_ABILITY_MIXIN_RAYCAST_SELECT_TARGET\020~\022" +
      "=\n9AbilityInvokeArgument_ABILITY_MIXIN_E" +
      "NERGY_CRYSTAL_TARGET\020\177\022?\n:AbilityInvokeA" +
      "rgument_ABILITY_MIXIN_ROTATION_FOLLOW_CA" +
      "MERA\020\200\001\0226\n1AbilityInvokeArgument_ABILITY" +
      "_MIXIN_BUOYANT_FORCE\020\201\001\022;\n6AbilityInvoke" +
      "Argument_ABILITY_MIXIN_FILMFEST_BALL_GAM" +
      "E\020\202\001\022:\n5AbilityInvokeArgument_ABILITY_MI" +
      "XIN_CHECK_SCAN_ENTITY\020\203\001\022:\n5AbilityInvok" +
      "eArgument_ABILITY_MIXIN_TIME_TRACK_PLAYE" +
      "R\020\205\001\0224\n/AbilityInvokeArgument_ABILITY_MI" +
      "XIN_PART_FOLLOW\020\206\001\022:\n5AbilityInvokeArgum" +
      "ent_ABILITY_MIXIN_CHANGE_PHLOGISTON\020\207\001\022Q" +
      "\nLAbilityInvokeArgument_ABILITY_MIXIN_HU" +
      "MAN_DRAGON_COLLAB_PICK_PHLOGISTON_BALL\020\210" +
      "\001\022=\n8AbilityInvokeArgument_ABILITY_MIXIN" +
      "_FREQUENCY_SHIELD_BAR\020\211\001\022;\n6AbilityInvok" +
      "eArgument_ABILITY_MIXIN_SHAMAN_VIEW_TARG" +
      "ET\020\212\001\022H\nCAbilityInvokeArgument_ABILITY_M" +
      "IXIN_ATTACH_MODIFIER_TO_GLOBAL_VALUE\020\213\001\022" +
      "5\n0AbilityInvokeArgument_ABILITY_MIXIN_B" +
      "RICK_MATRIX\020\214\001\022@\n;AbilityInvokeArgument_" +
      "ABILITY_MIXIN_VEHICLE_STEER_BY_CAMERA\020\215\001" +
      "\022<\n7AbilityInvokeArgument_ABILITY_MIXIN_" +
      "AVATAR_SPECIAL_MOVE\020\217\001B$\n io.grasscutter" +
      ".net.proto.abilityP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.net.proto.fight.Fight.getDescriptor(),
          io.grasscutter.net.proto.define.Define.getDescriptor(),
        });
    internal_static_AbilityInvocationsNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_AbilityInvocationsNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvocationsNotify_descriptor,
        new java.lang.String[] { "JJBLBLMDPHC", });
    internal_static_AbilityInvokeEntryHead_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AbilityInvokeEntryHead_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvokeEntryHead_descriptor,
        new java.lang.String[] { "TargetId", "ModifierConfigLocalId", "ServerBuffUid", "IsServerbuffModifier", "InstancedModifierId", "InstancedAbilityId", "LocalId", });
    internal_static_AbilityInvokeEntry_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_AbilityInvokeEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvokeEntry_descriptor,
        new java.lang.String[] { "AbilityData", "Head", "IsIgnoreAuth", "EntityId", "ForwardType", "JPHBOKDMDAH", "TotalTickTime", "ArgumentType", "HNOGKEHFLHE", });
    internal_static_AbilityChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_AbilityChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityChangeNotify_descriptor,
        new java.lang.String[] { "AbilityControlBlock", "EntityId", });
    internal_static_ClientAbilityChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_ClientAbilityChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientAbilityChangeNotify_descriptor,
        new java.lang.String[] { "JJBLBLMDPHC", "IsInitHash", "EntityId", });
    internal_static_EntityAbilityInvokeEntry_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EntityAbilityInvokeEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityAbilityInvokeEntry_descriptor,
        new java.lang.String[] { "JJBLBLMDPHC", "EntityId", });
    internal_static_AbilityInvocationFixedNotify_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_AbilityInvocationFixedNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvocationFixedNotify_descriptor,
        new java.lang.String[] { "CNLHMFMMMOL", "KJADOHHDHNJ", "FADGNFKGNOG", "PEJIJNIJGOO", "HBIDFELECFF", "IMELONLCKII", });
    internal_static_ClientAbilityInitFinishNotify_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_ClientAbilityInitFinishNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientAbilityInitFinishNotify_descriptor,
        new java.lang.String[] { "JJBLBLMDPHC", "EntityId", });
    internal_static_AbilityInvocationFailNotify_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_AbilityInvocationFailNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AbilityInvocationFailNotify_descriptor,
        new java.lang.String[] { "Reason", "Invoke", "EntityId", });
    internal_static_ServerGlobalValueChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_ServerGlobalValueChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ServerGlobalValueChangeNotify_descriptor,
        new java.lang.String[] { "Value", "KeyHash", "EntityId", });
    internal_static_ClientAbilitiesInitFinishCombineNotify_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_ClientAbilitiesInitFinishCombineNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ClientAbilitiesInitFinishCombineNotify_descriptor,
        new java.lang.String[] { "EntityInvokeList", });
    io.grasscutter.net.proto.fight.Fight.getDescriptor();
    io.grasscutter.net.proto.define.Define.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}