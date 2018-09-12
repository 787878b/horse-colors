package felinoid.horse_colors;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.registries.*;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.EntityEntryBuilder;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;


public class ModEntities {
    private static int ID = 0;

	@SubscribeEvent
	public static void registerEntites(RegistryEvent.Register<EntityEntry> event) {
        String horse_name = "horse_felinoid";
		EntityEntry entry = EntityEntryBuilder.create()
            .entity(EntityHorseFelinoid.class)
            // Last parameter is network ID, which needs to be unique per mod.
            .id(new ResourceLocation(HorseColors.MODID, horse_name), ID++)
            .name(horse_name)
            .egg(0xFFFFFF, 0xAAAAAA)
            .tracker(64, 20, false)
            .build();
        event.getRegistry().register(entry);
	}
}