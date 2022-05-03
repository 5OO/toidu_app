package com.vali_it.toidu_app.domain.dayplan.dayplan;

import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import java.time.Instant;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-03T09:59:27+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.1 (Oracle Corporation)"
)
@Component
public class DayPlanMapperImpl implements DayPlanMapper {

    @Override
    public DayPlan dayPlanDtoToDayPlan(PlanRequest planRequest) {
        if ( planRequest == null ) {
            return null;
        }

        DayPlan dayPlan = new DayPlan();

        dayPlan.setDescription( planRequest.getDescription() );

        dayPlan.setDateTimeAdded( Instant.now() );

        return dayPlan;
    }

    @Override
    public PlanRequest dayPlanToDayPlanDto(DayPlan dayPlan) {
        if ( dayPlan == null ) {
            return null;
        }

        PlanRequest planRequest = new PlanRequest();

        planRequest.setDescription( dayPlan.getDescription() );

        return planRequest;
    }

    @Override
    public void updateDayPlanFromDayPlanDto(PlanRequest planRequest, DayPlan dayPlan) {
        if ( planRequest == null ) {
            return;
        }

        if ( planRequest.getDescription() != null ) {
            dayPlan.setDescription( planRequest.getDescription() );
        }
    }
}
