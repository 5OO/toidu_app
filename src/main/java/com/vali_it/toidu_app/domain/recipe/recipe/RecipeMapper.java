package com.vali_it.toidu_app.domain.recipe.recipe;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeMapper {
    Recipe recipeDtoToRecipe(RecipeDto recipeDto);

    RecipeDto recipeToRecipeDto(Recipe recipe);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRecipeFromRecipeDto(RecipeDto recipeDto, @MappingTarget Recipe recipe);
}
