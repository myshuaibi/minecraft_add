package com.myshuaibi.minecraftadd.init;

import net.neoforged.fml.event.lifecycle.FMLConstructModEvent;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.ModList;
import net.neoforged.bus.api.SubscribeEvent;

import com.myshuaibi.minecraftadd.configuration.CustomModConfigConfiguration;
import com.myshuaibi.minecraftadd.MinecraftAddMod;

@EventBusSubscriber(modid = MinecraftAddMod.MODID, bus = EventBusSubscriber.Bus.MOD)
public class MinecraftAddModConfigs {
	@SubscribeEvent
	public static void register(FMLConstructModEvent event) {
		event.enqueueWork(() -> {
			ModList.get().getModContainerById("minecraft_add").get().registerConfig(ModConfig.Type.COMMON, CustomModConfigConfiguration.SPEC, "minecraft_add.toml");
		});
	}
}
