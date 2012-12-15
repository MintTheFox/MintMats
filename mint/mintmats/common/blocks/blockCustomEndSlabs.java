package mint.mintmats.common.blocks;

import net.minecraft.src.BlockHalfSlab;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class blockCustomEndSlabs extends BlockHalfSlab
{
	public blockCustomEndSlabs(int par1, boolean par2)
	{
		super(par1, par2, Material.ground);
		this.setCreativeTab(CreativeTabs.tabBlock);
		setLightOpacity(0);
	}

	public String getFullSlabName(int var1)
	{
		return null;
	}


}
