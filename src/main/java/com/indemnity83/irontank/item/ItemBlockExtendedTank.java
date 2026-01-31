package com.indemnity83.irontank.item;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.StatCollector;

import com.indemnity83.irontank.block.BlockExtendedTank;
import com.indemnity83.irontank.reference.TankType;

public class ItemBlockExtendedTank extends ItemBlock {

    public ItemBlockExtendedTank(Block block) {
        super(block);
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List<String> list, boolean advanced) {
        BlockExtendedTank block = (BlockExtendedTank) this.field_150939_a;
        TankType type = block.type;
        String key = "tile." + type.name + ".tooltip";
        String text = StatCollector.translateToLocal(key);
        for (String line : text.split("\\\\n")) {
            list.add(line);
        }
    }
}
