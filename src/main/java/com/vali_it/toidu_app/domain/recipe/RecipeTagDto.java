package com.vali_it.toidu_app.domain.recipe;

import lombok.Data;

import java.io.Serializable;

@Data
public class RecipeTagDto implements Serializable {
    private final Integer id;
    private final RecipeDto recipe;
    private final TagDto tag;
}
