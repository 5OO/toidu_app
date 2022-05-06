package com.vali_it.toidu_app.service.dayplan;

import com.vali_it.toidu_app.domain.dayplan.dayplan.DayPlanDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/plan")
public class PlanController {

    @Resource
    private PlanService planService;

    @PostMapping
    @Operation(summary = "lisame uue päevaplaani")
    public PlanResponse createNewDayPlan(@RequestBody PlanRequest planRequest) {
        return planService.createNewDayPlan(planRequest);
    }

    // lisa plaani mingi toiduaine (banaanI

    @PostMapping("/ingredient")
    @Operation(summary = "lisame päevaplaani üksiku toiduaine ")
    public void addIngredientToDayPlan(@RequestBody PlanIngredientRequest request) {
        planService.addIngredientToDayPlan(request);
    }

    //lisame mingi retsepti päevaplaani

    @PostMapping("/recipe")
    @Operation(summary = "lisame päevaplaani uue retsepti")
    public void addRecipeToDayPlan(@RequestBody PlanRecipeRequest planRecipeRequest){
        planService.addRecipeToDayPlan(planRecipeRequest);
    }

    @GetMapping("/all")
    @Operation(summary = "kuvab kõiki kasutaja andmebaasi salvestatud päevaplaane")
    public List<DayPlanDto> getAllUserDayPlans(@RequestParam Integer userId){
        return planService.getAllUserDayPlans(userId);
    }
}
