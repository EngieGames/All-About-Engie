
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoSleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigEngieSharkoSleepRenderer extends MobRenderer<BigEngieSharkoSleepEntity, Modelbigboyotired<BigEngieSharkoSleepEntity>> {
	public BigEngieSharkoSleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoSleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigengiesharkonewtamedtired.png");
	}
}
