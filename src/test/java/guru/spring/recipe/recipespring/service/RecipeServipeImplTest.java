package guru.spring.recipe.recipespring.service;

import guru.spring.recipe.recipespring.model.Recipe;
import guru.spring.recipe.recipespring.repository.RecipeRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created Victor Wardi @vwardi - 23/01/2019
 **/
public class RecipeServipeImplTest {

    RecipeServipeImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;



    @Before
    public void setUp() throws Exception {

        MockitoAnnotations.initMocks(this);

        recipeService = new RecipeServipeImpl(recipeRepository);
    }

    @Test
    public void getRecipes() {
        Recipe r = new Recipe();
        HashSet recipesSet = new HashSet();
        recipesSet.add(r);

        when(recipeService.getRecipes()).thenReturn(recipesSet);

        Set<Recipe> recipes = recipeService.getRecipes();
        assertEquals( recipes.size(), 1);
    }
}