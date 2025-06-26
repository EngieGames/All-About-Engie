
package net.mcreator.allaboutengie.enchantment;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.allaboutengie.init.AllaboutengieModItems;

import java.util.List;

public class EngiesBlessingEnchantment extends Enchantment {
	public EngiesBlessingEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 10;
	}

	@Override
	protected boolean checkCompatibility(Enchantment ench) {
		return this != ench && !List.of(Enchantments.BINDING_CURSE, Enchantments.SILK_TOUCH, Enchantments.INFINITY_ARROWS, Enchantments.FISHING_LUCK, Enchantments.FISHING_SPEED, Enchantments.LOYALTY, Enchantments.IMPALING, Enchantments.RIPTIDE,
				Enchantments.CHANNELING, Enchantments.MULTISHOT, Enchantments.QUICK_CHARGE, Enchantments.PIERCING).contains(ench);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return Ingredient.of(new ItemStack(AllaboutengieModItems.ECHDEATH.get()), new ItemStack(AllaboutengieModItems.ECHDEATH_PIXEL.get()), new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE.get()),
				new ItemStack(AllaboutengieModItems.ENGIES_SCYTHE_PIXEL.get()), new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.BAN_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.MINI_BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.BIG_BAN_HAMMER_PIXEL.get()),
				new ItemStack(AllaboutengieModItems.LARGE_BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.HUGE_BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.ENORMOUS_BAN_HAMMER_PIXEL.get()),
				new ItemStack(AllaboutengieModItems.GIGANTIC_BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.MASSIVE_BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.COMMON_SWORD.get()), new ItemStack(AllaboutengieModItems.UNCOMMON_SWORD.get()),
				new ItemStack(AllaboutengieModItems.RARE_SWORD.get()), new ItemStack(AllaboutengieModItems.EPIC_SWORD.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_SWORD.get()), new ItemStack(AllaboutengieModItems.MYTHIC_SWORD.get()),
				new ItemStack(AllaboutengieModItems.EXOTIC_SWORD.get()), new ItemStack(AllaboutengieModItems.UNOBTAINIUM_SWORD.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_BAN_HAMMER_PIXEL.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_BAN_HAMMER_PIXEL.get()),
				new ItemStack(AllaboutengieModItems.HWG_SCYTHE.get()), new ItemStack(AllaboutengieModItems.DOOMSDAY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMSDAY_SCYTHE.get()),
				new ItemStack(AllaboutengieModItems.THE_END_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ENGIE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.MINI_SCYTHE.get()), new ItemStack(AllaboutengieModItems.SCYTHE.get()),
				new ItemStack(AllaboutengieModItems.BIG_SCYTHE.get()), new ItemStack(AllaboutengieModItems.LARGE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.HUGE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.ENORMOUS_SCYTHE.get()),
				new ItemStack(AllaboutengieModItems.GIGANTIC_SCYTHE.get()), new ItemStack(AllaboutengieModItems.MASSIVE_SCYTHE.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIE_SCYTHE.get()),
				new ItemStack(AllaboutengieModItems.MONSTROSITY_SCYTHE.get()), new ItemStack(AllaboutengieModItems.DOOMSDAY_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMSDAY_BAN_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.THE_END_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.ENGIES_BAN_HAMMER.get()), new ItemStack(AllaboutengieModItems.A_REAL_BAN_HAMMER.get()),
				new ItemStack(AllaboutengieModItems.A_REAL_BAN_HAMMER_PIXEL.get()), new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.IRON_SWORD), new ItemStack(Items.DIAMOND_SWORD),
				new ItemStack(Items.NETHERITE_SWORD), new ItemStack(AllaboutengieModItems.OPERATORS_HELMET.get()), new ItemStack(AllaboutengieModItems.OPERATORS_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.OPERATORS_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.OPERATORS_BOOTS.get()), new ItemStack(AllaboutengieModItems.DEVELOPER_HELMET.get()), new ItemStack(AllaboutengieModItems.DEVELOPER_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.DEVELOPER_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.DEVELOPER_BOOTS.get()), new ItemStack(AllaboutengieModItems.IDEAGIVER_HELMET.get()),
				new ItemStack(AllaboutengieModItems.IDEAGIVER_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.IDEAGIVER_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.IDEAGIVER_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.TESTER_HELMET.get()), new ItemStack(AllaboutengieModItems.TESTER_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.TESTER_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.TESTER_BOOTS.get()), new ItemStack(AllaboutengieModItems.ENGIES_HELMET.get()), new ItemStack(AllaboutengieModItems.ENGIES_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.ENGIES_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.ENGIES_BOOTS.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_HELMET.get()),
				new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.ANGRY_ENGIES_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_HELMET.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.ENRAGED_ENGIES_BOOTS.get()), new ItemStack(AllaboutengieModItems.SHARK_HELMET.get()), new ItemStack(AllaboutengieModItems.SHARK_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.SHARK_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.SHARK_BOOTS.get()), new ItemStack(AllaboutengieModItems.ALBINO_SHARK_HELMET.get()),
				new ItemStack(AllaboutengieModItems.ALBINO_SHARK_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.ALBINO_SHARK_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.ALBINO_SHARK_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.RARE_SHARK_HELMET.get()), new ItemStack(AllaboutengieModItems.RARE_SHARK_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.RARE_SHARK_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.RARE_SHARK_BOOTS.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_HELMET.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_SHARK_BOOTS.get()), new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_HELMET.get()),
				new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.MYTHIC_SHARK_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_HELMET.get()), new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.EXOTIC_SHARK_BOOTS.get()), new ItemStack(AllaboutengieModItems.ENGIE_SHARK_HELMET.get()), new ItemStack(AllaboutengieModItems.ENGIE_SHARK_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.ENGIE_SHARK_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.ENGIE_SHARK_BOOTS.get()), new ItemStack(AllaboutengieModItems.CYBERBLOOD_HELMET.get()),
				new ItemStack(AllaboutengieModItems.CYBERBLOOD_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.CYBERBLOOD_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.CYBERBLOOD_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_HELMET.get()), new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.CODE_REDEEMERS_BOOTS.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_HELMET.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.OUTRAGED_ENGIES_BOOTS.get()), new ItemStack(AllaboutengieModItems.COMMON_HELMET.get()),
				new ItemStack(AllaboutengieModItems.COMMON_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.COMMON_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.COMMON_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.UNCOMMON_HELMET.get()), new ItemStack(AllaboutengieModItems.UNCOMMON_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.UNCOMMON_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.UNCOMMON_BOOTS.get()), new ItemStack(AllaboutengieModItems.RARE_HELMET.get()), new ItemStack(AllaboutengieModItems.RARE_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.RARE_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.RARE_BOOTS.get()), new ItemStack(AllaboutengieModItems.EPIC_HELMET.get()), new ItemStack(AllaboutengieModItems.EPIC_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.EPIC_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.EPIC_BOOTS.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_HELMET.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.LEGENDARY_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.LEGENDARY_BOOTS.get()), new ItemStack(AllaboutengieModItems.MYTHIC_HELMET.get()),
				new ItemStack(AllaboutengieModItems.MYTHIC_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.MYTHIC_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.MYTHIC_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.EXOTIC_HELMET.get()), new ItemStack(AllaboutengieModItems.EXOTIC_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.EXOTIC_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.EXOTIC_BOOTS.get()), new ItemStack(AllaboutengieModItems.UNOBTAINIUM_HELMET.get()), new ItemStack(AllaboutengieModItems.UNOBTAINIUM_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.UNOBTAINIUM_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.UNOBTAINIUM_BOOTS.get()), new ItemStack(AllaboutengieModItems.CYBER_HELMET.get()),
				new ItemStack(AllaboutengieModItems.CYBER_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.CYBER_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.CYBER_BOOTS.get()), new ItemStack(AllaboutengieModItems.BLOOD_HELMET.get()),
				new ItemStack(AllaboutengieModItems.BLOOD_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.BLOOD_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.BLOOD_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_HELMET.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.BIBLICALLY_ACCURATE_ENGIES_BOOTS.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_HELMET.get()),
				new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.MONSTROSITY_ENGIES_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.EPIC_SHARK_HELMET.get()), new ItemStack(AllaboutengieModItems.EPIC_SHARK_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.EPIC_SHARK_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.EPIC_SHARK_BOOTS.get()), new ItemStack(AllaboutengieModItems.HWG_HELMET.get()), new ItemStack(AllaboutengieModItems.HWG_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.HWG_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.HWG_BOOTS.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAYS_HELMET.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAYS_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.DOOMS_DAYS_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.DOOMS_DAYS_BOOTS.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAYS_HELMET.get()),
				new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAYS_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAYS_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.SUPER_DOOMS_DAYS_BOOTS.get()),
				new ItemStack(AllaboutengieModItems.THE_ENDS_HELMET.get()), new ItemStack(AllaboutengieModItems.THE_ENDS_CHESTPLATE.get()), new ItemStack(AllaboutengieModItems.THE_ENDS_LEGGINGS.get()),
				new ItemStack(AllaboutengieModItems.THE_ENDS_BOOTS.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMESS_HELMET.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMESS_CHESTPLATE.get()),
				new ItemStack(AllaboutengieModItems.ENGIE_GAMESS_LEGGINGS.get()), new ItemStack(AllaboutengieModItems.ENGIE_GAMESS_BOOTS.get()), new ItemStack(Items.LEATHER_HELMET), new ItemStack(Items.LEATHER_CHESTPLATE),
				new ItemStack(Items.LEATHER_LEGGINGS), new ItemStack(Items.LEATHER_BOOTS), new ItemStack(Items.CHAINMAIL_HELMET), new ItemStack(Items.CHAINMAIL_CHESTPLATE), new ItemStack(Items.CHAINMAIL_LEGGINGS),
				new ItemStack(Items.CHAINMAIL_BOOTS), new ItemStack(Items.TURTLE_HELMET), new ItemStack(Items.IRON_HELMET), new ItemStack(Items.IRON_CHESTPLATE), new ItemStack(Items.IRON_LEGGINGS), new ItemStack(Items.IRON_BOOTS),
				new ItemStack(Items.GOLDEN_HELMET), new ItemStack(Items.GOLDEN_CHESTPLATE), new ItemStack(Items.GOLDEN_LEGGINGS), new ItemStack(Items.GOLDEN_BOOTS), new ItemStack(Items.DIAMOND_HELMET), new ItemStack(Items.DIAMOND_CHESTPLATE),
				new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.NETHERITE_HELMET), new ItemStack(Items.NETHERITE_CHESTPLATE), new ItemStack(Items.NETHERITE_LEGGINGS),
				new ItemStack(Items.NETHERITE_BOOTS)).test(itemstack);
	}
}
