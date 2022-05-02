package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlan;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanRepository;
import com.vali_it.toidu_app.service.dayplan.PlanIngredientRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class IngredientPlanService {

    @Resource
    private IngredientPlanMapper ingredientPlanMapper;

    @Resource
    private DayPlanRepository dayPlanRepository;

    @Resource
    private IngredientPlanRepository ingredientPlanRepository;
    public IngredientPlan addNewIngredientPlan(PlanIngredientRequest request) {
        IngredientPlan ingredientPlan = new IngredientPlan();
        ingredientPlan.setServingSize(request.getServingSize());


        // todo - see asi siin all
        DayPlan dayPlan = dayPlanRepository.getById(request.getDayPlanId());
        ingredientPlan.setDayPlan(dayPlan);

        // todo: teha uuesti sama systeemiga
        // ingredientId;
        // measureUnitId;

        ingredientPlanRepository.save(ingredientPlan);

        return ingredientPlan;
    }
}
