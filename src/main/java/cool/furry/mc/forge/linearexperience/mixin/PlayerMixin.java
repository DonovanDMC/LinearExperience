package cool.furry.mc.forge.linearexperience.mixin;

import cool.furry.mc.forge.linearexperience.config.Config;
import net.minecraft.world.entity.player.Player;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Player.class)
public class PlayerMixin {

    @Inject(method= "getXpNeededForNextLevel()I", at = {@At("HEAD")}, cancellable = true)
    public void getXpNeededForNextLevel(CallbackInfoReturnable<Integer> cir) {
        int level = this.experienceLevel;
        if(level >= Config.linearStart.get()) {
            level = Config.linearStart.get();
        }
        cir.setReturnValue(level >= 15 ? 37 + (level - 15) * 5 : 7 + level * 2);
    }

    @Shadow public int experienceLevel;
}
