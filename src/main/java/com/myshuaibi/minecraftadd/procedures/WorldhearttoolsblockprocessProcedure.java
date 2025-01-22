package com.myshuaibi.minecraftadd.procedures;

import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import javax.annotation.Nullable;

import com.myshuaibi.minecraftadd.init.MinecraftAddModItems;

@EventBusSubscriber
public class WorldhearttoolsblockprocessProcedure {
	@SubscribeEvent
	public static void onLeftClickBlock(PlayerInteractEvent.LeftClickBlock event) {
		execute(event, event.getLevel(), event.getPos().getX(), event.getPos().getY(), event.getPos().getZ(), event.getEntity());
	}

	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		execute(null, world, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BEDROCK
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get())
				&& !(entity instanceof Player _plrCldCheck6 && _plrCldCheck6.getCooldowns().isOnCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get()))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BEDROCK));
				entityToSpawn.setPickUpDelay(30);
				_level.addFreshEntity(entityToSpawn);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get(), 200);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.BARRIER
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get())
				&& !(entity instanceof Player _plrCldCheck16 && _plrCldCheck16.getCooldowns().isOnCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get()))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.BARRIER));
				entityToSpawn.setPickUpDelay(30);
				_level.addFreshEntity(entityToSpawn);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get(), 500);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == Blocks.COMMAND_BLOCK
				&& ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get()
						|| (entity instanceof LivingEntity _livEnt ? _livEnt.getOffhandItem() : ItemStack.EMPTY).getItem() == MinecraftAddModItems.WORLD_HEART_TOOLS.get())
				&& !(entity instanceof Player _plrCldCheck26 && _plrCldCheck26.getCooldowns().isOnCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get()))) {
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(Blocks.COMMAND_BLOCK));
				entityToSpawn.setPickUpDelay(30);
				_level.addFreshEntity(entityToSpawn);
			}
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(MinecraftAddModItems.WORLD_HEART_TOOLS.get(), 1000);
		}
	}
}
