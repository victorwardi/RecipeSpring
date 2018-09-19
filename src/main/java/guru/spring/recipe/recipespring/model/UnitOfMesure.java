package guru.spring.recipe.recipespring.model;

import javax.persistence.*;

/**
 * Created by Victor Wardi - @vwardi - on 19/09/2018.
 */
@Entity
public class UnitOfMesure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String uom;

}
