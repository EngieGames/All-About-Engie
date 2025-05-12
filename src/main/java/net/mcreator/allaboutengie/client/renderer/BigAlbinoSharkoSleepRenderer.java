
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigAlbinoSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelboyotired;

public class BigAlbinoSharkoSleepRenderer extends MobRenderer<BigAlbinoSharkoSleepEntity, Modelboyotired<BigAlbinoSharkoSleepEntity>> {
	public BigAlbinoSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyotired(context.bakeLayer(Modelboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigAlbinoSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigalbinosharkonewtamedtired.png");
	}
}
