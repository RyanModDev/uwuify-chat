package dev.ryanccn.uwuify_chat.mixin;

import dev.ryanccn.uwuify_chat.Uwuifier;

import net.minecraft.client.gui.screen.SleepingChatScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(SleepingChatScreen.class)
public class SleepingChatScreenMixin {
	@ModifyArg(method="keyPressed", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/SleepingChatScreen;method_44056(Ljava/lang/String;Z)Z"), index=0)
	private String uwuTheMessage(String orig) {
		return Uwuifier.uwuify(orig);
	}
}
