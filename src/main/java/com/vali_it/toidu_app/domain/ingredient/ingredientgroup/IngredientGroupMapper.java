package com.vali_it.toidu_app.domain.ingredient.ingredientgroup;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientGroupMapper {
    IngredientGroup ingredientGroupDtoToIngredientGroup(IngredientGroupDto ingredientGroupDto);

    IngredientGroupDto ingredientGroupToIngredientGroupDto(IngredientGroup ingredientGroup);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientGroupFromIngredientGroupDto(IngredientGroupDto ingredientGroupDto, @MappingTarget IngredientGroup ingredientGroup);
}
