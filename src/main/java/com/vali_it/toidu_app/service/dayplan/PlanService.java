package com.vali_it.toidu_app.service.dayplan;

import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlan;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanDto;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanMapper;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanService;
import com.vali_it.toidu_app.domain.dayplan.ingredientplan.IngredientPlan;
import com.vali_it.toidu_app.domain.dayplan.ingredientplan.IngredientPlanMapper;
import com.vali_it.toidu_app.domain.dayplan.ingredientplan.IngredientPlanService;
import com.vali_it.toidu_app.domain.dayplan.planrecipe.PlanRecipe;
import com.vali_it.toidu_app.domain.dayplan.planrecipe.PlanRecipeMapper;
import com.vali_it.toidu_app.domain.dayplan.planrecipe.PlanRecipeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlanService {


    @Resource
    private DayPlanMapper dayPlanMapper;

    @Resource
    private DayPlanService dayPlanService;

    @Resource
    private IngredientPlanService ingredientPlanService;

    @Resource
    private PlanRecipeService planRecipeService;

    @Resource
    private PlanRecipeMapper planRecipeMapper;

    @Resource
    private IngredientPlanMapper ingredientPlanMapper;

    public PlanResponse createNewDayPlan(PlanRequest planRequest) {
        DayPlan dayPlan = dayPlanService.addNewDayPlan(planRequest);
        Integer dayPlanId = dayPlan.getId();
        // lisame kohe sisse uuele kehale - dayplan id selle rea asemel (   planResponse.setDayPlanId(dayPlanId);      )
        return new PlanResponse(dayPlanId);
    }

    public void addIngredientToDayPlan(PlanIngredientRequest request) {
        ingredientPlanService.addNewIngredientPlan(request);
    }


    public void addRecipeToDayPlan(PlanRecipeRequest planRecipeRequest) {
        planRecipeService.addNewRecipeToPlan(planRecipeRequest);
    }


    public List<DayPlanDto> getAllUserDayPlans(Integer userId) {
        List<DayPlan> dayPlans = dayPlanService.getAllUserDayPlans(userId);
        return dayPlanMapper.toDtos(dayPlans);
    }

    public DetailedDayPlanResponse getTodaysDetailedDayPlan(Integer userId) {
        Integer dayPlanId = dayPlanService.getValidDayPlanId(userId);

        // TODO: 06.05.2022 energy
        List<PlannedItem> plannedIngredients = getPlannedIngredients(dayPlanId);
        // TODO: 06.05.2022 energy
        List<PlannedItem> plannedRecipes = getPlannedRecipes(dayPlanId);

        List<PlannedItem> plannedItems = createPlannedItems(plannedIngredients, plannedRecipes);


        DetailedDayPlanResponse response = new DetailedDayPlanResponse();
        response.setDayPlanId(null);
        response.setPlannedItems(plannedItems);


        return response;
    }

    private List<PlannedItem> createPlannedItems(List<PlannedItem> plannedIngredients, List<PlannedItem> plannedRecipes) {
        List<PlannedItem> result = new ArrayList<>();
        result.addAll(plannedIngredients);
        result.addAll(plannedRecipes);
        return result;
    }

    private List<PlannedItem> getPlannedIngredients(Integer userId) {
        List<IngredientPlan> plannedIngredients = ingredientPlanService.getPlannedIngredients(userId);
        return ingredientPlanMapper.toPlannedItems(plannedIngredients);
    }

    private List<PlannedItem> getPlannedRecipes(Integer userId) {
        List<PlanRecipe> plannedRecipes = planRecipeService.getPlannedRecipes(userId);
        return planRecipeMapper.toPlannedItems(plannedRecipes);
    }
}
