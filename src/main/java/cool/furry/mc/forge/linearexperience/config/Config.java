package cool.furry.mc.forge.linearexperience.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class Config {
    public static final ForgeConfigSpec.Builder Builder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec Spec;
    public static final ForgeConfigSpec.ConfigValue<Integer> linearStart = Builder.comment("The level after which the needed experience does not change.").defineInRange("linearStart", 30, 1, Integer.MAX_VALUE);
    static { Spec = Builder.build(); }
}
