package com.vali_it.toidu_app.service.recipe;


import lombok.Data;

import java.time.Instant;

@Data
public class UserIngredientRequest {
    private Integer recipeId;
    private Integer ingredientId;
    private Integer measureUnit;
    private Double quantity;
    private Instant dateFrom;
    private Instant dateTo;
}
