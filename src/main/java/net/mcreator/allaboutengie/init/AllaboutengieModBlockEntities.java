
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import net.mcreator.allaboutengie.block.entity.MetalTableBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestWarpedBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestSpruceBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestOakBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestJungleBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestDarkOakBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestCrimsonBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestBirchBlockEntity;
import net.mcreator.allaboutengie.block.entity.MetalChestAcaciaBlockEntity;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, AllaboutengieMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST = register("metal_chest", AllaboutengieModBlocks.METAL_CHEST, MetalChestBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_OAK = register("metal_chest_oak", AllaboutengieModBlocks.METAL_CHEST_OAK, MetalChestOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_DARK_OAK = register("metal_chest_dark_oak", AllaboutengieModBlocks.METAL_CHEST_DARK_OAK, MetalChestDarkOakBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_SPRUCE = register("metal_chest_spruce", AllaboutengieModBlocks.METAL_CHEST_SPRUCE, MetalChestSpruceBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_ACACIA = register("metal_chest_acacia", AllaboutengieModBlocks.METAL_CHEST_ACACIA, MetalChestAcaciaBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_BIRCH = register("metal_chest_birch", AllaboutengieModBlocks.METAL_CHEST_BIRCH, MetalChestBirchBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_WARPED = register("metal_chest_warped", AllaboutengieModBlocks.METAL_CHEST_WARPED, MetalChestWarpedBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_CRIMSON = register("metal_chest_crimson", AllaboutengieModBlocks.METAL_CHEST_CRIMSON, MetalChestCrimsonBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_CHEST_JUNGLE = register("metal_chest_jungle", AllaboutengieModBlocks.METAL_CHEST_JUNGLE, MetalChestJungleBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> METAL_TABLE = register("metal_table", AllaboutengieModBlocks.METAL_TABLE, MetalTableBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
