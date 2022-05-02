package com.vali_it.toidu_app.domain.dayplan.dayplan;

import com.vali_it.toidu_app.service.dayplan.DayPlanRequest;
import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DayPlanMapper {
    DayPlan dayPlanDtoToDayPlan(DayPlanRequest dayPlanRequest);

    DayPlanRequest dayPlanToDayPlanDto(DayPlan dayPlan);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDayPlanFromDayPlanDto(DayPlanRequest dayPlanRequest, @MappingTarget DayPlan dayPlan);
}
