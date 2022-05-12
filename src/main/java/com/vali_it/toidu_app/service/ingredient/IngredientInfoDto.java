package com.vali_it.toidu_app.service.ingredient;

import com.vali_it.toidu_app.service.measure.AllowedMeasureUnitResponse;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class IngredientInfoDto{
    private Integer id;
    private String name;
    private String description;
    private BigDecimal energy;
    private BigDecimal carbs;
    private BigDecimal fat;
    private BigDecimal protein;
    private Integer measureUnitId;
}
