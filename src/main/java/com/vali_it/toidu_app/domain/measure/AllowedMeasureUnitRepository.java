package com.vali_it.toidu_app.domain.measure;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllowedMeasureUnitRepository extends JpaRepository<AllowedMeasureUnit, Integer> {
}