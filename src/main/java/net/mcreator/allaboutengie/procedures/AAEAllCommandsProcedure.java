package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.GameRules;
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
import net.mcreator.allaboutengie.AllaboutengieMod;

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
				if (BoolArgumentType.getBool(arguments, "logic") == false && (entity.hasPermissions(3) || entity.hasPermissions(4))) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items on."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else if (BoolArgumentType.getBool(arguments, "logic") == true && (entity.hasPermissions(3) || entity.hasPermissions(4))) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items off."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("pixelify")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("toggle")) {
				if (BoolArgumentType.getBool(arguments, "logic") == false && (entity.hasPermissions(3) || entity.hasPermissions(4))) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items on."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = true;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else if (BoolArgumentType.getBool(arguments, "logic") == true && (entity.hasPermissions(3) || entity.hasPermissions(4))) {
					if (entity instanceof Player _player && !_player.level.isClientSide())
						_player.displayClientMessage(Component.literal("Toggled pixel items off."), true);
					AllaboutengieModVariables.WorldVariables.get(world).yeah = false;
					AllaboutengieModVariables.WorldVariables.get(world).syncData(world);
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
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
							if ((entity instanceof ServerPlayer _plr41 && _plr41.level instanceof ServerLevel
									&& _plr41.getAdvancements().getOrStartProgress(_plr41.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
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
							if ((entity instanceof ServerPlayer _plr46 && _plr46.level instanceof ServerLevel
									&& _plr46.getAdvancements().getOrStartProgress(_plr46.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
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
							if ((entity instanceof ServerPlayer _plr52 && _plr52.level instanceof ServerLevel
									&& _plr52.getAdvancements().getOrStartProgress(_plr52.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
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
							if ((entity instanceof ServerPlayer _plr57 && _plr57.level instanceof ServerLevel
									&& _plr57.getAdvancements().getOrStartProgress(_plr57.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
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
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HappyBirthdayEngie")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HAPPYBIRTHDAYENGIE")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("hotlinemiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HotlineMiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HOTLINEMIAMI2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
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
							if ((entity instanceof ServerPlayer _plr185 && _plr185.level instanceof ServerLevel
									&& _plr185.getAdvancements().getOrStartProgress(_plr185.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
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
							if ((entity instanceof ServerPlayer _plr190 && _plr190.level instanceof ServerLevel
									&& _plr190.getAdvancements().getOrStartProgress(_plr190.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
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
							if ((entity instanceof ServerPlayer _plr196 && _plr196.level instanceof ServerLevel
									&& _plr196.getAdvancements().getOrStartProgress(_plr196.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
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
							if ((entity instanceof ServerPlayer _plr201 && _plr201.level instanceof ServerLevel
									&& _plr201.getAdvancements().getOrStartProgress(_plr201.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:engies_scythe_obtained"))).isDone()) == false) {
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
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HappyBirthdayEngie")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HAPPYBIRTHDAYENGIE")) {
					if ((entity.getDisplayName().getString()).equals("DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_own_engie_bundle");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 17");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					} else {
						if (AllaboutengieModVariables.MapVariables.get(world).Birthday == true) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engies_birthday_bundle25");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:angel_hatted_present 5");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:dev_engie_plush");
								}
							}
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
											_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:engie_plush");
								}
							}
						} else if (AllaboutengieModVariables.MapVariables.get(world).Birthday == false) {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About\",\"color\":\"yellow\"},{\"text\":\" Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> 5/25 (MM/DD).\"}]");
								}
							}
						}
					}
				}
				if ((StringArgumentType.getString(arguments, "Code")).equals("hotlinemiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HotlineMiami2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				} else if ((StringArgumentType.getString(arguments, "Code")).equals("HOTLINEMIAMI2")) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "give @p allaboutengie:hotline_miami_2_run");
						}
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Debug")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("DoomsDay")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("CheckTime")) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).timeoverlaytoggle == true) {
					AllaboutengieModVariables.MapVariables.get(world).Birthday = false;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).timeoverlaytoggle == false) {
					AllaboutengieModVariables.MapVariables.get(world).Birthday = true;
					AllaboutengieModVariables.MapVariables.get(world).syncData(world);
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("debug")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("doomsday")) {
				if ((entity.getDisplayName().getString()).equals("DevEngie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("Dev")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("EngieGamesOnTTV")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] DevEngie")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Content Creator] EngieGamesOnTTV")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else if ((entity.getDisplayName().getString()).equals("[All About Engie Developer] Dev")) {
					if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == true) {
						AllaboutengieModVariables.MapVariables.get(world).ddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaystart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).OHBOY = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).riskcooldown = true;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).DoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).ddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsDayStart = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).SuperDoomsdayEeriePlayOnce = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaytimenighttimerblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						AllaboutengieModVariables.MapVariables.get(world).sddaydialoguetimeblock = false;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
						if (world instanceof Level _level)
							_level.getGameRules().getRule(GameRules.RULE_DAYLIGHT).set(true, _level.getServer());
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_start");
							}
						}
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "stopsound @a ambient allaboutengie:doomsday_eerie");
							}
						}
						AllaboutengieMod.queueServerWork(1, () -> {
							entity.getPersistentData().putDouble("TimeUntilNightDDAY", 0);
							entity.getPersistentData().putDouble("DialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("SDDAYDialogueCooldownStart", 0);
							entity.getPersistentData().putDouble("TimeUntilNightSDDAY", 0);
						});
						if (AllaboutengieModVariables.MapVariables.get(world).timecheckstop == true) {
							AllaboutengieModVariables.MapVariables.get(world).timecheckstop = false;
							AllaboutengieModVariables.MapVariables.get(world).syncData(world);
							AllaboutengieMod.queueServerWork(5, () -> {
								if (world instanceof ServerLevel _level)
									_level.setDayTime((int) AllaboutengieModVariables.MapVariables.get(world).timebeforespecial);
							});
						}
					} else if (AllaboutengieModVariables.MapVariables.get(world).OHBOY == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @a [\"\",{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\" has summoned DoomsDay! It will occur shortly for this world.\",\"bold\":true,\"color\":\"gold\"}]");
							}
						}
						AllaboutengieModVariables.MapVariables.get(world).Risk = 5;
						AllaboutengieModVariables.MapVariables.get(world).syncData(world);
					}
				} else {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
									_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"You do not have permission to run this command!\",\"color\":\"red\"}");
						}
					}
				}
			} else if ((StringArgumentType.getString(arguments, "AltType")).equals("checktime")) {
				if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).timeoverlaytoggle == true) {
					{
						boolean _setval = false;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.timeoverlaytoggle = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				} else if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).timeoverlaytoggle == false) {
					{
						boolean _setval = true;
						entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
							capability.timeoverlaytoggle = _setval;
							capability.syncPlayerVariables(entity);
						});
					}
				}
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("Risk")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("Check")) {
				RiskCheckProcedure.execute(world, entity);
			}
		} else if ((StringArgumentType.getString(arguments, "MainType")).equals("risk")) {
			if ((StringArgumentType.getString(arguments, "AltType")).equals("check")) {
				RiskCheckProcedure.execute(world, entity);
			}
		}
	}
}
