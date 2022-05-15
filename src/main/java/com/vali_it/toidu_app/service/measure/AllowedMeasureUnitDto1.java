package com.vali_it.toidu_app.service.measure;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AllowedMeasureUnitDto1 {
    private Integer ingredientId;
    private Integer measureUnitId;
    private BigDecimal conversionMultiplier;
    private String conversionDescription;
}
