package com.vali_it.toidu_app.domain.recipe.recipe;

import lombok.Data;

import java.io.Serializable;

@Data
public class RecipeDto implements Serializable {
    private final Integer id;
    private final UserDto users;
    private final String name;
    private final String description;
    private final String instructions;
    private final Boolean publicRecipe;
}
