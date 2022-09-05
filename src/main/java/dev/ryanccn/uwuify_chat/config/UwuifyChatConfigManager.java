package dev.ryanccn.uwuify_chat.config;

import java.util.List;

import org.quiltmc.config.api.values.TrackedValue;
import org.quiltmc.loader.api.config.QuiltConfig;

@SuppressWarnings("unchecked")
public class UwuifyChatConfigManager {
    public static final UwuifyChatConfig CONFIG = QuiltConfig.create("uwuify_chat", "config", UwuifyChatConfig.class);

    // Features
    public static final TrackedValue<String> MODE = (TrackedValue<String>) CONFIG.getValue(List.of("mode"));

    public static final TrackedValue<String> PREFIX = (TrackedValue<String>) CONFIG.getValue(List.of("prefix"));
}
