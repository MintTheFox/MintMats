package mint.mintmats.common.core;

import java.io.File;
import java.util.logging.Level;

import cpw.mods.fml.common.FMLLog;

import mint.mintmats.common.blocks.blockIDs;
import net.minecraftforge.common.Configuration;
import static net.minecraftforge.common.Configuration.*;

public class ConfigurationHelper
{

	public static void init(File mmConfig)
	{
		Configuration config = new Configuration(mmConfig);
		
		try
		{
			config.load();
			//auto-resolver toggle [disabled for now since I don't know how it works
			//ConfigSettings.AUTO_RESOLVE_BLOCK_IDS = config
		    //        .get(CATEGORY_BLOCK, "autoresolve_block_ids", ConfigSettings.AUTO_RESOLVE_BLOCK_IDS_DEFAULT)
		    //         .getBoolean(ConfigSettings.AUTO_RESOLVE_BLOCK_IDS_DEFAULT);
			
			//block IDs [will mess with later]
			//blockIDs.MUD = config.getBlock()
			
		}
		
		catch (Exception e)
		{
            FMLLog.log(Level.SEVERE, e, "MintMats has had a problem loading its configuration");
        }
        
		finally
		{
            config.save();
		}
		
	}

}
