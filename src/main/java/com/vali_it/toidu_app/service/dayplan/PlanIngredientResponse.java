package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

@Data
public class PlanIngredientResponse {

    private Integer dayPlanId;
    private Integer ingredientId;
    private Integer servingSize;
    private Integer measureUnitId;
}
