package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

public class DevContriLeggingsProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "effect give @p jump_boost 1 7 true");
		}
	}
}
