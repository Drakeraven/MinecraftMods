package forgepractice;

import forgepractice.Init.BaseModItems;
import forgepractice.proxy.CommonProxy;
import forgepractice.tileentity.EntityThrowBomb;
import forgepractice.util.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.EntityRegistry;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ForgePractice {
	
	@Mod.Instance(Reference.MODID)
	public static ForgePractice instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre-Init...");
		BaseModItems.init();
		BaseModItems.register();
		proxy.registerRenders();
		
		int modEntityID = 0;
		EntityRegistry.registerModEntity(EntityThrowBomb.class, "throw_bomb", ++modEntityID, this, 64, 10, true);
		proxy.registerEntities();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Init..");
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post-Init...");
		
	}
}
