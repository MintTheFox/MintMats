package mint.mintmats.common.core;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;

public class CommonProxy
{
	public void registerRenderThings(){}
	
	public boolean postEventToBus(Event event)
	{
		return MinecraftForge.EVENT_BUS.post(event);
	}

}
