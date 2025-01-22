
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.myshuaibi.minecraftadd.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import com.myshuaibi.minecraftadd.MinecraftAddMod;

public class MinecraftAddModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MinecraftAddMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> ENCHANTMENT_SHAKE_SWORD_USE = REGISTRY.register("enchantment.shake_sword.use",
			() -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("minecraft_add", "enchantment.shake_sword.use")));
}
