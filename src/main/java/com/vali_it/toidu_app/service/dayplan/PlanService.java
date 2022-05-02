package com.vali_it.toidu_app.service.dayplan;

import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlan;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanMapper;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanRepository;
import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PlanService {


    @Resource
    private DayPlanMapper dayPlanMapper;

    @Resource
    private DayPlanService dayPlanService;

    public PlanResponse createNewDayPlan(PlanRequest planRequest) {
        DayPlan dayPlan = dayPlanService.addNewDayPlan(planRequest);
        Integer dayPlanId = dayPlan.getId();
         // lisame kohe sisse uuele kehale - dayplan id selle rea asemel (   planResponse.setDayPlanId(dayPlanId);      )
        return new PlanResponse(dayPlanId);
    }
}
