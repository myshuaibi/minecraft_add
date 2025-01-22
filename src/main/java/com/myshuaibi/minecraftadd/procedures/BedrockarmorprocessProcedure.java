package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.item.component.Unbreakable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.core.component.DataComponents;

public class BedrockarmorprocessProcedure {
	public static void execute(ItemStack itemstack) {
		if (itemstack.isDamageableItem()) {
			itemstack.set(() -> DataComponents.UNBREAKABLE, new Unbreakable(true));
		}
	}
}
