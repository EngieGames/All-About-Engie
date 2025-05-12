
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigExoticSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class BigExoticSharkoRenderer extends MobRenderer<BigExoticSharkoEntity, Modelboyo<BigExoticSharkoEntity>> {
	public BigExoticSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigExoticSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/exoticsharkonew.png");
	}
}
