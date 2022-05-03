package com.vali_it.toidu_app.domain.recipe.recipeingredient;

import com.vali_it.toidu_app.service.recipe.UserIngredientRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeIngredientMapper {
    @Mapping(source = "recipeId", target = "recipe.id")
    RecipeIngredient recipeIngredientDtoToRecipeIngredient(UserIngredientRequest userIngredientRequest);

    @InheritInverseConfiguration(name = "recipeIngredientDtoToRecipeIngredient")
    UserIngredientRequest recipeIngredientToRecipeIngredientDto(RecipeIngredient recipeIngredient);

    @InheritConfiguration(name = "recipeIngredientDtoToRecipeIngredient")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateRecipeIngredientFromRecipeIngredientDto(UserIngredientRequest userIngredientRequest, @MappingTarget RecipeIngredient recipeIngredient);
}
