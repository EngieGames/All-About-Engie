
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigAlbinoSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigAlbinoSharkoTamedRenderer extends MobRenderer<BigAlbinoSharkoTamedEntity, Modelbigboyo<BigAlbinoSharkoTamedEntity>> {
	public BigAlbinoSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigAlbinoSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigalbinosharkonewtamed.png");
	}
}
