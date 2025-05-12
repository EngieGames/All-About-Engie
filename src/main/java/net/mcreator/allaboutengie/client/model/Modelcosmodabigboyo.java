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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcosmodabigboyo<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelcosmodabigboyo"), "main");
	public final ModelPart Body;
	public final ModelPart tail;
	public final ModelPart base;
	public final ModelPart base2;
	public final ModelPart mid1;
	public final ModelPart mid1a;
	public final ModelPart mid2;
	public final ModelPart mid2a;
	public final ModelPart tip;
	public final ModelPart tip2;
	public final ModelPart Head;
	public final ModelPart leg1;
	public final ModelPart leg2;
	public final ModelPart leg3;
	public final ModelPart leg4;

	public Modelcosmodabigboyo(ModelPart root) {
		this.Body = root.getChild("Body");
		this.tail = this.Body.getChild("tail");
		this.base = this.tail.getChild("base");
		this.base2 = this.base.getChild("base2");
		this.mid1 = this.base2.getChild("mid1");
		this.mid1a = this.mid1.getChild("mid1a");
		this.mid2 = this.mid1a.getChild("mid2");
		this.mid2a = this.mid2.getChild("mid2a");
		this.tip = this.mid2a.getChild("tip");
		this.tip2 = this.tip.getChild("tip2");
		this.Head = root.getChild("Head");
		this.leg1 = root.getChild("leg1");
		this.leg2 = root.getChild("leg2");
		this.leg3 = root.getChild("leg3");
		this.leg4 = root.getChild("leg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 56).addBox(-9.975F, -20.975F, -12.025F, 20.0F, 32.0F, 16.0F, new CubeDeformation(0.025F)).texOffs(66, 144).addBox(-10.0F, -21.0F, -12.0F, 20.0F, 32.0F, 16.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 4.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1", CubeListBuilder.create().texOffs(214, 104).addBox(-2.0F, 1.9506F, 4.4636F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -4.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2", CubeListBuilder.create().texOffs(194, 100).addBox(-2.0F, -3.8132F, 7.4453F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -4.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition tail = Body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 50.0F, -41.0F, -1.5708F, 0.0F, 0.0F));
		PartDefinition base = tail.addOrReplaceChild("base", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -39.7F, -45.9F, -0.3491F, 0.0F, 0.0F));
		PartDefinition base2 = base.addOrReplaceChild("base2",
				CubeListBuilder.create().texOffs(214, 66).addBox(-5.5F, -5.5F, 0.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(224, 163).addBox(-5.375F, -5.375F, -0.125F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.25F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, 0.0873F, 0.0F, 0.0F));
		PartDefinition dorsal_r1 = base2.addOrReplaceChild("dorsal_r1", CubeListBuilder.create().texOffs(184, 64).addBox(-2.0F, -5.0F, -3.0F, 4.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.5F, -5.9142F, 7.5208F, -0.7854F, 0.0F, 0.0F));
		PartDefinition mid1 = base2.addOrReplaceChild("mid1", CubeListBuilder.create().texOffs(214, 66).addBox(-5.5F, -5.5F, 0.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, 0.0873F, 0.0F, 0.0F));
		PartDefinition mid1a = mid1.addOrReplaceChild("mid1a", CubeListBuilder.create().texOffs(214, 66).addBox(-5.5F, -5.5F, 0.0F, 10.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, 0.0873F, 0.0F, 0.0F));
		PartDefinition sidefin_r1 = mid1a.addOrReplaceChild("sidefin_r1", CubeListBuilder.create().texOffs(186, 90).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.4819F, 3.6679F, 4.866F, 0.0246F, 0.5108F, -0.2081F));
		PartDefinition sidefin_r2 = mid1a.addOrReplaceChild("sidefin_r2", CubeListBuilder.create().texOffs(184, 80).addBox(-3.0F, -1.0F, -3.0F, 6.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.4819F, 3.6679F, 4.866F, 0.0246F, -0.5108F, 0.2081F));
		PartDefinition mid2 = mid1a.addOrReplaceChild("mid2", CubeListBuilder.create().texOffs(228, 84).addBox(-4.25F, -4.25F, 0.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, 0.0873F, 0.0F, 0.0F));
		PartDefinition mid2a = mid2.addOrReplaceChild("mid2a", CubeListBuilder.create().texOffs(228, 84).addBox(-4.25F, -4.25F, 0.0F, 8.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, -0.0873F, 0.0F, 0.0F));
		PartDefinition dorsal_r2 = mid2a.addOrReplaceChild("dorsal_r2", CubeListBuilder.create().texOffs(188, 32).addBox(-1.0F, -4.0F, -2.0F, 2.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -5.1642F, 4.6066F, -0.7854F, 0.0F, 0.0F));
		PartDefinition tip = mid2a.addOrReplaceChild("tip", CubeListBuilder.create().texOffs(236, 100).addBox(-1.75F, -1.75F, 0.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, -0.0873F, 0.0F, 0.0F));
		PartDefinition tip2 = tip.addOrReplaceChild("tip2", CubeListBuilder.create().texOffs(236, 112).addBox(-1.75F, -1.75F, 0.0F, 4.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 5.625F, -0.0873F, 0.0F, 0.0F));
		PartDefinition shark_r1 = tip2.addOrReplaceChild("shark_r1", CubeListBuilder.create().texOffs(184, 48).addBox(-1.025F, -4.025F, -3.975F, 2.0F, 8.0F, 8.0F, new CubeDeformation(-0.025F)),
				PartPose.offsetAndRotation(-0.2375F, 2.1926F, 5.2752F, -0.7854F, 0.0F, 0.0F));
		PartDefinition shark_r2 = tip2.addOrReplaceChild("shark_r2", CubeListBuilder.create().texOffs(158, 50).addBox(-1.0F, -7.0F, -4.0F, 2.0F, 14.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.25F, -3.7713F, 7.4142F, -0.7854F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(72, 78).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(128, 110).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.05F)).texOffs(112, 0)
						.addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.15F)).texOffs(64, 110).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.2F)).texOffs(0, 104)
						.addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.5F)).texOffs(0, 136).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.6F)).texOffs(84, 0)
						.addBox(-10.25F, -12.5F, -16.525F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(68, 0).addBox(6.25F, -12.5F, -16.525F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(17, 11)
						.addBox(-3.0F, -19.0F, -8.625F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(14, 9).addBox(-4.0F, -18.0F, -10.15F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(12, 8)
						.addBox(-5.0F, -17.0F, -11.7F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(9, 6).addBox(-6.0F, -16.0F, -13.275F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(6, 4)
						.addBox(-7.0F, -15.0F, -14.75F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(3, 2).addBox(-8.0F, -14.0F, -16.0F, 16.0F, 1.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -13.0F, -17.0F, 18.0F, 1.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(-3, -2).addBox(-10.0F, -12.0F, -18.0F, 20.0F, 4.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, -12.0F));
		PartDefinition tooth_r1 = Head.addOrReplaceChild("tooth_r1",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -0.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r2 = Head.addOrReplaceChild("tooth_r2",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -2.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r3 = Head.addOrReplaceChild("tooth_r3",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -4.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r4 = Head.addOrReplaceChild("tooth_r4",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -6.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r5 = Head.addOrReplaceChild("tooth_r5",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -8.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r6 = Head.addOrReplaceChild("tooth_r6",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -10.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r7 = Head.addOrReplaceChild("tooth_r7",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -12.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r8 = Head.addOrReplaceChild("tooth_r8",
				CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(102, 0).addBox(16.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.5F, -7.9929F, -14.9821F, 0.7854F, 0.0F, 0.0F));
		PartDefinition tooth_r9 = Head.addOrReplaceChild("tooth_r9", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r10 = Head.addOrReplaceChild("tooth_r10", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r11 = Head.addOrReplaceChild("tooth_r11", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r12 = Head.addOrReplaceChild("tooth_r12", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r13 = Head.addOrReplaceChild("tooth_r13", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r14 = Head.addOrReplaceChild("tooth_r14", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r15 = Head.addOrReplaceChild("tooth_r15", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r16 = Head.addOrReplaceChild("tooth_r16", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -7.9929F, -16.9821F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r17 = Head.addOrReplaceChild("tooth_r17", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(5.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r18 = Head.addOrReplaceChild("tooth_r18", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r19 = Head.addOrReplaceChild("tooth_r19", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r20 = Head.addOrReplaceChild("tooth_r20", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r21 = Head.addOrReplaceChild("tooth_r21", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r22 = Head.addOrReplaceChild("tooth_r22", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r23 = Head.addOrReplaceChild("tooth_r23", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-5.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition tooth_r24 = Head.addOrReplaceChild("tooth_r24", CubeListBuilder.create().texOffs(102, 0).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-7.0F, -7.9929F, 0.0179F, 0.0F, -1.5708F, -0.7854F));
		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(176, 10).addBox(-0.5F, -2.0F, 0.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -10.0F, -6.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(176, 20).addBox(-0.5F, -4.0F, 0.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -10.0F, -6.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition leg1 = partdefinition.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(224, 52).addBox(-3.9919F, 10.0081F, -5.9581F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0081F)).texOffs(248, 72).addBox(-4.0668F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(248, 72).addBox(-2.0168F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72).addBox(0.0332F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72)
						.addBox(2.0832F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offset(-6.0F, 10.0F, 11.0F));
		PartDefinition Toe_r1 = leg1.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(248, 65).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(248, 65).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 11.7544F, -5.5573F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegPants_r1 = leg1.addOrReplaceChild("LowerLegPants_r1",
				CubeListBuilder.create().texOffs(228, 148).addBox(-4.01F, -2.9659F, -3.0341F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0682F)).texOffs(228, 38).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.01F, 9.8038F, 0.916F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegPants_r1 = leg1.addOrReplaceChild("MidLegPants_r1",
				CubeListBuilder.create().texOffs(224, 130).addBox(-4.02F, -3.965F, -4.035F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.07F)).texOffs(224, 20).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.02F, 7.5339F, -0.477F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayerBody_r1 = leg1.addOrReplaceChild(
				"UpperLegLayerBody_r1", CubeListBuilder.create().texOffs(138, 152).addBox(-4.0F, -4.889F, -4.111F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.222F)).texOffs(198, 118)
						.addBox(-4.0F, -4.939F, -4.061F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.122F)).texOffs(224, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.2841F, -1.0151F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg2 = partdefinition.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(224, 52).addBox(-3.9919F, 10.0081F, -5.9581F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0081F)).texOffs(248, 72).addBox(-4.0668F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(248, 72).addBox(-2.0168F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72).addBox(0.0332F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72)
						.addBox(2.0832F, 12.0082F, -6.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offset(6.0F, 10.0F, 11.0F));
		PartDefinition Toe_r2 = leg2.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(248, 65).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(248, 65).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 11.7544F, -5.5573F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegPants_r2 = leg2.addOrReplaceChild("LowerLegPants_r2",
				CubeListBuilder.create().texOffs(228, 148).addBox(-4.01F, -2.9659F, -3.0341F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0682F)).texOffs(228, 38).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.01F, 9.8038F, 0.916F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegPants_r2 = leg2.addOrReplaceChild("MidLegPants_r2",
				CubeListBuilder.create().texOffs(224, 130).addBox(-4.02F, -3.965F, -4.035F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.07F)).texOffs(224, 20).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.02F, 7.5339F, -0.477F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegPants_r1 = leg2.addOrReplaceChild(
				"UpperLegPants_r1", CubeListBuilder.create().texOffs(198, 118).addBox(-4.0F, -4.939F, -4.061F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.122F)).texOffs(138, 152)
						.addBox(-4.0F, -4.889F, -4.111F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.222F)).texOffs(224, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.2841F, -1.0151F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg3 = partdefinition.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(224, 52).addBox(-3.9919F, 10.0081F, -5.5081F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0081F)).texOffs(248, 72).addBox(-4.0668F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(248, 72).addBox(-2.0168F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72).addBox(0.0332F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72)
						.addBox(2.0832F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offset(-6.0F, 10.0F, -13.0F));
		PartDefinition Toe_r3 = leg3.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(248, 65).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(248, 65).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 11.7544F, -5.1073F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegPants_r3 = leg3.addOrReplaceChild("LowerLegPants_r3",
				CubeListBuilder.create().texOffs(228, 148).addBox(-4.01F, -2.9659F, -3.0341F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0682F)).texOffs(228, 38).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.01F, 9.8038F, 1.366F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegPants_r3 = leg3.addOrReplaceChild("MidLegPants_r3",
				CubeListBuilder.create().texOffs(224, 130).addBox(-4.02F, -3.965F, -4.035F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.07F)).texOffs(224, 20).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.02F, 7.5339F, -0.027F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayerShirt_r1 = leg3.addOrReplaceChild(
				"UpperLegLayerShirt_r1", CubeListBuilder.create().texOffs(138, 152).addBox(-4.0F, -4.889F, -4.111F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.222F)).texOffs(198, 118)
						.addBox(-4.0F, -4.939F, -4.061F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.122F)).texOffs(224, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.2841F, -0.5651F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg4 = partdefinition.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(224, 52).addBox(-3.9919F, 10.0081F, -5.5081F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0081F)).texOffs(248, 72).addBox(-4.0668F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(248, 72).addBox(-2.0168F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72).addBox(0.0332F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(248, 72)
						.addBox(2.0832F, 12.0082F, -6.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offset(6.0F, 10.0F, -13.0F));
		PartDefinition Toe_r4 = leg4.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(248, 65).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(248, 65).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(248, 65).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 11.7544F, -5.1073F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLegPants_r4 = leg4.addOrReplaceChild("LowerLegPants_r4",
				CubeListBuilder.create().texOffs(228, 148).addBox(-4.01F, -2.9659F, -3.0341F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0682F)).texOffs(228, 38).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.01F, 9.8038F, 1.366F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLegPants_r4 = leg4.addOrReplaceChild("MidLegPants_r4",
				CubeListBuilder.create().texOffs(224, 130).addBox(-4.02F, -3.965F, -4.035F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.07F)).texOffs(224, 20).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.02F, 7.5339F, -0.027F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLegLayerShirt_r2 = leg4.addOrReplaceChild(
				"UpperLegLayerShirt_r2", CubeListBuilder.create().texOffs(138, 152).addBox(-4.0F, -4.889F, -4.111F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.222F)).texOffs(198, 118)
						.addBox(-4.0F, -4.939F, -4.061F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.122F)).texOffs(224, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 2.2841F, -0.5651F, -0.2182F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leg4.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.leg1.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg4.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.leg2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.leg3.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}
