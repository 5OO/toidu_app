package com.vali_it.toidu_app.service.recipe;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class UserRecipeComponentRequest {
    private Integer ingredientId;
    private String ingredientName;
    private Integer quantity;
    private String measureUnitName;
    private BigDecimal energy;
}
