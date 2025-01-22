package com.myshuaibi.minecraftadd.procedures;

import net.minecraft.world.item.component.Unbreakable;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.core.component.DataComponents;

import com.myshuaibi.minecraftadd.init.MinecraftAddModItems;

public class ErrorarmorprocessProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double armor_wear = 0;
		if (itemstack.isDamageableItem()) {
			itemstack.set(() -> DataComponents.UNBREAKABLE, new Unbreakable(true));
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == MinecraftAddModItems.ERROR_ARMOR_HELMET.get()) {
			armor_wear = armor_wear + 1;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == MinecraftAddModItems.ERROR_ARMOR_CHESTPLATE.get()) {
			armor_wear = armor_wear + 1;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == MinecraftAddModItems.ERROR_ARMOR_LEGGINGS.get()) {
			armor_wear = armor_wear + 1;
		}
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == MinecraftAddModItems.ERROR_ARMOR_BOOTS.get()) {
			armor_wear = armor_wear + 1;
		}
		if (armor_wear >= 1) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 5, 0, false, false));
		}
		if (armor_wear >= 2) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 5, 9, false, false));
		}
		if (armor_wear == 3) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.ABSORPTION, 5, 99, false, false));
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 5, 3, false, false));
		}
		if (armor_wear == 4) {
			entity.setInvulnerable(true);
		} else {
			entity.setInvulnerable(false);
		}
	}
}
