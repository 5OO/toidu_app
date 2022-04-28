package com.vali_it.toidu_app.domain.ingredient;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class IngredientDto implements Serializable {
    private final Integer id;
    private final String name;
    private final String description;
    private final BigDecimal energy;
    private final BigDecimal carbs;
    private final BigDecimal fat;
    private final BigDecimal protein;
}
