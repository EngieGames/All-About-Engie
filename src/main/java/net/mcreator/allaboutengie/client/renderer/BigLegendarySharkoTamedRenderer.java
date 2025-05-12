
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigLegendarySharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigLegendarySharkoTamedRenderer extends MobRenderer<BigLegendarySharkoTamedEntity, Modelbigboyo<BigLegendarySharkoTamedEntity>> {
	public BigLegendarySharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigLegendarySharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/biglegendarysharkonewtamed.png");
	}
}
