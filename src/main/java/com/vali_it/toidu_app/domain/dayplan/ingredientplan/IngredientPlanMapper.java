package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientPlanMapper {
    IngredientPlan ingredientPlanDtoToIngredientPlan(IngredientPlanDto ingredientPlanDto);

    IngredientPlanDto ingredientPlanToIngredientPlanDto(IngredientPlan ingredientPlan);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientPlanFromIngredientPlanDto(IngredientPlanDto ingredientPlanDto, @MappingTarget IngredientPlan ingredientPlan);
}
