package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import com.vali_it.toidu_app.service.dayplan.PlanIngredientRequest;
import com.vali_it.toidu_app.service.dayplan.PlannedItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface IngredientPlanMapper {
    IngredientPlan toEntity(PlanIngredientRequest planIngredientRequest);


    @Mapping(target = "itemId", source = "id")
    @Mapping(target = "ingredientId", source = "ingredient.id")
    @Mapping(target = "itemName", source = "ingredient.name")
    @Mapping(target = "isRecipe", constant = "false")
    @Mapping(target = "quantity", source = "servingSize")
    @Mapping(target = "measureUnitId", source = "measureUnit.id")
    @Mapping(target = "measureUnitName", source = "measureUnit.name")
    PlannedItem toPlannedItem(IngredientPlan ingredient);

    List<PlannedItem> toPlannedItems(List<IngredientPlan> ingredient);



}
