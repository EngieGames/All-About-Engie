
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2SleepEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyotired;

public class BigEngieSharkoRare2SleepRenderer extends MobRenderer<BigEngieSharkoRare2SleepEntity, Modelbigboyotired<BigEngieSharkoRare2SleepEntity>> {
	public BigEngieSharkoRare2SleepRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyotired(context.bakeLayer(Modelbigboyotired.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoRare2SleepEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigrareengiesharko2newtamedtired.png");
	}
}
