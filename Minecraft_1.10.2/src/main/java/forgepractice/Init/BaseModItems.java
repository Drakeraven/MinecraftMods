package forgepractice.Init;

import forgepractice.Reference;
import forgepractice.items.ThrowBomb;
import forgepractice.util.Utils;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class BaseModItems {
	
	public static Item bomb;
	
	
	public static void init() {
		bomb = new ThrowBomb("throw_bomb", "throw_bomb");
	}
	
	public static void register() {
		registerItem(bomb);
	}
	
	
	public static void registerRenders() {
		registerRender(bomb);
		
	}
	
	public static void registerItem(Item item) {
		GameRegistry.register(item);
		Utils.getLogger().info("Registered Item:" + item.getUnlocalizedName().substring(5));
	}
	
	public static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, 
				new ModelResourceLocation(new ResourceLocation(Reference.MODID, 
						item.getUnlocalizedName().substring(5)), "Inventory"));
		Utils.getLogger().info("Registered Render for: " + item.getUnlocalizedName().substring(5));	
	}

}
