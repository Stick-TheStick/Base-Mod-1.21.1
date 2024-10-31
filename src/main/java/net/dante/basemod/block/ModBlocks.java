package net.dante.basemod.block;

import net.dante.basemod.BaseMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
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

    public static final Block EXAMPLE_FENCE = registerBlock("example_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block EXAMPLE_FENCE_GATE = registerBlock("example_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK,AbstractBlock.Settings.create().strength(2f).requiresTool()));
    public static final Block EXAMPLE_WALL = registerBlock("example_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));

    public static final Block LONG_NOSE_BLOCK = registerBlock("long_nose_block",
            new Block(AbstractBlock.Settings.create().strength(1f).
                    sounds(BlockSoundGroup.CANDLE)));

    public static final Block BLACK_ROCK_BRICKS = registerBlock("black_rock_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block BLACK_ROCK = registerBlock("black_rock",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block SMOOTH_BLACK_ROCK = registerBlock("smooth_black_rock",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));

    public static final Block BLACK_ROCK_STAIRS = registerBlock("black_rock_stairs",
            new StairsBlock(ModBlocks.BLACK_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_WALL = registerBlock("black_rock_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_SLAB = registerBlock("black_rock_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    public static final Block BLACK_ROCK_BRICK_STAIRS = registerBlock("black_rock_brick_stair",
            new StairsBlock(ModBlocks.BLACK_ROCK_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_BRICK_WALL = registerBlock("black_rock_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_BRICK_SLAB = registerBlock("black_rock_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    public static final Block SMOOTH_BLACK_ROCK_STAIRS = registerBlock("smooth_black_rock_stairs",
            new StairsBlock(ModBlocks.SMOOTH_BLACK_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SMOOTH_BLACK_ROCK_WALL = registerBlock("smooth_black_rock_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SMOOTH_BLACK_ROCK_SLAB = registerBlock("smooth_black_rock_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

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
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK);
            entries.add(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
            entries.add(ModBlocks.BLACK_ROCK_BRICK_WALL);
            entries.add(ModBlocks.BLACK_ROCK_BRICK_SLAB);
            entries.add(ModBlocks.BLACK_ROCK_STAIRS);
            entries.add(ModBlocks.BLACK_ROCK_SLAB);
            entries.add(ModBlocks.BLACK_ROCK_WALL);
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK_WALL);
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK_SLAB);
        });
    }
}
