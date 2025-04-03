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

    // Full Blocks
    /*public static final Block EXAMPLE_BLOCK = registerBlock("example_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.DEEPSLATE)));*/
    public static final Block LONG_NOSE_BLOCK = registerBlock("long_nose_block",
            new Block(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.CANDLE)));
    public static final Block BLACK_ROCK_BRICKS = registerBlock("black_rock_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block GILDED_QUARTZ_BRICKS = registerBlock("gilded_quartz_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE_BRICKS)));
    public static final Block BLACK_ROCK = registerBlock("black_rock",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block SMOOTH_BLACK_ROCK = registerBlock("smooth_black_rock",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block AMETHYST_GRASS_BLOCK = registerBlock("amethyst_grass_block",
            new GrassBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block WITHERED_GRASS_BLOCK = registerBlock("withered_grass_block",
            new GrassBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.GRASS)));
    public static final Block AMETHYST_LEAVES = registerBlock("amethyst_leaves",
            new GrassBlock(AbstractBlock.Settings.create().strength(1f).nonOpaque()
                    .sounds(BlockSoundGroup.CHERRY_LEAVES)));
    public static final Block AMETHYST_LOG = registerBlock("amethyst_log",
            new PillarBlock(AbstractBlock.Settings.create().strength(1f)
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block AMETHYST_PLANKS = registerBlock("amethyst_planks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));
    public static final Block HEAVY_STONE_BRICKS = registerBlock("heavy_stone_bricks",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));
    public static final Block HEAVY_STONE_TILES = registerBlock("heavy_stone_tiles",
            new Block(AbstractBlock.Settings.create().strength(1f).requiresTool()
                    .sounds(BlockSoundGroup.STONE)));

    // Stairs
    /*public static final Block EXAMPLE_STAIRS = registerBlock("example_stairs",
            new StairsBlock(ModBlocks.EXAMPLE_BLOCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(2f).requiresTool()));*/
    public static final Block BLACK_ROCK_STAIRS = registerBlock("black_rock_stairs",
            new StairsBlock(ModBlocks.BLACK_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_BRICK_STAIRS = registerBlock("black_rock_brick_stair",
            new StairsBlock(ModBlocks.BLACK_ROCK_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SMOOTH_BLACK_ROCK_STAIRS = registerBlock("smooth_black_rock_stairs",
            new StairsBlock(ModBlocks.SMOOTH_BLACK_ROCK.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block GILDED_QUARTZ_BRICK_STAIRS = registerBlock("gilded_quartz_brick_stairs",
            new StairsBlock(ModBlocks.GILDED_QUARTZ_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block AMETHYST_PLANK_STAIRS = registerBlock("amethyst_plank_stairs",
            new StairsBlock(ModBlocks.AMETHYST_PLANKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HEAVY_STONE_BRICK_STAIRS = registerBlock("heavy_stone_brick_stairs",
            new StairsBlock(ModBlocks.HEAVY_STONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HEAVY_STONE_TILE_STAIRS = registerBlock("heavy_stone_tile_stairs",
            new StairsBlock(ModBlocks.HEAVY_STONE_BRICKS.getDefaultState(),
                    AbstractBlock.Settings.create().strength(1f).requiresTool()));

    // Slabs
    /*public static final Block EXAMPLE_SLAB = registerBlock("example_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));*/
    public static final Block BLACK_ROCK_SLAB = registerBlock("black_rock_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_BRICK_SLAB = registerBlock("black_rock_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SMOOTH_BLACK_ROCK_SLAB = registerBlock("smooth_black_rock_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block GILDED_QUARTZ_SLAB = registerBlock("gilded_quartz_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block AMETHYST_PLANK_SLAB = registerBlock("amethyst_plank_slabs",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HEAVY_STONE_BRICK_SLAB = registerBlock("heavy_stone_brick_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HEAVY_STONE_TILE_SLAB = registerBlock("heavy_stone_tile_slab",
            new SlabBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));


    // Walls
    /*public static final Block EXAMPLE_WALL = registerBlock("example_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));*/
    public static final Block BLACK_ROCK_WALL = registerBlock("black_rock_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block BLACK_ROCK_BRICK_WALL = registerBlock("black_rock_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block SMOOTH_BLACK_ROCK_WALL = registerBlock("smooth_black_rock_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block GILDED_QUARTZ_BRICK_WALL = registerBlock("gilded_quartz_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HEAVY_STONE_BRICK_WALL = registerBlock("heavy_stone_brick_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));
    public static final Block HEAVY_STONE_TILE_WALL = registerBlock("heavy_stone_tile_wall",
            new WallBlock(AbstractBlock.Settings.create().strength(1f).requiresTool()));

    //2D blocks

    public static final Block WITHERED_GRASS = registerBlock("withered_grass",
            new ShortPlantBlock(AbstractBlock.Settings.create().noCollision().burnable().breakInstantly().nonOpaque()
                    .sounds(BlockSoundGroup.GRASS)));


    // Fences
    /*public static final Block EXAMPLE_FENCE = registerBlock("example_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
    */
     public static final Block AMETHYST_PLANK_FENCE = registerBlock("amethyst_plank_fence",
            new FenceBlock(AbstractBlock.Settings.create().strength(2f).requiresTool()));
/*
    // Gates
    public static final Block EXAMPLE_FENCE_GATE = registerBlock("example_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()));*/
    public static final Block AMETHYST_PLANK_FENCE_GATE = registerBlock("amethyst_plank_fence_gate",
            new FenceGateBlock(WoodType.DARK_OAK, AbstractBlock.Settings.create().strength(2f).requiresTool()
                    .sounds(BlockSoundGroup.WOOD)));




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
// Amethyst
            entries.add(ModBlocks.AMETHYST_GRASS_BLOCK);
            entries.add(ModBlocks.AMETHYST_LEAVES);
            entries.add(ModBlocks.AMETHYST_LOG);
            entries.add(ModBlocks.AMETHYST_PLANKS);
            entries.add(ModBlocks.AMETHYST_PLANK_STAIRS);
            entries.add(ModBlocks.AMETHYST_PLANK_SLAB);
            entries.add(ModBlocks.AMETHYST_PLANK_FENCE);
            entries.add(ModBlocks.AMETHYST_PLANK_FENCE_GATE);

// Black Rock
            entries.add(ModBlocks.BLACK_ROCK);
            entries.add(ModBlocks.BLACK_ROCK_STAIRS);
            entries.add(ModBlocks.BLACK_ROCK_SLAB);
            entries.add(ModBlocks.BLACK_ROCK_WALL);

// Black Rock Bricks
            entries.add(ModBlocks.BLACK_ROCK_BRICKS);
            entries.add(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
            entries.add(ModBlocks.BLACK_ROCK_BRICK_SLAB);
            entries.add(ModBlocks.BLACK_ROCK_BRICK_WALL);

// Gilded Quartz
            entries.add(ModBlocks.GILDED_QUARTZ_BRICKS);
            entries.add(ModBlocks.GILDED_QUARTZ_BRICK_STAIRS);
            entries.add(ModBlocks.GILDED_QUARTZ_SLAB);
            entries.add(ModBlocks.GILDED_QUARTZ_BRICK_WALL);

// Smooth Black Rock
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK);
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK_SLAB);
            entries.add(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

// Withered Blocks
            entries.add(ModBlocks.WITHERED_GRASS_BLOCK);
            entries.add(ModBlocks.WITHERED_GRASS);
// Heavy Bricks
            entries.add(ModBlocks.HEAVY_STONE_BRICKS);
            entries.add(ModBlocks.HEAVY_STONE_BRICK_STAIRS);
            entries.add(ModBlocks.HEAVY_STONE_BRICK_SLAB);
            entries.add(ModBlocks.HEAVY_STONE_BRICK_WALL);
// Heavy Stone Tiles
            entries.add((ModBlocks.HEAVY_STONE_TILES));
            entries.add((ModBlocks.HEAVY_STONE_TILE_SLAB));
            entries.add((ModBlocks.HEAVY_STONE_TILE_STAIRS));
            entries.add((ModBlocks.HEAVY_STONE_TILE_WALL));

        });
    }
}
