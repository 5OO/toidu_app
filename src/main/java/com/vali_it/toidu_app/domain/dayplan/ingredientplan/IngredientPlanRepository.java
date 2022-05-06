package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface IngredientPlanRepository extends JpaRepository<IngredientPlan, Integer> {

    @Query("select i from IngredientPlan i where i.dayPlan.id = ?1")
    List<IngredientPlan> findPlannedIngredients(Integer planId);

}