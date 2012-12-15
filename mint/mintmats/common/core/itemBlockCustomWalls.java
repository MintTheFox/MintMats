package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemBlockCustomWalls extends ItemBlock
{
	public itemBlockCustomWalls(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}
	
	@Override
	public String getItemNameIS(ItemStack itemstack) 
	{
		String name = "customWalls";
		switch(itemstack.getItemDamage()) 
		{
			case 0: {name = "dirt"; break;}
			case 1: {name = "stoneBrick"; break;}
			case 2: {name = "stone"; break;}
			case 3: {name = "doubleSlab"; break;}
			default: name = "dirt";
		}
		return getItemName() + "." + name;
	}
	
	@Override
	public int getMetadata(int par1)
	{
		return par1;
	}
}

