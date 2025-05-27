
package net.mcreator.allaboutengie.world.inventory;

import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.ItemStackHandler;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.core.BlockPos;

import net.mcreator.allaboutengie.init.AllaboutengieModMenus;

import java.util.function.Supplier;
import java.util.Map;
import java.util.HashMap;

public class OutragedEngieBundleUIMenu extends AbstractContainerMenu implements Supplier<Map<Integer, Slot>> {
	public final static HashMap<String, Object> guistate = new HashMap<>();
	public final Level world;
	public final Player entity;
	public int x, y, z;
	private ContainerLevelAccess access = ContainerLevelAccess.NULL;
	private IItemHandler internal;
	private final Map<Integer, Slot> customSlots = new HashMap<>();
	private boolean bound = false;
	private Supplier<Boolean> boundItemMatcher = null;
	private Entity boundEntity = null;
	private BlockEntity boundBlockEntity = null;

	public OutragedEngieBundleUIMenu(int id, Inventory inv, FriendlyByteBuf extraData) {
		super(AllaboutengieModMenus.OUTRAGED_ENGIE_BUNDLE_UI.get(), id);
		this.entity = inv.player;
		this.world = inv.player.level;
		this.internal = new ItemStackHandler(80);
		BlockPos pos = null;
		if (extraData != null) {
			pos = extraData.readBlockPos();
			this.x = pos.getX();
			this.y = pos.getY();
			this.z = pos.getZ();
			access = ContainerLevelAccess.create(world, pos);
		}
		if (pos != null) {
			if (extraData.readableBytes() == 1) { // bound to item
				byte hand = extraData.readByte();
				ItemStack itemstack = hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem();
				this.boundItemMatcher = () -> itemstack == (hand == 0 ? this.entity.getMainHandItem() : this.entity.getOffhandItem());
				itemstack.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
					this.internal = capability;
					this.bound = true;
				});
			} else if (extraData.readableBytes() > 1) { // bound to entity
				extraData.readByte(); // drop padding
				boundEntity = world.getEntity(extraData.readVarInt());
				if (boundEntity != null)
					boundEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			} else { // might be bound to block
				boundBlockEntity = this.world.getBlockEntity(pos);
				if (boundBlockEntity != null)
					boundBlockEntity.getCapability(ForgeCapabilities.ITEM_HANDLER, null).ifPresent(capability -> {
						this.internal = capability;
						this.bound = true;
					});
			}
		}
		this.customSlots.put(0, this.addSlot(new SlotItemHandler(internal, 0, 7, 46) {
			private final int slot = 0;
		}));
		this.customSlots.put(1, this.addSlot(new SlotItemHandler(internal, 1, 25, 46) {
			private final int slot = 1;
		}));
		this.customSlots.put(2, this.addSlot(new SlotItemHandler(internal, 2, 43, 46) {
			private final int slot = 2;
		}));
		this.customSlots.put(3, this.addSlot(new SlotItemHandler(internal, 3, 61, 46) {
			private final int slot = 3;
		}));
		this.customSlots.put(4, this.addSlot(new SlotItemHandler(internal, 4, 79, 46) {
			private final int slot = 4;
		}));
		this.customSlots.put(5, this.addSlot(new SlotItemHandler(internal, 5, 97, 46) {
			private final int slot = 5;
		}));
		this.customSlots.put(6, this.addSlot(new SlotItemHandler(internal, 6, 115, 46) {
			private final int slot = 6;
		}));
		this.customSlots.put(7, this.addSlot(new SlotItemHandler(internal, 7, 133, 46) {
			private final int slot = 7;
		}));
		this.customSlots.put(8, this.addSlot(new SlotItemHandler(internal, 8, 151, 46) {
			private final int slot = 8;
		}));
		this.customSlots.put(9, this.addSlot(new SlotItemHandler(internal, 9, 169, 46) {
			private final int slot = 9;
		}));
		this.customSlots.put(10, this.addSlot(new SlotItemHandler(internal, 10, 187, 46) {
			private final int slot = 10;
		}));
		this.customSlots.put(11, this.addSlot(new SlotItemHandler(internal, 11, 205, 46) {
			private final int slot = 11;
		}));
		this.customSlots.put(12, this.addSlot(new SlotItemHandler(internal, 12, 223, 46) {
			private final int slot = 12;
		}));
		this.customSlots.put(13, this.addSlot(new SlotItemHandler(internal, 13, 241, 46) {
			private final int slot = 13;
		}));
		this.customSlots.put(14, this.addSlot(new SlotItemHandler(internal, 14, 259, 46) {
			private final int slot = 14;
		}));
		this.customSlots.put(15, this.addSlot(new SlotItemHandler(internal, 15, 277, 46) {
			private final int slot = 15;
		}));
		this.customSlots.put(16, this.addSlot(new SlotItemHandler(internal, 16, 7, 64) {
			private final int slot = 16;
		}));
		this.customSlots.put(17, this.addSlot(new SlotItemHandler(internal, 17, 25, 64) {
			private final int slot = 17;
		}));
		this.customSlots.put(18, this.addSlot(new SlotItemHandler(internal, 18, 43, 64) {
			private final int slot = 18;
		}));
		this.customSlots.put(19, this.addSlot(new SlotItemHandler(internal, 19, 61, 64) {
			private final int slot = 19;
		}));
		this.customSlots.put(20, this.addSlot(new SlotItemHandler(internal, 20, 79, 64) {
			private final int slot = 20;
		}));
		this.customSlots.put(21, this.addSlot(new SlotItemHandler(internal, 21, 97, 64) {
			private final int slot = 21;
		}));
		this.customSlots.put(22, this.addSlot(new SlotItemHandler(internal, 22, 115, 64) {
			private final int slot = 22;
		}));
		this.customSlots.put(23, this.addSlot(new SlotItemHandler(internal, 23, 133, 64) {
			private final int slot = 23;
		}));
		this.customSlots.put(24, this.addSlot(new SlotItemHandler(internal, 24, 151, 64) {
			private final int slot = 24;
		}));
		this.customSlots.put(25, this.addSlot(new SlotItemHandler(internal, 25, 169, 64) {
			private final int slot = 25;
		}));
		this.customSlots.put(26, this.addSlot(new SlotItemHandler(internal, 26, 187, 64) {
			private final int slot = 26;
		}));
		this.customSlots.put(27, this.addSlot(new SlotItemHandler(internal, 27, 205, 64) {
			private final int slot = 27;
		}));
		this.customSlots.put(28, this.addSlot(new SlotItemHandler(internal, 28, 223, 64) {
			private final int slot = 28;
		}));
		this.customSlots.put(29, this.addSlot(new SlotItemHandler(internal, 29, 241, 64) {
			private final int slot = 29;
		}));
		this.customSlots.put(30, this.addSlot(new SlotItemHandler(internal, 30, 259, 64) {
			private final int slot = 30;
		}));
		this.customSlots.put(31, this.addSlot(new SlotItemHandler(internal, 31, 277, 64) {
			private final int slot = 31;
		}));
		this.customSlots.put(32, this.addSlot(new SlotItemHandler(internal, 32, 7, 82) {
			private final int slot = 32;
		}));
		this.customSlots.put(33, this.addSlot(new SlotItemHandler(internal, 33, 25, 82) {
			private final int slot = 33;
		}));
		this.customSlots.put(34, this.addSlot(new SlotItemHandler(internal, 34, 43, 82) {
			private final int slot = 34;
		}));
		this.customSlots.put(35, this.addSlot(new SlotItemHandler(internal, 35, 61, 82) {
			private final int slot = 35;
		}));
		this.customSlots.put(36, this.addSlot(new SlotItemHandler(internal, 36, 79, 82) {
			private final int slot = 36;
		}));
		this.customSlots.put(37, this.addSlot(new SlotItemHandler(internal, 37, 97, 82) {
			private final int slot = 37;
		}));
		this.customSlots.put(38, this.addSlot(new SlotItemHandler(internal, 38, 115, 82) {
			private final int slot = 38;
		}));
		this.customSlots.put(39, this.addSlot(new SlotItemHandler(internal, 39, 133, 82) {
			private final int slot = 39;
		}));
		this.customSlots.put(40, this.addSlot(new SlotItemHandler(internal, 40, 151, 82) {
			private final int slot = 40;
		}));
		this.customSlots.put(41, this.addSlot(new SlotItemHandler(internal, 41, 169, 82) {
			private final int slot = 41;
		}));
		this.customSlots.put(42, this.addSlot(new SlotItemHandler(internal, 42, 187, 82) {
			private final int slot = 42;
		}));
		this.customSlots.put(43, this.addSlot(new SlotItemHandler(internal, 43, 205, 82) {
			private final int slot = 43;
		}));
		this.customSlots.put(44, this.addSlot(new SlotItemHandler(internal, 44, 223, 82) {
			private final int slot = 44;
		}));
		this.customSlots.put(45, this.addSlot(new SlotItemHandler(internal, 45, 241, 82) {
			private final int slot = 45;
		}));
		this.customSlots.put(46, this.addSlot(new SlotItemHandler(internal, 46, 259, 82) {
			private final int slot = 46;
		}));
		this.customSlots.put(47, this.addSlot(new SlotItemHandler(internal, 47, 277, 82) {
			private final int slot = 47;
		}));
		this.customSlots.put(48, this.addSlot(new SlotItemHandler(internal, 48, 7, 100) {
			private final int slot = 48;
		}));
		this.customSlots.put(49, this.addSlot(new SlotItemHandler(internal, 49, 25, 100) {
			private final int slot = 49;
		}));
		this.customSlots.put(50, this.addSlot(new SlotItemHandler(internal, 50, 43, 100) {
			private final int slot = 50;
		}));
		this.customSlots.put(51, this.addSlot(new SlotItemHandler(internal, 51, 61, 100) {
			private final int slot = 51;
		}));
		this.customSlots.put(52, this.addSlot(new SlotItemHandler(internal, 52, 79, 100) {
			private final int slot = 52;
		}));
		this.customSlots.put(53, this.addSlot(new SlotItemHandler(internal, 53, 97, 100) {
			private final int slot = 53;
		}));
		this.customSlots.put(54, this.addSlot(new SlotItemHandler(internal, 54, 115, 100) {
			private final int slot = 54;
		}));
		this.customSlots.put(55, this.addSlot(new SlotItemHandler(internal, 55, 133, 100) {
			private final int slot = 55;
		}));
		this.customSlots.put(56, this.addSlot(new SlotItemHandler(internal, 56, 151, 100) {
			private final int slot = 56;
		}));
		this.customSlots.put(57, this.addSlot(new SlotItemHandler(internal, 57, 169, 100) {
			private final int slot = 57;
		}));
		this.customSlots.put(58, this.addSlot(new SlotItemHandler(internal, 58, 187, 100) {
			private final int slot = 58;
		}));
		this.customSlots.put(59, this.addSlot(new SlotItemHandler(internal, 59, 205, 100) {
			private final int slot = 59;
		}));
		this.customSlots.put(60, this.addSlot(new SlotItemHandler(internal, 60, 223, 100) {
			private final int slot = 60;
		}));
		this.customSlots.put(61, this.addSlot(new SlotItemHandler(internal, 61, 241, 100) {
			private final int slot = 61;
		}));
		this.customSlots.put(62, this.addSlot(new SlotItemHandler(internal, 62, 259, 100) {
			private final int slot = 62;
		}));
		this.customSlots.put(63, this.addSlot(new SlotItemHandler(internal, 63, 277, 100) {
			private final int slot = 63;
		}));
		this.customSlots.put(64, this.addSlot(new SlotItemHandler(internal, 64, 7, 118) {
			private final int slot = 64;
		}));
		this.customSlots.put(65, this.addSlot(new SlotItemHandler(internal, 65, 25, 118) {
			private final int slot = 65;
		}));
		this.customSlots.put(66, this.addSlot(new SlotItemHandler(internal, 66, 43, 118) {
			private final int slot = 66;
		}));
		this.customSlots.put(67, this.addSlot(new SlotItemHandler(internal, 67, 61, 118) {
			private final int slot = 67;
		}));
		this.customSlots.put(68, this.addSlot(new SlotItemHandler(internal, 68, 79, 118) {
			private final int slot = 68;
		}));
		this.customSlots.put(69, this.addSlot(new SlotItemHandler(internal, 69, 97, 118) {
			private final int slot = 69;
		}));
		this.customSlots.put(70, this.addSlot(new SlotItemHandler(internal, 70, 115, 118) {
			private final int slot = 70;
		}));
		this.customSlots.put(71, this.addSlot(new SlotItemHandler(internal, 71, 133, 118) {
			private final int slot = 71;
		}));
		this.customSlots.put(72, this.addSlot(new SlotItemHandler(internal, 72, 151, 118) {
			private final int slot = 72;
		}));
		this.customSlots.put(73, this.addSlot(new SlotItemHandler(internal, 73, 169, 118) {
			private final int slot = 73;
		}));
		this.customSlots.put(74, this.addSlot(new SlotItemHandler(internal, 74, 187, 118) {
			private final int slot = 74;
		}));
		this.customSlots.put(75, this.addSlot(new SlotItemHandler(internal, 75, 205, 118) {
			private final int slot = 75;
		}));
		this.customSlots.put(76, this.addSlot(new SlotItemHandler(internal, 76, 223, 118) {
			private final int slot = 76;
		}));
		this.customSlots.put(77, this.addSlot(new SlotItemHandler(internal, 77, 241, 118) {
			private final int slot = 77;
		}));
		this.customSlots.put(78, this.addSlot(new SlotItemHandler(internal, 78, 259, 118) {
			private final int slot = 78;
		}));
		this.customSlots.put(79, this.addSlot(new SlotItemHandler(internal, 79, 277, 118) {
			private final int slot = 79;
		}));
		for (int si = 0; si < 3; ++si)
			for (int sj = 0; sj < 9; ++sj)
				this.addSlot(new Slot(inv, sj + (si + 1) * 9, 62 + 8 + sj * 18, 52 + 84 + si * 18));
		for (int si = 0; si < 9; ++si)
			this.addSlot(new Slot(inv, si, 62 + 8 + si * 18, 52 + 142));
	}

	@Override
	public boolean stillValid(Player player) {
		if (this.bound) {
			if (this.boundItemMatcher != null)
				return this.boundItemMatcher.get();
			else if (this.boundBlockEntity != null)
				return AbstractContainerMenu.stillValid(this.access, player, this.boundBlockEntity.getBlockState().getBlock());
			else if (this.boundEntity != null)
				return this.boundEntity.isAlive();
		}
		return true;
	}

	@Override
	public ItemStack quickMoveStack(Player playerIn, int index) {
		ItemStack itemstack = ItemStack.EMPTY;
		Slot slot = (Slot) this.slots.get(index);
		if (slot != null && slot.hasItem()) {
			ItemStack itemstack1 = slot.getItem();
			itemstack = itemstack1.copy();
			if (index < 80) {
				if (!this.moveItemStackTo(itemstack1, 80, this.slots.size(), true))
					return ItemStack.EMPTY;
				slot.onQuickCraft(itemstack1, itemstack);
			} else if (!this.moveItemStackTo(itemstack1, 0, 80, false)) {
				if (index < 80 + 27) {
					if (!this.moveItemStackTo(itemstack1, 80 + 27, this.slots.size(), true))
						return ItemStack.EMPTY;
				} else {
					if (!this.moveItemStackTo(itemstack1, 80, 80 + 27, false))
						return ItemStack.EMPTY;
				}
				return ItemStack.EMPTY;
			}
			if (itemstack1.getCount() == 0)
				slot.set(ItemStack.EMPTY);
			else
				slot.setChanged();
			if (itemstack1.getCount() == itemstack.getCount())
				return ItemStack.EMPTY;
			slot.onTake(playerIn, itemstack1);
		}
		return itemstack;
	}

	@Override
	protected boolean moveItemStackTo(ItemStack p_38904_, int p_38905_, int p_38906_, boolean p_38907_) {
		boolean flag = false;
		int i = p_38905_;
		if (p_38907_) {
			i = p_38906_ - 1;
		}
		if (p_38904_.isStackable()) {
			while (!p_38904_.isEmpty()) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot = this.slots.get(i);
				ItemStack itemstack = slot.getItem();
				if (slot.mayPlace(itemstack) && !itemstack.isEmpty() && ItemStack.isSameItemSameTags(p_38904_, itemstack)) {
					int j = itemstack.getCount() + p_38904_.getCount();
					int maxSize = Math.min(slot.getMaxStackSize(), p_38904_.getMaxStackSize());
					if (j <= maxSize) {
						p_38904_.setCount(0);
						itemstack.setCount(j);
						slot.set(itemstack);
						flag = true;
					} else if (itemstack.getCount() < maxSize) {
						p_38904_.shrink(maxSize - itemstack.getCount());
						itemstack.setCount(maxSize);
						slot.set(itemstack);
						flag = true;
					}
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		if (!p_38904_.isEmpty()) {
			if (p_38907_) {
				i = p_38906_ - 1;
			} else {
				i = p_38905_;
			}
			while (true) {
				if (p_38907_) {
					if (i < p_38905_) {
						break;
					}
				} else if (i >= p_38906_) {
					break;
				}
				Slot slot1 = this.slots.get(i);
				ItemStack itemstack1 = slot1.getItem();
				if (itemstack1.isEmpty() && slot1.mayPlace(p_38904_)) {
					if (p_38904_.getCount() > slot1.getMaxStackSize()) {
						slot1.set(p_38904_.split(slot1.getMaxStackSize()));
					} else {
						slot1.set(p_38904_.split(p_38904_.getCount()));
					}
					slot1.setChanged();
					flag = true;
					break;
				}
				if (p_38907_) {
					--i;
				} else {
					++i;
				}
			}
		}
		return flag;
	}

	@Override
	public void removed(Player playerIn) {
		super.removed(playerIn);
		if (!bound && playerIn instanceof ServerPlayer serverPlayer) {
			if (!serverPlayer.isAlive() || serverPlayer.hasDisconnected()) {
				for (int j = 0; j < internal.getSlots(); ++j) {
					playerIn.drop(internal.extractItem(j, internal.getStackInSlot(j).getCount(), false), false);
				}
			} else {
				for (int i = 0; i < internal.getSlots(); ++i) {
					playerIn.getInventory().placeItemBackInInventory(internal.extractItem(i, internal.getStackInSlot(i).getCount(), false));
				}
			}
		}
	}

	public Map<Integer, Slot> get() {
		return customSlots;
	}
}
