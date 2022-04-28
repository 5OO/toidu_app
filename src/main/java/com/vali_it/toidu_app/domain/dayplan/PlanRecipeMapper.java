package com.vali_it.toidu_app.domain.dayplan;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PlanRecipeMapper {
    PlanRecipe planRecipeDtoToPlanRecipe(PlanRecipeDto planRecipeDto);

    PlanRecipeDto planRecipeToPlanRecipeDto(PlanRecipe planRecipe);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePlanRecipeFromPlanRecipeDto(PlanRecipeDto planRecipeDto, @MappingTarget PlanRecipe planRecipe);
}
