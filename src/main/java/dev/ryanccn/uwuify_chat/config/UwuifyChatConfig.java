package dev.ryanccn.uwuify_chat.config;

import org.quiltmc.config.api.WrappedConfig;
import org.quiltmc.config.api.annotations.Comment;

public class UwuifyChatConfig extends WrappedConfig {
    @Comment("The mode to use")
    public final String mode = "prefix";

    @Comment("Prefix to use (without a trailing space in settings, but *with* trailing space when chatting)")
    public final String prefix = "[uwu]";
}
