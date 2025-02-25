
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AllaboutengieMod.MODID);
	public static final RegistryObject<CreativeModeTab> AAE_ITEMS_ITEMS = REGISTRY.register("aae_items_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.aae_items_items")).icon(() -> new ItemStack(AllaboutengieModItems.ENGIE_GEM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.ENGIE_GEM.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIE_ESSENCE.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIE_ESSENCE.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIE_ESSENCE.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_ESSENCE.get());
				tabData.accept(AllaboutengieModBlocks.ENGIE_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModItems.CYBER_INGOT.get());
				tabData.accept(AllaboutengieModItems.BLOOD_INGOT.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_INGOT.get());
				tabData.accept(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.BIBLICALLY_ACCURATE_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.CYBER_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.BLOOD_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.CYBERBLOOD_BLOCK.get().asItem());
				tabData.accept(AllaboutengieModItems.SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.ALBINO_SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.RARE_SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARKO_CLOTH.get());
				tabData.accept(AllaboutengieModItems.ENGIE_AXE.get());
				tabData.accept(AllaboutengieModItems.ENGIE_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.ENGIE_HOE.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIE_AXE.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIE_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIE_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIE_HOE.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIE_AXE.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIE_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIE_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIE_HOE.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIE_AXE.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIE_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIE_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIE_HOE.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_AXE.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_HOE.get());
				tabData.accept(AllaboutengieModItems.COMMON_SWORD.get());
				tabData.accept(AllaboutengieModItems.COMMON_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.COMMON_AXE.get());
				tabData.accept(AllaboutengieModItems.COMMON_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.COMMON_HOE.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_SWORD.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_AXE.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_HOE.get());
				tabData.accept(AllaboutengieModItems.RARE_SWORD.get());
				tabData.accept(AllaboutengieModItems.RARE_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.RARE_AXE.get());
				tabData.accept(AllaboutengieModItems.RARE_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.RARE_HOE.get());
				tabData.accept(AllaboutengieModItems.EPIC_SWORD.get());
				tabData.accept(AllaboutengieModItems.EPIC_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.EPIC_AXE.get());
				tabData.accept(AllaboutengieModItems.EPIC_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.EPIC_HOE.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SWORD.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_AXE.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_HOE.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SWORD.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_AXE.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_HOE.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SWORD.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_AXE.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_HOE.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_SWORD.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_AXE.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_HOE.get());
				tabData.accept(AllaboutengieModItems.ENGI_AXE.get());
				tabData.accept(AllaboutengieModItems.ENGI_PICKAXE.get());
				tabData.accept(AllaboutengieModItems.ENGI_SHOVEL.get());
				tabData.accept(AllaboutengieModItems.CYBER_KATANA.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_KATANA.get());
				tabData.accept(AllaboutengieModItems.BLOOD_BATTLE_AXE.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_BATTLE_AXE.get());
				tabData.accept(AllaboutengieModItems.CRUCIFIX.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_CHUNKLET.get());
				tabData.accept(AllaboutengieModItems.UNOBTANIUM.get());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_OAK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_DARK_OAK.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_SPRUCE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_ACACIA.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_BIRCH.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_WARPED.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_CRIMSON.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_CHEST_JUNGLE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.METAL_TABLE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.CYBER_ORE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.BLOOD_ORE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.ENGIE_ORE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.DEEPSLATE_ENGIE_ORE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.UNOBTAINIUM_ORE.get().asItem());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_ORE_CHUNKLET.get());
				tabData.accept(AllaboutengieModBlocks.DEEPSLATE_UNOBTAINIUM_ORE.get().asItem());
				tabData.accept(AllaboutengieModItems.DEEPSLATE_UNOBTAINIUM_ORE_CHUNKLET.get());
				tabData.accept(AllaboutengieModBlocks.OLD_ENGIE_ORE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.OLD_DEEPSLATE_ENGIE_ORE.get().asItem());
				tabData.accept(AllaboutengieModBlocks.ANGEL_HATTED_PRESENT.get().asItem());
				tabData.accept(AllaboutengieModItems.ENRAGED_COIN.get());
				tabData.accept(AllaboutengieModItems.AAE_ENGIE.get());
				tabData.accept(AllaboutengieModItems.AAE_DEV_ENGIE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> AAE_ITEMS_ARMOR = REGISTRY.register("aae_items_armor",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.aae_items_armor")).icon(() -> new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.ENGIES_HELMET.get());
				tabData.accept(AllaboutengieModItems.ENGIES_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.ENGIES_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.ENGIES_BOOTS.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get());
				tabData.accept(AllaboutengieModItems.SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.ALBINO_SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.ALBINO_SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.ALBINO_SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.ALBINO_SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.RARE_SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.RARE_SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.RARE_SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.RARE_SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARK_HELMET.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARK_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARK_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARK_BOOTS.get());
				tabData.accept(AllaboutengieModItems.CYBER_HELMET.get());
				tabData.accept(AllaboutengieModItems.CYBER_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.CYBER_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.CYBER_BOOTS.get());
				tabData.accept(AllaboutengieModItems.BLOOD_HELMET.get());
				tabData.accept(AllaboutengieModItems.BLOOD_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.BLOOD_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.BLOOD_BOOTS.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_HELMET.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.CYBERBLOOD_BOOTS.get());
				tabData.accept(AllaboutengieModItems.COMMON_HELMET.get());
				tabData.accept(AllaboutengieModItems.COMMON_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.COMMON_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.COMMON_BOOTS.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_HELMET.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_BOOTS.get());
				tabData.accept(AllaboutengieModItems.RARE_HELMET.get());
				tabData.accept(AllaboutengieModItems.RARE_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.RARE_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.RARE_BOOTS.get());
				tabData.accept(AllaboutengieModItems.EPIC_HELMET.get());
				tabData.accept(AllaboutengieModItems.EPIC_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.EPIC_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.EPIC_BOOTS.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_HELMET.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_BOOTS.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_HELMET.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_BOOTS.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_HELMET.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_BOOTS.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_HELMET.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_CHESTPLATE.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_LEGGINGS.get());
				tabData.accept(AllaboutengieModItems.UNOBTAINIUM_BOOTS.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> AAE_ITEMS_FOOD = REGISTRY.register("aae_items_food",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.aae_items_food")).icon(() -> new ItemStack(AllaboutengieModItems.COOKED_PIZZA.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.DOUGH.get());
				tabData.accept(AllaboutengieModItems.DOUGH_WITH_SAUCE.get());
				tabData.accept(AllaboutengieModItems.CHEESE.get());
				tabData.accept(AllaboutengieModItems.UNCOOKED_PIZZA.get());
				tabData.accept(AllaboutengieModItems.COOKED_PIZZA.get());
				tabData.accept(AllaboutengieModItems.PIZZA_SLICE.get());
				tabData.accept(AllaboutengieModItems.BROWNIES_UNOPENED.get());
				tabData.accept(AllaboutengieModItems.BROWNIES_OPENED.get());
				tabData.accept(AllaboutengieModItems.BROWNIE.get());
				tabData.accept(AllaboutengieModItems.CHEESE_BALLS_UNOPENED.get());
				tabData.accept(AllaboutengieModItems.CHEESE_BALLS_OPENED.get());
				tabData.accept(AllaboutengieModItems.CHEESE_BALL.get());
				tabData.accept(AllaboutengieModItems.GOLDEN_COOKIE.get());
				tabData.accept(AllaboutengieModItems.ENCHANTED_GOLDEN_COOKIE.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_COOKIE.get());
				tabData.accept(AllaboutengieModItems.ENCHANTED_EXOTIC_COOKIE.get());
				tabData.accept(AllaboutengieModItems.ENGIE_COOKIE.get());
				tabData.accept(AllaboutengieModItems.ENCHANTED_ENGIE_COOKIE.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> MOBS = REGISTRY.register("mobs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.mobs")).icon(() -> new ItemStack(AllaboutengieModItems.AAE_ENGIE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.MAD_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ANGRY_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.OUTRAGED_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENGI_FR_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.CREATOR_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENGIE_GAMES_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.PROTOGEN_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.QUIZZET_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.COMMON_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.UNCOMMON_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.RARE_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.EPIC_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_ENGIE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> SHARKOS = REGISTRY.register("sharkos",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.sharkos")).icon(() -> new ItemStack(Items.COOKIE)).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ALBINO_SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.RARE_SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.LEGENDARY_SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.MYTHIC_SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.EXOTIC_SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARKO_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARKO_RARE_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENGIE_SHARKO_RARE_2_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> ZOMBIES = REGISTRY.register("zombies",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.zombies")).icon(() -> new ItemStack(AllaboutengieModItems.ENRAGED_ZOMBIES_PLAQUE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.ENRAGED_NORMAL_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_TNT_SPAWN_EGG.get());
				tabData.accept(AllaboutengieModItems.ENRAGED_SPEED_SPAWN_EGG.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> PIXEL_ITEMS = REGISTRY.register("pixel_items",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.pixel_items")).icon(() -> new ItemStack(AllaboutengieModItems.CRUCIFIX_PIXEL.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.CRUCIFIX_PIXEL.get());
				tabData.accept(AllaboutengieModItems.MINI_BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.BIG_BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.LARGE_BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.HUGE_BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.ENORMOUS_BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.GIGANTIC_BAN_HAMMER_PIXEL.get());
				tabData.accept(AllaboutengieModItems.MASSIVE_BAN_HAMMER_PIXEL.get());
			})

					.build());
	public static final RegistryObject<CreativeModeTab> BAN_HAMMERS = REGISTRY.register("ban_hammers",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.allaboutengie.ban_hammers")).icon(() -> new ItemStack(AllaboutengieModItems.BAN_HAMMER.get())).displayItems((parameters, tabData) -> {
				tabData.accept(AllaboutengieModItems.MINI_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.BIG_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.LARGE_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.HUGE_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get());
				tabData.accept(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get());
			})

					.build());
}
