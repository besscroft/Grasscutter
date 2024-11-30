// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: property.proto

package io.grasscutter.net.proto.property;

public final class Property {
  private Property() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_LifeStateChangeNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_LifeStateChangeNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarLifeStateChangeNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarLifeStateChangeNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropUpdateNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropUpdateNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropChangeReasonNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropChangeReasonNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropNotify_PropMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropNotify_PropMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EntityFightPropNotify_FightPropMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarPropChangeReasonNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PlayerPropChangeReasonNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFightPropUpdateNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFightPropUpdateNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFightPropUpdateNotify_FightPropMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFightPropUpdateNotify_FightPropMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFightPropNotify_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFightPropNotify_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_AvatarFightPropNotify_FightPropMapEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_AvatarFightPropNotify_FightPropMapEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_PropChangeDetailInfo_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_PropChangeDetailInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KNJLMGFKIMB_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KNJLMGFKIMB_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016property.proto\032\014define.proto\"\345\001\n\025LifeS" +
      "tateChangeNotify\022\023\n\013OHMKBGAMEIM\030\004 \003(\t\022%\n" +
      "\020server_buff_list\030\006 \003(\0132\013.ServerBuff\022\022\n\n" +
      "attack_tag\030\t \001(\t\022\021\n\tentity_id\030\010 \001(\r\022\031\n\021m" +
      "ove_reliable_seq\030\r \001(\r\022\022\n\nlife_state\030\014 \001" +
      "(\r\022 \n\010die_type\030\002 \001(\0162\016.PlayerDieType\022\030\n\020" +
      "source_entity_id\030\005 \001(\r\"\355\001\n\033AvatarLifeSta" +
      "teChangeNotify\022%\n\020server_buff_list\030\003 \003(\013" +
      "2\013.ServerBuff\022\023\n\013OHMKBGAMEIM\030\r \003(\t\022\022\n\nat" +
      "tack_tag\030\010 \001(\t\022 \n\010die_type\030\016 \001(\0162\016.Playe" +
      "rDieType\022\031\n\021move_reliable_seq\030\013 \001(\r\022\023\n\013a" +
      "vatar_guid\030\005 \001(\004\022\022\n\nlife_state\030\007 \001(\r\022\030\n\020" +
      "source_entity_id\030\014 \001(\r\"\255\001\n\033EntityFightPr" +
      "opUpdateNotify\022F\n\016fight_prop_map\030\n \003(\0132." +
      ".EntityFightPropUpdateNotify.FightPropMa" +
      "pEntry\022\021\n\tentity_id\030\016 \001(\r\0323\n\021FightPropMa" +
      "pEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\002:\0028\001\"\336" +
      "\002\n!EntityFightPropChangeReasonNotify\022\022\n\n" +
      "param_list\030\013 \003(\r\022*\n\013detail_info\030\005 \001(\0132\025." +
      "PropChangeDetailInfo\022\021\n\tprop_type\030\010 \001(\r\022" +
      "\'\n\017change_hp_debts\030\t \001(\0162\016.ChangeHpDebts" +
      "\022\025\n\rpaid_hp_debts\030\014 \001(\002\022\021\n\tentity_id\030\003 \001" +
      "(\r\022!\n\006reason\030\017 \001(\0162\021.PropChangeReason\022\022\n" +
      "\nprop_delta\030\006 \001(\002\0221\n\024change_energy_reaso" +
      "n\030\n \001(\0162\023.ChangeEnergyReason\022)\n\020change_h" +
      "p_reason\030\004 \001(\0162\017.ChangeHpReason\"\211\001\n\020Avat" +
      "arPropNotify\0220\n\010prop_map\030\n \003(\0132\036.AvatarP" +
      "ropNotify.PropMapEntry\022\023\n\013avatar_guid\030\t " +
      "\001(\004\032.\n\014PropMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005valu" +
      "e\030\002 \001(\003:\0028\001\"\241\001\n\025EntityFightPropNotify\022@\n" +
      "\016fight_prop_map\030\r \003(\0132(.EntityFightPropN" +
      "otify.FightPropMapEntry\022\021\n\tentity_id\030\003 \001" +
      "(\r\0323\n\021FightPropMapEntry\022\013\n\003key\030\001 \001(\r\022\r\n\005" +
      "value\030\002 \001(\002:\0028\001\"\217\001\n\034AvatarPropChangeReas" +
      "onNotify\022\021\n\told_value\030\003 \001(\002\022\021\n\tprop_type" +
      "\030\t \001(\r\022\023\n\013avatar_guid\030\014 \001(\004\022\021\n\tcur_value" +
      "\030\006 \001(\002\022!\n\006reason\030\013 \001(\0162\021.PropChangeReaso" +
      "n\"z\n\034PlayerPropChangeReasonNotify\022\021\n\tpro" +
      "p_type\030\005 \001(\r\022\021\n\tcur_value\030\002 \001(\002\022\021\n\told_v" +
      "alue\030\006 \001(\002\022!\n\006reason\030\n \001(\0162\021.PropChangeR" +
      "eason\"\257\001\n\033AvatarFightPropUpdateNotify\022F\n" +
      "\016fight_prop_map\030\010 \003(\0132..AvatarFightPropU" +
      "pdateNotify.FightPropMapEntry\022\023\n\013avatar_" +
      "guid\030\001 \001(\004\0323\n\021FightPropMapEntry\022\013\n\003key\030\001" +
      " \001(\r\022\r\n\005value\030\002 \001(\002:\0028\001\"\243\001\n\025AvatarFightP" +
      "ropNotify\022@\n\016fight_prop_map\030\r \003(\0132(.Avat" +
      "arFightPropNotify.FightPropMapEntry\022\023\n\013a" +
      "vatar_guid\030\005 \001(\004\0323\n\021FightPropMapEntry\022\013\n" +
      "\003key\030\001 \001(\r\022\r\n\005value\030\002 \001(\002:\0028\001\"R\n\024PropCha" +
      "ngeDetailInfo\022+\n\023detail_ability_info\030\t \001" +
      "(\0132\014.KNJLMGFKIMBH\000B\r\n\013LMBBPKAKIMG\"\267\001\n\013KN" +
      "JLMGFKIMB\022+\n\023parent_ability_name\030\002 \001(\0132\016" +
      ".AbilityString\022\035\n\025instanced_modifier_id\030" +
      "\007 \001(\r\022\020\n\010local_id\030\006 \001(\005\022\021\n\tcaster_id\030\r \001" +
      "(\r\022\034\n\024instanced_ability_id\030\010 \001(\r\022\031\n\021modi" +
      "fier_local_id\030\014 \001(\005*\322\002\n\022ChangeEnergyReas" +
      "on\022)\n%ChangeEnergyReason_CHANGE_ENERGY_N" +
      "ONE\020\000\0220\n,ChangeEnergyReason_CHANGE_ENERG" +
      "Y_SKILL_START\020\001\022)\n%ChangeEnergyReason_CH" +
      "ANGE_ENERGY_BALL\020\002\022*\n&ChangeEnergyReason" +
      "_CHANGE_ENERGY_QUEST\020\003\022,\n(ChangeEnergyRe" +
      "ason_CHANGE_ENERGY_ABILITY\020\004\022(\n$ChangeEn" +
      "ergyReason_CHANGE_ENERGY_DIE\020\005\0220\n,Change" +
      "EnergyReason_CHANGE_ENERGY_SKILL_DEPOT\020\006" +
      "*\223\005\n\020PropChangeReason\022%\n!PropChangeReaso" +
      "n_PROP_CHANGE_NONE\020\000\022/\n+PropChangeReason" +
      "_PROP_CHANGE_STATUE_RECOVER\020\001\022,\n(PropCha" +
      "ngeReason_PROP_CHANGE_ENERGY_BALL\020\002\022(\n$P" +
      "ropChangeReason_PROP_CHANGE_ABILITY\020\003\022(\n" +
      "$PropChangeReason_PROP_CHANGE_LEVELUP\020\004\022" +
      "%\n!PropChangeReason_PROP_CHANGE_ITEM\020\005\022," +
      "\n(PropChangeReason_PROP_CHANGE_AVATAR_CA" +
      "RD\020\006\022-\n)PropChangeReason_PROP_CHANGE_CIT" +
      "Y_LEVELUP\020\007\022/\n+PropChangeReason_PROP_CHA" +
      "NGE_AVATAR_UPGRADE\020\010\022/\n+PropChangeReason" +
      "_PROP_CHANGE_AVATAR_PROMOTE\020\t\022/\n+PropCha" +
      "ngeReason_PROP_CHANGE_PLAYER_ADD_EXP\020\n\022-" +
      "\n)PropChangeReason_PROP_CHANGE_FINISH_QU" +
      "EST\020\013\022#\n\037PropChangeReason_PROP_CHANGE_GM" +
      "\020\014\022:\n6PropChangeReason_PROP_CHANGE_MANUA" +
      "L_ADJUST_WORLD_LEVEL\020\r*\226\002\n\rChangeHpDebts" +
      "\022&\n\"ChangeHpDebts_CHANGE_HP_DEBTS_NONE\020\000" +
      "\022%\n!ChangeHpDebts_CHANGE_HP_DEBTS_PAY\020\001\022" +
      ",\n(ChangeHpDebts_CHANGE_HP_DEBTS_PAY_FIN" +
      "ISH\020\002\022\'\n#ChangeHpDebts_CHANGE_HP_DEBTS_C" +
      "LEAR\020\025\0220\n,ChangeHpDebts_CHANGE_HP_DEBTS_" +
      "REDUCE_ABILITY\020)\022-\n)ChangeHpDebts_CHANGE" +
      "_HP_DEBTS_ADD_ABILITY\0203*\272\014\n\016ChangeHpReas" +
      "on\022!\n\035ChangeHpReason_CHANGE_HP_NONE\020\000\022\'\n" +
      "#ChangeHpReason_CHANGE_HP_SUB_AVATAR\020\001\022(" +
      "\n$ChangeHpReason_CHANGE_HP_SUB_MONSTER\020\002" +
      "\022%\n!ChangeHpReason_CHANGE_HP_SUB_GEAR\020\003\022" +
      "&\n\"ChangeHpReason_CHANGE_HP_SUB_ENVIR\020\004\022" +
      "%\n!ChangeHpReason_CHANGE_HP_SUB_FALL\020\005\022&" +
      "\n\"ChangeHpReason_CHANGE_HP_SUB_DRAWN\020\006\022&" +
      "\n\"ChangeHpReason_CHANGE_HP_SUB_ABYSS\020\007\022(" +
      "\n$ChangeHpReason_CHANGE_HP_SUB_ABILITY\020\010" +
      "\022\'\n#ChangeHpReason_CHANGE_HP_SUB_SUMMON\020" +
      "\t\022\'\n#ChangeHpReason_CHANGE_HP_SUB_SCRIPT" +
      "\020\n\022#\n\037ChangeHpReason_CHANGE_HP_SUB_GM\020\013\022" +
      "*\n&ChangeHpReason_CHANGE_HP_SUB_KILL_SEL" +
      "F\020\014\022-\n)ChangeHpReason_CHANGE_HP_SUB_CLIM" +
      "ATE_COLD\020\r\0220\n,ChangeHpReason_CHANGE_HP_S" +
      "UB_STORM_LIGHTNING\020\016\0223\n/ChangeHpReason_C" +
      "HANGE_HP_SUB_KILL_SERVER_GADGET\020\017\022(\n$Cha" +
      "ngeHpReason_CHANGE_HP_SUB_REPLACE\020\020\022-\n)C" +
      "hangeHpReason_CHANGE_HP_SUB_PLAYER_LEAVE" +
      "\020\021\022-\n)ChangeHpReason_CHANGE_HP_ATTACK_BY" +
      "_ENERGY\020\022\022.\n*ChangeHpReason_CHANGE_HP_AT" +
      "TACK_BY_RECYCLE\020\023\022,\n(ChangeHpReason_CHAN" +
      "GE_HP_SUB_PLAYER_BACK\020\024\022$\n ChangeHpReaso" +
      "n_CHANGE_HP_SUB_UGC\020\025\0224\n0ChangeHpReason_" +
      "CHANGE_HP_SUB_DIRTY_WATER_EROSION\020\026\022-\n)C" +
      "hangeHpReason_CHANGE_HP_SUB_DESTROY_SELF" +
      "\020\027\0222\n.ChangeHpReason_CHANGE_HP_SUB_LIQUI" +
      "D_PHLOGISTON\020\030\022#\n\037ChangeHpReason_CHANGE_" +
      "HP_BY_LUA\0203\022(\n$ChangeHpReason_CHANGE_HP_" +
      "ADD_ABILITY\020e\022%\n!ChangeHpReason_CHANGE_H" +
      "P_ADD_ITEM\020f\022\'\n#ChangeHpReason_CHANGE_HP" +
      "_ADD_REVIVE\020g\022(\n$ChangeHpReason_CHANGE_H" +
      "P_ADD_UPGRADE\020h\022\'\n#ChangeHpReason_CHANGE" +
      "_HP_ADD_STATUE\020i\022+\n\'ChangeHpReason_CHANG" +
      "E_HP_ADD_BACKGROUND\020j\022#\n\037ChangeHpReason_" +
      "CHANGE_HP_ADD_GM\020k\0226\n2ChangeHpReason_CHA" +
      "NGE_HP_ADD_TRIAL_AVATAR_ACTIVITY\020l\0222\n.Ch" +
      "angeHpReason_CHANGE_HP_ADD_ROUGUELIKE_SP" +
      "RING\020m\0224\n0ChangeHpReason_CHANGE_HP_ADD_E" +
      "FFIGY_CHALLENGE_V5\020nB%\n!io.grasscutter.n" +
      "et.proto.propertyP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.grasscutter.net.proto.define.Define.getDescriptor(),
        });
    internal_static_LifeStateChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_LifeStateChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_LifeStateChangeNotify_descriptor,
        new java.lang.String[] { "OHMKBGAMEIM", "ServerBuffList", "AttackTag", "EntityId", "MoveReliableSeq", "LifeState", "DieType", "SourceEntityId", });
    internal_static_AvatarLifeStateChangeNotify_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_AvatarLifeStateChangeNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarLifeStateChangeNotify_descriptor,
        new java.lang.String[] { "ServerBuffList", "OHMKBGAMEIM", "AttackTag", "DieType", "MoveReliableSeq", "AvatarGuid", "LifeState", "SourceEntityId", });
    internal_static_EntityFightPropUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_EntityFightPropUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropUpdateNotify_descriptor,
        new java.lang.String[] { "FightPropMap", "EntityId", });
    internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor =
      internal_static_EntityFightPropUpdateNotify_descriptor.getNestedTypes().get(0);
    internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropUpdateNotify_FightPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_EntityFightPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EntityFightPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "ParamList", "DetailInfo", "PropType", "ChangeHpDebts", "PaidHpDebts", "EntityId", "Reason", "PropDelta", "ChangeEnergyReason", "ChangeHpReason", });
    internal_static_AvatarPropNotify_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_AvatarPropNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropNotify_descriptor,
        new java.lang.String[] { "PropMap", "AvatarGuid", });
    internal_static_AvatarPropNotify_PropMapEntry_descriptor =
      internal_static_AvatarPropNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarPropNotify_PropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropNotify_PropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_EntityFightPropNotify_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EntityFightPropNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropNotify_descriptor,
        new java.lang.String[] { "FightPropMap", "EntityId", });
    internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor =
      internal_static_EntityFightPropNotify_descriptor.getNestedTypes().get(0);
    internal_static_EntityFightPropNotify_FightPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EntityFightPropNotify_FightPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_AvatarPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_AvatarPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "OldValue", "PropType", "AvatarGuid", "CurValue", "Reason", });
    internal_static_PlayerPropChangeReasonNotify_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_PlayerPropChangeReasonNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PlayerPropChangeReasonNotify_descriptor,
        new java.lang.String[] { "PropType", "CurValue", "OldValue", "Reason", });
    internal_static_AvatarFightPropUpdateNotify_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_AvatarFightPropUpdateNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFightPropUpdateNotify_descriptor,
        new java.lang.String[] { "FightPropMap", "AvatarGuid", });
    internal_static_AvatarFightPropUpdateNotify_FightPropMapEntry_descriptor =
      internal_static_AvatarFightPropUpdateNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarFightPropUpdateNotify_FightPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFightPropUpdateNotify_FightPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_AvatarFightPropNotify_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_AvatarFightPropNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFightPropNotify_descriptor,
        new java.lang.String[] { "FightPropMap", "AvatarGuid", });
    internal_static_AvatarFightPropNotify_FightPropMapEntry_descriptor =
      internal_static_AvatarFightPropNotify_descriptor.getNestedTypes().get(0);
    internal_static_AvatarFightPropNotify_FightPropMapEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_AvatarFightPropNotify_FightPropMapEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_PropChangeDetailInfo_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_PropChangeDetailInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_PropChangeDetailInfo_descriptor,
        new java.lang.String[] { "DetailAbilityInfo", "LMBBPKAKIMG", });
    internal_static_KNJLMGFKIMB_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_KNJLMGFKIMB_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KNJLMGFKIMB_descriptor,
        new java.lang.String[] { "ParentAbilityName", "InstancedModifierId", "LocalId", "CasterId", "InstancedAbilityId", "ModifierLocalId", });
    io.grasscutter.net.proto.define.Define.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}