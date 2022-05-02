package com.vali_it.toidu_app.service.dayplan;

import lombok.Data;

@Data
public class PlanResponse {
    private Integer dayPlanId;

    public PlanResponse() {
    }

    public PlanResponse(Integer dayPlanId) {
        this.dayPlanId = dayPlanId;
    }
}
