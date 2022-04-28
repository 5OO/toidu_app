package com.vali_it.toidu_app.domain.recipe.recipeingredient;

import com.vali_it.toidu_app.domain.ingredient.ingredient.IngredientDto;
import com.vali_it.toidu_app.domain.measure.measureunit.MeasureUnitDto;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeDto;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class RecipeIngredientDto implements Serializable {
    private final Integer id;
    private final RecipeDto recipe;
    private final IngredientDto ingredient;
    private final MeasureUnitDto measureUnit;
    private final BigDecimal quantity;
    private final LocalDate dateFrom;
    private final LocalDate dateTo;
}
