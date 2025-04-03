
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.EngieSharkoRare2TamedAprilFoolsEntity;
import net.mcreator.allaboutengie.client.model.Modelboyoaprilfools;

public class EngieSharkoRare2TamedAprilFoolsRenderer extends MobRenderer<EngieSharkoRare2TamedAprilFoolsEntity, Modelboyoaprilfools<EngieSharkoRare2TamedAprilFoolsEntity>> {
	public EngieSharkoRare2TamedAprilFoolsRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyoaprilfools(context.bakeLayer(Modelboyoaprilfools.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(EngieSharkoRare2TamedAprilFoolsEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/engieboyorare2aprilfirstt.png");
	}
}
