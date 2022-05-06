package com.vali_it.toidu_app.service.measure;

import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class AllowedUnitRequest{
    private Integer ingredientId;
    private Integer measureUnitId;

}
