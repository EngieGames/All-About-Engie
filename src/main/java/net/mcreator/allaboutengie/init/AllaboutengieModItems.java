
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.allaboutengie.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.allaboutengie.item.UncookedPizzaItem;
import net.mcreator.allaboutengie.item.TrueBanHammerPixelItem;
import net.mcreator.allaboutengie.item.TrueBanHammerNCMDPixelItem;
import net.mcreator.allaboutengie.item.TrueBanHammerNCMDItem;
import net.mcreator.allaboutengie.item.TrueBanHammerItem;
import net.mcreator.allaboutengie.item.TesterItem;
import net.mcreator.allaboutengie.item.SharkosPlaqueItem;
import net.mcreator.allaboutengie.item.SharkoClothItem;
import net.mcreator.allaboutengie.item.SharkItem;
import net.mcreator.allaboutengie.item.RareSharkoClothItem;
import net.mcreator.allaboutengie.item.RareSharkItem;
import net.mcreator.allaboutengie.item.PunishersGogglesItem;
import net.mcreator.allaboutengie.item.PizzaSliceItem;
import net.mcreator.allaboutengie.item.OutragedEngiesItem;
import net.mcreator.allaboutengie.item.OutragedEngieShovelItem;
import net.mcreator.allaboutengie.item.OutragedEngiePickaxeItem;
import net.mcreator.allaboutengie.item.OutragedEngieHoeItem;
import net.mcreator.allaboutengie.item.OutragedEngieEssenceItem;
import net.mcreator.allaboutengie.item.OutragedEngieAxeItem;
import net.mcreator.allaboutengie.item.OperatorsShovelItem;
import net.mcreator.allaboutengie.item.OperatorsPickaxeItem;
import net.mcreator.allaboutengie.item.OperatorsItem;
import net.mcreator.allaboutengie.item.OperatorsHoeItem;
import net.mcreator.allaboutengie.item.OperatorsAxeItem;
import net.mcreator.allaboutengie.item.MythicSharkoClothItem;
import net.mcreator.allaboutengie.item.MythicSharkItem;
import net.mcreator.allaboutengie.item.MobsPlaqueItem;
import net.mcreator.allaboutengie.item.MiniBanHammerPixelItem;
import net.mcreator.allaboutengie.item.MiniBanHammerItem;
import net.mcreator.allaboutengie.item.MassiveBanHammerPixelItem;
import net.mcreator.allaboutengie.item.MassiveBanHammerItem;
import net.mcreator.allaboutengie.item.LegendarySharkoClothItem;
import net.mcreator.allaboutengie.item.LegendarySharkItem;
import net.mcreator.allaboutengie.item.LargeBanHammerPixelItem;
import net.mcreator.allaboutengie.item.LargeBanHammerItem;
import net.mcreator.allaboutengie.item.KickBanHammerPixelItem;
import net.mcreator.allaboutengie.item.KickBanHammerItem;
import net.mcreator.allaboutengie.item.ItemsPlaqueItem;
import net.mcreator.allaboutengie.item.HugeBanHammerPixelItem;
import net.mcreator.allaboutengie.item.HugeBanHammerItem;
import net.mcreator.allaboutengie.item.GoldenCookieItem;
import net.mcreator.allaboutengie.item.GiganticBanHammerPixelItem;
import net.mcreator.allaboutengie.item.GiganticBanHammerItem;
import net.mcreator.allaboutengie.item.ExtrasPlaqueItem;
import net.mcreator.allaboutengie.item.ExoticSharkoClothItem;
import net.mcreator.allaboutengie.item.ExoticSharkItem;
import net.mcreator.allaboutengie.item.ExoticCookieItem;
import net.mcreator.allaboutengie.item.EnragedZombiesPlaqueItem;
import net.mcreator.allaboutengie.item.EnragedEngiesItem;
import net.mcreator.allaboutengie.item.EnragedEngieShovelItem;
import net.mcreator.allaboutengie.item.EnragedEngiePickaxeItem;
import net.mcreator.allaboutengie.item.EnragedEngieHoeItem;
import net.mcreator.allaboutengie.item.EnragedEngieEssenceItem;
import net.mcreator.allaboutengie.item.EnragedEngieAxeItem;
import net.mcreator.allaboutengie.item.EnormousBanHammerPixelItem;
import net.mcreator.allaboutengie.item.EnormousBanHammerItem;
import net.mcreator.allaboutengie.item.EngiesScythePixelItem;
import net.mcreator.allaboutengie.item.EngiesScytheItem;
import net.mcreator.allaboutengie.item.EngiesItem;
import net.mcreator.allaboutengie.item.EngieShovelItem;
import net.mcreator.allaboutengie.item.EngieSharkoClothItem;
import net.mcreator.allaboutengie.item.EngieSharkItem;
import net.mcreator.allaboutengie.item.EngiePickaxeItem;
import net.mcreator.allaboutengie.item.EngieHoeItem;
import net.mcreator.allaboutengie.item.EngieGemItem;
import net.mcreator.allaboutengie.item.EngieCookieItem;
import net.mcreator.allaboutengie.item.EngieAxeItem;
import net.mcreator.allaboutengie.item.EngiShovelItem;
import net.mcreator.allaboutengie.item.EngiPickaxeItem;
import net.mcreator.allaboutengie.item.EngiAxeItem;
import net.mcreator.allaboutengie.item.EnchantedGoldenCookieItem;
import net.mcreator.allaboutengie.item.EnchantedExoticCookieItem;
import net.mcreator.allaboutengie.item.EnchantedEngieCookieItem;
import net.mcreator.allaboutengie.item.EmptyCheesePuffsBinItem;
import net.mcreator.allaboutengie.item.EchdeathPixelItem;
import net.mcreator.allaboutengie.item.EchdeathItem;
import net.mcreator.allaboutengie.item.DoughWithSauceItem;
import net.mcreator.allaboutengie.item.DoughItem;
import net.mcreator.allaboutengie.item.DimensionsPlaqueItem;
import net.mcreator.allaboutengie.item.DeveloperItem;
import net.mcreator.allaboutengie.item.CyberbloodKatanaItem;
import net.mcreator.allaboutengie.item.CyberbloodItem;
import net.mcreator.allaboutengie.item.CyberbloodIngotItem;
import net.mcreator.allaboutengie.item.CyberbloodBattleAxeItem;
import net.mcreator.allaboutengie.item.CyberKatanaItem;
import net.mcreator.allaboutengie.item.CyberIngotItem;
import net.mcreator.allaboutengie.item.CrucifixPixelItem;
import net.mcreator.allaboutengie.item.CrucifixItem;
import net.mcreator.allaboutengie.item.CrackersInBowlItem;
import net.mcreator.allaboutengie.item.CrackerDustItem;
import net.mcreator.allaboutengie.item.CookedPizzaItem;
import net.mcreator.allaboutengie.item.ContributorItem;
import net.mcreator.allaboutengie.item.ComicallyMassiveBanHammerPixelItem;
import net.mcreator.allaboutengie.item.ComicallyMassiveBanHammerItem;
import net.mcreator.allaboutengie.item.CodeRedeemersItem;
import net.mcreator.allaboutengie.item.CodeRedeemersHammerPixelItem;
import net.mcreator.allaboutengie.item.CodeRedeemersHammerItem;
import net.mcreator.allaboutengie.item.CheesePuffsUnopenedItem;
import net.mcreator.allaboutengie.item.CheesePuffsOpenedItem;
import net.mcreator.allaboutengie.item.CheeseItem;
import net.mcreator.allaboutengie.item.BloodIngotItem;
import net.mcreator.allaboutengie.item.BloodBattleAxeItem;
import net.mcreator.allaboutengie.item.BigBanHammerPixelItem;
import net.mcreator.allaboutengie.item.BigBanHammerItem;
import net.mcreator.allaboutengie.item.BanHammerPixelItem;
import net.mcreator.allaboutengie.item.BanHammerItem;
import net.mcreator.allaboutengie.item.AngryEngiesItem;
import net.mcreator.allaboutengie.item.AngryEngieShovelItem;
import net.mcreator.allaboutengie.item.AngryEngiePickaxeItem;
import net.mcreator.allaboutengie.item.AngryEngieHoeItem;
import net.mcreator.allaboutengie.item.AngryEngieEssenceItem;
import net.mcreator.allaboutengie.item.AngryEngieAxeItem;
import net.mcreator.allaboutengie.item.AllAboutEngiePlaqueItem;
import net.mcreator.allaboutengie.item.AlbinoSharkoClothItem;
import net.mcreator.allaboutengie.item.AlbinoSharkItem;
import net.mcreator.allaboutengie.item.AAEEngieItem;
import net.mcreator.allaboutengie.AllaboutengieMod;

public class AllaboutengieModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, AllaboutengieMod.MODID);
	public static final RegistryObject<Item> ANGRY_ENGIE_ESSENCE = REGISTRY.register("angry_engie_essence", () -> new AngryEngieEssenceItem());
	public static final RegistryObject<Item> ENGIE_GEM = REGISTRY.register("engie_gem", () -> new EngieGemItem());
	public static final RegistryObject<Item> ENRAGED_ENGIE_ESSENCE = REGISTRY.register("enraged_engie_essence", () -> new EnragedEngieEssenceItem());
	public static final RegistryObject<Item> ENGIE_BLOCK = block(AllaboutengieModBlocks.ENGIE_BLOCK, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> ANGRY_ENGIE_BLOCK = block(AllaboutengieModBlocks.ANGRY_ENGIE_BLOCK, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> ENRAGED_ENGIE_BLOCK = block(AllaboutengieModBlocks.ENRAGED_ENGIE_BLOCK, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> ENGIE_ORE = block(AllaboutengieModBlocks.ENGIE_ORE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> DEEPSLATE_ENGIE_ORE = block(AllaboutengieModBlocks.DEEPSLATE_ENGIE_ORE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_TABLE = block(AllaboutengieModBlocks.METAL_TABLE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> OLD_ENGIE_ORE = block(AllaboutengieModBlocks.OLD_ENGIE_ORE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> OLD_DEEPSLATE_ENGIE_ORE = block(AllaboutengieModBlocks.OLD_DEEPSLATE_ENGIE_ORE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> CRUCIFIX = REGISTRY.register("crucifix", () -> new CrucifixItem());
	public static final RegistryObject<Item> TRUE_BAN_HAMMER_NCMD = REGISTRY.register("true_ban_hammer_ncmd", () -> new TrueBanHammerNCMDItem());
	public static final RegistryObject<Item> TRUE_BAN_HAMMER = REGISTRY.register("true_ban_hammer", () -> new TrueBanHammerItem());
	public static final RegistryObject<Item> KICK_BAN_HAMMER = REGISTRY.register("kick_ban_hammer", () -> new KickBanHammerItem());
	public static final RegistryObject<Item> ECHDEATH = REGISTRY.register("echdeath", () -> new EchdeathItem());
	public static final RegistryObject<Item> ENGIE_AXE = REGISTRY.register("engie_axe", () -> new EngieAxeItem());
	public static final RegistryObject<Item> ENGIE_PICKAXE = REGISTRY.register("engie_pickaxe", () -> new EngiePickaxeItem());
	public static final RegistryObject<Item> ENGIE_SHOVEL = REGISTRY.register("engie_shovel", () -> new EngieShovelItem());
	public static final RegistryObject<Item> ENGIE_HOE = REGISTRY.register("engie_hoe", () -> new EngieHoeItem());
	public static final RegistryObject<Item> ANGRY_ENGIE_AXE = REGISTRY.register("angry_engie_axe", () -> new AngryEngieAxeItem());
	public static final RegistryObject<Item> ANGRY_ENGIE_PICKAXE = REGISTRY.register("angry_engie_pickaxe", () -> new AngryEngiePickaxeItem());
	public static final RegistryObject<Item> ANGRY_ENGIE_SHOVEL = REGISTRY.register("angry_engie_shovel", () -> new AngryEngieShovelItem());
	public static final RegistryObject<Item> ANGRY_ENGIE_HOE = REGISTRY.register("angry_engie_hoe", () -> new AngryEngieHoeItem());
	public static final RegistryObject<Item> ENRAGED_ENGIE_AXE = REGISTRY.register("enraged_engie_axe", () -> new EnragedEngieAxeItem());
	public static final RegistryObject<Item> ENRAGED_ENGIE_PICKAXE = REGISTRY.register("enraged_engie_pickaxe", () -> new EnragedEngiePickaxeItem());
	public static final RegistryObject<Item> ENRAGED_ENGIE_SHOVEL = REGISTRY.register("enraged_engie_shovel", () -> new EnragedEngieShovelItem());
	public static final RegistryObject<Item> ENRAGED_ENGIE_HOE = REGISTRY.register("enraged_engie_hoe", () -> new EnragedEngieHoeItem());
	public static final RegistryObject<Item> ENGI_AXE = REGISTRY.register("engi_axe", () -> new EngiAxeItem());
	public static final RegistryObject<Item> ENGI_PICKAXE = REGISTRY.register("engi_pickaxe", () -> new EngiPickaxeItem());
	public static final RegistryObject<Item> ENGI_SHOVEL = REGISTRY.register("engi_shovel", () -> new EngiShovelItem());
	public static final RegistryObject<Item> ENGIES_SCYTHE = REGISTRY.register("engies_scythe", () -> new EngiesScytheItem());
	public static final RegistryObject<Item> EMPTY_CHEESE_PUFFS_BIN = REGISTRY.register("empty_cheese_puffs_bin", () -> new EmptyCheesePuffsBinItem());
	public static final RegistryObject<Item> METAL_CHEST = block(AllaboutengieModBlocks.METAL_CHEST, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_OAK = block(AllaboutengieModBlocks.METAL_CHEST_OAK, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_DARK_OAK = block(AllaboutengieModBlocks.METAL_CHEST_DARK_OAK, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_SPRUCE = block(AllaboutengieModBlocks.METAL_CHEST_SPRUCE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_ACACIA = block(AllaboutengieModBlocks.METAL_CHEST_ACACIA, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_BIRCH = block(AllaboutengieModBlocks.METAL_CHEST_BIRCH, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_WARPED = block(AllaboutengieModBlocks.METAL_CHEST_WARPED, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_CRIMSON = block(AllaboutengieModBlocks.METAL_CHEST_CRIMSON, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> METAL_CHEST_JUNGLE = block(AllaboutengieModBlocks.METAL_CHEST_JUNGLE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> AAE_ENGIE = REGISTRY.register("aae_engie", () -> new AAEEngieItem());
	public static final RegistryObject<Item> SHARKO_CLOTH = REGISTRY.register("sharko_cloth", () -> new SharkoClothItem());
	public static final RegistryObject<Item> ALBINO_SHARKO_CLOTH = REGISTRY.register("albino_sharko_cloth", () -> new AlbinoSharkoClothItem());
	public static final RegistryObject<Item> RARE_SHARKO_CLOTH = REGISTRY.register("rare_sharko_cloth", () -> new RareSharkoClothItem());
	public static final RegistryObject<Item> LEGENDARY_SHARKO_CLOTH = REGISTRY.register("legendary_sharko_cloth", () -> new LegendarySharkoClothItem());
	public static final RegistryObject<Item> MYTHIC_SHARKO_CLOTH = REGISTRY.register("mythic_sharko_cloth", () -> new MythicSharkoClothItem());
	public static final RegistryObject<Item> EXOTIC_SHARKO_CLOTH = REGISTRY.register("exotic_sharko_cloth", () -> new ExoticSharkoClothItem());
	public static final RegistryObject<Item> ENGIE_SHARKO_CLOTH = REGISTRY.register("engie_sharko_cloth", () -> new EngieSharkoClothItem());
	public static final RegistryObject<Item> BLOOD_INGOT = REGISTRY.register("blood_ingot", () -> new BloodIngotItem());
	public static final RegistryObject<Item> CYBER_INGOT = REGISTRY.register("cyber_ingot", () -> new CyberIngotItem());
	public static final RegistryObject<Item> CYBERBLOOD_INGOT = REGISTRY.register("cyberblood_ingot", () -> new CyberbloodIngotItem());
	public static final RegistryObject<Item> CYBER_KATANA = REGISTRY.register("cyber_katana", () -> new CyberKatanaItem());
	public static final RegistryObject<Item> BLOOD_BATTLE_AXE = REGISTRY.register("blood_battle_axe", () -> new BloodBattleAxeItem());
	public static final RegistryObject<Item> CYBERBLOOD_KATANA = REGISTRY.register("cyberblood_katana", () -> new CyberbloodKatanaItem());
	public static final RegistryObject<Item> CYBERBLOOD_BATTLE_AXE = REGISTRY.register("cyberblood_battle_axe", () -> new CyberbloodBattleAxeItem());
	public static final RegistryObject<Item> OUTRAGED_ENGIE_ESSENCE = REGISTRY.register("outraged_engie_essence", () -> new OutragedEngieEssenceItem());
	public static final RegistryObject<Item> OUTRAGED_ENGIE_AXE = REGISTRY.register("outraged_engie_axe", () -> new OutragedEngieAxeItem());
	public static final RegistryObject<Item> OUTRAGED_ENGIE_PICKAXE = REGISTRY.register("outraged_engie_pickaxe", () -> new OutragedEngiePickaxeItem());
	public static final RegistryObject<Item> OUTRAGED_ENGIE_SHOVEL = REGISTRY.register("outraged_engie_shovel", () -> new OutragedEngieShovelItem());
	public static final RegistryObject<Item> OUTRAGED_ENGIE_HOE = REGISTRY.register("outraged_engie_hoe", () -> new OutragedEngieHoeItem());
	public static final RegistryObject<Item> OUTRAGED_ENGIE_BLOCK = block(AllaboutengieModBlocks.OUTRAGED_ENGIE_BLOCK, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> ANGEL_HATTED_PRESENT = block(AllaboutengieModBlocks.ANGEL_HATTED_PRESENT, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> TRUE_BAN_HAMMER_NCMD_PIXEL = REGISTRY.register("true_ban_hammer_ncmd_pixel", () -> new TrueBanHammerNCMDPixelItem());
	public static final RegistryObject<Item> TRUE_BAN_HAMMER_PIXEL = REGISTRY.register("true_ban_hammer_pixel", () -> new TrueBanHammerPixelItem());
	public static final RegistryObject<Item> KICK_BAN_HAMMER_PIXEL = REGISTRY.register("kick_ban_hammer_pixel", () -> new KickBanHammerPixelItem());
	public static final RegistryObject<Item> ECHDEATH_PIXEL = REGISTRY.register("echdeath_pixel", () -> new EchdeathPixelItem());
	public static final RegistryObject<Item> CRUCIFIX_PIXEL = REGISTRY.register("crucifix_pixel", () -> new CrucifixPixelItem());
	public static final RegistryObject<Item> ENGIES_SCYTHE_PIXEL = REGISTRY.register("engies_scythe_pixel", () -> new EngiesScythePixelItem());
	public static final RegistryObject<Item> DOUGH = REGISTRY.register("dough", () -> new DoughItem());
	public static final RegistryObject<Item> DOUGH_WITH_SAUCE = REGISTRY.register("dough_with_sauce", () -> new DoughWithSauceItem());
	public static final RegistryObject<Item> UNCOOKED_PIZZA = REGISTRY.register("uncooked_pizza", () -> new UncookedPizzaItem());
	public static final RegistryObject<Item> COOKED_PIZZA = REGISTRY.register("cooked_pizza", () -> new CookedPizzaItem());
	public static final RegistryObject<Item> PIZZA_SLICE = REGISTRY.register("pizza_slice", () -> new PizzaSliceItem());
	public static final RegistryObject<Item> CHEESE = REGISTRY.register("cheese", () -> new CheeseItem());
	public static final RegistryObject<Item> CRACKERS_IN_BOWL = REGISTRY.register("crackers_in_bowl", () -> new CrackersInBowlItem());
	public static final RegistryObject<Item> CRACKER_DUST = REGISTRY.register("cracker_dust", () -> new CrackerDustItem());
	public static final RegistryObject<Item> CHEESE_PUFFS_UNOPENED = REGISTRY.register("cheese_puffs_unopened", () -> new CheesePuffsUnopenedItem());
	public static final RegistryObject<Item> CHEESE_PUFFS_OPENED = REGISTRY.register("cheese_puffs_opened", () -> new CheesePuffsOpenedItem());
	public static final RegistryObject<Item> GOLDEN_COOKIE = REGISTRY.register("golden_cookie", () -> new GoldenCookieItem());
	public static final RegistryObject<Item> ENCHANTED_GOLDEN_COOKIE = REGISTRY.register("enchanted_golden_cookie", () -> new EnchantedGoldenCookieItem());
	public static final RegistryObject<Item> EXOTIC_COOKIE = REGISTRY.register("exotic_cookie", () -> new ExoticCookieItem());
	public static final RegistryObject<Item> ENCHANTED_EXOTIC_COOKIE = REGISTRY.register("enchanted_exotic_cookie", () -> new EnchantedExoticCookieItem());
	public static final RegistryObject<Item> ENGIE_COOKIE = REGISTRY.register("engie_cookie", () -> new EngieCookieItem());
	public static final RegistryObject<Item> ENCHANTED_ENGIE_COOKIE = REGISTRY.register("enchanted_engie_cookie", () -> new EnchantedEngieCookieItem());
	public static final RegistryObject<Item> ENGIE_SPAWN_EGG = REGISTRY.register("engie_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE, -1559757, -12386431, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> MAD_ENGIE_SPAWN_EGG = REGISTRY.register("mad_engie_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.MAD_ENGIE, -3407872, -6044, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ANGRY_ENGIE_SPAWN_EGG = REGISTRY.register("angry_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ANGRY_ENGIE, -16777216, -1, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENRAGED_ENGIE_SPAWN_EGG = REGISTRY.register("enraged_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENRAGED_ENGIE, -16777216, -10092544, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> OUTRAGED_ENGIE_SPAWN_EGG = REGISTRY.register("outraged_engie_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.OUTRAGED_ENGIE, -16777216, -9502465, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENGI_FR_SPAWN_EGG = REGISTRY.register("engi_fr_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGI_FR, -15921907, -1, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> CREATOR_SPAWN_EGG = REGISTRY.register("creator_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.CREATOR, -6723841, -154, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENGIE_GAMES_SPAWN_EGG = REGISTRY.register("engie_games_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_GAMES, -1559757, -12386431, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> PROTOGEN_SPAWN_EGG = REGISTRY.register("protogen_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.PROTOGEN, -16737793, -16750951, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> QUIZZET_SPAWN_EGG = REGISTRY.register("quizzet_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.QUIZZET, -1, -16777216, new Item.Properties().tab(AllaboutengieModTabs.TAB_MOBS)));
	public static final RegistryObject<Item> ENGIES_HELMET = REGISTRY.register("engies_helmet", () -> new EngiesItem.Helmet());
	public static final RegistryObject<Item> ENGIES_CHESTPLATE = REGISTRY.register("engies_chestplate", () -> new EngiesItem.Chestplate());
	public static final RegistryObject<Item> ENGIES_LEGGINGS = REGISTRY.register("engies_leggings", () -> new EngiesItem.Leggings());
	public static final RegistryObject<Item> ENGIES_BOOTS = REGISTRY.register("engies_boots", () -> new EngiesItem.Boots());
	public static final RegistryObject<Item> ANGRY_ENGIES_HELMET = REGISTRY.register("angry_engies_helmet", () -> new AngryEngiesItem.Helmet());
	public static final RegistryObject<Item> ANGRY_ENGIES_CHESTPLATE = REGISTRY.register("angry_engies_chestplate", () -> new AngryEngiesItem.Chestplate());
	public static final RegistryObject<Item> ANGRY_ENGIES_LEGGINGS = REGISTRY.register("angry_engies_leggings", () -> new AngryEngiesItem.Leggings());
	public static final RegistryObject<Item> ANGRY_ENGIES_BOOTS = REGISTRY.register("angry_engies_boots", () -> new AngryEngiesItem.Boots());
	public static final RegistryObject<Item> ENRAGED_ENGIES_HELMET = REGISTRY.register("enraged_engies_helmet", () -> new EnragedEngiesItem.Helmet());
	public static final RegistryObject<Item> ENRAGED_ENGIES_CHESTPLATE = REGISTRY.register("enraged_engies_chestplate", () -> new EnragedEngiesItem.Chestplate());
	public static final RegistryObject<Item> ENRAGED_ENGIES_LEGGINGS = REGISTRY.register("enraged_engies_leggings", () -> new EnragedEngiesItem.Leggings());
	public static final RegistryObject<Item> ENRAGED_ENGIES_BOOTS = REGISTRY.register("enraged_engies_boots", () -> new EnragedEngiesItem.Boots());
	public static final RegistryObject<Item> SHARK_HELMET = REGISTRY.register("shark_helmet", () -> new SharkItem.Helmet());
	public static final RegistryObject<Item> SHARK_CHESTPLATE = REGISTRY.register("shark_chestplate", () -> new SharkItem.Chestplate());
	public static final RegistryObject<Item> SHARK_LEGGINGS = REGISTRY.register("shark_leggings", () -> new SharkItem.Leggings());
	public static final RegistryObject<Item> SHARK_BOOTS = REGISTRY.register("shark_boots", () -> new SharkItem.Boots());
	public static final RegistryObject<Item> ALBINO_SHARK_HELMET = REGISTRY.register("albino_shark_helmet", () -> new AlbinoSharkItem.Helmet());
	public static final RegistryObject<Item> ALBINO_SHARK_CHESTPLATE = REGISTRY.register("albino_shark_chestplate", () -> new AlbinoSharkItem.Chestplate());
	public static final RegistryObject<Item> ALBINO_SHARK_LEGGINGS = REGISTRY.register("albino_shark_leggings", () -> new AlbinoSharkItem.Leggings());
	public static final RegistryObject<Item> ALBINO_SHARK_BOOTS = REGISTRY.register("albino_shark_boots", () -> new AlbinoSharkItem.Boots());
	public static final RegistryObject<Item> RARE_SHARK_HELMET = REGISTRY.register("rare_shark_helmet", () -> new RareSharkItem.Helmet());
	public static final RegistryObject<Item> RARE_SHARK_CHESTPLATE = REGISTRY.register("rare_shark_chestplate", () -> new RareSharkItem.Chestplate());
	public static final RegistryObject<Item> RARE_SHARK_LEGGINGS = REGISTRY.register("rare_shark_leggings", () -> new RareSharkItem.Leggings());
	public static final RegistryObject<Item> RARE_SHARK_BOOTS = REGISTRY.register("rare_shark_boots", () -> new RareSharkItem.Boots());
	public static final RegistryObject<Item> LEGENDARY_SHARK_HELMET = REGISTRY.register("legendary_shark_helmet", () -> new LegendarySharkItem.Helmet());
	public static final RegistryObject<Item> LEGENDARY_SHARK_CHESTPLATE = REGISTRY.register("legendary_shark_chestplate", () -> new LegendarySharkItem.Chestplate());
	public static final RegistryObject<Item> LEGENDARY_SHARK_LEGGINGS = REGISTRY.register("legendary_shark_leggings", () -> new LegendarySharkItem.Leggings());
	public static final RegistryObject<Item> LEGENDARY_SHARK_BOOTS = REGISTRY.register("legendary_shark_boots", () -> new LegendarySharkItem.Boots());
	public static final RegistryObject<Item> MYTHIC_SHARK_HELMET = REGISTRY.register("mythic_shark_helmet", () -> new MythicSharkItem.Helmet());
	public static final RegistryObject<Item> MYTHIC_SHARK_CHESTPLATE = REGISTRY.register("mythic_shark_chestplate", () -> new MythicSharkItem.Chestplate());
	public static final RegistryObject<Item> MYTHIC_SHARK_LEGGINGS = REGISTRY.register("mythic_shark_leggings", () -> new MythicSharkItem.Leggings());
	public static final RegistryObject<Item> MYTHIC_SHARK_BOOTS = REGISTRY.register("mythic_shark_boots", () -> new MythicSharkItem.Boots());
	public static final RegistryObject<Item> EXOTIC_SHARK_HELMET = REGISTRY.register("exotic_shark_helmet", () -> new ExoticSharkItem.Helmet());
	public static final RegistryObject<Item> EXOTIC_SHARK_CHESTPLATE = REGISTRY.register("exotic_shark_chestplate", () -> new ExoticSharkItem.Chestplate());
	public static final RegistryObject<Item> EXOTIC_SHARK_LEGGINGS = REGISTRY.register("exotic_shark_leggings", () -> new ExoticSharkItem.Leggings());
	public static final RegistryObject<Item> EXOTIC_SHARK_BOOTS = REGISTRY.register("exotic_shark_boots", () -> new ExoticSharkItem.Boots());
	public static final RegistryObject<Item> ENGIE_SHARK_HELMET = REGISTRY.register("engie_shark_helmet", () -> new EngieSharkItem.Helmet());
	public static final RegistryObject<Item> ENGIE_SHARK_CHESTPLATE = REGISTRY.register("engie_shark_chestplate", () -> new EngieSharkItem.Chestplate());
	public static final RegistryObject<Item> ENGIE_SHARK_LEGGINGS = REGISTRY.register("engie_shark_leggings", () -> new EngieSharkItem.Leggings());
	public static final RegistryObject<Item> ENGIE_SHARK_BOOTS = REGISTRY.register("engie_shark_boots", () -> new EngieSharkItem.Boots());
	public static final RegistryObject<Item> CYBERBLOOD_HELMET = REGISTRY.register("cyberblood_helmet", () -> new CyberbloodItem.Helmet());
	public static final RegistryObject<Item> CYBERBLOOD_CHESTPLATE = REGISTRY.register("cyberblood_chestplate", () -> new CyberbloodItem.Chestplate());
	public static final RegistryObject<Item> CYBERBLOOD_LEGGINGS = REGISTRY.register("cyberblood_leggings", () -> new CyberbloodItem.Leggings());
	public static final RegistryObject<Item> CYBERBLOOD_BOOTS = REGISTRY.register("cyberblood_boots", () -> new CyberbloodItem.Boots());
	public static final RegistryObject<Item> OUTRAGED_ENGIES_HELMET = REGISTRY.register("outraged_engies_helmet", () -> new OutragedEngiesItem.Helmet());
	public static final RegistryObject<Item> OUTRAGED_ENGIES_CHESTPLATE = REGISTRY.register("outraged_engies_chestplate", () -> new OutragedEngiesItem.Chestplate());
	public static final RegistryObject<Item> OUTRAGED_ENGIES_LEGGINGS = REGISTRY.register("outraged_engies_leggings", () -> new OutragedEngiesItem.Leggings());
	public static final RegistryObject<Item> OUTRAGED_ENGIES_BOOTS = REGISTRY.register("outraged_engies_boots", () -> new OutragedEngiesItem.Boots());
	public static final RegistryObject<Item> SHARKO_SPAWN_EGG = REGISTRY.register("sharko_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.SHARKO, -12420148, -1, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ALBINO_SHARKO_SPAWN_EGG = REGISTRY.register("albino_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ALBINO_SHARKO, -1644826, -1, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> RARE_SHARKO_SPAWN_EGG = REGISTRY.register("rare_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.RARE_SHARKO, -1644826, -10450, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_SPAWN_EGG = REGISTRY.register("legendary_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.LEGENDARY_SHARKO, -12544, -7680, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_SPAWN_EGG = REGISTRY.register("mythic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.MYTHIC_SHARKO, -1512448, -196818, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_SPAWN_EGG = REGISTRY.register("exotic_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.EXOTIC_SHARKO, -16714511, -12845059, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_SPAWN_EGG = REGISTRY.register("engie_sharko_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO, -16250872, -7271155, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_RARE, -1, -2788547, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2, -5329997, -13551280, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> SHARKO_LAY_SPAWN_EGG = REGISTRY.register("sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.SHARKO_LAY, -12420148, -1, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ALBINO_SHARKO_LAY_SPAWN_EGG = REGISTRY.register("albino_sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ALBINO_SHARKO_LAY, -1644826, -1, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> RARE_SHARKO_LAY_SPAWN_EGG = REGISTRY.register("rare_sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.RARE_SHARKO_LAY, -1644826, -10450, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_LAY_SPAWN_EGG = REGISTRY.register("legendary_sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.LEGENDARY_SHARKO_LAY, -12544, -7680, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_LAY_SPAWN_EGG = REGISTRY.register("mythic_sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.MYTHIC_SHARKO_LAY, -1512448, -196818, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_LAY_SPAWN_EGG = REGISTRY.register("exotic_sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.EXOTIC_SHARKO_LAY, -16714511, -12845059, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_LAY_SPAWN_EGG = REGISTRY.register("engie_sharko_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_LAY, -16250872, -7271155, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_LAY_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_RARE_LAY, -1, -2788547, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_LAY_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_LAY, -5329997, -13551280, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> MINI_BAN_HAMMER = REGISTRY.register("mini_ban_hammer", () -> new MiniBanHammerItem());
	public static final RegistryObject<Item> BAN_HAMMER = REGISTRY.register("ban_hammer", () -> new BanHammerItem());
	public static final RegistryObject<Item> BIG_BAN_HAMMER = REGISTRY.register("big_ban_hammer", () -> new BigBanHammerItem());
	public static final RegistryObject<Item> LARGE_BAN_HAMMER = REGISTRY.register("large_ban_hammer", () -> new LargeBanHammerItem());
	public static final RegistryObject<Item> HUGE_BAN_HAMMER = REGISTRY.register("huge_ban_hammer", () -> new HugeBanHammerItem());
	public static final RegistryObject<Item> ENORMOUS_BAN_HAMMER = REGISTRY.register("enormous_ban_hammer", () -> new EnormousBanHammerItem());
	public static final RegistryObject<Item> GIGANTIC_BAN_HAMMER = REGISTRY.register("gigantic_ban_hammer", () -> new GiganticBanHammerItem());
	public static final RegistryObject<Item> MASSIVE_BAN_HAMMER = REGISTRY.register("massive_ban_hammer", () -> new MassiveBanHammerItem());
	public static final RegistryObject<Item> MINI_BAN_HAMMER_PIXEL = REGISTRY.register("mini_ban_hammer_pixel", () -> new MiniBanHammerPixelItem());
	public static final RegistryObject<Item> BAN_HAMMER_PIXEL = REGISTRY.register("ban_hammer_pixel", () -> new BanHammerPixelItem());
	public static final RegistryObject<Item> BIG_BAN_HAMMER_PIXEL = REGISTRY.register("big_ban_hammer_pixel", () -> new BigBanHammerPixelItem());
	public static final RegistryObject<Item> LARGE_BAN_HAMMER_PIXEL = REGISTRY.register("large_ban_hammer_pixel", () -> new LargeBanHammerPixelItem());
	public static final RegistryObject<Item> HUGE_BAN_HAMMER_PIXEL = REGISTRY.register("huge_ban_hammer_pixel", () -> new HugeBanHammerPixelItem());
	public static final RegistryObject<Item> ENORMOUS_BAN_HAMMER_PIXEL = REGISTRY.register("enormous_ban_hammer_pixel", () -> new EnormousBanHammerPixelItem());
	public static final RegistryObject<Item> GIGANTIC_BAN_HAMMER_PIXEL = REGISTRY.register("gigantic_ban_hammer_pixel", () -> new GiganticBanHammerPixelItem());
	public static final RegistryObject<Item> MASSIVE_BAN_HAMMER_PIXEL = REGISTRY.register("massive_ban_hammer_pixel", () -> new MassiveBanHammerPixelItem());
	public static final RegistryObject<Item> OPERATORS_HELMET = REGISTRY.register("operators_helmet", () -> new OperatorsItem.Helmet());
	public static final RegistryObject<Item> OPERATORS_CHESTPLATE = REGISTRY.register("operators_chestplate", () -> new OperatorsItem.Chestplate());
	public static final RegistryObject<Item> OPERATORS_LEGGINGS = REGISTRY.register("operators_leggings", () -> new OperatorsItem.Leggings());
	public static final RegistryObject<Item> OPERATORS_BOOTS = REGISTRY.register("operators_boots", () -> new OperatorsItem.Boots());
	public static final RegistryObject<Item> THANKS_FOR_PLAYING = block(AllaboutengieModBlocks.THANKS_FOR_PLAYING, null);
	public static final RegistryObject<Item> OPERATORS_AXE = REGISTRY.register("operators_axe", () -> new OperatorsAxeItem());
	public static final RegistryObject<Item> OPERATORS_PICKAXE = REGISTRY.register("operators_pickaxe", () -> new OperatorsPickaxeItem());
	public static final RegistryObject<Item> OPERATORS_SHOVEL = REGISTRY.register("operators_shovel", () -> new OperatorsShovelItem());
	public static final RegistryObject<Item> OPERATORS_HOE = REGISTRY.register("operators_hoe", () -> new OperatorsHoeItem());
	public static final RegistryObject<Item> DEVELOPER_HELMET = REGISTRY.register("developer_helmet", () -> new DeveloperItem.Helmet());
	public static final RegistryObject<Item> DEVELOPER_CHESTPLATE = REGISTRY.register("developer_chestplate", () -> new DeveloperItem.Chestplate());
	public static final RegistryObject<Item> DEVELOPER_LEGGINGS = REGISTRY.register("developer_leggings", () -> new DeveloperItem.Leggings());
	public static final RegistryObject<Item> DEVELOPER_BOOTS = REGISTRY.register("developer_boots", () -> new DeveloperItem.Boots());
	public static final RegistryObject<Item> IDEAGIVER_HELMET = REGISTRY.register("ideagiver_helmet", () -> new ContributorItem.Helmet());
	public static final RegistryObject<Item> IDEAGIVER_CHESTPLATE = REGISTRY.register("ideagiver_chestplate", () -> new ContributorItem.Chestplate());
	public static final RegistryObject<Item> IDEAGIVER_LEGGINGS = REGISTRY.register("ideagiver_leggings", () -> new ContributorItem.Leggings());
	public static final RegistryObject<Item> IDEAGIVER_BOOTS = REGISTRY.register("ideagiver_boots", () -> new ContributorItem.Boots());
	public static final RegistryObject<Item> TESTER_HELMET = REGISTRY.register("tester_helmet", () -> new TesterItem.Helmet());
	public static final RegistryObject<Item> TESTER_CHESTPLATE = REGISTRY.register("tester_chestplate", () -> new TesterItem.Chestplate());
	public static final RegistryObject<Item> TESTER_LEGGINGS = REGISTRY.register("tester_leggings", () -> new TesterItem.Leggings());
	public static final RegistryObject<Item> TESTER_BOOTS = REGISTRY.register("tester_boots", () -> new TesterItem.Boots());
	public static final RegistryObject<Item> PUNISHERS_GOGGLES = REGISTRY.register("punishers_goggles", () -> new PunishersGogglesItem());
	public static final RegistryObject<Item> SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("sharko_tamed_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.SHARKO_TAMED, -12420148, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ALBINO_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("albino_sharko_tamed_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.ALBINO_SHARKO_TAMED, -1644826, -1, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> RARE_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("rare_sharko_tamed_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.RARE_SHARKO_TAMED, -1644826, -10450, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> LEGENDARY_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("legendary_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.LEGENDARY_SHARKO_TAMED, -12544, -7680, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> MYTHIC_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("mythic_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.MYTHIC_SHARKO_TAMED, -1512448, -196818, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> EXOTIC_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("exotic_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.EXOTIC_SHARKO_TAMED, -16714511, -12845059, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_TAMED_SPAWN_EGG = REGISTRY.register("engie_sharko_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_TAMED, -16250872, -7271155, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_TAMED_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_RARE_TAMED, -1, -2788547, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ENGIE_SHARKO_RARE_2_TAMED_SPAWN_EGG = REGISTRY.register("engie_sharko_rare_2_tamed_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.ENGIE_SHARKO_RARE_2_TAMED, -5329997, -13551280, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> ITEMS_PLAQUE = REGISTRY.register("items_plaque", () -> new ItemsPlaqueItem());
	public static final RegistryObject<Item> MOBS_PLAQUE = REGISTRY.register("mobs_plaque", () -> new MobsPlaqueItem());
	public static final RegistryObject<Item> EXTRAS_PLAQUE = REGISTRY.register("extras_plaque", () -> new ExtrasPlaqueItem());
	public static final RegistryObject<Item> SHARKOS_PLAQUE = REGISTRY.register("sharkos_plaque", () -> new SharkosPlaqueItem());
	public static final RegistryObject<Item> DIMENSIONS_PLAQUE = REGISTRY.register("dimensions_plaque", () -> new DimensionsPlaqueItem());
	public static final RegistryObject<Item> ENRAGED_ZOMBIES_PLAQUE = REGISTRY.register("enraged_zombies_plaque", () -> new EnragedZombiesPlaqueItem());
	public static final RegistryObject<Item> ALL_ABOUT_ENGIE_PLAQUE = REGISTRY.register("all_about_engie_plaque", () -> new AllAboutEngiePlaqueItem());
	public static final RegistryObject<Item> THANKS_FOR_PLAYING_2 = block(AllaboutengieModBlocks.THANKS_FOR_PLAYING_2, null);
	public static final RegistryObject<Item> COMICALLY_MASSIVE_BAN_HAMMER = REGISTRY.register("comically_massive_ban_hammer", () -> new ComicallyMassiveBanHammerItem());
	public static final RegistryObject<Item> COMICALLY_MASSIVE_BAN_HAMMER_PIXEL = REGISTRY.register("comically_massive_ban_hammer_pixel", () -> new ComicallyMassiveBanHammerPixelItem());
	public static final RegistryObject<Item> CODE_REDEEMERS_HAMMER = REGISTRY.register("code_redeemers_hammer", () -> new CodeRedeemersHammerItem());
	public static final RegistryObject<Item> CODE_REDEEMERS_HAMMER_PIXEL = REGISTRY.register("code_redeemers_hammer_pixel", () -> new CodeRedeemersHammerPixelItem());
	public static final RegistryObject<Item> CODE_REDEEMERS_HELMET = REGISTRY.register("code_redeemers_helmet", () -> new CodeRedeemersItem.Helmet());
	public static final RegistryObject<Item> CODE_REDEEMERS_CHESTPLATE = REGISTRY.register("code_redeemers_chestplate", () -> new CodeRedeemersItem.Chestplate());
	public static final RegistryObject<Item> CODE_REDEEMERS_LEGGINGS = REGISTRY.register("code_redeemers_leggings", () -> new CodeRedeemersItem.Leggings());
	public static final RegistryObject<Item> CODE_REDEEMERS_BOOTS = REGISTRY.register("code_redeemers_boots", () -> new CodeRedeemersItem.Boots());
	public static final RegistryObject<Item> TOBY_SPAWN_EGG = REGISTRY.register("toby_spawn_egg", () -> new ForgeSpawnEggItem(AllaboutengieModEntities.TOBY, -5329997, -13551280, new Item.Properties().tab(null)));
	public static final RegistryObject<Item> TOBY_LAY_SPAWN_EGG = REGISTRY.register("toby_lay_spawn_egg",
			() -> new ForgeSpawnEggItem(AllaboutengieModEntities.TOBY_LAY, -5329997, -13551280, new Item.Properties().tab(AllaboutengieModTabs.TAB_SHARKOS)));
	public static final RegistryObject<Item> CYBER_ORE = block(AllaboutengieModBlocks.CYBER_ORE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);
	public static final RegistryObject<Item> BLOOD_ORE = block(AllaboutengieModBlocks.BLOOD_ORE, AllaboutengieModTabs.TAB_AAE_ITEMS_ITEMS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
