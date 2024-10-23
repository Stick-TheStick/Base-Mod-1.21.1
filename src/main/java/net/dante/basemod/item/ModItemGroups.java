package net.dante.basemod.item;

import net.dante.basemod.BaseMod;
import net.dante.basemod.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup EXAMPLE_THINGS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BaseMod.MOD_ID, "example_things"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM ))
                    .displayName(Text.translatable("itemgroup.basemod.example_things"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EXAMPLE_ITEM);
                        entries.add(ModBlocks.EXAMPLE_BLOCK);

                        entries.add(ModBlocks.LONG_NOSE_BLOCK);

                        entries.add(ModBlocks.EXAMPLE_STAIRS);
                        entries.add(ModBlocks.EXAMPLE_SLAB);
                    }).build());


    public static void registerItemGroups(){
        BaseMod.LOGGER.info("Registering Item Groups for " + BaseMod.MOD_ID);
    }
}
