package com.vali_it.toidu_app.domain.ingredient.ingredient;

import com.vali_it.toidu_app.service.ingredient.IngredientInfoDto;
import com.vali_it.toidu_app.service.ingredient.IngredientRequest;
import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientMapper {
    Ingredient ingredientDtoToIngredient(IngredientRequest ingredientRequest);

    IngredientRequest ingredientToIngredientDto(Ingredient ingredient);

    IngredientInfoDto ingredientToIngredientInfoDto(Ingredient ingredient);

    Ingredient ingredientInfoDtoToIngredient(IngredientInfoDto ingredientInfoDto);

    List<IngredientRequest> toIngredients(List<Ingredient> ingredient);

    List<Ingredient> toIngredientDtos(List<IngredientRequest> ingredientRequests);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientFromIngredientDto(IngredientRequest ingredientRequest, @MappingTarget Ingredient ingredient);
}
