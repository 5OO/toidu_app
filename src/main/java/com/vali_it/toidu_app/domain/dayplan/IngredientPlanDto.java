package com.vali_it.toidu_app.domain.dayplan;

import com.vali_it.toidu_app.domain.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.measure.MeasureUnitDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientPlanDto implements Serializable {
    private final Integer id;
    private final DayPlanDto dayPlan;
    private final IngredientDto ingredient;
    private final Integer servingSize;
    private final MeasureUnitDto measureUnit;
}
