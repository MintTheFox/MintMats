package mint.mintmats.common.items;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraft.src.World;

public class itemGrassSeeds extends Item
{
	
	public itemGrassSeeds(int par1)
    {
        super(par1);
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.tabMaterials);
    }

    public String getTextureFile()
    {
    	return "/mint/mintmats/common/items/items.png";
    }
    
    public boolean onItemUse(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, World par3World, int par4, int par5, int par6, int par7, float par8, float par9, float par10)
    {
    	int ID = par3World.getBlockId(par4, par5, par6);
    	if(ID == Block.dirt.blockID)
    	{
    	par3World.setBlockWithNotify(par4, par5, par6, Block.grass.blockID);
        --par1ItemStack.stackSize;
        return true;
    	}
    	return false;

    }
}