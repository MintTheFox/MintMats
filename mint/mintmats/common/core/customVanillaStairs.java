package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.BlockStairs;

public class customVanillaStairs extends BlockStairs
{
	public customVanillaStairs(int blockID, Block modelBlock,int modelMetadata)
	{
		super(blockID, modelBlock, modelMetadata);
		setRequiresSelfNotify();
		setLightOpacity(0);
	}
}
