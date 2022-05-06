package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import com.vali_it.toidu_app.service.ingredient.IngredientService;
import org.mapstruct.ap.shaded.freemarker.core.Macro;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@Service
public class Calculator {

    @Resource
    private AllowedUnitService allowedUnitService;

    @Resource
    private IngredientService ingredientService;

    @Resource
    private CalculatorResponse calculatorResponse;


    public CalculatorResponse conversionCalculation(Integer ingredientId, Integer measureUnitId, BigDecimal quantity) {
        UnitMultiplierResponse response = allowedUnitService.getConversionMultiplier(ingredientId, measureUnitId);
        BigDecimal multiplier = response.getConversionMultiplier();
        IngredientRequest macro = ingredientService.getIngredientById(ingredientId);
        BigDecimal conversionToGrams = new BigDecimal(100);
        BigDecimal sumEnergy = macro.getEnergy().multiply(quantity).divide(conversionToGrams).multiply(multiplier);
        BigDecimal sumCarbs = macro.getCarbs().multiply(quantity).divide(conversionToGrams).multiply(multiplier);
        BigDecimal sumFat = macro.getFat().multiply(quantity).divide(conversionToGrams).multiply(multiplier);
        BigDecimal sumProtein = macro.getProtein().multiply(quantity).divide(conversionToGrams).multiply(multiplier);

        calculatorResponse.setEnergy(sumEnergy);
        calculatorResponse.setCarbs(sumCarbs);
        calculatorResponse.setFat(sumFat);
        calculatorResponse.setProtein(sumProtein);
        return calculatorResponse;
    }

}
