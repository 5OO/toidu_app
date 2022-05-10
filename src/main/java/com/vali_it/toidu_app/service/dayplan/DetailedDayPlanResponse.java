package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
public class DetailedDayPlanResponse {
    private Integer dayPlanId;
    private String dayPlanDescription;
    private LocalDate dayPlanDate;
    private List<PlannedItem> plannedItems;

}
