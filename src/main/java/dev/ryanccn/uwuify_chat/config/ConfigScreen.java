package dev.ryanccn.uwuify_chat.config;

import me.shedaniel.clothconfig2.api.ConfigBuilder;
import me.shedaniel.clothconfig2.api.ConfigCategory;
import me.shedaniel.clothconfig2.api.ConfigEntryBuilder;

import net.minecraft.client.gui.screen.Screen;
import net.minecraft.text.Text;
import org.quiltmc.config.api.annotations.Comment;

import java.util.List;

public class ConfigScreen {
    public static Screen makeConfigScreen(Screen parent) {
        ConfigBuilder builder = ConfigBuilder
                .create()
                .setParentScreen(parent)
                .setTitle(Text.of("uwuify chat config"));

        ConfigCategory general = builder.getOrCreateCategory(Text.of("general"));
        ConfigEntryBuilder entryBuilder = builder.entryBuilder();

        general.addEntry(
                entryBuilder
                        .startSelector(Text.of("Mode"), List.of("global", "prefix").toArray(), UwuifyChatConfigManager.MODE.value())
                        .setDefaultValue("prefix")
                        .setTooltip(Text.of(UwuifyChatConfigManager.MODE.metadata(Comment.TYPE).iterator().next()))
                        .setSaveConsumer(newValue -> UwuifyChatConfigManager.MODE.setValue((String) newValue, true))
                        .build()
        );

        general.addEntry(
                entryBuilder
                        .startTextField(Text.of("Prefix"), UwuifyChatConfigManager.PREFIX.value())
                        .setDefaultValue("[uwu]")
                        .setTooltip(Text.of(UwuifyChatConfigManager.PREFIX.metadata(Comment.TYPE).iterator().next()))
                        .setSaveConsumer(newValue -> UwuifyChatConfigManager.PREFIX.setValue(newValue, true))
                        .build()
        );

        return builder.build();
    }
}
