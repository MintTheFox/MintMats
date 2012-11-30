package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemCustomEndStone extends ItemBlock
{
	public itemCustomEndStone(int par1, Block block) 
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack) 
	{
		String name = "customEndStone";
		switch(itemstack.getItemDamage()) 
		{
			case 0: {name = "smooth"; break;}
			case 1: {name = "brick"; break;}
			case 2: {name = "mossy"; break;}
			case 3: {name = "cracked"; break;}
			case 4: {name = "chiseled"; break;}
			default: name = "smooth";
		}
		return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}