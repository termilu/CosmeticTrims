package com.termilu.cosmetictrims.item;

import com.termilu.cosmetictrims.CosmeticTrims;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public class ModItems {

/*  1.21.1 way of registering items
    public static final Item CHEF_HAT = registerItem("chef_hat", new Item(new Item.Settings()));

    1.21.1 way of Registering item with unique identifier
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(CosmeticTrims.MOD_ID, name), item);
    }
*/
    // 1.21.5 way of registering items
    public static final Item CHEF_HAT = registerItem("chef_hat", Item::new, new Item.Settings());

    public static final Item CHEF_HAT2 = registerItem("chef_hat2", PolymerBackedItem::new, new Item.Settings());

    public static Item registerItem(String name, Function<Item.Settings, Item> itemFactory, Item.Settings settings) {
        // Create the item key.
        RegistryKey<Item> itemKey = RegistryKey.of(RegistryKeys.ITEM, Identifier.of(CosmeticTrims.MOD_ID, name));

        // Create the item instance.
        Item item = itemFactory.apply(settings.registryKey(itemKey));

        // Register the item.
        Registry.register(Registries.ITEM, itemKey, item);

        return item;
    }

    private static void customIngredients(FabricItemGroupEntries entries){
        entries.add(CHEF_HAT);
    }

    // This class is used to register items in the mod
    public static void registerModItems() {
        CosmeticTrims.LOGGER.info("Registering Mod Items for " + CosmeticTrims.MOD_ID);

        // Register the item group
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::customIngredients);
    }

}
