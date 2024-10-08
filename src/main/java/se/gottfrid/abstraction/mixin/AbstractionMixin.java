package se.gottfrid.abstraction.mixin;

import se.gottfrid.abstraction.AbstractionMain;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class AbstractionMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		AbstractionMain.LOGGER.info("This line is printed by " + AbstractionMain.NAME + " mixin");
	}
}
