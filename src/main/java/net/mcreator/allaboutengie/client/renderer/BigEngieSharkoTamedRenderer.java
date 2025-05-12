
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEngieSharkoTamedRenderer extends MobRenderer<BigEngieSharkoTamedEntity, Modelbigboyo<BigEngieSharkoTamedEntity>> {
	public BigEngieSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigengiesharkonewtamed.png");
	}
}
