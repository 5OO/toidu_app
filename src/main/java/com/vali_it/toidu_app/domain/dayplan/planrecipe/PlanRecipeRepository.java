package com.vali_it.toidu_app.domain.dayplan.planrecipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PlanRecipeRepository extends JpaRepository<PlanRecipe, Integer> {
    @Query("select p from PlanRecipe p where p.dayPlan.id = ?1")
    List<PlanRecipe> findPlannedRecipes(Integer planId);
}