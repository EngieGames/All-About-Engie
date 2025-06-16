
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.DDayLightningSpawnerEntity;
import net.mcreator.allaboutengie.client.model.Modelmissilebombs;

public class DDayLightningSpawnerRenderer extends MobRenderer<DDayLightningSpawnerEntity, Modelmissilebombs<DDayLightningSpawnerEntity>> {
	public DDayLightningSpawnerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelmissilebombs(context.bakeLayer(Modelmissilebombs.LAYER_LOCATION)), 0f);
	}

	@Override
	public ResourceLocation getTextureLocation(DDayLightningSpawnerEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/lightningspawner.png");
	}
}
