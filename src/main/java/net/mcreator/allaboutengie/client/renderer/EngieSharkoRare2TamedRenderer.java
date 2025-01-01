
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedEntity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class EngieSharkoRare2TamedRenderer extends MobRenderer<EngieSharkoRare2TamedEntity, Modelboyo<EngieSharkoRare2TamedEntity>> {
	public EngieSharkoRare2TamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2TamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2newtamed.png");
	}
}
