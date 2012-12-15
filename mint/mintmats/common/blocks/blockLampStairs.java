package mint.mintmats.common.blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockStairs;
import net.minecraft.src.Material;
import net.minecraft.src.World;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class blockLampStairs extends BlockStairs
{
	private final boolean powered;
	
	private int meta;
	
	public blockLampStairs(int blockID, Block modelBlock,int modelMetadata, boolean par1)
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
        	
        	if (this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.lampStairsActive.blockID, meta);
            }
        }
    }

    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            meta = par1World.getBlockMetadata(par2, par3, par4);
        	
        	if (this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.lampStairsActive.blockID, meta);
            }
        }
    }

    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	meta = par1World.getBlockMetadata(par2, par3, par4);
    	
    	if (!par1World.isRemote && this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
        	par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.lampStairsIdle.blockID, meta);
        }
    }

    public int idDropped(int par1, Random par2Random, int par3)
    {
        return modBlocks.lampStairsIdle.blockID;
    }

    @SideOnly(Side.CLIENT)
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return modBlocks.lampStairsIdle.blockID;
    }
    
}
