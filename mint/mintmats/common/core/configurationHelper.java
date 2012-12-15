package mint.mintmats.common.core;

import static net.minecraftforge.common.Configuration.*;

import java.io.File;
import java.util.logging.Level;

import mint.mintmats.common.blocks.modBlocks;
import mint.mintmats.common.items.modItems;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.FMLLog;

public class configurationHelper
{
    //auto resolver
	/*public static boolean autoResolve;
    public static final boolean autoResolve_default = false;*/
	
    //blocks
	public static int mud;
	public static int mudBricks;
	public static int customEndStone;
	public static int customStairs;
	public static int vanillaStairsPlus;
	public static int customFences;
	
	//items
	public static int appleGum;
	public static int melonGum;
	public static int hamburger;
	public static int hammer;
	//public static int oreHammer;
	public static int knife;
	//public static int oreKnife;
	public static int chisel;
	//public static int oreChisel;
	public static int logTurner;
	
	public static int grassSeeds;
	
	public static int toolDurability;
	public static int mudDryRate;
	public static int blockLightTime;
	public static boolean useCustomStairs;
	public static boolean useVanillaStairsPlus;
	public static boolean reclaim;
	
	//default IDs
	public static int mud_default = 389;
	public static int mudBrick_default = 390;
	public static int customEndStone_default = 391;
	
	public static int vanillaStairsPlus_default = 410;
	public static int customStairs_default = 420;
	
	public static int customFences_default = 500;
	
	public static int appleGum_default = 31640;
	public static int melonGum_default = 31641;
	public static int hamburger_default = 31642;
	
	public static int hammer_default = 31643;
	//public static int oreHammer_default = 31644;
	public static int knife_default = 31645;
	//public static int oreKnife_default = 31646;
	public static int chisel_default = 31647;
	//public static int oreChisel_default = 31648;
	public static int logTurner_default = 31649;
	
	public static int grassSeeds_default = 31650;
	
	public static int toolDurability_default = 64;
	

	public static int mudDryRate_default = 250;
	
	public static int blockLightTime_default = 5;
	
	public static boolean useCustomStairs_default = true;
	
	public static boolean useVanillaStairsPlus_default = true;
	
	public static boolean reclaim_default = true;
	
	public static void init(File mmConfig)
	{
		
		Configuration config = new Configuration(mmConfig);
		
		try
		{
			config.load();

			//auto-resolver [will figure out later]
			/*autoResolve = config
					.get(CATEGORY_BLOCK, "auto_resolve_block_ids", autoResolve_default)
            		.getBoolean(autoResolve_default);*/
			
			//general config options
            Property toolDurabilityP = config
            		.get(CATEGORY_GENERAL, "tool_durability", toolDurability_default);
            toolDurability = toolDurabilityP.getInt();
            toolDurabilityP.comment = "How many uses/crafts you get out of a tool before breaking";
            
            
            Property mudDryRateP = config
            		.get(CATEGORY_GENERAL, "mud_dry_rate", mudDryRate_default);
            mudDryRate = mudDryRateP.getInt();
            mudDryRateP.comment = "How many random world tick each mud block needs to dry";
            
            
            Property blockLightTimeP = config
            		.get(CATEGORY_GENERAL, "block_light_time", blockLightTime_default);
            blockLightTime = blockLightTimeP.getInt();
            blockLightTimeP.comment = "How much time [in seconds not ticks] the preasure lamps and lamp stairs stay lit.";
            
            
            Property useCustomStairsP = config
            		.get(CATEGORY_GENERAL, "use_custom_stairs", useCustomStairs_default);
            useCustomStairs = useCustomStairsP.getBoolean(true);
            useCustomStairsP.comment = "Use the stairs of the custom blocks. Turning off to save IDs.";
            
            
            Property useVanillaStairsP = config
            		.get(CATEGORY_GENERAL, "use_extra_vanilla_stairs", useVanillaStairsPlus_default);
            useVanillaStairsPlus = useVanillaStairsP.getBoolean(true);
            useVanillaStairsP.comment = "Use extra vanilla stairs. Turning off to save IDs.";
            
            
            Property reclaimP = config
            		.get(CATEGORY_GENERAL, "use_reclaimation_recipes", reclaim_default);
            reclaim = reclaimP.getBoolean(true);
            reclaimP.comment = "Use the reclaimation recipes for the valuable recources stairs. Does nothing if 'use_extra_vanilla_stairs' is false.";
			
			//blocks
            mud =  config
            		.getBlock("mud_block", mud_default)
            		.getInt(mud_default);
            
            mudBricks =  config
            		.getBlock("mud_bricks", mudBrick_default)
            		.getInt(mudBrick_default);
            
            customEndStone =  config
            		.getBlock("custom_end_stone", customEndStone_default)
            		.getInt(customEndStone_default);
            
            Property customStairsP =  config
            		.getBlock("mod_block_stairs", customStairs_default);
            customStairs = customStairsP.getInt();
            customStairsP.comment = "Uses 10 Block IDs";
            
            Property vanillaStairsPlusP =  config
            		.getBlock("extra_vanilla_stairs", vanillaStairsPlus_default);
            vanillaStairsPlus = vanillaStairsPlusP.getInt();
            vanillaStairsPlusP.comment = "Uses 12 block IDs";
            		
            
            customFences =  config
            		.getBlock("custom_fences", customFences_default)
            		.getInt(customFences_default);
            
            
            //items           
            appleGum =  config
            		.getItem("appleGum", appleGum_default)
            		.getInt(appleGum_default);
            
            melonGum =  config
            		.getItem("melonGum", melonGum_default)
            		.getInt(melonGum_default);

            hamburger =  config
            		.getItem("hamburger", hamburger_default)
            		.getInt(hamburger_default);
            
            hammer =  config
            		.getItem("hammer", hammer_default)
            		.getInt(hammer_default);
            
            knife =  config
            		.getItem("knife", knife_default)
            		.getInt(knife_default);
            
            chisel =  config
            		.getItem("chisel", chisel_default)
            		.getInt(chisel_default);
            
            logTurner =  config
            		.getItem("log_turner", logTurner_default)
            		.getInt(logTurner_default);
            
            grassSeeds =  config
            		.getItem("grass_seeds", grassSeeds_default)
            		.getInt(grassSeeds_default);
            
		}
		
		catch (Exception e)
		{
            FMLLog.log(Level.SEVERE, e, "MintMats has had a problem loading its configuration!");
        }
        
		finally
		{
            config.save();
		}
		
	}

}
