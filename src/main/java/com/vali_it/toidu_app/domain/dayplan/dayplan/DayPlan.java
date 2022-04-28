package com.vali_it.toidu_app.domain.dayplan.dayplan;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "day_plan", schema = "toidu_app")
public class DayPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "date_time_added", nullable = false)
    private Instant dateTimeAdded;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

}