package mint.mintmats.common.core;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemCustomFence extends ItemBlock
{
	public itemCustomFence(int par1, Block block)
	{
		super(par1);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack) 
	{
		String name = "customFence";
		switch(itemstack.getItemDamage()) 
		{
			case 0: {name = "smoothStone"; break;}
			case 1: {name = "stoneBrick"; break;}
			case 2: {name = "crackedBrick"; break;}
			case 3: {name = "chisledBrick"; break;}
			default: name = "smoothStone";
		}
		return getItemName() + "." + name;
	}
	

	public int getMetadata(int par1)
	{
		return par1;
	}

}
