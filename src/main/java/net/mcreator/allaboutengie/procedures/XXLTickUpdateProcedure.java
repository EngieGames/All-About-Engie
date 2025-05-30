package net.mcreator.allaboutengie.procedures;

import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModGameRules;

import java.util.Map;

public class XXLTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world.getLevelData().getGameRules().getBoolean(AllaboutengieModGameRules.DETECTIVE_MODE) == true) {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("allaboutengie", "itemhousexxl_detective"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = Blocks.SPRUCE_PLANKS.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		} else {
			if (world instanceof ServerLevel _serverworld) {
				StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("allaboutengie", "itemhousexxl"));
				if (template != null) {
					template.placeInWorld(_serverworld, new BlockPos(x, y, z), new BlockPos(x, y, z), new StructurePlaceSettings().setRotation(Rotation.NONE).setMirror(Mirror.NONE).setIgnoreEntities(false), _serverworld.random, 3);
				}
			}
			{
				BlockPos _bp = new BlockPos(x, y, z);
				BlockState _bs = Blocks.SPRUCE_PLANKS.defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
					Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
					if (_property != null && _bs.getValue(_property) != null)
						try {
							_bs = _bs.setValue(_property, (Comparable) entry.getValue());
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}
