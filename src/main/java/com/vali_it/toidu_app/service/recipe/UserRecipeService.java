package com.vali_it.toidu_app.service.recipe;

import com.vali_it.toidu_app.domain.dayplan.planrecipe.PlanRecipeService;
import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeMapper;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeRepository;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeService;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredient;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientMapper;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientRepository;
import com.vali_it.toidu_app.domain.recipe.recipeingredient.RecipeIngredientService;
import com.vali_it.toidu_app.service.measure.CalculatorRequest;
import com.vali_it.toidu_app.service.measure.CalculatorResponse;
import com.vali_it.toidu_app.service.measure.CalculatorService;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
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
    private RecipeIngredientRepository recipeIngredientRepository;

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

    public List<UserRecipeNameInquiry> findAllRecipes() {
        List<Recipe> recipes = recipeRepository.findAll();
        return recipeMapper.recipesToDtos(recipes);
    }

    public List<UserRecipeComponentRequest> findRecipeComponents(Integer itemId) {
        Integer recipeId = planRecipeService.findRecipeId(itemId);
        List<RecipeIngredient> ingredients = recipeIngredientService.findRecipeComponents(recipeId);
        return getIngredientDtos(ingredients);
    }

    private List<UserRecipeComponentRequest> getIngredientDtos(List<RecipeIngredient> ingredients) {
        List<UserRecipeComponentRequest> ingerdientDtos = recipeIngredientMapper.recipeToDTOs(ingredients);
        getAndSetMacros(ingerdientDtos);
        return ingerdientDtos;
    }

    private void getAndSetMacros(List<UserRecipeComponentRequest> ingerdientDtos) {
        for (UserRecipeComponentRequest ingerdient : ingerdientDtos) {
            CalculatorResponse calculatorResponse = getCalculatorResponse(ingerdient);
            setMacros(ingerdient, calculatorResponse);
        }
    }

    private CalculatorResponse getCalculatorResponse(UserRecipeComponentRequest ingerdient) {
        CalculatorResponse calculatorResponse = calculatorService.conversionCalculation(new CalculatorRequest(
                ingerdient.getIngredientId(),
                ingerdient.getMeasureUnitId(),
                BigDecimal.valueOf(ingerdient.getQuantity())));
        return calculatorResponse;
    }

    private void setMacros(UserRecipeComponentRequest ingerdient, CalculatorResponse calculatorResponse) {
        ingerdient.setEnergy(calculatorResponse.getEnergy());
        ingerdient.setCarbs(calculatorResponse.getCarbs());
        ingerdient.setFat(calculatorResponse.getFat());
        ingerdient.setProtein(calculatorResponse.getProtein());
    }

    public UserRecipeRequest findRecipeById(Integer recipeId) {
        Recipe result = recipeRepository.getById(recipeId);
        return recipeMapper.recipeToRecipeDto(result);
    }

    public  List<UserRecipeComponentRequest> findRecipeIngredientsById(Integer recipeId) {
        List<RecipeIngredient> ingredients = recipeIngredientRepository.findRecipeInfo(recipeId);
        List<UserRecipeComponentRequest> result = recipeIngredientMapper.recipeToDTOs(ingredients);
        return result;
    }

    public void deleteIngredientFromRecipe(Integer recipeId, Integer ingredientId) {
        Recipe recipe = new Recipe();
        Ingredient ingredient = new Ingredient();
        recipe.setId(recipeId);
        ingredient.setId(ingredientId);
        recipeIngredientRepository.deleteByRecipeAndIngredient(recipe,ingredient);
    }
}
