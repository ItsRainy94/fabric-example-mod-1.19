package net.rainymc.villematica.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.rainymc.villematica.VilleMatica;

public class ModItemGroup {
    public static final ItemGroup ENDER = FabricItemGroupBuilder.build(
            new Identifier(VilleMatica.MOD_ID, "ender"), () -> new ItemStack(ModItems.ENDER_DUST));
    public static final ItemGroup CURSED = FabricItemGroupBuilder.build(
            new Identifier(VilleMatica.MOD_ID, "cursed"), () -> new ItemStack(ModItems.ENDER_DUST));
    public static final ItemGroup NETHER = FabricItemGroupBuilder.build(
            new Identifier(VilleMatica.MOD_ID, "nether"), () -> new ItemStack(ModItems.ENDER_DUST));
    public static final ItemGroup SINGED = FabricItemGroupBuilder.build(
            new Identifier(VilleMatica.MOD_ID, "singed"), () -> new ItemStack(ModItems.ENDER_DUST));


}
