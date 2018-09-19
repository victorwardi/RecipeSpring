package guru.spring.recipe.recipespring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Victor Wardi - @vwardi - on 04/09/2018.
 */
@Controller
public class IndexController {

    @RequestMapping({"", "/", "/index"})
    public  String getIndexPage(Model model){
         model.addAttribute("appName", "My Recipes APP");

        List<String> recipes = Arrays.asList("Orange Cake", "Chocolate Cookie", "Strawberry Jam", "Baked Potatoes");
        model.addAttribute("recipes", recipes);


        return "index";
    }

}
