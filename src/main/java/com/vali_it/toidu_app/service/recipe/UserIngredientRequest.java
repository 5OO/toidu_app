package com.vali_it.toidu_app.service.recipe;


import lombok.Data;

import java.time.LocalDate;

@Data
public class UserIngredientRequest {
    private Integer recipeId;
    private Integer ingredientId;
    private Integer measureUnitId;
    private Double quantity;
    private LocalDate dateFrom;
    private LocalDate dateTo;
}
