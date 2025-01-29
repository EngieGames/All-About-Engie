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

// Made with Blockbench 4.12.2
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelboyotired<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelboyotired"), "main");
	public final ModelPart bone;
	public final ModelPart leg4;
	public final ModelPart leg3;
	public final ModelPart leg2;
	public final ModelPart leg1;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart Tail;
	public final ModelPart TailPrimary;
	public final ModelPart TailSecondary;
	public final ModelPart TailTertiary;

	public Modelboyotired(ModelPart root) {
		this.bone = root.getChild("bone");
		this.leg4 = this.bone.getChild("leg4");
		this.leg3 = this.bone.getChild("leg3");
		this.leg2 = this.bone.getChild("leg2");
		this.leg1 = this.bone.getChild("leg1");
		this.Head = this.bone.getChild("Head");
		this.Body = this.bone.getChild("Body");
		this.Tail = this.Body.getChild("Tail");
		this.TailPrimary = this.Tail.getChild("TailPrimary");
		this.TailSecondary = this.TailPrimary.getChild("TailSecondary");
		this.TailTertiary = this.TailSecondary.getChild("TailTertiary");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-8.0F, 19.5F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition leg4 = bone.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 4.0F, -4.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)), PartPose.offsetAndRotation(3.0F, -6.0F, -5.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Toe_r1 = leg4.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(30, 30).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.25F, 0.0F, 0.0F, 0.0F));
		PartDefinition Toe_r2 = leg4.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(36, 29).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.0536F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r1 = leg4.addOrReplaceChild("LowerLeg_r1", CubeListBuilder.create().texOffs(36, 15).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -0.817F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r1 = leg4.addOrReplaceChild("MidLeg_r1", CubeListBuilder.create().texOffs(80, 22).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.5135F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r1 = leg4.addOrReplaceChild("UpperLeg_r1", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 0.142F, -1.7825F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg3 = bone.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 4.0F, -4.25F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(-3.0F, -6.0F, -5.0F, 0.3442F, 0.0594F, -0.3387F));
		PartDefinition Toe_r3 = leg3.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(30, 30).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.25F, 0.0F, 0.0F, 0.0F));
		PartDefinition Toe_r4 = leg3.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(36, 29).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.0536F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r2 = leg3.addOrReplaceChild("LowerLeg_r2", CubeListBuilder.create().texOffs(36, 15).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -0.817F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r2 = leg3.addOrReplaceChild("MidLeg_r2", CubeListBuilder.create().texOffs(80, 22).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.5135F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r2 = leg3.addOrReplaceChild("UpperLeg_r2", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 0.142F, -1.7825F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg2 = bone.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 4.0F, -4.475F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)), PartPose.offsetAndRotation(3.0F, -6.0F, 7.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Toe_r5 = leg2.addOrReplaceChild("Toe_r5",
				CubeListBuilder.create().texOffs(30, 30).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.475F, 0.0F, 0.0F, 0.0F));
		PartDefinition Toe_r6 = leg2.addOrReplaceChild("Toe_r6",
				CubeListBuilder.create().texOffs(36, 29).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.2786F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r3 = leg2.addOrReplaceChild("LowerLeg_r3", CubeListBuilder.create().texOffs(36, 15).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -1.042F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r3 = leg2.addOrReplaceChild("MidLeg_r3", CubeListBuilder.create().texOffs(80, 22).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.7385F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r3 = leg2.addOrReplaceChild("UpperLeg_r3", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 0.142F, -2.0075F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg1 = bone.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(56, 9).addBox(-2.0F, 4.0F, -4.475F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(-3.0F, -6.0F, 7.0F, -0.1298F, -0.017F, -0.4352F));
		PartDefinition Toe_r7 = leg1.addOrReplaceChild("Toe_r7",
				CubeListBuilder.create().texOffs(30, 30).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)).texOffs(30, 30).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(1.55F, 5.5F, -4.475F, 0.0F, 0.0F, 0.0F));
		PartDefinition Toe_r8 = leg1.addOrReplaceChild("Toe_r8",
				CubeListBuilder.create().texOffs(36, 29).addBox(-0.5125F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-1.5375F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29)
						.addBox(-2.5625F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)).texOffs(36, 29).addBox(-3.5875F, -0.5F, -0.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0081F)),
				PartPose.offsetAndRotation(1.55F, 4.8772F, -4.2786F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r4 = leg1.addOrReplaceChild("LowerLeg_r4", CubeListBuilder.create().texOffs(36, 15).addBox(-2.005F, -1.5F, -1.5F, 4.0F, 3.0F, 3.0F, new CubeDeformation(0.0091F)),
				PartPose.offsetAndRotation(0.005F, 3.9019F, -1.042F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r4 = leg1.addOrReplaceChild("MidLeg_r4", CubeListBuilder.create().texOffs(80, 22).addBox(-2.01F, -2.0F, -2.0F, 4.0F, 4.0F, 4.0F, new CubeDeformation(0.01F)),
				PartPose.offsetAndRotation(0.01F, 2.767F, -1.7385F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r4 = leg1.addOrReplaceChild("UpperLeg_r4", CubeListBuilder.create().texOffs(56, 0).addBox(-2.0F, -2.5F, -2.0F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.011F)),
				PartPose.offsetAndRotation(0.0F, 0.142F, -2.0075F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Head = bone.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(36, 39).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 80).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.025F)).texOffs(32, 80)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.075F)).texOffs(0, 80).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.1F)).texOffs(0, 52)
						.addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.25F)).texOffs(30, 63).addBox(-4.0F, -6.5F, -8.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.3F)),
				PartPose.offsetAndRotation(0.0F, -12.0F, -6.0F, 0.0F, -0.0262F, 0.0F));
		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(64, 64).addBox(-0.25F, -1.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -5.0F, -3.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(0, 68).addBox(-0.25F, -2.0F, 0.0F, 6.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -5.0F, -3.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition Main_r1 = Head.addOrReplaceChild("Main_r1",
				CubeListBuilder.create().texOffs(36, 32).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 56).addBox(-2.0F, -1.5F, -2.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(32, 55)
						.addBox(-3.0F, -1.0F, -3.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(64, 13).addBox(-4.0F, -0.5F, -4.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(36, 28)
						.addBox(-5.0F, 0.0F, -5.0F, 10.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 15).addBox(-6.0F, 0.5F, -6.0F, 12.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 1.0F, -7.0F, 14.0F, 1.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.5F, -3.6F, -4.0F, 0.0F, 0.0F, -1.4399F));
		PartDefinition Body = bone.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 28).addBox(-5.0F, -10.5F, -6.0F, 10.0F, 16.0F, 8.0F, new CubeDeformation(0.025F)), PartPose.offsetAndRotation(0.0F, -13.0F, 2.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1", CubeListBuilder.create().texOffs(50, 0).addBox(-1.0F, 0.9753F, 2.2318F, 2.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -3.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -1.9066F, 3.7227F, 2.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 3.8F, -2.2F, -1.5708F, 0.0F, -0.3491F));
		PartDefinition TailPrimary = Tail.addOrReplaceChild("TailPrimary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.5F, 0.75F, 0.0F, 0.0873F, 0.0F));
		PartDefinition TailFin_r1 = TailPrimary.addOrReplaceChild("TailFin_r1",
				CubeListBuilder.create().texOffs(68, 16).addBox(-4.0F, 4.0F, -0.75F, 1.0F, 4.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-4.0F, 0.0F, 0.25F, 1.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.5F, 0.75F, -2.0F, 1.789F, 0.0F, 0.0F));
		PartDefinition Base_r1 = TailPrimary.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(66, 29).addBox(-2.0F, 0.75F, -0.8F, 4.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, -1.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition TailSecondary = TailPrimary.addOrReplaceChild("TailSecondary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 2.25F, 4.25F, 0.0F, -0.3054F, 0.0F));
		PartDefinition Base_r2 = TailSecondary.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(47, 19).addBox(-1.5F, -1.3563F, -0.6088F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 1.25F, 1.0F, 1.309F, 0.0F, 0.0F));
		PartDefinition TailTertiary = TailSecondary.addOrReplaceChild("TailTertiary", CubeListBuilder.create(), PartPose.offset(0.0F, 1.5F, 4.5F));
		PartDefinition Base_r3 = TailTertiary.addOrReplaceChild("Base_r3",
				CubeListBuilder.create().texOffs(32, 52).addBox(-0.5F, 5.3462F, -1.8296F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.05F)).texOffs(80, 0).addBox(-0.5F, -2.5538F, -1.8296F, 1.0F, 8.0F, 3.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 4.25F, 1.1345F, 0.0F, 0.0F));
		PartDefinition Base_r4 = TailTertiary.addOrReplaceChild("Base_r4",
				CubeListBuilder.create().texOffs(42, 0).addBox(-0.5F, -6.1668F, 0.8821F, 1.0F, 7.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 0).addBox(-0.5F, -8.1668F, -2.1179F, 1.0F, 10.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 4.25F, -0.8727F, 0.0F, 0.0F));
		PartDefinition Base_r5 = TailTertiary.addOrReplaceChild("Base_r5", CubeListBuilder.create().texOffs(66, 22).addBox(-1.0F, -0.3449F, -0.7203F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.25F, 0.25F, 1.4835F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 96, 96);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
