package com.vali_it.toidu_app.domain.recipe.recipeingredient;


import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeRepository;
import com.vali_it.toidu_app.service.recipe.UserIngredientRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RecipeIngredientService {

    @Resource
    private RecipeIngredientRepository ingredientRepository;

    @Resource
    private RecipeIngredientMapper recipeIngredientMapper;

    @Resource
    private RecipeRepository recipeRepository;

    public void addIngredient(UserIngredientRequest request) {
        RecipeIngredient recipeIngredient =recipeIngredientMapper.recipeIngredientDtoToRecipeIngredient(request);

        Recipe recipe = recipeRepository.getById(request.getRecipeId());
        recipeIngredient.setRecipe(recipe);

        
    }
}
