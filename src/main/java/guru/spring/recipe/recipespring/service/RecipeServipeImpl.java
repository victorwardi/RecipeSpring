package guru.spring.recipe.recipespring.service;

import guru.spring.recipe.recipespring.model.Recipe;
import guru.spring.recipe.recipespring.repository.RecipeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Victor Wardi - @vwardi - on 24/09/2018.
 */
@Slf4j
@Service
public class RecipeServipeImpl implements RecipeService {

    private final RecipeRepository recipeRepository;

    public RecipeServipeImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        log.debug("I'm a service!");

        Set<Recipe> recipes = new HashSet<>();

        this.recipeRepository.findAll().forEach(recipes::add);

        return recipes;
    }
}
