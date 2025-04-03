package net.dante.basemod.block;

import net.dante.basemod.BaseMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

import java.util.function.Function;

import static net.minecraft.block.Blocks.register;
import static net.minecraft.item.Items.register;

public class ModBlocks {

    // Registry Keys for Blocks
    private static final RegistryKey<Block> LONG_NOSE_BLOCK_KEY = createBlockKey("long_nose_block");
    private static final RegistryKey<Block> BLACK_ROCK_BRICKS_KEY = createBlockKey("black_rock_bricks");
    private static final RegistryKey<Block> GILDED_QUARTZ_BRICKS_KEY = createBlockKey("gilded_quartz_bricks");
    private static final RegistryKey<Block> BLACK_ROCK_KEY = createBlockKey("black_rock");
    private static final RegistryKey<Block> SMOOTH_BLACK_ROCK_KEY = createBlockKey("smooth_black_rock");
    private static final RegistryKey<Block> AMETHYST_GRASS_BLOCK_KEY = createBlockKey("amethyst_grass_block");
    private static final RegistryKey<Block> WITHERED_GRASS_BLOCK_KEY = createBlockKey("withered_grass_block");
    private static final RegistryKey<Block> AMETHYST_LEAVES_KEY = createBlockKey("amethyst_leaves");
    private static final RegistryKey<Block> AMETHYST_LOG_KEY = createBlockKey("amethyst_log");
    private static final RegistryKey<Block> AMETHYST_PLANKS_KEY = createBlockKey("amethyst_planks");
    private static final RegistryKey<Block> HEAVY_STONE_BRICKS_KEY = createBlockKey("heavy_stone_bricks");
    private static final RegistryKey<Block> HEAVY_STONE_TILES_KEY = createBlockKey("heavy_stone_tiles");

    // Full Blocks
    public static final Block LONG_NOSE_BLOCK = registerBlock(LONG_NOSE_BLOCK_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.CANDLE));
    public static final Block BLACK_ROCK_BRICKS = registerBlock(BLACK_ROCK_BRICKS_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block GILDED_QUARTZ_BRICKS = registerBlock(GILDED_QUARTZ_BRICKS_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE_BRICKS));
    public static final Block BLACK_ROCK = registerBlock(BLACK_ROCK_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block SMOOTH_BLACK_ROCK = registerBlock(SMOOTH_BLACK_ROCK_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.DEEPSLATE));
    public static final Block AMETHYST_GRASS_BLOCK = registerBlock(AMETHYST_GRASS_BLOCK_KEY, GrassBlock::new,
            AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.GRASS));
    public static final Block WITHERED_GRASS_BLOCK = registerBlock(WITHERED_GRASS_BLOCK_KEY, GrassBlock::new,
            AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.GRASS));
    public static final Block AMETHYST_LEAVES = registerBlock(AMETHYST_LEAVES_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).nonOpaque().sounds(BlockSoundGroup.CHERRY_LEAVES).nonOpaque());
    public static final Block AMETHYST_LOG = registerBlock(AMETHYST_LOG_KEY, PillarBlock::new,
            AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WOOD));
    public static final Block AMETHYST_PLANKS = registerBlock(AMETHYST_PLANKS_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.WOOD));
    public static final Block HEAVY_STONE_BRICKS = registerBlock(HEAVY_STONE_BRICKS_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE));
    public static final Block HEAVY_STONE_TILES = registerBlock(HEAVY_STONE_TILES_KEY, Block::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool().sounds(BlockSoundGroup.STONE));

    // Stairs
    public static final Block BLACK_ROCK_STAIRS = registerBlock(createBlockKey("black_rock_stairs"),
            settings -> new StairsBlock(BLACK_ROCK.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block BLACK_ROCK_BRICK_STAIRS = registerBlock(createBlockKey("black_rock_brick_stair"),
            settings -> new StairsBlock(BLACK_ROCK_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block SMOOTH_BLACK_ROCK_STAIRS = registerBlock(createBlockKey("smooth_black_rock_stairs"),
            settings -> new StairsBlock(SMOOTH_BLACK_ROCK.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block GILDED_QUARTZ_BRICK_STAIRS = registerBlock(createBlockKey("gilded_quartz_brick_stairs"),
            settings -> new StairsBlock(GILDED_QUARTZ_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block AMETHYST_PLANK_STAIRS = registerBlock(createBlockKey("amethyst_plank_stairs"),
            settings -> new StairsBlock(AMETHYST_PLANKS.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block HEAVY_STONE_BRICK_STAIRS = registerBlock(createBlockKey("heavy_stone_brick_stairs"),
            settings -> new StairsBlock(HEAVY_STONE_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block HEAVY_STONE_TILE_STAIRS = registerBlock(createBlockKey("heavy_stone_tile_stairs"),
            settings -> new StairsBlock(HEAVY_STONE_BRICKS.getDefaultState(), settings),
            AbstractBlock.Settings.create().strength(1f).requiresTool());

    // Slabs
    public static final Block BLACK_ROCK_SLAB = registerBlock(createBlockKey("black_rock_slab"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block BLACK_ROCK_BRICK_SLAB = registerBlock(createBlockKey("black_rock_brick_slab"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block SMOOTH_BLACK_ROCK_SLAB = registerBlock(createBlockKey("smooth_black_rock_slab"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block GILDED_QUARTZ_SLAB = registerBlock(createBlockKey("gilded_quartz_slab"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block AMETHYST_PLANK_SLAB = registerBlock(createBlockKey("amethyst_plank_slabs"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block HEAVY_STONE_BRICK_SLAB = registerBlock(createBlockKey("heavy_stone_brick_slab"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block HEAVY_STONE_TILE_SLAB = registerBlock(createBlockKey("heavy_stone_tile_slab"), SlabBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());

    // Walls
    public static final Block BLACK_ROCK_WALL = registerBlock(createBlockKey("black_rock_wall"), WallBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block BLACK_ROCK_BRICK_WALL = registerBlock(createBlockKey("black_rock_brick_wall"), WallBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block SMOOTH_BLACK_ROCK_WALL = registerBlock(createBlockKey("smooth_black_rock_wall"), WallBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block GILDED_QUARTZ_BRICK_WALL = registerBlock(createBlockKey("gilded_quartz_brick_wall"), WallBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block HEAVY_STONE_BRICK_WALL = registerBlock(createBlockKey("heavy_stone_brick_wall"), WallBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());
    public static final Block HEAVY_STONE_TILE_WALL = registerBlock(createBlockKey("heavy_stone_tile_wall"), WallBlock::new,
            AbstractBlock.Settings.create().strength(1f).requiresTool());

    // 2D blocks
    public static final Block WITHERED_GRASS = registerBlock(createBlockKey("withered_grass"), ShortPlantBlock::new,
            AbstractBlock.Settings.create().noCollision().burnable().breakInstantly().nonOpaque()
                    .sounds(BlockSoundGroup.GRASS));

    // Fences
    public static final Block AMETHYST_PLANK_FENCE = registerBlock(createBlockKey("amethyst_plank_fence"), FenceBlock::new,
            AbstractBlock.Settings.create().strength(2f).requiresTool());

    // Gates
    public static final Block AMETHYST_PLANK_FENCE_GATE = registerBlock(createBlockKey("amethyst_plank_fence_gate"),
            settings -> new FenceGateBlock(WoodType.DARK_OAK, settings),
            AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.WOOD));

    private static RegistryKey<Block> createBlockKey(String name) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.of(BaseMod.MOD_ID, name));
    }

    private static Block registerBlock(RegistryKey<Block> key, Function<AbstractBlock.Settings, Block> factory,
                                       AbstractBlock.Settings settings) {
        final Block block = register(key, factory, settings);
        register(block); // Register the BlockItem automatically
        return block;
    }

    public static void registerModBlocks() {
        BaseMod.LOGGER.info("Registering Blocks for " + BaseMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            // Amethyst
            entries.add(AMETHYST_GRASS_BLOCK);
            entries.add(AMETHYST_LEAVES);
            entries.add(AMETHYST_LOG);
            entries.add(AMETHYST_PLANKS);
            entries.add(AMETHYST_PLANK_STAIRS);
            entries.add(AMETHYST_PLANK_SLAB);
            entries.add(AMETHYST_PLANK_FENCE);
            entries.add(AMETHYST_PLANK_FENCE_GATE);

            // Black Rock
            entries.add(BLACK_ROCK);
            entries.add(BLACK_ROCK_STAIRS);
            entries.add(BLACK_ROCK_SLAB);
            entries.add(BLACK_ROCK_WALL);

            // Black Rock Bricks
            entries.add(BLACK_ROCK_BRICKS);
            entries.add(BLACK_ROCK_BRICK_STAIRS);
            entries.add(BLACK_ROCK_BRICK_SLAB);
            entries.add(BLACK_ROCK_BRICK_WALL);

            // Gilded Quartz
            entries.add(GILDED_QUARTZ_BRICKS);
            entries.add(GILDED_QUARTZ_BRICK_STAIRS);
            entries.add(GILDED_QUARTZ_SLAB);
            entries.add(GILDED_QUARTZ_BRICK_WALL);

            // Smooth Black Rock
            entries.add(SMOOTH_BLACK_ROCK);
            entries.add(SMOOTH_BLACK_ROCK_STAIRS);
            entries.add(SMOOTH_BLACK_ROCK_SLAB);
            entries.add(SMOOTH_BLACK_ROCK_WALL);

            // Withered Blocks
            entries.add(WITHERED_GRASS_BLOCK);
            entries.add(WITHERED_GRASS);

            // Heavy Bricks
            entries.add(HEAVY_STONE_BRICKS);
            entries.add(HEAVY_STONE_BRICK_STAIRS);
            entries.add(HEAVY_STONE_BRICK_SLAB);
            entries.add(HEAVY_STONE_BRICK_WALL);

            // Heavy Stone Tiles
            entries.add(HEAVY_STONE_TILES);
            entries.add(HEAVY_STONE_TILE_SLAB);
            entries.add(HEAVY_STONE_TILE_STAIRS);
            entries.add(HEAVY_STONE_TILE_WALL);
        });
    }
}