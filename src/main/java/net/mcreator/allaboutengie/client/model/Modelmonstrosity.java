package net.mcreator.allaboutengie.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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

// Made with Blockbench 4.12.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelmonstrosity<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelmonstrosity"), "main");
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart RightArm;
	public final ModelPart LeftArm;
	public final ModelPart RightLeg;
	public final ModelPart LeftLeg;

	public Modelmonstrosity(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.2F)).texOffs(14, 59)
						.addBox(4.05F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(4.0F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 55)
						.addBox(4.0F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(11, 49).addBox(4.0F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(14, 59)
						.addBox(-5.5F, -5.2F, -1.2F, 1.4F, 2.4F, 2.4F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-5.3F, -6.0F, -2.0F, 1.3F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(22, 55).mirror()
						.addBox(-4.8F, -6.5F, -2.0F, 0.8F, 5.0F, 4.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(11, 49).addBox(-4.8F, -6.0F, -2.5F, 0.8F, 4.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(34, 2)
						.addBox(-4.4F, -8.3F, -1.0F, 0.4F, 2.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 2).addBox(4.0F, -8.3F, -1.0F, 0.4F, 2.7F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -8.4F, -1.0F, 8.0F, 0.4F, 2.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-2.3F, -4.25F, -4.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(1.3F, -4.25F, -4.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(48, 16).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 32).addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(0, 4)
						.addBox(-5.4F, -0.5F, -2.5F, 10.8F, 1.2F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-3.9F, 0.04F, -2.5F, 7.75F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-2.6F, 1.54F, -2.5F, 5.35F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-2.7F, 1.04F, -2.5F, 5.45F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.3F, 0.64F, -2.5F, 6.55F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition ScarfPart_r1 = Body.addOrReplaceChild("ScarfPart_r1",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, -0.5F, -3.0F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.5242F, -0.6027F, 2.1F, 0.0F, 0.0F, -0.3491F));
		PartDefinition ScarfPart_r2 = Body.addOrReplaceChild("ScarfPart_r2",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, 0.0F, -1.4F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, 0.0F, -3.2F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.3242F, -1.3027F, 2.2F, 0.0F, 0.0F, -0.3491F));
		PartDefinition ScarfPart_r3 = Body.addOrReplaceChild("ScarfPart_r3",
				CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, 0.0F, -1.3F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, 0.0F, 0.5F, 0.5F, 0.5F, 1.5F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.4242F, -1.0027F, 0.3F, 0.0F, 0.0F, -0.3491F));
		PartDefinition ScarfPart_r4 = Body.addOrReplaceChild("ScarfPart_r4",
				CubeListBuilder.create().texOffs(0, 4).addBox(0.0F, -0.5F, 0.1F, 0.5F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, -0.5F, 0.1F, 1.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(0.0F, -0.5F, -3.3F, 0.5F, 1.0F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, -0.5F, -3.3F, 1.0F, 0.5F, 0.1F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-0.5F, -0.5F, -3.2F, 1.0F, 1.0F, 1.4F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.9242F, -1.1027F, 2.2F, 0.0F, 0.0F, -0.3491F));
		PartDefinition ScarfPart_r5 = Body.addOrReplaceChild("ScarfPart_r5", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -1.3F, 1.0F, 1.0F, 3.3F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7242F, -0.1027F, 0.3F, 0.0F, 0.0F, -0.3491F));
		PartDefinition ScarfPart_r6 = Body.addOrReplaceChild("ScarfPart_r6", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.8022F, 1.8671F, 0.0F, 0.0F, 0.0F, -0.6283F));
		PartDefinition ScarfPart_r7 = Body.addOrReplaceChild("ScarfPart_r7", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.4022F, 1.3671F, 0.0F, 0.0F, 0.0F, -0.6283F));
		PartDefinition ScarfPart_r8 = Body.addOrReplaceChild("ScarfPart_r8", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5373F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.6758F, 1.8973F, 0.0F, 0.0F, 0.0F, 0.6283F));
		PartDefinition ScarfPart_r9 = Body.addOrReplaceChild("ScarfPart_r9", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.3539F, 1.3671F, 0.0F, 0.0F, 0.0F, 0.6283F));
		PartDefinition ScarfPart_r10 = Body.addOrReplaceChild("ScarfPart_r10", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.9539F, 0.9671F, 0.0F, 0.0F, 0.0F, 0.6283F));
		PartDefinition ScarfPart_r11 = Body.addOrReplaceChild("ScarfPart_r11", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.9022F, 0.9671F, 0.0F, 0.0F, 0.0F, -0.6283F));
		PartDefinition ScarfPart_r12 = Body.addOrReplaceChild("ScarfPart_r12", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.7242F, 0.3973F, 0.0F, 0.0F, 0.0F, -0.3491F));
		PartDefinition ScarfPart_r13 = Body.addOrReplaceChild("ScarfPart_r13", CubeListBuilder.create().texOffs(0, 4).addBox(-0.5F, -0.5F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.7758F, 0.3973F, 0.0F, 0.0F, 0.0F, 0.3491F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm",
				CubeListBuilder.create().texOffs(72, 16).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(72, 32).addBox(-3.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(3, 22)
						.addBox(-1.3F, -1.25F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(0.025F, -1.85F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(0.025F, 1.75F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(0.025F, 4.15F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(0.025F, 7.95F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-3.025F, 7.15F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-3.025F, 5.55F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-3.025F, 2.55F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-3.025F, -0.15F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-3.025F, -1.15F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-0.7F, 1.75F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-2.1F, 3.75F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-0.7F, 6.75F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-1.7F, 6.75F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-2.7F, 3.35F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-0.2F, 0.25F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-1.5F, -2.025F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-5.0F, 2.0F, 0.0F));
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm",
				CubeListBuilder.create().texOffs(64, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(80, 48).addBox(-1.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)).texOffs(3, 22)
						.addBox(-0.3F, 1.75F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(1.1F, 3.75F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-0.3F, 6.75F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(0.7F, 6.75F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(1.7F, 3.35F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-0.8F, 0.25F, 1.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(0.3F, -1.25F, -2.025F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(0.5F, -2.025F, -0.525F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-1.025F, -1.85F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-1.025F, 1.75F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(-1.025F, 4.15F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(-1.025F, 7.95F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(2.025F, 7.15F, -1.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(2.025F, 5.55F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(2.025F, 2.55F, -0.9F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22).addBox(2.025F, -0.15F, -1.2F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(3, 22)
						.addBox(2.025F, -1.15F, 0.8F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(5.0F, 2.0F, 0.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg",
				CubeListBuilder.create().texOffs(32, 16).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 32).addBox(-2.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-1.9F, 12.0F, 0.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg",
				CubeListBuilder.create().texOffs(48, 48).addBox(0.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 48).addBox(0.1F, 0.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.2F)),
				PartPose.offset(-0.1F, 12.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}
