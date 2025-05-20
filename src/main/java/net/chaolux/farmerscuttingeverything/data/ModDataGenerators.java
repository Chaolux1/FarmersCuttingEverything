package net.chaolux.farmerscuttingeverything.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.function.Consumer;

@Mod.EventBusSubscriber(modid = "farmerscuttingeverything",bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModDataGenerators extends RecipeProvider {

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ModCuttingRecipes.register(consumer);
    }

    public ModDataGenerators(PackOutput output) {
        super(output);
    }

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator=event.getGenerator();
        PackOutput output=generator.getPackOutput();
        generator.addProvider(event.includeServer(), new ModDataGenerators(output));
    }
}
