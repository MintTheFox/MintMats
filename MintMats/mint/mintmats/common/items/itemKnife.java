package mint.mintmats.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

public class itemKnife extends Item
{
    public itemKnife(int i)
    {
        super(i);
        maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTools);
        setMaxDamage(64);
    }
    public boolean isDamagable(ItemStack itemStack)
    {
    	return true;
    }
	
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack itemStack)
    {
    	return false;
    }
    
    @Override
    public boolean getShareTag(){ return true;}
    
    @Override
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
