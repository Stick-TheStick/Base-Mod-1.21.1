package net.dante.basemod.datagen;

import net.dante.basemod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        //BlockStateModelGenerator.BlockTexturePool examplePool =  blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXAMPLE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LONG_NOSE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMETHYST_LEAVES);
        blockStateModelGenerator.registerItemModel(ModBlocks.WITHERED_GRASS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WITHERED_GRASS_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.WITHERED_GRASS);



        BlockStateModelGenerator.BlockTexturePool heavybrickpool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.HEAVY_STONE_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blackRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_ROCK);
        BlockStateModelGenerator.BlockTexturePool gildedquartzPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.GILDED_QUARTZ_BRICKS);
        BlockStateModelGenerator.BlockTexturePool blackRockBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_ROCK_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothBlackRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BLACK_ROCK);
        BlockStateModelGenerator.BlockTexturePool amethystplankPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AMETHYST_PLANKS);

        //example pool

        //examplePool.stairs(ModBlocks.EXAMPLE_STAIRS);
        //examplePool.slab(ModBlocks.EXAMPLE_SLAB);
        //examplePool.fence(ModBlocks.EXAMPLE_FENCE);
        //examplePool.fenceGate(ModBlocks.EXAMPLE_FENCE_GATE);
        //examplePool.wall(ModBlocks.EXAMPLE_WALL);

        //Black Rock Pool

        blackRockPool.stairs(ModBlocks.BLACK_ROCK_STAIRS);
        blackRockPool.slab(ModBlocks.BLACK_ROCK_SLAB);
        blackRockPool.wall(ModBlocks.BLACK_ROCK_WALL);

        //Black Rock Brick Pool

        blackRockBricksPool.stairs(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
        blackRockBricksPool.slab(ModBlocks.BLACK_ROCK_BRICK_SLAB);
        blackRockBricksPool.wall(ModBlocks.BLACK_ROCK_BRICK_WALL);

        //Smooth Black Rock Pool

        smoothBlackRockPool.stairs(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
        smoothBlackRockPool.slab(ModBlocks.SMOOTH_BLACK_ROCK_SLAB);
        smoothBlackRockPool.wall(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

        //Gilded Quartz Pool

        gildedquartzPool.stairs(ModBlocks.GILDED_QUARTZ_BRICK_STAIRS);
        gildedquartzPool.slab(ModBlocks.GILDED_QUARTZ_SLAB);
        gildedquartzPool.wall(ModBlocks.GILDED_QUARTZ_BRICK_WALL);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMETHYST_GRASS_BLOCK);
        blockStateModelGenerator.registerLog(ModBlocks.AMETHYST_LOG).log(ModBlocks.AMETHYST_LOG);

        //Amethyst Plank Pool

        amethystplankPool.stairs(ModBlocks.AMETHYST_PLANK_STAIRS);
        amethystplankPool.slab(ModBlocks.AMETHYST_PLANK_SLAB);
        amethystplankPool.fence(ModBlocks.AMETHYST_PLANK_FENCE);
        amethystplankPool.fenceGate(ModBlocks.AMETHYST_PLANK_FENCE_GATE);

        //Heavy Stone Bricks Pool
        heavybrickpool.stairs(ModBlocks.HEAVY_STONE_BRICK_STAIRS);
        heavybrickpool.slab(ModBlocks.HEAVY_STONE_BRICK_SLAB);
        heavybrickpool.wall(ModBlocks.HEAVY_STONE_BRICK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.EXAMPLE_ITEM, Models.GENERATED);
    }
}
