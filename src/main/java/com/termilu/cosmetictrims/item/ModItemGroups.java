package com.termilu.cosmetictrims.item;

import com.termilu.cosmetictrims.CosmeticTrims;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // This class is used to register item groups in the mod
    // For example, you can create a custom item group for the mod's items
    // and add items to it using the FabricItemGroupBuilder class

//    // 1.21.1 way of registering item groups
//    public static final ItemGroup COSMETIC_TRIMS_GROUP = FabricItemGroupBuilder.create(
//            Identifier.of(CosmeticTrims.MOD_ID, "cosmetic_trims"))
//            .icon(() -> new ItemStack(ModItems.CHEF_HAT))
//            .build();


    public static final RegistryKey<ItemGroup> COSMETIC_TRIMS_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(CosmeticTrims.MOD_ID, "itemgroup.cosmetictrims"));
    public static final ItemGroup COSMETIC_TRIMS_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(ModItems.CHEF_HAT)).entries((displayContext, entries) -> {
                entries.add(new ItemStack(ModItems.CHEF_HAT));
            })
            .displayName(Text.translatable("itemgroup.cosmetictrims"))
            .build();

    public static void registerItemGroups() {
        CosmeticTrims.LOGGER.info("Registering Mod Item Groups for " + CosmeticTrims.MOD_ID);
        // Register the item group

        Registry.register(Registries.ITEM_GROUP, COSMETIC_TRIMS_KEY, COSMETIC_TRIMS_GROUP);

    }
}
