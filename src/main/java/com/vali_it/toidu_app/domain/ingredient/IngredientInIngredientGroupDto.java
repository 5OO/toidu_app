package com.vali_it.toidu_app.domain.ingredient;

import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientInIngredientGroupDto implements Serializable {
    private final Integer id;
    private final IngredientDto ingredient;
    private final IngredientGroupDto ingredientGroup;
}
