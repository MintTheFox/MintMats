package mint.mintmats.common.core;

import java.util.List;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemBlock;
import net.minecraft.src.ItemStack;

public class itemCustomFence extends ItemBlock
{
	public static String[] blockNames = { "Cobblestone Wall", "Mossy Cobblestone Wall", "Brick Wall", "Stone Brick Wall",};
	
	public itemCustomFence(int par1)
	{
		super(par1);
		setMaxDamage(0);
		setHasSubtypes(true);
	}

	public String getItemNameIS(ItemStack itemstack) 
	{
		return super.getItemName() + "." + blockNames[itemstack.getItemDamage()];
	}
	
	public int getMetadata(int par1)
	{
		return par1;
	}
}
