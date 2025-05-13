package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import net.mcreator.allaboutengie.network.AllaboutengieModVariables;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class BirthdayProProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (Math.random() <= 0.005) {
			AllaboutengieModVariables.MapVariables.get(world).birthdaystart = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
							_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
							"tellraw @a {\"text\":\"We never thought this day would come. But it's finally here.\",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"}");
				}
			}
			AllaboutengieMod.queueServerWork(200, () -> {
				{
					Entity _ent = entity;
					if (!_ent.level.isClientSide() && _ent.getServer() != null) {
						_ent.getServer().getCommands().performPrefixedCommand(
								new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
										_ent.level.getServer(), _ent),
								"tellraw @a [\"\",{\"text\":\"Engie's birthday may be today and all but it will not stop \",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"},{\"text\":\"his\",\"bold\":true,\"underlined\":true,\"hoverEvent\":{\"action\":\"show_text\",\"contents\":\"Insanity\"}},{\"text\":\" wrath from taking over.\",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"}]");
					}
				}
				AllaboutengieMod.queueServerWork(240, () -> {
					{
						Entity _ent = entity;
						if (!_ent.level.isClientSide() && _ent.getServer() != null) {
							_ent.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
											_ent.level.getServer(), _ent),
									"tellraw @a [\"\",{\"text\":\"To get rid of \",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"},{\"text\":\"him\",\"bold\":true,\"underlined\":true},{\"text\":\" you have to withstand the wrath that \",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"},{\"text\":\"he\",\"bold\":true,\"underlined\":true},{\"text\":\" has brung to this world.\",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"}]");
						}
					}
					AllaboutengieMod.queueServerWork(160, () -> {
						{
							Entity _ent = entity;
							if (!_ent.level.isClientSide() && _ent.getServer() != null) {
								_ent.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
										_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent), "tellraw @a {\"text\":\"May mother nature have mercy on our souls.\",\"bold\":true,\"underlined\":true,\"color\":\"yellow\"}");
							}
						}
						AllaboutengieMod.queueServerWork(160, () -> {
							{
								Entity _ent = entity;
								if (!_ent.level.isClientSide() && _ent.getServer() != null) {
									_ent.getServer().getCommands().performPrefixedCommand(
											new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
													_ent.getDisplayName(), _ent.level.getServer(), _ent),
											"tellraw @a [\"\",{\"text\":\"E\",\"bold\":true,\"obfuscated\":true},{\"text\":\"THE WORLD WILL COME TO AND END. YOU WILL NOT SURVIVE\",\"bold\":true,\"underlined\":true},{\"text\":\"E\",\"bold\":true,\"obfuscated\":true}]");
								}
							}
							AllaboutengieMod.queueServerWork(200, () -> {
								{
									Entity _ent = entity;
									if (!_ent.level.isClientSide() && _ent.getServer() != null) {
										_ent.getServer().getCommands().performPrefixedCommand(
												new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
														_ent.getDisplayName(), _ent.level.getServer(), _ent),
												"tellraw @a [\"\",{\"text\":\"E\",\"bold\":true,\"obfuscated\":true},{\"text\":\"THIS, IS INSANITY.\",\"bold\":true,\"underlined\":true},{\"text\":\"E\",\"bold\":true,\"obfuscated\":true}]");
									}
								}
								AllaboutengieMod.queueServerWork(160, () -> {
									{
										Entity _ent = entity;
										if (!_ent.level.isClientSide() && _ent.getServer() != null) {
											_ent.getServer().getCommands().performPrefixedCommand(
													new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
															_ent.getDisplayName(), _ent.level.getServer(), _ent),
													"tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About \",\"color\":\"yellow\"},{\"text\":\"Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> \"},{\"text\":\"Insanity shut the actual hell up dude, you're not funny.\",\"color\":\"gold\"}]");
										}
									}
									AllaboutengieMod.queueServerWork(160, () -> {
										{
											Entity _ent = entity;
											if (!_ent.level.isClientSide() && _ent.getServer() != null) {
												_ent.getServer().getCommands().performPrefixedCommand(
														new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																_ent.getDisplayName(), _ent.level.getServer(), _ent),
														"tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About \",\"color\":\"yellow\"},{\"text\":\"Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> \"},{\"text\":\"Insanity shut the actual hell up dude, you're not funny.\",\"color\":\"gold\"}]");
											}
										}
										AllaboutengieMod.queueServerWork(160, () -> {
											{
												Entity _ent = entity;
												if (!_ent.level.isClientSide() && _ent.getServer() != null) {
													_ent.getServer().getCommands().performPrefixedCommand(
															new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																	_ent.getDisplayName(), _ent.level.getServer(), _ent),
															"tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About \",\"color\":\"yellow\"},{\"text\":\"Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> \"},{\"text\":\"Insanity shut the actual hell up dude, you're not funny.\",\"color\":\"gold\"}]");
												}
											}
											AllaboutengieMod.queueServerWork(40, () -> {
												{
													Entity _ent = entity;
													if (!_ent.level.isClientSide() && _ent.getServer() != null) {
														_ent.getServer().getCommands().performPrefixedCommand(
																new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(),
																		_ent.getDisplayName(), _ent.level.getServer(), _ent),
																"tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About \",\"color\":\"yellow\"},{\"text\":\"Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> \"},{\"text\":\"I do not care dude. It is litterally my birthday today, just shut up already.\",\"color\":\"gold\"}]");
													}
												}
												AllaboutengieMod.queueServerWork(200, () -> {
													{
														Entity _ent = entity;
														if (!_ent.level.isClientSide() && _ent.getServer() != null) {
															_ent.getServer().getCommands().performPrefixedCommand(
																	new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																			_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																	"tellraw @a [\"\",{\"text\":\"<Insanity> \"},{\"text\":\"FUCK \",\"obfuscated\":true},{\"text\":\"YOU.\"}]");
														}
													}
													AllaboutengieMod.queueServerWork(200, () -> {
														{
															Entity _ent = entity;
															if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																_ent.getServer().getCommands().performPrefixedCommand(
																		new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																				_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																		"tellraw @a [\"\",{\"text\":\"<Insanity> \"},{\"text\":\"FUCK \",\"obfuscated\":true},{\"text\":\"YOU.\"}]");
															}
														}
														AllaboutengieMod.queueServerWork(40, () -> {
															{
																Entity _ent = entity;
																if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																	_ent.getServer().getCommands().performPrefixedCommand(
																			new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																					_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																			"tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About \",\"color\":\"yellow\"},{\"text\":\"Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> \"},{\"text\":\".\",\"color\":\"gold\"}]");
																}
															}
															AllaboutengieMod.queueServerWork(240, () -> {
																{
																	Entity _ent = entity;
																	if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																		_ent.getServer().getCommands().performPrefixedCommand(
																				new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4,
																						_ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																				"tellraw @a [\"\",{\"text\":\"<\"},{\"text\":\"[\",\"color\":\"red\"},{\"text\":\"All \",\"color\":\"green\"},{\"text\":\"About \",\"color\":\"yellow\"},{\"text\":\"Engie \",\"color\":\"red\"},{\"text\":\"Content Creator\",\"color\":\"gold\"},{\"text\":\"]\",\"color\":\"red\"},{\"text\":\" EngieGamesOnTTV\",\"color\":\"gold\"},{\"text\":\"> \"},{\"text\":\"I might as well disable that damn challenge of your if you do not SHUT THE HELL UP!\",\"color\":\"gold\"}]");
																	}
																}
																AllaboutengieMod.queueServerWork(240, () -> {
																	{
																		Entity _ent = entity;
																		if (!_ent.level.isClientSide() && _ent.getServer() != null) {
																			_ent.getServer().getCommands()
																					.performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(),
																							_ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(), _ent.level.getServer(), _ent),
																							"tellraw @a {\"text\":\"<Insanity> Fine... :(\"}");
																		}
																	}
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		} else {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @a {\"text\":\"Todays Date without year: May 25th\\nSpecial Event for AAE: Engie's Birthday.\\nDescription: Happy birthday Engie. You're a year older.\",\"bold\":true,\"color\":\"yellow\"}");
				}
			}
			AllaboutengieModVariables.MapVariables.get(world).birthdaystart = true;
			AllaboutengieModVariables.MapVariables.get(world).syncData(world);
		}
	}
}
