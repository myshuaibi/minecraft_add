package com.myshuaibi.minecraftadd.procedures;

import net.neoforged.neoforge.event.tick.EntityTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

import com.myshuaibi.minecraftadd.init.MinecraftAddModItems;
import com.myshuaibi.minecraftadd.MinecraftAddMod;

@EventBusSubscriber
public class LongOfUndyingWillDoProcedure {
	@SubscribeEvent
	public static void onEntityTick(EntityTickEvent.Pre event) {
		execute(event, event.getEntity().level(), event.getEntity());
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.LONG_OF_UNDYING.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("show_long_of_undying")) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY));
			MinecraftAddMod.queueServerWork(1, () -> {
				{
					final String _tagName = "show_long_of_undying";
					final boolean _tagValue = false;
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY), tag -> tag.putBoolean(_tagName, _tagValue));
				}
			});
		}
		if ((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.LONG_OF_UNDYING.get()
				&& (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getBoolean("show_long_of_undying")) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation((entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY));
			MinecraftAddMod.queueServerWork(1, () -> {
				{
					final String _tagName = "show_long_of_undying";
					final boolean _tagValue = false;
					CustomData.update(DataComponents.CUSTOM_DATA, (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY), tag -> tag.putBoolean(_tagName, _tagValue));
				}
			});
		}
	}
}
