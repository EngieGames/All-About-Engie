
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.MythicSharkoEntity;
import net.mcreator.allaboutengie.client.model.Modelboyo;

public class MythicSharkoRenderer extends MobRenderer<MythicSharkoEntity, Modelboyo<MythicSharkoEntity>> {
	public MythicSharkoRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelboyo(context.bakeLayer(Modelboyo.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(MythicSharkoEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/boyomy.png");
	}
}
