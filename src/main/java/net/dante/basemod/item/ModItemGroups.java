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
    /*public static final ItemGroup EXAMPLE_THINGS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BaseMod.MOD_ID, "example_things"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.EXAMPLE_ITEM ))
                    .displayName(Text.translatable("itemgroup.basemod.example_things"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.EXAMPLE_ITEM);
                        /*entries.add(ModBlocks.EXAMPLE_BLOCK);

                        entries.add(ModBlocks.LONG_NOSE_BLOCK);

                        entries.add(ModBlocks.EXAMPLE_STAIRS);
                        entries.add(ModBlocks.EXAMPLE_SLAB);

                        entries.add(ModBlocks.EXAMPLE_FENCE);
                        entries.add(ModBlocks.EXAMPLE_FENCE_GATE);
                        entries.add(ModBlocks.EXAMPLE_WALL);
                    }).build());*/

    public static final ItemGroup BASE_MOD_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BaseMod.MOD_ID, "base_mod_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.AMETHYST_GRASS_BLOCK))
                    .displayName(Text.translatable("itemgroup.basemod.base_mod_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BLACK_ROCK_BRICKS);
                        entries.add(ModBlocks.BLACK_ROCK);
                        entries.add(ModBlocks.SMOOTH_BLACK_ROCK);

                        entries.add(ModBlocks.BLACK_ROCK_STAIRS);
                        entries.add(ModBlocks.BLACK_ROCK_SLAB);
                        entries.add(ModBlocks.BLACK_ROCK_WALL);

                        entries.add(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
                        entries.add(ModBlocks.BLACK_ROCK_BRICK_SLAB);
                        entries.add(ModBlocks.BLACK_ROCK_BRICK_WALL);

                        entries.add(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
                        entries.add(ModBlocks.SMOOTH_BLACK_ROCK_SLAB);
                        entries.add(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

                        entries.add(ModBlocks.AMETHYST_GRASS_BLOCK);
                        entries.add(ModBlocks.AMETHYST_LOG);
                        entries.add(ModBlocks.AMETHYST_PLANKS);
                        entries.add(ModBlocks.AMETHYST_LEAVES);
                        entries.add(ModBlocks.WITHERED_GRASS);

                        entries.add(ModBlocks.GILDED_QUARTZ_BRICKS);
                        entries.add(ModBlocks.GILDED_QUARTZ_BRICK_STAIRS);
                        entries.add(ModBlocks.GILDED_QUARTZ_SLAB);

                    }).build());

    public static void registerItemGroups(){
        BaseMod.LOGGER.info("Registering Item Groups for " + BaseMod.MOD_ID);
    }
}
