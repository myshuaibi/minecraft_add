package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.ItemStack;
import net.minecraft.network.chat.Component;
import net.minecraft.core.component.DataComponents;

public class LongofundyingTitleProcedure {
	public static String execute(ItemStack itemstack) {
		return Component.translatable("item.minecraft_add.long_of_undying.description_0").getString() + "\n" + Component.translatable("item.minecraft_add.long_of_undying.description_1").getString()
				+ itemstack.getOrDefault(DataComponents.CUSTOM_DATA, CustomData.EMPTY).copyTag().getDouble("charged");
	}
}
