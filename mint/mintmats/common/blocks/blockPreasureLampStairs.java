package mint.mintmats.common.blocks;

import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import mint.mintmats.common.core.configurationHelper;
import net.minecraft.src.Block;
import net.minecraft.src.BlockStairs;
import net.minecraft.src.Entity;
import net.minecraft.src.World;

public class blockPreasureLampStairs extends BlockStairs
{
	private final boolean powered;
	
	private int meta;
	
	private int time = configurationHelper.blockLightTime *20;
	
	public blockPreasureLampStairs(int blockID, Block modelBlock,int modelMetadata, boolean par1)
	{
        super(blockID, modelBlock, modelMetadata);
        this.powered = par1;
        setLightOpacity(0);

        if (par1)
        {
            this.setLightValue(1.0F);
            ++this.blockIndexInTexture;
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
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.preasureLampStairsIdle.blockID, meta);
            }
        }
    }
	
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	meta = par1World.getBlockMetadata(par2, par3, par4);
    	
    	if (!par1World.isRemote && this.powered)
        {
        	par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.preasureLampStairsIdle.blockID, meta);
        }
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return modBlocks.preasureLampStairsIdle.blockID;
    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return modBlocks.preasureLampStairsIdle.blockID;
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
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.preasureLampStairsActive.blockID, meta);
            }
        }
    }   
}