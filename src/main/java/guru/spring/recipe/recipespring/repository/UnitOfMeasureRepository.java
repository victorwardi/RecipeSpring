package guru.spring.recipe.recipespring.repository;

import guru.spring.recipe.recipespring.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * Created by Victor Wardi - @vwardi - on 20/09/2018.
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {

    Optional<UnitOfMeasure> findByDescription(String description);
}
