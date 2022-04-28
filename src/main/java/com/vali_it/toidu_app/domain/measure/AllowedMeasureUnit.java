package com.vali_it.toidu_app.domain.measure;

import com.vali_it.toidu_app.domain.ingredient.Ingredient;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "allowed_measure_unit", schema = "toidu_app")
public class AllowedMeasureUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "measure_unit_id", nullable = false)
    private MeasureUnit measureUnit;

    @Column(name = "conversion_multiplier", nullable = false, precision = 8, scale = 3)
    private BigDecimal conversionMultiplier;

    @Column(name = "onversion_description")
    private String onversionDescription;

}