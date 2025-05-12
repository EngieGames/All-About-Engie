
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigMythicSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigMythicSharkoRenderer extends MobRenderer<BigMythicSharkoEntity, Modelbigboyo<BigMythicSharkoEntity>> {
	public BigMythicSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigMythicSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/mythicsharkonew.png");
	}
}
