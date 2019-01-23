package guru.spring.recipe.recipespring.model;

import org.junit.Before;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class CategoryTest {

    Category category;

    @Before
    public void setUp(){
        category = new Category();

        category.setDescription("Fruits");
    }

    @Test
    public void getId() {

        Long id = 45L;
        category.setId(id);
        assertEquals(id, category.getId());

    }

    @Test
    public void getDescription() {
    }

    @Test
    public void getRecipes() {
    }
}