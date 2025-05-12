
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigAlbinoSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigAlbinoSharkoRenderer extends MobRenderer<BigAlbinoSharkoEntity, Modelbigboyo<BigAlbinoSharkoEntity>> {
	public BigAlbinoSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigAlbinoSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigalbinosharkonew.png");
	}
}
