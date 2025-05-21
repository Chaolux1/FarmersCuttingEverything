package net.chaolux.farmerscuttingeverything.data;

import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.ToolActions;
import vectorwing.farmersdelight.common.crafting.ingredient.ToolActionIngredient;
import vectorwing.farmersdelight.common.registry.ModItems;
import vectorwing.farmersdelight.common.tag.ForgeTags;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;

import java.util.function.Consumer;

public class ModCuttingRecipes {
    public static void register(Consumer<FinishedRecipe> consumer) {
        cuttingPickaxe(consumer);
        cuttingAxe(consumer);
        cuttingShovel(consumer);
        cuttingShears(consumer);
        cuttingKnife(consumer);
        cuttingStone(consumer);
        cuttingColorWool(consumer);
        cuttingColorGlass(consumer);
        cuttingColorGlassPane(consumer);
        cuttingColorTerra(consumer);
        cuttingBoxColor(consumer);
        cuttingCandleColor(consumer);
        cuttingColorConcrete(consumer);
        cuttingMiniStone(consumer);
        cuttingSlabStone(consumer);
        cuttingWood(consumer);
        cuttingStoneButton(consumer);
    }

    private static void cuttingPickaxe(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_COBBLESTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONE_BRICKS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SMOOTH_STONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_STONE_BRICKS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRANITE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIORITE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ANDESITE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TINTED_GLASS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SANDSTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COAL_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RED_SANDSTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SEA_LANTERN}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE_BRICKS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.POLISHED_BASALT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DARK_PRISMARINE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GILDED_BLACKSTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PURPUR_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLD_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REDSTONE_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.EMERALD_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LAPIS_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.AMETHYST_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COPPER_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.EXPOSED_COPPER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WEATHERED_COPPER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.OXIDIZED_COPPER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TERRACOTTA}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CRYING_OBSIDIAN}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAW_IRON_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAW_GOLD_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAW_COPPER_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TUBE_CORAL_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BRAIN_CORAL_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BUBBLE_CORAL_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HORN_CORAL_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FIRE_CORAL_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DRIPSTONE_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CALCITE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BONE_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BLUE_ICE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PACKED_ICE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MAGMA_BLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLOWSTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLD_INGOT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONECUTTER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SMITHING_TABLE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRINDSTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LODESTONE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ANVIL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENDER_CHEST}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BLAST_FURNACE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RESPAWN_ANCHOR}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BELL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CAULDRON}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SMOKER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FURNACE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CONDUIT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BREWING_STAND}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BEACON}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LIGHTNING_ROD}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENCHANTING_TABLE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DECORATED_POT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FLOWER_POT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_INGOT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BUCKET}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MINECART}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REPEATER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HOPPER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HOPPER_MINECART}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHEST_MINECART}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FURNACE_MINECART}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TNT_MINECART}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DISPENSER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DROPPER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_TRAPDOOR}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_DOOR}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TRIPWIRE_HOOK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STICKY_PISTON}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.OBSERVER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.POWERED_RAIL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ACTIVATOR_RAIL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAIL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COMPARATOR}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LEVER}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REDSTONE_LAMP}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DAYLIGHT_DETECTOR}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PISTON}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DETECTOR_RAIL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COMPASS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CLOCK}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SPYGLASS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FLINT_AND_STEEL}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SHEARS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FIRE_CHARGE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TURTLE_HELMET}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TRIDENT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLISTERING_MELON_SLICE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LANTERN}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SOUL_LANTERN}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLASS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DRAGON_BREATH}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_CARROT}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE_SHARD}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MUSIC_DISC_5}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RECOVERY_COMPASS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_BARS}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHAIN}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.END_ROD}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PURPUR_PILLAR}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LIGHT_WEIGHTED_PRESSURE_PLATE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HEAVY_WEIGHTED_PRESSURE_PLATE}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.AIR, 2).build(consumer);
    }

    private static void cuttingAxe(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_MOSAIC}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STRIPPED_BAMBOO_BLOCK}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SHIELD}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOW}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CROSSBOW}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOWL}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BROWN_MUSHROOM_BLOCK}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RED_MUSHROOM_BLOCK}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOOKSHELF}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LECTERN}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BARREL}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHEST}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PAINTING}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CAMPFIRE}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NOTE_BLOCK}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.JUKEBOX}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CARTOGRAPHY_TABLE}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FLETCHING_TABLE}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LADDER}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ARMOR_STAND}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LOOM}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHISELED_BOOKSHELF}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BEEHIVE}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SCAFFOLDING}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COMPOSTER}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ITEM_FRAME}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TARGET}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REDSTONE_TORCH}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TORCH}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SOUL_TORCH}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ARROW}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SPECTRAL_ARROW}), new ToolActionIngredient(ToolActions.AXE_DIG), Items.AIR, 2).build(consumer);
    }

    private static void cuttingShovel(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PACKED_MUD}), new ToolActionIngredient(ToolActions.SHOVEL_DIG), Items.MUD).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COARSE_DIRT}), new ToolActionIngredient(ToolActions.SHOVEL_DIG), Items.DIRT).addResultWithChance(Items.GRAVEL,0.5F).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSS_BLOCK}), new ToolActionIngredient(ToolActions.SHOVEL_DIG), Items.MOSS_CARPET).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SNOW_BLOCK}), new ToolActionIngredient(ToolActions.SHOVEL_DIG), Items.SNOWBALL, 4).build(consumer);
    }

    private static void cuttingShears(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PUMPKIN}), Ingredient.of(Tags.Items.SHEARS), Items.CARVED_PUMPKIN).addResultWithChance(Items.PUMPKIN_SEEDS,0.5F,2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COBWEB}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).addResultWithChance(Items.STRING,0.75F).build(consumer);

    }

    private static void cuttingKnife(Consumer<FinishedRecipe> consumer) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SUNFLOWER}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LILY_PAD}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SEA_PICKLE}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SLIME_BLOCK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SPORE_BLOSSOM}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PINK_PETALS}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CRIMSON_FUNGUS}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_FUNGUS}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHORUS_FLOWER}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHORUS_PLANT}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HONEY_BLOCK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CACTUS}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HONEYCOMB}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HAY_BLOCK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_WART_BLOCK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHER_WART_BLOCK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.END_CRYSTAL}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENDER_EYE}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WRITABLE_BOOK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ELYTRA}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FISHING_ROD}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CARROT_ON_A_STICK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_FUNGUS_ON_A_STICK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FIREWORK_ROCKET}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MAP}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TNT}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BRUSH}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LEAD}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BLAZE_ROD}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BONE}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FERMENTED_SPIDER_EYE}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SUGAR_CANE}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOOK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENCHANTED_BOOK}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LEATHER}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TIPPED_ARROW}), Ingredient.of(ForgeTags.TOOLS_KNIVES), Items.AIR, 2).build(consumer);
    }

    private static void cuttingStone(Consumer<FinishedRecipe> consumer) {
        cuttingFromStone(consumer, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_STAIRS, Items.POLISHED_BLACKSTONE_SLAB, Items.POLISHED_BLACKSTONE_WALL);
        cuttingFromStone(consumer, Items.END_STONE_BRICKS, Items.END_STONE_BRICK_STAIRS, Items.END_STONE_BRICK_SLAB, Items.END_STONE_BRICK_WALL);
        cuttingFromStone(consumer, Items.MOSSY_COBBLESTONE, Items.MOSSY_COBBLESTONE_STAIRS, Items.MOSSY_COBBLESTONE_SLAB, Items.MOSSY_COBBLESTONE_WALL);
        cuttingFromStone(consumer, Items.MOSSY_STONE_BRICKS, Items.MOSSY_STONE_BRICK_STAIRS, Items.MOSSY_STONE_BRICK_SLAB, Items.MOSSY_STONE_BRICK_WALL);
        cuttingFromStone(consumer, Items.GRANITE, Items.GRANITE_STAIRS, Items.GRANITE_SLAB, Items.GRANITE_WALL);
        cuttingFromStone(consumer, Items.DIORITE, Items.DIORITE_STAIRS, Items.DIORITE_SLAB, Items.DIORITE_WALL);
        cuttingFromStone(consumer, Items.POLISHED_DEEPSLATE, Items.POLISHED_DEEPSLATE_STAIRS, Items.POLISHED_DEEPSLATE_SLAB, Items.POLISHED_DEEPSLATE_WALL);
        cuttingFromStone(consumer, Items.MUD_BRICKS, Items.MUD_BRICK_STAIRS, Items.MUD_BRICK_SLAB, Items.MUD_BRICK_WALL);
        cuttingFromStone(consumer, Items.RED_SANDSTONE, Items.RED_SANDSTONE_STAIRS, Items.RED_SANDSTONE_SLAB, Items.RED_SANDSTONE_WALL);
        cuttingFromStone(consumer, Items.NETHER_BRICKS, Items.NETHER_BRICK_STAIRS, Items.NETHER_BRICK_SLAB, Items.NETHER_BRICK_WALL);
        cuttingFromStone(consumer, Items.RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_STAIRS, Items.RED_NETHER_BRICK_SLAB, Items.RED_NETHER_BRICK_WALL);
        cuttingFromStone(consumer, Items.BLACKSTONE, Items.BLACKSTONE_STAIRS, Items.BLACKSTONE_SLAB, Items.BLACKSTONE_WALL);
        cuttingFromStone(consumer, Items.POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.POLISHED_BLACKSTONE_WALL);
        cuttingFromStone(consumer, Items.ANDESITE, Items.ANDESITE_STAIRS, Items.ANDESITE_SLAB, Items.ANDESITE_WALL);
        cuttingFromStone(consumer, Items.COBBLESTONE, Items.COBBLESTONE_STAIRS, Items.COBBLESTONE_SLAB, Items.COBBLESTONE_WALL);
        cuttingFromStone(consumer, Items.STONE_BRICKS, Items.STONE_BRICK_STAIRS, Items.STONE_BRICK_SLAB, Items.STONE_BRICK_WALL);
        cuttingFromStone(consumer, Items.DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICK_STAIRS, Items.DEEPSLATE_BRICK_SLAB, Items.DEEPSLATE_BRICK_WALL);
        cuttingFromStone(consumer, Items.COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE_STAIRS, Items.COBBLED_DEEPSLATE_SLAB, Items.COBBLED_DEEPSLATE_WALL);
        cuttingFromStone(consumer, Items.DEEPSLATE_TILES, Items.DEEPSLATE_TILE_STAIRS, Items.DEEPSLATE_TILE_SLAB, Items.DEEPSLATE_TILE_WALL);
        cuttingFromStone(consumer, Items.SANDSTONE, Items.SANDSTONE_STAIRS, Items.SANDSTONE_SLAB, Items.SANDSTONE_WALL);
        cuttingFromStone(consumer, Items.BRICKS, Items.BRICK_STAIRS, Items.BRICK_SLAB, Items.BRICK_WALL);
        cuttingFromStone(consumer, Items.PRISMARINE, Items.PRISMARINE_STAIRS, Items.PRISMARINE_SLAB, Items.PRISMARINE_WALL);
    }

    private static void cuttingFromStone(Consumer<FinishedRecipe> consumer,ItemLike stone,ItemLike stairs,ItemLike slab,ItemLike wall) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stairs}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{slab}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{wall}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
    }

    private static void cuttingMiniStone(Consumer<FinishedRecipe> consumer) {
        cuttingFromMiniStone(consumer, Items.STONE, Items.STONE_STAIRS, Items.STONE_SLAB);
        cuttingFromMiniStone(consumer, Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS, Items.QUARTZ_SLAB);
        cuttingFromMiniStone(consumer, Items.SMOOTH_RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE_STAIRS, Items.SMOOTH_RED_SANDSTONE_SLAB);
        cuttingFromMiniStone(consumer, Items.SMOOTH_QUARTZ, Items.SMOOTH_QUARTZ_STAIRS, Items.SMOOTH_QUARTZ_SLAB);
        cuttingFromMiniStone(consumer, Items.POLISHED_GRANITE, Items.POLISHED_GRANITE_STAIRS, Items.POLISHED_GRANITE_SLAB);
        cuttingFromMiniStone(consumer, Items.DARK_PRISMARINE, Items.DARK_PRISMARINE_STAIRS, Items.DARK_PRISMARINE_SLAB);
        cuttingFromMiniStone(consumer, Items.POLISHED_DIORITE, Items.POLISHED_DIORITE_STAIRS, Items.POLISHED_DIORITE_SLAB);
        cuttingFromMiniStone(consumer, Items.PRISMARINE_BRICKS, Items.PRISMARINE_BRICK_STAIRS, Items.PRISMARINE_BRICK_SLAB);
        cuttingFromMiniStone(consumer, Items.POLISHED_ANDESITE, Items.POLISHED_ANDESITE_STAIRS, Items.POLISHED_ANDESITE_SLAB);
        cuttingFromMiniStone(consumer, Items.SMOOTH_SANDSTONE, Items.SMOOTH_SANDSTONE_STAIRS, Items.SMOOTH_SANDSTONE_SLAB);
        cuttingFromMiniStone(consumer, Items.PURPUR_BLOCK, Items.PURPUR_STAIRS, Items.PURPUR_SLAB);
        cuttingFromMiniStone(consumer, Items.CUT_COPPER, Items.CUT_COPPER_STAIRS, Items.CUT_COPPER_SLAB);
        cuttingFromMiniStone(consumer, Items.EXPOSED_CUT_COPPER, Items.EXPOSED_CUT_COPPER_STAIRS, Items.EXPOSED_CUT_COPPER_SLAB);
        cuttingFromMiniStone(consumer, Items.WEATHERED_CUT_COPPER, Items.WEATHERED_CUT_COPPER_STAIRS, Items.WEATHERED_CUT_COPPER_SLAB);
        cuttingFromMiniStone(consumer, Items.OXIDIZED_CUT_COPPER, Items.OXIDIZED_CUT_COPPER_STAIRS, Items.OXIDIZED_CUT_COPPER_SLAB);
    }

    private static void cuttingFromMiniStone(Consumer<FinishedRecipe> consumer,ItemLike stone,ItemLike stairs,ItemLike slab) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stairs}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{slab}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
    }

    private static void cuttingSlabStone(Consumer<FinishedRecipe> consumer) {
        cuttingFromSlabStone(consumer, Items.CUT_RED_SANDSTONE, Items.CUT_RED_SANDSTONE_SLAB);
        cuttingFromSlabStone(consumer, Items.SMOOTH_STONE, Items.SMOOTH_STONE_SLAB);
    }

    private static void cuttingFromSlabStone(Consumer<FinishedRecipe> consumer,ItemLike stone,ItemLike slab) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{slab}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
    }

    private static void cuttingWood(Consumer<FinishedRecipe> consumer) {
        cuttingFromWood(consumer, Items.OAK_PLANKS, Items.OAK_STAIRS, Items.OAK_SLAB, Items.OAK_FENCE_GATE, Items.OAK_FENCE, Items.OAK_BUTTON, Items.OAK_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_STAIRS, Items.SPRUCE_SLAB, Items.SPRUCE_FENCE_GATE, Items.SPRUCE_FENCE, Items.SPRUCE_BUTTON, Items.SPRUCE_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.BIRCH_PLANKS, Items.BIRCH_STAIRS, Items.BIRCH_SLAB, Items.BIRCH_FENCE_GATE, Items.BIRCH_FENCE, Items.BIRCH_BUTTON, Items.BIRCH_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.CHERRY_PLANKS, Items.CHERRY_STAIRS, Items.CHERRY_SLAB, Items.CHERRY_FENCE_GATE, Items.CHERRY_FENCE, Items.CHERRY_BUTTON, Items.CHERRY_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.ACACIA_PLANKS, Items.ACACIA_STAIRS, Items.ACACIA_SLAB, Items.ACACIA_FENCE_GATE, Items.ACACIA_FENCE, Items.ACACIA_BUTTON, Items.ACACIA_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_STAIRS, Items.DARK_OAK_SLAB, Items.DARK_OAK_FENCE_GATE, Items.DARK_OAK_FENCE, Items.DARK_OAK_BUTTON, Items.DARK_OAK_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_STAIRS, Items.JUNGLE_SLAB, Items.JUNGLE_FENCE_GATE, Items.JUNGLE_FENCE, Items.JUNGLE_BUTTON, Items.JUNGLE_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_STAIRS, Items.MANGROVE_SLAB, Items.MANGROVE_FENCE_GATE, Items.MANGROVE_FENCE, Items.MANGROVE_BUTTON, Items.MANGROVE_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.WARPED_PLANKS, Items.WARPED_STAIRS, Items.WARPED_SLAB, Items.WARPED_FENCE_GATE, Items.WARPED_FENCE, Items.WARPED_BUTTON, Items.WARPED_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_STAIRS, Items.CRIMSON_SLAB, Items.CRIMSON_FENCE_GATE, Items.CRIMSON_FENCE, Items.CRIMSON_BUTTON, Items.CRIMSON_PRESSURE_PLATE);
        cuttingFromWood(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_STAIRS, Items.BAMBOO_SLAB, Items.BAMBOO_FENCE_GATE, Items.BAMBOO_FENCE, Items.BAMBOO_BUTTON, Items.BAMBOO_PRESSURE_PLATE);
    }

    private static void cuttingFromWood(Consumer<FinishedRecipe> consumer,ItemLike planks,ItemLike stairs,ItemLike slab,ItemLike fence_gate,ItemLike fence,ItemLike button,ItemLike pressure_plate) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stairs}), new ToolActionIngredient(ToolActions.AXE_DIG), planks).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{slab}), new ToolActionIngredient(ToolActions.AXE_DIG), planks).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{fence_gate}), new ToolActionIngredient(ToolActions.AXE_DIG), planks).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{fence}), new ToolActionIngredient(ToolActions.AXE_DIG), planks).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{button}), new ToolActionIngredient(ToolActions.AXE_DIG), planks).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pressure_plate}), new ToolActionIngredient(ToolActions.AXE_DIG), planks).build(consumer);
    }

    private static void cuttingStoneButton(Consumer<FinishedRecipe> consumer) {
        cuttingFromStoneButton(consumer, Items.STONE, Items.STONE_BUTTON, Items.STONE_PRESSURE_PLATE);
        cuttingFromStoneButton(consumer, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BUTTON, Items.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    }

    private static void cuttingFromStoneButton(Consumer<FinishedRecipe> consumer,ItemLike stone,ItemLike button,ItemLike pressure_plate) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{button}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pressure_plate}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), stone).build(consumer);
    }

    private static void cuttingColorWool(Consumer<FinishedRecipe> consumer) {
        cuttingFromColorWool(consumer, Items.WHITE_WOOL, Items.LIGHT_GRAY_WOOL, Items.GRAY_WOOL, Items.BLACK_WOOL, Items.BROWN_WOOL, Items.RED_WOOL, Items.ORANGE_WOOL, Items.YELLOW_WOOL, Items.LIME_WOOL, Items.GRAY_WOOL, Items.CYAN_WOOL, Items.LIGHT_BLUE_WOOL, Items.BLUE_WOOL, Items.PURPLE_CANDLE, Items.MAGENTA_WOOL, Items.PINK_WOOL);
        cuttingFromColorWool(consumer, Items.WHITE_BED, Items.LIGHT_GRAY_BED, Items.GRAY_BED, Items.BLACK_BED, Items.BROWN_BED, Items.RED_BED, Items.ORANGE_BED, Items.YELLOW_BED, Items.LIME_BED, Items.GRAY_BED, Items.CYAN_BED, Items.LIGHT_BLUE_BED, Items.BLUE_BED, Items.PURPLE_CANDLE, Items.MAGENTA_BED, Items.PINK_BED);
        cuttingFromColorWool(consumer, Items.WHITE_CARPET, Items.LIGHT_GRAY_CARPET, Items.GRAY_CARPET, Items.BLACK_CARPET, Items.BROWN_CARPET, Items.RED_CARPET, Items.ORANGE_CARPET, Items.YELLOW_CARPET, Items.LIME_CARPET, Items.GRAY_CARPET, Items.CYAN_CARPET, Items.LIGHT_BLUE_CARPET, Items.BLUE_CARPET, Items.PURPLE_CANDLE, Items.MAGENTA_CARPET, Items.PINK_CARPET);
        cuttingFromColorWool(consumer, Items.WHITE_BANNER, Items.LIGHT_GRAY_BANNER, Items.GRAY_BANNER, Items.BLACK_BANNER, Items.BROWN_BANNER, Items.RED_BANNER, Items.ORANGE_BANNER, Items.YELLOW_BANNER, Items.LIME_BANNER, Items.GRAY_BANNER, Items.CYAN_BANNER, Items.LIGHT_BLUE_BANNER, Items.BLUE_BANNER, Items.PURPLE_CANDLE, Items.MAGENTA_BANNER, Items.PINK_BANNER);
    }

    private static void cuttingFromColorWool(Consumer<FinishedRecipe> consumer,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), Ingredient.of(Tags.Items.SHEARS), Items.STRING).build(consumer);
    }

    private static void cuttingColorConcrete(Consumer<FinishedRecipe> consumer) {
        cuttingFromColorConcrete(consumer, Items.WHITE_CONCRETE, Items.LIGHT_GRAY_CONCRETE, Items.GRAY_CONCRETE, Items.BLACK_CONCRETE, Items.BROWN_CONCRETE, Items.RED_CONCRETE, Items.ORANGE_CONCRETE, Items.YELLOW_CONCRETE, Items.LIME_CONCRETE, Items.GRAY_CONCRETE, Items.CYAN_CONCRETE, Items.LIGHT_BLUE_CONCRETE, Items.BLUE_CONCRETE, Items.PURPLE_CANDLE, Items.MAGENTA_CONCRETE, Items.PINK_CONCRETE);
        cuttingFromColorConcrete(consumer, Items.WHITE_CONCRETE_POWDER, Items.LIGHT_GRAY_CONCRETE_POWDER, Items.GRAY_CONCRETE_POWDER, Items.BLACK_CONCRETE_POWDER, Items.BROWN_CONCRETE_POWDER, Items.RED_CONCRETE_POWDER, Items.ORANGE_CONCRETE_POWDER, Items.YELLOW_CONCRETE_POWDER, Items.LIME_CONCRETE_POWDER, Items.GRAY_CONCRETE_POWDER, Items.CYAN_CONCRETE_POWDER, Items.LIGHT_BLUE_CONCRETE_POWDER, Items.BLUE_CONCRETE_POWDER, Items.PURPLE_CANDLE, Items.MAGENTA_CONCRETE_POWDER, Items.PINK_CONCRETE_POWDER);
    }

    private static void cuttingFromColorConcrete(Consumer<FinishedRecipe> consumer,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(consumer);
    }

    private static void cuttingColorGlassPane(Consumer<FinishedRecipe> consumer) {
        cuttingFromColorGlassPane(consumer, Items.WHITE_STAINED_GLASS_PANE, Items.LIGHT_GRAY_STAINED_GLASS_PANE, Items.GRAY_STAINED_GLASS_PANE, Items.BLACK_STAINED_GLASS_PANE, Items.BROWN_STAINED_GLASS_PANE, Items.RED_STAINED_GLASS_PANE, Items.ORANGE_STAINED_GLASS_PANE, Items.YELLOW_STAINED_GLASS_PANE, Items.LIME_STAINED_GLASS_PANE, Items.GRAY_STAINED_GLASS_PANE, Items.CYAN_STAINED_GLASS_PANE, Items.LIGHT_BLUE_STAINED_GLASS_PANE, Items.BLUE_STAINED_GLASS_PANE, Items.PURPLE_CANDLE, Items.MAGENTA_STAINED_GLASS_PANE, Items.PINK_STAINED_GLASS_PANE);
    }

    private static void cuttingFromColorGlassPane(Consumer<FinishedRecipe> consumer,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS_PANE).build(consumer);
    }

    private static void cuttingColorGlass(Consumer<FinishedRecipe> consumer) {
        cuttingFromColorGlass(consumer, Items.WHITE_STAINED_GLASS, Items.LIGHT_GRAY_STAINED_GLASS, Items.GRAY_STAINED_GLASS, Items.BLACK_STAINED_GLASS, Items.BROWN_STAINED_GLASS, Items.RED_STAINED_GLASS, Items.ORANGE_STAINED_GLASS, Items.YELLOW_STAINED_GLASS, Items.LIME_STAINED_GLASS, Items.GRAY_STAINED_GLASS, Items.CYAN_STAINED_GLASS, Items.LIGHT_BLUE_STAINED_GLASS, Items.BLUE_STAINED_GLASS, Items.PURPLE_CANDLE, Items.MAGENTA_STAINED_GLASS, Items.PINK_STAINED_GLASS);
    }

    private static void cuttingFromColorGlass(Consumer<FinishedRecipe> consumer,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), Ingredient.of(Tags.Items.SHEARS), Items.GLASS).build(consumer);
    }

    private static void cuttingColorTerra(Consumer<FinishedRecipe> consumer) {
        cuttingFromColorTerra(consumer, Items.WHITE_GLAZED_TERRACOTTA, Items.LIGHT_GRAY_GLAZED_TERRACOTTA, Items.GRAY_GLAZED_TERRACOTTA, Items.BLACK_GLAZED_TERRACOTTA, Items.BROWN_GLAZED_TERRACOTTA, Items.RED_GLAZED_TERRACOTTA, Items.ORANGE_GLAZED_TERRACOTTA, Items.YELLOW_GLAZED_TERRACOTTA, Items.LIME_GLAZED_TERRACOTTA, Items.GRAY_GLAZED_TERRACOTTA, Items.CYAN_GLAZED_TERRACOTTA, Items.LIGHT_BLUE_GLAZED_TERRACOTTA, Items.BLUE_GLAZED_TERRACOTTA, Items.PURPLE_CANDLE, Items.MAGENTA_GLAZED_TERRACOTTA, Items.PINK_GLAZED_TERRACOTTA);
        cuttingFromColorTerra(consumer, Items.WHITE_TERRACOTTA, Items.LIGHT_GRAY_TERRACOTTA, Items.GRAY_TERRACOTTA, Items.BLACK_TERRACOTTA, Items.BROWN_TERRACOTTA, Items.RED_TERRACOTTA, Items.ORANGE_TERRACOTTA, Items.YELLOW_TERRACOTTA, Items.LIME_TERRACOTTA, Items.GRAY_TERRACOTTA, Items.CYAN_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA, Items.BLUE_TERRACOTTA, Items.PURPLE_CANDLE, Items.MAGENTA_TERRACOTTA, Items.PINK_TERRACOTTA);    }

    private static void cuttingFromColorTerra(Consumer<FinishedRecipe> consumer,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), Items.CLAY).build(consumer);

    }

    private static void cuttingBoxColor(Consumer<FinishedRecipe> consumer) {
        cuttingFromBoxColor(consumer, Items.CANDLE, Items.WHITE_CANDLE, Items.LIGHT_GRAY_CANDLE, Items.GRAY_CANDLE, Items.BLACK_CANDLE, Items.BROWN_CANDLE, Items.RED_CANDLE, Items.ORANGE_CANDLE, Items.YELLOW_CANDLE, Items.LIME_CANDLE, Items.GRAY_CANDLE, Items.CYAN_CANDLE, Items.LIGHT_BLUE_CANDLE, Items.BLUE_CANDLE, Items.PURPLE_CANDLE, Items.MAGENTA_CANDLE, Items.PINK_CANDLE);
    }

    private static void cuttingFromBoxColor(Consumer<FinishedRecipe> consumer,ItemLike standart,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
    }

    private static void cuttingCandleColor(Consumer<FinishedRecipe> consumer) {
        cuttingFromCandleColor(consumer, Items.SHULKER_BOX, Items.WHITE_SHULKER_BOX, Items.LIGHT_GRAY_SHULKER_BOX, Items.GRAY_SHULKER_BOX, Items.BLACK_SHULKER_BOX, Items.BROWN_SHULKER_BOX, Items.RED_SHULKER_BOX, Items.ORANGE_SHULKER_BOX, Items.YELLOW_SHULKER_BOX, Items.LIME_SHULKER_BOX, Items.GRAY_SHULKER_BOX, Items.CYAN_SHULKER_BOX, Items.LIGHT_BLUE_SHULKER_BOX, Items.BLUE_SHULKER_BOX, Items.PURPLE_SHULKER_BOX, Items.MAGENTA_SHULKER_BOX, Items.PINK_SHULKER_BOX);
    }

    private static void cuttingFromCandleColor(Consumer<FinishedRecipe> consumer,ItemLike standart,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), new ToolActionIngredient(ToolActions.PICKAXE_DIG), standart).build(consumer);
    }
}
