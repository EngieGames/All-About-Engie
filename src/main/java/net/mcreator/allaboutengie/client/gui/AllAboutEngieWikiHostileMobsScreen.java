package net.mcreator.allaboutengie.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.Minecraft;

import net.mcreator.allaboutengie.world.inventory.AllAboutEngieWikiHostileMobsMenu;

import java.util.HashMap;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.systems.RenderSystem;

public class AllAboutEngieWikiHostileMobsScreen extends AbstractContainerScreen<AllAboutEngieWikiHostileMobsMenu> {
	private final static HashMap<String, Object> guistate = AllAboutEngieWikiHostileMobsMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	Button button_mad_engie;
	Button button_angry_engie;
	Button button_enraged_engie;
	Button button_outraged_engie;
	Button button_monstrosity_engie;
	Button button_insanity;
	Button button_pure_insanity;

	public AllAboutEngieWikiHostileMobsScreen(AllAboutEngieWikiHostileMobsMenu container, Inventory inventory, Component text) {
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
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.label_about"), -104, -37, -171);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.label_all1"), -125, -37, -11141291);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.label_engie"), -73, -37, -43691);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.label_wiki"), -42, -37, -1);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.label_hostile_mobs"), -21, -37, -1);
		this.font.draw(poseStack, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.label_challenge_modesuper_doomsday"), -125, 74, -1);
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
		button_mad_engie = new Button(this.leftPos + -125, this.topPos + -26, 72, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_mad_engie"), e -> {
		});
		guistate.put("button:button_mad_engie", button_mad_engie);
		this.addRenderableWidget(button_mad_engie);
		button_angry_engie = new Button(this.leftPos + -125, this.topPos + -6, 82, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_angry_engie"), e -> {
		});
		guistate.put("button:button_angry_engie", button_angry_engie);
		this.addRenderableWidget(button_angry_engie);
		button_enraged_engie = new Button(this.leftPos + -125, this.topPos + 14, 93, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_enraged_engie"), e -> {
		});
		guistate.put("button:button_enraged_engie", button_enraged_engie);
		this.addRenderableWidget(button_enraged_engie);
		button_outraged_engie = new Button(this.leftPos + -125, this.topPos + 34, 98, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_outraged_engie"), e -> {
		});
		guistate.put("button:button_outraged_engie", button_outraged_engie);
		this.addRenderableWidget(button_outraged_engie);
		button_monstrosity_engie = new Button(this.leftPos + -125, this.topPos + 54, 114, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_monstrosity_engie"), e -> {
		});
		guistate.put("button:button_monstrosity_engie", button_monstrosity_engie);
		this.addRenderableWidget(button_monstrosity_engie);
		button_insanity = new Button(this.leftPos + -125, this.topPos + 85, 67, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_insanity"), e -> {
		});
		guistate.put("button:button_insanity", button_insanity);
		this.addRenderableWidget(button_insanity);
		button_pure_insanity = new Button(this.leftPos + -125, this.topPos + 105, 93, 20, Component.translatable("gui.allaboutengie.all_about_engie_wiki_hostile_mobs.button_pure_insanity"), e -> {
		});
		guistate.put("button:button_pure_insanity", button_pure_insanity);
		this.addRenderableWidget(button_pure_insanity);
	}
}
