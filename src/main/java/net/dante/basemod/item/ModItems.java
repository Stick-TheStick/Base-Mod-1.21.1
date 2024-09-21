package net.dante.basemod.item;

import net.dante.basemod.BaseMod;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    //register for mods
    public static final Item EXAMPLE_ITEM = registerItem("example_item", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(BaseMod.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BaseMod.LOGGER.info("Registering Mod Items for" + BaseMod.MOD_ID);
    //Inventory slot for items
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(EXAMPLE_ITEM);
        });
    }
}
