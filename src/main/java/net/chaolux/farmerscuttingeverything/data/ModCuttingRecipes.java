package net.chaolux.farmerscuttingeverything.data;

import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.ItemAbilities;
import vectorwing.farmersdelight.common.crafting.ingredient.ItemAbilityIngredient;
import vectorwing.farmersdelight.data.builder.CuttingBoardRecipeBuilder;
import net.neoforged.neoforge.common.Tags;
import vectorwing.farmersdelight.common.tag.CommonTags;

public class ModCuttingRecipes {
    public static void register(RecipeOutput output) {
        cuttingPickaxe(output);
        cuttingAxe(output);
        cuttingShovel(output);
        cuttingTOOLS_SHEAR(output);
        cuttingKnife(output);
        cuttingStone(output);
        cuttingColorWool(output);
        cuttingColorGlass(output);
        cuttingColorGlassPane(output);
        cuttingColorTerra(output);
        cuttingBoxColor(output);
        cuttingCandleColor(output);
        cuttingColorConcrete(output);
        cuttingMiniStone(output);
        cuttingSlabStone(output);
        cuttingWood(output);
        cuttingStoneButton(output);
        cuttingTools(output);
        cuttingArmor(output);
        cuttingBoat(output);
        cuttingOre(output);
    }

    private static void cuttingPickaxe(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_COBBLESTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE).addResult((ItemLike)Items.VINE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SMOOTH_STONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_STONE_BRICKS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STONE_BRICKS).addResult((ItemLike)Items.VINE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRANITE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIORITE).addResultWithChance(Items.QUARTZ,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIORITE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE).addResultWithChance(Items.QUARTZ,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ANDESITE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE).addResultWithChance(Items.DIORITE,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TINTED_GLASS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.AMETHYST_SHARD, 2).addResultWithChance(Items.GLASS,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SANDSTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.SAND).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COAL_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COAL, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RED_SANDSTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.RED_SAND).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SEA_LANTERN}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE_SHARD, 4).addResult((ItemLike)Items.PRISMARINE_CRYSTALS,5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE_SHARD, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE_BRICKS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE_SHARD, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.POLISHED_BASALT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BASALT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DARK_PRISMARINE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE_SHARD, 8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GILDED_BLACKSTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BLACKSTONE).addResultWithChance(Items.GOLD_NUGGET,0.5F,9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PURPUR_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.POPPED_CHORUS_FRUIT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLD_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REDSTONE_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.REDSTONE, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.EMERALD_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.EMERALD, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LAPIS_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.LAPIS_LAZULI, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIAMOND, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COPPER_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COPPER_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.EXPOSED_COPPER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COPPER_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WEATHERED_COPPER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COPPER_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.OXIDIZED_COPPER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COPPER_INGOT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TERRACOTTA}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CRYING_OBSIDIAN}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.OBSIDIAN).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAW_IRON_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.RAW_IRON, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAW_GOLD_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.RAW_GOLD, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAW_COPPER_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.RAW_COPPER, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TUBE_CORAL_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DEAD_TUBE_CORAL_BLOCK).addResultWithChance(Items.DEAD_TUBE_CORAL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BRAIN_CORAL_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DEAD_BRAIN_CORAL_BLOCK).addResultWithChance(Items.DEAD_BRAIN_CORAL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BUBBLE_CORAL_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DEAD_BUBBLE_CORAL_BLOCK).addResultWithChance(Items.DEAD_BUBBLE_CORAL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HORN_CORAL_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DEAD_HORN_CORAL_BLOCK).addResultWithChance(Items.DEAD_HORN_CORAL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FIRE_CORAL_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DEAD_FIRE_CORAL_BLOCK).addResultWithChance(Items.DEAD_FIRE_CORAL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DRIPSTONE_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.POINTED_DRIPSTONE, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CALCITE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BONE_MEAL, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BONE_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BONE_MEAL, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BLUE_ICE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PACKED_ICE, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PACKED_ICE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.ICE, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MAGMA_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MAGMA_CREAM, 2).addResultWithChance(Items.NETHERRACK,0.75F,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLOWSTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GLOWSTONE_DUST, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLD_INGOT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_NUGGET, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONECUTTER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STONE, 3).addResult((ItemLike)Items.IRON_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SMITHING_TABLE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CRIMSON_PLANKS, 4).addResult((ItemLike)Items.IRON_INGOT,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRINDSTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DARK_OAK_PLANKS, 2).addResult((ItemLike)Items.STICK,2).addResult((ItemLike)Items.STONE_SLAB).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LODESTONE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHISELED_STONE_BRICKS, 8).addResult((ItemLike)Items.NETHERITE_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ANVIL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 4).addResult((ItemLike)Items.IRON_BLOCK).addResultWithChance(Items.IRON_BLOCK,0.75F).addResultWithChance(Items.IRON_BLOCK,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENDER_CHEST}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.OBSIDIAN, 8).addResultWithChance(Items.ENDER_PEARL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BLAST_FURNACE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.FURNACE).addResult((ItemLike)Items.IRON_INGOT,5).addResult((ItemLike)Items.SMOOTH_STONE,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RESPAWN_ANCHOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CRYING_OBSIDIAN, 6).addResult((ItemLike)Items.GLOWSTONE,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BELL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.GOLD_BLOCK).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CAULDRON}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 7).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SMOKER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.FURNACE).addResult((ItemLike)Items.STRIPPED_OAK_LOG,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FURNACE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE, 8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CONDUIT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.HEART_OF_THE_SEA).addResult((ItemLike)Items.NAUTILUS_SHELL,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BREWING_STAND}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE, 3).addResult((ItemLike)Items.BLAZE_ROD).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BEACON}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHER_STAR).addResult((ItemLike)Items.GLASS,5).addResult((ItemLike)Items.OBSIDIAN,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LIGHTNING_ROD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COPPER_INGOT, 3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENCHANTING_TABLE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BOOK).addResult((ItemLike)Items.OBSIDIAN,4).addResult((ItemLike)Items.DIAMOND,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DECORATED_POT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BRICKS, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FLOWER_POT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BRICKS, 3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_INGOT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_NUGGET, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BUCKET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MINECART}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REPEATER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STONE, 3).addResult((ItemLike)Items.REDSTONE_TORCH,2).addResult((ItemLike)Items.REDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HOPPER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHEST).addResult((ItemLike)Items.IRON_INGOT,5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HOPPER_MINECART}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MINECART).addResult((ItemLike)Items.HOPPER).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHEST_MINECART}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MINECART).addResult((ItemLike)Items.CHEST).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FURNACE_MINECART}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MINECART).addResult((ItemLike)Items.FURNACE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TNT_MINECART}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MINECART).addResult((ItemLike)Items.TNT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DISPENSER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE, 7).addResult((ItemLike)Items.REDSTONE).addResult((ItemLike)Items.BOW).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DROPPER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE, 7).addResult((ItemLike)Items.REDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_TRAPDOOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_DOOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_DOOR, 6).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TRIPWIRE_HOOK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.OAK_PLANKS).addResultWithChance(Items.IRON_INGOT,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STICKY_PISTON}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PISTON).addResult((ItemLike)Items.SLIME_BALL).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.OBSERVER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE, 6).addResult((ItemLike)Items.REDSTONE,2).addResult((ItemLike)Items.QUARTZ).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.POWERED_RAIL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT).addResultWithChance(Items.REDSTONE,0.15F).addResultWithChance(Items.STICK,0.15F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ACTIVATOR_RAIL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT).addResultWithChance(Items.STICK,0.35F).addResultWithChance(Items.REDSTONE_TORCH,0.15F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RAIL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResultWithChance(Items.IRON_INGOT,0.2F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COMPARATOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STONE, 3).addResult((ItemLike)Items.REDSTONE_TORCH,3).addResult((ItemLike)Items.QUARTZ).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LEVER}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.COBBLESTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REDSTONE_LAMP}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GLOWSTONE).addResult((ItemLike)Items.REDSTONE,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DAYLIGHT_DETECTOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.SPRUCE_SLAB, 3).addResult((ItemLike)Items.QUARTZ,3).addResult((ItemLike)Items.GLASS,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PISTON}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COBBLESTONE, 4).addResult((ItemLike)Items.OAK_PLANKS,3).addResult((ItemLike)Items.IRON_INGOT).addResult((ItemLike)Items.REDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DETECTOR_RAIL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT).addResultWithChance(Items.STONE_PRESSURE_PLATE,0.15F).addResultWithChance(Items.REDSTONE,0.15F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COMPASS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 4).addResult((ItemLike)Items.REDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CLOCK}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT, 4).addResult((ItemLike)Items.REDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SPYGLASS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COPPER_INGOT, 2).addResult((ItemLike)Items.AMETHYST_SHARD).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FLINT_AND_STEEL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT).addResult((ItemLike)Items.FLINT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SHEARS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FIRE_CHARGE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COAL).addResultWithChance(Items.BLAZE_POWDER,0.33F).addResultWithChance(Items.GUNPOWDER,0.33F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TURTLE_HELMET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.TURTLE_SCUTE, 5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TRIDENT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResultWithChance(Items.PRISMARINE_SHARD,0.5F,3).addResultWithChance(Items.HEART_OF_THE_SEA,0.1F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLISTERING_MELON_SLICE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MELON_SLICE).addResult((ItemLike)Items.GOLD_NUGGET).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LANTERN}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.TORCH).addResult((ItemLike)Items.IRON_NUGGET,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SOUL_LANTERN}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.SOUL_TORCH).addResult((ItemLike)Items.IRON_NUGGET,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLASS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DRAGON_BREATH}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GLASS_BOTTLE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_CARROT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CARROT).addResult((ItemLike)Items.GOLD_NUGGET,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE_SHARD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE_CRYSTALS, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MUSIC_DISC_5}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DISC_FRAGMENT_5, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RECOVERY_COMPASS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.COMPASS).addResult((ItemLike)Items.ECHO_SHARD,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_BARS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_NUGGET, 5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHAIN}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT).addResult((ItemLike)Items.IRON_NUGGET,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.END_ROD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.BLAZE_POWDER).addResultWithChance(Items.POPPED_CHORUS_FRUIT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PURPUR_PILLAR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PURPUR_SLAB, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LIGHT_WEIGHTED_PRESSURE_PLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HEAVY_WEIGHTED_PRESSURE_PLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.QUARTZ_BRICKS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.QUARTZ_BLOCK).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.QUARTZ_PILLAR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.QUARTZ_BLOCK).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CRIMSON_NYLIUM}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERRACK).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_NYLIUM}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERRACK).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SHULKER_BOX}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHEST).addResult((ItemLike)Items.SHULKER_SHELL,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLASS_BOTTLE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_INGOT}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_SCRAP,4).addResultWithChance(Items.GOLD_INGOT,0.9F,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_APPLE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.APPLE).addResult((ItemLike)Items.GOLD_INGOT,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENCHANTED_GOLDEN_APPLE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.APPLE).addResult((ItemLike)Items.GOLD_BLOCK,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CALIBRATED_SCULK_SENSOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.SCULK_SENSOR).addResult((ItemLike)Items.AMETHYST_SHARD,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHER_GOLD_ORE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_NUGGET,2).addResultWithChance(Items.GOLD_NUGGET,0.75F,4).addResultWithChance(Items.GOLD_INGOT,0.5F,2).addResultWithChance(Items.NETHERRACK,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHER_QUARTZ_ORE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.QUARTZ).addResultWithChance(Items.QUARTZ,0.75F).addResultWithChance(Items.QUARTZ,0.5F).addResultWithChance(Items.NETHERRACK,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_COBBLESTONE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MOSSY_COBBLESTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_COBBLESTONE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MOSSY_COBBLESTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_STONE_BRICK_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MOSSY_STONE_BRICKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSSY_STONE_BRICK_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.MOSSY_STONE_BRICKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRANITE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRANITE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRANITE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRANITE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIORITE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIORITE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIORITE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIORITE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ANDESITE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.ANDESITE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ANDESITE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.ANDESITE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RED_SANDSTONE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.RED_SANDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RED_SANDSTONE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.RED_SANDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SANDSTONE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.SANDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SANDSTONE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.SANDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PRISMARINE_WALL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PRISMARINE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DARK_PRISMARINE_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DARK_PRISMARINE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PURPUR_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.PURPUR_BLOCK).build(output);
    }

    private static void cuttingAxe(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_MOSAIC}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_SLAB, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STRIPPED_BAMBOO_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_PLANKS, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SHIELD}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 6).addResult((ItemLike)Items.IRON_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOW}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 3).addResult((ItemLike)Items.STRING,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CROSSBOW}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 3).addResult((ItemLike)Items.STRING,2).addResult((ItemLike)Items.IRON_INGOT).addResultWithChance(Items.TRIPWIRE_HOOK,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOWL}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BROWN_MUSHROOM_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BROWN_MUSHROOM).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.RED_MUSHROOM_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.RED_MUSHROOM).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOOKSHELF}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 6).addResult((ItemLike)Items.BOOK,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LECTERN}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_SLAB, 4).addResult((ItemLike)Items.BOOKSHELF).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BARREL}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.SPRUCE_PLANKS, 6).addResult((ItemLike)Items.SPRUCE_SLAB,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHEST}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PAINTING}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 8).addResult((ItemLike)Items.WHITE_WOOL).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CAMPFIRE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 3).addResult((ItemLike)Items.CHARCOAL).addResultWithChance(Items.CHARCOAL,0.5F,2).addResultWithChance(Items.CHARCOAL,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NOTE_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 8).addResult((ItemLike)Items.REDSTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.JUKEBOX}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 8).addResultWithChance(Items.DIAMOND,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CARTOGRAPHY_TABLE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.DARK_OAK_PLANKS, 4).addResult((ItemLike)Items.PAPER,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FLETCHING_TABLE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BIRCH_PLANKS, 4).addResult((ItemLike)Items.FLINT,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LADDER}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ARMOR_STAND}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 7).addResult((ItemLike)Items.SMOOTH_STONE_SLAB).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LOOM}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 2).addResult((ItemLike)Items.STRING,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHISELED_BOOKSHELF}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 6).addResult((ItemLike)Items.OAK_SLAB,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BEEHIVE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS, 6).addResultWithChance(Items.HONEYCOMB,0.75F,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SCAFFOLDING}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO).addResultWithChance(Items.STRING,0.12F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COMPOSTER}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.ACACIA_SLAB, 7).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ITEM_FRAME}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK, 8).addResult((ItemLike)Items.LEATHER).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TARGET}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.HAY_BLOCK).addResult((ItemLike)Items.REDSTONE,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.REDSTONE_TORCH}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResultWithChance(Items.REDSTONE,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TORCH}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResultWithChance(Items.COAL,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SOUL_TORCH}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResultWithChance(Items.COAL,0.25F).addResultWithChance(Items.SOUL_SAND,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ARROW}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResultWithChance(Items.FLINT,0.25F).addResultWithChance(Items.FEATHER,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SPECTRAL_ARROW}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.GLOWSTONE_DUST, 2).addResultWithChance(Items.ARROW,0.95F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_STAIRS}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_PLANKS}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_SLAB,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_FENCE_GATE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_FENCE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_BUTTON}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BAMBOO_PRESSURE_PLATE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.BAMBOO_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SOUL_CAMPFIRE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.SOUL_SAND).addResult((ItemLike)Items.STICK,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TRAPPED_CHEST}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.CHEST).addResult((ItemLike)Items.TRIPWIRE_HOOK).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CRAFTING_TABLE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.OAK_PLANKS,4).build(output);
    }

    private static void cuttingShovel(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PACKED_MUD}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.MUD).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COARSE_DIRT}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.DIRT).addResultWithChance(Items.GRAVEL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MOSS_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.MOSS_CARPET).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SNOW_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.SNOWBALL, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GRASS_BLOCK}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.DIRT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PODZOL}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.DIRT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MYCELIUM}), (new ItemAbilityIngredient(ItemAbilities.SHOVEL_DIG)).toVanilla(), Items.DIRT).build(output);
    }

    private static void cuttingTOOLS_SHEAR(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PUMPKIN}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.CARVED_PUMPKIN).addResultWithChance(Items.PUMPKIN_SEEDS,0.5F,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.COBWEB}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).addResultWithChance(Items.STRING,0.75F).build(output);

    }

    private static void cuttingKnife(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SUNFLOWER}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.YELLOW_DYE, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LILY_PAD}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.GREEN_DYE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SEA_PICKLE}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.LIME_DYE, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SLIME_BLOCK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.SLIME_BALL, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SPORE_BLOSSOM}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.MAGENTA_DYE, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.PINK_PETALS}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PINK_DYE, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CRIMSON_FUNGUS}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.RED_DYE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_FUNGUS}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.CYAN_DYE).addResultWithChance(Items.MAGENTA_DYE,0.1F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHORUS_FLOWER}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PURPLE_DYE, 2).addResult((ItemLike)Items.WHITE_DYE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHORUS_PLANT}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PURPLE_DYE, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HONEY_BLOCK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.HONEY_BOTTLE, 3).addResultWithChance(Items.HONEY_BOTTLE,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CACTUS}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.GREEN_DYE, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HONEYCOMB}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.HONEYCOMB, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HAY_BLOCK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.WHEAT, 9).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_WART_BLOCK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.WARPED_FUNGUS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHER_WART_BLOCK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.CRIMSON_FUNGUS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.END_CRYSTAL}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.GLASS, 7).addResult((ItemLike)Items.ENDER_EYE).addResult((ItemLike)Items.GHAST_TEAR).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENDER_EYE}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.ENDER_PEARL).addResult((ItemLike)Items.BLAZE_POWDER).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WRITABLE_BOOK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.BOOK).addResult((ItemLike)Items.INK_SAC).addResult((ItemLike)Items.FEATHER).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ELYTRA}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PHANTOM_MEMBRANE, 7).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FISHING_ROD}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.STICK, 3).addResult((ItemLike)Items.STRING,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CARROT_ON_A_STICK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.FISHING_ROD).addResultWithChance(Items.CARROT,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WARPED_FUNGUS_ON_A_STICK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.FISHING_ROD).addResultWithChance(Items.WARPED_FUNGUS,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FIREWORK_ROCKET}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PAPER).addResult((ItemLike)Items.GUNPOWDER).addResultWithChance(Items.GUNPOWDER,0.75F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.MAP}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PAPER, 8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TNT}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.SAND, 4).addResult((ItemLike)Items.GUNPOWDER,5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BRUSH}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.STICK).addResult((ItemLike)Items.FEATHER).addResult((ItemLike)Items.COPPER_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LEAD}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.STRING, 2).addResultWithChance(Items.SLIME_BALL,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BLAZE_ROD}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.BLAZE_POWDER, 3).addResultWithChance(Items.BLAZE_POWDER,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BONE}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.BONE_MEAL, 3).addResultWithChance(Items.BONE_MEAL,0.5F,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.FERMENTED_SPIDER_EYE}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.SPIDER_EYE).addResult((ItemLike)Items.BROWN_MUSHROOM).addResult((ItemLike)Items.SUGAR).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.SUGAR_CANE}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.SUGAR, 2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.BOOK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PAPER, 3).addResult((ItemLike)Items.LEATHER).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.ENCHANTED_BOOK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.PAPER, 3).addResult((ItemLike)Items.LEATHER).addResultWithChance(Items.EXPERIENCE_BOTTLE,0.5F,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.LEATHER}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.RABBIT_HIDE, 4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.TIPPED_ARROW}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.ARROW).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.HONEYCOMB_BLOCK}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.HONEYCOMB,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GLOW_INK_SAC}), Ingredient.of(CommonTags.TOOLS_KNIFE), Items.BLACK_DYE,2).addResultWithChance(Items.GLOWSTONE_DUST,0.1F).build(output);
    }

    private static void cuttingTools(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WOODEN_SWORD}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.OAK_PLANKS,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WOODEN_PICKAXE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.OAK_PLANKS,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WOODEN_AXE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.OAK_PLANKS,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WOODEN_SHOVEL}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.OAK_PLANKS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.WOODEN_HOE}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.OAK_PLANKS,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONE_SWORD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.COBBLESTONE,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONE_PICKAXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.COBBLESTONE,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONE_AXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.COBBLESTONE,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONE_SHOVEL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.COBBLESTONE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.STONE_HOE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.COBBLESTONE,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_SWORD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.GOLD_INGOT,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_PICKAXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.GOLD_INGOT,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_AXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.GOLD_INGOT,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_SHOVEL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.GOLD_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_HOE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.GOLD_INGOT,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_SWORD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.IRON_INGOT,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_PICKAXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.IRON_INGOT,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_AXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.IRON_INGOT,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_SHOVEL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.IRON_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_HOE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.IRON_INGOT,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_SWORD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.DIAMOND,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_PICKAXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.DIAMOND,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_AXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.DIAMOND,3).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_SHOVEL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.DIAMOND).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_HOE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.STICK).addResult((ItemLike)Items.DIAMOND,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_SWORD}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_PICKAXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_AXE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_SHOVEL}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_HOE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).build(output);
    }
    private static void cuttingArmor(RecipeOutput output) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHAINMAIL_HELMET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHAIN,2).addResultWithChance(Items.CHAIN,0.75F).addResultWithChance(Items.CHAIN,0.5F).addResultWithChance(Items.CHAIN,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHAINMAIL_CHESTPLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHAIN,5).addResultWithChance(Items.CHAIN,0.75F).addResultWithChance(Items.CHAIN,0.5F).addResultWithChance(Items.CHAIN,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHAINMAIL_LEGGINGS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHAIN,4).addResultWithChance(Items.CHAIN,0.75F).addResultWithChance(Items.CHAIN,0.5F).addResultWithChance(Items.CHAIN,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.CHAINMAIL_BOOTS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CHAIN).addResultWithChance(Items.CHAIN,0.75F).addResultWithChance(Items.CHAIN,0.5F).addResultWithChance(Items.CHAIN,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_HELMET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT,2).addResultWithChance(Items.GOLD_INGOT,0.75F).addResultWithChance(Items.GOLD_INGOT,0.5F).addResultWithChance(Items.GOLD_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_CHESTPLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT,5).addResultWithChance(Items.GOLD_INGOT,0.75F).addResultWithChance(Items.GOLD_INGOT,0.5F).addResultWithChance(Items.GOLD_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_LEGGINGS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT,4).addResultWithChance(Items.GOLD_INGOT,0.75F).addResultWithChance(Items.GOLD_INGOT,0.5F).addResultWithChance(Items.GOLD_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_BOOTS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT).addResultWithChance(Items.GOLD_INGOT,0.75F).addResultWithChance(Items.GOLD_INGOT,0.5F).addResultWithChance(Items.GOLD_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_HELMET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT,2).addResultWithChance(Items.IRON_INGOT,0.75F).addResultWithChance(Items.IRON_INGOT,0.5F).addResultWithChance(Items.IRON_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_CHESTPLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT,5).addResultWithChance(Items.IRON_INGOT,0.75F).addResultWithChance(Items.IRON_INGOT,0.5F).addResultWithChance(Items.IRON_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_LEGGINGS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT,4).addResultWithChance(Items.IRON_INGOT,0.75F).addResultWithChance(Items.IRON_INGOT,0.5F).addResultWithChance(Items.IRON_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_BOOTS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT).addResultWithChance(Items.IRON_INGOT,0.75F).addResultWithChance(Items.IRON_INGOT,0.5F).addResultWithChance(Items.IRON_INGOT,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_HELMET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIAMOND,2).addResultWithChance(Items.DIAMOND,0.75F).addResultWithChance(Items.DIAMOND,0.5F).addResultWithChance(Items.DIAMOND,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_CHESTPLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIAMOND,5).addResultWithChance(Items.DIAMOND,0.75F).addResultWithChance(Items.DIAMOND,0.5F).addResultWithChance(Items.DIAMOND,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_LEGGINGS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIAMOND,4).addResultWithChance(Items.DIAMOND,0.75F).addResultWithChance(Items.DIAMOND,0.5F).addResultWithChance(Items.DIAMOND,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_BOOTS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIAMOND).addResultWithChance(Items.DIAMOND,0.75F).addResultWithChance(Items.DIAMOND,0.5F).addResultWithChance(Items.DIAMOND,0.25F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_HELMET}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).addResultWithChance(Items.DIAMOND,0.75F,5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_CHESTPLATE}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).addResultWithChance(Items.DIAMOND,0.75F,8).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_LEGGINGS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).addResultWithChance(Items.DIAMOND,0.75F,7).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.NETHERITE_BOOTS}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.NETHERITE_INGOT).addResultWithChance(Items.DIAMOND,0.75F,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.IRON_HORSE_ARMOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.IRON_INGOT,2).addResultWithChance(Items.LEATHER,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.GOLDEN_HORSE_ARMOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GOLD_INGOT,2).addResultWithChance(Items.LEATHER,0.5F).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{Items.DIAMOND_HORSE_ARMOR}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.DIAMOND,2).addResultWithChance(Items.LEATHER,0.5F).build(output);
    }

    private static void cuttingStone(RecipeOutput output) {
        cuttingFromStone(output, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_STAIRS, Items.POLISHED_BLACKSTONE_SLAB, Items.POLISHED_BLACKSTONE_WALL);
        cuttingFromStone(output, Items.END_STONE_BRICKS, Items.END_STONE_BRICK_STAIRS, Items.END_STONE_BRICK_SLAB, Items.END_STONE_BRICK_WALL);
        cuttingFromStone(output, Items.POLISHED_DEEPSLATE, Items.POLISHED_DEEPSLATE_STAIRS, Items.POLISHED_DEEPSLATE_SLAB, Items.POLISHED_DEEPSLATE_WALL);
        cuttingFromStone(output, Items.MUD_BRICKS, Items.MUD_BRICK_STAIRS, Items.MUD_BRICK_SLAB, Items.MUD_BRICK_WALL);
        cuttingFromStone(output, Items.NETHER_BRICKS, Items.NETHER_BRICK_STAIRS, Items.NETHER_BRICK_SLAB, Items.NETHER_BRICK_WALL);
        cuttingFromStone(output, Items.RED_NETHER_BRICKS, Items.RED_NETHER_BRICK_STAIRS, Items.RED_NETHER_BRICK_SLAB, Items.RED_NETHER_BRICK_WALL);
        cuttingFromStone(output, Items.BLACKSTONE, Items.BLACKSTONE_STAIRS, Items.BLACKSTONE_SLAB, Items.BLACKSTONE_WALL);
        cuttingFromStone(output, Items.POLISHED_BLACKSTONE_BRICKS, Items.POLISHED_BLACKSTONE_BRICK_STAIRS, Items.POLISHED_BLACKSTONE_BRICK_SLAB, Items.POLISHED_BLACKSTONE_BRICK_WALL);
        cuttingFromStone(output, Items.COBBLESTONE, Items.COBBLESTONE_STAIRS, Items.COBBLESTONE_SLAB, Items.COBBLESTONE_WALL);
        cuttingFromStone(output, Items.STONE_BRICKS, Items.STONE_BRICK_STAIRS, Items.STONE_BRICK_SLAB, Items.STONE_BRICK_WALL);
        cuttingFromStone(output, Items.DEEPSLATE_BRICKS, Items.DEEPSLATE_BRICK_STAIRS, Items.DEEPSLATE_BRICK_SLAB, Items.DEEPSLATE_BRICK_WALL);
        cuttingFromStone(output, Items.COBBLED_DEEPSLATE, Items.COBBLED_DEEPSLATE_STAIRS, Items.COBBLED_DEEPSLATE_SLAB, Items.COBBLED_DEEPSLATE_WALL);
        cuttingFromStone(output, Items.DEEPSLATE_TILES, Items.DEEPSLATE_TILE_STAIRS, Items.DEEPSLATE_TILE_SLAB, Items.DEEPSLATE_TILE_WALL);
        cuttingFromStone(output, Items.BRICKS, Items.BRICK_STAIRS, Items.BRICK_SLAB, Items.BRICK_WALL);
    }

    private static void cuttingFromStone(RecipeOutput output,ItemLike stone,ItemLike stairs,ItemLike slab,ItemLike wall) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stairs}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), stone).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stone}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), slab,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{wall}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), stone).build(output);
    }

    private static void cuttingMiniStone(RecipeOutput output) {
        cuttingFromMiniStone(output, Items.STONE, Items.STONE_STAIRS, Items.STONE_SLAB);
        cuttingFromMiniStone(output, Items.QUARTZ_BLOCK, Items.QUARTZ_STAIRS, Items.QUARTZ_SLAB);
        cuttingFromMiniStone(output, Items.SMOOTH_RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE_STAIRS, Items.SMOOTH_RED_SANDSTONE_SLAB);
        cuttingFromMiniStone(output, Items.SMOOTH_QUARTZ, Items.SMOOTH_QUARTZ_STAIRS, Items.SMOOTH_QUARTZ_SLAB);
        cuttingFromMiniStone(output, Items.POLISHED_GRANITE, Items.POLISHED_GRANITE_STAIRS, Items.POLISHED_GRANITE_SLAB);
        cuttingFromMiniStone(output, Items.POLISHED_DIORITE, Items.POLISHED_DIORITE_STAIRS, Items.POLISHED_DIORITE_SLAB);
        cuttingFromMiniStone(output, Items.POLISHED_ANDESITE, Items.POLISHED_ANDESITE_STAIRS, Items.POLISHED_ANDESITE_SLAB);
        cuttingFromMiniStone(output, Items.SMOOTH_SANDSTONE, Items.SMOOTH_SANDSTONE_STAIRS, Items.SMOOTH_SANDSTONE_SLAB);
        cuttingFromMiniStone(output, Items.CUT_COPPER, Items.CUT_COPPER_STAIRS, Items.CUT_COPPER_SLAB);
        cuttingFromMiniStone(output, Items.EXPOSED_CUT_COPPER, Items.EXPOSED_CUT_COPPER_STAIRS, Items.EXPOSED_CUT_COPPER_SLAB);
        cuttingFromMiniStone(output, Items.WEATHERED_CUT_COPPER, Items.WEATHERED_CUT_COPPER_STAIRS, Items.WEATHERED_CUT_COPPER_SLAB);
        cuttingFromMiniStone(output, Items.OXIDIZED_CUT_COPPER, Items.OXIDIZED_CUT_COPPER_STAIRS, Items.OXIDIZED_CUT_COPPER_SLAB);
    }

    private static void cuttingFromMiniStone(RecipeOutput output,ItemLike stone,ItemLike stairs,ItemLike slab) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stairs}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), stone).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stone}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), slab,2).build(output);
    }

    private static void cuttingSlabStone(RecipeOutput output) {
        cuttingFromSlabStone(output, Items.CUT_RED_SANDSTONE, Items.CUT_RED_SANDSTONE_SLAB);
        cuttingFromSlabStone(output, Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_SLAB);
        cuttingFromSlabStone(output, Items.CHISELED_STONE_BRICKS, Items.STONE_BRICK_SLAB);
    }

    private static void cuttingFromSlabStone(RecipeOutput output,ItemLike stone,ItemLike slab) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stone}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), slab,2).build(output);
    }

    private static void cuttingWood(RecipeOutput output) {
        cuttingFromWood(output, Items.OAK_PLANKS, Items.OAK_STAIRS, Items.OAK_SLAB, Items.OAK_FENCE_GATE, Items.OAK_FENCE, Items.OAK_BUTTON, Items.OAK_PRESSURE_PLATE, Items.STRIPPED_OAK_LOG, Items.STRIPPED_OAK_WOOD);
        cuttingFromWood(output, Items.SPRUCE_PLANKS, Items.SPRUCE_STAIRS, Items.SPRUCE_SLAB, Items.SPRUCE_FENCE_GATE, Items.SPRUCE_FENCE, Items.SPRUCE_BUTTON, Items.SPRUCE_PRESSURE_PLATE, Items.STRIPPED_SPRUCE_LOG, Items.STRIPPED_SPRUCE_WOOD);
        cuttingFromWood(output, Items.BIRCH_PLANKS, Items.BIRCH_STAIRS, Items.BIRCH_SLAB, Items.BIRCH_FENCE_GATE, Items.BIRCH_FENCE, Items.BIRCH_BUTTON, Items.BIRCH_PRESSURE_PLATE, Items.STRIPPED_BIRCH_LOG, Items.STRIPPED_BIRCH_WOOD);
        cuttingFromWood(output, Items.CHERRY_PLANKS, Items.CHERRY_STAIRS, Items.CHERRY_SLAB, Items.CHERRY_FENCE_GATE, Items.CHERRY_FENCE, Items.CHERRY_BUTTON, Items.CHERRY_PRESSURE_PLATE, Items.STRIPPED_CHERRY_LOG, Items.STRIPPED_CHERRY_WOOD);
        cuttingFromWood(output, Items.ACACIA_PLANKS, Items.ACACIA_STAIRS, Items.ACACIA_SLAB, Items.ACACIA_FENCE_GATE, Items.ACACIA_FENCE, Items.ACACIA_BUTTON, Items.ACACIA_PRESSURE_PLATE, Items.STRIPPED_ACACIA_LOG, Items.STRIPPED_ACACIA_WOOD);
        cuttingFromWood(output, Items.DARK_OAK_PLANKS, Items.DARK_OAK_STAIRS, Items.DARK_OAK_SLAB, Items.DARK_OAK_FENCE_GATE, Items.DARK_OAK_FENCE, Items.DARK_OAK_BUTTON, Items.DARK_OAK_PRESSURE_PLATE, Items.STRIPPED_DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_WOOD);
        cuttingFromWood(output, Items.JUNGLE_PLANKS, Items.JUNGLE_STAIRS, Items.JUNGLE_SLAB, Items.JUNGLE_FENCE_GATE, Items.JUNGLE_FENCE, Items.JUNGLE_BUTTON, Items.JUNGLE_PRESSURE_PLATE, Items.STRIPPED_JUNGLE_LOG, Items.STRIPPED_JUNGLE_WOOD);
        cuttingFromWood(output, Items.MANGROVE_PLANKS, Items.MANGROVE_STAIRS, Items.MANGROVE_SLAB, Items.MANGROVE_FENCE_GATE, Items.MANGROVE_FENCE, Items.MANGROVE_BUTTON, Items.MANGROVE_PRESSURE_PLATE, Items.STRIPPED_MANGROVE_LOG, Items.STRIPPED_MANGROVE_WOOD);
        cuttingFromWood(output, Items.WARPED_PLANKS, Items.WARPED_STAIRS, Items.WARPED_SLAB, Items.WARPED_FENCE_GATE, Items.WARPED_FENCE, Items.WARPED_BUTTON, Items.WARPED_PRESSURE_PLATE, Items.STRIPPED_WARPED_STEM, Items.STRIPPED_WARPED_HYPHAE);
        cuttingFromWood(output, Items.CRIMSON_PLANKS, Items.CRIMSON_STAIRS, Items.CRIMSON_SLAB, Items.CRIMSON_FENCE_GATE, Items.CRIMSON_FENCE, Items.CRIMSON_BUTTON, Items.CRIMSON_PRESSURE_PLATE, Items.STRIPPED_CRIMSON_STEM, Items.STRIPPED_CRIMSON_HYPHAE);
    }

    private static void cuttingFromWood(RecipeOutput output,ItemLike planks,ItemLike stairs,ItemLike slab,ItemLike fence_gate,ItemLike fence,ItemLike button,ItemLike pressure_plate,ItemLike stripped_log,ItemLike stripped_wood) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stairs}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{planks}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), slab,2).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{fence_gate}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{fence}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{button}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pressure_plate}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stripped_log}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks,4).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{stripped_wood}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks,4).build(output);
    }

    private static void cuttingStoneButton(RecipeOutput output) {
        cuttingFromStoneButton(output, Items.STONE, Items.STONE_BUTTON, Items.STONE_PRESSURE_PLATE);
        cuttingFromStoneButton(output, Items.POLISHED_BLACKSTONE, Items.POLISHED_BLACKSTONE_BUTTON, Items.POLISHED_BLACKSTONE_PRESSURE_PLATE);
    }

    private static void cuttingFromStoneButton(RecipeOutput output,ItemLike stone,ItemLike button,ItemLike pressure_plate) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{button}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), stone).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pressure_plate}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), stone).build(output);
    }

    private static void cuttingColorWool(RecipeOutput output) {
        cuttingFromColorWool(output, Items.WHITE_WOOL, Items.LIGHT_GRAY_WOOL, Items.GRAY_WOOL, Items.BLACK_WOOL, Items.BROWN_WOOL, Items.RED_WOOL, Items.ORANGE_WOOL, Items.YELLOW_WOOL, Items.LIME_WOOL, Items.GREEN_WOOL, Items.CYAN_WOOL, Items.LIGHT_BLUE_WOOL, Items.BLUE_WOOL, Items.PURPLE_WOOL, Items.MAGENTA_WOOL, Items.PINK_WOOL);
        cuttingFromColorWool(output, Items.WHITE_BED, Items.LIGHT_GRAY_BED, Items.GRAY_BED, Items.BLACK_BED, Items.BROWN_BED, Items.RED_BED, Items.ORANGE_BED, Items.YELLOW_BED, Items.LIME_BED, Items.GREEN_BED, Items.CYAN_BED, Items.LIGHT_BLUE_BED, Items.BLUE_BED, Items.PURPLE_BED, Items.MAGENTA_BED, Items.PINK_BED);
        cuttingFromColorWool(output, Items.WHITE_CARPET, Items.LIGHT_GRAY_CARPET, Items.GRAY_CARPET, Items.BLACK_CARPET, Items.BROWN_CARPET, Items.RED_CARPET, Items.ORANGE_CARPET, Items.YELLOW_CARPET, Items.LIME_CARPET, Items.GREEN_CARPET, Items.CYAN_CARPET, Items.LIGHT_BLUE_CARPET, Items.BLUE_CARPET, Items.PURPLE_CARPET, Items.MAGENTA_CARPET, Items.PINK_CARPET);
        cuttingFromColorWool(output, Items.WHITE_BANNER, Items.LIGHT_GRAY_BANNER, Items.GRAY_BANNER, Items.BLACK_BANNER, Items.BROWN_BANNER, Items.RED_BANNER, Items.ORANGE_BANNER, Items.YELLOW_BANNER, Items.LIME_BANNER, Items.GREEN_BANNER, Items.CYAN_BANNER, Items.LIGHT_BLUE_BANNER, Items.BLUE_BANNER, Items.PURPLE_BANNER, Items.MAGENTA_BANNER, Items.PINK_BANNER);
    }

    private static void cuttingFromColorWool(RecipeOutput output,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.STRING).build(output);
    }

    private static void cuttingColorConcrete(RecipeOutput output) {
        cuttingFromColorConcrete(output, Items.WHITE_CONCRETE, Items.LIGHT_GRAY_CONCRETE, Items.GRAY_CONCRETE, Items.BLACK_CONCRETE, Items.BROWN_CONCRETE, Items.RED_CONCRETE, Items.ORANGE_CONCRETE, Items.YELLOW_CONCRETE, Items.LIME_CONCRETE, Items.GREEN_CONCRETE, Items.CYAN_CONCRETE, Items.LIGHT_BLUE_CONCRETE, Items.BLUE_CONCRETE, Items.PURPLE_CONCRETE, Items.MAGENTA_CONCRETE, Items.PINK_CONCRETE);
        cuttingFromColorConcrete(output, Items.WHITE_CONCRETE_POWDER, Items.LIGHT_GRAY_CONCRETE_POWDER, Items.GRAY_CONCRETE_POWDER, Items.BLACK_CONCRETE_POWDER, Items.BROWN_CONCRETE_POWDER, Items.RED_CONCRETE_POWDER, Items.ORANGE_CONCRETE_POWDER, Items.YELLOW_CONCRETE_POWDER, Items.LIME_CONCRETE_POWDER, Items.GREEN_CONCRETE_POWDER, Items.CYAN_CONCRETE_POWDER, Items.LIGHT_BLUE_CONCRETE_POWDER, Items.BLUE_CONCRETE_POWDER, Items.PURPLE_CONCRETE_POWDER, Items.MAGENTA_CONCRETE_POWDER, Items.PINK_CONCRETE_POWDER);
    }

    private static void cuttingFromColorConcrete(RecipeOutput output,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.GRAVEL).addResultWithChance(Items.SAND, 1.0F, 1).build(output);
    }

    private static void cuttingColorGlassPane(RecipeOutput output) {
        cuttingFromColorGlassPane(output, Items.WHITE_STAINED_GLASS_PANE, Items.LIGHT_GRAY_STAINED_GLASS_PANE, Items.GRAY_STAINED_GLASS_PANE, Items.BLACK_STAINED_GLASS_PANE, Items.BROWN_STAINED_GLASS_PANE, Items.RED_STAINED_GLASS_PANE, Items.ORANGE_STAINED_GLASS_PANE, Items.YELLOW_STAINED_GLASS_PANE, Items.LIME_STAINED_GLASS_PANE, Items.GREEN_STAINED_GLASS_PANE, Items.CYAN_STAINED_GLASS_PANE, Items.LIGHT_BLUE_STAINED_GLASS_PANE, Items.BLUE_STAINED_GLASS_PANE, Items.PURPLE_STAINED_GLASS_PANE, Items.MAGENTA_STAINED_GLASS_PANE, Items.PINK_STAINED_GLASS_PANE);
    }

    private static void cuttingFromColorGlassPane(RecipeOutput output,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS_PANE).build(output);
    }

    private static void cuttingColorGlass(RecipeOutput output) {
        cuttingFromColorGlass(output, Items.WHITE_STAINED_GLASS, Items.LIGHT_GRAY_STAINED_GLASS, Items.GRAY_STAINED_GLASS, Items.BLACK_STAINED_GLASS, Items.BROWN_STAINED_GLASS, Items.RED_STAINED_GLASS, Items.ORANGE_STAINED_GLASS, Items.YELLOW_STAINED_GLASS, Items.LIME_STAINED_GLASS, Items.GREEN_STAINED_GLASS, Items.CYAN_STAINED_GLASS, Items.LIGHT_BLUE_STAINED_GLASS, Items.BLUE_STAINED_GLASS, Items.PURPLE_STAINED_GLASS, Items.MAGENTA_STAINED_GLASS, Items.PINK_STAINED_GLASS);
    }

    private static void cuttingFromColorGlass(RecipeOutput output,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), Ingredient.of(Tags.Items.TOOLS_SHEAR), Items.GLASS).build(output);
    }

    private static void cuttingColorTerra(RecipeOutput output) {
        cuttingFromColorTerra(output, Items.WHITE_GLAZED_TERRACOTTA, Items.LIGHT_GRAY_GLAZED_TERRACOTTA, Items.GRAY_GLAZED_TERRACOTTA, Items.BLACK_GLAZED_TERRACOTTA, Items.BROWN_GLAZED_TERRACOTTA, Items.RED_GLAZED_TERRACOTTA, Items.ORANGE_GLAZED_TERRACOTTA, Items.YELLOW_GLAZED_TERRACOTTA, Items.LIME_GLAZED_TERRACOTTA, Items.GREEN_GLAZED_TERRACOTTA, Items.CYAN_GLAZED_TERRACOTTA, Items.LIGHT_BLUE_GLAZED_TERRACOTTA, Items.BLUE_GLAZED_TERRACOTTA, Items.PURPLE_GLAZED_TERRACOTTA, Items.MAGENTA_GLAZED_TERRACOTTA, Items.PINK_GLAZED_TERRACOTTA);
        cuttingFromColorTerra(output, Items.WHITE_TERRACOTTA, Items.LIGHT_GRAY_TERRACOTTA, Items.GRAY_TERRACOTTA, Items.BLACK_TERRACOTTA, Items.BROWN_TERRACOTTA, Items.RED_TERRACOTTA, Items.ORANGE_TERRACOTTA, Items.YELLOW_TERRACOTTA, Items.LIME_TERRACOTTA, Items.GREEN_TERRACOTTA, Items.CYAN_TERRACOTTA, Items.LIGHT_BLUE_TERRACOTTA, Items.BLUE_TERRACOTTA, Items.PURPLE_TERRACOTTA, Items.MAGENTA_TERRACOTTA, Items.PINK_TERRACOTTA);    }

    private static void cuttingFromColorTerra(RecipeOutput output,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), Items.CLAY).build(output);

    }

    private static void cuttingBoxColor(RecipeOutput output) {
        cuttingFromBoxColor(output, Items.CANDLE, Items.WHITE_CANDLE, Items.LIGHT_GRAY_CANDLE, Items.GRAY_CANDLE, Items.BLACK_CANDLE, Items.BROWN_CANDLE, Items.RED_CANDLE, Items.ORANGE_CANDLE, Items.YELLOW_CANDLE, Items.LIME_CANDLE, Items.GREEN_CANDLE, Items.CYAN_CANDLE, Items.LIGHT_BLUE_CANDLE, Items.BLUE_CANDLE, Items.PURPLE_CANDLE, Items.MAGENTA_CANDLE, Items.PINK_CANDLE);
    }

    private static void cuttingFromBoxColor(RecipeOutput output,ItemLike standart,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
    }

    private static void cuttingCandleColor(RecipeOutput output) {
        cuttingFromCandleColor(output, Items.SHULKER_BOX, Items.WHITE_SHULKER_BOX, Items.LIGHT_GRAY_SHULKER_BOX, Items.GRAY_SHULKER_BOX, Items.BLACK_SHULKER_BOX, Items.BROWN_SHULKER_BOX, Items.RED_SHULKER_BOX, Items.ORANGE_SHULKER_BOX, Items.YELLOW_SHULKER_BOX, Items.LIME_SHULKER_BOX, Items.GREEN_SHULKER_BOX, Items.CYAN_SHULKER_BOX, Items.LIGHT_BLUE_SHULKER_BOX, Items.BLUE_SHULKER_BOX, Items.PURPLE_SHULKER_BOX, Items.MAGENTA_SHULKER_BOX, Items.PINK_SHULKER_BOX);
    }

    private static void cuttingFromCandleColor(RecipeOutput output,ItemLike standart,ItemLike white,ItemLike light_gray,ItemLike gray,ItemLike black,ItemLike brown,ItemLike red,ItemLike orange,ItemLike yellow,ItemLike lime,ItemLike green,ItemLike cyan,ItemLike light_blue,ItemLike blue,ItemLike purple,ItemLike magenta,ItemLike pink) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{white}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{gray}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{black}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{brown}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{red}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{orange}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{yellow}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{lime}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{green}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{cyan}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{light_blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{blue}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{purple}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{magenta}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{pink}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), standart).build(output);
    }

    private static void cuttingBoat(RecipeOutput output) {
        cuttingFromBoat(output, Items.OAK_PLANKS, Items.OAK_BOAT, Items.OAK_CHEST_BOAT);
        cuttingFromBoat(output, Items.SPRUCE_PLANKS, Items.SPRUCE_BOAT, Items.SPRUCE_CHEST_BOAT);
        cuttingFromBoat(output, Items.BIRCH_PLANKS, Items.BIRCH_BOAT, Items.BIRCH_CHEST_BOAT);
        cuttingFromBoat(output, Items.JUNGLE_PLANKS, Items.JUNGLE_BOAT, Items.JUNGLE_CHEST_BOAT);
        cuttingFromBoat(output, Items.ACACIA_PLANKS, Items.ACACIA_BOAT, Items.ACACIA_CHEST_BOAT);
        cuttingFromBoat(output, Items.DARK_OAK_PLANKS, Items.DARK_OAK_BOAT, Items.DARK_OAK_CHEST_BOAT);
        cuttingFromBoat(output, Items.MANGROVE_PLANKS, Items.MANGROVE_BOAT, Items.MANGROVE_CHEST_BOAT);
        cuttingFromBoat(output, Items.CHERRY_PLANKS, Items.CHERRY_BOAT, Items.CHERRY_CHEST_BOAT);
        cuttingFromBoat(output, Items.BAMBOO_PLANKS, Items.BAMBOO_RAFT, Items.BAMBOO_CHEST_RAFT);
    }

    private static void cuttingFromBoat(RecipeOutput output,ItemLike planks,ItemLike boat,ItemLike boat_with_chest) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{boat}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks,5).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{boat_with_chest}), (new ItemAbilityIngredient(ItemAbilities.AXE_DIG)).toVanilla(), planks,5).addResult((ItemLike)Items.CHEST).build(output);
    }

    private static void cuttingOre(RecipeOutput output) {
        cuttingFromOre(output, Items.COAL, Items.COAL_ORE, Items.DEEPSLATE_COAL_ORE);
        cuttingFromOre(output, Items.RAW_IRON, Items.IRON_ORE, Items.DEEPSLATE_IRON_ORE);
        cuttingFromOre(output, Items.RAW_COPPER, Items.COPPER_ORE, Items.DEEPSLATE_COPPER_ORE);
        cuttingFromOre(output, Items.RAW_GOLD, Items.GOLD_ORE, Items.DEEPSLATE_GOLD_ORE);
        cuttingFromOre(output, Items.REDSTONE, Items.REDSTONE_ORE, Items.DEEPSLATE_REDSTONE_ORE);
        cuttingFromOre(output, Items.EMERALD, Items.EMERALD_ORE, Items.DEEPSLATE_EMERALD_ORE);
        cuttingFromOre(output, Items.LAPIS_LAZULI, Items.LAPIS_ORE, Items.DEEPSLATE_LAPIS_ORE);
        cuttingFromOre(output, Items.DIAMOND, Items.DIAMOND_ORE, Items.DEEPSLATE_DIAMOND_ORE);
    }

    private static void cuttingFromOre(RecipeOutput output,ItemLike ingredients,ItemLike ore,ItemLike deepslate_ore) {
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{ore}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), ingredients).build(output);
        CuttingBoardRecipeBuilder.cuttingRecipe(Ingredient.of(new ItemLike[]{deepslate_ore}), (new ItemAbilityIngredient(ItemAbilities.PICKAXE_DIG)).toVanilla(), ingredients).build(output);
    }
}
