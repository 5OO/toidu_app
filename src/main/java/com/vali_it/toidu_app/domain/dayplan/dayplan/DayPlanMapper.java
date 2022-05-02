package com.vali_it.toidu_app.domain.dayplan.dayplan;

import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import org.mapstruct.*;

import java.time.Instant;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring", imports = Instant.class)
public interface DayPlanMapper {
    @Mapping(target = "dateTimeAdded", expression = "java(Instant.now())")
    DayPlan dayPlanDtoToDayPlan(PlanRequest planRequest);

    PlanRequest dayPlanToDayPlanDto(DayPlan dayPlan);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDayPlanFromDayPlanDto(PlanRequest planRequest, @MappingTarget DayPlan dayPlan);
}
