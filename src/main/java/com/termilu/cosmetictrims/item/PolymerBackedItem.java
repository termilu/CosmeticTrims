package com.termilu.cosmetictrims.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import xyz.nucleoid.packettweaker.PacketContext;

public class PolymerBackedItem extends Item implements PolymerItem {

    public PolymerBackedItem(Settings settings) {
        super(settings);
    }

    @Override
    public Item getPolymerItem(ItemStack stack, PacketContext context) {
        return Items.CHAINMAIL_HELMET;
    }
}
