package net.aftersans53228.aft_fabroads.mixin;

import net.aftersans53228.aft_fabroads.FabroadsMod;
import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class FabroadsMixin {/*
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		FabroadsMod.LOGGER.info("aft's fabroads running...");
	}
	*/
}
