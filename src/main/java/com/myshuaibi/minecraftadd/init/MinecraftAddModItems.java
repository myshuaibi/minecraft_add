
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.myshuaibi.minecraftadd.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import com.myshuaibi.minecraftadd.item.TerracottaswordItem;
import com.myshuaibi.minecraftadd.item.TerracottashovelItem;
import com.myshuaibi.minecraftadd.item.TerracottapickaxeItem;
import com.myshuaibi.minecraftadd.item.TerracottahoeItem;
import com.myshuaibi.minecraftadd.item.TerracottaaxeItem;
import com.myshuaibi.minecraftadd.item.TabicoItem;
import com.myshuaibi.minecraftadd.item.OriginArtifactItem;
import com.myshuaibi.minecraftadd.item.ObsidianswordItem;
import com.myshuaibi.minecraftadd.item.ObsidianshovelItem;
import com.myshuaibi.minecraftadd.item.ObsidianpickaxeItem;
import com.myshuaibi.minecraftadd.item.ObsidianhoeItem;
import com.myshuaibi.minecraftadd.item.ObsidianaxeItem;
import com.myshuaibi.minecraftadd.item.ObsidianarmorItem;
import com.myshuaibi.minecraftadd.item.LongofundyingItem;
import com.myshuaibi.minecraftadd.item.ErrorarmorItem;
import com.myshuaibi.minecraftadd.item.DirtswordItem;
import com.myshuaibi.minecraftadd.item.DirtspadeItem;
import com.myshuaibi.minecraftadd.item.DirtpickaxeItem;
import com.myshuaibi.minecraftadd.item.DirthoeItem;
import com.myshuaibi.minecraftadd.item.DirtaxeItem;
import com.myshuaibi.minecraftadd.item.DirtarmourItem;
import com.myshuaibi.minecraftadd.item.CopperswordItem;
import com.myshuaibi.minecraftadd.item.CoppershovelItem;
import com.myshuaibi.minecraftadd.item.CopperpickaxeItem;
import com.myshuaibi.minecraftadd.item.CopperhoeItem;
import com.myshuaibi.minecraftadd.item.CopperaxeItem;
import com.myshuaibi.minecraftadd.item.CopperarmorItem;
import com.myshuaibi.minecraftadd.item.BedrokarmorItem;
import com.myshuaibi.minecraftadd.item.BedrockswordItem;
import com.myshuaibi.minecraftadd.item.BedrockshovelItem;
import com.myshuaibi.minecraftadd.item.BedrockpickaxeItem;
import com.myshuaibi.minecraftadd.item.BedrockhoeItem;
import com.myshuaibi.minecraftadd.item.BedrockdebrisItem;
import com.myshuaibi.minecraftadd.item.BedrockaxeItem;
import com.myshuaibi.minecraftadd.MinecraftAddMod;

public class MinecraftAddModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinecraftAddMod.MODID);
	public static final DeferredItem<Item> DIRT_PICKAXE = REGISTRY.register("dirt_pickaxe", DirtpickaxeItem::new);
	public static final DeferredItem<Item> DIRT_AXE = REGISTRY.register("dirt_axe", DirtaxeItem::new);
	public static final DeferredItem<Item> DIRT_SHOVEL = REGISTRY.register("dirt_shovel", DirtspadeItem::new);
	public static final DeferredItem<Item> DIRT_HOE = REGISTRY.register("dirt_hoe", DirthoeItem::new);
	public static final DeferredItem<Item> DIRT_SWORD = REGISTRY.register("dirt_sword", DirtswordItem::new);
	public static final DeferredItem<Item> OBSIDIAN_AXE = REGISTRY.register("obsidian_axe", ObsidianaxeItem::new);
	public static final DeferredItem<Item> OBSIDIAN_PICKAXE = REGISTRY.register("obsidian_pickaxe", ObsidianpickaxeItem::new);
	public static final DeferredItem<Item> DIRT_ARMOUR_HELMET = REGISTRY.register("dirt_armour_helmet", DirtarmourItem.Helmet::new);
	public static final DeferredItem<Item> DIRT_ARMOUR_CHESTPLATE = REGISTRY.register("dirt_armour_chestplate", DirtarmourItem.Chestplate::new);
	public static final DeferredItem<Item> DIRT_ARMOUR_LEGGINGS = REGISTRY.register("dirt_armour_leggings", DirtarmourItem.Leggings::new);
	public static final DeferredItem<Item> DIRT_ARMOUR_BOOTS = REGISTRY.register("dirt_armour_boots", DirtarmourItem.Boots::new);
	public static final DeferredItem<Item> OBSIDIAN_SHOVEL = REGISTRY.register("obsidian_shovel", ObsidianshovelItem::new);
	public static final DeferredItem<Item> OBSIDIAN_HOE = REGISTRY.register("obsidian_hoe", ObsidianhoeItem::new);
	public static final DeferredItem<Item> OBSIDIAN_SWORD = REGISTRY.register("obsidian_sword", ObsidianswordItem::new);
	public static final DeferredItem<Item> OBSIDIAN_ARMOR_HELMET = REGISTRY.register("obsidian_armor_helmet", ObsidianarmorItem.Helmet::new);
	public static final DeferredItem<Item> OBSIDIAN_ARMOR_CHESTPLATE = REGISTRY.register("obsidian_armor_chestplate", ObsidianarmorItem.Chestplate::new);
	public static final DeferredItem<Item> OBSIDIAN_ARMOR_LEGGINGS = REGISTRY.register("obsidian_armor_leggings", ObsidianarmorItem.Leggings::new);
	public static final DeferredItem<Item> OBSIDIAN_ARMOR_BOOTS = REGISTRY.register("obsidian_armor_boots", ObsidianarmorItem.Boots::new);
	public static final DeferredItem<Item> BEDROCK_AXE = REGISTRY.register("bedrock_axe", BedrockaxeItem::new);
	public static final DeferredItem<Item> TAB_ICO = REGISTRY.register("tab_ico", TabicoItem::new);
	public static final DeferredItem<Item> BEDROCK_PICKAXE = REGISTRY.register("bedrock_pickaxe", BedrockpickaxeItem::new);
	public static final DeferredItem<Item> BEDROCK_DEBRIS = REGISTRY.register("bedrock_debris", BedrockdebrisItem::new);
	public static final DeferredItem<Item> BEDROCK_SHOVEL = REGISTRY.register("bedrock_shovel", BedrockshovelItem::new);
	public static final DeferredItem<Item> BEDROCK_HOE = REGISTRY.register("bedrock_hoe", BedrockhoeItem::new);
	public static final DeferredItem<Item> BEDROCK_SWORD = REGISTRY.register("bedrock_sword", BedrockswordItem::new);
	public static final DeferredItem<Item> BEDROCK_ARMOR_HELMET = REGISTRY.register("bedrock_armor_helmet", BedrokarmorItem.Helmet::new);
	public static final DeferredItem<Item> BEDROCK_ARMOR_CHESTPLATE = REGISTRY.register("bedrock_armor_chestplate", BedrokarmorItem.Chestplate::new);
	public static final DeferredItem<Item> BEDROCK_ARMOR_LEGGINGS = REGISTRY.register("bedrock_armor_leggings", BedrokarmorItem.Leggings::new);
	public static final DeferredItem<Item> BEDROCK_ARMOR_BOOTS = REGISTRY.register("bedrock_armor_boots", BedrokarmorItem.Boots::new);
	public static final DeferredItem<Item> TERRACOTTA_AXE = REGISTRY.register("terracotta_axe", TerracottaaxeItem::new);
	public static final DeferredItem<Item> TERRACOTTA_PICKAXE = REGISTRY.register("terracotta_pickaxe", TerracottapickaxeItem::new);
	public static final DeferredItem<Item> TERRACOTTA_SHOVEL = REGISTRY.register("terracotta_shovel", TerracottashovelItem::new);
	public static final DeferredItem<Item> TERRACOTTA_HOE = REGISTRY.register("terracotta_hoe", TerracottahoeItem::new);
	public static final DeferredItem<Item> TERRACOTTA_SWORD = REGISTRY.register("terracotta_sword", TerracottaswordItem::new);
	public static final DeferredItem<Item> COPPER_AXE = REGISTRY.register("copper_axe", CopperaxeItem::new);
	public static final DeferredItem<Item> COPPER_PICKAXE = REGISTRY.register("copper_pickaxe", CopperpickaxeItem::new);
	public static final DeferredItem<Item> COPPER_SHOVEL = REGISTRY.register("copper_shovel", CoppershovelItem::new);
	public static final DeferredItem<Item> COPPER_HOE = REGISTRY.register("copper_hoe", CopperhoeItem::new);
	public static final DeferredItem<Item> COPPER_SWORD = REGISTRY.register("copper_sword", CopperswordItem::new);
	public static final DeferredItem<Item> COPPER_ARMOR_HELMET = REGISTRY.register("copper_armor_helmet", CopperarmorItem.Helmet::new);
	public static final DeferredItem<Item> COPPER_ARMOR_CHESTPLATE = REGISTRY.register("copper_armor_chestplate", CopperarmorItem.Chestplate::new);
	public static final DeferredItem<Item> COPPER_ARMOR_LEGGINGS = REGISTRY.register("copper_armor_leggings", CopperarmorItem.Leggings::new);
	public static final DeferredItem<Item> COPPER_ARMOR_BOOTS = REGISTRY.register("copper_armor_boots", CopperarmorItem.Boots::new);
	public static final DeferredItem<Item> ERROR_ARMOR_HELMET = REGISTRY.register("error_armor_helmet", ErrorarmorItem.Helmet::new);
	public static final DeferredItem<Item> ERROR_ARMOR_CHESTPLATE = REGISTRY.register("error_armor_chestplate", ErrorarmorItem.Chestplate::new);
	public static final DeferredItem<Item> ERROR_ARMOR_LEGGINGS = REGISTRY.register("error_armor_leggings", ErrorarmorItem.Leggings::new);
	public static final DeferredItem<Item> ERROR_ARMOR_BOOTS = REGISTRY.register("error_armor_boots", ErrorarmorItem.Boots::new);
	public static final DeferredItem<Item> LONG_OF_UNDYING = REGISTRY.register("long_of_undying", LongofundyingItem::new);
	public static final DeferredItem<Item> ORIGIN_ARTIFACT = REGISTRY.register("origin_artifact", OriginArtifactItem::new);
	// Start of user code block custom items
	// End of user code block custom items
}
