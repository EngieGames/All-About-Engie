
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEpicSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEpicSharkoTamedRenderer extends MobRenderer<BigEpicSharkoTamedEntity, Modelbigboyo<BigEpicSharkoTamedEntity>> {
	public BigEpicSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEpicSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicsharkonewtamed.png");
	}
}
