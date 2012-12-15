package mint.mintmats.common.items;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;

public class itemAppleGum extends ItemFood
{

	public itemAppleGum(int par1, int par2, float par3, boolean par4)
    {
        super(par1, par2, par3, par4);
        this.setMaxStackSize(64);
        this.setCreativeTab(CreativeTabs.tabFood);
    }
	
    @SideOnly(Side.CLIENT)
    public boolean hasEffect(ItemStack par1ItemStack)
    {
        return true;
    }

    public String getTextureFile()
    {
    	return "/mint/mintmats/common/items/items.png";
    }
}