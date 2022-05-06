package com.vali_it.toidu_app.domain.dayplan.dayplan;

import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.time.LocalDate;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports = LocalDate.class)
public interface DayPlanMapper {
    @Mapping(target = "dateAdded", expression = "java(LocalDate.now())")
    DayPlan toEntity(PlanRequest request);

    @Mapping(target = "dayPlanId", source = "id")
    DayPlanDto toDto(DayPlan dayPlan);

    List <DayPlanDto> toDtos(List<DayPlan> dayPlans);

}
