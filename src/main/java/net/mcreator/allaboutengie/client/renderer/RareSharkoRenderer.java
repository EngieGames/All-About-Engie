
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.RareSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class RareSharkoRenderer extends MobRenderer<RareSharkoEntity, Modelboyo<RareSharkoEntity>> {
	public RareSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/raresharkonew.png");
	}
}
