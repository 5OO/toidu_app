package com.vali_it.toidu_app.domain.ingredient.ingredientgroup;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientGroupMapper {
    IngredientGroup ingredientGroupDtoToIngredientGroup(IngredientGroupDto ingredientGroupDto);

    IngredientGroupDto ingredientGroupToIngredientGroupDto(IngredientGroup ingredientGroup);

    List<IngredientGroupDto> toIngredientGroups(List<IngredientGroup> ingredientGroups);

    List<IngredientGroup> toIngredientGroupsDtos(List<IngredientGroupDto> ingredientGroupDtos);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientGroupFromIngredientGroupDto(IngredientGroupDto ingredientGroupDto, @MappingTarget IngredientGroup ingredientGroup);
}
