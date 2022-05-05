package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class AllowedMeasureUnitDto implements Serializable {
//    private final Integer id;
//    private final IngredientRequest ingredient;
    private final MeasureUnitDto measureUnit;
//    private final BigDecimal conversionMultiplier;
//    private final String conversionDescription;
}
