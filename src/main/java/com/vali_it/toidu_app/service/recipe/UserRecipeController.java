package com.vali_it.toidu_app.service.recipe;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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
    public void addIngredient(@RequestBody UserIngredientRequest request){
        userRecipeService.addIngredient(request);

    }
}
