package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlan;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanRepository;
import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientRepository;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnit;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitRepository;
import com.vali_it.toidu_app.service.dayplan.PlanIngredientRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class IngredientPlanService {

    @Resource
    private IngredientPlanMapper ingredientPlanMapper;

    @Resource
    private DayPlanRepository dayPlanRepository;

    @Resource
    private IngredientRepository ingredientRepository;

    @Resource
    private MeasureUnitRepository measureUnitRepository;

    @Resource
    private IngredientPlanRepository ingredientPlanRepository;


    public void addNewIngredientPlan(PlanIngredientRequest request) {

        IngredientPlan ingredientPlan = new IngredientPlan();
        ingredientPlan.setServingSize(request.getServingSize());
        // todo - see asi siin all
        DayPlan dayPlan = dayPlanRepository.getById(request.getDayPlanId());
        ingredientPlan.setDayPlan(dayPlan);

        Ingredient ingredient = ingredientRepository.getById(request.getIngredientId());
        ingredientPlan.setIngredient(ingredient);

        MeasureUnit measureUnit = measureUnitRepository.getById(request.getMeasureUnitId());
        ingredientPlan.setMeasureUnit(measureUnit);

        ingredientPlanRepository.save(ingredientPlan);

    }

    public List<IngredientPlan> getPlannedIngredients(Integer userId) {
        return ingredientPlanRepository.findPlannedIngredients(userId);
    }
}
