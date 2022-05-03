package com.vali_it.toidu_app.service.recipe;

import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserRecipeService {

    @Resource
    private RecipeService recipeService;

    public UserRecipeResponse createRecipe(UserRecipeRequest userRecipeRequest) {
        UserRecipeResponse userRecipeResponse = recipeService.addNewRecipe(userRecipeRequest);
        return userRecipeResponse;
    }
}
