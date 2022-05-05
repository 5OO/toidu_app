package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CalculatorRequest implements Serializable {
//    private final Integer id;
//    private final IngredientRequest ingredient;
//    private final MeasureUnitDto measureUnit;
    private final BigDecimal conversionMultiplier;
//    private final String conversionDescription;
}
