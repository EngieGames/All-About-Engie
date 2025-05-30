
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigMythicSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigMythicSharkoTamedRenderer extends MobRenderer<BigMythicSharkoTamedEntity, Modelbigboyo<BigMythicSharkoTamedEntity>> {
	public BigMythicSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigmythicsharkonewtamed.png");
	}
}
