
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class BigEngieSharkoRenderer extends MobRenderer<BigEngieSharkoEntity, Modelboyo<BigEngieSharkoEntity>> {
	public BigEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigengiesharkonew.png");
	}
}
