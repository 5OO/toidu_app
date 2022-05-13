package com.vali_it.toidu_app.service.measure;

import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import com.vali_it.toidu_app.service.ingredient.IngredientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;

@Service
public class CalculatorService {

    @Resource
    private AllowedUnitService allowedUnitService;

    @Resource
    private IngredientService ingredientService;

    public CalculatorResponse conversionCalculation(CalculatorRequest request) {
        //CalculatorService request mapitakse AllowedUnitRequesti ja leitakse AllowedUnitServices ConversionMultiplier
        AllowedUnitRequest allowedUnitRequest = new AllowedUnitRequest();
        allowedUnitRequest.setIngredientId(request.getIngredientId());
        allowedUnitRequest.setMeasureUnitId(request.getMeasureUnitId());
        BigDecimal multiplier = allowedUnitService.getConversionMultiplier(request.getIngredientId(), request.getMeasureUnitId());
        IngredientRequest macro = ingredientService.getIngredientById(request.getIngredientId());
        BigDecimal amount = request.getQuantity();

        //Arvutused
        BigDecimal sumEnergy = calculateMacro(macro.getEnergy(), amount, multiplier);
        BigDecimal sumCarbs = calculateMacro(macro.getCarbs(), amount, multiplier);
        BigDecimal sumFat = calculateMacro(macro.getFat(), amount, multiplier);
        BigDecimal sumProtein = calculateMacro(macro.getProtein(), amount, multiplier);

        CalculatorResponse calculatorResponse = new CalculatorResponse();
        //Tulemused mapitakse CalculatorResponse Dtosse
        calculatorResponse.setEnergy(sumEnergy);
        calculatorResponse.setCarbs(sumCarbs);
        calculatorResponse.setFat(sumFat);
        calculatorResponse.setProtein(sumProtein);
        return calculatorResponse;
    }

    private BigDecimal calculateMacro(BigDecimal input, BigDecimal amount, BigDecimal multiplier) {
        return input.multiply(amount).divide(new BigDecimal(100)).multiply(multiplier);

    }

}
