
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEngieSharkoRare2Entity;
import net.mcreator.allaboutengie.client.model.Modelbigboyo;

public class BigEngieSharkoRare2Renderer extends MobRenderer<BigEngieSharkoRare2Entity, Modelbigboyo<BigEngieSharkoRare2Entity>> {
	public BigEngieSharkoRare2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyo(context.bakeLayer(Modelbigboyo.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEngieSharkoRare2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2new.png");
	}
}
