package net.chaolux.farmerscuttingeverything.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = "farmerscuttingeverything",bus= EventBusSubscriber.Bus.MOD)
public class ModDataGenerators extends RecipeProvider {

    @Override
    protected void buildRecipes(RecipeOutput output) {
        ModCuttingRecipes.register(output);
    }

    public ModDataGenerators(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator=event.getGenerator();
        PackOutput output=generator.getPackOutput();
        generator.addProvider(event.includeServer(), new ModDataGenerators(output, event.getLookupProvider()));
    }
}
