
package com.myshuaibi.minecraftadd.potion;

import net.neoforged.neoforge.common.EffectCures;
import net.neoforged.neoforge.common.EffectCure;

import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.resources.ResourceLocation;

import java.util.Set;

import com.myshuaibi.minecraftadd.procedures.BebedrockpotioneffectprocessProcedure;
import com.myshuaibi.minecraftadd.MinecraftAddMod;

public class BebedrockMobEffect extends MobEffect {
	public BebedrockMobEffect() {
		super(MobEffectCategory.HARMFUL, -1);
		this.addAttributeModifier(Attributes.ARMOR, ResourceLocation.fromNamespaceAndPath(MinecraftAddMod.MODID, "effect.be_bedrock_0"), 3, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.MOVEMENT_SPEED, ResourceLocation.fromNamespaceAndPath(MinecraftAddMod.MODID, "effect.be_bedrock_1"), -0.03, AttributeModifier.Operation.ADD_VALUE);
		this.addAttributeModifier(Attributes.GRAVITY, ResourceLocation.fromNamespaceAndPath(MinecraftAddMod.MODID, "effect.be_bedrock_2"), 0.02, AttributeModifier.Operation.ADD_VALUE);
	}

	@Override
	public void fillEffectCures(Set<EffectCure> cures, MobEffectInstance effectInstance) {
		cures.add(EffectCures.MILK);
		cures.add(EffectCures.PROTECTED_BY_TOTEM);
		cures.add(EffectCures.HONEY);
	}

	@Override
	public boolean shouldApplyEffectTickThisTick(int duration, int amplifier) {
		return true;
	}

	@Override
	public boolean applyEffectTick(LivingEntity entity, int amplifier) {
		BebedrockpotioneffectprocessProcedure.execute(entity.level(), entity.getX(), entity.getY(), entity.getZ(), entity);
		return super.applyEffectTick(entity, amplifier);
	}
}
