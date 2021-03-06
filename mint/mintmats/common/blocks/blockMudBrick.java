package mint.mintmats.common.blocks;

import java.util.List;
import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;
import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

public class blockMudBrick extends Block
{

	public blockMudBrick(int par1, int par2)
    {
        super(par1, par2, Material.rock);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRequiresSelfNotify();
    }
    
    public int getBlockTextureFromSideAndMetadata(int par1, int par2) 
    {
    	switch (par2) 
    	{
    	case 0:
    		return 2;
    	case 1:
    		return 3;
    	case 2:
    		return 4;
    	case 3:
    		return 5;
    	default:
    		return 0;
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
        for (int var4 = 0; var4 < 4; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
}
