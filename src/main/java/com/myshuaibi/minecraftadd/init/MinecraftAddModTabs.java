
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.myshuaibi.minecraftadd.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import com.myshuaibi.minecraftadd.MinecraftAddMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MinecraftAddModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinecraftAddMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MINECRAFT_ADD_TAB = REGISTRY.register("minecraft_add_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.minecraft_add.minecraft_add_tab")).icon(() -> new ItemStack(MinecraftAddModItems.TAB_ICO.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_HELMET.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_CHESTPLATE.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_LEGGINGS.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_BOOTS.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_AXE.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_PICKAXE.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_SHOVEL.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_HOE.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_SWORD.get());
				tabData.accept(MinecraftAddModItems.BEDROCK_DEBRIS.get());
				tabData.accept(MinecraftAddModItems.LONG_OF_UNDYING.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_HELMET.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_BOOTS.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_AXE.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_PICKAXE.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_SHOVEL.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_HOE.get());
				tabData.accept(MinecraftAddModItems.OBSIDIAN_SWORD.get());
				tabData.accept(MinecraftAddModItems.COPPER_ARMOR_HELMET.get());
				tabData.accept(MinecraftAddModItems.COPPER_ARMOR_CHESTPLATE.get());
				tabData.accept(MinecraftAddModItems.COPPER_ARMOR_LEGGINGS.get());
				tabData.accept(MinecraftAddModItems.COPPER_ARMOR_BOOTS.get());
				tabData.accept(MinecraftAddModItems.COPPER_AXE.get());
				tabData.accept(MinecraftAddModItems.COPPER_PICKAXE.get());
				tabData.accept(MinecraftAddModItems.COPPER_SHOVEL.get());
				tabData.accept(MinecraftAddModItems.COPPER_HOE.get());
				tabData.accept(MinecraftAddModItems.COPPER_SWORD.get());
				tabData.accept(MinecraftAddModItems.TERRACOTTA_AXE.get());
				tabData.accept(MinecraftAddModItems.TERRACOTTA_PICKAXE.get());
				tabData.accept(MinecraftAddModItems.TERRACOTTA_SHOVEL.get());
				tabData.accept(MinecraftAddModItems.TERRACOTTA_HOE.get());
				tabData.accept(MinecraftAddModItems.TERRACOTTA_SWORD.get());
				tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_HELMET.get());
				tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_CHESTPLATE.get());
				tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_LEGGINGS.get());
				tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_BOOTS.get());
				tabData.accept(MinecraftAddModItems.DIRT_AXE.get());
				tabData.accept(MinecraftAddModItems.DIRT_SHOVEL.get());
				tabData.accept(MinecraftAddModItems.DIRT_HOE.get());
				tabData.accept(MinecraftAddModItems.DIRT_SWORD.get());
				tabData.accept(MinecraftAddModItems.DIRT_PICKAXE.get());
			}).build());

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.COMBAT) {
			tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_HELMET.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_CHESTPLATE.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_LEGGINGS.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_ARMOR_BOOTS.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_SWORD.get());
			tabData.accept(MinecraftAddModItems.LONG_OF_UNDYING.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_HELMET.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_CHESTPLATE.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_LEGGINGS.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_ARMOR_BOOTS.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_SWORD.get());
			tabData.accept(MinecraftAddModItems.COPPER_ARMOR_HELMET.get());
			tabData.accept(MinecraftAddModItems.COPPER_ARMOR_CHESTPLATE.get());
			tabData.accept(MinecraftAddModItems.COPPER_ARMOR_LEGGINGS.get());
			tabData.accept(MinecraftAddModItems.COPPER_ARMOR_BOOTS.get());
			tabData.accept(MinecraftAddModItems.COPPER_SWORD.get());
			tabData.accept(MinecraftAddModItems.TERRACOTTA_SWORD.get());
			tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_HELMET.get());
			tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_CHESTPLATE.get());
			tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_LEGGINGS.get());
			tabData.accept(MinecraftAddModItems.DIRT_ARMOUR_BOOTS.get());
			tabData.accept(MinecraftAddModItems.DIRT_SWORD.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			tabData.accept(MinecraftAddModItems.BEDROCK_DEBRIS.get());
		} else if (tabData.getTabKey() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(MinecraftAddModItems.BEDROCK_AXE.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_PICKAXE.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_SHOVEL.get());
			tabData.accept(MinecraftAddModItems.BEDROCK_HOE.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_AXE.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_PICKAXE.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_SHOVEL.get());
			tabData.accept(MinecraftAddModItems.OBSIDIAN_HOE.get());
			tabData.accept(MinecraftAddModItems.COPPER_AXE.get());
			tabData.accept(MinecraftAddModItems.COPPER_PICKAXE.get());
			tabData.accept(MinecraftAddModItems.COPPER_SHOVEL.get());
			tabData.accept(MinecraftAddModItems.COPPER_HOE.get());
			tabData.accept(MinecraftAddModItems.TERRACOTTA_AXE.get());
			tabData.accept(MinecraftAddModItems.TERRACOTTA_PICKAXE.get());
			tabData.accept(MinecraftAddModItems.TERRACOTTA_SHOVEL.get());
			tabData.accept(MinecraftAddModItems.TERRACOTTA_HOE.get());
			tabData.accept(MinecraftAddModItems.DIRT_AXE.get());
			tabData.accept(MinecraftAddModItems.DIRT_HOE.get());
			tabData.accept(MinecraftAddModItems.DIRT_SHOVEL.get());
			tabData.accept(MinecraftAddModItems.DIRT_PICKAXE.get());
		}
	}
}
