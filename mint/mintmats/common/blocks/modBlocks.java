package mint.mintmats.common.blocks;


import mint.mintmats.common.core.itemBlockMud;
import mint.mintmats.common.core.itemBlockMudBrick;
import mint.mintmats.common.core.itemEndStoneBrick;
import mint.mintmats.common.items.modItems;
import net.minecraft.src.Block;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class modBlocks
{

	//block identifiers
	public static Block blockMud;
	public static Block mudBrick;
	public static Block smoothEndStone;
	public static Block endStoneBrick;
	public static Block endStoneStairs;
	
	//metadata block IDs
	public static int mudBlockID = 389;
	public static int mudBrickID = 390;
	public static int endStoneBrickID = 391;
	 
	public static void init()
	{

		//metadata settings
		
		//mud blocks
		//this has to go first [Identifier]
		blockMud = new blockMud(mudBlockID, 0).setStepSound(Block.soundGravelFootstep).setHardness(3F).setResistance(1.0F).setBlockName("mudBlock");
		//and this second [Constructor]
		Item.itemsList[mudBlockID] = new itemBlockMud(mudBlockID-256, blockMud).setItemName("itemmud");
		
		//mud bricks
		mudBrick = new blockMudBrick(mudBrickID, 3).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("mudBrick");
		Item.itemsList[mudBrickID] = new itemBlockMudBrick(mudBrickID-256, mudBrick).setItemName("itemMudBrick");
		
		//end stone bricks
		endStoneBrick = new blockEndStoneBrick(endStoneBrickID, 6).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("endBrick");
		Item.itemsList[endStoneBrickID] = new itemEndStoneBrick(endStoneBrickID-256, endStoneBrick).setItemName("itemEndBrick");
		//block settings
		smoothEndStone = new blockSmoothEndStone(392, 5).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("smoothEndStone");
		
		//register and insert new blocks
		GameRegistry.registerBlock(smoothEndStone);
		
		//insert block names
		LanguageRegistry.addName(smoothEndStone, "Smooth End Stone");
		LanguageRegistry.addName(endStoneBrick, "End Stone Brick");
		//LanguageRegistry.addName(endStoneBrick, "End Stone Stairs");
		//name registers for the mud blocks
		LanguageRegistry.instance().addStringLocalization("tile.mudBlock.wet.name", "Wet Mud");
		LanguageRegistry.instance().addStringLocalization("tile.mudBlock.dry.name", "Dry Mud");
		
		//name registers for the mud brick blocks
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.smooth.name", "Mud Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.mossy.name", "Mossy Mud Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.cracked.name", "Cracked Mud Bricks");
		
		//name registers for the end stone brick blocks
		LanguageRegistry.instance().addStringLocalization("tile.endBrick.smooth.name", "End Stone Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.endBrick.mossy.name", "Mossy End Stone Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.endBrick.cracked.name", "Cracked End Stone Bricks");
        
	}
}
