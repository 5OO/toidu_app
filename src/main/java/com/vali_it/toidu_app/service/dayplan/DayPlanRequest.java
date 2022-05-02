package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class DayPlanRequest implements Serializable {
    private final Integer id;
    private final Instant dateTimeAdded;
    private final String description;
}
