package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import com.myshuaibi.minecraftadd.init.MinecraftAddModMobEffects;

public class BedrockswordprocessProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MinecraftAddModMobEffects.BE_BEDROCK)) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftAddModMobEffects.BE_BEDROCK, 260,
						(int) ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftAddModMobEffects.BE_BEDROCK) ? _livEnt.getEffect(MinecraftAddModMobEffects.BE_BEDROCK).getAmplifier() : 0) + 1), false, true));
		} else {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MinecraftAddModMobEffects.BE_BEDROCK, 260, 0, false, true));
		}
	}
}
