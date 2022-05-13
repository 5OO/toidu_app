package com.vali_it.toidu_app.service.measure;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/calculate")
public class CalculatorController {

    @Resource
    private CalculatorService calculatorService;


    @PostMapping("/conversion")
    @Operation(summary = "arvutus")
    public CalculatorResponse conversionCalculation(@RequestBody CalculatorRequest calculatorRequest) {
        return calculatorService.conversionCalculation(calculatorRequest);
    }


}
