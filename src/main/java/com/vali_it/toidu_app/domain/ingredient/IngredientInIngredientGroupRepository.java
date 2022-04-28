package com.vali_it.toidu_app.domain.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientInIngredientGroupRepository extends JpaRepository<IngredientInIngredientGroup, Integer> {
}