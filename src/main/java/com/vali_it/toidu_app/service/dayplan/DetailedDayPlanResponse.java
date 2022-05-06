package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

import java.util.List;

@Data
public class DetailedDayPlanResponse {
    private Integer dayPlanId;
    private List<PlannedItem> plannedItems;

}
