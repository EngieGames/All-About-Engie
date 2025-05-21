package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import java.util.Iterator;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;

public class AAEAllCommandsProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "MainType")).equals("Gear")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Operator")) {
				OperatorItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Starter")) {
				StarterItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Developer")) {
				DeveloperCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("IdeaGiver")) {
				IdeaGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("Tester")) {
				TesterGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ContentCreator")) {
				ContentCreatorCommandProProcedure.execute(world, entity);
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("gear")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("operator")) {
				OperatorItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("starter")) {
				StarterItemsCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("developer")) {
				DeveloperCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("ideagiver")) {
				IdeaGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("tester")) {
				TesterGiverCommandProProcedure.execute(world, entity);
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("contentcreator")) {
				ContentCreatorCommandProProcedure.execute(world, entity);
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Pixelify")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Toggle")) {
				if (BoolArgumentType.getBool(arguments, "logic") == true) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items on."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else if (BoolArgumentType.getBool(arguments, "logic") == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items off."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("pixelify")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("toggle")) {
				if (BoolArgumentType.getBool(arguments, "logic") == true) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items on."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else if (BoolArgumentType.getBool(arguments, "logic") == false) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items off."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Code")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Redeem")) {
				if ((StringArgumentType.getString(arguments, "Code")).equals("ByeByeThere")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr31 && _plr31.level instanceof ServerLevel
									&& _plr31.getAdvancements().getOrStartProgress(_plr31.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.coderedeemblock = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr36 && _plr36.level instanceof ServerLevel
									&& _plr36.getAdvancements().getOrStartProgress(_plr36.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.coderedeemblock = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("HeWhoGames")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_scythe");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							if ((entity instanceof ServerPlayer _plr42 && _plr42.level instanceof ServerLevel
									&& _plr42.getAdvancements().getOrStartProgress(_plr42.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_scythe_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							if ((entity instanceof ServerPlayer _plr47 && _plr47.level instanceof ServerLevel
									&& _plr47.getAdvancements().getOrStartProgress(_plr47.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("bigsharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("BigSharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("BIGSHARKO")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("anallaboutengiechristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 16");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("ANALLABOUTENGIECHRISTMAS")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 16");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("AnAllAboutEngieChristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 16");
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("happybirthdayengie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HappyBirthdayEngie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HAPPYBIRTHDAYENGIE")) {
					if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
							}
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("code")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("redeem")) {
				if ((StringArgumentType.getString(arguments, "Code")).equals("ByeByeThere")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr88 && _plr88.level instanceof ServerLevel
									&& _plr88.getAdvancements().getOrStartProgress(_plr88.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.coderedeemblock = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:comically_massive_ban_hammer_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:bye_bye_there");
								}
							}
							if ((entity instanceof ServerPlayer _plr93 && _plr93.level instanceof ServerLevel
									&& _plr93.getAdvancements().getOrStartProgress(_plr93.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							{
								boolean _setval = true;
								entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
									capability.coderedeemblock = _setval;
									capability.syncPlayerVariables(entity);
								});
							}
						} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("HeWhoGames")) {
					if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_scythe");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							if ((entity instanceof ServerPlayer _plr99 && _plr99.level instanceof ServerLevel
									&& _plr99.getAdvancements().getOrStartProgress(_plr99.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					} else if (AllaboutengieModVariables.WorldVariables.get(world).yeah == true) {
						if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_scythe_pixel");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"You start to see figures...\",\"bold\":true,\"color\":\"black\"},{\"text\":\"\\n\"},{\"text\":\"Are these figures what made Engie lock the scythe behind a command?\",\"color\":\"dark_red\"}]");
								}
							}
							if ((entity instanceof ServerPlayer _plr104 && _plr104.level instanceof ServerLevel
									&& _plr104.getAdvancements().getOrStartProgress(_plr104.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
								if (entity instanceof ServerPlayer _player) {
									Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"));
									AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
									if (!_ap.isDone()) {
										Iterator _iterator = _ap.getRemainingCriteria().iterator();
										while (_iterator.hasNext())
											_player.getAdvancements().award(_adv, (String) _iterator.next());
									}
								}
							}
							AllaboutengieModVariables.MapVariables.get(world).hewhowatches = true;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						} else if (AllaboutengieModVariables.MapVariables.get(world).hewhowatches == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"There is no going back now...\",\"bold\":true,\"color\":\"black\"}");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("bigsharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("BigSharko")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("BIGSHARKO")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_helmet");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_chestplate");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_leggings");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_boots");
						}
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:code_redeemers_hammer");
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("anallaboutengiechristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 16");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("ANALLABOUTENGIECHRISTMAS")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 16");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("AnAllAboutEngieChristmas")) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 16");
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("happybirthdayengie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HappyBirthdayEngie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HAPPYBIRTHDAYENGIE")) {
					if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
							}
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
							}
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Debug")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("ChallengeToggle")) {
				if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
					AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == false) {
					AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
				if (AllaboutengieModVariables.MapVariables.get(world).BYEBYE == true) {
					AllaboutengieModVariables.MapVariables.get(world).BYEBYE = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (AllaboutengieModVariables.MapVariables.get(world).BYEBYE == false) {
					AllaboutengieModVariables.MapVariables.get(world).BYEBYE = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("debug")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("challengetoggle")) {
				if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == true) {
					AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle == false) {
					AllaboutengieModVariables.MapVariables.get(world).ChallengeToggle = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
				if (AllaboutengieModVariables.MapVariables.get(world).BYEBYE == true) {
					AllaboutengieModVariables.MapVariables.get(world).BYEBYE = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if (AllaboutengieModVariables.MapVariables.get(world).BYEBYE == false) {
					AllaboutengieModVariables.MapVariables.get(world).BYEBYE = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		}
	}
}
