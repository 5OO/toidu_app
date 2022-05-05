package com.vali_it.toidu_app.domain.measure.allowedmeasureunit;

import com.vali_it.toidu_app.service.measure.AllowedUnitRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AllowedMeasureUnitRepository extends JpaRepository<AllowedMeasureUnit, Integer> {
    @Query("select a from AllowedMeasureUnit a where a.ingredient.id = ?1")
    List<AllowedMeasureUnit> findAllowedMeasureUnitByIngredientId(Integer id);

}