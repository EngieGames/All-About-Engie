package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

public class HeWhoGamesHostileThisEntityKillsAnotherOneProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if (entity instanceof Player) {
			if (!sourceentity.level.isClientSide())
				sourceentity.discard();
		}
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level instanceof ServerLevel ? (ServerLevel) _ent.level : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level.getServer(), _ent),
						"tellraw @p [\"\",{\"text\":\"With your failure of slaying this Spirit once and for all. It goes back to resting..\\nYou put good effort in I must say... Try again later \",\"bold\":true,\"color\":\"gray\"},{\"selector\":\"@p\",\"bold\":true},{\"text\":\".\",\"bold\":true}]");
			}
		}
	}
}
