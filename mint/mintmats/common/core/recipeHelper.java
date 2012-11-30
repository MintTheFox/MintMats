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
        GameRegistry.addRecipe(new ItemStack(modBlocks.blockMud, 4),
                new Object[] {" # ","#b#"," # ",
        		'#', Block.dirt,
        		'b', Item.bucketWater,});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.blockMud, 4),
                new Object[] {" # ","#p#"," # ",
        		'#', Block.dirt,
        		'p', Item.potion,});
        
        //mud bricks
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 4),
        		new Object[] {"##", "##",
        		'#', new ItemStack(modBlocks.blockMud, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 8, 1),
        		new Object[] {"###", "#v#", "###",
        		'v', Block.vine,
        		'#', modBlocks.mudBrick});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 8, 2),
        		new Object[] {"###", "#h#", "###",
        		'h', new ItemStack(modItems.hammer, 1, -1),
        		'#', modBlocks.mudBrick});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrick, 8, 3),
        		new Object[] {"###", "#h#", "###",
        		'h', new ItemStack(modItems.chisel, 1, -1),
        		'#', new ItemStack(modBlocks.blockMud, 1, 1)});
        
        //end stone
        GameRegistry.addSmelting(Block.whiteStone.blockID, new ItemStack(modBlocks.endStone, 0), 0.3F); 
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStone, 4, 1),
        		new Object[] {"##", "##",
        		'#', new ItemStack(modBlocks.endStone, 1, 0)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStone, 8, 2),
        		new Object[] {"###", "#v#", "###",
        		'v', Block.vine,
        		'#', new ItemStack(modBlocks.endStone, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStone, 8, 3),
        		new Object[] {"###", "#h#", "###",
        		'h', new ItemStack(modItems.hammer, 1, -1),
        		'#', new ItemStack(modBlocks.endStone, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStone, 8, 4),
        		new Object[] {"###", "#c#", "###",
        		'c', new ItemStack(modItems.chisel, 1, -1),
        		'#', new ItemStack(modBlocks.endStone, 1, 0)});
        
        //special brick recipes
        GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 8, 1),
        		new Object[] {"###", "#v#", "###",
        		'v', Block.vine,
        		'#', new ItemStack(Block.stoneBrick, 1, 0)});
        
        GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 8, 2),
        		new Object[] {"###", "#h#", "###",
        		'h', new ItemStack(modItems.hammer, 1, -1),
        		'#', new ItemStack(Block.stoneBrick, 1, 0)});
        
        GameRegistry.addRecipe(new ItemStack(Block.stoneBrick, 8, 3),
        		new Object[] {"###", "#c#", "###",
        		'c', new ItemStack(modItems.chisel, 1, -1),
        		'#', new ItemStack(Block.stoneBrick, 1, 0)});
        
        //sandstone stuff
        GameRegistry.addSmelting(Block.sandStone.blockID, new ItemStack(Block.sandStone, 1), 0.0F);
        
        GameRegistry.addRecipe(new ItemStack(Block.sandStone, 8, 2),
        		new Object[] {"###", "#c#", "###",
        		'c', new ItemStack(modItems.chisel, 1, -1),
        		'#', new ItemStack(Block.sandStone, 1, 0)});
        
        //mod stairs
        ////mud stairs
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.blockMud, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mudBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.mudBrick, 1, 0)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mossyMudBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.mudBrick, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.crackedMudBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.mudBrick, 1, 2)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.chiseledMudBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.mudBrick, 1, 3)});
        
        ////end stone stairs
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStoneStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.endStone, 1, 0)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.endStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.endStone, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mossyEndStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.endStone, 1, 2)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.crackedEndStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.endStone, 1, 3)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.chiseledEndStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(modBlocks.endStone, 1, 4)});
        
        //custom vanilla stairs
        GameRegistry.addRecipe(new ItemStack(modBlocks.mossyStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(Block.stoneBrick, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.crackedStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(Block.stoneBrick, 1, 2)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.chiseledStoneBrickStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(Block.stoneBrick, 1, 3)});
        
        
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.smoothSandStoneStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(Block.sandStone, 1, 1)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.chiseledSandStoneStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', new ItemStack(Block.sandStone, 1, 2)});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.goldStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', Block.blockGold});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.diamondStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', Item.diamond});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.emeraldStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', Item.emerald});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.glowStoneStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', Block.glowStone});
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.mossStoneStairs, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', Block.cobblestoneMossy});
        
        
        
        GameRegistry.addRecipe(new ItemStack(modBlocks.lampStairsIdle, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', Block.redstoneLampIdle});
        
        //reclamation recipes
        GameRegistry.addShapelessRecipe(new ItemStack(Item.ingotGold, 7),
        		new Object[]{new ItemStack(modBlocks.goldStairs)});
        
        GameRegistry.addRecipe(new ItemStack(Block.blockGold, 6),
        		new Object[] {"#  ", "## ", "###",
        		'#', modBlocks.goldStairs});
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.diamond, 1),
        		new Object[]{new ItemStack(modBlocks.diamondStairs)});
        
        GameRegistry.addShapelessRecipe(new ItemStack(Item.emerald, 1),
        		new Object[]{new ItemStack(modBlocks.emeraldStairs)});
         
        //food
        GameRegistry.addShapelessRecipe(new ItemStack(modItems.hamburger),
        		new Object[]{new ItemStack(Item.beefCooked), new ItemStack(modItems.knife, 1, -1), new ItemStack(Item.bread)});
        
        GameRegistry.addShapelessRecipe(new ItemStack(modItems.appleGum),
        		new Object[]{new ItemStack(Item.slimeBall), new ItemStack(Item.sugar), new ItemStack(Item.appleRed)});
        
        GameRegistry.addShapelessRecipe(new ItemStack(modItems.melonGum),
        		new Object[]{new ItemStack(Item.slimeBall), new ItemStack(Item.sugar), new ItemStack(Item.melon)});
        
        //tools
        GameRegistry.addRecipe(new ItemStack(modItems.knife),
        		new Object[] {"i", "s",
        		'i', Item.ingotIron,
        		's', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(modItems.hammer),
        		new Object[] {"  i", " s ", "s  ",
        		'i', Item.ingotIron,
        		's', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(modItems.chisel),
        		new Object[] {"s", "i",
        		'i', Item.ingotIron,
        		's', Item.stick});
        
        GameRegistry.addRecipe(new ItemStack(modItems.logTurner),
        		new Object[] {"i i", "isi",
        		'i', Item.ingotIron,
        		's', Item.stick});
	}

}
