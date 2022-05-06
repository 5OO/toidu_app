package com.vali_it.toidu_app.domain.dayplan.planrecipe;

import com.vali_it.toidu_app.service.dayplan.PlannedItem;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PlanRecipeMapper {

    @Mapping(target = "itemId", source = "id")
    @Mapping(target = "itemName", source = "recipe.name")
    @Mapping(target = "isRecipe", constant = "true")
    @Mapping(target = "quantity", constant = "1")
    @Mapping(target = "measureUnitName", constant = "tk")
    PlannedItem toPlannedItem(PlanRecipe recipe);

    List<PlannedItem> toPlannedItems(List<PlanRecipe> recipes);
}
