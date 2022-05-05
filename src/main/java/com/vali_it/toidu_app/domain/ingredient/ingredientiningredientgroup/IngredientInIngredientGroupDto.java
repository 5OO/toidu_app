package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import com.vali_it.toidu_app.service.ingredient.IngredientGroupDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientInIngredientGroupDto implements Serializable {
    private final Integer id;
    private final IngredientRequest ingredient;
    private final IngredientGroupDto ingredientGroup;
}
