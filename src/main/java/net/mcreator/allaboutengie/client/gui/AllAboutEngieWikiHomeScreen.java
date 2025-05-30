package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.AllAboutEngieWikiHomeMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AllAboutEngieWikiHomeScreen extends AbstractContainerScreen<AllAboutEngieWikiHomeMenu> {
	private final static HashMap<String, Object> guistate = AllAboutEngieWikiHomeMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_hostile_mobs;
	Button button_passive_mobs;
	Button button_tools;
	Button button_weapons;
	Button button_armor;
	Button button_items;

	public AllAboutEngieWikiHomeScreen(AllAboutEngieWikiHomeMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void render(PoseStack ms, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(ms);
		super.render(ms, mouseX, mouseY, partialTicks);
		this.renderTooltip(ms, mouseX, mouseY);
	}

	@Override
	protected void renderBg(PoseStack ms, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(PoseStack poseStack, int mouseX, int mouseY) {
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.label_about"), -104, -37, -171);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.label_all1"), -125, -37, -11141291);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.label_engie"), -73, -37, -43691);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.label_wiki"), -42, -37, -1);
	}

	@Override
	public void onClose() {
		super.onClose();
		Minecraft.getInstance().keyboardHandler.setSendRepeatsToGui(false);
	}

	@Override
	public void init() {
		super.init();
		this.minecraft.keyboardHandler.setSendRepeatsToGui(true);
		button_hostile_mobs = new Button(this.leftPos + -125, this.topPos + -26, 87, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.button_hostile_mobs"), e -> {
		});
		guistate.put("button:button_hostile_mobs", button_hostile_mobs);
		this.addRenderableWidget(button_hostile_mobs);
		button_passive_mobs = new Button(this.leftPos + -125, this.topPos + -6, 87, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.button_passive_mobs"), e -> {
		});
		guistate.put("button:button_passive_mobs", button_passive_mobs);
		this.addRenderableWidget(button_passive_mobs);
		button_tools = new Button(this.leftPos + -125, this.topPos + 54, 51, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.button_tools"), e -> {
		});
		guistate.put("button:button_tools", button_tools);
		this.addRenderableWidget(button_tools);
		button_weapons = new Button(this.leftPos + -125, this.topPos + 14, 61, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.button_weapons"), e -> {
		});
		guistate.put("button:button_weapons", button_weapons);
		this.addRenderableWidget(button_weapons);
		button_armor = new Button(this.leftPos + -125, this.topPos + 34, 51, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.button_armor"), e -> {
		});
		guistate.put("button:button_armor", button_armor);
		this.addRenderableWidget(button_armor);
		button_items = new Button(this.leftPos + -125, this.topPos + 74, 51, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_home.button_items"), e -> {
		});
		guistate.put("button:button_items", button_items);
		this.addRenderableWidget(button_items);
	}
}
