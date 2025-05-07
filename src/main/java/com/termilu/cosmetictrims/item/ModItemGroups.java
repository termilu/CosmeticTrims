package com.termilu.cosmetictrims.item;

import com.termilu.cosmetictrims.CosmeticTrims;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    // This class is used to register item groups in the mod
    // For example, you can create a custom item group for the mod's items
    // and add items to it using the FabricItemGroupBuilder class

//    public static final ItemGroup COSMETIC_TRIMS_GROUP = FabricItemGroupBuilder.create(
//            Identifier.of(CosmeticTrims.MOD_ID, "cosmetic_trims"))
//            .icon(() -> new ItemStack(ModItems.CHEF_HAT))
//            .build();

    public static final ItemGroup COSMETIC_TRIMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(CosmeticTrims.MOD_ID, "cosmetic_trims"),
            // Build display name of the item group
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cosmetictrims"))
                    // Build Icon of the item group
                    .icon(() -> new ItemStack(ModItems.CHEF_HAT)).entries((displayContext, entries) -> {
                        entries.add(new ItemStack(ModItems.CHEF_HAT));


                    })
                    .build());


    public static void registerItemGroups() {
        CosmeticTrims.LOGGER.info("Registering Mod Item Groups for " + CosmeticTrims.MOD_ID);
        // Register the item group
    }
}
