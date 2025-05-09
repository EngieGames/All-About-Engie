
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelboyotired;

public class ExoticSharkoSleepRenderer extends MobRenderer<ExoticSharkoSleepEntity, Modelboyotired<ExoticSharkoSleepEntity>> {
	public ExoticSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyotired(context.bakeLayer(Modelboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExoticSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/exoticsharkonewtamedtired.png");
	}
}
