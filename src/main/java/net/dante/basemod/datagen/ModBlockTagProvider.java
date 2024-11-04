package net.dante.basemod.datagen;

import net.dante.basemod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }
//Used for making new properties for blocks
    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

// Full Blocks
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLACK_ROCK_BRICKS)
                .add(ModBlocks.BLACK_ROCK)
                .add(ModBlocks.SMOOTH_BLACK_ROCK)
                .add(ModBlocks.GILDED_QUARTZ_BRICKS)
                .add(ModBlocks.AMETHYST_LOG);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLACK_ROCK_BRICKS)
                .add(ModBlocks.BLACK_ROCK)
                .add(ModBlocks.SMOOTH_BLACK_ROCK);

        getOrCreateTagBuilder(BlockTags.DIRT)
                .add(ModBlocks.AMETHYST_GRASS_BLOCK);

        getOrCreateTagBuilder(BlockTags.LOGS_THAT_BURN)
                .add(ModBlocks.AMETHYST_LOG);

        //Supposed to be leaves
        getOrCreateTagBuilder(BlockTags.LEAVES)
                .add(ModBlocks.AMETHYST_LEAVES);

// Stairs
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLACK_ROCK_STAIRS)
                .add(ModBlocks.BLACK_ROCK_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.GILDED_QUARTZ_BRICK_STAIRS)
                .add(ModBlocks.BLACK_ROCK_BRICK_STAIRS)
                .add(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);

// Slabs
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLACK_ROCK_SLAB)
                .add(ModBlocks.BLACK_ROCK_BRICK_SLAB);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLACK_ROCK_SLAB)
                .add(ModBlocks.BLACK_ROCK_BRICK_SLAB);

// Walls
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.BLACK_ROCK_WALL)
                .add(ModBlocks.BLACK_ROCK_BRICK_WALL)
                .add(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.BLACK_ROCK_WALL)
                .add(ModBlocks.BLACK_ROCK_BRICK_WALL)
                .add(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

        getOrCreateTagBuilder(BlockTags.WALLS)
                .add(ModBlocks.EXAMPLE_WALL)
                .add(ModBlocks.BLACK_ROCK_WALL)
                .add(ModBlocks.BLACK_ROCK_BRICK_WALL)
                .add(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

// Fences and Gates
        getOrCreateTagBuilder(BlockTags.FENCES)
                .add(ModBlocks.EXAMPLE_FENCE);

        getOrCreateTagBuilder(BlockTags.FENCE_GATES)
                .add(ModBlocks.EXAMPLE_FENCE_GATE);
    }

}
