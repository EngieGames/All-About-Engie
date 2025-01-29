
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.LouisSleepEntity;
import net.mcreator.allaboutengie.client.model.Modeltobyzoomtired;

public class LouisSleepRenderer extends MobRenderer<LouisSleepEntity, Modeltobyzoomtired<LouisSleepEntity>> {
	public LouisSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modeltobyzoomtired(context.bakeLayer(Modeltobyzoomtired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(LouisSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/louistired.png");
	}
}
