package net.dante.basemod;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.exceptions.CommandSyntaxException;
import net.dante.basemod.block.ModBlocks;
import net.dante.basemod.item.ModItemGroups;
import net.dante.basemod.item.ModItems;
import net.fabricmc.api.ModInitializer;


import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerLifecycleEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.network.ClientConnection;
import net.minecraft.network.packet.s2c.common.DisconnectS2CPacket;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.util.WorldSavePath;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Objects;

import net.minecraft.text.Text;

public class BaseMod implements ModInitializer {
	public static final String MOD_ID = "basemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	private boolean kickCondition = false;

	@Override
	public void onInitialize() {
		ServerLifecycleEvents.SERVER_STARTED.register(this::getDataPack);

		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		// Register client tick event
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			// Check if the client is in a world and if kick condition is met
			if (client.world != null && kickCondition) {
				kickLocalPlayer();
			}
		});
	}

	private void getDataPack(MinecraftServer server) {
		// Get the path to the world save directory and path for the original datapack
		Path saveDir = server.getSavePath(WorldSavePath.ROOT);
		Path datapacksPath = saveDir.resolve("datapacks");

		System.out.println("Datapacks folder path: " + datapacksPath.toAbsolutePath());

		// Check if the "height_data_pack" exists in the datapacks folder
		Path heightDataPack = Paths.get(datapacksPath.toString(), "height_data_pack");

		if (Files.exists(heightDataPack) && Files.isDirectory(datapacksPath)) {
			System.out.println("The 'height_data_pack' datapack is present.");
			kickCondition = false;
		} else {
			System.out.println("The 'height_data_pack' datapack is not found. Time to Dupe");
			DuplicateDataPack(datapacksPath);
		}

	}

	private void DuplicateDataPack(Path requiredPath){
        Path sourceDirectory = Paths.get("").toAbsolutePath();

		while (!sourceDirectory.endsWith("Base-Mod-1.21.1")) {
			sourceDirectory = sourceDirectory.getParent();
			if (sourceDirectory == null) {
				throw new IllegalStateException("Project root not found.");
			}
		}

		// Append the desired folder path from the root
		sourceDirectory = sourceDirectory.resolve("src/main/resources/datapack");
		System.out.println("Specific folder: " + sourceDirectory);

		try {
			Path finalSourceDirectory = sourceDirectory;
			Files.walkFileTree(sourceDirectory, new SimpleFileVisitor<>() {
                @Override
                public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                    Path targetDir = requiredPath.resolve(finalSourceDirectory.relativize(dir));
                    Files.createDirectories(targetDir);
                    return FileVisitResult.CONTINUE;
                }

                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    Files.copy(file, requiredPath.resolve(finalSourceDirectory.relativize(file)), StandardCopyOption.REPLACE_EXISTING);
                    System.out.println("The data pack was placed");

                    kickCondition = true;

                    executeCommand();

                    return FileVisitResult.CONTINUE;
                }
            });
		} catch (IOException e) {
			System.out.println();
			e.printStackTrace();
		}
	}

	public void executeCommand() {
		MinecraftClient client = MinecraftClient.getInstance();
		MinecraftServer server = client.getServer();

		if (server != null) {
			CommandManager commandManager = server.getCommandManager();
			ServerCommandSource commandSource = server.getCommandSource();

			CommandDispatcher<ServerCommandSource> dispatcher = commandManager.getDispatcher();
			// Parse the command
			var parseResults = dispatcher.parse("reload", commandSource);

			// Now execute the parsed command
			try {
				dispatcher.execute(parseResults);
				System.out.println("executed");

            } catch (CommandSyntaxException e) {
                throw new RuntimeException(e);
            }
        }
	}

	private void kickLocalPlayer() {
		kickCondition = false;

		MinecraftClient client = MinecraftClient.getInstance();

		// Create a message to display when the player is kicked
		String kickMessage = "Rejoin the world for the increased build height to work";

        assert client.player != null;
        client.player.sendMessage(Text.literal(kickMessage), true);

		// Get the client connection
		ClientConnection connection = Objects.requireNonNull(client.getNetworkHandler()).getConnection();

		// Disconnect the local player using the Disconnect packet
		connection.send(new DisconnectS2CPacket(Text.literal(kickMessage)));
		connection.disconnect(Text.literal(kickMessage));
	}

}
