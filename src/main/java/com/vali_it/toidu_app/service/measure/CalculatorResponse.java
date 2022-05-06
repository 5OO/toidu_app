package com.vali_it.toidu_app.service.measure;

import lombok.Data;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.math.BigDecimal;
@Service
@Data
public class CalculatorResponse{

    public Integer quantity;
    public BigDecimal energy;
    public BigDecimal carbs;
    public BigDecimal fat;
    public BigDecimal protein;


}

