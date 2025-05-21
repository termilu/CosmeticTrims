package com.termilu.cosmetictrims.item;

import com.termilu.cosmetictrims.CosmeticTrims;
import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import xyz.nucleoid.packettweaker.PacketContext;

public class PolymerBackedItem extends Item implements PolymerItem {

    public PolymerBackedItem(Settings settings) {
        super(settings);
    }

    // Spoofs the item visually to a leather helmet
    @Override
    public Item getPolymerItem(ItemStack stack, PacketContext context) {
        return Items.EMERALD;
    }

    // Tells Polymer to use custom model for the item
    @Override
    public Identifier getPolymerItemModel(ItemStack stack, PacketContext context) {
        return Identifier.of(CosmeticTrims.MOD_ID, "item/chef_hat");
    }
}