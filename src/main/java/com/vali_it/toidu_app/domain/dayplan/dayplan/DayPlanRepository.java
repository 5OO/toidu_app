package com.vali_it.toidu_app.domain.dayplan.dayplan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface DayPlanRepository extends JpaRepository<DayPlan, Integer> {
    @Query("select d from DayPlan d where d.user.id = ?1 order by d.dateAdded DESC")
    List<DayPlan> findDayPlans(Integer userId);

    @Query("select d from DayPlan d where d.user.id = ?1 and d.dateAdded = ?2")
    Optional<DayPlan> findDayPlan(Integer userId, LocalDate dateAdded);






}