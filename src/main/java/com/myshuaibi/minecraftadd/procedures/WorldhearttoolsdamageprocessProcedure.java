package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

public class WorldhearttoolsdamageprocessProcedure {
	public static void execute(LevelAccessor world, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double kill_time = 0;
		while (entity.isAlive()) {
			if (kill_time >= 4 * Math.pow(10, 3)) {
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(0);
				break;
			}
			entity.hurt(new DamageSource(world.holderOrThrow(ResourceKey.create(Registries.DAMAGE_TYPE, ResourceLocation.parse("minecraft_add:game_kill"))), sourceentity), (float) (2.71 * Math.pow(10, 34)));
			kill_time = kill_time + 1;
		}
	}
}
