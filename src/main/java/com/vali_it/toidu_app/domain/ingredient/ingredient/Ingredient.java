package com.vali_it.toidu_app.domain.ingredient.ingredient;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "ingredient", schema = "toidu_app")
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "energy", nullable = false, precision = 6, scale = 1)
    private BigDecimal energy;

    @Column(name = "carbs", nullable = false, precision = 6, scale = 1)
    private BigDecimal carbs;

    @Column(name = "fat", nullable = false, precision = 6, scale = 1)
    private BigDecimal fat;

    @Column(name = "protein", nullable = false, precision = 6, scale = 1)
    private BigDecimal protein;

}