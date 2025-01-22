package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import com.myshuaibi.minecraftadd.init.MinecraftAddModItems;

public class WorldhearttoolsblockaddprocessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (!((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK || (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BARRIER
				|| (world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COMMAND_BLOCK)
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get())
				&& !(entity instanceof Player _plrCldCheck10 && _plrCldCheck10.getCooldowns().isOnCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get()))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.COMMAND_BLOCK.defaultBlockState(), 3);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get(), 800);
		}
	}
}
