package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.AllAboutEngieWikiPassiveMobsMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AllAboutEngieWikiPassiveMobsScreen extends AbstractContainerScreen<AllAboutEngieWikiPassiveMobsMenu> {
	private final static HashMap<String, Object> guistate = AllAboutEngieWikiPassiveMobsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_sharko;
	Button button_regular;
	Button button_rarity_engies;

	public AllAboutEngieWikiPassiveMobsScreen(AllAboutEngieWikiPassiveMobsMenu container, Inventory inventory, Component text) {
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
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.label_about"), -104, -37, -171);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.label_all1"), -125, -37, -11141291);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.label_engie"), -73, -37, -43691);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.label_wiki"), -42, -37, -1);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.label_hostile_mobs"), -21, -37, -1);
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
		button_sharko = new Button(this.leftPos + -125, this.topPos + -26, 56, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.button_sharko"), e -> {
		});
		guistate.put("button:button_sharko", button_sharko);
		this.addRenderableWidget(button_sharko);
		button_regular = new Button(this.leftPos + -125, this.topPos + -6, 61, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.button_regular"), e -> {
		});
		guistate.put("button:button_regular", button_regular);
		this.addRenderableWidget(button_regular);
		button_rarity_engies = new Button(this.leftPos + -125, this.topPos + 14, 93, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_passive_mobs.button_rarity_engies"), e -> {
		});
		guistate.put("button:button_rarity_engies", button_rarity_engies);
		this.addRenderableWidget(button_rarity_engies);
	}
}
