package mint.mintmats.common.blocks;

import java.util.Random;

import mint.mintmats.common.core.configurationHelper;
import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class blockPreasureLamp extends Block
{
	private final boolean powered;
	
	private int meta;
	
	private int time = configurationHelper.blockLightTime *20;
	
	public blockPreasureLamp(int par1, int par2, boolean par3)
	{
        super(par1, par2, Material.rock);
        this.powered = par3;
        setLightOpacity(0);

        if (par3)
        {
            this.setLightValue(1.0F);
        }
	}

	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
        	meta = par1World.getBlockMetadata(par2, par3, par4);
        	
        	if (this.powered)
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, time);
            }
            else if (!this.powered)
            {
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.preasureLampIdle.blockID, meta);
            }
        }
    }
	
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	meta = par1World.getBlockMetadata(par2, par3, par4);
    	
    	if (!par1World.isRemote && this.powered)
        {
        	par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.preasureLampIdle.blockID, meta);
        }
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return modBlocks.preasureLampIdle.blockID;
    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return modBlocks.preasureLampIdle.blockID;
    }
    
    public void onEntityCollidedWithBlock(World par1World, int par2, int par3, int par4, Entity par5Entity)
    {
        meta = par1World.getBlockMetadata(par2, par3, par4);
        
    	if (!par1World.isRemote)
        {	
        	if (this.powered)
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, time);
            }
            else if (!this.powered)
            {
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.preasureLampActive.blockID, meta);
            }
        }
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)par2 + var5), (double)par3, (double)((float)par4 + var5), (double)((float)(par2 + 1) - var5), (double)((float)(par3 + 1) - var5), (double)((float)(par4 + 1) - var5));
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the bounding box of the wired rectangular prism to render.
     */
    public AxisAlignedBB getSelectedBoundingBoxFromPool(World par1World, int par2, int par3, int par4)
    {
        float var5 = 0.0625F;
        return AxisAlignedBB.getAABBPool().addOrModifyAABBInPool((double)((float)par2 + var5), (double)par3, (double)((float)par4 + var5), (double)((float)(par2 + 1) - var5), (double)(par3 + 1), (double)((float)(par4 + 1) - var5));
    }
    
}