package com.vali_it.toidu_app.domain.dayplan;

import com.vali_it.toidu_app.domain.recipe.RecipeDto;
import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class PlanRecipeDto implements Serializable {
    private final Integer id;
    private final DayPlanDto dayPlan;
    private final RecipeDto recipe;
    private final Integer plannedServingSize;
    private final Instant dateTimeAdded;
}
