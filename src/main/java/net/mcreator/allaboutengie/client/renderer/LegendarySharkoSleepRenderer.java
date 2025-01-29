
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.LegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelboyotired;

public class LegendarySharkoSleepRenderer extends MobRenderer<LegendarySharkoSleepEntity, Modelboyotired<LegendarySharkoSleepEntity>> {
	public LegendarySharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyotired(context.bakeLayer(Modelboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LegendarySharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/legendarysharkonewtamedtired.png");
	}
}
