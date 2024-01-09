package com.indemnity83.irontank.tile;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraftforge.fluids.FluidContainerRegistry;

import com.indemnity83.irontank.reference.TankType;

import buildcraft.factory.TileTank;

public class TileIronTank extends TileTank {

    public TankType type;

    public TileIronTank() {
        this(TankType.IRON);
    }

    public TileIronTank(TankType type) {
        this.type = type;

        this.setCapacityFromType();
    }

    public void readFromNBT(NBTTagCompound data) {
        super.readFromNBT(data);
        this.type = TankType.values()[data.getInteger("type")];

        this.setCapacityFromType();
    }

    public void writeToNBT(NBTTagCompound data) {
        super.writeToNBT(data);
        data.setInteger("type", type.ordinal());
    }

    public void setCapacityFromType() {
        int capacity = FluidContainerRegistry.BUCKET_VOLUME * type.capacity;
        this.tank.setCapacity(capacity);
    }

}
