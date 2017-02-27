package com.elementfx.tvp.ad.tileentity;

import com.elementfx.tvp.ad.block.BlockBell;
import com.elementfx.tvp.ad.block.BlockColoredBed;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.ITickable;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.MathHelper;

public class TileEntityColoredBed extends TileEntity
{
	private byte dye;
	
	public void setColor(int i) {
		this.dye = (byte)i;
	}
	
	public int getColor() {
		return (int)this.dye;
	}
	
	public NBTTagCompound func_189515_b(NBTTagCompound p_189515_1_)
    {
        super.func_189515_b(p_189515_1_);
        p_189515_1_.setByte("dye", this.dye);
        System.out.println("Writing NBT: " + p_189515_1_.toString());
        return p_189515_1_;
    }

    public void readFromNBT(NBTTagCompound compound)
    {
        super.readFromNBT(compound);
        this.dye = compound.getByte("dye");
        System.out.println("Reading NBT: " + compound.toString());
    }
}
