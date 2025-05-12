
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigRareSharkoTamedRenderer extends MobRenderer<BigRareSharkoTamedEntity, Modelbigboyo<BigRareSharkoTamedEntity>> {
	public BigRareSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigraresharkonewtamed.png");
	}
}
