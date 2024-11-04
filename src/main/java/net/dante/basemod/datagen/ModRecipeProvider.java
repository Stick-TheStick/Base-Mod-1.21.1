package net.dante.basemod.datagen;

import net.dante.basemod.block.ModBlocks;
import net.dante.basemod.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        List<ItemConvertible> EXAMPLE_ITEM_SMELTABLES = List.of(ModItems.EXAMPLE_ITEM, ModBlocks.EXAMPLE_BLOCK,
                ModBlocks.EXAMPLE_BLOCK);

        offerSmelting(exporter, EXAMPLE_ITEM_SMELTABLES, RecipeCategory.MISC, ModItems.EXAMPLE_ITEM, .25f, 200, "example_item");

    }
}
