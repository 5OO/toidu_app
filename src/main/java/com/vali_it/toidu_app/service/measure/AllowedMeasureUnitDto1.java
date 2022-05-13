package com.vali_it.toidu_app.service.measure;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AllowedMeasureUnitDto1 implements Serializable {
    private final Integer ingredientId;
    private final Integer measureUnitId;
    private final BigDecimal conversionMultiplier;
    private final String conversionDescription;
}
