
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigExoticSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigExoticSharkoTamedRenderer extends MobRenderer<BigExoticSharkoTamedEntity, Modelbigboyo<BigExoticSharkoTamedEntity>> {
	public BigExoticSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigExoticSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigexoticsharkonewtamed.png");
	}
}
