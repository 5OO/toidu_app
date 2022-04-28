package com.vali_it.toidu_app.domain.dayplan.planrecipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanRecipeRepository extends JpaRepository<PlanRecipe, Integer> {
}