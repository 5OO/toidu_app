package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientPlanDto implements Serializable {
    private final Integer id;
    private final PlanRequest dayPlan;
    private final IngredientRequest ingredient;
    private final Integer servingSize;
    private final MeasureUnitDto measureUnit;
}
