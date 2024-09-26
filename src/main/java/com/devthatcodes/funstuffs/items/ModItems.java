package com.devthatcodes.funstuffs.items;

import com.devthatcodes.funstuffs.Funstuffs;
import com.devthatcodes.funstuffs.items.custom.Keycard;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item KEYCARD = register(new Keycard(new Item.Settings()), "keycard");

    private static Item register(Item item, String name) {
        return Registry.register(Registries.ITEM, Identifier.of(Funstuffs.MOD_ID, name), item);
    }

    public static void initialize() {
        Funstuffs.LOGGER.info("Items initialized");
    }
}
