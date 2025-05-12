
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEngieSharkoRare2TamedRenderer extends MobRenderer<BigEngieSharkoRare2TamedEntity, Modelbigboyo<BigEngieSharkoRare2TamedEntity>> {
	public BigEngieSharkoRare2TamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoRare2TamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigrareengiesharko2newtamed.png");
	}
}
