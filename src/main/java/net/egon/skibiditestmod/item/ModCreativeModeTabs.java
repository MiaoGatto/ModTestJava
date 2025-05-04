package net.egon.skibiditestmod.item;

import net.egon.skibiditestmod.SkibidiTestMod;
import net.egon.skibiditestmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SkibidiTestMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SKIBIDI_TAB = CREATIVE_MODE_TABS.register ("skibidi_tab",
            () -> CreativeModeTab.builder().icon (() -> new ItemStack(ModItems.SKIBIDITE.get ()))
                    .title (Component.translatable ("creativetab.skibidi_tab"))
                    .displayItems ((pParameters, pOutput) -> {
                        pOutput.accept (ModItems.SKIBIDITE.get ());
                        pOutput.accept (ModItems.RAW_SKIBIDITE.get ());

                        pOutput.accept (ModBlocks.SKIBIDITE_BLOCK.get ());
                        pOutput.accept (ModBlocks.RAW_SKIBIDITE_BLOCK.get ());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register (eventBus);
    }
}
