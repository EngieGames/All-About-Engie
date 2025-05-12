
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigRareSharkoSleepRenderer extends MobRenderer<BigRareSharkoSleepEntity, Modelbigboyotired<BigRareSharkoSleepEntity>> {
	public BigRareSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigraresharkonewtamedtired.png");
	}
}
