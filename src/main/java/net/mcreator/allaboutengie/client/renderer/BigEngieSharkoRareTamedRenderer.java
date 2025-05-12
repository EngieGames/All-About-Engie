
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoRareTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEngieSharkoRareTamedRenderer extends MobRenderer<BigEngieSharkoRareTamedEntity, Modelbigboyo<BigEngieSharkoRareTamedEntity>> {
	public BigEngieSharkoRareTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoRareTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharkonewtamed.png");
	}
}
