
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.allaboutengie.block.UnobtainiumOreBlock;
import net.mcreator.allaboutengie.block.ThanksForPlayingBlock;
import net.mcreator.allaboutengie.block.ThanksForPlaying6Block;
import net.mcreator.allaboutengie.block.ThanksForPlaying5Block;
import net.mcreator.allaboutengie.block.ThanksForPlaying4Block;
import net.mcreator.allaboutengie.block.ThanksForPlaying3Block;
import net.mcreator.allaboutengie.block.ThanksForPlaying2Block;
import net.mcreator.allaboutengie.block.TextboxyeahBlock;
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
import net.mcreator.allaboutengie.block.DeepslateUnobtainiumOreBlock;
import net.mcreator.allaboutengie.block.DeepslateEngieOreBlock;
import net.mcreator.allaboutengie.block.CyberbloodBlockBlock;
import net.mcreator.allaboutengie.block.CyberOreBlock;
import net.mcreator.allaboutengie.block.CyberBlockBlock;
import net.mcreator.allaboutengie.block.BloodOreBlock;
import net.mcreator.allaboutengie.block.BloodBlockBlock;
import net.mcreator.allaboutengie.block.BiblicallyAccurateBlockBlock;
import net.mcreator.allaboutengie.block.AngryEngieBlockBlock;
import net.mcreator.allaboutengie.block.AngelHattedPresentBlock;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, AllaboutengieMod.MODID);
	public static final RegistryObject<Block> ENGIE_BLOCK = REGISTRY.register("engie_block", () -> new EngieBlockBlock());
	public static final RegistryObject<Block> ANGRY_ENGIE_BLOCK = REGISTRY.register("angry_engie_block", () -> new AngryEngieBlockBlock());
	public static final RegistryObject<Block> ENRAGED_ENGIE_BLOCK = REGISTRY.register("enraged_engie_block", () -> new EnragedEngieBlockBlock());
	public static final RegistryObject<Block> OUTRAGED_ENGIE_BLOCK = REGISTRY.register("outraged_engie_block", () -> new OutragedEngieBlockBlock());
	public static final RegistryObject<Block> BIBLICALLY_ACCURATE_BLOCK = REGISTRY.register("biblically_accurate_block", () -> new BiblicallyAccurateBlockBlock());
	public static final RegistryObject<Block> CYBER_BLOCK = REGISTRY.register("cyber_block", () -> new CyberBlockBlock());
	public static final RegistryObject<Block> BLOOD_BLOCK = REGISTRY.register("blood_block", () -> new BloodBlockBlock());
	public static final RegistryObject<Block> CYBERBLOOD_BLOCK = REGISTRY.register("cyberblood_block", () -> new CyberbloodBlockBlock());
	public static final RegistryObject<Block> METAL_CHEST = REGISTRY.register("metal_chest", () -> new MetalChestBlock());
	public static final RegistryObject<Block> METAL_CHEST_OAK = REGISTRY.register("metal_chest_oak", () -> new MetalChestOakBlock());
	public static final RegistryObject<Block> METAL_CHEST_DARK_OAK = REGISTRY.register("metal_chest_dark_oak", () -> new MetalChestDarkOakBlock());
	public static final RegistryObject<Block> METAL_CHEST_SPRUCE = REGISTRY.register("metal_chest_spruce", () -> new MetalChestSpruceBlock());
	public static final RegistryObject<Block> METAL_CHEST_ACACIA = REGISTRY.register("metal_chest_acacia", () -> new MetalChestAcaciaBlock());
	public static final RegistryObject<Block> METAL_CHEST_BIRCH = REGISTRY.register("metal_chest_birch", () -> new MetalChestBirchBlock());
	public static final RegistryObject<Block> METAL_CHEST_WARPED = REGISTRY.register("metal_chest_warped", () -> new MetalChestWarpedBlock());
	public static final RegistryObject<Block> METAL_CHEST_CRIMSON = REGISTRY.register("metal_chest_crimson", () -> new MetalChestCrimsonBlock());
	public static final RegistryObject<Block> METAL_CHEST_JUNGLE = REGISTRY.register("metal_chest_jungle", () -> new MetalChestJungleBlock());
	public static final RegistryObject<Block> METAL_TABLE = REGISTRY.register("metal_table", () -> new MetalTableBlock());
	public static final RegistryObject<Block> CYBER_ORE = REGISTRY.register("cyber_ore", () -> new CyberOreBlock());
	public static final RegistryObject<Block> BLOOD_ORE = REGISTRY.register("blood_ore", () -> new BloodOreBlock());
	public static final RegistryObject<Block> ENGIE_ORE = REGISTRY.register("engie_ore", () -> new EngieOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_ENGIE_ORE = REGISTRY.register("deepslate_engie_ore", () -> new DeepslateEngieOreBlock());
	public static final RegistryObject<Block> UNOBTAINIUM_ORE = REGISTRY.register("unobtainium_ore", () -> new UnobtainiumOreBlock());
	public static final RegistryObject<Block> DEEPSLATE_UNOBTAINIUM_ORE = REGISTRY.register("deepslate_unobtainium_ore", () -> new DeepslateUnobtainiumOreBlock());
	public static final RegistryObject<Block> OLD_ENGIE_ORE = REGISTRY.register("old_engie_ore", () -> new OldEngieOreBlock());
	public static final RegistryObject<Block> OLD_DEEPSLATE_ENGIE_ORE = REGISTRY.register("old_deepslate_engie_ore", () -> new OldDeepslateEngieOreBlock());
	public static final RegistryObject<Block> ANGEL_HATTED_PRESENT = REGISTRY.register("angel_hatted_present", () -> new AngelHattedPresentBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING = REGISTRY.register("thanks_for_playing", () -> new ThanksForPlayingBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_2 = REGISTRY.register("thanks_for_playing_2", () -> new ThanksForPlaying2Block());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_3 = REGISTRY.register("thanks_for_playing_3", () -> new ThanksForPlaying3Block());
	public static final RegistryObject<Block> TEXTBOXYEAH = REGISTRY.register("textboxyeah", () -> new TextboxyeahBlock());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_4 = REGISTRY.register("thanks_for_playing_4", () -> new ThanksForPlaying4Block());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_5 = REGISTRY.register("thanks_for_playing_5", () -> new ThanksForPlaying5Block());
	public static final RegistryObject<Block> THANKS_FOR_PLAYING_6 = REGISTRY.register("thanks_for_playing_6", () -> new ThanksForPlaying6Block());
}
