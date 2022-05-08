package com.vali_it.toidu_app.domain.ingredient.ingredient;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {


    @Query("select i from Ingredient i where upper(i.name) like upper(concat('%', ?1, '%')) order by i.name")
    List<Ingredient> findIngredientByName(String name);

    @Query("select (count(i) > 0) from Ingredient i where upper(i.name) = upper(?1)")
    boolean ingredientAlreadyExists(String name);



}