
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRareSleepAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfoolssleep;

public class EngieSharkoRareSleepAprilFoolsRenderer extends MobRenderer<EngieSharkoRareSleepAprilFoolsEntity, Modelboyoaprilfoolssleep<EngieSharkoRareSleepAprilFoolsEntity>> {
	public EngieSharkoRareSleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssleep(context.bakeLayer(Modelboyoaprilfoolssleep.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRareSleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare1aprilfirsttsleep.png");
	}
}
