package com.vali_it.toidu_app.domain.measure;

import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class AllowedMeasureUnitDto implements Serializable {
    private final Integer id;
    private final IngredientDto ingredient;
    private final MeasureUnitDto measureUnit;
    private final BigDecimal conversionMultiplier;
    private final String onversionDescription;
}
