package com.vali_it.toidu_app.domain.dayplan.ingredientplan;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientPlanRepository extends JpaRepository<IngredientPlan, Integer> {
}