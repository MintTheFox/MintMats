package mint.mintmats.common.blocks;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Block;

public class modBlocks
{
	public static Block wetMud;
	public static Block dryMud;
	public static Block mudBrick;
	public static Block smoothEndStone;
	public static Block endStoneBrick;
	public static Block endStoneStairs;
	
	public static void init()
	{
		//block settings
		smoothEndStone = new smoothEndStone(230, 0).setStepSound(Block.soundGravelFootstep).setHardness(3F).setResistance(1.0F).setBlockName("smoothEndStone");
		endStoneBrick = new endStoneBrick(231, 1).setStepSound(Block.soundStoneFootstep).setHardness(3F).setResistance(1.0F).setBlockName("endStoneBrick");
		
		//register and insert new blocks
		GameRegistry.registerBlock(smoothEndStone);
		GameRegistry.registerBlock(endStoneBrick);
		
		//insert block names
		LanguageRegistry.addName(smoothEndStone, "Smooth End Stone");
		LanguageRegistry.addName(endStoneBrick, "End Stone Brick");
	}

}
