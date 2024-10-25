package net.dante.basemod.datagen;

import net.dante.basemod.block.ModBlocks;
import net.dante.basemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool examplePool =  blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.EXAMPLE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LONG_NOSE_BLOCK);

        BlockStateModelGenerator.BlockTexturePool blackRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_ROCK);
        BlockStateModelGenerator.BlockTexturePool blackRockBricksPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.BLACK_ROCK_BRICKS);
        BlockStateModelGenerator.BlockTexturePool smoothBlackRockPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SMOOTH_BLACK_ROCK);

        examplePool.stairs(ModBlocks.EXAMPLE_STAIRS);
        examplePool.slab(ModBlocks.EXAMPLE_SLAB);
        examplePool.fence(ModBlocks.EXAMPLE_FENCE);
        examplePool.fenceGate(ModBlocks.EXAMPLE_FENCE_GATE);
        examplePool.wall(ModBlocks.EXAMPLE_WALL);

        blackRockPool.stairs(ModBlocks.BLACK_ROCK_STAIRS);
        blackRockPool.slab(ModBlocks.BLACK_ROCK_SLAB);
        blackRockPool.wall(ModBlocks.BLACK_ROCK_WALL);

        blackRockBricksPool.stairs(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
        blackRockBricksPool.slab(ModBlocks.BLACK_ROCK_BRICK_SLAB);
        blackRockBricksPool.wall(ModBlocks.BLACK_ROCK_BRICK_WALL);

        smoothBlackRockPool.stairs(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
        smoothBlackRockPool.slab(ModBlocks.SMOOTH_BLACK_ROCK_SLAB);
        smoothBlackRockPool.wall(ModBlocks.SMOOTH_BLACK_ROCK_WALL);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.EXAMPLE_ITEM, Models.GENERATED);
    }
}
