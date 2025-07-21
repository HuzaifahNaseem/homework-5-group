package data_access;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import entity.Recipe;
import use_case.recipe.RecipeDataAccessInterface;

/**
 * In-memory implementation of RecipeDataAccessInterface.
 * Stores recipes in a HashMap during program execution.
 */
public class InMemoryRecipeDataAccessObject implements RecipeDataAccessInterface {

    private final Map<String, Recipe> recipeMap = new HashMap<>();

    /**
     * Save a recipe by storing it in the map.
     *
     * @param recipe the recipe to be saved
     */
    @Override
    public void save(Recipe recipe) {
        recipeMap.put(recipe.getName(), recipe);
    }

    /**
     * Retrieve a recipe by its name.
     *
     * @param name the name of the recipe
     * @return the corresponding Recipe object, or null if not found
     */
    @Override
    public Recipe get(String name) {
        return recipeMap.get(name);
    }

    /**
     * Get a list of all stored recipes.
     *
     * @return a list of Recipe objects
     */
    @Override
    public List<Recipe> getAll() {
        return new ArrayList<>(recipeMap.values());
    }

    /**
     * Delete a recipe by its name.
     *
     * @param name the name of the recipe to delete
     */
    @Override
    public void delete(String name) {
        recipeMap.remove(name);
    }

    /**
     * Check if a recipe exists by name.
     *
     * @param name the name of the recipe
     * @return true if the recipe exists, false otherwise
     */
    @Override
    public boolean existsByName(String name) {
        return recipeMap.containsKey(name);
    }
}
