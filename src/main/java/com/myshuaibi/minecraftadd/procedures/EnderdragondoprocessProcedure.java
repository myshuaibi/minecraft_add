package com.myshuaibi.minecraftadd.procedures;

import net.neoforged.neoforge.event.entity.EntityJoinLevelEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.myshuaibi.minecraftadd.network.MinecraftAddModVariables;
import com.myshuaibi.minecraftadd.configuration.CustomModConfigConfiguration;

@EventBusSubscriber
public class EnderdragondoprocessProcedure {
	@SubscribeEvent
	public static void onEntitySpawned(EntityJoinLevelEvent event) {
		execute(event, event.getLevel(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof EnderDragon) {
			if (CustomModConfigConfiguration.ENDER_DRAGON_ENHANCED.get()) {
				if (entity instanceof LivingEntity _livingEntity3 && _livingEntity3.getAttributes().hasAttribute(Attributes.ARMOR))
					_livingEntity3.getAttribute(Attributes.ARMOR)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity2 && _livingEntity2.getAttributes().hasAttribute(Attributes.ARMOR) ? _livingEntity2.getAttribute(Attributes.ARMOR).getBaseValue() : 0) + 2));
				if (entity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity5.getAttribute(Attributes.MAX_HEALTH).setBaseValue(((entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1) * MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add));
				if (entity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.ARMOR))
					_livingEntity7.getAttribute(Attributes.ARMOR)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.ARMOR) ? _livingEntity6.getAttribute(Attributes.ARMOR).getBaseValue() : 0)
									* MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add));
				if (entity instanceof LivingEntity _livingEntity9 && _livingEntity9.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity9.getAttribute(Attributes.ATTACK_DAMAGE)
							.setBaseValue(((entity instanceof LivingEntity _livingEntity8 && _livingEntity8.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE) ? _livingEntity8.getAttribute(Attributes.ATTACK_DAMAGE).getBaseValue() : 0)
									* (MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add / 2)));
				if (entity instanceof LivingEntity _entity)
					_entity.setHealth(entity instanceof LivingEntity _livEnt ? _livEnt.getMaxHealth() : -1);
			}
		}
	}
}
