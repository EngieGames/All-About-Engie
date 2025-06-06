
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.SpikeSpawnerEntity;
import net.mcreator.allaboutengie.client.model.Modelmissilebombs;

public class SpikeSpawnerRenderer extends MobRenderer<SpikeSpawnerEntity, Modelmissilebombs<SpikeSpawnerEntity>> {
	public SpikeSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpikeSpawnerEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/spiketemp.png");
	}
}
