package com.vali_it.toidu_app.service.recipe;

import lombok.Data;

@Data
public class UserRecipeNameInquiry {
    private Integer recipeId;
    private String name;
    private String description;
    private String instructions;
    private Boolean publicRecipe;

}
