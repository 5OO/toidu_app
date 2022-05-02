package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.service.dayplan.DayPlanRequest;
import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientPlanDto implements Serializable {
    private final Integer id;
    private final DayPlanRequest dayPlan;
    private final IngredientDto ingredient;
    private final Integer servingSize;
    private final MeasureUnitDto measureUnit;
}
