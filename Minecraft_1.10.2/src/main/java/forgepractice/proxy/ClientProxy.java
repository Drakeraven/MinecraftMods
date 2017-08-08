package forgepractice.proxy;

import forgepractice.Init.BaseModItems;
import forgepractice.tileentity.EntityThrowBomb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderSnowball;
import net.minecraftforge.fml.client.registry.IRenderFactory;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders() {
		BaseModItems.registerRenders();
	}
	
	@Override
	public void registerEntities(){
		
		RenderingRegistry.registerEntityRenderingHandler(EntityThrowBomb.class, new IRenderFactory<EntityThrowBomb>() {
			@Override
			public Render<? super EntityThrowBomb> createRenderFor(RenderManager manager) {
				
				return new RenderSnowball<EntityThrowBomb>(manager, BaseModItems.bomb, Minecraft.getMinecraft().getRenderItem());
			}
		});
		
	}
}
