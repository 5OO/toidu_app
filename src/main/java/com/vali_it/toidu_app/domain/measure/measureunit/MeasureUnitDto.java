package com.vali_it.toidu_app.domain.measure.measureunit;

import lombok.Data;

import java.io.Serializable;

@Data
public class MeasureUnitDto implements Serializable {
    private final Integer id;
    private final String name;
}
