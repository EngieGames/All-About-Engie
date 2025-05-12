
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigMythicSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigMythicSharkoSleepRenderer extends MobRenderer<BigMythicSharkoSleepEntity, Modelbigboyotired<BigMythicSharkoSleepEntity>> {
	public BigMythicSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigmythicsharkonewtamedtired.png");
	}
}
