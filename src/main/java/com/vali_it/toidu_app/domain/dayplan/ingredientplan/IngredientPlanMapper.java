package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.service.dayplan.PlanIngredientRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientPlanMapper {
    IngredientPlan toEntity(PlanIngredientRequest planIngredientRequest);


    PlanIngredientRequest ingredientPlanToIngredientPlanDto(IngredientPlan ingredientPlan);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateIngredientPlanFromIngredientPlanDto(IngredientPlanDto ingredientPlanDto, @MappingTarget IngredientPlan ingredientPlan);
}
