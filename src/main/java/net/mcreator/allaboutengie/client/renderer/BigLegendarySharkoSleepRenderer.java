
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigLegendarySharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigLegendarySharkoSleepRenderer extends MobRenderer<BigLegendarySharkoSleepEntity, Modelbigboyotired<BigLegendarySharkoSleepEntity>> {
	public BigLegendarySharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigLegendarySharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/biglegendarysharkonewtamedtired.png");
	}
}
