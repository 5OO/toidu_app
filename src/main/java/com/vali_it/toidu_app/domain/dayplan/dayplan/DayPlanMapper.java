package com.vali_it.toidu_app.domain.dayplan.dayplan;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface DayPlanMapper {
    DayPlan dayPlanDtoToDayPlan(DayPlanDto dayPlanDto);

    DayPlanDto dayPlanToDayPlanDto(DayPlan dayPlan);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateDayPlanFromDayPlanDto(DayPlanDto dayPlanDto, @MappingTarget DayPlan dayPlan);
}
