package com.vali_it.toidu_app.service.dayplan;


import lombok.Data;

import java.time.Instant;

@Data
public class PlanRecipeRequest {
    private Integer dayPlanId;
    private Integer recipeId;
}
