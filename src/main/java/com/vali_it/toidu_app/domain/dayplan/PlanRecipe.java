package com.vali_it.toidu_app.domain.dayplan;

import com.vali_it.toidu_app.domain.recipe.Recipe;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "plan_recipe", schema = "toidu_app")
public class PlanRecipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "day_plan_id", nullable = false)
    private DayPlan dayPlan;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @Column(name = "planned_serving_size", nullable = false)
    private Integer plannedServingSize;

    @Column(name = "date_time_added", nullable = false)
    private Instant dateTimeAdded;

}