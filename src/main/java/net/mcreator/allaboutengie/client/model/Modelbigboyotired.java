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

// Made with Blockbench 4.12.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelbigboyotired<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation("allaboutengie", "modelbigboyotired"), "main");
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

	public Modelbigboyotired(ModelPart root) {
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
		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(-16.0F, 15.0F, 0.0F, 0.0F, 0.0F, 1.5708F));
		PartDefinition leg4 = bone.addOrReplaceChild("leg4",
				CubeListBuilder.create().texOffs(112, 18).addBox(-3.9919F, 8.0081F, -8.5081F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0162F)).texOffs(60, 60).addBox(-4.0668F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(60, 60).addBox(-2.0168F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(60, 60).addBox(0.0332F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(60, 60)
						.addBox(2.0832F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offsetAndRotation(6.0F, -12.0F, -10.0F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Toe_r1 = leg4.addOrReplaceChild("Toe_r1",
				CubeListBuilder.create().texOffs(72, 58).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(72, 58).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 9.7544F, -8.1073F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r1 = leg4.addOrReplaceChild("LowerLeg_r1", CubeListBuilder.create().texOffs(72, 30).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0182F)),
				PartPose.offsetAndRotation(0.01F, 7.8038F, -1.634F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r1 = leg4.addOrReplaceChild("MidLeg_r1", CubeListBuilder.create().texOffs(160, 44).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.02F, 5.5339F, -3.027F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r1 = leg4.addOrReplaceChild("UpperLeg_r1", CubeListBuilder.create().texOffs(112, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.022F)),
				PartPose.offsetAndRotation(0.0F, 0.2841F, -3.5651F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg3 = bone.addOrReplaceChild("leg3",
				CubeListBuilder.create().texOffs(112, 18).addBox(-3.9919F, 8.0081F, -8.5081F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0162F)).texOffs(60, 60).addBox(-4.0668F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(60, 60).addBox(-2.0168F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(60, 60).addBox(0.0332F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(60, 60)
						.addBox(2.0832F, 10.0082F, -9.5082F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offsetAndRotation(-6.0F, -12.0F, -10.0F, 0.3442F, 0.0594F, -0.3387F));
		PartDefinition Toe_r2 = leg3.addOrReplaceChild("Toe_r2",
				CubeListBuilder.create().texOffs(72, 58).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(72, 58).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 9.7544F, -8.1073F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r2 = leg3.addOrReplaceChild("LowerLeg_r2", CubeListBuilder.create().texOffs(72, 30).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0182F)),
				PartPose.offsetAndRotation(0.01F, 7.8038F, -1.634F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r2 = leg3.addOrReplaceChild("MidLeg_r2", CubeListBuilder.create().texOffs(160, 44).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.02F, 5.5339F, -3.027F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r2 = leg3.addOrReplaceChild("UpperLeg_r2", CubeListBuilder.create().texOffs(112, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.022F)),
				PartPose.offsetAndRotation(0.0F, 0.2841F, -3.5651F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg2 = bone.addOrReplaceChild("leg2",
				CubeListBuilder.create().texOffs(112, 18).addBox(-3.9919F, 8.0081F, -8.9581F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0162F)).texOffs(60, 60).addBox(-4.0668F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F))
						.texOffs(60, 60).addBox(-2.0168F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(60, 60).addBox(0.0332F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)).texOffs(60, 60)
						.addBox(2.0832F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0164F)),
				PartPose.offsetAndRotation(6.0F, -12.0F, 14.0F, 0.1745F, 0.0F, 0.0F));
		PartDefinition Toe_r3 = leg2.addOrReplaceChild("Toe_r3",
				CubeListBuilder.create().texOffs(72, 58).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(72, 58).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 9.7544F, -8.5573F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r3 = leg2.addOrReplaceChild("LowerLeg_r3", CubeListBuilder.create().texOffs(72, 30).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0182F)),
				PartPose.offsetAndRotation(0.01F, 7.8038F, -2.084F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r3 = leg2.addOrReplaceChild("MidLeg_r3", CubeListBuilder.create().texOffs(160, 44).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.02F, 5.5339F, -3.477F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r3 = leg2.addOrReplaceChild("UpperLeg_r3", CubeListBuilder.create().texOffs(112, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.022F)),
				PartPose.offsetAndRotation(0.0F, 0.2841F, -4.0151F, -0.2182F, 0.0F, 0.0F));
		PartDefinition leg1 = bone.addOrReplaceChild("leg1",
				CubeListBuilder.create().texOffs(112, 18).addBox(-3.9919F, 8.0081F, -8.9581F, 8.0F, 4.0F, 8.0F, new CubeDeformation(0.0162F)).texOffs(60, 60).addBox(-4.0668F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0082F))
						.texOffs(60, 60).addBox(-2.0168F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0082F)).texOffs(60, 60).addBox(0.0332F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0082F)).texOffs(60, 60)
						.addBox(2.0832F, 10.0082F, -9.9582F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0082F)),
				PartPose.offsetAndRotation(-6.0F, -12.0F, 14.0F, -0.1298F, -0.017F, -0.4352F));
		PartDefinition Toe_r4 = leg1.addOrReplaceChild("Toe_r4",
				CubeListBuilder.create().texOffs(72, 58).addBox(-1.0169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-3.0669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F))
						.texOffs(72, 58).addBox(-5.1169F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)).texOffs(72, 58).addBox(-7.1669F, -0.9919F, -1.0081F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0162F)),
				PartPose.offsetAndRotation(3.1F, 9.7544F, -8.5573F, -0.6109F, 0.0F, 0.0F));
		PartDefinition LowerLeg_r4 = leg1.addOrReplaceChild("LowerLeg_r4", CubeListBuilder.create().texOffs(72, 30).addBox(-4.0009F, -2.9909F, -3.0091F, 8.0F, 6.0F, 6.0F, new CubeDeformation(0.0182F)),
				PartPose.offsetAndRotation(0.01F, 7.8038F, -2.084F, -0.5236F, 0.0F, 0.0F));
		PartDefinition MidLeg_r4 = leg1.addOrReplaceChild("MidLeg_r4", CubeListBuilder.create().texOffs(160, 44).addBox(-4.01F, -3.99F, -4.01F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.02F)),
				PartPose.offsetAndRotation(0.02F, 5.5339F, -3.477F, 0.5672F, 0.0F, 0.0F));
		PartDefinition UpperLeg_r4 = leg1.addOrReplaceChild("UpperLeg_r4", CubeListBuilder.create().texOffs(112, 0).addBox(-3.989F, -4.989F, -4.011F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.022F)),
				PartPose.offsetAndRotation(0.0F, 0.2841F, -4.0151F, -0.2182F, 0.0F, 0.0F));
		PartDefinition Head = bone.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(72, 78).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(128, 160).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.05F)).texOffs(64, 160)
						.addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.15F)).texOffs(0, 160).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.2F)).texOffs(0, 104)
						.addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.5F)).texOffs(60, 126).addBox(-8.0F, -13.0F, -16.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.6F)),
				PartPose.offsetAndRotation(0.0F, -24.0F, -12.0F, 0.0F, -0.0262F, 0.0F));
		PartDefinition HeadFin_r1 = Head.addOrReplaceChild("HeadFin_r1", CubeListBuilder.create().texOffs(128, 128).addBox(-0.5F, -2.0F, 0.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(6.0F, -10.0F, -6.0F, 1.0263F, -0.733F, -0.9599F));
		PartDefinition HeadFin_r2 = Head.addOrReplaceChild("HeadFin_r2", CubeListBuilder.create().texOffs(0, 136).addBox(-0.5F, -4.0F, 0.0F, 12.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-6.0F, -10.0F, -6.0F, -1.0263F, -0.733F, -2.1817F));
		PartDefinition Main_r1 = Head.addOrReplaceChild("Main_r1",
				CubeListBuilder.create().texOffs(72, 64).addBox(-2.0F, -4.0F, -2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(100, 112).addBox(-4.0F, -3.0F, -4.0F, 8.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(64, 109)
						.addBox(-6.0F, -2.0F, -6.0F, 12.0F, 2.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(128, 26).addBox(-8.0F, -1.0F, -8.0F, 16.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(72, 56)
						.addBox(-10.0F, 0.0F, -10.0F, 20.0F, 2.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 30).addBox(-12.0F, 1.0F, -12.0F, 24.0F, 2.0F, 24.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-14.0F, 2.0F, -14.0F, 28.0F, 2.0F, 28.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-9.0F, -7.2F, -8.0F, 0.0F, 0.0F, -1.4399F));
		PartDefinition Body = bone.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 56).addBox(-9.975F, -20.975F, -12.025F, 20.0F, 32.0F, 16.0F, new CubeDeformation(0.025F)),
				PartPose.offsetAndRotation(0.0F, -26.0F, 4.0F, 1.5708F, 0.0F, 0.0F));
		PartDefinition BackFin_r1 = Body.addOrReplaceChild("BackFin_r1", CubeListBuilder.create().texOffs(100, 0).addBox(-2.0F, 1.9506F, 4.4636F, 4.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -6.0F, -4.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition BackFin_r2 = Body.addOrReplaceChild("BackFin_r2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -3.8132F, 7.4453F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -4.0F, 0.5236F, 0.0F, 0.0F));
		PartDefinition Tail = Body.addOrReplaceChild("Tail", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 7.6F, -4.4F, -1.5708F, 0.0F, -0.3752F));
		PartDefinition TailPrimary = Tail.addOrReplaceChild("TailPrimary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.0F, 1.5F, 0.0F, 0.0873F, 0.0F));
		PartDefinition TailFin_r1 = TailPrimary.addOrReplaceChild("TailFin_r1",
				CubeListBuilder.create().texOffs(136, 32).addBox(-8.0F, 8.0F, -1.5F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(-8.0F, 0.0F, 0.5F, 2.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(7.0F, 1.5F, -4.0F, 1.789F, 0.0F, 0.0F));
		PartDefinition Base_r1 = TailPrimary.addOrReplaceChild("Base_r1", CubeListBuilder.create().texOffs(132, 58).addBox(-4.0F, 1.5F, -1.6F, 8.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.0F, -2.0F, 1.1781F, 0.0F, 0.0F));
		PartDefinition TailSecondary = TailPrimary.addOrReplaceChild("TailSecondary", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.5F, 8.5F, 0.0F, -0.3054F, 0.0F));
		PartDefinition Base_r2 = TailSecondary.addOrReplaceChild("Base_r2", CubeListBuilder.create().texOffs(94, 38).addBox(-3.0F, -2.7126F, -1.2176F, 6.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 2.5F, 2.0F, 1.309F, 0.0F, 0.0F));
		PartDefinition TailTertiary = TailSecondary.addOrReplaceChild("TailTertiary", CubeListBuilder.create(), PartPose.offset(0.0F, 3.0F, 9.0F));
		PartDefinition Base_r3 = TailTertiary.addOrReplaceChild("Base_r3",
				CubeListBuilder.create().texOffs(64, 104).addBox(-1.05F, 10.6423F, -3.6092F, 2.0F, 2.0F, 2.0F, new CubeDeformation(-0.05F)).texOffs(160, 0).addBox(-1.05F, -5.1577F, -3.6092F, 2.0F, 16.0F, 6.0F, new CubeDeformation(-0.05F)),
				PartPose.offsetAndRotation(0.0F, 1.0F, 8.5F, 1.1345F, 0.0F, 0.0F));
		PartDefinition Base_r4 = TailTertiary.addOrReplaceChild("Base_r4",
				CubeListBuilder.create().texOffs(84, 0).addBox(-1.0F, -12.3336F, 1.7643F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(144, 0).addBox(-1.0F, -16.3336F, -4.2357F, 2.0F, 20.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -1.0F, 8.5F, -0.8727F, 0.0F, 0.0F));
		PartDefinition Base_r5 = TailTertiary.addOrReplaceChild("Base_r5", CubeListBuilder.create().texOffs(132, 44).addBox(-2.0F, -0.6898F, -1.4406F, 4.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.5F, 1.4835F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 192, 192);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
}
