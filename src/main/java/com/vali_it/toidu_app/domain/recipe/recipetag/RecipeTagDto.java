package com.vali_it.toidu_app.domain.recipe.recipetag;

import com.vali_it.toidu_app.domain.recipe.tag.TagDto;
import com.vali_it.toidu_app.domain.recipe.recipe.RecipeDto;
import lombok.Data;

import java.io.Serializable;

@Data
public class RecipeTagDto implements Serializable {
    private final Integer id;
    private final RecipeDto recipe;
    private final TagDto tag;
}
