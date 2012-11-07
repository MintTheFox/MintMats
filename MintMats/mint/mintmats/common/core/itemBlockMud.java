package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemBlockMud extends ItemBlock
{
	public itemBlockMud(int par1, Block block) 
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack) 
	{
		String name = "mud";
		switch(itemstack.getItemDamage()) 
		{
			case 0: {name = "wet"; break;}
			case 1: {name = "dry"; break;}
			default: name = "mud";
		}
		
		return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
    {
        return par1;
    }
}
