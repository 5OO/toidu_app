package com.vali_it.toidu_app.service.recipe;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/recipe")
public class UserRecipeController {

    @Resource
    private UserRecipeService userRecipeService;

    @PostMapping
    @Operation(summary = "lisame uue retsepti")
    public UserRecipeResponse createRecipe(@RequestBody UserRecipeRequest userRecipeRequest) {
        return userRecipeService.createRecipe(userRecipeRequest);
    }

    @PostMapping("/ingredient")
    @Operation(summary = "lisame retseptile toidu koostisosad")
    public void addIngredient(@RequestBody UserIngredientRequest request) {
        userRecipeService.addIngredient(request);

    }

    @GetMapping
    @Operation(summary = "leiame retseptid nimeosa (string)  järgi")
    public List<UserRecipeRequest> findRecipeByName(@RequestParam String name) {
        return userRecipeService.findRecipeByName(name);
    }

    @GetMapping("/recipes")
    @Operation(summary = "leiame retseptid string  järgi, vastus koos recipeID-ga")
    public List<UserRecipeNameInquiry> findRecipeByString(@RequestParam String name) {
        List<UserRecipeNameInquiry> recipeByString = userRecipeService.findRecipeByString(name);
        return recipeByString;
    }
    @GetMapping("/id")
    @Operation(summary = "leiame retsepti Id järgi")
    public UserRecipeRequest findRecipeById(@RequestParam Integer recipeId) {
        return userRecipeService.findRecipeById(recipeId);
    }

    @GetMapping("/id-info")
    @Operation(summary = "leiame retsepti Id järgi selle koostisosad")
    public  List<UserRecipeComponentRequest> findRecipeIngredientsById(@RequestParam Integer recipeId) {
        return userRecipeService.findRecipeIngredientsById(recipeId);
    }

    @GetMapping("/info")
    @Operation(summary = "leiame ja kuvame kasutaja päevaplaani retsepti koostiosade sisu (toiduainete/ingredient  loetelu koos energiaga) ")
    public List<UserRecipeComponentRequest> findRecipeComponents(@RequestParam Integer recipeId) {
        return userRecipeService.findRecipeComponents(recipeId);
    }

    @GetMapping("/all")
    @Operation(summary = "leiame kõik süsteemis saadaolevad retseptid")
    public List<UserRecipeNameInquiry> findAllRecipes() {
        return userRecipeService.findAllRecipes();
    }
    @DeleteMapping ("/delete")
    @Operation(summary = "kustutame retseptist ingredienti")
    public void deleteIngredientFromRecipe(@RequestParam  Integer recipeId, @RequestParam Integer ingredientId) {
        userRecipeService.deleteIngredientFromRecipe(recipeId,ingredientId);
    }


}
