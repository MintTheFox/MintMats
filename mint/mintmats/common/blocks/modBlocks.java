package mint.mintmats.common.blocks;


import mint.mintmats.common.core.configurationHelper;
import mint.mintmats.common.core.customStairs;
import mint.mintmats.common.core.customVanillaStairs;
import mint.mintmats.common.core.itemBlockCustomWalls;
import mint.mintmats.common.core.itemBlockMud;
import mint.mintmats.common.core.itemBlockMudBrick;
import mint.mintmats.common.core.itemCustomEndStone;
import net.minecraft.src.Block;
import net.minecraft.src.BlockHalfSlab;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class modBlocks
{
	//block identifiers
	public static Block blockMud;
	public static Block mudBrick;
	public static Block endStone;
	
	public static Block mudStairs;
	public static Block mudBrickStairs;
	public static Block mossyMudBrickStairs;
	public static Block crackedMudBrickStairs;
	public static Block chiseledMudBrickStairs;
	
	public static Block endStoneStairs;
	public static Block endStoneBrickStairs;
	public static Block mossyEndStoneBrickStairs;
	public static Block crackedEndStoneBrickStairs;
	public static Block chiseledEndStoneBrickStairs;
	
	public static Block chiseledStoneBrickStairs;
	public static Block mossyStoneBrickStairs;
	public static Block crackedStoneBrickStairs;
	
	public static Block chiseledSandStoneStairs;
	public static Block smoothSandStoneStairs;
	
	public static Block mossStoneStairs;
	public static Block glowStoneStairs;
	public static Block goldStairs;
	public static Block diamondStairs;
	public static Block emeraldStairs;
	
	public static Block lampStairsIdle;
	public static Block lampStairsActive;
	
	public static Block preasureLampStairsIdle;
	public static Block preasureLampStairsActive;
	
	public static Block preasureLampIdle;
	public static Block preasureLampActive;
	
	public static Block customFences;
	
	public static Block customWalls;
	
	public static BlockHalfSlab customSlabs;
	 
	public static void init()
	{	
		//mud blocks
		//this has to go first [Identifier]
		blockMud = new blockMud(configurationHelper.mud, 0).setStepSound(Block.soundGravelFootstep).setHardness(0.5F).setResistance(0.0F).setBlockName("blockMud");
		//and this second [Constructor]
		Item.itemsList[configurationHelper.mud] = new itemBlockMud(configurationHelper.mud-256, blockMud).setItemName("itemMud");
		
		//mud bricks
		mudBrick = new blockMudBrick(configurationHelper.mudBricks, 2).setStepSound(Block.soundStoneFootstep).setHardness(1.1F).setResistance(8.0F).setBlockName("mudBrick");
		Item.itemsList[configurationHelper.mudBricks] = new itemBlockMudBrick(configurationHelper.mudBricks-256, mudBrick).setItemName("itemMudBrick");
		
		//end stone bricks
		endStone = new blockCustomEndStone(configurationHelper.customEndStone, 6).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(15.0F).setBlockName("endStone");
		Item.itemsList[configurationHelper.customEndStone] = new itemCustomEndStone(configurationHelper.customEndStone-256, endStone).setItemName("itemCustomEndStone");
		
		customWalls = new blockCustomWalls(configurationHelper.customFences, Block.stone).setStepSound(Block.soundStoneFootstep).setHardness(3.0F).setResistance(15.0F).setBlockName("customWalls");
		Item.itemsList[configurationHelper.customFences] = new itemBlockCustomWalls(configurationHelper.customFences-256, customWalls).setItemName("itemCustomWalls");
		
		//mud block stairs
		if(configurationHelper.useCustomStairs == true)
		{
			mudStairs = new customStairs(configurationHelper.customStairs, blockMud, 1).setBlockName("mudStairs");
			mudBrickStairs = new customStairs(configurationHelper.customStairs +1, mudBrick, 0).setBlockName("mudBrickStairs");
			mossyMudBrickStairs = new customStairs(configurationHelper.customStairs +2, mudBrick, 1).setBlockName("mossyMudBrickStairs");
			crackedMudBrickStairs = new customStairs(configurationHelper.customStairs +3, mudBrick, 2).setBlockName("crackedMudBrickStairs");
			chiseledMudBrickStairs = new customStairs(configurationHelper.customStairs +4, mudBrick, 3).setBlockName("chiseledMudBrickStairs");
		
		//end stone stairs
			endStoneStairs = new customStairs(configurationHelper.customStairs+5, endStone, 0).setBlockName("endStoneStairs");
			endStoneBrickStairs = new customStairs(configurationHelper.customStairs +6, endStone, 1).setBlockName("endStoneBrickStairs");
			mossyEndStoneBrickStairs = new customStairs(configurationHelper.customStairs +7, endStone, 2).setBlockName("mossyEndStoneBrickStairs");
			crackedEndStoneBrickStairs = new customStairs(configurationHelper.customStairs +8, endStone, 3).setBlockName("crackedEndStoneBrickStairs");
			chiseledEndStoneBrickStairs = new customStairs(configurationHelper.customStairs +9, endStone, 4).setBlockName("chiseledEndStoneBrickStairs");
		}
		
		//vanilla stairs
		if(configurationHelper.useVanillaStairsPlus == true)
		{
			mossyStoneBrickStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus, Block.stoneBrick, 1).setBlockName("mossyStoneBrickStairs");
			crackedStoneBrickStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +1, Block.stoneBrick, 2).setBlockName("crackedStoneBrickStairs");
			chiseledStoneBrickStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +2, Block.stoneBrick, 3).setBlockName("chiseledStoneBrickStairs");
		
			smoothSandStoneStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +3, Block.sandStone, 2).setBlockName("smoothSandStoneStairs");
			chiseledSandStoneStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +4, Block.sandStone, 1).setBlockName("chiseledSandStoneStairs");
		
			mossStoneStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +9, Block.cobblestoneMossy, 0).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setBlockName("mossStoneStairs");
			glowStoneStairs = new glowstoneStairs(configurationHelper.vanillaStairsPlus +8, Block.glowStone, 0).setStepSound(Block.soundGlassFootstep).setLightValue(1.0F).setBlockName("glowStoneStairs");
			goldStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +5, Block.blockGold, 0).setBlockName("goldStairs");
			diamondStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +6, Block.blockDiamond, 0).setBlockName("diamondStairs");
			emeraldStairs = new customVanillaStairs(configurationHelper.vanillaStairsPlus +7, Block.blockEmerald, 0).setBlockName("emeraldStairs");
		}
		
		lampStairsIdle = new blockLampStairs(configurationHelper.vanillaStairsPlus +10, Block.redstoneLampIdle, 0, false).setStepSound(Block.soundGlassFootstep).setBlockName("lampStairsIdle").setCreativeTab(CreativeTabs.tabRedstone);
		lampStairsActive = new blockLampStairs(configurationHelper.vanillaStairsPlus +11, Block.redstoneLampActive, 0, true).setStepSound(Block.soundGlassFootstep).setBlockName("lampStairsActive");
		
		preasureLampStairsIdle = new blockPreasureLampStairs(configurationHelper.vanillaStairsPlus +12, Block.redstoneLampIdle, 0, false).setStepSound(Block.soundGlassFootstep).setBlockName("preasureLampStairsIdle").setCreativeTab(CreativeTabs.tabRedstone);
		preasureLampStairsActive = new blockPreasureLampStairs(configurationHelper.vanillaStairsPlus +13, Block.redstoneLampActive, 0, true).setStepSound(Block.soundGlassFootstep).setBlockName("preasureLampStairsActive");
		
		preasureLampIdle = new blockPreasureLamp(configurationHelper.vanillaStairsPlus +14, 211, false).setStepSound(Block.soundGlassFootstep).setBlockName("preasureLampIdle").setCreativeTab(CreativeTabs.tabRedstone);
		preasureLampActive = new blockPreasureLamp(configurationHelper.vanillaStairsPlus +15, 212, true).setStepSound(Block.soundGlassFootstep).setBlockName("preasureLampActive");
		
		MinecraftForge.setBlockHarvestLevel(blockMud, "shovel", 0);
		

		
		//register and insert new blocks
		//GameRegistry.registerBlock(customFences, itemCustomFence.class);
		
		if(configurationHelper.useCustomStairs == true)
		{
			GameRegistry.registerBlock(mudStairs);
			GameRegistry.registerBlock(mudBrickStairs);
			GameRegistry.registerBlock(mossyMudBrickStairs);
			GameRegistry.registerBlock(crackedMudBrickStairs);
			GameRegistry.registerBlock(chiseledMudBrickStairs);
		
			GameRegistry.registerBlock(endStoneStairs);
			GameRegistry.registerBlock(endStoneBrickStairs);
			GameRegistry.registerBlock(mossyEndStoneBrickStairs);
			GameRegistry.registerBlock(crackedEndStoneBrickStairs);
			GameRegistry.registerBlock(chiseledEndStoneBrickStairs);
		}
		
		if(configurationHelper.useVanillaStairsPlus == true)
		{
			GameRegistry.registerBlock(chiseledStoneBrickStairs);
			GameRegistry.registerBlock(crackedStoneBrickStairs);
			GameRegistry.registerBlock(mossyStoneBrickStairs);
		
			GameRegistry.registerBlock(chiseledSandStoneStairs);
			GameRegistry.registerBlock(smoothSandStoneStairs);
		
			GameRegistry.registerBlock(mossStoneStairs);
			GameRegistry.registerBlock(glowStoneStairs);
			GameRegistry.registerBlock(goldStairs);
			GameRegistry.registerBlock(diamondStairs);
			GameRegistry.registerBlock(emeraldStairs);
		}
		
		GameRegistry.registerBlock(lampStairsIdle);
		GameRegistry.registerBlock(lampStairsActive);
		
		GameRegistry.registerBlock(preasureLampStairsIdle);
		GameRegistry.registerBlock(preasureLampStairsActive);
		
		GameRegistry.registerBlock(preasureLampIdle);
		GameRegistry.registerBlock(preasureLampActive);
		
		
		
		//insert block names
		if(configurationHelper.useCustomStairs == true)
		{
			LanguageRegistry.addName(mudStairs, "Dried Mud Stairs");
			LanguageRegistry.addName(mudBrickStairs, "Mud Brick Stairs");
			LanguageRegistry.addName(mossyMudBrickStairs, "Mossy Mud Brick Stairs");
			LanguageRegistry.addName(crackedMudBrickStairs, "Cracked Mud Brick Stairs");
			LanguageRegistry.addName(chiseledMudBrickStairs, "Chiseled Mud Brick Stairs");
		
			LanguageRegistry.addName(endStoneStairs, "End Stone Stairs");
			LanguageRegistry.addName(endStoneBrickStairs, "End Stone Brick Stairs");
			LanguageRegistry.addName(mossyEndStoneBrickStairs, "Mossy End Stone Brick Stairs");
			LanguageRegistry.addName(crackedEndStoneBrickStairs, "Cracked End Stone Brick Stairs");
			LanguageRegistry.addName(chiseledEndStoneBrickStairs, "Chiseled End Stone Brick Stairs");
		}
		
		if(configurationHelper.useVanillaStairsPlus == true)
		{
			LanguageRegistry.addName(chiseledStoneBrickStairs, "Chiseled Stone Stairs");
			LanguageRegistry.addName(crackedStoneBrickStairs, "Cracked Stone Brick Stairs");
			LanguageRegistry.addName(mossyStoneBrickStairs, "Mossy Stone Brick Stairs");
		
			LanguageRegistry.addName(chiseledSandStoneStairs, "Chiseled Sandstone Stairs");
			LanguageRegistry.addName(smoothSandStoneStairs, "Smooth Sandstone Stairs");
		
			LanguageRegistry.addName(mossStoneStairs, "Moss Stone Stairs");
			LanguageRegistry.addName(glowStoneStairs, "Glowstone Stairs");
			LanguageRegistry.addName(goldStairs, "Golden Stairs");
			LanguageRegistry.addName(diamondStairs, "Diamond Stairs");
			LanguageRegistry.addName(emeraldStairs, "Emerald Stairs");
		}
		
		LanguageRegistry.addName(lampStairsIdle, "Redstone Lamp Stairs");
		LanguageRegistry.addName(lampStairsActive, "Activated Redstone Lamp Stairs");
		
		LanguageRegistry.addName(preasureLampStairsIdle, "Preasure Activated Redstone Lamp Stairs");
		LanguageRegistry.addName(preasureLampStairsActive, "Preasure Activated Activated Redstone Lamp Stairs");
		
		LanguageRegistry.addName(preasureLampIdle, "Preasure Activated Redstone Lamp");
		LanguageRegistry.addName(preasureLampActive, "Preasure Activated Activated Redstone Lamp");
		
		//name registers for the mud blocks
		LanguageRegistry.instance().addStringLocalization("tile.blockMud.wet.name", "Wet Mud");
		LanguageRegistry.instance().addStringLocalization("tile.blockMud.dry.name", "Dry Mud");
		
		//name registers for the mud brick blocks
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.smooth.name", "Mud Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.mossy.name", "Mossy Mud Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.cracked.name", "Cracked Mud Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.mudBrick.chisled.name", "Chiseled Mud Bricks");
		
		//name registers for the end stone blocks
		LanguageRegistry.instance().addStringLocalization("tile.endStone.smooth.name", "Smooth End Stone");
		LanguageRegistry.instance().addStringLocalization("tile.endStone.brick.name", "End Stone Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.endStone.mossy.name", "Mossy End Stone Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.endStone.cracked.name", "Cracked End Stone Bricks");
		LanguageRegistry.instance().addStringLocalization("tile.endStone.chiseled.name", "Chiseled End Stone Bricks");
		
		//name registers for the fossils
		LanguageRegistry.instance().addStringLocalization("tile.customWalls.dirt.name", "Dirt Walls");
		LanguageRegistry.instance().addStringLocalization("tile.customWalls.stoneBrick.name", "Stone Brick Walls");
		LanguageRegistry.instance().addStringLocalization("tile.customWalls.stone.name", "Smooth Stone Walls");
		LanguageRegistry.instance().addStringLocalization("tile.customWalls.doubleSlab.name", "Stone Double Slab Walls");
		
		//tall grass reflection [keeping here for future reference]
		//int ID = Block.cobblestoneWall.blockID;
        //Block.blocksList[ID] = null;
        //Item.itemsList[ID] = null;
        //customWalls = new blockCustomWalls(ID, 0).setHardness(2.0F).setStepSound(Block.soundStoneFootstep).setBlockName("customWalls");
        //Item.itemsList[ID] = new itemBlockCustomWalls(ID-256, customWalls).setItemName("itemCustomWalls");
        //GameRegistry.registerBlock(customWalls);
	}
}
