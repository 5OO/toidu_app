package com.vali_it.toidu_app.domain.dayplan.dayplan;

import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Instant;

@Service
public class DayPlanService {

    @Resource
    private DayPlanRepository dayPlanRepository;

    @Resource
    private DayPlanMapper dayPlanMapper;

    public DayPlan addNewDayPlan(PlanRequest request) {
        DayPlan dayPlan = dayPlanMapper.dayPlanDtoToDayPlan(request);
        dayPlanRepository.save(dayPlan);
        return dayPlan;
    }


}
