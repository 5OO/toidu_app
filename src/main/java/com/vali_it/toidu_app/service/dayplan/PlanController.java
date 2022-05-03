package com.vali_it.toidu_app.service.dayplan;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/create")
public class PlanController {

    @Resource
    private PlanService planService;

    @PostMapping
    @Operation(summary = "lisame uue päevaplaani")
    public PlanResponse createDayPlan(@RequestBody PlanRequest planRequest) {
        return planService.createNewDayPlan(planRequest);
    }

    // lisa plaani mingi toiduaine (banaanI

    @PostMapping("/ingredient")
    @Operation(summary = "lisame päevaplaani üksiku toiduaine ")
    public void addIngredientToDayPlan(@RequestBody PlanIngredientRequest request) {
        planService.addIngredientToDayPlan(request);
    }

}
