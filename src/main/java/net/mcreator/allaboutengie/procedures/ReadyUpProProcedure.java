package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Iterator;

public class ReadyUpProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == true) {
			if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).playerready == false) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tag @s add AAEChallengeReady");
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tag @s remove AAEChallengeUnready");
					}
				}
				AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount = AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount + 1;
				AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				{
					boolean _setval = true;
					entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.playerready = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).playerready == true) {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
								_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
								"tellraw @a [\"\",{\"text\":\"You have already readied up \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"}]");
					}
				}
			}
			if (world.players().size() == 1) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 1) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr6 && _plr6.level instanceof ServerLevel
							&& _plr6.getAdvancements().getOrStartProgress(_plr6.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				}
			} else if (world.players().size() == 2) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 2) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
							&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 2) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 3) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 3) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr57 && _plr57.level instanceof ServerLevel
							&& _plr57.getAdvancements().getOrStartProgress(_plr57.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 3) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 4) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 4) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr83 && _plr83.level instanceof ServerLevel
							&& _plr83.getAdvancements().getOrStartProgress(_plr83.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 4) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 5) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 5) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr109 && _plr109.level instanceof ServerLevel
							&& _plr109.getAdvancements().getOrStartProgress(_plr109.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 5) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 6) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 6) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr135 && _plr135.level instanceof ServerLevel
							&& _plr135.getAdvancements().getOrStartProgress(_plr135.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 6) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 7) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 7) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr161 && _plr161.level instanceof ServerLevel
							&& _plr161.getAdvancements().getOrStartProgress(_plr161.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 7) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			} else if (world.players().size() == 8) {
				if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount == 8) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"What a glorious day.\",\"bold\":true,\"color\":\"gray\"}");
						}
					}
					if ((entity instanceof ServerPlayer _plr187 && _plr187.level instanceof ServerLevel
							&& _plr187.getAdvancements().getOrStartProgress(_plr187.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"))).isDone()) == false) {
						if (entity instanceof ServerPlayer _player) {
							Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:something_is_not_right"));
							AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
							if (!_ap.isDone()) {
								Iterator _iterator = _ap.getRemainingCriteria().iterator();
								while (_iterator.hasNext())
									_player.getAdvancements().award(_adv, (String) _iterator.next());
							}
						}
					}
					AllaboutengieMod.queueServerWork(60, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"And what a beautiful world this is.\",\"bold\":true,\"color\":\"gray\"}");
							}
						}
						AllaboutengieMod.queueServerWork(120, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"Do you know what you just did?\",\"bold\":true,\"color\":\"gray\"}");
								}
							}
							AllaboutengieMod.queueServerWork(100, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null,
												4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You have started the inevitable.\",\"bold\":true,\"color\":\"gray\"}");
									}
								}
								AllaboutengieMod.queueServerWork(120, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a {\"text\":\"GOODBYE.\",\"bold\":true,\"color\":\"dark_red\"}");
										}
									}
									AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
									AllaboutengieModVariables.MapVariables.get(world).syncData(world);
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "effect give @a darkness 25 25 true");
										}
									}
									if (world instanceof Level _level)
										_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(false, _level.getServer());
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "time set 12618000");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_helmet{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_chestplate{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_leggings{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engies_boots{Enchantments:[{lvl:1,id:mending},{lvl:4,id:protection},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @a allaboutengie:mini_ban_hammer");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_pickaxe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_axe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_shovel{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands()
													.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
															_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
															"give @a allaboutengie:engie_hoe{Enchantments:[{lvl:4,id:efficiency},{lvl:1,id:mending},{lvl:3,id:unbreaking}]}");
										}
									}
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
													_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
													"give @a allaboutengie:crucifix{Damage:75}");
										}
									}
								});
							});
						});
					});
				} else if (AllaboutengieModVariables.MapVariables.get(world).challengeplayerreadyupcount < 8) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"selector\":\"@p[tag=AAEChallengeReady]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" is ready to play the challenge, waiting on \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p[tag=AAEChallengeUnready]\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" to ready up to start the challenge.\",\"bold\":true,\"color\":\"gold\"}]");
						}
					}
				}
			}
		} else if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.TRUE_HARDCORE) == false) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"YOU ARE NOT READY TO FACE WHAT THE CHALLENGE HAS TO OFFER.\",\"bold\":true,\"color\":\"dark_red\"}");
				}
			}
		}
	}
}
