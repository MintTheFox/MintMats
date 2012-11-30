package mint.mintmats.common.blocks;

import java.util.Random;

import net.minecraft.src.Block;
import net.minecraft.src.BlockStairs;
import net.minecraft.src.Item;

public class glowstoneStairs extends BlockStairs
{

	public glowstoneStairs(int blockID, Block modelBlock,int modelMetadata)
	{
		super(blockID, modelBlock, modelMetadata);
		setRequiresSelfNotify();
		setLightOpacity(0);
	}
	
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return Item.lightStoneDust.shiftedIndex;
    }
    
    public int quantityDropped(Random par1Random)
    {
        return par1Random.nextInt(2) + 1;
    }

}
