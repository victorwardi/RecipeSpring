package guru.spring.recipe.recipespring.service;

import guru.spring.recipe.recipespring.model.Recipe;
import org.springframework.stereotype.Service;

import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 24/09/2018.
 */
public interface RecipeService {

    Set<Recipe> getRecipes();

}

