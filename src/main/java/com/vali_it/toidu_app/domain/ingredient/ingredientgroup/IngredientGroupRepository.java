package com.vali_it.toidu_app.domain.ingredient.ingredientgroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientGroupRepository extends JpaRepository<IngredientGroup, Integer> {
}