package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class PlannedItem {
    private Integer itemId;
    private String itemName;
    private Boolean isRecipe;
    private BigDecimal quantity;
    private String measureUnitName;
    private Integer energy;
}
