package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemBlockMudBrick extends ItemBlock
{
	public itemBlockMudBrick(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack) 
	{
		String name = "mudBrick";
		switch(itemstack.getItemDamage()) 
		{
			case 0: {name = "smooth"; break;}
			case 1: {name = "mossy"; break;}
			case 2: {name = "cracked"; break;}
			case 3: {name = "chisled"; break;}
			default: name = "smooth";
		}
		return getItemName() + "." + name;
	}

	public int getMetadata(int par1)
	{
		return par1;
	}
}
