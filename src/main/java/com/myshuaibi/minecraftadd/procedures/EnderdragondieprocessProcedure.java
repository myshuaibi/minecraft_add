package com.myshuaibi.minecraftadd.procedures;

import net.neoforged.neoforge.event.entity.living.LivingDeathEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.boss.enderdragon.EnderDragon;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import javax.annotation.Nullable;

import com.myshuaibi.minecraftadd.network.MinecraftAddModVariables;
import com.myshuaibi.minecraftadd.configuration.CustomModConfigConfiguration;

@EventBusSubscriber
public class EnderdragondieprocessProcedure {
	@SubscribeEvent
	public static void onEntityDeath(LivingDeathEvent event) {
		if (event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity().getX(), event.getEntity().getY(), event.getEntity().getZ(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		ItemStack Transposition = ItemStack.EMPTY;
		if (entity instanceof EnderDragon) {
			if (CustomModConfigConfiguration.ENDER_DRAGON_ENHANCED.get()) {
				MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add = MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add + 1;
				MinecraftAddModVariables.MapVariables.get(world).syncData(world);
				if (MinecraftAddModVariables.MapVariables.get(world).ender_dragon_add > 5) {
					Transposition = new ItemStack(Items.ENCHANTED_BOOK).copy();
					Transposition.enchant(world.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(ResourceKey.create(Registries.ENCHANTMENT, ResourceLocation.parse("minecraft_add:transposition"))), 1);
					if (world instanceof ServerLevel _level) {
						ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, Transposition);
						entityToSpawn.setPickUpDelay(40);
						entityToSpawn.setUnlimitedLifetime();
						_level.addFreshEntity(entityToSpawn);
					}
				}
			}
		}
	}
}
