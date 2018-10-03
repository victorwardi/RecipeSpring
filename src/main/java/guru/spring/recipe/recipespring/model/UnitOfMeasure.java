package guru.spring.recipe.recipespring.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Victor Wardi - @vwardi - on 19/09/2018.
 */
@Data
@Entity
public class UnitOfMeasure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;

}
