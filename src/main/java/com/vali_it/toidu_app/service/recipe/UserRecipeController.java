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
}
