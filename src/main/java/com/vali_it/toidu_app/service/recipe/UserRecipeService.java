package com.vali_it.toidu_app.service.recipe;

import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeMapper;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeRepository;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeService;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserRecipeService {

    @Resource
    private RecipeService recipeService;

    @Resource
    private RecipeIngredientService recipeIngredientService;

    @Resource
    private RecipeRepository recipeRepository;

    @Resource
    private RecipeMapper recipeMapper;

    public UserRecipeResponse createRecipe(UserRecipeRequest userRecipeRequest) {
        return recipeService.addNewRecipe(userRecipeRequest);

    }

    public void addIngredient(UserIngredientRequest request) {
        recipeIngredientService.addIngredient(request);
    }

    public List<UserRecipeRequest> findRecipeByName(String name) {
        List<Recipe> recipes = recipeRepository.findByName(name);

        return recipeMapper.toRecipes(recipes);
    }
}
