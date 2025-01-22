package com.myshuaibi.minecraftadd.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class CustomModConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;
	public static final ModConfigSpec.ConfigValue<Boolean> ENDER_DRAGON_ENHANCED;
	static {
		ENDER_DRAGON_ENHANCED = BUILDER.comment("Controls whether the ender dragon is enhanced, and if it is, killing the ender dragon spawned 6th time or later will drop the \"Transposition\" enchanted book").define("Ender dragon enhanced", true);

		SPEC = BUILDER.build();
	}

}
