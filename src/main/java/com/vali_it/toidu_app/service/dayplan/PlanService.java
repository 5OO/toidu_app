package com.vali_it.toidu_app.service.dayplan;

import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlan;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanMapper;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanService;
import com.vali_it.toidu_app.domain.dayplan.ingredientplan.IngredientPlanService;
import com.vali_it.toidu_app.domain.dayplan.planrecipe.PlanRecipeService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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



}
