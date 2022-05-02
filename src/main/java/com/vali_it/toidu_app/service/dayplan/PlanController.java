package com.vali_it.toidu_app.service.dayplan;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/create")
public class PlanController {


    @PostMapping
    @Operation(summary = "lisame uue päevaplaani")
    public createDayPlan() {

    }
    // creat new day plan
}
