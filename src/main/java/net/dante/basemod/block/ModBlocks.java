package net.dante.basemod.block;

import net.dante.basemod.BaseMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block EXAMPLE_BLOCK = registerBlock("example_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block EXAMPLE_STAIRS = registerBlock("example_stairs",
            new StairsBlock(ModBlocks.EXAMPLE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block EXAMPLE_SLAB = registerBlock("example_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block LONG_NOSE_BLOCK = registerBlock("long_nose_block",
            new Block(AbstractBlock.Settings.create().strength(1f).
                    sounds(BlockSoundGroup.CANDLE)));

    public static final Block BLACK_ROCK_BRICKS = registerBlock("black_rock_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block BLACK_ROCK = registerBlock("black_rock",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.GILDED_BLACKSTONE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BaseMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block){
        Registry.register(Registries.ITEM, Identifier.of(BaseMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BaseMod.LOGGER.info("Registering Blocks for" + BaseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {

            entries.add(ModBlocks.EXAMPLE_BLOCK);
            entries.add(ModBlocks.LONG_NOSE_BLOCK);

            entries.add(ModBlocks.BLACK_ROCK_BRICKS);
            entries.add(ModBlocks.BLACK_ROCK);
        });
    }
}
