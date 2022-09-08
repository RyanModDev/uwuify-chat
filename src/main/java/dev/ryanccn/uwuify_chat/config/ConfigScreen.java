package dev.ryanccn.uwuify_chat.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;

import java.util.List;

public class ConfigScreen {
    public static Screen makeConfigScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder
                .create()
                .setParentScreen(parent)
                .setTitle(Text.translatable("dev.ryanccn.uwuify_chat.config.title"));

        ConfigCategory general = builder.getOrCreateCategory(Text.translatable("dev.ryanccn.uwuify_chat.config.general"));
        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(
                entryBuilder
                        .startSelector(Text.translatable("dev.ryanccn.uwuify_chat.config.mode.name"), List.of("global", "prefix").toArray(), UwuifyChatConfigManager.MODE.value())
                        .setDefaultValue("prefix")
                        .setTooltip(Text.translatable("dev.ryanccn.uwuify_chat.config.mode.tooltip"))
                        .setSaveConsumer(newValue -> UwuifyChatConfigManager.MODE.setValue((String) newValue, true))
                        .build()
        );

        general.addEntry(
                entryBuilder
                        .startTextField(Text.translatable("dev.ryanccn.uwuify_chat.config.prefix.name"), UwuifyChatConfigManager.PREFIX.value())
                        .setDefaultValue("[uwu]")
                        .setTooltip(Text.translatable("dev.ryanccn.uwuify_chat.config.prefix.tooltip"))
                        .setSaveConsumer(newValue -> UwuifyChatConfigManager.PREFIX.setValue(newValue, true))
                        .build()
        );

        return builder.build();
    }
}
