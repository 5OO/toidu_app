package com.vali_it.toidu_app.domain.recipe.recipeingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Integer> {

    @Query("select r from RecipeIngredient r where r.recipe.id = ?1")
    List<RecipeIngredient> findRecipeInfo(Integer recipeId);

}