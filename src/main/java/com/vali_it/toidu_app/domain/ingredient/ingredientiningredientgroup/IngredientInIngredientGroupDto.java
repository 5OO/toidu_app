package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.ingredient.ingredientgroup.IngredientGroupDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class IngredientInIngredientGroupDto implements Serializable {
    private final Integer id;
    private final IngredientDto ingredient;
    private final IngredientGroupDto ingredientGroup;
}
