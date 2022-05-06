package com.vali_it.toidu_app.service.measure;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Resource
    private Calculator calculator;


    @GetMapping("/conversion")
    @Operation(summary = "arvutus")
    public CalculatorResponse conversionCalculation(@RequestParam Integer ingredientId,
                                                    @RequestParam Integer measureUnitId,
                                                    @RequestParam BigDecimal quantity) {
        return calculator.conversionCalculation(ingredientId, measureUnitId, quantity);
    }

}
