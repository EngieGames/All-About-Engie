
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigSharkoSleepRenderer extends MobRenderer<BigSharkoSleepEntity, Modelbigboyotired<BigSharkoSleepEntity>> {
	public BigSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigsharkonewtamedtired.png");
	}
}
