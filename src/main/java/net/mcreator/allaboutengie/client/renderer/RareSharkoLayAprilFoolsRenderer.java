
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.RareSharkoLayAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfoolssit;

public class RareSharkoLayAprilFoolsRenderer extends MobRenderer<RareSharkoLayAprilFoolsEntity, Modelboyoaprilfoolssit<RareSharkoLayAprilFoolsEntity>> {
	public RareSharkoLayAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RareSharkoLayAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/rareboyoaprilfirstt.png");
	}
}
