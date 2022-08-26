package dev.ryanccn.uwuify_chat.mixin;

import dev.ryanccn.uwuify_chat.Uwuifier;

import net.minecraft.client.gui.screen.ChatScreen;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(ChatScreen.class)
public class ChatScreenMixin {
	@ModifyArg(method="keyPressed", at=@At(value="INVOKE", target="Lnet/minecraft/client/gui/screen/ChatScreen;method_44056(Ljava/lang/String;Z)Z"), index=0)
	private String uwuTheMessage(String orig) {
		return Uwuifier.uwuify(orig);
	}
}
