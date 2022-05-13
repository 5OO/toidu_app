package com.vali_it.toidu_app.service.recipe;

import com.vali_it.toidu_app.domain.dayplan.planrecipe.PlanRecipeService;
import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeMapper;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeRepository;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeService;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredient;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientMapper;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientService;
import com.vali_it.toidu_app.service.measure.CalculatorService;
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
    private PlanRecipeService planRecipeService;

    @Resource
    private RecipeIngredientMapper recipeIngredientMapper;

    @Resource
    private RecipeRepository recipeRepository;

    @Resource
    private RecipeMapper recipeMapper;
    @Resource
    private CalculatorService calculatorService;

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

    public List<UserRecipeNameInquiry> findRecipeByString(String name) {
        List<Recipe> recipes = recipeRepository.findByName(name);
        return recipeMapper.recipesToDtos(recipes);
    }

    public List<UserRecipeComponentRequest> findRecipeComponents(Integer itemId) {
        Integer recipeId = planRecipeService.findRecipeId(itemId);
        List<RecipeIngredient> recipeIngredientList =  recipeIngredientService.findRecipeComponents(recipeId);
        return recipeIngredientMapper.recipeToDTOs(recipeIngredientList);
    }

    public List<UserRecipeNameInquiry> findAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipeMapper.recipesToDtos(recipes);
    }
}
