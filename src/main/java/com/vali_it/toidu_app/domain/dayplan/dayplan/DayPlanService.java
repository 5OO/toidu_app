package com.vali_it.toidu_app.domain.dayplan.dayplan;


import com.vali_it.toidu_app.domain.users.user.User;
import com.vali_it.toidu_app.domain.users.user.UserRepository;
import com.vali_it.toidu_app.service.dayplan.PlanRequest;
import com.vali_it.toidu_app.validation.ValidationService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class DayPlanService {

    @Resource
    private DayPlanRepository dayPlanRepository;

    @Resource
    private DayPlanMapper dayPlanMapper;

    @Resource
    private UserRepository userRepository;

    @Resource
    private ValidationService validationService;

    public DayPlan addNewDayPlan(PlanRequest request) {
        DayPlan dayPlan = dayPlanMapper.toEntity(request);
        User user = userRepository.getById(request.getUserId());
        dayPlan.setUser(user);
        dayPlanRepository.save(dayPlan);
        return dayPlan;
    }


    public List<DayPlan> getAllUserDayPlans(Integer userId) {
        return dayPlanRepository.findDayPlans(userId);
    }

    public DayPlan getValidDayPlan(Integer userId) {
        Optional<DayPlan> dayPlan = dayPlanRepository.findDayPlan(userId, LocalDate.now());

        validationService.validDayPlanExits(dayPlan);

        return dayPlan.get();
    }


}
