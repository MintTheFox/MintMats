package mint.mintmats.common.items;

import mint.mintmats.common.mintmats;
import mint.mintmats.common.core.configurationHelper;
import mint.mintmats.common.core.logTurnerEvent;
import net.minecraft.src.Block;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.EnumToolMaterial;
import net.minecraft.src.ItemStack;
import net.minecraft.src.ItemTool;
import net.minecraft.src.World;

public class itemLogTurner extends ItemTool {

	public itemLogTurner(int id) {
		super(id, 1, EnumToolMaterial.WOOD, new Block[] {});
		setIconIndex(112);
		setTextureFile("/mint/mintmats/common/items/items.png");
		setMaxDamage(configurationHelper.toolDurability);
	}

	@Override
	public boolean isDamageable() {
		return true;
	}

    @Override
    public boolean getShareTag(){ return true;}
    
	@Override
	public boolean isItemTool(ItemStack par1ItemStack) {
		return true;
	}
	
    @Override
    public ItemStack getContainerItemStack(ItemStack itemStack)
    {
    	itemStack.setItemDamage(itemStack.getItemDamage() + 1);
    	return itemStack;
    }

	@Override
	public boolean onItemUse(ItemStack itemUsed, EntityPlayer player,
			World world, int x, int y, int z, int side, float xOffset,
			float yOffset, float zOffset)
	{
		//if (!player.func_82247_a(x, y, z, side, itemUsed)) return false;

		final logTurnerEvent event = new logTurnerEvent(player,
				itemUsed, world, x, y, z);
		if (mintmats.proxy.postEventToBus(event)) return false;
		if (event.isHandled()) return true;

		final int blockID = world.getBlockId(x, y, z);

		if (blockID != Block.wood.blockID) return false;
		final Block wood = Block.wood;
		world.playSoundEffect(x + 0.5F, y + 0.5F, z + 0.5F,
				wood.stepSound.getStepSound(),
				(wood.stepSound.getVolume() + 1.0F) / 2.0F,
				wood.stepSound.getPitch() * 1.55F);

		if (!world.isRemote)
		{
			final int metadata = world.getBlockMetadata(x, y, z);
			int orientation = metadata & 12;
			final int type = metadata & 3;

			orientation = orientation == 0 ? 4 : orientation == 4 ? 8
					: 0;
			world.setBlockAndMetadata(x, y, z, blockID, type
					| orientation);
			itemUsed.damageItem(1, player);
		}
		return true;
	}
}
