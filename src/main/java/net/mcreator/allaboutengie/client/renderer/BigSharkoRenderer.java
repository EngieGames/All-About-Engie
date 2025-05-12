
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigSharkoRenderer extends MobRenderer<BigSharkoEntity, Modelbigboyo<BigSharkoEntity>> {
	public BigSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/sharkonew.png");
	}
}
