
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2Entity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class EngieSharkoRare2Renderer extends MobRenderer<EngieSharkoRare2Entity, Modelboyo<EngieSharkoRare2Entity>> {
	public EngieSharkoRare2Renderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2Entity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareengiesharko2new.png");
	}
}
