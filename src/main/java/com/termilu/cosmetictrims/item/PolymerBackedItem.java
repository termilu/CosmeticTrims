package com.termilu.cosmetictrims.item;

import eu.pb4.polymer.core.api.item.PolymerItem;
import net.minecraft.component.DataComponentTypes;
import net.minecraft.component.type.CustomModelDataComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.tooltip.TooltipType;
import xyz.nucleoid.packettweaker.PacketContext;
import java.util.List;

public class PolymerBackedItem extends Item implements PolymerItem {

    public PolymerBackedItem(Settings settings) {
        super(settings);


    }

    @Override
    public Item getPolymerItem(ItemStack stack, PacketContext context) {
        return Items.LEATHER_HELMET;
    }

//    @Override
//    public ItemStack getPolymerItemStack(ItemStack original, TooltipType tooltipType, PacketContext context) {
//        ItemStack stack = new ItemStack(getPolymerItem(original, context));
//        stack.setCount(original.getCount());
//
//
//        stack.set(DataComponentTypes.CUSTOM_MODEL_DATA, new CustomModelDataComponent());
//
//        return stack;
//    }

}
