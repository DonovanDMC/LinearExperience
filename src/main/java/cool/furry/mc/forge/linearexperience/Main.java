package cool.furry.mc.forge.linearexperience;

import cool.furry.mc.forge.linearexperience.config.Config;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import org.apache.logging.log4j.LogManager;

@Mod(Main.MOD_ID)
public class Main {
    public static final String MOD_ID = "linearexperience";
    @SuppressWarnings("unused")
    public static final org.apache.logging.log4j.Logger Logger = LogManager.getLogger();

    public Main() {

        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, Config.Spec, "linear-experience.toml");
    }
}
