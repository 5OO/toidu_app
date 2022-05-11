package com.vali_it.toidu_app.domain.recipe.recipe;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {

    @Query("select r from Recipe r where upper(r.name) like upper(concat('%', ?1, '%'))")
    List<Recipe> findByName(String name);
}