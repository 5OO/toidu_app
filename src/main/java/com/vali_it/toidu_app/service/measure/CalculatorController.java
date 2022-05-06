package com.vali_it.toidu_app.service.measure;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Resource
    private Calculator calculator;


    @GetMapping("/conversion")
    @Operation(summary = "arvutus")
    public CalculatorResponse conversionCalculation(CalculatorRequest calculatorRequest) {
        return calculator.conversionCalculation(calculatorRequest);
    }


}
