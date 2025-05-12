
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigLegendarySharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigLegendarySharkoRenderer extends MobRenderer<BigLegendarySharkoEntity, Modelbigboyo<BigLegendarySharkoEntity>> {
	public BigLegendarySharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigLegendarySharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/biglegendarysharkonew.png");
	}
}
