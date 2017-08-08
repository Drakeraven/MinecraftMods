package forgepractice;

import forgepractice.proxy.CommonProxy;
import forgepractice.util.Utils;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class ForgePractice {
	
	@Mod.Instance(Reference.MODID)
	public static ForgePractice instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_SIDE, serverSide = Reference.SERVER_SIDE)
	public static CommonProxy proxy;
	
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {
		Utils.getLogger().info("Pre-Init...");
		
		
		proxy.registerRenders();
		proxy.registerEntities();
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		Utils.getLogger().info("Init..");
		
		
	}
	
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {
		Utils.getLogger().info("Post-Init...");
		
	}
}
