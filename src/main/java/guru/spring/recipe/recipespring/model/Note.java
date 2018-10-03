package guru.spring.recipe.recipespring.model;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Victor Wardi - @vwardi - on 19/09/2018.
 */
@Data
@EqualsAndHashCode(exclude = {"recipe"})
@Entity
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
