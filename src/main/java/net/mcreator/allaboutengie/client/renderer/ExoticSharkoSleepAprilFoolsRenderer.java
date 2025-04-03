
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.ExoticSharkoSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfoolssleep;

public class ExoticSharkoSleepAprilFoolsRenderer extends MobRenderer<ExoticSharkoSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<ExoticSharkoSleepAprilFoolsEntity>> {
	public ExoticSharkoSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(ExoticSharkoSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/exoticboyoaprilfirsttsleep.png");
	}
}
