package com.vali_it.toidu_app.domain.dayplan.dayplan;

import lombok.Data;

import java.io.Serializable;
import java.time.Instant;

@Data
public class DayPlanDto implements Serializable {
    private final Integer dayPlanId;
    private final Instant dateTimeAdded;
    private final String description;
}
