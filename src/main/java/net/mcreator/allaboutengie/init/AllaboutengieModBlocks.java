
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;

import net.mcreator.allaboutengie.block.ThanksForPlayingBlock;
import net.mcreator.allaboutengie.block.ThanksForPlaying2Block;
import net.mcreator.allaboutengie.block.OutragedEngieBlockBlock;
import net.mcreator.allaboutengie.block.OldEngieOreBlock;
import net.mcreator.allaboutengie.block.OldDeepslateEngieOreBlock;
import net.mcreator.allaboutengie.block.MetalTableBlock;
import net.mcreator.allaboutengie.block.MetalChestWarpedBlock;
import net.mcreator.allaboutengie.block.MetalChestSpruceBlock;
import net.mcreator.allaboutengie.block.MetalChestOakBlock;
import net.mcreator.allaboutengie.block.MetalChestJungleBlock;
import net.mcreator.allaboutengie.block.MetalChestDarkOakBlock;
import net.mcreator.allaboutengie.block.MetalChestCrimsonBlock;
import net.mcreator.allaboutengie.block.MetalChestBlock;
import net.mcreator.allaboutengie.block.MetalChestBirchBlock;
import net.mcreator.allaboutengie.block.MetalChestAcaciaBlock;
import net.mcreator.allaboutengie.block.EnragedEngieBlockBlock;
import net.mcreator.allaboutengie.block.EngieOreBlock;
import net.mcreator.allaboutengie.block.EngieBlockBlock;
import net.mcreator.allaboutengie.block.DeepslateEngieOreBlock;
import net.mcreator.allaboutengie.block.CyberOreBlock;
import net.mcreator.allaboutengie.block.BloodOreBlock;
import net.mcreator.allaboutengie.block.AngryEngieBlockBlock;
import net.mcreator.allaboutengie.block.AngelHattedPresentBlock;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AllaboutengieMod.MODID);
	public static final RegistryObject<Block> ENGIE_BLOCK = REGISTRY.register("engie_block", () -> new EngieBlockBlock());
	public static final RegistryObject<Block> ANGRY_ENGIE_BLOCK = REGISTRY.register("angry_engie_block", () -> new AngryEngieBlockBlock());
	public static final RegistryObject<Block> ENRAGED_ENGIE_BLOCK = REGISTRY.register("enraged_engie_block", () -> new EnragedEngieBlockBlock());
	public static final RegistryObject<Block> ENGIE_ORE = REGISTRY.register("engie_ore", () -> new EngieOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", () -> new DeepslateEngieOreBlock());
	public static final RegistryObject<Block> METAL_TABLE = REGISTRY.register("metal_table", () -> new MetalTableBlock());
	public static final RegistryObject<Block> OLD_ENGIE_ORE = REGISTRY.register("old_engie_ore", () -> new OldEngieOreBlock());
	public static final RegistryObject<Block> OLD_DEEPSLATE_ENGIE_ORE = REGISTRY.register("old_deepslate_engie_ore", () -> new OldDeepslateEngieOreBlock());
	public static final RegistryObject<Block> METAL_CHEST = REGISTRY.register("metal_chest", () -> new MetalChestBlock());
	public static final RegistryObject<Block> METAL_CHEST_OAK = REGISTRY.register("metal_chest_oak", () -> new MetalChestOakBlock());
	public static final RegistryObject<Block> METAL_CHEST_DARK_OAK = REGISTRY.register("metal_chest_dark_oak", () -> new MetalChestDarkOakBlock());
	public static final RegistryObject<Block> METAL_CHEST_SPRUCE = REGISTRY.register("metal_chest_spruce", () -> new MetalChestSpruceBlock());
	public static final RegistryObject<Block> METAL_CHEST_ACACIA = REGISTRY.register("metal_chest_acacia", () -> new MetalChestAcaciaBlock());
	public static final RegistryObject<Block> METAL_CHEST_BIRCH = REGISTRY.register("metal_chest_birch", () -> new MetalChestBirchBlock());
	public static final RegistryObject<Block> METAL_CHEST_WARPED = REGISTRY.register("metal_chest_warped", () -> new MetalChestWarpedBlock());
	public static final RegistryObject<Block> METAL_CHEST_CRIMSON = REGISTRY.register("metal_chest_crimson", () -> new MetalChestCrimsonBlock());
	public static final RegistryObject<Block> METAL_CHEST_JUNGLE = REGISTRY.register("metal_chest_jungle", () -> new MetalChestJungleBlock());
	public static final RegistryObject<Block> OUTRAGED_ENGIE_BLOCK = REGISTRY.register("outraged_engie_block", () -> new OutragedEngieBlockBlock());
	public static final RegistryObject<Block> ANGEL_HATTED_PRESENT = REGISTRY.register("angel_hatted_present", () -> new AngelHattedPresentBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING = REGISTRY.register("thanks_for_playing", () -> new ThanksForPlayingBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_2 = REGISTRY.register("thanks_for_playing_2", () -> new ThanksForPlaying2Block());
	public static final RegistryObject<Block> CYBER_ORE = REGISTRY.register("cyber_ore", () -> new CyberOreBlock());
	public static final RegistryObject<Block> BLOOD_ORE = REGISTRY.register("blood_ore", () -> new BloodOreBlock());

	@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
	public static class ClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			MetalTableBlock.registerRenderLayer();
			MetalChestBlock.registerRenderLayer();
			MetalChestOakBlock.registerRenderLayer();
			MetalChestDarkOakBlock.registerRenderLayer();
			MetalChestSpruceBlock.registerRenderLayer();
			MetalChestAcaciaBlock.registerRenderLayer();
			MetalChestBirchBlock.registerRenderLayer();
			MetalChestWarpedBlock.registerRenderLayer();
			MetalChestCrimsonBlock.registerRenderLayer();
			MetalChestJungleBlock.registerRenderLayer();
			AngelHattedPresentBlock.registerRenderLayer();
		}
	}
}
