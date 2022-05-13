package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlannedItem {
    private Integer ingredientId;
    private Integer recipeId;
    private Integer itemId;
    private String itemName;
    private Boolean isRecipe;
    private BigDecimal quantity;
    private Integer measureUnitId;
    private String measureUnitName;
    private BigDecimal energy;
}
