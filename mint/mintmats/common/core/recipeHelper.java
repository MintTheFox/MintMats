package mint.mintmats.common.core;

import mint.mintmats.common.blocks.modBlocks;
import mint.mintmats.common.items.modItems;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;

public class recipeHelper {

	public static void init()
	{
		//mud block
        GameRegistry.addRecipe(new ItemStack(modBlocks.blockMud, 8),
                new Object[] {"xxx","xyx","xxx",
            Character.valueOf('x'), Block.dirt,
            Character.valueOf('y'), Item.bucketWater,
        });
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.blockMud, 8),
                new Object[] {"xxx","xyx","xxx",
            Character.valueOf('x'), Block.dirt,
            Character.valueOf('y'), Item.potion,
        });
        
        //temp recipe for dried mud
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.blockMud, 8, 1),
                new Object[] {"xxx","xyx","xxx",
            Character.valueOf('x'), modBlocks.blockMud,
            Character.valueOf('y'), Block.sand,
        });
        
        //mud bricks
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 4),
        		new Object[] {"##", "##",
        		'#', new ItemStack(modBlocks.blockMud, 1, 1)});
        
        //mud bricks
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 8, 1),
        		new Object[] {"###", "#&#", "###",
        		'&', Block.vine,
        		'#', modBlocks.mudBrick});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 8, 2),
        		new Object[] {"###", "#&#", "###",
        		'&', new ItemStack(modItems.hammer, 1, -1),
        		'#', modBlocks.mudBrick});
        
        //end bricks
        GameRegistry.addSmelting(Block.whiteStone.blockID, new ItemStack(modBlocks.smoothEndStone), 0.3F); 
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStoneBrick, 4),
        		new Object[] {"##", "##",
        		'#', modBlocks.smoothEndStone});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStoneBrick, 8, 1),
        		new Object[] {"###", "#&#", "###",
        		'&', Block.vine,
        		'#', modBlocks.endStoneBrick});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStoneBrick, 8, 2),
        		new Object[] {"###", "#&#", "###",
        		'&', new ItemStack(modItems.hammer, 1, -1),
        		'#', modBlocks.endStoneBrick});
        
        //food
        GameRegistry.addShapelessRecipe(new ItemStack(modItems.hamburger),
        		new Object[]{new ItemStack(Item.beefCooked), new ItemStack(modItems.knife, 1, -1), new ItemStack(Item.bread)});
        
        GameRegistry.addShapelessRecipe(new ItemStack(modItems.appleGum),
        		new Object[]{new ItemStack(Item.slimeBall), new ItemStack(Item.sugar), new ItemStack(Item.appleRed)});
        
        GameRegistry.addShapelessRecipe(new ItemStack(modItems.melonGum),
        		new Object[]{new ItemStack(Item.slimeBall), new ItemStack(Item.sugar), new ItemStack(Item.melon)});
        
        //tools
        GameRegistry.addRecipe(new ItemStack(modItems.knife),
        		new Object[] {"#", "&",
        		'#', Item.ingotIron,
        		'&', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(modItems.hammer),
        		new Object[] {"  #", " & ", "&  ",
        		'#', Item.ingotIron,
        		'&', Item.stick});
        
	}

}
