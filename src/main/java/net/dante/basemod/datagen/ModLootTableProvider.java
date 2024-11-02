package net.dante.basemod.datagen;

import net.dante.basemod.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModLootTableProvider extends FabricBlockLootTableProvider {

    public ModLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.EXAMPLE_BLOCK);

        addDrop(ModBlocks.LONG_NOSE_BLOCK);

        addDrop(ModBlocks.BLACK_ROCK_BRICKS);
        addDrop(ModBlocks.BLACK_ROCK);
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK);

        addDrop(ModBlocks.EXAMPLE_STAIRS);
        addDrop(ModBlocks.EXAMPLE_SLAB, slabDrops(ModBlocks.EXAMPLE_SLAB));

        addDrop(ModBlocks.EXAMPLE_FENCE);
        addDrop(ModBlocks.EXAMPLE_FENCE_GATE);
        addDrop(ModBlocks.EXAMPLE_WALL);

        addDrop(ModBlocks.BLACK_ROCK_STAIRS);
        addDrop(ModBlocks.BLACK_ROCK_SLAB, slabDrops(ModBlocks.BLACK_ROCK_SLAB));
        addDrop(ModBlocks.BLACK_ROCK_WALL);

        addDrop(ModBlocks.BLACK_ROCK_BRICK_STAIRS);
        addDrop(ModBlocks.BLACK_ROCK_BRICK_SLAB, slabDrops(ModBlocks.BLACK_ROCK_BRICK_SLAB));
        addDrop(ModBlocks.BLACK_ROCK_BRICK_WALL);

        addDrop(ModBlocks.SMOOTH_BLACK_ROCK_STAIRS);
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK_SLAB, slabDrops(ModBlocks.SMOOTH_BLACK_ROCK_SLAB));
        addDrop(ModBlocks.SMOOTH_BLACK_ROCK_WALL);

        addDrop(ModBlocks.AMETHYST_GRASS_BLOCK);
        addDrop(ModBlocks.AMETHYST_LEAVES);
    }


    /// We only need this for very special block drops
    /*public LootTable.Builder multipleOreDrops(Block drop, Item item, float minDrops, float maxDrops) {
        RegistryWrapper.Impl<Enchantment> impl = this.registryLookup.getWrapperOrThrow(RegistryKeys.ENCHANTMENT);
        return this.dropsWithSilkTouch(drop, this.applyExplosionDecay(drop, ((LeafEntry.Builder<?>)
                ItemEntry.builder(item).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(minDrops, maxDrops))))
                .apply(ApplyBonusLootFunction.oreDrops(impl.getOrThrow(Enchantments.FORTUNE)))));*/
}
