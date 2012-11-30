package mint.mintmats.common.blocks;

import java.util.List;
import java.util.Random;

import cpw.mods.fml.common.Side;
import cpw.mods.fml.common.asm.SideOnly;

import net.minecraft.src.AxisAlignedBB;
import net.minecraft.src.Block;
import net.minecraft.src.Entity;
import net.minecraft.src.EntityLiving;
import net.minecraft.src.IBlockAccess;
import net.minecraft.src.Material;
import net.minecraft.src.MathHelper;
import net.minecraft.src.MovingObjectPosition;
import net.minecraft.src.Vec3;
import net.minecraft.src.World;

public class blockLampStairs extends Block
{
	private static final int[][] field_72159_a = new int[][] {{2, 6}, {3, 7}, {2, 3}, {6, 7}, {0, 4}, {1, 5}, {0, 1}, {4, 5}};
	private boolean field_72156_cr = false;
	private int field_72160_cs = 0;
	
	private final boolean powered;
	
	private int meta;
	
	public blockLampStairs(int par1, boolean par2)
	{
        super(par1, 211, Material.redstoneLight);
        this.powered = par2;

        if (par2)
        {
            this.setLightValue(1.0F);
            ++this.blockIndexInTexture;
        }
	}
	
	public void onBlockAdded(World par1World, int par2, int par3, int par4)
    {
        if (!par1World.isRemote)
        {
        	meta = par1World.getBlockMetadata(par2, par3, par4);
        	
        	if (this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.lampStairsActive.blockID, meta);
            }
        }
    }


    /**
     * Lets the block know when one of its neighbor changes. Doesn't know which neighbor changed (coordinates passed are
     * their own) Args: x, y, z, neighbor blockID
     */
    public void onNeighborBlockChange(World par1World, int par2, int par3, int par4, int par5)
    {
        if (!par1World.isRemote)
        {
            meta = par1World.getBlockMetadata(par2, par3, par4);
        	
        	if (this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.scheduleBlockUpdate(par2, par3, par4, this.blockID, 4);
            }
            else if (!this.powered && par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
            {
                par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.lampStairsActive.blockID, meta);
            }
        }
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World par1World, int par2, int par3, int par4, Random par5Random)
    {
    	meta = par1World.getBlockMetadata(par2, par3, par4);
    	
    	if (!par1World.isRemote && this.powered && !par1World.isBlockIndirectlyGettingPowered(par2, par3, par4))
        {
        	par1World.setBlockAndMetadataWithNotify(par2, par3, par4, modBlocks.lampStairsIdle.blockID, meta);
        }
    }

    /**
     * Returns the ID of the items to drop on destruction.
     */
    public int idDropped(int par1, Random par2Random, int par3)
    {
        return modBlocks.lampStairsIdle.blockID;
    }

    @SideOnly(Side.CLIENT)

    /**
     * only called by clickMiddleMouseButton , and passed to inventory.setCurrentItem (along with isCreative)
     */
    public int idPicked(World par1World, int par2, int par3, int par4)
    {
        return modBlocks.lampStairsIdle.blockID;
    }
	
	public void setBlockBoundsBasedOnState(IBlockAccess par1IBlockAccess, int par2, int par3, int par4)
	{
	         if (this.field_72156_cr)
	         {
	                 this.setBlockBounds(0.5F * (float)(this.field_72160_cs % 2), 0.5F * (float)(this.field_72160_cs / 2 % 2), 0.5F * (float)(this.field_72160_cs / 4 % 2), 0.5F + 0.5F * (float)(this.field_72160_cs % 2), 0.5F + 0.5F * (float)(this.field_72160_cs / 2 % 2), 0.5F + 0.5F * (float)(this.field_72160_cs / 4 % 2));
	         }
	         else
	         {
	                 this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	         }
	}
	/**
	         * Is this block (a) opaque and (B) a full 1m cube? This determines whether or not to render the shared face of two
	         * adjacent blocks and also whether the player can attach torches, redstone wire, etc to this block.
	         */
	public boolean isOpaqueCube()
	{
	         return false;
	}
	/**
	         * If this block doesn't render as an ordinary block it will return False (examples: signs, buttons, stairs, etc)
	         */
	public boolean renderAsNormalBlock()
	{
	         return false;
	}
	/**
	         * The type of render function that is called for this block
	         */
	public int getRenderType()
	{
	         return 10;
	}
	/**
	         * if the specified block is in the given AABB, add its collision bounding box to the given list
	         */
	public void addCollidingBlockToList(World par1World, int par2, int par3, int par4, AxisAlignedBB par5AxisAlignedBB, List par6List, Entity par7Entity)
	{
	         int var8 = par1World.getBlockMetadata(par2, par3, par4);
	         int var9 = var8 & 3;
	         float var10 = 0.0F;
	         float var11 = 0.5F;
	         float var12 = 0.5F;
	         float var13 = 1.0F;
	         if ((var8 & 4) != 0)
	         {
	                 var10 = 0.5F;
	                 var11 = 1.0F;
	                 var12 = 0.0F;
	                 var13 = 0.5F;
	         }
	         this.setBlockBounds(0.0F, var10, 0.0F, 1.0F, var11, 1.0F);
	         super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	         if (var9 == 0)
	         {
	                 this.setBlockBounds(0.5F, var12, 0.0F, 1.0F, var13, 1.0F);
	                 super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	         }
	         else if (var9 == 1)
	         {
	                 this.setBlockBounds(0.0F, var12, 0.0F, 0.5F, var13, 1.0F);
	                 super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	         }
	         else if (var9 == 2)
	         {
	                 this.setBlockBounds(0.0F, var12, 0.5F, 1.0F, var13, 1.0F);
	                 super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	         }
	         else if (var9 == 3)
	         {
	                 this.setBlockBounds(0.0F, var12, 0.0F, 1.0F, var13, 0.5F);
	                 super.addCollidingBlockToList(par1World, par2, par3, par4, par5AxisAlignedBB, par6List, par7Entity);
	         }
	         this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
	}
	/**
	         * Called when the block is placed in the world.
	         */
	public void onBlockPlacedBy(World par1World, int par2, int par3, int par4, EntityLiving par5EntityLiving)
	{
	         int var6 = MathHelper.floor_double((double)(par5EntityLiving.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3;
	         int var7 = par1World.getBlockMetadata(par2, par3, par4) & 4;
	         if (var6 == 0)
	         {
	                 par1World.setBlockMetadataWithNotify(par2, par3, par4, 2 | var7);
	         }
	         if (var6 == 1)
	         {
	                 par1World.setBlockMetadataWithNotify(par2, par3, par4, 1 | var7);
	         }
	         if (var6 == 2)
	         {
	                 par1World.setBlockMetadataWithNotify(par2, par3, par4, 3 | var7);
	         }
	         if (var6 == 3)
	         {
	                 par1World.setBlockMetadataWithNotify(par2, par3, par4, 0 | var7);
	         }
	}
	/**
	         * called before onBlockPlacedBy by ItemBlock and ItemReed
	         */
	public void updateBlockMetadata(World par1World, int par2, int par3, int par4, int par5, float par6, float par7, float par8)
	{
	         if (par5 == 0 || par5 != 1 && (double)par7 > 0.5D)
	         {
	                 int var9 = par1World.getBlockMetadata(par2, par3, par4);
	                 par1World.setBlockMetadataWithNotify(par2, par3, par4, var9 | 4);
	         }
	}
	/**
	         * Ray traces through the blocks collision from start vector to end vector returning a ray trace hit. Args: world,
	         * x, y, z, startVec, endVec
	         */
	public MovingObjectPosition collisionRayTrace(World par1World, int par2, int par3, int par4, Vec3 par5Vec3, Vec3 par6Vec3)
	{
	         MovingObjectPosition[] var7 = new MovingObjectPosition[8];
	         int var8 = par1World.getBlockMetadata(par2, par3, par4);
	         int var9 = var8 & 3;
	         boolean var10 = (var8 & 4) == 4;
	         int[] var11 = field_72159_a[var9 + (var10 ? 4 : 0)];
	         this.field_72156_cr = true;
	         int var14;
	         int var15;
	         int var16;
	         for (int var12 = 0; var12 < 8; ++var12)
	         {
	                 this.field_72160_cs = var12;
	                 int[] var13 = var11;
	                 var14 = var11.length;
	                 for (var15 = 0; var15 < var14; ++var15)
	                 {
	                         var16 = var13[var15];
	                         if (var16 == var12)
	                         {
	                                 ;
	                         }
	                 }
	                 var7[var12] = super.collisionRayTrace(par1World, par2, par3, par4, par5Vec3, par6Vec3);
	         }
	         int[] var21 = var11;
	         int var24 = var11.length;
	         for (var14 = 0; var14 < var24; ++var14)
	         {
	                 var15 = var21[var14];
	                 var7[var15] = null;
	         }
	         MovingObjectPosition var23 = null;
	         double var22 = 0.0D;
	         MovingObjectPosition[] var25 = var7;
	         var16 = var7.length;
	         for (int var17 = 0; var17 < var16; ++var17)
	         {
	                 MovingObjectPosition var18 = var25[var17];
	                 if (var18 != null)
	                 {
	                         double var19 = var18.hitVec.squareDistanceTo(par6Vec3);
	                         if (var19 > var22)
	                         {
	                                 var23 = var18;
	                                 var22 = var19;
	                         }
	                 }
	         }
	         return var23;
	}

}
