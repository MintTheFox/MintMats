package mint.mintmats.common.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import mint.mintmats.common.core.configurationHelper;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import net.minecraft.src.World;

public class blockMud extends Block
{
	public static int countedTicks = 0;
	public static int neededTicks = configurationHelper.mudDryRate;
	
	public blockMud(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRequiresSelfNotify();
        setTickRandomly(true);
    }
    
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
        super.updateTick(par1World, par2, par3, par4, par5Random);

        int i = par1World.getBlockMetadata(par2, par3, par4);
        if (i == 1)
            {
        		if (neededTicks >= countedTicks)
        		{
        			countedTicks++;
        		}
        		
        		else if (neededTicks <= countedTicks)
        		{
        			i++;
        			par1World.setBlockMetadataWithNotify(par2, par3, par4, i);
        		}
        	}
    }

    public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    		case 0: return 0;
    		case 1: return 1;
    		default: return 0;
    	}
    }
    
    public int damageDropped(int par1)
    {
        return par1;
    }
    
    public String getTextureFile()
    {
    	return "/mint/mintmats/common/blocks/blocks.png";
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 2; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
