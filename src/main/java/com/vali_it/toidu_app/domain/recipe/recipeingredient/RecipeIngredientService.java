package com.vali_it.toidu_app.domain.recipe.recipeingredient;


import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientRepository;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnit;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitRepository;
import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeRepository;
import com.vali_it.toidu_app.service.recipe.UserIngredientRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Instant;

@Service
public class RecipeIngredientService {

    @Resource
    private IngredientRepository ingredientRepository;

    @Resource
    private RecipeIngredientMapper recipeIngredientMapper;

    @Resource
    private RecipeRepository recipeRepository;

    @Resource
    private MeasureUnitRepository measureUnitRepository;

    @Resource
    private RecipeIngredientRepository recipeIngredientRepository;


    public void addIngredient(UserIngredientRequest request) {
        RecipeIngredient recipeIngredient =recipeIngredientMapper.recipeIngredientDtoToRecipeIngredient(request);

        Recipe recipe = recipeRepository.getById(request.getRecipeId());
        recipeIngredient.setRecipe(recipe);

        Ingredient ingredient = ingredientRepository.getById(request.getIngredientId());
        recipeIngredient.setIngredient(ingredient);

        MeasureUnit measureUnit = measureUnitRepository.getById(request.getMeasureUnitId());
        recipeIngredient.setMeasureUnit(measureUnit);


        recipeIngredientRepository.save(recipeIngredient);

    }
}
