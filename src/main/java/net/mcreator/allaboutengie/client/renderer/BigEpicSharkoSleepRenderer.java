
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEpicSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigEpicSharkoSleepRenderer extends MobRenderer<BigEpicSharkoSleepEntity, Modelbigboyotired<BigEpicSharkoSleepEntity>> {
	public BigEpicSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEpicSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicsharkonewtamedtired.png");
	}
}
