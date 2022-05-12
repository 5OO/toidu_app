package com.vali_it.toidu_app.domain.recipe.recipeingredient;

import com.vali_it.toidu_app.service.recipe.UserIngredientRequest;
import com.vali_it.toidu_app.service.recipe.UserRecipeComponentRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.math.BigDecimal;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface RecipeIngredientMapper {

    RecipeIngredient recipeIngredientDtoToRecipeIngredient(UserIngredientRequest userIngredientRequest);
    @Mapping(target = "ingredientId", source = "ingredient.id")
    @Mapping(target = "ingredientName", source = "ingredient.name")
    @Mapping(target = "measureUnitName", source = "measureUnit.name")
   UserRecipeComponentRequest recipeToDTOs(RecipeIngredient recipeIngredientList);

   List<UserRecipeComponentRequest> recipeToDTOs(List<RecipeIngredient> recipeIngredientList);
}
