package com.vali_it.toidu_app.domain.ingredient.ingredientiningredientgroup;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientInIngredientGroupRepository extends JpaRepository<IngredientInIngredientGroup, Integer> {

    @Query("select i from IngredientInIngredientGroup i where i.ingredientGroup.id = ?1 order by i.ingredient.id")
    List<IngredientInIngredientGroup> findByIngredientGroup(Integer id);


}