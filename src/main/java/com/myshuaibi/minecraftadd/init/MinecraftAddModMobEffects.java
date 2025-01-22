
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.myshuaibi.minecraftadd.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import com.myshuaibi.minecraftadd.potion.BebedrockMobEffect;
import com.myshuaibi.minecraftadd.MinecraftAddMod;

public class MinecraftAddModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, MinecraftAddMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> BE_BEDROCK = REGISTRY.register("be_bedrock", () -> new BebedrockMobEffect());
}
