package com.vali_it.toidu_app.domain.recipe;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeTagMapper {
    RecipeTag recipeTagDtoToRecipeTag(RecipeTagDto recipeTagDto);

    RecipeTagDto recipeTagToRecipeTagDto(RecipeTag recipeTag);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRecipeTagFromRecipeTagDto(RecipeTagDto recipeTagDto, @MappingTarget RecipeTag recipeTag);
}
