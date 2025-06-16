package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class NDoomsdayWinProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.players().size() == 1 && entity.hasPermissions(4)) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @p [\"\",{\"text\":\"Congratulations \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"! You can run /AllAboutEngie modifier superdoomsday (true/false) to toggle Super Doomsday on or off!\",\"bold\":true,\"color\":\"gold\"}]");
				}
			}
		} else if (world.players().size() > 1 && entity.hasPermissions(4)) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @p [\"\",{\"text\":\"Congratulations \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"! You can run /AllAboutEngie modifier superdoomsday (true/false) to toggle Super Doomsday on or off!\",\"bold\":true,\"color\":\"gold\"}]");
				}
			}
		} else if (world.players().size() == 1 && !entity.hasPermissions(4)) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @p [\"\",{\"text\":\"Congratulations \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"! If you want to try Super Doomsday, you can Open To LAN with cheats and turn it on by running /AllAboutEngie modifier superdoomsday true/false and then relog into the world to stop the Open To LAN!\",\"bold\":true,\"color\":\"gold\"}]");
				}
			}
		} else if (world.players().size() > 1 && !entity.hasPermissions(4)) {
			{
				Entity _ent = entity;
				if (!_ent.level.isClientSide() && _ent.getServer() != null) {
					_ent.getServer().getCommands().performPrefixedCommand(
							new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
									_ent.level.getServer(), _ent),
							"tellraw @p [\"\",{\"text\":\"Congratulations \",\"bold\":true,\"color\":\"gold\"},{\"selector\":\"@p\",\"bold\":true,\"color\":\"gold\"},{\"text\":\"! If you want to try Super Doomsday, you can ask for the server owner (unless you're the server owner) to turn it on by running /AllAboutEngie modifier superdoomsday true/false!\",\"bold\":true,\"color\":\"gold\"}]");
				}
			}
		}
	}
}
