package mint.mintmats.common.blocks;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Material;

public class blockSmoothEndStone extends Block
{
    public blockSmoothEndStone(int par1, int par2)
    {
        super(par1, par2, Material.ground);
        this.setCreativeTab(CreativeTabs.tabBlock);
    }
    
    public String getTextureFile()
    {
            return "/mint/mintmats/common/blocks/blocks.png";
    }

}
