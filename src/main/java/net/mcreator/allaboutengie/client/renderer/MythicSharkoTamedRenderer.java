
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MythicSharkoTamedEntity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class MythicSharkoTamedRenderer extends MobRenderer<MythicSharkoTamedEntity, Modelboyo<MythicSharkoTamedEntity>> {
	public MythicSharkoTamedRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoTamedEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/boyomyt.png");
	}
}
