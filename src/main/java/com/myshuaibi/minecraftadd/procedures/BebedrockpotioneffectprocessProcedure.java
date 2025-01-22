package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

import com.myshuaibi.minecraftadd.init.MinecraftAddModMobEffects;
import com.myshuaibi.minecraftadd.init.MinecraftAddModItems;

public class BebedrockpotioneffectprocessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double i = 0;
		if ((entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftAddModMobEffects.BE_BEDROCK) ? _livEnt.getEffect(MinecraftAddModMobEffects.BE_BEDROCK).getAmplifier() : 0) + 1 >= Math
				.ceil((entity instanceof LivingEntity _livEnt ? _livEnt.getHealth() : -1) / 4)
				|| (entity instanceof LivingEntity _livEnt && _livEnt.hasEffect(MinecraftAddModMobEffects.BE_BEDROCK) ? _livEnt.getEffect(MinecraftAddModMobEffects.BE_BEDROCK).getAmplifier() : 0) >= 255) {
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft_add:die_of_be_bedrock")))), (float) (2.71 * Math.pow(10, 28)));
			if (entity.isAlive() == false) {
				for (int index0 = 0; index0 < Math.round(entity.getBbHeight()); index0++) {
					world.setBlock(BlockPos.containing(x, y + i, z), Blocks.BEDROCK.defaultBlockState(), 3);
					i = i + 1;
				}
			} else {
				if (Math.random() < 0.4) {
					for (int index1 = 0; index1 < Math.round(entity.getBbHeight()); index1++) {
						if (world instanceof ServerLevel _level) {
							ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MinecraftAddModItems.BEDROCK_DEBRIS.get()));
							entityToSpawn.setPickUpDelay(50);
							_level.addFreshEntity(entityToSpawn);
						}
					}
				}
			}
			if (entity instanceof LivingEntity _entity)
				_entity.removeEffect(MinecraftAddModMobEffects.BE_BEDROCK);
		}
	}
}
