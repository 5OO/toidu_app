package com.vali_it.toidu_app.service.recipe;

import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeService;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRecipeService {

    @Resource
    private RecipeService recipeService;

    @Resource
    private RecipeIngredientService recipeIngredientService;

    public UserRecipeResponse createRecipe(UserRecipeRequest userRecipeRequest) {
        UserRecipeResponse userRecipeResponse = recipeService.addNewRecipe(userRecipeRequest);
        return userRecipeResponse;
    }

    public void addIngredient(UserIngredientRequest request) {
        recipeIngredientService.addIngredient(request);
    }
}
