package guru.spring.recipe.recipespring.repository;

import guru.spring.recipe.recipespring.model.Recipe;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Victor Wardi - @vwardi - on 20/09/2018.
 */
@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Long> {





}
