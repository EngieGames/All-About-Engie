
package net.mcreator.allaboutengie.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.allaboutengie.init.AllaboutengieModTabs;

public abstract class UnobtainiumItem extends ArmorItem {
	public UnobtainiumItem(EquipmentSlot slot, Item.Properties properties) {
		super(new ArmorMaterial() {
			@Override
			public int getDurabilityForSlot(EquipmentSlot slot) {
				return new int[]{13, 15, 16, 11}[slot.getIndex()] * 47;
			}

			@Override
			public int getDefenseForSlot(EquipmentSlot slot) {
				return new int[]{9, 12, 14, 9}[slot.getIndex()];
			}

			@Override
			public int getEnchantmentValue() {
				return 25;
			}

			@Override
			public SoundEvent getEquipSound() {
				return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_netherite"));
			}

			@Override
			public Ingredient getRepairIngredient() {
				return Ingredient.of();
			}

			@Override
			public String getName() {
				return "unobtainium";
			}

			@Override
			public float getToughness() {
				return 5f;
			}

			@Override
			public float getKnockbackResistance() {
				return 0.3f;
			}
		}, slot, properties);
	}

	public static class Helmet extends UnobtainiumItem {
		public Helmet() {
			super(EquipmentSlot.HEAD, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/unobtainium__layer_1.png";
		}
	}

	public static class Chestplate extends UnobtainiumItem {
		public Chestplate() {
			super(EquipmentSlot.CHEST, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/unobtainium__layer_1.png";
		}
	}

	public static class Leggings extends UnobtainiumItem {
		public Leggings() {
			super(EquipmentSlot.LEGS, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/unobtainium__layer_2.png";
		}
	}

	public static class Boots extends UnobtainiumItem {
		public Boots() {
			super(EquipmentSlot.FEET, new Item.Properties().tab(AllaboutengieModTabs.TAB_AAE_ITEMS_ARMOR));
		}

		@Override
		public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
			return "allaboutengie:textures/models/armor/unobtainium__layer_1.png";
		}
	}
}
