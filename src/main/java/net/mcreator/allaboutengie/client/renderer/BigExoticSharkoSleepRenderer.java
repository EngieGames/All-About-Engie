
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigExoticSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigExoticSharkoSleepRenderer extends MobRenderer<BigExoticSharkoSleepEntity, Modelbigboyotired<BigExoticSharkoSleepEntity>> {
	public BigExoticSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigExoticSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigexoticsharkonewtamedtired.png");
	}
}
