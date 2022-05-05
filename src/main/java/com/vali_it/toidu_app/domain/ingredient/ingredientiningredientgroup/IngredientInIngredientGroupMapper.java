package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientInIngredientGroupMapper {
    IngredientInIngredientGroup ingredientInIngredientGroupDtoToIngredientInIngredientGroup(IngredientInIngredientGroupDto ingredientInIngredientGroupDto);

    IngredientInIngredientGroupDto ingredientInIngredientGroupToIngredientInIngredientGroupDto(IngredientInIngredientGroup ingredientInIngredientGroup);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientInIngredientGroupFromIngredientInIngredientGroupDto(IngredientInIngredientGroupDto ingredientInIngredientGroupDto, @MappingTarget IngredientInIngredientGroup ingredientInIngredientGroup);

    List<IngredientInIngredientGroupDto> toIngredientDto(List<IngredientInIngredientGroup> ingredientGroups);
}
