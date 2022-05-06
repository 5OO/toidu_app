package com.vali_it.toidu_app.domain.dayplan.planrecipe;


import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlan;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanRepository;
import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeRepository;
import com.vali_it.toidu_app.service.dayplan.PlanRecipeRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

@Service
public class PlanRecipeService {

    @Resource
    private DayPlanRepository dayPlanRepository;

    @Resource
    private RecipeRepository recipeRepository;

    @Resource
    private PlanRecipeRepository planRecipeRepository;

    public void addNewRecipeToPlan(PlanRecipeRequest planRecipeRequest) {
        PlanRecipe planRecipe = new PlanRecipe();

        planRecipe.setDateTimeAdded(Instant.now());

        DayPlan dayPlan = dayPlanRepository.getById(planRecipeRequest.getDayPlanId());
        planRecipe.setDayPlan(dayPlan);

        Recipe recipe = recipeRepository.getById(planRecipeRequest.getRecipeId());
        planRecipe.setRecipe(recipe);

        planRecipeRepository.save(planRecipe);

    }

    public List<PlanRecipe> getPlannedRecipes(Integer userId) {
        return planRecipeRepository.findPlannedRecipes(userId);
    }
}
