package com.vali_it.toidu_app.service.ingredient;

import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientGroupDto implements Serializable {
    private final Integer id;
    private final String name;
}
