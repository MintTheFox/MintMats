package mint.mintmats.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Potion;
import net.minecraft.src.PotionEffect;
import net.minecraft.src.World;

public class itemHamburger extends ItemFood
{
	
	public itemHamburger(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setMaxStackSize(6);
        this.setCreativeTab(CreativeTabs.tabFood);
    }

    public String getTextureFile()
    {
            return "/mint/mintmats/common/items/items.png";
    }
}
