package com.vali_it.toidu_app.domain.dayplan.dayplan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DayPlanRepository extends JpaRepository<DayPlan, Integer> {
    @Query("select d from DayPlan d where d.user.id = ?1 order by d.dateTimeAdded DESC")
    List<DayPlan> findDayPlans(Integer userId);
}