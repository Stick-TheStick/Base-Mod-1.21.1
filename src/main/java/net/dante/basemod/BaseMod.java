package net.dante.basemod;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import net.dante.basemod.block.ModBlocks;
import net.dante.basemod.item.ModItemGroups;
import net.dante.basemod.item.ModItems;
import net.dante.basemod.world.ExampleChunkGenerator;
import net.fabricmc.api.ModInitializer;
import net.dante.basemod.world.ExampleChunkGenerator;


import net.minecraft.util.Identifier;
import net.minecraft.world.biome.source.BiomeSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseMod implements ModInitializer {
	public static final String MOD_ID = "basemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	public static final Codec<ExampleChunkGenerator> CODEC = RecordCodecBuilder.create((instance) -> {
		return instance.group(
				BiomeSource.CODEC.fieldOf("biome_source").forGetter(ExampleChunkGenerator::getBiomeSource),
				Codec.INT.fieldOf("sea_level").forGetter(ExampleChunkGenerator::getSeaLevel),
				Codec.INT.fieldOf("world_height").forGetter(ExampleChunkGenerator::getWorldHeight),
				Identifier.CODEC.fieldOf("custom_block").forGetter(ExampleChunkGenerator::getcustomBlockID)
		).apply(instance, ExampleChunkGenerator::new);
	});

	@Override
	public void onInitialize() {


		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
