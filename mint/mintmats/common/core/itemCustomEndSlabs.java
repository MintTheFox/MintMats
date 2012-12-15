package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemCustomEndSlabs extends ItemBlock
{

	public itemCustomEndSlabs(int par1, Block block) 
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack) 
	{
		String name = "customSlab";
		switch(itemstack.getItemDamage()) 
		{
			case 0: {name = "smoothEnd"; break;}
			case 1: {name = "brickEnd"; break;}
			case 2: {name = "crackedEnd"; break;}
			case 3: {name = "mossyEnd"; break;}
			default: name = "smoothEnd";
		}
		
		return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
    {
        return par1;
    }
}
