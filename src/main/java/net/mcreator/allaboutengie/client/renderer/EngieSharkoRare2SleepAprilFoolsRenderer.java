
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2SleepAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfoolssit;

public class EngieSharkoRare2SleepAprilFoolsRenderer extends MobRenderer<EngieSharkoRare2SleepAprilFoolsEntity, Modelboyoaprilfoolssit<EngieSharkoRare2SleepAprilFoolsEntity>> {
	public EngieSharkoRare2SleepAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfoolssit(context.bakeLayer(Modelboyoaprilfoolssit.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2SleepAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare2aprilfirstt.png");
	}
}
