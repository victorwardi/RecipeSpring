package guru.spring.recipe.recipespring.repository;

import guru.spring.recipe.recipespring.model.Category;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Victor Wardi - @vwardi - on 20/09/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {
}
