
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigRareSharkoRenderer extends MobRenderer<BigRareSharkoEntity, Modelbigboyo<BigRareSharkoEntity>> {
	public BigRareSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/bigraresharkonew.png");
	}
}
