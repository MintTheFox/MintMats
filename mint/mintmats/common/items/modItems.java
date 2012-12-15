package mint.mintmats.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import mint.mintmats.common.core.configurationHelper;
import net.minecraft.src.Item;
import net.minecraft.src.ItemFood;
import net.minecraft.src.ItemStack;
import net.minecraft.src.Potion;
import net.minecraftforge.common.MinecraftForge;

public class modItems
{
	//tools
	public static Item hammer;
	public static Item oreHammer;
	public static Item knife;
	public static Item oreKnife;
	public static Item chisel;
	public static Item oreChisel;
	public static Item logTurner;
	
	//food
	public static Item hamburger;
	public static Item appleGum;
	public static Item melonGum;
	
	public static Item grassSeeds;
	
	public static void init()
	{
		//item settings
		
		hammer = new itemHammer(configurationHelper.hammer).setIconIndex(16).setItemName("hammer");
		//oreHammer = new itemOreHammer(configurationHelper.oreHammer).setIconIndex(255).setItemName(oreHammer_name);
		knife = new itemKnife(configurationHelper.knife).setIconIndex(18).setItemName("knife");
		//oreKnife = new itemOreKnife(configurationHelper.oreKnife).setIconIndex(255).setItemName(oreKknife_name);
		chisel = new itemChisel(configurationHelper.chisel).setIconIndex(20).setItemName("chisel");
		//oreChisel = new itemOreChisel(configurationHelper.oreChisel).setIconIndex(255).setItemName(oreChisel_name);
		logTurner = new itemLogTurner(configurationHelper.logTurner).setIconIndex(22).setItemName("logTurner");
		
		hamburger = new itemHamburger(configurationHelper.hamburger, 14, 1F, true).setPotionEffect(Potion.moveSlowdown.id, 30, 2, 1F).setIconIndex(0).setItemName("hamburger");
		appleGum = new itemAppleGum(configurationHelper.appleGum, 1, 0.1F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 5, 0, 1F).setIconIndex(1).setItemName("appleGum");
		melonGum = new itemMelonGum(configurationHelper.melonGum, 1, 0.1F, false).setAlwaysEdible().setPotionEffect(Potion.moveSpeed.id, 120, 0, 1F).setIconIndex(2).setItemName("melonGum");
		
		grassSeeds = new itemGrassSeeds(configurationHelper.grassSeeds).setIconIndex(32).setItemName("grassSeeds");
		
		//set container to make it returnable
		hammer.setContainerItem(hammer);
		knife.setContainerItem(knife);
		chisel.setContainerItem(chisel);
		
		//insert item names
		LanguageRegistry.addName(logTurner, "Log Rotator");
		LanguageRegistry.addName(hammer, "Iron Hammer");
		//LanguageRegistry.addName(oreHammer, "Ore Hammer");
		LanguageRegistry.addName(knife, "Iron Knife");
		//LanguageRegistry.addName(oreKnife, "Ore Knife");
		LanguageRegistry.addName(chisel, "Iron Chisel");
		//LanguageRegistry.addName(oreChisel, "Ore Chisel");
		
		LanguageRegistry.addName(hamburger, "Hamburger");
		LanguageRegistry.addName(appleGum, "Apple Bubblegum");
		LanguageRegistry.addName(melonGum, "Watermelon Bubblegum");
		
		LanguageRegistry.addName(grassSeeds, "Grass Seeds");
		
		//make grass seeds drop from tall grass
		MinecraftForge.addGrassSeed(new ItemStack(grassSeeds, 1), 20);
		MinecraftForge.addGrassSeed(new ItemStack(grassSeeds, 3), 5);
		
	}

}
