package com.indemnity83.irontank.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import com.indemnity83.irontank.init.ModBlocks;
import com.indemnity83.irontank.reference.Reference;

public class IronTankTabs {

    public static final CreativeTabs MainTab = new CreativeTabs(Reference.MODID.toLowerCase()) {

        @Override
        public Item getTabIconItem() {
            return new ItemStack(ModBlocks.ironTank, 1).getItem();
        }
    };
}
