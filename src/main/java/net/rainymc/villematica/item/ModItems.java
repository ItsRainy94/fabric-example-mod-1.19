package net.rainymc.villematica.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.rainymc.villematica.VilleMatica;

public class ModItems {

    public static final Item ENDER_DUST = registerItem("ender_dust",
          new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ENDER_SHARD = registerItem("ender_shard",
          new Item(new FabricItemSettings().group(ItemGroup.MISC)));
    public static final Item ENDER_AMULET = registerItem("ender_amulet",
          new Item(new FabricItemSettings().group(ItemGroup.MISC)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(VilleMatica.MOD_ID, name), item);
    }

    public static void registerModItems() {
        VilleMatica.LOGGER.debug("Registering Mod Items for " + VilleMatica.MOD_ID);
    }
}
