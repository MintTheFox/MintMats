package mint.mintmats.common.blocks;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import mint.mintmats.client.ClientProxy;
import mint.mintmats.common.core.configurationHelper;
import net.minecraft.src.Block;
import net.minecraft.src.BlockFence;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Material;

public class blockCustomFence extends BlockFence
{
	private static int id;
	
	public blockCustomFence(int par1)
	{
		super(par1, id);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setRequiresSelfNotify();
    }
    
	@Override
    public int getBlockTextureFromSideAndMetadata(int side, int meta) 
    {
		if(meta == 0){id = 2; return 2;}
		
		if(meta == 1){id = 3; return 3;}
		
		if(meta == 2){id = 4; return 4;}
		
		if(meta == 3){id = 5; return 5;}
		
		return 2;
		
    }
    
	@Override
	public int damageDropped(int par1)
    {
        return par1;
    }
    
	@Override
    public String getTextureFile()
    {
    	return "/mint/mintmats/common/blocks/blocks.png";
    }
    
    @Override
	@SideOnly(Side.CLIENT)
    public void getSubBlocks(int par1, CreativeTabs par2CreativeTabs, List par3List)
    {
        for (int var4 = 0; var4 < 4; ++var4)
        {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
   
}
    
