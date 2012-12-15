package mint.mintmats.common.core;

import net.minecraft.src.Block;
import net.minecraft.src.BlockStairs;

public class customStairs extends BlockStairs
{

	public customStairs(int blockID, Block modelBlock, int modelMetadata)
	{
		super(blockID, modelBlock, modelMetadata);
		setRequiresSelfNotify();
		setTextureFile("/mint/mintmats/common/blocks/blocks.png");
		setLightOpacity(0);
	}

}
