package mint.mintmats.common;

import mint.mintmats.common.blocks.modBlocks;
import mint.mintmats.common.core.CommonProxy;
import mint.mintmats.common.core.configurationHelper;
import mint.mintmats.common.core.recipeHelper;
import mint.mintmats.common.items.modItems;
import net.minecraft.src.Block;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "MintMats", name = "Mint's Materials", version = "1.0.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mintmats
{	
	@SidedProxy(clientSide = "mint.mintmats.client.ClientProxy", serverSide = "mint.mintmats.common.core.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("MintMats")
	public static mintmats instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		configurationHelper.init(event.getSuggestedConfigurationFile());

	}

	@Init
	public void init(FMLInitializationEvent event)
	{
		//initialize the blocks
		modBlocks.init();
		
		//initialize the items
		modItems.init();
		
		//initialize recipes
		recipeHelper.init();
		
		proxy.registerRenderThings();
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}