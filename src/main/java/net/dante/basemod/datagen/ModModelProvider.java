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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.EXAMPLE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.LONG_NOSE_BLOCK);

        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_ROCK_BRICKS);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.BLACK_ROCK);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.EXAMPLE_ITEM, Models.GENERATED);
    }
}
