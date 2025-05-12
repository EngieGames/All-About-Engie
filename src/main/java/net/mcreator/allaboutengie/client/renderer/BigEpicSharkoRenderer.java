
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEpicSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEpicSharkoRenderer extends MobRenderer<BigEpicSharkoEntity, Modelbigboyo<BigEpicSharkoEntity>> {
	public BigEpicSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEpicSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigepicsharkonew.png");
	}
}
