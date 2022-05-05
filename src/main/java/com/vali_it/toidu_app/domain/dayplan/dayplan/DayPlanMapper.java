package com.vali_it.toidu_app.domain.dayplan.dayplan;

import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import org.mapstruct.*;

import java.time.Instant;
import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports = Instant.class)
public interface DayPlanMapper {
    @Mapping(target = "dateTimeAdded", expression = "java(Instant.now())")
    DayPlan toEntity(PlanRequest request);

    @Mapping(target = "dayPlanId", source = "id")
    DayPlanDto toDto(DayPlan dayPlan);

    List <DayPlanDto> toDtos(List<DayPlan> dayPlans);

}
