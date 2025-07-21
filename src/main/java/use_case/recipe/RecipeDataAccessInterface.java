package use_case.recipe;

import java.util.List;

import entity.Recipe;

/**
 * Interface for accessing and modifying Recipe data.
 */
public interface RecipeDataAccessInterface {

    /**
     * Save a recipe into the storage.
     *
     * @param recipe the Recipe object to save
     */
    void save(Recipe recipe);

    /**
     * Retrieve a recipe by its name.
     *
     * @param name the name of the recipe
     * @return the Recipe object with the specified name
     */
    Recipe get(String name);

    /**
     * Retrieve a list of all recipes stored.
     *
     * @return a list of all Recipe objects
     */
    List<Recipe> getAll();

    /**
     * Delete a recipe by its name.
     *
     * @param name the name of the recipe to delete
     */
    void delete(String name);

    /**
     * Check whether a recipe exists by its name.
     *
     * @param name the name to check
     * @return true if the recipe exists, false otherwise
     */
    boolean existsByName(String name);
}
