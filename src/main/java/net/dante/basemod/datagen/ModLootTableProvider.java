package net.dante.basemod.datagen;

import net.dante.basemod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
// Full Blocks
        //addDrop(ModBlocks.EXAMPLE_BLOCK);
        addDrop(ModBlocks.LONG_NOSE_BLOCK);
        addDrop(ModBlocks.BLACK_ROCK_BRICKS);
        addDrop(ModBlocks.BLACK_ROCK);
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK);
        addDrop(ModBlocks.AMETHYST_GRASS_BLOCK);
        addDrop(ModBlocks.AMETHYST_LEAVES);
        addDrop(ModBlocks.AMETHYST_LOG);
        addDrop(ModBlocks.GILDED_QUARTZ_BRICKS);

// Stairs
        //addDrop(ModBlocks.EXAMPLE_STAIRS);
        addDrop(ModBlocks.BLACK_ROCK_STAIRS);
        addDrop(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
        addDrop(ModBlocks.GILDED_QUARTZ_BRICK_STAIRS);

// Slabs
        //addDrop(ModBlocks.EXAMPLE_SLAB, slabDrops(ModBlocks.EXAMPLE_SLAB));
        addDrop(ModBlocks.BLACK_ROCK_SLAB, slabDrops(ModBlocks.BLACK_ROCK_SLAB));
        addDrop(ModBlocks.BLACK_ROCK_BRICK_SLAB, slabDrops(ModBlocks.BLACK_ROCK_BRICK_SLAB));
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK_SLAB, slabDrops(ModBlocks.SMOOTH_BLACK_ROCK_SLAB));

// Walls
        //addDrop(ModBlocks.EXAMPLE_WALL);
        addDrop(ModBlocks.BLACK_ROCK_WALL);
        addDrop(ModBlocks.BLACK_ROCK_BRICK_WALL);
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

// Fences and Gates
        //addDrop(ModBlocks.EXAMPLE_FENCE);
        //addDrop(ModBlocks.EXAMPLE_FENCE_GATE);
    }


    /// We only need this for very special block drops
    /*public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));*/
}
