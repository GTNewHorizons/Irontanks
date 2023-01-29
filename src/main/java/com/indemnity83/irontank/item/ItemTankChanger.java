package com.indemnity83.irontank.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraftforge.oredict.ShapedOreRecipe;

import buildcraft.factory.TileTank;

import com.indemnity83.irontank.reference.Reference;
import com.indemnity83.irontank.reference.TankChangerType;
import com.indemnity83.irontank.reference.TankType;
import com.indemnity83.irontank.tile.TileIronTank;
import com.indemnity83.irontank.utility.MaterialHelper;
import cpw.mods.fml.common.registry.GameRegistry;

public class ItemTankChanger extends ItemGeneric {

    public final TankChangerType type;

    public ItemTankChanger(TankChangerType type) {
        super();

        this.type = type;

        this.setUnlocalizedName(type.name);
        this.setMaxStackSize(1);
    }

    @Override
    public void addRecipe() {
        for (String sourceMat : type.source.materials) {
            for (String targetMat : type.target.materials) {
                Object oSourceMat = MaterialHelper.translateOreName(sourceMat);
                Object oTargetMat = MaterialHelper.translateOreName(targetMat);
                GameRegistry.addRecipe(
                        new ShapedOreRecipe(
                                new ItemStack(this),
                                type.recipe,
                                'x',
                                oSourceMat,
                                'y',
                                oTargetMat,
                                'z',
                                "paneGlass",
                                'i',
                                "plateDoubleIron",
                                'e',
                                "plateIron",
                                'g',
                                "plateDoubleGold",
                                'h',
                                "plateGold",
                                's',
                                "plateDoubleSteel",
                                'p',
                                "plateSteel",
                                'd',
                                "plateDiamond",
                                'c',
                                "plateDoubleCopper",
                                'q',
                                "plateCopper",
                                'o',
                                "plateDenseObsidian",
                                'a',
                                "plateDoubleAluminium",
                                'f',
                                "plateAluminium",
                                'b',
                                "plateDoubleStainlessSteel",
                                'l',
                                "plateStainlessSteel",
                                't',
                                "plateDoubleTitanium",
                                'k',
                                "plateTitanium",
                                'u',
                                "plateDoubleTungstenSteel",
                                'j',
                                "plateGlass",
                                '1',
                                "screwIron",
                                '2',
                                "screwGold",
                                '3',
                                "screwCopper",
                                '4',
                                "screwSteel",
                                '5',
                                "screwDiamond",
                                '6',
                                "screwAluminium",
                                '7',
                                "screwObsidian",
                                '8',
                                "screwStainlessSteel",
                                '9',
                                "screwTitanium",
                                '0',
                                "screwTungstenSteel",
                                'r',
                                "craftingToolHardHammer",
                                'v',
                                "craftingToolScrewdriver"));
            }
        }
    }

    @Override
    public boolean onItemUseFirst(ItemStack stack, EntityPlayer player, World world, int X, int Y, int Z, int side,
            float hitX, float hitY, float hitZ) {
        if (world.isRemote) {
            return false;
        }

        TileEntity worldTile = world.getTileEntity(X, Y, Z);
        TileTank curTankTile;
        if (worldTile instanceof TileIronTank) {
            curTankTile = (TileTank) worldTile;
            if (type.canUpgrade(((TileIronTank) curTankTile).type)) {
                return false;
            }
        } else if (worldTile instanceof TileTank) {
            curTankTile = (TileTank) worldTile;
            if (type.canUpgrade(TankType.GLASS)) {
                return false;
            }
        } else {
            return false;
        }

        TileIronTank newIronTankTile = new TileIronTank(type.target);
        newIronTankTile.tank.setFluid(curTankTile.tank.getFluid());

        world.setBlock(X, Y, Z, Block.getBlockFromName(Reference.MODID + ":" + type.target.name));
        world.setTileEntity(X, Y, Z, newIronTankTile);

        stack.stackSize = 0;

        return true;
    }

}
