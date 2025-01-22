package com.myshuaibi.minecraftadd.procedures;

import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.ICancellableEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import javax.annotation.Nullable;

import com.myshuaibi.minecraftadd.network.MinecraftAddModVariables;
import com.myshuaibi.minecraftadd.configuration.CustomModConfigConfiguration;

@EventBusSubscriber
public class EnderdragonmaxdamageprocessProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingIncomingDamageEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity(), event.getSource().getDirectEntity(), event.getSource().getEntity(), event.getAmount());
		}
	}

	public static void execute(LevelAccessor world, Entity entity, Entity immediatesourceentity, Entity sourceentity, double amount) {
		execute(null, world, entity, immediatesourceentity, sourceentity, amount);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, Entity immediatesourceentity, Entity sourceentity, double amount) {
		if (entity == null || immediatesourceentity == null || sourceentity == null)
			return;
		if (entity instanceof EnderDragon) {
			if (CustomModConfigConfiguration.ENDER_DRAGON_ENHANCED.get()) {
				if (100 - MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add > 0) {
					if (amount > 100 - MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add) {
						if (event instanceof ICancellableEvent _cancellable) {
							_cancellable.setCanceled(true);
						}
						entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC), immediatesourceentity, sourceentity), (float) (100 - MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add));
					}
				} else {
					if (amount > 1) {
						if (event instanceof ICancellableEvent _cancellable) {
							_cancellable.setCanceled(true);
						}
						entity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC), immediatesourceentity, sourceentity), 1);
					}
				}
			}
		}
	}
}
