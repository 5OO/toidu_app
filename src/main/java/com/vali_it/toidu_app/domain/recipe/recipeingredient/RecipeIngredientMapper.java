package com.vali_it.toidu_app.domain.recipe.recipeingredient;

import com.vali_it.toidu_app.service.recipe.UserIngredientRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeIngredientMapper {

    RecipeIngredient recipeIngredientDtoToRecipeIngredient(UserIngredientRequest userIngredientRequest);

}
