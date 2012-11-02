package mint.mintmats.common.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class smoothEndStone extends Block
{
    public smoothEndStone(int par1, int par2)
    {
        super(par1, par2, Material.ground);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }

}
