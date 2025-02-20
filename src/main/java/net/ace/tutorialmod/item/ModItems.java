package net.ace.tutorialmod.item;

import net.ace.tutorialmod.TutorialMod;
import net.ace.tutorialmod.item.custom.MetalDectorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> SAPPHIRE = registerBasicItem("sapphire");
    public static final RegistryObject<Item> RAW_SAPPHIRE = registerBasicItem("raw_sapphire");

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDectorItem(new Item.Properties()));

    private static RegistryObject<Item> registerBasicItem(String name){
        return ITEMS.register(name, () -> new Item(new Item.Properties().durability(100)));
    }

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}
