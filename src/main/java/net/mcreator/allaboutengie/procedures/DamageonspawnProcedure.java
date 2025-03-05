package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;
import net.mcreator.allaboutengie.entity.MadEngieEntity;
import net.mcreator.allaboutengie.entity.EnragedEngieEntity;
import net.mcreator.allaboutengie.entity.AngryEngieEntity;
import net.mcreator.allaboutengie.entity.AngryCreatorEntity;

public class DamageonspawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true) {
			if (entity instanceof MadEngieEntity) {
				if (Math.random() == 0.9) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(135);
				} else if (Math.random() == 0.8) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(120);
				} else if (Math.random() == 0.7) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(105);
				} else if (Math.random() == 0.6) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(90);
				} else if (Math.random() == 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(75);
				} else if (Math.random() == 0.4) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(60);
				} else if (Math.random() == 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(45);
				} else if (Math.random() == 0.2) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(30);
				} else if (Math.random() == 0.1) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(15);
				}
			}
			if (entity instanceof AngryEngieEntity) {
				if (Math.random() == 0.9) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(180);
				} else if (Math.random() == 0.8) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(160);
				} else if (Math.random() == 0.7) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(140);
				} else if (Math.random() == 0.6) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(120);
				} else if (Math.random() == 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(100);
				} else if (Math.random() == 0.4) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(80);
				} else if (Math.random() == 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(60);
				} else if (Math.random() == 0.2) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(40);
				} else if (Math.random() == 0.1) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(20);
				}
			}
			if (entity instanceof EnragedEngieEntity) {
				if (Math.random() == 0.9) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(270);
				} else if (Math.random() == 0.8) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(240);
				} else if (Math.random() == 0.7) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(210);
				} else if (Math.random() == 0.6) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(180);
				} else if (Math.random() == 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(150);
				} else if (Math.random() == 0.4) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(120);
				} else if (Math.random() == 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(90);
				} else if (Math.random() == 0.2) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(60);
				} else if (Math.random() == 0.1) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(30);
				}
			}
			if (entity instanceof AngryCreatorEntity) {
				if (Math.random() == 0.9) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(405);
				} else if (Math.random() == 0.8) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(360);
				} else if (Math.random() == 0.7) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(315);
				} else if (Math.random() == 0.6) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(270);
				} else if (Math.random() == 0.5) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(225);
				} else if (Math.random() == 0.4) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(180);
				} else if (Math.random() == 0.3) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(135);
				} else if (Math.random() == 0.2) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(90);
				} else if (Math.random() == 0.1) {
					if (entity instanceof LivingEntity _entity)
						_entity.setHealth(45);
				}
			}
		}
	}
}
