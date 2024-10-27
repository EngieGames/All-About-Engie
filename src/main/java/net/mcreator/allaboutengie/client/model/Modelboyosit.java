package net.mcreator.allaboutengie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelboyosit<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelboyosit"), "main");
	public final ModelPart body;
	public final ModelPart head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelboyosit(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 15.3F, 0.0F, 1.8326F, 0.0F, 0.0F));
		PartDefinition backfinst_r1 = body.addOrReplaceChild("backfinst_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -2.5F, -2.5F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 1)
				.addBox(-0.5F, -1.5F, -3.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-0.5F, -0.5F, -4.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.8326F, 0.0F, 0.0F));
		PartDefinition backfinsb_r1 = body.addOrReplaceChild("backfinsb_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-0.5F, -4.0852F, 8.147F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 1)
				.addBox(-0.5F, -3.0852F, 7.147F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-0.5F, -2.0852F, 6.147F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, -5.0F, -1.8326F, 0.0F, 0.0F));
		PartDefinition tailbackfinstbw_r1 = body.addOrReplaceChild("tailbackfinstbw_r1",
				CubeListBuilder.create().texOffs(19, 22).addBox(-0.5525F, -2.3694F, 1.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(23, 22).addBox(-0.5525F, -4.3694F, -0.6395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
						.texOffs(23, 22).addBox(-0.5525F, 2.6306F, -0.6395F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(19, 22).addBox(-0.5525F, 0.6306F, 1.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 40)
						.addBox(-0.5525F, -2.3694F, 0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(26, 40).addBox(-0.5525F, 0.6306F, 0.3605F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 28)
						.addBox(-0.5525F, -3.3694F, -1.6466F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 31).addBox(-0.5525F, -2.3694F, -2.6366F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0525F, 16.5527F, -8.8862F, -1.8326F, 0.0F, 0.0F));
		PartDefinition tailbackfin_r1 = body.addOrReplaceChild("tailbackfin_r1", CubeListBuilder.create().texOffs(28, 22).addBox(-0.5F, -4.4F, -2.5F, 1.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 16.4111F, -8.8672F, -1.8326F, 0.0F, 0.0F));
		PartDefinition tail_r1 = body.addOrReplaceChild("tail_r1", CubeListBuilder.create().texOffs(0, 52).addBox(-1.5F, -15.5852F, 5.147F, 3.0F, 3.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -2.5F, -18.0F, -1.8326F, 0.0F, 0.0F));
		PartDefinition body_r1 = body.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 27).addBox(-5.0F, -21.5F, -10.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 13.0F, -2.0F, -0.2618F, 0.0F, 0.0F));
		PartDefinition head = partdefinition.addOrReplaceChild("head",
				CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(32, 0).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(24, 37)
						.addBox(-7.0F, -5.6F, -11.5F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(27, 39).addBox(-6.0F, -6.1F, -10.5F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 26)
						.addBox(-5.0F, -6.6F, -9.5F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 28).addBox(-4.0F, -7.1F, -8.5F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(30, 57)
						.addBox(-3.0F, -7.6F, -7.5F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(18, 53).addBox(-2.0F, -8.1F, -6.5F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(20, 61)
						.addBox(-1.0F, -8.6F, -5.5F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 18.0F, -5.5F));
		PartDefinition HeadFin_r1 = head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(64, 13).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.5F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(64, 8).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.5F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition Ears_r1 = head.addOrReplaceChild("Ears_r1", CubeListBuilder.create().texOffs(0, 4).addBox(2.2F, -10.2F, -8.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, 0.0F, 0.0F, 0.0524F));
		PartDefinition Ears_r2 = head.addOrReplaceChild("Ears_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-4.2F, -10.2F, -8.1F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 2.0F, -0.5F, 0.0F, 0.0F, -0.0524F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, -1.0F, -3.2F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 53).mirror()
				.addBox(-2.0F, -1.0F, -3.2F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-4.0F, 23.0F, 5.2F, -1.5708F, 0.5672F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -1.0F, -3.2F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 53).addBox(-2.0F, -1.0F, -3.2F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(4.0F, 23.0F, 5.2F, -1.5708F, -0.5672F, 0.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(0, 16).mirror().addBox(-2.0F, -1.0F, 1.9F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(64, 53).mirror()
				.addBox(-2.0F, -1.0F, 1.9F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(-3.9F, 18.0F, -5.7F, -1.5708F, 0.5672F, 0.0F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(0, 16).addBox(-2.0F, -1.0F, 1.9F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(64, 53).addBox(-2.0F, -1.0F, 1.9F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.1F)),
				PartPose.offsetAndRotation(3.9F, 18.0F, -5.7F, -1.5708F, -0.5672F, 0.0F));
		return LayerDefinition.create(meshdefinition, 80, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.head.xRot = headPitch / (180F / (float) Math.PI);
	}
}
