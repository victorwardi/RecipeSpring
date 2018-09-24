package guru.spring.recipe.recipespring.bootstrap;

import guru.spring.recipe.recipespring.model.Ingredient;
import guru.spring.recipe.recipespring.model.Recipe;
import guru.spring.recipe.recipespring.model.enums.Difficulty;
import guru.spring.recipe.recipespring.repository.CategoryRepository;
import guru.spring.recipe.recipespring.repository.RecipeRepository;
import guru.spring.recipe.recipespring.repository.UnitOfMeasureRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by Victor Wardi - @vwardi - on 20/09/2018.
 */
@Component
public class DataLoader implements ApplicationListener<ContextRefreshedEvent> {


    private final RecipeRepository recipeRepository;
    private final CategoryRepository categoryRepository;
    private final UnitOfMeasureRepository unitOfMeasureRepository;

    public DataLoader(RecipeRepository recipeRepository, CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.recipeRepository = recipeRepository;
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        loadData();
    }


    private void loadData() {

        //How to make a perfect guacamole

        Recipe guacamole = new Recipe();
        guacamole.setDescription("How to Make Perfect Guacamole Recipe");
        guacamole.setCookTime(10);
        guacamole.setPrepTime(40);
        guacamole.setServings(5);
        // guacamole.setImage();
        guacamole.setUrl("/recipe/");
        guacamole.setSource("Simply Recipes");
        guacamole.setDirection("1 Cut avocado, remove flesh: Cut the avocados in half. Remove seed. " +
                "<br>" +
                "Score the inside of the avocado with a blunt knife and scoop out the flesh with a spoon. " +
                "<br>" +
                "(See How to Cut and Peel an Avocado.) Place in a bowl." +
                "<br>" +
                "2 Mash with a fork: Using a fork, roughly mash the avocado. " +
                "<br>" +
                "(Don't overdo it! The guacamole should be a little chunky.)");
        guacamole.setDifficulty(Difficulty.MODERATE);

        ///Ingredients
        Ingredient blackPeper = new Ingredient("Black Peper", new BigDecimal(1.2), unitOfMeasureRepository.findByDescription("Dash").get());
        Ingredient cilantro = new Ingredient("Cilantro", new BigDecimal(2), unitOfMeasureRepository.findByDescription("Ripe").get());
        Ingredient limeJuice = new Ingredient("Fresh lime juice", new BigDecimal(0.5), unitOfMeasureRepository.findByDescription("Tablespoon").get());
        Ingredient salt = new Ingredient("Salt", new BigDecimal(2), unitOfMeasureRepository.findByDescription("Teaspoon").get());
        Ingredient avocados = new Ingredient("Avocados", new BigDecimal(2), unitOfMeasureRepository.findByDescription("Tablespoon").get());

        //Adding ingredients to guacamole
        guacamole.addingIngredient(blackPeper)
                .addingIngredient(cilantro)
                .addingIngredient(blackPeper)
                .addingIngredient(limeJuice)
                .addingIngredient(salt)
                .addingIngredient(avocados);

        //Adding Categories to recipe
        guacamole.getCategories().add(categoryRepository.findByDescription("Spicy").get());
        guacamole.getCategories().add(categoryRepository.findByDescription("Mexican").get());
        guacamole.getCategories().add(categoryRepository.findByDescription("Fast").get());

        recipeRepository.save(guacamole);
    }


}
