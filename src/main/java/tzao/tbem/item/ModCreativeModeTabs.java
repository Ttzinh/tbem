package tzao.tbem.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import tzao.tbem.TzaoBetterExlorationMod;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, TzaoBetterExlorationMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TZAOBETTEREXPLORATION_TAB = CREATIVE_MODE_TABS.register("tzaobetterexploration_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMBER.get()))
                    .title(Component.translatable("creativetab.tzaobetterexploration_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.AMBER.get());
                        pOutput.accept(ModItems.ARTIFACT.get());


                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
