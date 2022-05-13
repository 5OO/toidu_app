package com.vali_it.toidu_app.service.measure;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CalculatorRequest{
    private Integer ingredientId;
    private Integer measureUnitId;
    private BigDecimal quantity;
}
