package com.vali_it.toidu_app.domain.recipe.recipeingredient;

import com.vali_it.toidu_app.domain.ingredient.ingredient.Ingredient;
import com.vali_it.toidu_app.domain.recipe.recipe.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface RecipeIngredientRepository extends JpaRepository<RecipeIngredient, Integer> {

    @Query("select r from RecipeIngredient r where r.recipe.id = ?1")
    List<RecipeIngredient> findRecipeInfo(Integer recipeId);


    @Transactional
    @Modifying
    @Query("delete from RecipeIngredient r where r.recipe = ?1 and r.ingredient = ?2")
    int deleteByRecipeAndIngredient(Recipe recipe, Ingredient ingredient);









}