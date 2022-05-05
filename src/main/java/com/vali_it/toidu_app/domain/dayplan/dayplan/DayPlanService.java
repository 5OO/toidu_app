package com.vali_it.toidu_app.domain.dayplan.dayplan;


import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
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

    @Resource
    private UserRepository userRepository;

    public DayPlan addNewDayPlan(PlanRequest request) {
        DayPlan dayPlan = dayPlanMapper.dayPlanDtoToDayPlan(request);
        User user = userRepository.getById(request.getUserId());
        dayPlan.setUser(user);
        dayPlanRepository.save(dayPlan);
        return dayPlan;
    }


}
