package com.vali_it.toidu_app.domain.measure.allowedmeasureunit;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllowedMeasureUnitRepository extends JpaRepository<AllowedMeasureUnit, Integer> {
    @Query("select a from AllowedMeasureUnit a where a.ingredient.id = ?1")
    List<AllowedMeasureUnit> findAllowedMeasureUnitByIngredientId(Integer id);

    @Query("select a from AllowedMeasureUnit a where a.ingredient.id = ?1")
    List<AllowedMeasureUnit> findByIngredientId(Integer id);

    @Query("select a from AllowedMeasureUnit a where a.ingredient.id = ?1 and a.measureUnit.id = ?2")
    AllowedMeasureUnit findMultiplier(Integer id, Integer id1);




}