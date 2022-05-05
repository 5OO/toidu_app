package com.vali_it.toidu_app.service.measure;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/unit")
public class AllowedUnitController {

    @Resource
    private AllowedUnitService allowedUnitService;


    @GetMapping("/id")
    @Operation(summary = "leiab id")
    public List<AllowedMeasureUnitDto> getMeasureUnits(@RequestParam Integer ingredientId) {
        return allowedUnitService.getMeasureUnits(ingredientId);
    }
}
