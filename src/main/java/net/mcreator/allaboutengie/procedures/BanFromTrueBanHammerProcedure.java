package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.entity.Entity;

public class BanFromTrueBanHammerProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level.isClientSide() && _ent.getServer() != null)
				_ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "ban @p You have been banned by an operator using the True Ban Hammer.");
		}
	}
}
