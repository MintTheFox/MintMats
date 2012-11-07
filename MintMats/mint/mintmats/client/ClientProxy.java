package mint.mintmats.client;

import net.minecraftforge.client.MinecraftForgeClient;
import mint.mintmats.common.core.CommonProxy;

public class ClientProxy extends CommonProxy
{
    @Override
    public void registerRenderThings()
    {
    MinecraftForgeClient.preloadTexture("/mint/mintmats/common/blocks/blocks.png");
    MinecraftForgeClient.preloadTexture("/mint/mintmats/common/items/items.png");
    }
}
