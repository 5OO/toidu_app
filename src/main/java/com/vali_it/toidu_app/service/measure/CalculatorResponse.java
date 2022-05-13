package com.vali_it.toidu_app.service.measure;

import lombok.Data;

import java.math.BigDecimal;
@Data
public class CalculatorResponse{
    public BigDecimal energy;
    public BigDecimal carbs;
    public BigDecimal fat;
    public BigDecimal protein;


}

