package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.Advancement;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.AllaboutengieMod;

import java.util.Iterator;

public class EngieGamesRightClickedOnEntityProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVEMODE) == true) {
			if ((entity instanceof ServerPlayer _plr1 && _plr1.level instanceof ServerLevel
					&& _plr1.getAdvancements().getOrStartProgress(_plr1.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:found_engie"))).isDone()) == false) {
				if (entity instanceof ServerPlayer _player) {
					Advancement _adv = _player.server.getAdvancements().getAdvancement(new ResourceLocation("allaboutengie:found_engie"));
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						Iterator _iterator = _ap.getRemainingCriteria().iterator();
						while (_iterator.hasNext())
							_player.getAdvancements().award(_adv, (String) _iterator.next());
					}
				}
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"EngieGamesOnTTV\",\"obfuscated\":true,\"color\":\"red\"},{\"text\":\"> Hey, I've been waiting. You probably don't know who I am. Lets just put it this way.\"}]");
					}
				}
				AllaboutengieMod.queueServerWork(200, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"EngieGamesOnTTV\",\"color\":\"red\"},{\"text\":\"> I am Engie, also known as EngieGames, clippedbyengie, and EngieGamesOnTTV.\"}]");
						}
					}
					AllaboutengieMod.queueServerWork(160, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(
										new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
												_ent.level.getServer(), _ent),
										"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"EngieGamesOnTTV\",\"color\":\"red\"},{\"text\":\"> I'm impressed you found me, I ditched for quite the long time. The others.. You have no clue what happened to them.\"}]");
							}
						}
						AllaboutengieMod.queueServerWork(200, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"EngieGamesOnTTV\",\"color\":\"red\"},{\"text\":\"> Let's just put it right here. They're... well... \"},{\"text\":\"dead\",\"underlined\":true},{\"text\":\".\"}]");
								}
							}
							AllaboutengieMod.queueServerWork(200, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @p [\"\",{\"text\":\"<\"},{\"text\":\"EngieGamesOnTTV\",\"color\":\"red\"},{\"text\":\"> But hey, thanks for finding me. I'm still shook after the \"},{\"text\":\"incident\",\"bold\":true},{\"text\":\"...\"}]");
									}
								}
								AllaboutengieMod.queueServerWork(160, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a [\"\",{\"text\":\"<\",\"bold\":true},{\"text\":\"[\",\"bold\":true,\"color\":\"red\"},{\"text\":\"All\",\"bold\":true,\"color\":\"green\"},{\"text\":\" About\",\"bold\":true,\"color\":\"yellow\"},{\"text\":\" Engie\",\"bold\":true,\"color\":\"red\"},{\"text\":\" Developer\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\"]\",\"bold\":true,\"color\":\"red\"},{\"text\":\" DevEngie\",\"bold\":true,\"color\":\"dark_red\"},{\"text\":\">\",\"bold\":true},{\"text\":\" And that's that! Thanks for playing the detective gamerule! You can now return to your regular gameplay.\",\"bold\":true}]");
										}
									}
									AllaboutengieMod.queueServerWork(220, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
														_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
														"advancement grant @a only allaboutengie:found_engie");
											}
										}
										if (world instanceof Level _level)
											_level.getGameRules().getRule(AllaboutengieModGameRules.DETECTIVEMODE).set(false, _level.getServer());
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands()
														.performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																		_ent.getDisplayName(), _ent.level.getServer(), _ent),
																"/tellraw @a {\"text\":\"[DevEngie has changed the gamerule detectiveFindEngie to false]\",\"italic\":true,\"color\":\"gray\"}");
											}
										}
									});
								});
							});
						});
					});
				});
			}
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @p {\"text\":\"Let the man be.\",\"bold\":true,\"color\":\"gold\"}");
				}
			}
		}
	}
}
