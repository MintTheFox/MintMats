package mint.mintmats.common.items;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;
import net.minecraft.src.Item;
import net.minecraft.src.ItemFood;
import net.minecraft.src.Potion;

public class modItems
{
	//tools
	public static Item hammer;
	public static Item oreHammer;
	public static Item knife;
	public static Item oreKnife;
	public static Item appleGum;
	public static Item melonGum;
	
	//food
	public static Item hamburger;
	
	public static void init()
	{
		//item settings
		hammer = new itemHammer(550).setIconIndex(16).setItemName("ironHammer");
		//oreHammer = new itemOreHammer(551).setIconIndex(255).setItemName("oreHammer");
		knife = new itemKnife(552).setIconIndex(18).setItemName("ironKnife");
		//oreKnife = new itemOreKnife(553).setIconIndex(255).setItemName("oreKknife");
		hamburger = new itemHamburger(554, 14, 1F, true).setPotionEffect(Potion.moveSlowdown.id, 30, 2, 1F).setIconIndex(0).setItemName("hamburger");
		appleGum = new itemAppleGum(555, 1, 0.1F, false).setAlwaysEdible().setPotionEffect(Potion.regeneration.id, 5, 0, 1F).setIconIndex(1).setItemName("appleGum");
		melonGum = new itemMelonGum(556, 1, 0.1F, false).setAlwaysEdible().setPotionEffect(Potion.moveSpeed.id, 120, 0, 1F).setIconIndex(2).setItemName("melonGum");
		
		//set container to make it returnable
		hammer.setContainerItem(hammer);
		knife.setContainerItem(knife);
		
		//insert item names
		LanguageRegistry.addName(hammer, "Iron Hammer");
		//LanguageRegistry.addName(oreHammer, "Ore Hammer");
		LanguageRegistry.addName(knife, "Iron Knife");
		//LanguageRegistry.addName(oreKnife, "Ore Knife");
		LanguageRegistry.addName(hamburger, "Hamburger");
		LanguageRegistry.addName(appleGum, "Apple Bubblegum");
		LanguageRegistry.addName(melonGum, "Watermelon Bubblegum");
		
	}

}
