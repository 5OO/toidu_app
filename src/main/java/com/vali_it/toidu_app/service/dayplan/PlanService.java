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
import com.vali_it.toidu_app.service.measure.CalculatorRequest;
import com.vali_it.toidu_app.service.measure.CalculatorResponse;
import com.vali_it.toidu_app.service.measure.CalculatorService;
import com.vali_it.toidu_app.service.recipe.UserRecipeComponentRequest;
import com.vali_it.toidu_app.service.recipe.UserRecipeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
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
    private UserRecipeService userRecipeService;

    @Resource
    private PlanRecipeMapper planRecipeMapper;

    @Resource
    private IngredientPlanMapper ingredientPlanMapper;

    @Resource
    private CalculatorService calculatorService;

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
        DayPlan dayPlan = dayPlanService.getValidDayPlan(userId);
        return getDetailedDayPlanResponse(dayPlan);
    }


    public DetailedDayPlanResponse getDetailedDayPlanByDayPlanId(Integer dayPlanId) {
        DayPlan dayPlan = dayPlanService.getDayPlan(dayPlanId);
        return getDetailedDayPlanResponse(dayPlan);
    }


    public void deleteItemFromDayPlan(Integer itemId, Boolean isRecipe) {
        if (isRecipe) {
            planRecipeService.deleteItemFromDayPlan(itemId);
        } else {
            ingredientPlanService.deleteItemFromDayPlan(itemId);
        }
    }

    private List<PlannedItem> createPlannedItems(List<PlannedItem> plannedIngredients, List<PlannedItem> plannedRecipes) {
        List<PlannedItem> result = new ArrayList<>();
        result.addAll(plannedIngredients);
        result.addAll(plannedRecipes);
        return result;
    }

    private List<PlannedItem> getPlannedIngredients(Integer userId) {
        List<IngredientPlan> plannedIngredients = ingredientPlanService.getPlannedIngredients(userId);
        List<PlannedItem> plannedItems = ingredientPlanMapper.toPlannedItems(plannedIngredients);
        getAndSetMacros(plannedItems);
        return plannedItems;
    }

    private void getAndSetMacros(List<PlannedItem> plannedItems) {
        for (PlannedItem item : plannedItems) {
            if (!item.getIsRecipe()) {
                CalculatorRequest calculatorRequest = new CalculatorRequest();
                calculatorRequest.setIngredientId(item.getIngredientId());
                calculatorRequest.setMeasureUnitId(item.getMeasureUnitId());
                calculatorRequest.setQuantity(item.getQuantity());
                CalculatorResponse calculatorResponse = calculatorService.conversionCalculation(calculatorRequest);
                item.setEnergy(calculatorResponse.getEnergy());
            }
        }
    }

    private List<PlannedItem> getPlannedRecipes(Integer userId) {
        List<PlanRecipe> plannedRecipes = planRecipeService.getPlannedRecipes(userId);
        List<PlannedItem> plannedItems = planRecipeMapper.toPlannedItems(plannedRecipes);
        getAndSetEnergy(plannedItems);
        return plannedItems;
    }

    private void getAndSetEnergy(List<PlannedItem> plannedItems) {
        for (PlannedItem item : plannedItems) {
            if (item.getIsRecipe()) {
                item.setEnergy(getTotalEnergy(item));
            }
        }
    }

    private BigDecimal getTotalEnergy(PlannedItem item) {
        BigDecimal totalEnergy = new BigDecimal(0);
        List<UserRecipeComponentRequest> recipeComponents = userRecipeService.findRecipeComponents(item.getRecipeId());
        for (UserRecipeComponentRequest component : recipeComponents) {
            totalEnergy = totalEnergy.add(component.getEnergy());
        }
        return totalEnergy;
    }

    private DetailedDayPlanResponse getDetailedDayPlanResponse(DayPlan dayPlan) {
        Integer dayPlanId = dayPlan.getId();
        List<PlannedItem> plannedIngredients = getPlannedIngredients(dayPlanId);
        // TODO: 06.05.2022 energy
        List<PlannedItem> plannedRecipes = getPlannedRecipes(dayPlanId);

        List<PlannedItem> plannedItems = createPlannedItems(plannedIngredients, plannedRecipes);


        DetailedDayPlanResponse response = new DetailedDayPlanResponse();
        response.setDayPlanId(dayPlanId);
        response.setDayPlanDescription(dayPlan.getDescription());
        response.setDayPlanDate(dayPlan.getDateAdded());
        response.setPlannedItems(plannedItems);
        return response;
    }
}
