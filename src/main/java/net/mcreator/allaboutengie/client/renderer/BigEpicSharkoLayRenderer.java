
package net.mcreator.allaboutengie.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.allaboutengie.entity.BigEpicSharkoLayEntity;
import net.mcreator.allaboutengie.client.model.Modelbigboyosit;

public class BigEpicSharkoLayRenderer extends MobRenderer<BigEpicSharkoLayEntity, Modelbigboyosit<BigEpicSharkoLayEntity>> {
	public BigEpicSharkoLayRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelbigboyosit(context.bakeLayer(Modelbigboyosit.LAYER_LOCATION)), 1f);
	}

	@Override
	public ResourceLocation getTextureLocation(BigEpicSharkoLayEntity entity) {
		return new ResourceLocation("allaboutengie:textures/entities/epicsharkonewtamed.png");
	}
}
