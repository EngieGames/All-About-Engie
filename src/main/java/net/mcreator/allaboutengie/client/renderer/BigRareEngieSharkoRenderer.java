
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareEngieSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelbboyo;

public class BigRareEngieSharkoRenderer extends MobRenderer<BigRareEngieSharkoEntity, Modelbboyo<BigRareEngieSharkoEntity>> {
	public BigRareEngieSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareEngieSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rebboyo.png");
	}
}
