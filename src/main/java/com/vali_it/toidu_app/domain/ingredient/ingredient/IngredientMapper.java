package com.vali_it.toidu_app.domain.ingredient.ingredient;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientMapper {
    Ingredient ingredientDtoToIngredient(IngredientDto ingredientDto);

    IngredientDto ingredientToIngredientDto(Ingredient ingredient);

    List<IngredientDto> toIngredients(List<Ingredient> ingredient);

    List<Ingredient> toIngredientDtos(List<IngredientDto> ingredientDtos);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientFromIngredientDto(IngredientDto ingredientDto, @MappingTarget Ingredient ingredient);
}
