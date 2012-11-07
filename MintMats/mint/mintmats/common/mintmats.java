package mint.mintmats.common;

import mint.mintmats.common.blocks.modBlocks;
import mint.mintmats.common.core.CommonProxy;
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

@Mod(modid = "Mint_MintMats", name = "Mint's Materials", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class mintmats
{
	public static Block oreblock;
	public static int oreblockId = 229;
	
	@SidedProxy(clientSide = "mint.mintmats.client.ClientProxy", serverSide = "mint.mintmats.common.core.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance("MintMats")
	public static mintmats instance;
	
	@PreInit
	public void preInit(FMLPreInitializationEvent event)
	{
		//config stuff [will mess with after I get the mod working]
		//ConfigurationHelper.init(event.getSuggestedConfigurationFile());
		//initialize the blocks
		modBlocks.init();
		
		//initialize the items
		modItems.init();
	}

	@Init
	public void init(FMLInitializationEvent event)
	{
		//initialize recipes
		recipeHelper.init();
		
		proxy.registerRenderThings();
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}