package net.egon.skibiditestmod.item;

import net.egon.skibiditestmod.SkibidiTestMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create (ForgeRegistries.ITEMS, SkibidiTestMod.MOD_ID);

    public static final RegistryObject<Item> SKIBIDITE = ITEMS.register("skibidite",
            () -> new Item (new Item.Properties ()));

    public static final RegistryObject<Item> RAW_SKIBIDITE = ITEMS.register("raw_skibidite",
            () -> new Item (new Item.Properties ()));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
