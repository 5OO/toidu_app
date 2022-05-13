package com.vali_it.toidu_app.service.measure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CalculatorRequest{
    private Integer ingredientId;
    private Integer measureUnitId;
    private BigDecimal quantity;
}
