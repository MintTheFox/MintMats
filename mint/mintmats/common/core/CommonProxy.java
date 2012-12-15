package mint.mintmats.common.core;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.src.EntityPlayer;
import net.minecraft.src.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;

public class CommonProxy implements IGuiHandler
{
	public void registerRenderThings(){}
	
	public boolean postEventToBus(Event event)
	{
		return MinecraftForge.EVENT_BUS.post(event);
	}
	
	public void registerRenderInformation()
	{
	}

	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
	  return null;
	}

	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z)
	{
	  return null;
	}
}
