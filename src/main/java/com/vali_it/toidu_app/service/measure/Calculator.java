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


    public CalculatorResponse conversionCalculation(CalculatorRequest calculatorRequest) {

        UnitMultiplierResponse response = allowedUnitService.getConversionMultiplier(calculatorRequest.getIngredientId(), calculatorRequest.getMeasureUnitId());
        BigDecimal multiplier = response.getConversionMultiplier();
        IngredientRequest macro = ingredientService.getIngredientById(calculatorRequest.getIngredientId());
        BigDecimal conversionToGrams = new BigDecimal(100); //sajandik (g/ml) konvertimise element
        BigDecimal ammount = calculatorRequest.getQuantity();

        //Arvutused
        BigDecimal sumEnergy = macro.getEnergy().multiply(ammount).divide(conversionToGrams).multiply(multiplier);
        BigDecimal sumCarbs = macro.getCarbs().multiply(ammount).divide(conversionToGrams).multiply(multiplier);
        BigDecimal sumFat = macro.getFat().multiply(ammount).divide(conversionToGrams).multiply(multiplier);
        BigDecimal sumProtein = macro.getProtein().multiply(ammount).divide(conversionToGrams).multiply(multiplier);

        //Tulemused mapitakse CalculatorResponse Dtosse
        calculatorResponse.setEnergy(sumEnergy);
        calculatorResponse.setCarbs(sumCarbs);
        calculatorResponse.setFat(sumFat);
        calculatorResponse.setProtein(sumProtein);
        return calculatorResponse;
    }

}
