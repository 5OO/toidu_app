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


    public CalculatorResponse conversionCalculation (Integer ingredientId, Integer multiplyer, Integer quantity) {
        BigDecimal amount = new BigDecimal(quantity);
//        AllowedMeasureUnitDto conversionMultiplyerDto = allowedUnitService.getConversionMultiplierById(multiplyer);
        IngredientRequest macro = ingredientService.getIngredientById(ingredientId);
        BigDecimal conversionToGramms = new BigDecimal(100);
        BigDecimal sumEnergy = macro.getEnergy().multiply(amount).divide(conversionToGramms);
        BigDecimal sumCarbs = macro.getCarbs().multiply(amount).divide(conversionToGramms);
        BigDecimal sumFat = macro.getFat().multiply(amount).divide(conversionToGramms);
        BigDecimal sumProtein = macro.getProtein().multiply(amount).divide(conversionToGramms);

        calculatorResponse.setQuantity(quantity);
        calculatorResponse.setEnergy(sumEnergy);
        calculatorResponse.setCarbs(sumCarbs);
        calculatorResponse.setFat(sumFat);
        calculatorResponse.setProtein(sumProtein);
        return calculatorResponse;
    }

}
