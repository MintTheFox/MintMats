package mint.mintmats.common.items;

import mint.mintmats.common.core.configurationHelper;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class itemHammer extends Item
{
	
	public itemHammer(int i)
    {
        super(i);
        maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTools);
        setMaxDamage(configurationHelper.toolDurability);
    }
    public boolean isDamagable(ItemStack itemStack)
    {
    	return true;
    }
	

    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
    	return false;
    }
    

    public boolean getShareTag(){ return true;}
    

    public ItemStack getContainerItemStack(ItemStack itemStack)
    {
    	itemStack.setItemDamage(itemStack.getItemDamage() + 1);
    	return itemStack;
    }
    
    public String getTextureFile()
    {
    	return "/mint/mintmats/common/items/items.png";
    }

}
