package com.vali_it.toidu_app.service.measure;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/unit")
public class AllowedUnitController {

    @Resource
    private AllowedUnitService allowedUnitService;

//    @GetMapping("/id")
//    @Operation(summary = "leiab measure unit id-d ingredient id kaudu")
//    public List<MeasureUnitDto> getMeasureUnits(Integer ingredientId) {
//        return allowedUnitService.getMeasureUnits(ingredientId);
//    }

//
//    @PostMapping("/id")
//    @Operation(summary = "leiab measure unit id-d ingredient id kaudu")
//    public List<AllowedMeasureUnitDto> getMeasureUnits(@RequestBody AllowedUnitRequest request) {
//        return allowedUnitService.getMeasureUnits(request);
//    }


    @GetMapping("/id")
    @Operation(summary = "leiab measure unit id-d ingredient id kaudu")
    public List<AllowedMeasureUnitResponse> getMeasureUnitsByIngredientId(@RequestParam Integer ingredientId) {
        return allowedUnitService.getMeasureUnitsByIngredientId(ingredientId);
    }


    @PostMapping("/conversion")
    @Operation(summary = "leiab conversionmultiplieri id kaudu")
    public UnitMultiplierResponse getConversionMultiplier(@RequestBody AllowedUnitRequest request) {

        return allowedUnitService.getConversionMultiplier(request);
    }

//    @GetMapping("/id")
//    @Operation(summary = "leiab measure unit id-d ingredient id kaudu")
//    public List<AllowedMeasureUnitDto> getMeasureUnits(@RequestParam Integer ingredientId) {
//        return allowedUnitService.getMeasureUnits(ingredientId);
//    }
//
//
//    @GetMapping("/conversion")
//    @Operation(summary = "leiab conversionmultiplieri id kaudu")
//    public UnitMultiplierResponse getConversionMultiplier(@RequestParam Integer ingredientId, @RequestParam Integer measureUnitId) {
//        return allowedUnitService.getConversionMultiplier(ingredientId, measureUnitId);
//    }

}
