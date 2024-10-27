
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigRareEngieSharko2Entity;
import net.mcreator.allaboutengie.client.model.Modelbboyo;

public class BigRareEngieSharko2Renderer extends MobRenderer<BigRareEngieSharko2Entity, Modelbboyo<BigRareEngieSharko2Entity>> {
	public BigRareEngieSharko2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbboyo(context.bakeLayer(Modelbboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigRareEngieSharko2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/re2bboyo.png");
	}
}
