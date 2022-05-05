package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import com.vali_it.toidu_app.service.ingredient.IngredientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class ConversionCalculator {

    @Resource
    private AllowedUnitService allowedUnitService;

    @Resource
    private IngredientService ingredientService;


//    @Resource
//    private CalculatorRequest calculatorRequest

//    public void conversionCalculation (BigDecimal quantity, Ingredient ingredient) {
//
//
//
//    }

}
