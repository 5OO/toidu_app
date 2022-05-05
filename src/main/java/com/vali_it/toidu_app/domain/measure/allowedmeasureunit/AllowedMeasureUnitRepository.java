package com.vali_it.toidu_app.domain.measure.allowedmeasureunit;

import com.vali_it.toidu_app.service.measure.AllowedUnitRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface AllowedMeasureUnitRepository extends JpaRepository<AllowedMeasureUnit, Integer> {
    @Query("select a from AllowedMeasureUnit a where a.ingredient.id = ?1")
    List<AllowedMeasureUnit> findAllowedMeasureUnitByIngredientId(Integer id);

    @Query("select a from AllowedMeasureUnit a where a.conversionMultiplier = ?1")
    Optional<AllowedMeasureUnit> findMultiplierByIngredientId(BigDecimal conversionMultiplier);


}