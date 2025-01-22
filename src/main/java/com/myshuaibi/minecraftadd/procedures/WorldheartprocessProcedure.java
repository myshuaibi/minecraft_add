package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class WorldheartprocessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COMMAND_BLOCK) == false) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.COMMAND_BLOCK.defaultBlockState(), 3);
			itemstack.shrink(1);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 2000);
		}
	}
}
