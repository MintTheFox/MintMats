package mint.mintmats.common.items;

import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;

public class itemOreKnife extends Item
{
    public itemOreKnife(int i)
    {
        super(i);
        maxStackSize = 1;
        this.setCreativeTab(CreativeTabs.tabTools);
    }
    
    public String getTextureFile()
    {
            return "/mint/mintmats/common/items/items.png";
    }
}
