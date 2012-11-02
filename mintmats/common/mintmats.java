package mint.mintmats.common;

import net.minecraftforge.common.Configuration;
import mint.mintmats.common.blocks.modBlocks;
import mint.mintmats.common.core.ConfigurationHelper;
import mint.mintmats.common.items.modItems;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

@Mod(modid = "Mint_MintMats", name = "Mint's Materials", version = "0.0.1")
@NetworkMod(clientSideRequired = true, serverSideRequired = true)

public class mintmats
{
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
		
	}

	@PostInit
	public static void postInit(FMLPostInitializationEvent event)
	{
		
	}
}