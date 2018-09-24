package guru.spring.recipe.recipespring.repository;

import guru.spring.recipe.recipespring.model.Category;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Victor Wardi - @vwardi - on 20/09/2018.
 */
public interface CategoryRepository extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String description);

}
