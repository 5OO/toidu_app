package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import com.vali_it.toidu_app.service.ingredient.IngredientService;
import lombok.Data;

import javax.annotation.Resource;
import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class CalculatorRequest{
    @Resource
    private IngredientService ingredientService;

    private BigDecimal conversionMultiplier;
}
