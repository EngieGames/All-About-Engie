
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2AprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfools;

public class EngieSharkoRare2AprilFoolsRenderer extends MobRenderer<EngieSharkoRare2AprilFoolsEntity, Modelboyoaprilfools<EngieSharkoRare2AprilFoolsEntity>> {
	public EngieSharkoRare2AprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2AprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare2aprilfirst.png");
	}
}
