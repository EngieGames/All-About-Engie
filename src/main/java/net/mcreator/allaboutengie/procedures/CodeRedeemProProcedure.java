package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.arguments.MessageArgument;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;

import java.util.Iterator;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class CodeRedeemProProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "redeem")).equals("redeem")) {
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("banhammerupdatecoolio")) {
				if (AllaboutengieModVariables.WorldVariables.get(world).yeah == false) {
					if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:comically_massive_ban_hammer");
						}
						if ((entity instanceof ServerPlayer _plr3 && _plr3.level instanceof ServerLevel
								&& _plr3.getAdvancements().getOrStartProgress(_plr3.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
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
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
										"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
						}
					}
				} else if (true) {
					if ((entity.getCapability(AllaboutengieModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new AllaboutengieModVariables.PlayerVariables())).coderedeemblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:comically_massive_ban_hammer_pixel");
						}
						if ((entity instanceof ServerPlayer _plr7 && _plr7.level instanceof ServerLevel
								&& _plr7.getAdvancements().getOrStartProgress(_plr7.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:comically_massive_obtain"))).isDone()) == false) {
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
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4),
										"tellraw @p {\"text\":\"Hey... Sorry, but you can't redeem the secret code again.. If you want to do it again please create/join a new world that doesn't have the code redeemed.\",\"bold\":true,\"color\":\"gold\"}");
						}
					}
				}
			}
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("spring")) {
				if (AllaboutengieModVariables.seasonspring == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("SPRING")) {
				if (AllaboutengieModVariables.seasonspring == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("Spring")) {
				if (AllaboutengieModVariables.seasonspring == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			}
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("summer")) {
				if (AllaboutengieModVariables.seasonsummer == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("SUMMER")) {
				if (AllaboutengieModVariables.seasonsummer == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("Summer")) {
				if (AllaboutengieModVariables.seasonsummer == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			}
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("autumn")) {
				if (AllaboutengieModVariables.seasonautumn == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("AUTUMN")) {
				if (AllaboutengieModVariables.seasonautumn == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("Autumn")) {
				if (AllaboutengieModVariables.seasonautumn == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			}
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("fall")) {
				if (AllaboutengieModVariables.seasonautumn == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("FALL")) {
				if (AllaboutengieModVariables.seasonautumn == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("Fall")) {
				if (AllaboutengieModVariables.seasonautumn == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			}
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("winter")) {
				if (AllaboutengieModVariables.seasonwinter == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("WINTER")) {
				if (AllaboutengieModVariables.seasonwinter == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("Winter")) {
				if (AllaboutengieModVariables.seasonwinter == true) {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_helmet");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_chestplate");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_leggings");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_boots");
					}
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null)
							_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:code_redeemers_hammer");
					}
				}
			}
			if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("anallaboutengiechristmas")) {
				if (AllaboutengieModVariables.seasonwinter == true) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:angel_hatted_present 16");
						}
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("ANALLABOUTENGIECHRISTMAS")) {
				if (AllaboutengieModVariables.seasonwinter == true) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:angel_hatted_present 16");
						}
					}
				}
			} else if (((new Object() {
				public String getMessage() {
					try {
						return MessageArgument.getMessage(arguments, "code").getString();
					} catch (CommandSyntaxException ignored) {
						return "";
					}
				}
			}).getMessage()).equals("AnAllAboutEngieChristmas")) {
				if (AllaboutengieModVariables.seasonwinter == true) {
					if (AllaboutengieModVariables.decembercodeblock == false) {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null)
								_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "give @p allaboutengie:angel_hatted_present 16");
						}
					}
				}
			}
		}
	}
}
