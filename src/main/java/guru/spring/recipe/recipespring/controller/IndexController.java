package guru.spring.recipe.recipespring.controller;

import guru.spring.recipe.recipespring.service.RecipeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Victor Wardi - @vwardi - on 04/09/2018.
 */
@Slf4j
@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "/index"})
    public String getIndexPage(Model model) {
        log.debug("Loading Controller!");
        model.addAttribute("appName", "My Recipes APP");

        model.addAttribute("recipes", this.recipeService.getRecipes());

        return "index";
    }

}
