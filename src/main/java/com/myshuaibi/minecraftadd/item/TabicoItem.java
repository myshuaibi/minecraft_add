
package com.myshuaibi.minecraftadd.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TabicoItem extends Item {
	public TabicoItem() {
		super(new Item.Properties().stacksTo(1).rarity(Rarity.EPIC));
	}
}
